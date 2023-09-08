package com.tencent.liteav.base.http;

/* renamed from: com.tencent.liteav.base.http.b */
final /* synthetic */ class C17103b implements Runnable {

    /* renamed from: a */
    private final HttpClientAndroid f46138a;

    private C17103b(HttpClientAndroid httpClientAndroid) {
        this.f46138a = httpClientAndroid;
    }

    /* renamed from: a */
    public static Runnable m16891a(HttpClientAndroid httpClientAndroid) {
        return new C17103b(httpClientAndroid);
    }

    public final void run() {
        HttpClientAndroid.lambda$cancelAll$1(this.f46138a);
    }
}
