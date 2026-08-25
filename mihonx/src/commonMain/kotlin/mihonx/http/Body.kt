package mihonx.http

import okio.BufferedSink
import okio.BufferedSource

public interface RequestBody {

    public val contentType: String?
    public val contentLength: Long

    public fun writeTo(sink: BufferedSink)
}

public interface ResponseBody {

    public val contentType: String?
    public val contentLength: Long

    public suspend fun bytes(): ByteArray

    public suspend fun string(): String

    public fun source(): BufferedSource

    public fun close()
}
