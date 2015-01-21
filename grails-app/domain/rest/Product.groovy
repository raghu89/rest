package rest

import org.grails.databinding.BindingFormat
import org.restapidoc.annotation.RestApiObject
import org.restapidoc.annotation.RestApiObjectField

@RestApiObject(name = "Product", description = "A Product represents, and item in the store.")
class Product {

    @RestApiObjectField(description = "Product code is unique for a given product.")
    String productCode

    @RestApiObjectField(description = "Name of the product")
    String productName

    @BindingFormat("dd-MM-yyyy hh:mm")
    Date dateCreated

    @BindingFormat("dd-MM-yyyy hh:mm")
    Date lastUpdated

    static constraints = {
        productCode(unique: true)
        productName(blank: false)

    }

    static mapping = {
        autoTimestamp: true
    }

    String toString() {
        productCode
    }
}
