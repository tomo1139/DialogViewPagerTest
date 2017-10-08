package develop.beta1139.dialogviewpager

import android.databinding.ObservableInt

/**
 * Created by tomo on 2017/10/08.
 */
class ViewPagerDialogViewModel {
    val images = listOf(
            R.drawable.abc_ic_ab_back_material,
            R.drawable.abc_ic_voice_search_api_material,
            R.drawable.abc_ic_go_search_api_material)

    var currentPage = ObservableInt(1)
}