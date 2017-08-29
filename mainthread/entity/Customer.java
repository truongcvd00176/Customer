/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread.entity;

/**
 *
 * @author ASUS
 */
public class Customer {

    private int id;
    private String name;
    private String email;
    private String birthday;
    private int blance;
    private String avatar;
    private String status;
    private String productName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Customer() {
    }

    public Customer(int id, String name, String email, String birthday, int blance, String avatar, String status, String productName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.blance = blance;
        this.avatar = avatar;
        this.status = status;
        this.productName = productName;
    }

    public void customer() {
        System.out.println(toString());
        selectProduct();
        checkOut();
    }

    private void checkOut() {
        System.out.println("» Người dùng thực hiện thanh toán hoá đơn.");
    }

    private void selectProduct() {
        System.out.println("» Khách hàng đã chọn sản phẩm: " + productName + ".");

    }

    @Override
    public String toString() {
        return "» Customer:"
                + "\n • Id = " + id
                + "\n • Tên Khách Hàng = " + name
                + "\n • Email = " + email
                + "\n • Sinh Ngày = " + birthday
                + "\n • Số Tiền Trong Tài Khoản = " + blance + "VNĐ"
                + "\n • Ảnh Đại Diện = " + avatar
                + "\n • Trạng Thái = " + status;
        
    }

}
