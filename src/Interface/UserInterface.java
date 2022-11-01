/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.UserModel;
import java.util.List;

/**
 *
 * @author HP
 */
public interface UserInterface {
    public List<UserModel> getAllMahasiswa();
    public boolean simpanDataMahasiswa(UserModel mhs);
    public boolean deleteDataMahasiswa(UserModel mhs);
    public boolean updateDataMahasiswa(UserModel mhs);
    
}
