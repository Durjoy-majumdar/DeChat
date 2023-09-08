package ef2;

import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import sc0.C36652a;

/* renamed from: ef2.e */
public class C31573e extends C36652a {

    /* renamed from: l */
    public String f84376l = null;

    /* renamed from: m */
    public String f84377m = null;

    /* renamed from: n */
    public int f84378n = 0;

    public C31573e(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0118 A[Catch:{ Exception -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013d A[Catch:{ Exception -> 0x01b1 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo58201b() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "states"
            java.lang.String r3 = ","
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f97418a
            java.lang.String r4 = "MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg"
            r5 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "[parseXml] values == null "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return r5
        L_0x0014:
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r7 = r1.f97421d
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            r0[r5] = r7
            java.util.Map<java.lang.String, java.lang.String> r7 = r1.f97418a
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r0[r8] = r7
            java.lang.String r7 = "[parseXml] type:%s, values size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r0)
            java.lang.String r0 = r1.f97421d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02db
            java.lang.String r0 = r1.f97421d
            java.lang.String r7 = "NewXmlOpenIMFriReqAcceptedInWxWork"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x02db
            java.lang.String r0 = ".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.username"
            java.lang.String r7 = ".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid"
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.f97418a
            boolean r9 = r9.containsKey(r0)
            if (r9 == 0) goto L_0x005d
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.f97418a
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1.f84376l = r0
        L_0x005d:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f97418a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0073
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f97418a
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1.f84377m = r0
        L_0x0073:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f97418a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x008b
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f97418a
            java.lang.String r7 = ".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.status"
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            r1.f84378n = r0
        L_0x008b:
            r7 = 3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r9 = r1.f84376l
            r0[r5] = r9
            java.lang.String r9 = r1.f84377m
            r0[r8] = r9
            int r9 = r1.f84378n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r6] = r9
            java.lang.String r9 = "username:%s climsgid:%s status:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r0)
            java.lang.String r0 = r1.f84377m
            int r9 = r1.f84378n
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC
            f40.C86709a0.m107528h()
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            java.lang.String r12 = ""
            java.lang.Object r11 = r11.mo119685f(r10, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r5] = r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r13[r8] = r14
            java.lang.String r14 = "dealAddContactByWework() climsgid:%s state:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r14 = "svrids"
            if (r13 != 0) goto L_0x016a
            c30.g r13 = new c30.g     // Catch:{ Exception -> 0x01b1 }
            r13.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r11 = r13.optString(r14)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r13 = r13.optString(r2)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String[] r15 = r11.split(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String[] r6 = r13.split(r3)     // Catch:{ Exception -> 0x01b1 }
            if (r15 == 0) goto L_0x0110
            if (r6 == 0) goto L_0x0110
            r7 = 0
        L_0x00ef:
            int r5 = r15.length     // Catch:{ Exception -> 0x01b1 }
            if (r7 >= r5) goto L_0x0110
            r5 = r15[r7]     // Catch:{ Exception -> 0x01b1 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x01b1 }
            if (r5 == 0) goto L_0x010d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r5.<init>()     // Catch:{ Exception -> 0x01b1 }
            r5.append(r12)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r9)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b1 }
            r6[r7] = r5     // Catch:{ Exception -> 0x01b1 }
            r5 = 1
            goto L_0x0111
        L_0x010d:
            int r7 = r7 + 1
            goto L_0x00ef
        L_0x0110:
            r5 = 0
        L_0x0111:
            c30.g r7 = new c30.g     // Catch:{ Exception -> 0x01b1 }
            r7.<init>()     // Catch:{ Exception -> 0x01b1 }
            if (r5 != 0) goto L_0x013d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r5.<init>()     // Catch:{ Exception -> 0x01b1 }
            r5.append(r11)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r0)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r5.<init>()     // Catch:{ Exception -> 0x01b1 }
            r5.append(r13)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r9)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b1 }
            goto L_0x017f
        L_0x013d:
            int r5 = r6.length     // Catch:{ Exception -> 0x01b1 }
            r15 = r12
            r13 = 0
        L_0x0140:
            if (r13 >= r5) goto L_0x015e
            r8 = r6[r13]     // Catch:{ Exception -> 0x01b1 }
            r16 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r5.<init>()     // Catch:{ Exception -> 0x01b1 }
            r5.append(r15)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r8)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r15 = r5.toString()     // Catch:{ Exception -> 0x01b1 }
            int r13 = r13 + 1
            r5 = r16
            r8 = 1
            goto L_0x0140
        L_0x015e:
            int r5 = r15.length()     // Catch:{ Exception -> 0x01b1 }
            r6 = 1
            int r5 = r5 - r6
            r6 = 0
            java.lang.String r5 = r15.substring(r6, r5)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x017f
        L_0x016a:
            c30.g r7 = new c30.g     // Catch:{ Exception -> 0x01b1 }
            r7.<init>()     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r5.<init>()     // Catch:{ Exception -> 0x01b1 }
            r5.append(r12)     // Catch:{ Exception -> 0x01b1 }
            r5.append(r9)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b1 }
            r11 = r0
        L_0x017f:
            r7.put(r14, r11)     // Catch:{ Exception -> 0x01b1 }
            r7.put(r2, r5)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r5 = "dealAddContactByWework() result:%s"
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01b1 }
            r6 = 0
            r8[r6] = r0     // Catch:{ Exception -> 0x01b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x01b1 }
            r6 = 1
            r8[r6] = r0     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x01b1 }
            r6 = 2
            r8[r6] = r0     // Catch:{ Exception -> 0x01b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r8)     // Catch:{ Exception -> 0x01b1 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x01b1 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01b1 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x01b1 }
            r0.mo119677K(r10, r5)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x01c1
        L_0x01b1:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r6[r5] = r0
            java.lang.String r0 = "dealAddContactByWework() Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r6)
        L_0x01c1:
            java.lang.String r0 = r1.f84376l
            int r5 = r1.f84378n
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Object r7 = r7.mo119685f(r6, r12)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = 0
            r9[r8] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r10 = 1
            r9[r10] = r8
            java.lang.String r8 = "dealAddContactUsernameByWework() username:%s state:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r9 = "usernames"
            if (r8 != 0) goto L_0x0282
            c30.g r8 = new c30.g     // Catch:{ Exception -> 0x02ca }
            r8.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r7 = r8.optString(r9)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r8 = r8.optString(r2)     // Catch:{ Exception -> 0x02ca }
            java.lang.String[] r10 = r7.split(r3)     // Catch:{ Exception -> 0x02ca }
            java.lang.String[] r11 = r8.split(r3)     // Catch:{ Exception -> 0x02ca }
            if (r10 == 0) goto L_0x022e
            if (r11 == 0) goto L_0x022e
            r13 = 0
        L_0x020d:
            int r14 = r10.length     // Catch:{ Exception -> 0x02ca }
            if (r13 >= r14) goto L_0x022e
            r14 = r10[r13]     // Catch:{ Exception -> 0x02ca }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r14)     // Catch:{ Exception -> 0x02ca }
            if (r14 == 0) goto L_0x022b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
            r10.<init>()     // Catch:{ Exception -> 0x02ca }
            r10.append(r12)     // Catch:{ Exception -> 0x02ca }
            r10.append(r5)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x02ca }
            r11[r13] = r10     // Catch:{ Exception -> 0x02ca }
            r10 = 1
            goto L_0x022f
        L_0x022b:
            int r13 = r13 + 1
            goto L_0x020d
        L_0x022e:
            r10 = 0
        L_0x022f:
            c30.g r13 = new c30.g     // Catch:{ Exception -> 0x02ca }
            r13.<init>()     // Catch:{ Exception -> 0x02ca }
            if (r10 != 0) goto L_0x025b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
            r10.<init>()     // Catch:{ Exception -> 0x02ca }
            r10.append(r7)     // Catch:{ Exception -> 0x02ca }
            r10.append(r3)     // Catch:{ Exception -> 0x02ca }
            r10.append(r0)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x02ca }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
            r10.<init>()     // Catch:{ Exception -> 0x02ca }
            r10.append(r8)     // Catch:{ Exception -> 0x02ca }
            r10.append(r3)     // Catch:{ Exception -> 0x02ca }
            r10.append(r5)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x02ca }
            goto L_0x0297
        L_0x025b:
            int r8 = r11.length     // Catch:{ Exception -> 0x02ca }
            r10 = 0
        L_0x025d:
            if (r10 >= r8) goto L_0x0276
            r14 = r11[r10]     // Catch:{ Exception -> 0x02ca }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
            r15.<init>()     // Catch:{ Exception -> 0x02ca }
            r15.append(r12)     // Catch:{ Exception -> 0x02ca }
            r15.append(r14)     // Catch:{ Exception -> 0x02ca }
            r15.append(r3)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r12 = r15.toString()     // Catch:{ Exception -> 0x02ca }
            int r10 = r10 + 1
            goto L_0x025d
        L_0x0276:
            int r3 = r12.length()     // Catch:{ Exception -> 0x02ca }
            r8 = 1
            int r3 = r3 - r8
            r8 = 0
            java.lang.String r3 = r12.substring(r8, r3)     // Catch:{ Exception -> 0x02ca }
            goto L_0x0297
        L_0x0282:
            c30.g r13 = new c30.g     // Catch:{ Exception -> 0x02ca }
            r13.<init>()     // Catch:{ Exception -> 0x02ca }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
            r3.<init>()     // Catch:{ Exception -> 0x02ca }
            r3.append(r12)     // Catch:{ Exception -> 0x02ca }
            r3.append(r5)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02ca }
            r7 = r0
        L_0x0297:
            r13.put(r9, r7)     // Catch:{ Exception -> 0x02ca }
            r13.put(r2, r3)     // Catch:{ Exception -> 0x02ca }
            java.lang.String r2 = "dealAddContactUsernameByWework() result:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02ca }
            r7 = 0
            r3[r7] = r0     // Catch:{ Exception -> 0x02ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x02ca }
            r5 = 1
            r3[r5] = r0     // Catch:{ Exception -> 0x02ca }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x02ca }
            r5 = 2
            r3[r5] = r0     // Catch:{ Exception -> 0x02ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)     // Catch:{ Exception -> 0x02ca }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x02ca }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x02ca }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x02ca }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x02ca }
            r0.mo119677K(r6, r2)     // Catch:{ Exception -> 0x02ca }
            r2 = 1
            goto L_0x02da
        L_0x02ca:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r3[r5] = r0
            java.lang.String r0 = "dealAddContactUsernameByWework() Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r3)
        L_0x02da:
            return r2
        L_0x02db:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f97421d
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "[parseXml] type err :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ef2.C31573e.mo58201b():boolean");
    }

    public C31573e(Map<String, String> map) {
        super(map);
    }
}
