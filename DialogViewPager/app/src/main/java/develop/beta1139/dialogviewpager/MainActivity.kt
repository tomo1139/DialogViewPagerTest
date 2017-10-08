package develop.beta1139.dialogviewpager

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import develop.beta1139.dialogviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val dialog = ViewPagerDialog.newInstance()
        dialog.show(supportFragmentManager, "")
    }
}
