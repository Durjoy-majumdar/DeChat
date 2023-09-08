package com.tencent.liteav.base.http;

import com.tencent.liteav.base.http.HttpClientAndroid;

/* renamed from: com.tencent.liteav.base.http.d */
final /* synthetic */ class C17105d implements Runnable {

    /* renamed from: a */
    private final HttpClientAndroid f46140a;

    /* renamed from: b */
    private final HttpClientAndroid.C17099e f46141b;

    /* renamed from: c */
    private final long f46142c;

    private C17105d(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C17099e eVar, long j) {
        this.f46140a = httpClientAndroid;
        this.f46141b = eVar;
        this.f46142c = j;
    }

    /* renamed from: a */
    public static Runnable m16893a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C17099e eVar, long j) {
        return new C17105d(httpClientAndroid, eVar, j);
    }

    public final void run() {
        HttpClientAndroid.lambda$doReadData$3(this.f46140a, this.f46141b, this.f46142c);
    }
}
