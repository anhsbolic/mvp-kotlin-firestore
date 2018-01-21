package id.tutorialsajah.mvpkotlinfirestore.view.activity

import id.tutorialsajah.mvpkotlinfirestore.model.Seller

interface MainActivityView {

    fun setSellerData(seller: Seller)

    fun showProgress()

    fun hideProgress()

    fun showSnackBarSuccess()
}