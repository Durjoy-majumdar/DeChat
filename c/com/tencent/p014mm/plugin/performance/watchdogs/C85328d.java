package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import p269xe.C91190k;
import p269xe.C91191l;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.d */
public final class C85328d extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f248645d;

    /* renamed from: e */
    public final /* synthetic */ long f248646e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85328d(long j, long j2) {
        super(1);
        this.f248645d = j;
        this.f248646e = j2;
    }

    public Object invoke(Object obj) {
        Object obj2 = obj;
        C87412m.m108594g(obj2, LocaleUtil.ITALIAN);
        C91190k.C26537a aVar = C91190k.f261451a;
        long j = this.f248645d;
        long j2 = this.f248646e;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hprof", (String) obj2);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.Safe", th, "", new Object[0]);
        }
        aVar.mo53491a(new C91190k.C26538b(200, (String) null, 0, 0, j, j2, 0, 0, (String) null, 0, (String) null, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, 1, 0, 0, 0, 0, (String) null, (String) null, C91191l.m114455a(jSONObject), 0, 0, (String) null, (String) null, 0, 0, -67633202, 1, (C8480h) null));
        return C13598b0.f38549a;
    }
}
