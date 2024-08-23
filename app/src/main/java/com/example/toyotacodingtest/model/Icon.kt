package com.example.example

import com.google.gson.annotations.SerializedName


data class Icon (

  @SerializedName("Height" ) var Height : String? = null,
  @SerializedName("URL"    ) var URL    : String? = null,
  @SerializedName("Width"  ) var Width  : String? = null

)