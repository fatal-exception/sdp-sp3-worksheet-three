import java.util.Random

class SmokeSensor : Sensor, Chargeable {
    private val r = Random()
    private val battery = 100.0
    override val announcers = emptyList<Announcer>()

    override fun isTriggered(): Boolean {
        return r.nextInt(100) < 10
    }

    override fun getLocation(): String {
        return ""
    }

    override fun getSensortype(): String {
        return "Smoke sensor"
    }

    override fun getBatteryPercentage(): Double = battery

}