/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

import mainthread.entity.Customer;

/**
 *
 * @author ASUS
 */
public class MainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer = new Customer(1, "Trường", "Truong@gmail.com", "24/10/1995", 999999999, "avatar.jpg", "Đã Thanh Toán", "Laptop");
        customer.customer();
    
    }
    
}
