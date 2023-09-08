package gk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import lp3.C46888b;
import rx3.C13598b0;
import zq0.C91891k0;
import zq0.C91910r;
import zq0.C91919w;

/* renamed from: gk0.c0 */
public final class C87234c0 implements C91910r.C91911a {

    /* renamed from: a */
    public final /* synthetic */ PhoneItem f252916a;

    /* renamed from: b */
    public final /* synthetic */ C91891k0 f252917b;

    /* renamed from: c */
    public final /* synthetic */ C83780d1 f252918c;

    /* renamed from: d */
    public final /* synthetic */ C46888b f252919d;

    public C87234c0(PhoneItem phoneItem, C91891k0 k0Var, C83780d1 d1Var, C46888b bVar) {
        this.f252916a = phoneItem;
        this.f252917b = k0Var;
        this.f252918c = d1Var;
        this.f252919d = bVar;
    }

    /* renamed from: a */
    public void mo121653a(boolean z, Map<String, String> map) {
        C87412m.m108594g(map, "result");
        if (z) {
            if (this.f252916a.f245278n) {
                C91891k0 k0Var = this.f252917b;
                if (k0Var != null) {
                    Long valueOf = Long.valueOf(k0Var.f263097g);
                    C87412m.m108591d(valueOf);
                    k0Var.f263097g = valueOf.longValue() + 1;
                }
            } else {
                C91891k0 k0Var2 = this.f252917b;
                if (k0Var2 != null) {
                    Long valueOf2 = Long.valueOf(k0Var2.f263098h);
                    C87412m.m108591d(valueOf2);
                    k0Var2.f263098h = valueOf2.longValue() + 1;
                }
            }
            C91891k0 k0Var3 = this.f252917b;
            String appId = this.f252918c.getAppId();
            C87412m.m108593f(appId, "env.appId");
            k0Var3.getClass();
            k0Var3.f263089A = appId;
            C91891k0 k0Var4 = this.f252917b;
            String mD5String = MD5Util.getMD5String(MD5Util.getMD5String(this.f252916a.f245271d));
            C87412m.m108593f(mD5String, "getMD5String(MD5Util.get…String(phoneItem.mobile))");
            k0Var4.getClass();
            k0Var4.f263090B = mD5String;
            C46888b bVar = this.f252919d;
            Object[] objArr = new Object[1];
            C82870p.C82871a aVar = new C82870p.C82871a("ok", new Object[0]);
            HashMap hashMap = new HashMap();
            String str = map.get("encryptedData");
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("encryptedData", str);
            String str3 = map.get("iv");
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("iv", str3);
            String str4 = map.get("cloud_id");
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("cloud_id", str2);
            ((HashMap) aVar.f242316a).put("data", map.get("data"));
            ((HashMap) aVar.f242316a).putAll(hashMap);
            C13598b0 b0Var = C13598b0.f38549a;
            objArr[0] = aVar;
            bVar.mo72093c(objArr);
            C91919w.f263170a.mo125750e(this.f252916a);
            return;
        }
        this.f252919d.mo72091a(map.get("errMsg"));
    }
}
