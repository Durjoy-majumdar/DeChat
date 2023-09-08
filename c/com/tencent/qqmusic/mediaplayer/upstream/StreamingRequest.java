package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import java.util.Map;

public class StreamingRequest {
    public final Map<String, String> headers;
    public final Uri uri;

    public StreamingRequest(Uri uri2, Map<String, String> map) {
        this.uri = uri2;
        this.headers = map;
    }

    public String toString() {
        return "StreamingRequest{uri='" + this.uri + '\'' + ", headers=" + this.headers + '}';
    }
}
