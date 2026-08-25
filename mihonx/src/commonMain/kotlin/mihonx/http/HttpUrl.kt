package mihonx.http

/** An immutable, structured HTTP or HTTPS URL. */
public interface HttpUrl {

    public val scheme: String
    public val host: String
    public val port: Int
    public val encodedPath: String
    public val query: String?
    public val fragment: String?

    public fun newBuilder(): Builder

    public override fun toString(): String

    public interface Builder {

        public fun scheme(scheme: String): Builder

        public fun host(host: String): Builder

        public fun port(port: Int): Builder

        public fun encodedPath(encodedPath: String): Builder

        public fun addPathSegment(pathSegment: String): Builder

        public fun query(query: String?): Builder

        public fun addQueryParameter(name: String, value: String?): Builder

        public fun fragment(fragment: String?): Builder

        public fun build(): HttpUrl
    }
}
