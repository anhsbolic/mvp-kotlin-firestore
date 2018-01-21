package id.tutorialsajah.mvpkotlinfirestore.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import id.tutorialsajah.mvpkotlinfirestore.R
import id.tutorialsajah.mvpkotlinfirestore.interactor.GetSellerInteractorImpl
import id.tutorialsajah.mvpkotlinfirestore.model.Seller
import id.tutorialsajah.mvpkotlinfirestore.presenter.MainPresenter
import id.tutorialsajah.mvpkotlinfirestore.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityView {
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenterImpl(this@MainActivity, GetSellerInteractorImpl())

        mainPresenter.onLoadData()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        mainPresenter.onDestroy()
    }

    override fun setSellerData(seller: Seller) {
        setupProfileEtName.setText(seller.name!!)
        setupProfileEtStoreName.setText(seller.store_name!!)
        setupProfileEtPhone.setText(seller.phone!!)
    }

    override fun showProgress() {
        setupProfileProgressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        setupProfileProgressBar.visibility = View.GONE
    }

    override fun showSnackBarSuccess() {

    }
}
