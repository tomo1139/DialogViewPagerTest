package develop.beta1139.dialogviewpager

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import develop.beta1139.dialogviewpager.databinding.ViewpagerImageBinding

/**
 * Created by tomo on 2017/10/08.
 */

class ViewPagerDialogPagerAdapter(private val context: Context, private val images: List<String>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val binding = ViewpagerImageBinding.inflate(inflater, container, false)
        binding.imageUrl = images[position]
        container?.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup?, position: Int, view: Any?) {
        if (view is View) {
            container?.removeView(view)
        }
    }

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean = view == `object`
    override fun getCount(): Int = images.size
}