package mihonx.http

import kotlin.time.Duration

public interface HttpClient {

    public val cookieJar: CookieJar

    public suspend fun call(request: Request): Response

    public fun newBuilder(): Builder

    public interface Builder {

        public fun callTimeout(timeout: Duration): Builder

        public fun connectTimeout(timeout: Duration): Builder

        public fun readTimeout(timeout: Duration): Builder

        public fun writeTimeout(timeout: Duration): Builder

        public fun addInterceptor(interceptor: Interceptor): Builder

        public fun cookieJar(cookieJar: CookieJar): Builder

        public fun build(): HttpClient
    }
}
