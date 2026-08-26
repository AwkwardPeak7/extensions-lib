package mihonx.http

public interface Response : AutoCloseable {

    public val request: Request
    public val code: Int
    public val message: String
    public val headers: Headers
    public val body: ResponseBody?

}
