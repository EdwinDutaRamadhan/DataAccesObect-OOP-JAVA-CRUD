/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package jdbc_1;

import Data.UserDAO;
import Model.UserModel;
import View.UserView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HPa
 */
public class JDBC_1 {

//    private static void display(){
//            List<UserModel> ls = new ArrayList<>();
//        ls = new UserDAO().getAllMahasiswa();
//        
//        String Data[][] = new String[ls.size()][6];
//        
//        for(int i = 0; i < ls.size(); i++){
//            Data[i][2] = ls.get(i).getKode();
//            Data[i][3] = ls.get(i).getMatkul();
//            Data[i][4] = ls.get(i).getSksp();
//            Data[i][5] = ls.get(i).getSkstm();
//            System.out.println(Data[i][2]+" "+Data[i][3]+" "+Data[i][4]+" "+Data[i][5]);
//        }
//    }
    public static void main(String[] args) {
        //display();
        new UserView().setVisible(true);
    }

}
