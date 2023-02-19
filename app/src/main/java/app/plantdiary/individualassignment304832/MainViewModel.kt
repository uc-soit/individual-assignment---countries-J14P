package app.plantdiary.individualassignment304832

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.plantdiary.individualassignment304832.service.CountryService
import kotlinx.coroutines.launch

class MainViewModel(var countryService : CountryService = CountryService()) : ViewModel() {

    var countries : MutableLiveData<List<Country>> = MutableLiveData<List<Country>>()

    fun fetchCountries() {
        viewModelScope.launch {
            var innerCountries = countryService.fetchCountries()
            countries.postValue(innerCountries)
        }
    }
}