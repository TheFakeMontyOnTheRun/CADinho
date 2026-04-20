package pt.b13h.cadinho

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform