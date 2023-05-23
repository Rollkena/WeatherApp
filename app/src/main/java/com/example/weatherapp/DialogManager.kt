package com.example.weatherapp

import android.app.AlertDialog
import android.content.Context
import android.widget.EditText
import java.security.AccessControlContext

object DialogManager {
    fun locationSettingsDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle("Enable location?")
        dialog.setMessage("Location is disabled. Do you want to enable location?")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes"){_,_ ->
            listener.onClick(null)
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    fun searchByName(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle("City name:")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok"){_,_ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }


    interface Listener{
        fun onClick(name: String?)
    }
}