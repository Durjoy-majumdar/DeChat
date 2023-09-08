package com.tencent.luggage.sdk.config;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.luggage.sdk.config.a */
public interface C0926a {

    /* renamed from: a */
    public static final C0926a f2134a = new C0927a();

    /* renamed from: com.tencent.luggage.sdk.config.a$a */
    public class C0927a implements C0926a {
        /* renamed from: a */
        public String mo879a() {
            return "SessionId@" + hashCode() + "#" + Util.nowMilliSecond();
        }
    }

    /* renamed from: com.tencent.luggage.sdk.config.a$b */
    public static class C0928b {

        /* renamed from: a */
        public static C0926a f2135a;
    }

    /* renamed from: a */
    String mo879a();
}
