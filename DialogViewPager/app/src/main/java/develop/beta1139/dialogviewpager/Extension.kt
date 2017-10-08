package develop.beta1139.dialogviewpager

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by tomo on 2017/10/08.
 */

@BindingAdapter("imageUrl")
fun ImageView.setWebImage(url: String?) {
    Picasso.with(context).load(url).into(this)
}

