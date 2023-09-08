package com.tencent.liteav.base.http;

/* renamed from: com.tencent.liteav.base.http.c */
final /* synthetic */ class C17104c implements Runnable {

    /* renamed from: a */
    private final HttpClientAndroid f46139a;

    private C17104c(HttpClientAndroid httpClientAndroid) {
        this.f46139a = httpClientAndroid;
    }

    /* renamed from: a */
    public static Runnable m16892a(HttpClientAndroid httpClientAndroid) {
        return new C17104c(httpClientAndroid);
    }

    public final void run() {
        HttpClientAndroid.lambda$destroy$2(this.f46139a);
    }
}
