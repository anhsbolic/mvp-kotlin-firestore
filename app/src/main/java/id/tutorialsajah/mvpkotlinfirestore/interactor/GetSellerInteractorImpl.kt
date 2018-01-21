package id.tutorialsajah.mvpkotlinfirestore.interactor

import com.google.firebase.firestore.FirebaseFirestore
import id.tutorialsajah.mvpkotlinfirestore.model.Seller

class GetSellerInteractorImpl: GetSellerInteractor {
    private lateinit var dataSeller: Seller

    override fun getDataSeller(sellerDataListener: GetSellerInteractor.OnGetDataListener) {
        FirebaseFirestore.getInstance().collection("seller")
                .document("SwpBKgBAk2yH1PtjRjwT")
                .get()
                .addOnCompleteListener{ task ->
                    if(task.isSuccessful){
                        if(task.result.exists()){
                            dataSeller = task.result.toObject(Seller::class.java)
                            sellerDataListener.onGetData(getSellerData())
                        }
                    }

                }
    }

    private fun getSellerData(): Seller {
        return dataSeller
    }
}