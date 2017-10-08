package develop.beta1139.dialogviewpager

import android.app.Dialog
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import develop.beta1139.dialogviewpager.databinding.ViewpagerDialogBinding


class ViewPagerDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val binding = DataBindingUtil.inflate<ViewpagerDialogBinding>(
                LayoutInflater.from(context), R.layout.viewpager_dialog, null, false)
        val viewModel = ViewPagerDialogViewModel()
        binding.viewModel = viewModel
        binding.viewPager.adapter = ViewPagerDialogPagerAdapter(context, viewModel.images)

        binding.viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) { }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) { }

            override fun onPageSelected(position: Int) {
                viewModel.currentPage.set(position+1)
            }
        })

        val builder = AlertDialog.Builder(activity)
        builder.setView(binding.root)
        return builder.create()
    }

    companion object {
        fun newInstance(): ViewPagerDialog = ViewPagerDialog()
    }
}