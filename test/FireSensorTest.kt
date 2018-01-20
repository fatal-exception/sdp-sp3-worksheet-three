import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class FireSensorTest  {
    lateinit var sensor: FireSensor

    @Before
    fun startup(){
        sensor = FireSensor()
    }

    @Test
    fun testThatIsTriggeredReturnsFalse() {
        val isTriggered = sensor.isTriggered()
        assertEquals(false, isTriggered)
    }

    @Test
    fun testThatGetLocationReturns() {
        val location = sensor.getLocation()
        assertEquals("", location)
    }

    @Test
    fun testThatGetSensorType() {
        val sensorType = sensor.getSensortype()
        assertEquals("Fire sensor", sensorType)
    }

    @Test
    fun testThatGetBatteryPercentageReturnsOneHundred() {
        val batteryPercentage  = sensor.getBatteryPercentage()
        assertEquals(100.0, batteryPercentage)
    }
}
