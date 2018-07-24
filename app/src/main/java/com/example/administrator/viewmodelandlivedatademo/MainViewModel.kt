package com.example.administrator.viewmodelandlivedatademo

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/** ViewModel library具有lifecycle-aware的特性, 不會因為Activity被重建而清除, 讓Activity每次重建都能持有同一個instance */
class MainViewModel : ViewModel() {

    /** MutableLiveData继承了LiveData, 是一个数据持有者类, 持有一个允许被观察的值 */
    val firstName: MutableLiveData<String> = MutableLiveData()
}