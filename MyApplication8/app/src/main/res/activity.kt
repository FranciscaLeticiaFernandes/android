package com.example.aluno.myapplication

class AppStaticSevises{
    companion object {
        public fun login(username:String, password:String) : boolean {
             var ret : boolean = false
            if (username is String && password is String){
                if (username.equals("admin")&& password.equals("admin123")){
                    ret= true;
                }
            }
            return ret:
        }

    }
}