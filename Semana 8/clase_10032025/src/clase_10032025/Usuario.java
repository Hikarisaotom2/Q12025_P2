/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10032025;

import java.io.Serializable;

/**
 *
 * @author claudiacortes
 */
public class Usuario implements Serializable{
    private String email;
    private String password;
    private String username;
    private double dinero;
    private String[] juegos;

    public Usuario(String email, String password, String username, double dinero, String[] juegos) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.dinero = dinero;
        this.juegos = juegos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        String juego = "";
        for (String juego1 : juegos) {
            juego+= juego1+" \n";
        }
        return "Usuario{" + "email=" + email + ", password=" + password + ", username=" + username + ", dinero=" + dinero +"Juegos: "+juego+ '}';
    }
    
    
    
}
