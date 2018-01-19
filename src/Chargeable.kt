interface Chargeable {
    /**
     * Returns a number between 0-100 where 0 is empty and 100 is fully charged.
     */
    fun getBatteryPercentage(): Double
}