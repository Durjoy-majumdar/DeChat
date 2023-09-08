package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32226l;
import gk0.C87237e;
import gy3.C87413o;
import ik0.C87744a;
import lp3.C46888b;
import rx3.C13598b0;
import zq0.C91891k0;

/* renamed from: gk0.d0 */
public final class C87236d0 extends C87413o implements C32226l<PhoneItem, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252921d;

    /* renamed from: e */
    public final /* synthetic */ C87744a f252922e;

    /* renamed from: f */
    public final /* synthetic */ C83780d1 f252923f;

    /* renamed from: g */
    public final /* synthetic */ C87237e.C87238a f252924g;

    /* renamed from: h */
    public final /* synthetic */ C46888b f252925h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87236d0(C91891k0 k0Var, C87744a aVar, C83780d1 d1Var, C87237e.C87238a aVar2, C46888b bVar) {
        super(1);
        this.f252921d = k0Var;
        this.f252922e = aVar;
        this.f252923f = d1Var;
        this.f252924g = aVar2;
        this.f252925h = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        r3 = r8.f252926a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem r12 = (com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem) r12
            java.lang.String r0 = "phoneItem"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select phoneItem "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.JsApiGetPhoneNumberNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            zq0.k0 r6 = r11.f252921d
            ik0.a r0 = r11.f252922e
            com.tencent.mm.plugin.appbrand.page.d1 r7 = r11.f252923f
            gk0.e$a r8 = r11.f252924g
            lp3.b r1 = r11.f252925h
            r2 = 1
            if (r6 != 0) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            long r4 = r6.f263094d
            long r4 = r4 + r2
            r6.f263094d = r4
        L_0x0033:
            boolean r4 = r12.f245276i
            java.lang.String r9 = "env.appId"
            if (r4 == 0) goto L_0x0082
            gk0.c0 r10 = new gk0.c0
            r10.<init>(r12, r6, r7, r1)
            java.lang.String r2 = r7.getAppId()
            gy3.C87412m.m108593f(r2, r9)
            r1 = r7
            r3 = r6
            r4 = r12
            r5 = r10
            wq0.i r0 = r0.mo121495l(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0054
            r0.mo121451o(r7)
            goto L_0x00f5
        L_0x0054:
            zq0.r r0 = zq0.C91875g0.f263042b
            if (r0 != 0) goto L_0x005d
            zq0.m r0 = new zq0.m
            r0.<init>()
        L_0x005d:
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "env.context"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = r7.getAppId()
            gy3.C87412m.m108593f(r2, r9)
            if (r8 == 0) goto L_0x0076
            te3.rw3 r3 = r8.f252926a
            if (r3 == 0) goto L_0x0076
            java.lang.String r3 = r3.f259825g
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            if (r3 != 0) goto L_0x007b
            java.lang.String r3 = ""
        L_0x007b:
            r4 = r6
            r5 = r12
            r6 = r10
            r0.mo125725e(r1, r2, r3, r4, r5, r6)
            goto L_0x00f5
        L_0x0082:
            boolean r0 = r12.f245278n
            if (r0 == 0) goto L_0x008f
            if (r6 != 0) goto L_0x0089
            goto L_0x0097
        L_0x0089:
            long r4 = r6.f263097g
            long r4 = r4 + r2
            r6.f263097g = r4
            goto L_0x0097
        L_0x008f:
            if (r6 != 0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            long r4 = r6.f263098h
            long r4 = r4 + r2
            r6.f263098h = r4
        L_0x0097:
            java.lang.String r0 = r7.getAppId()
            gy3.C87412m.m108593f(r0, r9)
            r6.getClass()
            r6.f263089A = r0
            java.lang.String r0 = r12.f245271d
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            java.lang.String r2 = "getMD5String(MD5Util.get…String(phoneItem.mobile))"
            gy3.C87412m.m108593f(r0, r2)
            r6.f263090B = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.plugin.appbrand.jsapi.p$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.p$a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "ok"
            r2.<init>((java.lang.String) r5, (java.lang.Object[]) r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = r12.f245273f
            java.lang.String r6 = "encryptedData"
            r4.put(r6, r5)
            java.lang.String r5 = r12.f245274g
            java.lang.String r6 = "iv"
            r4.put(r6, r5)
            java.lang.String r5 = r12.f245275h
            java.lang.String r6 = "cloud_id"
            r4.put(r6, r5)
            java.lang.String r5 = r12.f245280p
            java.lang.String r6 = "data"
            r4.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f242316a
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.putAll(r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r0[r3] = r2
            r1.mo72093c(r0)
            zq0.w r0 = zq0.C91919w.f263170a
            r0.mo125750e(r12)
        L_0x00f5:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gk0.C87236d0.invoke(java.lang.Object):java.lang.Object");
    }
}
