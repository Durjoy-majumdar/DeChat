package qd3;

import java.io.IOException;

/* renamed from: qd3.b */
public final class C12157b extends IOException {

    /* renamed from: d */
    public final long f35266d;

    /* renamed from: e */
    public final long f35267e;

    public C12157b(long j, long j2) {
        super(String.format("contentLength: %d, requestRange:%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        this.f35266d = j;
        this.f35267e = j2;
    }

    public String toString() {
        return "FileSizeOutOfRangeException{contentLength=" + this.f35266d + ", requestRange=" + this.f35267e + '}';
    }
}
