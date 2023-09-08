package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.ContentValues;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82914r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import lu3.C88656g;
import rx3.C13598b0;
import te3.C49684hc;
import wi0.C90980f0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s1 */
public final class C82928s1 implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ C82914r1.C82918c f242427d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<String, C13598b0> f242428e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<List<WxaAttributes>, C13598b0> f242429f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f242430g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<List<WxaAttributes>, C13598b0> f242431h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s1$a */
    public static final class C82929a extends C87413o implements C32226l<C49684hc, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f242432d;

        /* renamed from: e */
        public final /* synthetic */ C82914r1.C82918c f242433e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<List<WxaAttributes>, C13598b0> f242434f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82929a(C32226l<? super String, C13598b0> lVar, C82914r1.C82918c cVar, C32226l<? super List<WxaAttributes>, C13598b0> lVar2) {
            super(1);
            this.f242432d = lVar;
            this.f242433e = cVar;
            this.f242434f = lVar2;
        }

        public Object invoke(Object obj) {
            boolean z;
            C49684hc hcVar = (C49684hc) obj;
            if (hcVar == null) {
                this.f242432d.invoke("get contact fail response is null");
            } else {
                C90980f0.f261056b.getClass();
                try {
                    byte[] byteArray = hcVar.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("CONTENT_KEY_BATCH_SYNC_SCENE", 107);
                    contentValues.put("CONTENT_KEY_BATCH_SYNC_PROTO", byteArray);
                    MMApplicationContext.getContext().getContentResolver().insert(C90980f0.f261055a, contentValues);
                    z = true;
                } catch (Exception unused) {
                    Log.m105920e("Luggage.WxaAttrsContentResolver", "batchUpdateWithProto insert failed");
                    z = false;
                }
                if (z) {
                    List<WxaAttributes> a = C90980f0.f261056b.mo125057a(this.f242433e.f242403c, new String[0]);
                    if (a != null) {
                        this.f242434f.invoke(a);
                    } else {
                        a = null;
                    }
                    if (a == null) {
                        this.f242432d.invoke("get contact fail");
                    }
                } else {
                    this.f242432d.invoke("update contacts fail");
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C82928s1(C82914r1.C82918c cVar, C32226l<? super String, C13598b0> lVar, C32226l<? super List<WxaAttributes>, C13598b0> lVar2, C32224a<C13598b0> aVar, C32226l<? super List<WxaAttributes>, C13598b0> lVar3) {
        this.f242427d = cVar;
        this.f242428e = lVar;
        this.f242429f = lVar2;
        this.f242430g = aVar;
        this.f242431h = lVar3;
    }

    public String getKey() {
        return "Luggage.FULL.JsApiBatchGetContact.Loader";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ JSONException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Loader("
            java.lang.String r1 = "Luggage.FULL.JsApiBatchGetContact"
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ JSONException -> 0x0136 }
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r5 = r14.f242427d     // Catch:{ JSONException -> 0x0136 }
            java.util.List<java.lang.String> r5 = r5.f242403c     // Catch:{ JSONException -> 0x0136 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0136 }
            wi0.f0 r5 = wi0.C90980f0.f261056b     // Catch:{ JSONException -> 0x0136 }
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r6 = r14.f242427d     // Catch:{ JSONException -> 0x0136 }
            java.util.List<java.lang.String> r6 = r6.f242403c     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r7 = "username"
            java.lang.String r8 = "appId"
            java.lang.String r9 = "versionInfo"
            java.lang.String r10 = "appInfo"
            java.lang.String r11 = "syncTimeSecond"
            java.lang.String r12 = "syncVersion"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}     // Catch:{ JSONException -> 0x0136 }
            java.util.List r5 = r5.mo125057a(r6, r7)     // Catch:{ JSONException -> 0x0136 }
            r6 = 0
            if (r5 == 0) goto L_0x009b
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r7 = r14.f242427d     // Catch:{ JSONException -> 0x0136 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0136 }
        L_0x003e:
            boolean r8 = r5.hasNext()     // Catch:{ JSONException -> 0x0136 }
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r5.next()     // Catch:{ JSONException -> 0x0136 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r8 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r8     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r9 = r8.field_appInfo     // Catch:{ JSONException -> 0x0136 }
            if (r9 == 0) goto L_0x0057
            int r9 = r9.length()     // Catch:{ JSONException -> 0x0136 }
            if (r9 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r9 = 0
            goto L_0x0058
        L_0x0057:
            r9 = 1
        L_0x0058:
            if (r9 != 0) goto L_0x003e
            java.lang.String r9 = r8.field_appId     // Catch:{ JSONException -> 0x0136 }
            r4.remove(r9)     // Catch:{ JSONException -> 0x0136 }
            r2.add(r8)     // Catch:{ JSONException -> 0x0136 }
            long r9 = r8.field_syncTimeSecond     // Catch:{ JSONException -> 0x0136 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r9)     // Catch:{ JSONException -> 0x0136 }
            long r11 = r7.f242405e     // Catch:{ JSONException -> 0x0136 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003e
            te3.p55 r9 = new te3.p55     // Catch:{ JSONException -> 0x0136 }
            r9.<init>()     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r10 = r8.field_appId     // Catch:{ JSONException -> 0x0136 }
            r9.f184755f = r10     // Catch:{ JSONException -> 0x0136 }
            boolean r10 = com.tencent.p014mm.plugin.appbrand.config.C81681p.m100219a(r8)     // Catch:{ JSONException -> 0x0136 }
            if (r10 != 0) goto L_0x008b
            boolean r10 = com.tencent.p014mm.plugin.appbrand.config.C81681p.m100220b(r8)     // Catch:{ JSONException -> 0x0136 }
            if (r10 == 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            pe3.b r8 = com.tencent.p014mm.plugin.appbrand.config.C81660i.m100161mI(r8)     // Catch:{ JSONException -> 0x0136 }
            r9.f184754e = r8     // Catch:{ JSONException -> 0x0136 }
            goto L_0x0094
        L_0x008b:
            pe3.b r8 = new pe3.b     // Catch:{ JSONException -> 0x0136 }
            byte[] r10 = new byte[r6]     // Catch:{ JSONException -> 0x0136 }
            r8.<init>(r10, r6, r6)     // Catch:{ JSONException -> 0x0136 }
            r9.f184754e = r8     // Catch:{ JSONException -> 0x0136 }
        L_0x0094:
            r3.add(r9)     // Catch:{ JSONException -> 0x0136 }
            goto L_0x003e
        L_0x0098:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ JSONException -> 0x0136 }
            goto L_0x009c
        L_0x009b:
            r5 = 0
        L_0x009c:
            if (r5 != 0) goto L_0x00a6
            fy3.l<java.lang.String, rx3.b0> r2 = r14.f242428e     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r3 = "get contact fail"
            r2.invoke(r3)     // Catch:{ JSONException -> 0x0136 }
            return
        L_0x00a6:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x0136 }
        L_0x00aa:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x0136 }
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x0136 }
            te3.p55 r7 = new te3.p55     // Catch:{ JSONException -> 0x0136 }
            r7.<init>()     // Catch:{ JSONException -> 0x0136 }
            r7.f184755f = r5     // Catch:{ JSONException -> 0x0136 }
            pe3.b r5 = new pe3.b     // Catch:{ JSONException -> 0x0136 }
            byte[] r8 = new byte[r6]     // Catch:{ JSONException -> 0x0136 }
            r5.<init>(r8, r6, r6)     // Catch:{ JSONException -> 0x0136 }
            r7.f184754e = r5     // Catch:{ JSONException -> 0x0136 }
            r3.add(r7)     // Catch:{ JSONException -> 0x0136 }
            goto L_0x00aa
        L_0x00ca:
            int r4 = r2.size()
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r5 = r14.f242427d
            java.util.List<java.lang.String> r5 = r5.f242403c
            int r5 = r5.size()
            if (r4 != r5) goto L_0x00dd
            fy3.l<java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes>, rx3.b0> r4 = r14.f242429f
            r4.invoke(r2)
        L_0x00dd:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0130
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r0 = r14.f242427d
            int r0 = r0.f242402b
            r2.append(r0)
            java.lang.String r0 = ").waitForBatchCgiUpdate requestList.size:"
            r2.append(r0)
            int r0 = r3.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r0 = r14.f242427d
            zp0.l r1 = r0.f242404d
            com.tencent.mm.plugin.appbrand.jsapi.s1$a r1 = new com.tencent.mm.plugin.appbrand.jsapi.s1$a
            fy3.l<java.lang.String, rx3.b0> r2 = r14.f242428e
            fy3.l<java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes>, rx3.b0> r4 = r14.f242431h
            r1.<init>(r2, r0, r4)
            fy3.l<java.lang.String, rx3.b0> r2 = r14.f242428e
            r0.getClass()
            te3.gc r4 = new te3.gc
            r4.<init>()
            java.util.LinkedList<te3.p55> r5 = r4.f183299d
            r5.addAll(r3)
            r3 = 107(0x6b, float:1.5E-43)
            r4.f183300e = r3
            mp3.i r3 = mp3.C88819d.LOGIC
            com.tencent.mm.plugin.appbrand.jsapi.t1 r5 = new com.tencent.mm.plugin.appbrand.jsapi.t1
            r5.<init>(r0, r4, r1, r2)
            r3.arrange(r5)
            goto L_0x0135
        L_0x0130:
            fy3.a<rx3.b0> r0 = r14.f242430g
            r0.invoke()
        L_0x0135:
            return
        L_0x0136:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            com.tencent.mm.plugin.appbrand.jsapi.r1$c r0 = r14.f242427d
            int r0 = r0.hashCode()
            r3.append(r0)
            java.lang.String r0 = ").run(), make callback array e="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            fy3.l<java.lang.String, rx3.b0> r0 = r14.f242428e
            java.lang.String r1 = "get contact json error"
            r0.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82928s1.run():void");
    }
}
