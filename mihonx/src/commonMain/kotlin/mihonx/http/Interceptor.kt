package mihonx.http

public fun interface Interceptor {

    public suspend fun intercept(chain: Chain): Response

    public interface Chain {

        public val request: Request

        public suspend fun proceed(request: Request): Response
    }
}
