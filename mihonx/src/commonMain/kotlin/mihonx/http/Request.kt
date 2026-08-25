package mihonx.http

public interface Request {

    public val url: HttpUrl
    public val method: String
    public val headers: Headers
    public val body: RequestBody?

    public fun newBuilder(): Builder

    public interface Builder {

        public fun url(url: String): Builder

        public fun url(url: HttpUrl): Builder

        public fun header(name: String, value: String): Builder

        public fun method(method: String): Builder

        public fun body(content: String, contentType: String?): Builder

        public fun body(content: ByteArray, contentType: String?): Builder

        public fun body(body: RequestBody): Builder

        public fun build(): Request
    }
}
