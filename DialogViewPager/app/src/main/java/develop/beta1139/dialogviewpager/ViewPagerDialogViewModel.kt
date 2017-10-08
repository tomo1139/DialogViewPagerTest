package develop.beta1139.dialogviewpager

import android.databinding.ObservableInt

/**
 * Created by tomo on 2017/10/08.
 */
class ViewPagerDialogViewModel {
    val images = mutableListOf(
            "http://ocremix.org/files/images/games/arc/4/street-fighter-ii-the-world-warrior-arc-title-7882.png",
            "http://ocremix.org/files/images/games/nes/8/final-fantasy-nes-title-74130.jpg",
            "http://ocremix.org/files/images/games/nes/5/ninja-gaiden-ii-the-dark-sword-of-chaos-nes-title-77185.jpg")

    var currentPage = ObservableInt(1)
}