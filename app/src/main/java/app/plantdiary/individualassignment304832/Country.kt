package app.plantdiary.individualassignment304832

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("code") var code: String,
    @SerializedName("name") var name: String
) {
    override fun toString(): String {
        return "$name $code"
    }
}
