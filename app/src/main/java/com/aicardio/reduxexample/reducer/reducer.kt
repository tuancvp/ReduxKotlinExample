package com.aicardio.reduxexample.reducer

import com.aicardio.reduxexample.action.Action
import com.aicardio.reduxexample.action.CounterActions
import com.aicardio.reduxexample.state.CounterState

typealias Reducer <S> = (S, Action) -> S

val CounterStateReducer: Reducer<CounterState> = { old, action ->
    when (action) {
        is CounterActions.Init -> CounterState()
        is CounterActions.Increment -> old.copy(value = old.value + 1)
        is CounterActions.Decrement -> old.copy(value = old.value - 1)
        else -> old
    }
}