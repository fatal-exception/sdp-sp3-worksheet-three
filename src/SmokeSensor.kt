import java.util.Random

class SmokeSensor : ChargeableSensor() {
    private val r = Random()

    override fun isTriggered(): Boolean {
        battery -= 20
        return r.nextInt(100) < 10
    }

    override fun getLocation(): String {
        return ""
    }

    override fun getSensortype(): String {
        return "Smoke sensor"
    }

}