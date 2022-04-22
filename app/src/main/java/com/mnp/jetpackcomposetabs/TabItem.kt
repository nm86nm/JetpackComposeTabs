package com.mnp.jetpackcomposetabs

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

// option without icons
/*sealed class TabItem(var title: String, var screen: ComposableFun) {
    object Tab1 : TabItem("Tab1", { Tab1Screen() })
    object Tab2 : TabItem("Tab2", { Tab2Screen() })
    object Tab3 : TabItem("Tab3", { Tab3Screen() })
}*/

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Tab1 : TabItem(R.drawable.example_icon_1, "Tab1", { Tab1Screen() })
    object Tab2 : TabItem(R.drawable.example_icon_2, "Tab2", { Tab2Screen() })
    object Tab3 : TabItem(R.drawable.example_icon_3, "Tab3", { Tab3Screen() })
}
