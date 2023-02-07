package com.example.classcse225

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toolber with Mian Activity
        val outerToolberBtn = findViewById<Button>(R.id.outerToolberBtn)
        val intentouterToolberBtn = Intent(this,    MainOuterToolber::class.java)
        outerToolberBtn.setOnClickListener {
            startActivity(intentouterToolberBtn)
        }

        //INTENT FOR Scrolling BER

        val scrolling = findViewById<Button>(R.id.Scrolling_View)
        val intent = Intent(this, MainScrollingBar::class.java)
        scrolling.setOnClickListener {
            startActivity(intent)
        }
        //INTENT FOR ToolBer BER
        val toolberbtn = findViewById<Button>(R.id.toolberbtn)
        val intenttoolber = Intent(this, MainToolBer::class.java)
        toolberbtn.setOnClickListener {
            startActivity(intenttoolber)
        }

        //INTENT FOR RATING BER
        val RatingBarBtn = findViewById<Button>(R.id.RatingBarBtn)
        val intentritingber = Intent(this, MainRatingBar::class.java)
        RatingBarBtn.setOnClickListener{
            startActivity(intentritingber)
        }

        //INTENT FOR RATING Av
        val RatingBarBtnAv = findViewById<Button>(R.id.RatingBarBtnAv)
        val intentritingberAv = Intent(this, AvRatingBar::class.java)
        RatingBarBtnAv.setOnClickListener{
            startActivity(intentritingberAv)
        }

        //INTENT FOR RATING AvOuter
        val RatingBarBtnAvOut = findViewById<Button>(R.id.RatingBarBtnAvOut)
        val intentritingberAvout = Intent(this, AvRatingSec::class.java)
        RatingBarBtnAvOut.setOnClickListener{
            startActivity(intentritingberAvout)
        }

        //INTENT FOR ProgressBar
        val ProgressBarMain = findViewById<Button>(R.id.ProgressBarMain)
        val intentProgressBarMain= Intent(this, MainProgressBar::class.java)
        ProgressBarMain.setOnClickListener{
            startActivity(intentProgressBarMain)
        }

        //INTENT FOR Login page
        val MainLogin = findViewById<Button>(R.id.MainLogin)
        val intentMainLogin = Intent(this, MainLoginPage::class.java)
        MainLogin.setOnClickListener{
            startActivity(intentMainLogin)
        }

        //INTENT FOR Footer
        val MainFooterId = findViewById<Button>(R.id.MainFooterId)
        val intentMainFooter = Intent(this, MainFooter::class.java)
        MainFooterId.setOnClickListener{
            startActivity(intentMainFooter)
        }


        //INTENT FOR MainCustom Tost
        val MainCustomTost11 = findViewById<Button>(R.id.MainCustomTost11)

        MainCustomTost11.setOnClickListener{
            Intent(this, MainCustomToast::class.java).also {
                startActivity(it)
            }

        }


        //INTENT FOR MainCustom Tost
        val PrograessBerPreMain = findViewById<Button>(R.id.PrograessBerPreMain)

        PrograessBerPreMain.setOnClickListener{
            Intent(this, ProgressBarWithPres::class.java).also {
                startActivity(it)
            }

        }

        //INTENT FOR Progress Per With REsit btn Tost
        val pRbER = findViewById<Button>(R.id.pRbER)

        pRbER.setOnClickListener{
            Intent(this, ProgressBerWithResitBtn::class.java).also {
                startActivity(it)
            }

        }
        // custom toast

        val c_t = findViewById<Button>(R.id.c_t)

        c_t.setOnClickListener{
            Intent(this, MainActivityC_toast::class.java).also {
                startActivity(it)
            }

        }

        // custom footer

        val c_f = findViewById<Button>(R.id.c_f)

        c_f.setOnClickListener{
            Intent(this, MainActivityC_toolBer::class.java).also {
                startActivity(it)
            }

        }

        //  footer

        val c_ff1010 = findViewById<Button>(R.id.c_ff1010)

        c_ff1010.setOnClickListener{
            Intent(this, Footer::class.java).also {
                startActivity(it)
            }

        }


       // iNTENTcAMERA

        val iNTENTcAMERA = findViewById<Button>(R.id.iNTENTcAMERA)

        iNTENTcAMERA.setOnClickListener{
            Intent(this, SecCamerInt::class.java).also {
                startActivity(it)
            }

        }


        // iNTENTcAMERA

        val Camera_Porm = findViewById<Button>(R.id.Camera_Porm)

        Camera_Porm.setOnClickListener{
            Intent(this, _open_camera_through_intent::class.java).also {
                startActivity(it)
            }

        }
    }
}