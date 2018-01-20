import java.util.Random

class FireSensor : Sensor, Chargeable {
    override val announcers = emptyList<Announcer>()
    private val r: Random = Random()
    var battery: Double = 100.0

    override fun isTriggered(): Boolean {
        battery -= 10
        return r.nextInt(100) < 5
    }

    override fun getLocation(): String {
        return ""
    }

    override fun getSensortype(): String {
        return "Fire sensor"
    }

    override fun getBatteryPercentage(): Double = battery

}