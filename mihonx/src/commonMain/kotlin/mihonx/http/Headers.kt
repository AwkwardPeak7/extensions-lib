package mihonx.http

public interface Headers {

    public operator fun get(name: String): String?

    public fun values(name: String): List<String>
}
