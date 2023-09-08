package ak1;

import gy3.C45983e0;
import q31.C118148a;

/* renamed from: ak1.u */
public final class C54114u implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C45983e0 f151885a;

    public C54114u(C45983e0 e0Var) {
        this.f151885a = e0Var;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r11 > r9) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        if (r11 > r9) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r7 = r11 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cf, code lost:
        if (r11 > r9) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r11 > r9) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r7 = r11 - r9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo37b(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "cgi_req"
            boolean r0 = u24.C90599h.m113509b(r14, r0)
            java.lang.String r1 = "live_ref_page"
            java.lang.String r2 = "last_click_live_view_id"
            java.lang.String r3 = "live_watch_duration_delta"
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x00aa
            long r9 = ak1.C54116w.f151890m1
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0024
            gy3.e0 r14 = r13.f151885a
            long r11 = r14.f124000d
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x0024
        L_0x0021:
            long r7 = r11 - r9
            goto L_0x0033
        L_0x0024:
            long r9 = ak1.C54116w.f151894q1
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0033
            gy3.e0 r14 = r13.f151885a
            long r11 = r14.f124000d
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x0033
            goto L_0x0021
        L_0x0033:
            int r14 = ak1.C54116w.f151892o1
            int r14 = r14 + r6
            ak1.C54116w.f151892o1 = r14
            gy3.e0 r14 = r13.f151885a
            long r9 = r14.f124000d
            ak1.C54116w.f151890m1 = r9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "addDynamicParams   get_live_msg_cgi_req_seq "
            r14.append(r0)
            int r0 = ak1.C54116w.f151892o1
            r14.append(r0)
            java.lang.String r0 = ", "
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            rx3.l[] r14 = new rx3.C13604l[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            rx3.l r7 = new rx3.l
            r7.<init>(r3, r5)
            r14[r4] = r7
            int r3 = ak1.C54116w.f151892o1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "get_live_msg_cgi_req_seq"
            r4.<init>(r5, r3)
            r14[r6] = r4
            java.util.Map r14 = sx3.C90364q0.m113148g(r14)
            java.lang.String r3 = ak1.C54116w.f151895r1
            boolean r3 = u24.C90599h.m113511d(r3)
            if (r3 != 0) goto L_0x0089
            java.lang.String r0 = ak1.C54116w.f151895r1
            r14.put(r2, r0)
            goto L_0x009f
        L_0x0089:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  cgi_req  last_click_live_view_id is null,  get_live_msg_cgi_req_seq  "
            r2.append(r3)
            int r3 = ak1.C54116w.f151892o1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x009f:
            java.lang.Object r0 = ak1.C54116w.f151896s1
            if (r0 == 0) goto L_0x0116
            gy3.C87412m.m108591d(r0)
            r14.put(r1, r0)
            goto L_0x0116
        L_0x00aa:
            java.lang.String r0 = "cgi_resp"
            boolean r14 = u24.C90599h.m113509b(r14, r0)
            if (r14 == 0) goto L_0x0115
            long r9 = ak1.C54116w.f151891n1
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x00c3
            gy3.e0 r14 = r13.f151885a
            long r11 = r14.f124000d
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x00c3
        L_0x00c0:
            long r7 = r11 - r9
            goto L_0x00d2
        L_0x00c3:
            long r9 = ak1.C54116w.f151894q1
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x00d2
            gy3.e0 r14 = r13.f151885a
            long r11 = r14.f124000d
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x00d2
            goto L_0x00c0
        L_0x00d2:
            int r14 = ak1.C54116w.f151893p1
            int r14 = r14 + r6
            ak1.C54116w.f151893p1 = r14
            gy3.e0 r14 = r13.f151885a
            long r9 = r14.f124000d
            ak1.C54116w.f151891n1 = r9
            rx3.l[] r14 = new rx3.C13604l[r5]
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            rx3.l r5 = new rx3.l
            r5.<init>(r3, r0)
            r14[r4] = r5
            int r0 = ak1.C54116w.f151893p1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "get_live_msg_cgi_resp_seq"
            r3.<init>(r4, r0)
            r14[r6] = r3
            java.util.Map r14 = sx3.C90364q0.m113148g(r14)
            java.lang.String r0 = ak1.C54116w.f151895r1
            boolean r0 = u24.C90599h.m113511d(r0)
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = ak1.C54116w.f151895r1
            r14.put(r2, r0)
        L_0x010a:
            java.lang.Object r0 = ak1.C54116w.f151896s1
            if (r0 == 0) goto L_0x0116
            gy3.C87412m.m108591d(r0)
            r14.put(r1, r0)
            goto L_0x0116
        L_0x0115:
            r14 = 0
        L_0x0116:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54114u.mo37b(java.lang.String):java.util.Map");
    }
}
