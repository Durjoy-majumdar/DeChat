package y02;

import a12.C27734k;
import a70.C79471a;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.Huawei;
import com.tencent.p014mm.sdk.vendor.OnePlus;
import java.util.List;
import ob0.C11385n;
import te3.C90430p93;
import te3.C90435r93;

/* renamed from: y02.e */
public class C91361e extends C91357a {

    /* renamed from: p */
    public boolean f262040p;

    /* renamed from: q */
    public TinkerSyncResponse f262041q;

    /* renamed from: y02.e$a */
    public class C91362a {
        public C91362a() {
        }

        /* renamed from: a */
        public void mo125333a(boolean z, TinkerSyncResponse tinkerSyncResponse) {
            if (!z || tinkerSyncResponse == null) {
                Context context = MMApplicationContext.getContext();
                context.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_base_id", C91361e.this.f262027f).apply();
                C27734k.m37983b(MMApplicationContext.getContext(), "");
                return;
            }
            C91361e eVar = C91361e.this;
            eVar.f262041q = tinkerSyncResponse;
            String str = tinkerSyncResponse.f248344j;
            eVar.f262028g = str;
            Log.m105925i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "Use last response patchId %s instead of current patchId %s", str, str);
            C115669n.INSTANCE.idkeyStat(614, 71, 1, false);
        }
    }

    public C91361e() {
        this("", "", (List<C90430p93>) null, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (!BuildInfo.TINKER_VERSION.equals("1.9.14.5-INTERNALv1") || ((!Huawei.ifHUAWEI() || Build.VERSION.SDK_INT != 24) && (!OnePlus.isOnePlus() || Build.VERSION.SDK_INT <= 28))) {
            return super.doScene(gVar, nVar);
        }
        Log.m105924i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check ignore.");
        this.f262026e = nVar;
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: tw0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.mm.plugin.hp.util.TinkerSyncResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r22, int r23, int r24, java.lang.String r25, com.tencent.p014mm.network.C114799u r26, byte[] r27) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r8 = 1
            r5[r8] = r6
            r6 = 2
            r5[r6] = r3
            java.lang.String r9 = "MicroMsg.Tinker.NetSceneCheckTinkerUpdate"
            java.lang.String r10 = "errType:%d errCode:%d errMsg:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r5)
            ob0.n r5 = r1.f262026e
            r5.onSceneEnd(r0, r2, r3, r1)
            r3 = 5
            if (r0 != 0) goto L_0x01bc
            if (r2 != 0) goto L_0x01bc
            r0 = r26
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.r93 r0 = (te3.C90435r93) r0
            te3.u93 r2 = r0.f259789d
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r5 = x02.C91117e.m114302g()
            r10 = 0
            if (r2 != 0) goto L_0x004b
            if (r5 != 0) goto L_0x004b
            java.lang.String r11 = "no other patch, try to use x mmdiff patch."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
            tw0.h r10 = x02.C91117e.m114303h(r10, r8)
        L_0x004b:
            r11 = 4
            r12 = 6
            if (r2 != 0) goto L_0x0121
            if (r5 != 0) goto L_0x0121
            if (r10 == 0) goto L_0x0055
            goto L_0x0121
        L_0x0055:
            int r0 = r0.f259794i
            if (r0 != r8) goto L_0x005d
            x02.C38427a.m41868a(r8, r7)
            goto L_0x007b
        L_0x005d:
            if (r0 != r6) goto L_0x0063
            x02.C38427a.m41868a(r6, r7)
            goto L_0x007b
        L_0x0063:
            if (r0 != r4) goto L_0x0069
            x02.C38427a.m41868a(r4, r7)
            goto L_0x007b
        L_0x0069:
            if (r0 != r11) goto L_0x006f
            x02.C38427a.m41868a(r12, r7)
            goto L_0x007b
        L_0x006f:
            if (r0 != r12) goto L_0x0078
            java.lang.String r0 = "revoke this patch."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x007b
        L_0x0078:
            x02.C38427a.m41868a(r3, r7)
        L_0x007b:
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r0 = r1.f262041q
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = a70.C79471a.m96436a()
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r2 = r1.f262041q
            java.lang.String r2 = r2.f248344j
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01c4
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r2 = r1.f262041q
            java.lang.String r2 = r2.f248344j
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x01c4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "tinker_patch_share_config"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r11)
            java.lang.String r2 = "tinker_node_retry_time"
            int r0 = r0.getInt(r2, r7)
            if (r0 < r11) goto L_0x00d8
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = ""
            a12.C27734k.m37983b(r2, r3)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            a12.C27734k.m37984c(r2, r7)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            java.lang.String r0 = "retry time over %d time, then clear node and count"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r2)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 614(0x266, double:3.034E-321)
            r13 = 74
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            goto L_0x01c4
        L_0x00d8:
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r2 = r1.f262041q
            x02.C91117e.m114298c(r2)
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r2 = r1.f262041q
            if (r2 != 0) goto L_0x00e7
            java.lang.String r2 = "addTinkerBootServiceConfig, tinkerSyncResponse is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
            goto L_0x00f1
        L_0x00e7:
            r2.f248355x = r8
            r2.f248356y = r8
            r2.f248357z = r7
            r2.f248336B = r12
            r2.f248337C = r8
        L_0x00f1:
            x02.n r2 = new x02.n
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r3 = r1.f262041q
            r2.<init>(r3)
            boolean r3 = r1.f262040p
            r2.mo125187f(r3)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 614(0x266, double:3.034E-321)
            r13 = 70
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            int r0 = r0 + r8
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            a12.C27734k.m37984c(r2, r0)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            java.lang.String r0 = "add retry time %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r2)
            goto L_0x01c4
        L_0x0121:
            boolean r3 = r1.f262040p
            if (r3 == 0) goto L_0x01b6
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0141 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0141 }
            byte[] r0 = android.util.Base64.encode(r0, r7)     // Catch:{ Exception -> 0x0141 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0141 }
            a12.C27734k.m37983b(r3, r4)     // Catch:{ Exception -> 0x0141 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0141 }
            a12.C27734k.m37984c(r0, r7)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0157
        L_0x0141:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = "save node failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r4, r3)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 614(0x266, double:3.034E-321)
            r16 = 72
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
        L_0x0157:
            java.lang.String r0 = "node is no empty. try to process"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r0 = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse
            r0.<init>((te3.C90441u93) r2)
            if (r5 == 0) goto L_0x0170
            boolean r2 = x02.C91117e.m114297b(r5)
            if (r2 == 0) goto L_0x0170
            java.lang.String r0 = "user repair hardcode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x0171
        L_0x0170:
            r5 = r0
        L_0x0171:
            r5.f248353v = r8
            tw0.h r0 = x02.C91117e.m114303h(r5, r8)
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse
            if (r2 == 0) goto L_0x018b
            boolean r2 = x02.C91117e.m114297b(r0)
            if (r2 == 0) goto L_0x018b
            java.lang.String r2 = "user xkey patch hardcode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r5 = r0
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse r5 = (com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse) r5
            goto L_0x0195
        L_0x018b:
            r5.f248355x = r8
            r5.f248356y = r8
            r5.f248357z = r7
            r5.f248336B = r12
            r5.f248337C = r8
        L_0x0195:
            if (r5 != 0) goto L_0x019e
            java.lang.String r0 = "syncResponse is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return
        L_0x019e:
            java.lang.String r0 = "node is no empty. new TinkerSyncResponse finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            x02.n r0 = new x02.n
            r0.<init>(r5)
            boolean r2 = r1.f262040p
            r0.mo125187f(r2)
            java.lang.String r0 = "node is no empty. end process"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            x02.C38427a.m41868a(r11, r7)
            goto L_0x01c4
        L_0x01b6:
            java.lang.String r0 = "check from setting about ui. "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x01c4
        L_0x01bc:
            java.lang.String r2 = "check tinker update failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r2)
            x02.C38427a.m41868a(r3, r0)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y02.C91361e.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public C91361e(String str, String str2, List<C90430p93> list, boolean z) {
        List<C90430p93> list2;
        String str3;
        String str4;
        boolean z2 = z;
        this.f262040p = true;
        if (!z2) {
            str4 = C79471a.f233023k;
            str3 = C79471a.m96436a();
            list2 = C91363f.m114614b();
            this.f262033o = 1;
        } else {
            this.f262033o = 0;
            str4 = str;
            str3 = str2;
            list2 = list;
        }
        this.f262027f = str4;
        this.f262028g = str3;
        this.f262029h.addAll(list2);
        this.f262040p = z2;
        if (z2) {
            C91362a aVar = new C91362a();
            String string = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_node", "");
            if (!Util.isNullOrNil(string)) {
                try {
                    C90435r93 r932 = new C90435r93();
                    r932.parseFrom(Base64.decode(string.getBytes(), 0));
                    if (r932.f259791f != null) {
                        String a = C79471a.m96436a();
                        String str5 = C79471a.f233023k;
                        String string2 = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_base_id", "");
                        TinkerSyncResponse tinkerSyncResponse = new TinkerSyncResponse(r932.f259789d);
                        Log.m105925i("Tinker.TinkerUtils", "LastResponse PID:%s current PID:%s last baseId:%s current baseId:%s", tinkerSyncResponse.f248344j, a, string2, str5);
                        if (!Util.isNullOrNil(tinkerSyncResponse.f248344j) && !tinkerSyncResponse.f248344j.equalsIgnoreCase(a) && !Util.isNullOrNil(str5) && str5.equalsIgnoreCase(string2)) {
                            aVar.mo125333a(true, tinkerSyncResponse);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("Tinker.TinkerUtils", e, "parse tinker update Response failed.", new Object[0]);
                    C115669n.INSTANCE.idkeyStat(614, 73, 1, false);
                }
            }
            aVar.mo125333a(false, (TinkerSyncResponse) null);
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(24470, this.f262030i, "", Integer.valueOf(this.f262033o), Boolean.FALSE);
        nVar.mo175911u(1821, 1);
    }
}
