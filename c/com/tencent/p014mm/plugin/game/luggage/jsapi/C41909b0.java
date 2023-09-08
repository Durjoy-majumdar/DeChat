package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.util.Base64;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p008bq.C0363p0;
import p008bq.C92289q0;
import p828wa.C53095a;
import p828wa.C53096b;
import rd3.C48020a;
import rx3.C13598b0;
import te3.C101800k70;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.b0 */
public final class C41909b0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "getStoreEmoticonImage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C92289q0.class;
        Class cls2 = C0363p0.class;
        JSONObject e = C6013c.m5893e(str);
        if (e != null && context != null && bVar != null) {
            String optString = e.optString("md5");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls2)).mo403r2(optString);
            if (r2 == null) {
                String optString2 = e.optString("product_id");
                if (Util.isNullOrNil(optString2)) {
                    String optString3 = e.optString("emojiInfoBufferBase64");
                    boolean z = true;
                    if (!(optString3 == null || optString3.length() == 0)) {
                        byte[] decode = Base64.decode(optString3, 2);
                        C101800k70 k702 = new C101800k70();
                        k702.parseFrom(decode);
                        String str2 = k702.f298586d;
                        if (!(str2 == null || str2.length() == 0)) {
                            z = false;
                        }
                        if (!z) {
                            IEmojiInfo zE = ((C0363p0) C86312j.m106911c(cls2)).mo404zE();
                            zE.setMd5(k702.f298586d);
                            zE.mo62634E(k702.f298592j);
                            zE.setAesKey(k702.f298591i);
                            zE.mo62653a1(k702.f298590h);
                            zE.mo62638I1(k702.f298593n);
                            zE.mo62689q1(k702.f298594o);
                            ((C92289q0) C86312j.m106911c(cls)).ma0(zE, new C41908a0(bVar, this, context));
                            return;
                        }
                        bVar.mo6945a("emojiInfoBufferBase64 cast to emojiInfo error", (JSONObject) null);
                        return;
                    }
                    bVar.mo6945a("productId is null and emojiInfoBufferBase64 is null", (JSONObject) null);
                    return;
                }
                IEmojiInfo zE2 = ((C0363p0) C86312j.m106911c(cls2)).mo404zE();
                zE2.setMd5(optString);
                zE2.mo62634E(optString2);
                C13598b0 b0Var = C13598b0.f38549a;
                ((C92289q0) C86312j.m106911c(cls)).ma0(zE2, new C41908a0(bVar, this, context));
            } else if (C48020a.m53385b(r2.getCoverPath())) {
                mo65753f(r2, bVar);
            } else {
                r2.mo62698y(context);
                mo65753f(r2, bVar);
            }
        } else if (bVar != null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016 A[Catch:{ Exception -> 0x003e }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65753f(com.tencent.p014mm.api.IEmojiInfo r5, com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2.C5947b r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r5 = r5.getCoverPath()     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x0011
            int r2 = r5.length()     // Catch:{ Exception -> 0x003e }
            if (r2 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            if (r2 == 0) goto L_0x0016
            r5 = r1
            goto L_0x0030
        L_0x0016:
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106423E(r5)     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "openRead(path)"
            gy3.C87412m.m108593f(r5, r2)     // Catch:{ Exception -> 0x003e }
            int r2 = r5.available()     // Catch:{ Exception -> 0x003e }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x003e }
            r5.read(r2)     // Catch:{ Exception -> 0x003e }
            r5.close()     // Catch:{ Exception -> 0x003e }
            r5 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r2, r5)     // Catch:{ Exception -> 0x003e }
        L_0x0030:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x003e }
            r2.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = "base64GifData"
            r2.put(r3, r5)     // Catch:{ Exception -> 0x003e }
            r6.mo6945a(r1, r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x004b
        L_0x003e:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "JsApiGetStoreEmoticonImage"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r1, r0)
            java.lang.String r5 = "fail"
            r6.mo6945a(r5, r1)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C41909b0.mo65753f(com.tencent.mm.api.IEmojiInfo, com.tencent.mm.plugin.webview.luggage.jsapi.m2$b):void");
    }
}
