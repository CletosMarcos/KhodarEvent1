package com.cletosbambo.khodarevent.utils

object KhodarButtonsColors{
    val buttonColor = Color(0xff02c54e)
    val iconBackgroundColor = Color(0xff00e95d)
    val white = Color(0xffffffff)
    val cancelButtonColor = Color(0xff340e0e)

}


//NavHost//

homeRoute(
onMenuClicked = onMenuClicked,
navigateToEventDetails = navController::navigateToEventDetails
)