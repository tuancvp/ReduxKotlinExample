package com.aicardio.reduxexample.store

import com.aicardio.reduxexample.action.Action
import com.aicardio.reduxexample.state.State

typealias StoreSubscriber <S> = (S) -> Unit

interface Store<S: State> {
    fun dispatch(action: Action)
    fun add(subscriber: StoreSubscriber<S>) : Boolean
    fun remove(subscriber: StoreSubscriber<S>): Boolean
}

