package com.tencent.liteav.videobase.utils;

import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videobase.utils.a */
public final class C17241a {

    /* renamed from: a */
    private long f46608a;

    /* renamed from: b */
    private long f46609b;

    /* renamed from: c */
    private final C17242a f46610c;

    /* renamed from: d */
    private long f46611d;

    /* renamed from: e */
    private long f46612e = ((long) ((int) Math.max(1000, TimeUnit.SECONDS.toMillis(1))));

    /* renamed from: f */
    private String f46613f;

    /* renamed from: com.tencent.liteav.videobase.utils.a$a */
    public interface C17242a {
    }

    public C17241a(String str, C17242a aVar) {
        this.f46613f = str;
        mo20216a();
        this.f46610c = aVar;
    }

    /* renamed from: a */
    public final void mo20216a() {
        this.f46608a = 0;
        this.f46609b = 0;
        this.f46611d = 0;
    }
}
