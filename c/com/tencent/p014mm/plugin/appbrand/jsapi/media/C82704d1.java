package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import hp3.C87581a;
import java.util.HashMap;
import js0.C9514m;
import lp3.C88643g;
import p914oj.C89231c;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.d1 */
public final class C82704d1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82381f f241999a;

    /* renamed from: b */
    public final /* synthetic */ C82739n f242000b;

    /* renamed from: c */
    public final /* synthetic */ int f242001c;

    /* renamed from: d */
    public final /* synthetic */ C82717g1 f242002d;

    public C82704d1(C82381f fVar, C82739n nVar, int i, C82717g1 g1Var) {
        this.f241999a = fVar;
        this.f242000b = nVar;
        this.f242001c = i;
        this.f242002d = g1Var;
    }

    public Object call(Object obj) {
        C13598b0 b0Var;
        String str;
        int i;
        int i2;
        C86009m1 m1Var = (C86009m1) obj;
        if (m1Var == null) {
            C82381f fVar = this.f241999a;
            int i3 = this.f242001c;
            Log.m105920e("MicroMsg.AppBrand.JsApiChooseVideoNew", "get NULL selected, appId[" + fVar.getAppId() + "], callbackId[" + i3 + ']');
            C88643g.m110544b().mo72091a(new Exception("fail:internal error"));
        } else {
            C81415h0 fileSystem = this.f241999a.getFileSystem();
            C82719g2 g2Var = null;
            if (fileSystem != null) {
                C82717g1 g1Var = this.f242002d;
                C82381f fVar2 = this.f241999a;
                int i4 = this.f242001c;
                C9514m mVar = new C9514m();
                String i5 = m1Var.mo119971i();
                C87412m.m108593f(i5, "selected.absolutePath");
                fileSystem.createTempFileFrom(m1Var, !C112551y.m153808h(i5, ".mp4", false, 2, (Object) null) ? "mp4" : null, false, mVar);
                CharSequence charSequence = (CharSequence) mVar.f29691a;
                if (charSequence == null || charSequence.length() == 0) {
                    str = g1Var.mo115109j("fail create temp file failed");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tempFilePath", mVar.f29691a);
                    String i6 = m1Var.mo119971i();
                    C87412m.m108593f(i6, "selected.absolutePath");
                    if (C86013q1.m106450k(i6)) {
                        try {
                            C89231c cVar = new C89231c();
                            cVar.setDataSource(i6);
                            int i7 = Util.getInt(cVar.extractMetadata(24), 0);
                            if (i7 == 90 || i7 == 270) {
                                i2 = Util.getInt(cVar.extractMetadata(19), 0);
                                i = Util.getInt(cVar.extractMetadata(18), 0);
                            } else {
                                int i8 = Util.getInt(cVar.extractMetadata(18), 0);
                                i = Util.getInt(cVar.extractMetadata(19), 0);
                                i2 = i8;
                            }
                            long j = Util.getLong(cVar.extractMetadata(9), 0);
                            cVar.release();
                            g2Var = new C82719g2(j, C86013q1.m106451l(i6), i2, i);
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.VideoMetaData", "MetaDataRetriever failed, e = " + e);
                            g2Var = null;
                        }
                    }
                    if (g2Var != null) {
                        hashMap.put("duration", Long.valueOf(Math.round(((double) g2Var.f242033a) / 1000.0d)));
                        hashMap.put("size", Long.valueOf(g2Var.f242034b));
                        hashMap.put("height", Integer.valueOf(g2Var.f242036d));
                        hashMap.put("width", Integer.valueOf(g2Var.f242035c));
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    str = g1Var.mo115112m("ok", hashMap);
                }
                fVar2.mo109647a(i4, str);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C82381f fVar3 = this.f241999a;
                int i9 = this.f242001c;
                C82717g1 g1Var2 = this.f242002d;
                Log.m105920e("MicroMsg.AppBrand.JsApiChooseVideoNew", "on selected NULL fs appId[" + fVar3.getAppId() + "], callbackId[" + i9 + ']');
                fVar3.mo109647a(i9, g1Var2.mo115109j("fail:internal error"));
            }
            C86009m1 m1Var2 = ((C82739n.C82742c) this.f242000b).f242062a.get(0);
            C82381f fVar4 = this.f241999a;
            int i15 = this.f242001c;
            C82717g1 g1Var3 = this.f242002d;
            C82739n nVar = this.f242000b;
            C86009m1 m1Var3 = m1Var2;
            Log.m105924i("MicroMsg.AppBrand.JsApiChooseVideoNew", "on selected source[" + m1Var3.mo119971i() + "], selected[" + m1Var.mo119971i() + "], appId[" + fVar4.getAppId() + "], callbackId[" + i15 + ']');
            C87412m.m108593f(nVar, "result");
            g1Var3.getClass();
            if (((C82739n.C82742c) nVar).f242063b == 2) {
                C86013q1.m106447h(m1Var3.mo119971i());
            }
            if (!C87412m.m108589b(m1Var.mo119971i(), m1Var3.mo119971i())) {
                C86013q1.m106447h(m1Var.mo119971i());
            }
        }
        return C13598b0.f38549a;
    }
}
