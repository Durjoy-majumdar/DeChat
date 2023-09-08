package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SessionConfigChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig */
public final class HellSessionCloudConfig {

    /* renamed from: b */
    public static HellSessionCloudConfig f345913b;

    /* renamed from: a */
    public final IListener f345914a = new IListener<SessionConfigChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1791753826;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r20) {
            /*
                r19 = this;
                r0 = r20
                com.tencent.mm.autogen.events.SessionConfigChangeEvent r0 = (com.tencent.p014mm.autogen.events.SessionConfigChangeEvent) r0
                r1 = 0
                if (r0 != 0) goto L_0x0009
                goto L_0x021a
            L_0x0009:
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r4 = r0.f343596d
                java.lang.String r4 = r4.f343597a
                r3[r1] = r4
                java.lang.String r4 = "HABBYGE-MALI.HellSessionCloudConfig"
                java.lang.String r5 = "mSessionConfigChangeEvent callback json: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r5 = r0.f343596d
                java.lang.Boolean r5 = r5.f343599c
                r3[r1] = r5
                java.lang.String r5 = "mSessionConfigChangeEvent callback isDel: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r5 = r0.f343596d
                java.lang.Boolean r5 = r5.f343598b
                r3[r1] = r5
                java.lang.String r5 = "mSessionConfigChangeEvent callback: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r3 = r0.f343596d
                java.lang.Boolean r3 = r3.f343599c
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0051
                te3.l14 r0 = ba1.C113151b.m154818a()
                if (r0 != 0) goto L_0x0048
                te3.l14 r0 = new te3.l14
                r0.<init>()
            L_0x0048:
                r0.f354092d = r2
                r0.f354093e = r1
                ba1.C113151b.m154819b(r0)
                goto L_0x021a
            L_0x0051:
                te3.l14 r3 = new te3.l14
                r3.<init>()
                r3.f354092d = r1
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r5 = r0.f343596d
                java.lang.Boolean r5 = r5.f343598b
                boolean r5 = r5.booleanValue()
                r3.f354093e = r5
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r5 = r0.f343596d
                java.lang.String r5 = r5.f343597a
                if (r5 == 0) goto L_0x021a
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x0070
                goto L_0x021a
            L_0x0070:
                r5 = r19
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig r6 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.this
                com.tencent.mm.autogen.events.SessionConfigChangeEvent$a r0 = r0.f343596d
                java.lang.String r0 = r0.f343597a
                r6.getClass()
                java.lang.String r6 = "sid"
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01d4 }
                r8.<init>(r0)     // Catch:{ JSONException -> 0x01d4 }
                java.lang.String r0 = "sessions"
                org.json.JSONArray r0 = r8.optJSONArray(r0)     // Catch:{ JSONException -> 0x01d4 }
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                int r11 = r0.length()
                r12 = 0
                r13 = 0
            L_0x009f:
                if (r12 >= r11) goto L_0x01ce
                org.json.JSONObject r14 = r0.optJSONObject(r12)     // Catch:{ Exception -> 0x01c3 }
                if (r14 != 0) goto L_0x00ab
                r16 = r0
                goto L_0x01b9
            L_0x00ab:
                java.lang.String r15 = r14.optString(r6)     // Catch:{ Exception -> 0x01c3 }
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a     // Catch:{ Exception -> 0x01c3 }
                boolean r7 = r7.mo175251h(r15)     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r2 = "sessionParams"
                java.lang.String r1 = "expect"
                r16 = r0
                java.lang.String r0 = "pageName"
                java.lang.String r5 = "prePage"
                if (r7 == 0) goto L_0x00f3
                te3.k14 r7 = new te3.k14     // Catch:{ Exception -> 0x01c3 }
                r7.<init>()     // Catch:{ Exception -> 0x01c3 }
                r7.f354065d = r15     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r5 = r14.optString(r5)     // Catch:{ Exception -> 0x01c3 }
                r7.f354066e = r5     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x01c3 }
                r7.f354067f = r0     // Catch:{ Exception -> 0x01c3 }
                org.json.JSONArray r0 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x01c3 }
                if (r0 == 0) goto L_0x00ee
                int r2 = r0.length()     // Catch:{ Exception -> 0x01c3 }
                if (r2 <= 0) goto L_0x00ee
                r2 = 0
                org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x01c3 }
                r7.f354068g = r0     // Catch:{ Exception -> 0x01c3 }
            L_0x00ee:
                r9.add(r7)     // Catch:{ Exception -> 0x01c3 }
                goto L_0x01b9
            L_0x00f3:
                gy3.C87412m.m108594g(r15, r6)     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r7 = "131"
                boolean r7 = gy3.C87412m.m108589b(r7, r15)     // Catch:{ Exception -> 0x01c3 }
                if (r7 == 0) goto L_0x0135
                te3.m14 r13 = new te3.m14     // Catch:{ Exception -> 0x01c3 }
                r13.<init>()     // Catch:{ Exception -> 0x01c3 }
                r13.f354129d = r15     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r5 = r14.optString(r5)     // Catch:{ Exception -> 0x01c3 }
                r13.f354130e = r5     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x01c3 }
                r13.f354131f = r0     // Catch:{ Exception -> 0x01c3 }
                org.json.JSONArray r0 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x01c3 }
                if (r0 == 0) goto L_0x01b9
                int r2 = r0.length()     // Catch:{ Exception -> 0x01c3 }
                r5 = 1
                if (r2 <= r5) goto L_0x01b9
                r2 = 0
                org.json.JSONObject r7 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x01c3 }
                org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r2 = r7.optString(r1)     // Catch:{ Exception -> 0x01c3 }
                r13.f354132g = r2     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x01c3 }
                r13.f354133h = r0     // Catch:{ Exception -> 0x01c3 }
                goto L_0x01b9
            L_0x0135:
                org.json.JSONArray r2 = r14.optJSONArray(r2)     // Catch:{ Exception -> 0x01c3 }
                if (r2 == 0) goto L_0x01a3
                int r7 = r2.length()     // Catch:{ Exception -> 0x01c3 }
                if (r7 <= 0) goto L_0x01a3
                te3.p14 r7 = new te3.p14     // Catch:{ Exception -> 0x01c3 }
                r7.<init>()     // Catch:{ Exception -> 0x01c3 }
                r7.f354214d = r15     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r5 = r14.optString(r5)     // Catch:{ Exception -> 0x01c3 }
                r7.f354215e = r5     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x01c3 }
                r7.f354216f = r0     // Catch:{ Exception -> 0x01c3 }
                int r0 = r2.length()     // Catch:{ Exception -> 0x01c3 }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c3 }
                r5.<init>()     // Catch:{ Exception -> 0x01c3 }
                r14 = 0
            L_0x015e:
                if (r14 >= r0) goto L_0x0194
                org.json.JSONObject r15 = r2.optJSONObject(r14)     // Catch:{ Exception -> 0x01c3 }
                if (r15 != 0) goto L_0x016b
                r17 = r0
                r18 = r2
                goto L_0x018d
            L_0x016b:
                r17 = r0
                te3.o14 r0 = new te3.o14     // Catch:{ Exception -> 0x01c3 }
                r0.<init>()     // Catch:{ Exception -> 0x01c3 }
                r18 = r2
                java.lang.String r2 = "className"
                java.lang.String r2 = r15.optString(r2)     // Catch:{ Exception -> 0x01c3 }
                r0.f354156d = r2     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r2 = "dataPath"
                java.lang.String r2 = r15.optString(r2)     // Catch:{ Exception -> 0x01c3 }
                r0.f354157e = r2     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r2 = r15.optString(r1)     // Catch:{ Exception -> 0x01c3 }
                r0.f354158f = r2     // Catch:{ Exception -> 0x01c3 }
                r5.add(r0)     // Catch:{ Exception -> 0x01c3 }
            L_0x018d:
                int r14 = r14 + 1
                r0 = r17
                r2 = r18
                goto L_0x015e
            L_0x0194:
                boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x01c3 }
                if (r0 != 0) goto L_0x019f
                java.util.LinkedList<te3.o14> r0 = r7.f354217g     // Catch:{ Exception -> 0x01c3 }
                r0.addAll(r5)     // Catch:{ Exception -> 0x01c3 }
            L_0x019f:
                r10.add(r7)     // Catch:{ Exception -> 0x01c3 }
                goto L_0x01b9
            L_0x01a3:
                te3.n14 r1 = new te3.n14     // Catch:{ Exception -> 0x01c3 }
                r1.<init>()     // Catch:{ Exception -> 0x01c3 }
                r1.f354146d = r15     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r2 = r14.optString(r5)     // Catch:{ Exception -> 0x01c3 }
                r1.f354147e = r2     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x01c3 }
                r1.f354148f = r0     // Catch:{ Exception -> 0x01c3 }
                r8.add(r1)     // Catch:{ Exception -> 0x01c3 }
            L_0x01b9:
                int r12 = r12 + 1
                r5 = r19
                r0 = r16
                r1 = 0
                r2 = 1
                goto L_0x009f
            L_0x01c3:
                r0 = move-exception
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r1 = "SessionConfigJson parse2 crash"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r2)
                r1 = 0
                goto L_0x01dc
            L_0x01ce:
                op3.d r7 = op3.C117882j.m166286e(r8, r9, r13, r10)
                r1 = 0
                goto L_0x01dd
            L_0x01d4:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r5 = "SessionConfigJson parse1 crash"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r2)
            L_0x01dc:
                r7 = 0
            L_0x01dd:
                if (r7 == 0) goto L_0x021a
                int r0 = r7.mo182597g()
                if (r0 > 0) goto L_0x01e6
                goto L_0x021a
            L_0x01e6:
                java.util.LinkedList<te3.n14> r0 = r3.f354094f
                java.lang.Object r2 = r7.mo182596a(r1)
                java.util.Collection r2 = (java.util.Collection) r2
                r0.addAll(r2)
                java.util.LinkedList<te3.k14> r0 = r3.f354095g
                r1 = 1
                java.lang.Object r1 = r7.mo182596a(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r0.addAll(r1)
                r0 = 2
                java.lang.Object r0 = r7.mo182596a(r0)
                te3.m14 r0 = (te3.C118443m14) r0
                r3.f354096h = r0
                java.util.LinkedList<te3.p14> r0 = r3.f354097i
                r1 = 3
                java.lang.Object r1 = r7.mo182596a(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r0.addAll(r1)
                ba1.C113151b.m154819b(r3)
                java.lang.String r0 = "mSessionConfigChangeEvent callback: END"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            L_0x021a:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig.C1154071.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* renamed from: a */
    public static HellSessionCloudConfig m162211a() {
        if (f345913b == null) {
            synchronized (HellSessionCloudConfig.class) {
                if (f345913b == null) {
                    f345913b = new HellSessionCloudConfig();
                }
            }
        }
        return f345913b;
    }
}
