package androidclasses.eteclz.com.firebaseauth

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    lateinit var btnSignUp:Button
    lateinit var btnLogin:Button
    lateinit var lbEmailDoUserLogado:TextView
    lateinit var fbAuth: FireBaseAuth
    lateinit var txtEmail: EditText
    lateinit var txtPass:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lbEmailDoUserLogado= findViewById<TextView>(R.id.lbEmailDoUserLogado);
        this.fbAuth=FireBaseAuth.getInstance()
        this.txtEmail= findViewById<EditText>(R.id.txtEmail);
        this.txtPass=findViewById<EditText>(R.id.txtPass);
        this.btnSignUp=findViewById<Button>(R.id.btnSignUp);
        this.btnLogin=findViewById<Button>(R.id.btnLogin);
    }

    public override fun onStart() {
        super.onStart()
        val currentUser= this.fbAuth.currentUser
        updateUI(currentUser)
    }

    private fun updateUI(user: FirebaseUser?){
        if (user != null){
            this.lbEmailDoUserLogado.text= user.email
        }else {
            this.lbEmailDoUserLogado.text= "Nenhum User Logado"
        }

    }



    private fun signUp(){
        this.fbAuth.createUserWithEmailAndPassword(this.txtEmail, this.txtPass)
                .addOnCompleteListener(this) {task ->
                    if (task.isSucessful){
                        log.d(TAG,"createUserWithEmail:success")
                        val user=auth.currentUser
                        updateUI(user)
                    }else{
                        log.w(TAG,."createUserWithEmail:failure", task.exception)
                        toast.makeText(baseContext,"Authentication failed.",
                                toast.LENGTH_SHORT).show()
                        updateUI(null)
                    }
                }
    }
}
