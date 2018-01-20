import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class SmokeSensorTest {
    lateinit var sensor: SmokeSensor

    @Before
    fun setup(){
        sensor = SmokeSensor()
    }

    @Test
    fun testThatIsTriggeredReturnsFalse() {
        val isTriggered = sensor.isTriggered()
        assertEquals(false, isTriggered)
    }

    @Test
    fun testThatGetLocationReturnsNull() {
        val location = sensor.getLocation()
        assertEquals("", location)
    }

    @Test
    fun testThatGetSensorTypeReturnsNull() {
        val sensorType = sensor.getSensortype()
        assertEquals("Smoke sensor", sensorType)
    }

    @Test
    fun testThatGetBatteryPercentageReturnsOneHundred() {
        val batteryPercentage = sensor.getBatteryPercentage()
        assertEquals(100.0, batteryPercentage)
    }
}
