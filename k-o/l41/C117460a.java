package l41;

import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import n31.C117600a;
import u24.C90599h;

/* renamed from: l41.a */
public class C117460a implements C117600a {

    /* renamed from: a */
    public int f351528a = 7118;

    /* renamed from: b */
    public List<Integer> f351529b = new ArrayList();

    public C117460a() {
        Class cls = C32735h.class;
        try {
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_data_report_logid_black_list, "");
            if (!C90599h.m113511d(Y60)) {
                String[] split = Y60.split(",");
                if (split != null && split.length > 0) {
                    for (String parseInt : split) {
                        this.f351529b.add(Integer.valueOf(Integer.parseInt(parseInt)));
                    }
                }
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_smc_max_log_item_size, 0);
                if (Qe > 0) {
                    this.f351528a = (Qe * 1024) - 50;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        r9 = (java.util.Map) r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo182170a(long r17, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20, p31.C117924b r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r19
            r3 = r20
            r4 = r21
            boolean r0 = u24.C90599h.m113511d(r19)
            r5 = 0
            if (r0 != 0) goto L_0x025e
            if (r4 != 0) goto L_0x0013
            goto L_0x025e
        L_0x0013:
            r7 = 1
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 1
        L_0x0018:
            java.lang.String r14 = "Amoeba.MMDataReportRouter"
            java.lang.String r15 = ";"
            java.lang.String r13 = ","
            if (r0 == 0) goto L_0x00d6
            int r11 = r1.f351528a
            if (r8 < r11) goto L_0x0026
            goto L_0x00d6
        L_0x0026:
            if (r0 == 0) goto L_0x00d5
            boolean r3 = u24.C90599h.m113511d(r19)
            if (r3 != 0) goto L_0x00d5
            boolean r3 = u24.C90599h.m113511d(r0)
            if (r3 != 0) goto L_0x00d5
            java.util.List<java.lang.Integer> r3 = r1.f351529b
            int r6 = r4.f352463a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x0046
            goto L_0x00d5
        L_0x0046:
            boolean r3 = r4.f352464b
            if (r3 == 0) goto L_0x009e
            int r3 = r4.f352463a
            l41.a$$a r6 = new l41.a$$a
            r6.<init>(r4, r0)
            ob0.c$b r7 = new ob0.c$b
            r7.<init>()
            te3.mn3 r8 = new te3.mn3
            r8.<init>()
            r7.f127066a = r8
            te3.nn3 r8 = new te3.nn3
            r8.<init>()
            r7.f127067b = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/rtkvreport"
            r7.f127068c = r8
            r8 = 716(0x2cc, float:1.003E-42)
            r7.f127069d = r8
            ob0.c r7 = r7.mo72403a()
            ob0.c$c r8 = r7.f127055a
            pe3.a r8 = r8.f127080a
            te3.mn3 r8 = (te3.C118444mn3) r8
            java.lang.String r9 = qe3.C89625d.f257837c
            r8.f354136d = r9
            java.lang.String r9 = qe3.C89625d.f257836b
            r8.f354137e = r9
            java.lang.String r9 = qe3.C89625d.f257839e
            r8.f354138f = r9
            java.lang.String r9 = p156gj.C87200o.f252873f
            r8.f354139g = r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r8.f354140h = r9
            r8.f354141i = r3
            r8.f354142j = r0
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            l41.a$$b r3 = new l41.a$$b
            r3.<init>(r9, r8, r6)
            ob0.C89144l0.m111429e(r7, r3, r5)
            r6 = r13
            goto L_0x00ab
        L_0x009e:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r9 = r4.f352463a
            r11 = 0
            r12 = 0
            r3 = 1
            r10 = r0
            r6 = r13
            r13 = r3
            r8.mo160134j(r9, r10, r11, r12, r13)
        L_0x00ab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "[route] eventId : "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = ", routeRule : "
            r3.append(r2)
            int r2 = r4.f352463a
            r3.append(r2)
            java.lang.String r2 = ", reportStr : "
            r3.append(r2)
            java.lang.String r0 = r0.replace(r15, r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x00d5:
            return r5
        L_0x00d6:
            r11 = r13
            if (r0 == 0) goto L_0x01c0
            int r0 = r1.f351528a
            if (r8 < r0) goto L_0x01c0
            java.lang.String r0 = "ParamsUtils"
            if (r9 != 0) goto L_0x0163
            if (r3 == 0) goto L_0x0160
            int r9 = r20.size()
            if (r9 > 0) goto L_0x00eb
            goto L_0x0160
        L_0x00eb:
            java.lang.String r9 = "udf_kv"
            java.lang.Object r9 = r3.get(r9)
            if (r9 == 0) goto L_0x0160
            boolean r10 = r9 instanceof java.util.Map
            if (r10 != 0) goto L_0x00f9
            goto L_0x0160
        L_0x00f9:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "cur_page"
            java.lang.Object r10 = r9.get(r10)
            if (r10 == 0) goto L_0x0160
            boolean r12 = r10 instanceof java.util.Map
            if (r12 != 0) goto L_0x0108
            goto L_0x0160
        L_0x0108:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            if (r10 != 0) goto L_0x0115
            goto L_0x0160
        L_0x0115:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0160
            java.lang.Object r12 = r10.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            if (r12 != 0) goto L_0x0124
            goto L_0x0115
        L_0x0124:
            java.lang.Object r13 = r12.getValue()
            java.lang.Object r5 = r12.getKey()
            java.lang.Object r5 = r9.get(r5)
            if (r13 == 0) goto L_0x015e
            if (r5 == 0) goto L_0x015e
            boolean r5 = r13.equals(r5)
            if (r5 != 0) goto L_0x013b
            goto L_0x015e
        L_0x013b:
            r10.remove()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[removeSamePageParams] key : "
            r5.append(r6)
            java.lang.Object r6 = r12.getKey()
            r5.append(r6)
            java.lang.String r6 = ", curPageParam : "
            r5.append(r6)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x015e:
            r5 = 0
            goto L_0x0115
        L_0x0160:
            r6 = 0
            r9 = 1
            goto L_0x01be
        L_0x0163:
            if (r3 == 0) goto L_0x019c
            int r5 = r20.size()
            if (r5 > 0) goto L_0x016c
            goto L_0x019c
        L_0x016c:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r6 = 0
            r10 = 0
            r5[r10] = r6
            m41.b r12 = new m41.b
            r12.<init>(r5)
            m41.C34464d.m40359b(r3, r12)
            r5 = r5[r10]
            if (r5 != 0) goto L_0x017f
            goto L_0x019d
        L_0x017f:
            m41.c r10 = new m41.c
            r10.<init>(r5)
            m41.C34464d.m40359b(r3, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "[compressMaxLengthParams] maxLengthParam : "
            r10.append(r12)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            goto L_0x019d
        L_0x019c:
            r6 = 0
        L_0x019d:
            int r0 = r4.f352463a
            boolean r5 = k41.C117389a.m165527a()
            if (r5 != 0) goto L_0x01a6
            goto L_0x01be
        L_0x01a6:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r10 = "8"
            r5.add(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.add(r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 24504(0x5fb8, float:3.4337E-41)
            r0.mo160137l(r10, r5)
        L_0x01be:
            r10 = 0
            goto L_0x01c1
        L_0x01c0:
            r6 = 0
        L_0x01c1:
            java.lang.String r5 = ""
            java.lang.Object r0 = m41.C34464d.m40358a(r20)     // Catch:{ Exception -> 0x01d5 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = r0.replace(r11, r15)     // Catch:{ Exception -> 0x01d5 }
            r5 = r0
            goto L_0x01ee
        L_0x01d5:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[onDataReport] throw Exception e : "
            r12.append(r13)
            java.lang.String r0 = r0.getMessage()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x01ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            java.lang.String r12 = java.lang.String.valueOf(r17)
            r0.add(r12)
            r0.add(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r12 = 0
        L_0x0206:
            int r13 = r0.size()
            if (r12 >= r13) goto L_0x022d
            int r13 = r0.size()
            int r13 = r13 + -1
            if (r12 >= r13) goto L_0x0221
            java.lang.Object r13 = r0.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            r5.append(r13)
            r5.append(r11)
            goto L_0x022a
        L_0x0221:
            java.lang.Object r13 = r0.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            r5.append(r13)
        L_0x022a:
            int r12 = r12 + 1
            goto L_0x0206
        L_0x022d:
            java.lang.String r0 = r5.toString()
            if (r0 == 0) goto L_0x025b
            if (r10 == 0) goto L_0x0254
            java.lang.Class<h81.f> r5 = h81.C87460f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.f r5 = (h81.C87460f) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r12 = r4.f352463a
            r8.append(r12)
            r8.append(r11)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r5.a80(r8)
        L_0x0254:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r0.getBytes(r5)
            int r8 = r5.length
        L_0x025b:
            r5 = 0
            goto L_0x0018
        L_0x025e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.C117460a.mo182170a(long, java.lang.String, java.util.Map, p31.b):boolean");
    }
}
