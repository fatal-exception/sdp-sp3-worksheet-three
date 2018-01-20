import java.util.*

fun main(args: Array<String>) {
    val sensors: List<Sensor> = listOf(FireSensor(), SmokeSensor())
    val securitySensors = listOf(MotionSensor())
    val controlUnit = ControlUnit(sensors)
    val securityControlUnit = SecurityControlUnit(securitySensors)

    val scanner = Scanner(System.`in`)
    var input = ""
    do {
        print("Type \"poll\" to poll all sensors once or \"exit\" to exit: ")
        input = scanner.nextLine()
        if (input == "poll") {
            controlUnit.pollSensors()
            securityControlUnit.pollSensors()
        }
    } while (input != "exit")
}
