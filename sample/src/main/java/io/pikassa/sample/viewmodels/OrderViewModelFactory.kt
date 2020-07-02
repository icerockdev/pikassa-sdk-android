package io.pikassa.sample.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
Created by Denis Chornyy on 02,Июль,2020
All rights received.
 */
class OrderViewModelFactory(private val application: Application, private val myExtraParam: String): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = BankCardViewModel(application, myExtraParam) as T
}