package app.sano.picchi.a2_kt_fizzbuzz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun plus(v: View){
        number += 1
        textView.text = number.toString()

        check()
    }

    fun minus(v:View){
        number -= 1
        textView.text = number.toString()

        check()
    }

    fun clear(v: View){
        number = 0
        textView.text = number.toString()

        check()
    }


    fun check(){
        if (number % 15 == 0){
            textView2.text = "FizzBuzz"
            textView.setTextColor(Color.RED)

        }else if (number % 3 == 0){
            textView2.text = "Fizz"
            textView.setTextColor(Color.BLUE)
        }else if (number % 5 == 0){
            textView2.text = "Buzz"
            textView.setTextColor(Color.GREEN)
        }else{
            textView2.text = ""
            textView.setTextColor(Color.BLACK)

        }

    }


}
