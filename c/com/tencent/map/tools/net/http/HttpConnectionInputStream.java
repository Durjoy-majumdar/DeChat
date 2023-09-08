package com.tencent.map.tools.net.http;

import com.tencent.mapsdk.internal.C113886kg;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class HttpConnectionInputStream extends InputStream {
    private final HttpURLConnection mConnection;
    private final InputStream mProxyInputStream;

    public HttpConnectionInputStream(HttpURLConnection httpURLConnection) {
        this.mConnection = httpURLConnection;
        this.mProxyInputStream = httpURLConnection.getInputStream();
    }

    public void close() {
        super.close();
        C113886kg.m157515a((Closeable) this.mProxyInputStream);
        this.mConnection.disconnect();
    }

    public int read() {
        return this.mProxyInputStream.read();
    }
}
