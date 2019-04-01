package bloder.com.blitz

import android.view.View
import android.widget.CheckBox
import bloder.com.core.validation.DefaultBlitzValidations

class CustomValidationExample : DefaultBlitzValidations() {

    fun CheckBox.wasChosen() : View = bindViewValidation(this) {
        this.isChecked
    }
}