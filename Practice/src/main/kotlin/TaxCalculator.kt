class TaxCalculator{
    companion object{
        private const val salesTaxPercentage : Double = 15.00
        fun getTaxAmountForOrderItems( orderItems : List<OrderItems>) : Double{
            var orderAmount : Double = 0.00
            for (items in orderItems){
                orderAmount +=   items.price
            }

            return orderAmount* salesTaxPercentage/100
        }

    }
}