package el0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

/* renamed from: el0.a */
public final class C7735a extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 867;
    public static final String NAME = "getDeviceInfo";

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0056, code lost:
        r0 = (sp0.C90272a) r11.mo109671p(sp0.C90272a.class);
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r11, org.json.JSONObject r12, int r13) {
        /*
            r10 = this;
            java.lang.Class<hy.z> r0 = p166hy.C60229z.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            hy.z r1 = (p166hy.C60229z) r1
            java.lang.String r1 = r1.mo85224r4()
            di3.d r2 = di3.C86312j.m106911c(r0)
            hy.z r2 = (p166hy.C60229z) r2
            java.lang.String r2 = r2.d00()
            java.lang.String r3 = "MicroMsg.AppBrand.JsApiGetDeviceInfo"
            if (r12 == 0) goto L_0x0048
            java.lang.String r4 = "waidPkg"
            java.lang.String r12 = r12.optString(r4)
            java.lang.Class<hy.u0> r4 = p166hy.C8831u0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            hy.u0 r4 = (p166hy.C8831u0) r4
            java.lang.String r4 = r4.mo9674ba(r12)
            java.lang.String r5 = "getService(IWaidHelperSe…java).getAppWaid(waidPkg)"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "waidPkg="
            r5.append(r6)
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            goto L_0x004a
        L_0x0048:
            java.lang.String r4 = ""
        L_0x004a:
            di3.d r12 = di3.C86312j.m106911c(r0)
            hy.z r12 = (p166hy.C60229z) r12
            java.lang.String r12 = r12.Uc0()
            if (r11 == 0) goto L_0x0063
            java.lang.Class<sp0.a> r0 = sp0.C90272a.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r11.mo109671p(r0)
            sp0.a r0 = (sp0.C90272a) r0
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r0.f259120B
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getDeviceInfo, oaid:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", imei:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", waid:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ua:"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r9 = 0
            r7[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1896(0x768, float:2.657E-42)
            r7 = 20
            r3.mo175911u(r5, r7)
            r3 = 5
            rx3.l[] r3 = new rx3.C13604l[r3]
            rx3.l r5 = new rx3.l
            java.lang.String r7 = "oaid"
            r5.<init>(r7, r1)
            r3[r9] = r5
            rx3.l r1 = new rx3.l
            java.lang.String r5 = "imei"
            r1.<init>(r5, r2)
            r3[r6] = r1
            r1 = 2
            rx3.l r2 = new rx3.l
            java.lang.String r5 = "waid"
            r2.<init>(r5, r4)
            r3[r1] = r2
            r1 = 3
            rx3.l r2 = new rx3.l
            java.lang.String r4 = "devIdInfo"
            r2.<init>(r4, r12)
            r3[r1] = r2
            r12 = 4
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "ua"
            r1.<init>(r2, r0)
            r3[r12] = r1
            java.util.Map r12 = sx3.C90364q0.m113147f(r3)
            if (r11 == 0) goto L_0x00ed
            java.lang.String r0 = "ok"
            java.lang.String r12 = r10.mo115112m(r0, r12)
            r11.mo109647a(r13, r12)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el0.C7735a.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
