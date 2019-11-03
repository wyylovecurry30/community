package life.curry.communtiy.dto;

/**
 * Created by IntelliJ IDEA.
 * 如果用户接受了你的请求，GitHub会用一个代码参数中的临时代码和你在之前的一个状态参数中提供的状态重定向回你的站点。
 * 临时代码将在10分钟后过期。如果状态不匹配，则由第三方创建请求，您应该中止该进程。
 * 访问令牌的实体
 * @author curry
 * @version 1.0
 * @date 2019/11/1 21:15
 */

public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
