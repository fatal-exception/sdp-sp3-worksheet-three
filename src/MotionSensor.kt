class MotionSensor : SecuritySensor {
    override val announcers = emptyList<Announcer>()

    override fun isTriggered(): Boolean {
        return false
    }

    override fun getLocation(): String {
        return ""
    }

    override fun getSensortype(): String {
        return "Motion sensor"
    }
}