package navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigator
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext
):ComponentContext by componentContext {
//
//    private val navigation = StackNavigator<Configuration>()
//
//    sealed class Child {
//        data class ScreenA(val component: ScreenAComponent) : Child()
//    }

    @Serializable
    sealed class Configuration{
        @Serializable
        data object ScreenA:Configuration()
        @Serializable
        data class ScreenB(val name:String):Configuration()
    }
}