package com.example.hw_notifications

import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

//class MFirebaseMessagingService : FirebaseMessagingService() {
//
//    override fun onMessageReceived(remoteMessage: RemoteMessage) {
//        val remoteMessageData = remoteMessage.data
//        if (remoteMessageData.isNotEmpty()) {
//            handleDataMessage(remoteMessageData.toMap())
//        }
//    }
//
//    private fun handleDataMessage(data: Map<String, String>) {
//        val title = data[PUSH_KEY_TITLE]
//        val message = data[PUSH_KEY_MESSAGE]
//        if (!title.isNullOrBlank() && !message.isNullOrBlank()) {
//            showNotification(title, message)
//        }
//    }
//
//    private fun showNotification(title: String, message: String) {
//        val notificationBuilder =
//            NotificationCompat.Builder(applicationContext, CHANNEL_ID).apply {
//                setSmallIcon(R.drawable.notifications_icon)
//                setContentTitle(title)
//                setContentText(message)
//                priority = NotificationCompat.PRIORITY_DEFAULT
//            }
//        val notificationManager =
//            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//
//        }
//
//    }


}