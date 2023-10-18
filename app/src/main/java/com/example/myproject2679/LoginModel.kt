package com.example.myproject2679

class LoginModel {
    var Username = ""
    var Password = ""

    fun loginCek():Boolean{
        if (Username.equals("Nono")&& Password.equals("admin")){
            return true
        }else{
            return false
        }
    }
}