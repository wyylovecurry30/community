package life.curry.communtiy.dto;

/**
 * Created by IntelliJ IDEA.
 * 登录的用户实体
 * @author curry
 * @version 1.0
 * @date 2019/11/2 16:12
 */
// alt + insert
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GitHubUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
