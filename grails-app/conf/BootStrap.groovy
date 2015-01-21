import rest.Product

class BootStrap {

    def init = { servletContext ->

        if (Product.count() == 0) {

            def products = []


            products << new Product(productName: 'Byk', productCode: 'BYK')
            products << new Product(productName: 'Car', productCode: 'CAR')
            products << new Product(productName: 'MiniCar', productCode: 'MINICAR')
            products << new Product(productName: 'Bus', productCode: 'BUS')


        products.each {

                if (!it.save(flush: true)) {
                    println "Error in saving branch :"
                    println "errors are" + it.errors
                } else {
                    println "saved branch is" + it
                }
            }
        }
    }
    def destroy = {
    }
}
