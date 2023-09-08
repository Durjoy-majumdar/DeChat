package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y0 */
public abstract class C68727y0 implements C68717h1 {

    /* renamed from: a */
    public final Integer f197399a;

    /* renamed from: b */
    public String f197400b;

    /* renamed from: c */
    public String f197401c;

    public C68727y0(Integer num) {
        this.f197399a = num;
    }

    /* renamed from: a */
    public synchronized String mo94514a(C82381f fVar, String str) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(str, "certPath");
        if (C87412m.m108589b(str, this.f197400b)) {
            String str2 = this.f197401c;
            if (str2 != null) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("MicroMsg.AppBrand.BaseInputEncryptExtension#");
            Integer num = this.f197399a;
            sb.append(num != null ? num.intValue() : hashCode());
            Log.m105920e(sb.toString(), "readCertPem, cachedCertPem is null");
            throw new C68698a1("certPath is illegal");
        }
        try {
            String a = C84949c1.f247602a.mo117811a(fVar, str);
            this.f197401c = a;
            this.f197400b = str;
            return a;
        } catch (C68716d1 e) {
            throw new C68698a1(e.getMessage());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C68727y0(Integer num, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : num);
    }
}
