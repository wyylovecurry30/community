package life.curry.communtiy.provider;

import com.alibaba.fastjson.JSON;
import life.curry.communtiy.dto.AccessTokenDTO;
import life.curry.communtiy.dto.GitHubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * 与GitHub有关操作的提供者
 * @author curry
 * @version 1.0
 * @date 2019/11/1 21:12
 */

@Component
public class GithubProvider {
    /**
     * 提供访问令牌
     * @param accessTokenDTO
     * @return
     */
        public String getAccessToken(AccessTokenDTO accessTokenDTO) {
            MediaType mediaType = MediaType.get("application/json; charset=utf-8");
            OkHttpClient client = new OkHttpClient();

            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
            Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String string = response.body().string();
                String token = string.split("&")[0].split("=")[1];
                return token;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        public GitHubUser getUser(String accessToken) {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.github.com/user?access_token=" + accessToken)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                String string = response.body().string();
                GitHubUser githubUser = JSON.parseObject(string, GitHubUser.class);
                return githubUser;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}
