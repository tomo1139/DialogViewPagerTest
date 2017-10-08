package develop.beta1139.dialogviewpager

import android.databinding.BindingAdapter
import android.widget.ImageView


/**
 * Created by tomo on 2017/10/09.
 */

@BindingAdapter("android:src")
fun setImageResource(imageView: ImageView, resource: Int) {
    imageView.setImageResource(resource)
}
