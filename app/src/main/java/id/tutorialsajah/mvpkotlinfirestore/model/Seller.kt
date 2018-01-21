package id.tutorialsajah.mvpkotlinfirestore.model

import android.support.annotation.Keep
import com.google.firebase.firestore.GeoPoint
import com.google.firebase.firestore.IgnoreExtraProperties
import java.util.*

@Keep
@IgnoreExtraProperties
data class Seller(var name: String?,
                  var store_name: String?,
                  var phone: String?,
                  var address: String?,
                  var kelurahan: String?,
                  var kecamatan: String?,
                  var city: String?,
                  var zip_code: String?,
                  var location: GeoPoint?,
                  var shop_type: String?,
                  var shop_items: MutableList<String>?,
                  var status: String?,
                  var profileComplete: Boolean?,
                  var tutorialComplete: Boolean?,
                  var createdAt: Date?,
                  var updatedAt: Date?
) {
    constructor() : this(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null)
}