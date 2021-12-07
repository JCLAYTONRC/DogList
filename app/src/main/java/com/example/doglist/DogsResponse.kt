package com.example.doglist

import com.google.gson.annotations.SerializedName

class DogsResponse(@SerializedName("status") var status: String, @SerializedName("message") val images:List<String>)