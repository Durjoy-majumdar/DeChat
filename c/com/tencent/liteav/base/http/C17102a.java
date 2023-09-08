package com.tencent.liteav.base.http;

import com.tencent.liteav.base.http.HttpClientAndroid;

/* renamed from: com.tencent.liteav.base.http.a */
final /* synthetic */ class C17102a implements Runnable {

    /* renamed from: a */
    private final HttpClientAndroid f46136a;

    /* renamed from: b */
    private final HttpClientAndroid.C17098d f46137b;

    private C17102a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C17098d dVar) {
        this.f46136a = httpClientAndroid;
        this.f46137b = dVar;
    }

    /* renamed from: a */
    public static Runnable m16890a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C17098d dVar) {
        return new C17102a(httpClientAndroid, dVar);
    }

    public final void run() {
        this.f46136a.doRequest(this.f46137b);
    }
}
