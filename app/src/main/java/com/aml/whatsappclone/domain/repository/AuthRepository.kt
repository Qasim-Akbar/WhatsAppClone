package com.aml.whatsappclone.domain.repository

import android.net.Credentials
import com.aml.whatsappclone.presentation.MainActivity
import com.aml.whatsappclone.util.Resource
import com.google.firebase.auth.PhoneAuthCredential
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    fun phoneNumberSignIn(phoneNumber:String, activity:MainActivity):Flow<Resource<Boolean>>

    fun isUserAuthenticated() : Boolean

    fun getUserId() : String

    suspend fun signInWithAuthCredential(phoneAuthCredentials: PhoneAuthCredential): Resource<Boolean>
}