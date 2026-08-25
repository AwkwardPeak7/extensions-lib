package mihonx.http

public interface Response {

    public val request: Request
    public val code: Int
    public val message: String
    public val headers: Headers
    public val body: ResponseBody?

    public fun close()
}
