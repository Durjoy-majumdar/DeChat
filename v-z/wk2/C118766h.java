package wk2;

import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.HashMap;
import p702ts.C78083b;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: wk2.h */
public final class C118766h implements C78083b.C78084a {

    /* renamed from: a */
    public final /* synthetic */ C13855j f355324a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f355325b;

    /* renamed from: c */
    public final /* synthetic */ float f355326c;

    /* renamed from: d */
    public final /* synthetic */ float f355327d;

    /* renamed from: e */
    public final /* synthetic */ float f355328e;

    /* renamed from: f */
    public final /* synthetic */ float f355329f;

    public C118766h(C13855j jVar, C13851h1 h1Var, float f, float f2, float f3, float f4) {
        this.f355324a = jVar;
        this.f355325b = h1Var;
        this.f355326c = f;
        this.f355327d = f2;
        this.f355328e = f3;
        this.f355329f = f4;
    }

    public final void onLocationAddr(Addr addr) {
        Log.m105924i("MicroMsg.JsApiGeoLocation", "getAddressByPoi callback: " + addr);
        HashMap hashMap = new HashMap();
        if (addr != null) {
            C118764f fVar = C118764f.f355315f;
            fVar.getClass();
            String str = addr.f343957e;
            if (!(str == null || str.length() == 0)) {
                hashMap.put("retCode", 0);
                hashMap.put("longitude", Float.valueOf(this.f355326c));
                hashMap.put("latitude", Float.valueOf(this.f355327d));
                String str2 = addr.f343971v;
                C87412m.m108593f(str2, "addr.nationalCode");
                hashMap.put("nationalCode", str2);
                hashMap.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Float.valueOf(this.f355328e));
                hashMap.put("accuracy", Float.valueOf(this.f355329f));
                String str3 = addr.f343957e;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                hashMap.put("province", str3);
                String str5 = addr.f343959g;
                if (str5 == null) {
                    str5 = str4;
                }
                hashMap.put("city", str5);
                String str6 = addr.f343961i;
                if (str6 == null) {
                    str6 = str4;
                }
                hashMap.put("district", str6);
                String str7 = addr.f343963n;
                if (str7 != null) {
                    str4 = str7;
                }
                hashMap.put("street", str4);
                C13849g gVar = this.f355324a.f39001d;
                String str8 = this.f355325b.f38990c;
                StringBuilder sb = new StringBuilder();
                fVar.getClass();
                sb.append(C118764f.f355316g);
                sb.append(":ok");
                gVar.mo10774a(str8, sb.toString(), hashMap);
                return;
            }
        }
        hashMap.put("retCode", 3);
        C13849g gVar2 = this.f355324a.f39001d;
        String str9 = this.f355325b.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C118764f.f355315f.getClass();
        sb4.append(C118764f.f355316g);
        sb4.append(":fail");
        gVar2.mo10774a(str9, sb4.toString(), hashMap);
    }
}
