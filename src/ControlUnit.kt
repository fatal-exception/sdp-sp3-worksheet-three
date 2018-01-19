import org.joda.time.DateTime
import org.joda.time.DateTimeZone

open class ControlUnit(private val sensors: List<Sensor>) {

    open fun pollSensors() {
        for (sensor in sensors) {
            if (sensor.isTriggered()) {
                println("A ${sensor.getSensortype()}  sensor was triggered at  ${sensor.getLocation()}")
            } else {
                println("Polled ${sensor.getSensortype()} at ${sensor.getLocation()}  successfully")
            }
        }
    }
}

class SecurityControlUnit(private val sensors: List<SecuritySensor>) : ControlUnit(sensors) {
    private val dt: DateTime = DateTime(DateTimeZone.UTC)

    override fun pollSensors() {
        // if time between 10pm and 6am
        if (dt.hourOfDay > 22 || dt.hourOfDay < 6) {
            super.pollSensors()
        }
        else println("Will not poll security sensors - it's daytime!")
    }

}
