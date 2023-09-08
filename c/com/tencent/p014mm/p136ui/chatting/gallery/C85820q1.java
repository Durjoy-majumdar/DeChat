package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.HashMap;
import te3.C64598o03;

/* renamed from: com.tencent.mm.ui.chatting.gallery.q1 */
public final class C85820q1 {

    /* renamed from: a */
    public static final C85820q1 f249947a = new C85820q1();

    /* renamed from: b */
    public static final HashMap<String, Boolean> f249948b = new HashMap<>();

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo119746a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r6, r0)
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            r1 = 1
            eb0.v0$c r6 = r0.mo120947c(r6, r1)
            java.lang.String r0 = "PlayUrl"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.mo120959f(r0, r1)
            java.lang.String r1 = "SaveTime"
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f251318a
            eb0.v0$b r6 = (eb0.C86493v0.C86494b) r6
            java.lang.Object r6 = r6.get(r1)
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L_0x0031
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            goto L_0x0033
        L_0x0031:
            r1 = 0
        L_0x0033:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            long r1 = java.lang.Math.abs(r3)
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0045
            r6 = 0
            return r6
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C85820q1.mo119746a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final C64598o03 mo119747b(String str) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("MpShareVideoPlayInfo");
        C64598o03 o032 = new C64598o03();
        o032.f184604g = singleMMKV.decodeInt(str + "VideoSize", 0);
        o032.f184602e = singleMMKV.decodeInt(str + "block", 0);
        o032.f184603f = singleMMKV.decodeString(str + "errMsg", "");
        return o032;
    }
}
