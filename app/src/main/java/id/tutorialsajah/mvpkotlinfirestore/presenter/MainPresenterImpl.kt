package id.tutorialsajah.mvpkotlinfirestore.presenter

import id.tutorialsajah.mvpkotlinfirestore.interactor.GetSellerInteractor
import id.tutorialsajah.mvpkotlinfirestore.model.Seller
import id.tutorialsajah.mvpkotlinfirestore.view.activity.MainActivityView

class MainPresenterImpl(private var mainActivityView: MainActivityView?,
                        private val getSellerInteractor: GetSellerInteractor): MainPresenter,
        GetSellerInteractor.OnGetDataListener{

    override fun onLoadData() {
        if(mainActivityView != null){
            mainActivityView!!.showProgress()
        }

        getSellerInteractor.getDataSeller(this)

    }

    override fun onButtonSaveClick() {

    }

    override fun onDestroy() {
        mainActivityView = null
    }

    override fun onGetData(seller: Seller) {
        if(mainActivityView != null){
            mainActivityView!!.setSellerData(seller)
            mainActivityView!!.hideProgress()
        }
    }
}