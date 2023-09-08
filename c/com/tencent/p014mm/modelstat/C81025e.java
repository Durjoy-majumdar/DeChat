package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ConfigFile;
import ob0.C11385n;
import ob0.C117747y;
import te3.C48934c02;

/* renamed from: com.tencent.mm.modelstat.e */
public class C81025e implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ConfigFile f237994d;

    /* renamed from: e */
    public final /* synthetic */ String f237995e;

    /* renamed from: f */
    public final /* synthetic */ C81016b f237996f;

    /* renamed from: com.tencent.mm.modelstat.e$a */
    public class C81026a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C48934c02 f237997d;

        public C81026a(C48934c02 c022) {
            this.f237997d = c022;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Integer] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                com.tencent.mm.modelstat.e r0 = com.tencent.p014mm.modelstat.C81025e.this
                com.tencent.mm.sdk.storage.ConfigFile r0 = r0.f237994d
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                java.lang.String r4 = "LAST_UPDATE_CONFIG"
                r0.saveValue((java.lang.String) r4, (long) r2)
                te3.c02 r0 = r1.f237997d
                pe3.b r2 = r0.f131423e
                r3 = 0
                r4 = 2
                java.lang.String r5 = "MicroMsg.ClickFlowStatReceiver"
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L_0x00f5
                byte[] r8 = r2.f257327a
                int r8 = r8.length
                if (r8 <= 0) goto L_0x00f5
                pe3.b r0 = r0.f131424f
                if (r0 == 0) goto L_0x00f5
                byte[] r0 = r0.f257327a
                int r0 = r0.length
                if (r0 > 0) goto L_0x002b
                goto L_0x00f5
            L_0x002b:
                kj2.d r8 = kj2.C117407d.INSTANCE
                r9 = 346(0x15a, double:1.71E-321)
                r11 = 3
                r13 = 1
                r15 = 0
                r8.idkeyStat(r9, r11, r13, r15)
                te3.c02 r0 = r1.f237997d
                pe3.b r0 = r0.f131424f
                byte[] r0 = r0.f257327a
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r0)
                com.tencent.mm.modelstat.e r0 = com.tencent.p014mm.modelstat.C81025e.this
                com.tencent.mm.sdk.storage.ConfigFile r0 = r0.f237994d
                java.lang.String r8 = "versionBuffer"
                java.lang.String r9 = r0.getValue(r8)
                com.tencent.mm.modelstat.e r0 = com.tencent.p014mm.modelstat.C81025e.this
                com.tencent.mm.sdk.storage.ConfigFile r0 = r0.f237994d
                r0.saveValue((java.lang.String) r8, (java.lang.String) r2)
                te3.c02 r0 = r1.f237997d
                pe3.b r8 = r0.f131423e
                java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0066 }
                byte[] r10 = r8.f257327a     // Catch:{ Exception -> 0x0066 }
                byte[] r10 = p823sg.C90197s.m112891c(r10)     // Catch:{ Exception -> 0x0066 }
                java.lang.String r11 = "UTF-8"
                r0.<init>(r10, r11)     // Catch:{ Exception -> 0x0066 }
                r3 = r0
                goto L_0x0088
            L_0x0066:
                r0 = move-exception
                r10 = 3
                java.lang.Object[] r10 = new java.lang.Object[r10]
                if (r8 != 0) goto L_0x006e
                r8 = 0
                goto L_0x0071
            L_0x006e:
                byte[] r8 = r8.f257327a
                int r8 = r8.length
            L_0x0071:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r10[r7] = r8
                java.lang.String r8 = r0.getMessage()
                r10[r6] = r8
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r10[r4] = r0
                java.lang.String r0 = "decompress failed, configString length %d, msg:%s  [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r10)
            L_0x0088:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L_0x009c
                kj2.d r10 = kj2.C117407d.INSTANCE
                r11 = 346(0x15a, double:1.71E-321)
                r13 = 2
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)
                return
            L_0x009c:
                com.tencent.mm.modelstat.b$b r0 = com.tencent.p014mm.modelstat.C81016b.C81019b.m98940a(r3)     // Catch:{ Exception -> 0x00b9 }
                com.tencent.mm.modelstat.e r8 = com.tencent.p014mm.modelstat.C81025e.this     // Catch:{ Exception -> 0x00b9 }
                java.lang.String r8 = r8.f237995e     // Catch:{ Exception -> 0x00b9 }
                byte[] r10 = r3.getBytes()     // Catch:{ Exception -> 0x00b9 }
                byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00b9 }
                int r3 = r3.length     // Catch:{ Exception -> 0x00b9 }
                com.tencent.p014mm.vfs.C86013q1.m106438T(r8, r10, r7, r3)     // Catch:{ Exception -> 0x00b9 }
                com.tencent.mm.modelstat.e r3 = com.tencent.p014mm.modelstat.C81025e.this     // Catch:{ Exception -> 0x00b9 }
                com.tencent.mm.modelstat.b r3 = r3.f237996f     // Catch:{ Exception -> 0x00b9 }
                r3.mo112889d(r0)     // Catch:{ Exception -> 0x00b9 }
                r0 = 1
                goto L_0x00cf
            L_0x00b9:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r4 = r0.getMessage()
                r3[r7] = r4
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r3[r6] = r0
                java.lang.String r0 = "readReportConfig failed :%s  [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r3)
                r0 = 0
            L_0x00cf:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x00f4
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                r2[r7] = r3
                java.lang.String r3 = "idKeyStat, configOK:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
                kj2.d r6 = kj2.C117407d.INSTANCE
                r7 = 346(0x15a, double:1.71E-321)
                if (r0 == 0) goto L_0x00eb
                r2 = 0
                goto L_0x00ed
            L_0x00eb:
                r2 = 1
            L_0x00ed:
                r9 = r2
                r11 = 1
                r13 = 0
                r6.idkeyStat(r7, r9, r11, r13)
            L_0x00f4:
                return
            L_0x00f5:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                if (r2 != 0) goto L_0x00fb
                r2 = r3
                goto L_0x0102
            L_0x00fb:
                byte[] r2 = r2.f257327a
                int r2 = r2.length
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x0102:
                r0[r7] = r2
                te3.c02 r2 = r1.f237997d
                pe3.b r2 = r2.f131424f
                if (r2 != 0) goto L_0x010b
                goto L_0x0112
            L_0x010b:
                byte[] r2 = r2.f257327a
                int r2 = r2.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            L_0x0112:
                r0[r6] = r3
                java.lang.String r2 = "OnSceneEnd NetSceneUpdateEventConfig failed, eventsampleconf:%s, versionbuffer:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C81025e.C81026a.run():void");
        }
    }

    public C81025e(C81016b bVar, ConfigFile configFile, String str) {
        this.f237996f = bVar;
        this.f237994d = configFile;
        this.f237995e = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 1126 && i == 0 && i2 == 0) {
            C48934c02 c022 = (C48934c02) ((C40375m) yVar).f108502d.f127056b.f127083a;
            if (c022 == null) {
                Log.m105920e("MicroMsg.ClickFlowStatReceiver", "NetSceneUpdateEventConfig onSceneEnd resp is null");
            } else {
                this.f237996f.f237961a.post(new C81026a(c022));
            }
        }
    }
}
