import java.util.Random

class FireSensor : ChargeableSensor() {
    private val r: Random = Random()

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

}