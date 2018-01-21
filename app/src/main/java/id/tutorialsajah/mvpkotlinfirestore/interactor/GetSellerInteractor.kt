package id.tutorialsajah.mvpkotlinfirestore.interactor

import id.tutorialsajah.mvpkotlinfirestore.model.Seller

interface GetSellerInteractor {
    interface OnGetDataListener{
        fun onGetData(seller: Seller)
    }

    fun getDataSeller(sellerDataListener: OnGetDataListener)
}