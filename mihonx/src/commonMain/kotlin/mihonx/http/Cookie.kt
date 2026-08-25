package mihonx.http

import kotlin.time.Duration

public interface Cookie {

    public val name: String
    public val value: String
    public val expiresAt: Duration
    public val domain: String
    public val path: String
    public val secure: Boolean
    public val httpOnly: Boolean
}

public interface CookieJar {

    public fun save(url: HttpUrl, cookies: List<Cookie>)

    public fun load(url: HttpUrl): List<Cookie>

    public fun remove(url: HttpUrl): Boolean

    public fun clear(): Boolean
}
