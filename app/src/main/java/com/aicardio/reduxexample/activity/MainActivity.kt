package com.aicardio.reduxexample.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aicardio.reduxexample.R
import com.aicardio.reduxexample.action.CounterActions
import com.aicardio.reduxexample.reducer.CounterStateReducer
import com.aicardio.reduxexample.state.CounterState
import com.aicardio.reduxexample.store.DefaultStore
import kotlinx.android.synthetic.main.activity_counter.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {



    object DI {
        val store = DefaultStore(initialState = CounterState(), reducer = CounterStateReducer)

    }

    private val log = Logger.getLogger(MainActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)


        DI.store.add {
            tvCounter.text = "${it.value}"
        }

        DI.store.dispatch(action = CounterActions.Init)

        bt_decrease.setOnClickListener {
            DI.store.dispatch(action = CounterActions.Decrement)
        }

        bt_increase.setOnClickListener {
            DI.store.dispatch(action = CounterActions.Increment)
        }
    }

}
