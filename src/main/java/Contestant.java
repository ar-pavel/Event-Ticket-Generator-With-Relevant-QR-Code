/**
 *
 * @author reckless
 */
public class Contestant {

    private String regTime;
    private String id;
    private String name;
    private String batch;
    private String catagory;
    private String email;
    private String phone;
    private String experience;
    private String stProfile;

    public Contestant() {
    }

    public Contestant(String regTime, String id, String name, String batch, String catagory, String email, String phone, String experience, String stProfile) {
        this.regTime = regTime;
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.catagory = catagory;
        this.email = email;
        this.phone = phone;
        this.experience = experience;
        this.stProfile = stProfile;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStProfile() {
        return stProfile;
    }

    public void setStProfile(String stProfile) {
        this.stProfile = stProfile;
    }

    @Override
    public String toString() {
        return "Contestant{" + "regTime=" + regTime + ", id=" + id + ", name=" + name + ", batch=" + batch + ", catagory=" + catagory + ", email=" + email + ", phone=" + phone + ", experience=" + experience + ", stProfile=" + stProfile + '}';
    }




}
