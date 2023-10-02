fun main(){
        val items = listOf(
            OrderItem("Burger",8.00),
            OrderItem("Fries",4.00),
            OrderItem("Soda",2.00),

        )
            val item2= listOf(
            OrderItem("lasagna",5.00),
            OrderItem("paratha",7.00),
            OrderItem("ungabunga",29.00),

        )

        val finalAmount = TaxCalculator.getTaxAmountForOrderItems(item2)
        println(finalAmount)
}