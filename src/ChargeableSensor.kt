abstract class ChargeableSensor: Sensor, Chargeable {
    override val announcers = emptyList<Announcer>()

    protected var battery: Double = 100.0

    override fun getBatteryPercentage(): Double {
        return battery
    }
}