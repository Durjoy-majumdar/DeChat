package com.tencent.p014mm.plugin.report.service;

import android.util.Pair;
import com.tencent.mars.Mars;
import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kj2.C117406c;
import kj2.C117407d;
import lj2.C88544a;
import org.json.JSONArray;
import p823sg.C90193h;
import te3.C49776i0;
import te3.C50058k0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.report.service.n */
public enum C115669n implements C117406c {
    INSTANCE;
    

    /* renamed from: d */
    public int f346956d;

    /* renamed from: e */
    public int f346957e;

    /* renamed from: f */
    public List<Pair<Long, Long>> f346958f;

    /* renamed from: g */
    public HashMap<String, Long> f346959g;

    /* renamed from: h */
    public int f346960h;

    /* renamed from: i */
    public int f346961i;

    /* renamed from: j */
    public long f346962j;

    /* renamed from: n */
    public volatile boolean f346963n;

    /* renamed from: p */
    public static void m162701p(C115669n nVar) {
        nVar.getClass();
        try {
            byte[] O = C86013q1.m106433O(C86009m1.m106378c(MMApplicationContext.getContext().getFileStreamPath("clog-settings")).mo119976n(), 0, -1);
            if (O != null) {
                Log.m105924i("MicroMsg.cLog", "Load settings from local file.");
                nVar.f346963n = false;
                C50058k0 k0Var = new C50058k0();
                k0Var.parseFrom(O);
                HashMap<String, Long> hashMap = new HashMap<>();
                Iterator<C49776i0> it = k0Var.f136482f.iterator();
                while (it.hasNext()) {
                    C49776i0 next = it.next();
                    if (next.f134990e != 0) {
                        long j = (((long) next.f134992g) * Util.MAX_32BIT_VALUE) / TimeUtil.SECOND_TO_US;
                        hashMap.put(next.f134989d, Long.valueOf(j));
                        Log.m105925i("MicroMsg.cLog", "Update cLog ratio: %s => %d [0x%08x]", next.f134989d, Integer.valueOf(next.f134992g), Long.valueOf(j));
                    }
                }
                nVar.f346959g = hashMap;
                int i = k0Var.f136480d;
                nVar.f346960h = i;
                nVar.f346961i = k0Var.f136483g;
                Log.m105925i("MicroMsg.cLog", "Update cLog version: %d / %d", Integer.valueOf(i), Integer.valueOf(nVar.f346961i));
                return;
            }
            Log.m105924i("MicroMsg.cLog", "Settings local file missing.");
            nVar.f346963n = true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.cLog", e, "Failed to update cLog ratio.", new Object[0]);
        }
    }

    /* renamed from: A */
    public void mo175904A(long j, long j2) {
        synchronized (this.f346958f) {
            ((LinkedList) this.f346958f).add(new Pair(Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* renamed from: B */
    public final void mo175905B(Runnable runnable) {
        if (SmcLogic.sInitiated || C86709a0.m107528h().f251724a.f251792d) {
            runnable.run();
        } else {
            C86709a0.m107528h().mo121097c(new n$$q(this, runnable));
        }
    }

    /* renamed from: C */
    public final void mo175906C(int i, String str, boolean z, boolean z2, boolean z3) {
        KVReportDataInfo kVReportDataInfo = new KVReportDataInfo();
        kVReportDataInfo.f346938d = (long) i;
        kVReportDataInfo.f346940f = str;
        kVReportDataInfo.f346939e = 0;
        kVReportDataInfo.f346942h = false;
        kVReportDataInfo.f346941g = z2;
        kVReportDataInfo.f346943i = z3;
        KVCommCrossProcessReceiver.m162691c(kVReportDataInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160124a(java.util.ArrayList<com.tencent.mars.smc.IDKey> r11, boolean r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x000b
            java.lang.String r11 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r12 = "report idkeyGroupStat lstIdKeyDataInfos == null return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            return
        L_0x000b:
            java.util.Iterator r12 = r11.iterator()
        L_0x000f:
            boolean r0 = r12.hasNext()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r6 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r12.next()
            com.tencent.mars.smc.IDKey r0 = (com.tencent.mars.smc.IDKey) r0
            if (r0 != 0) goto L_0x002c
            java.lang.String r11 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r12 = "report idkeyGroupStat info == null return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            return
        L_0x002c:
            long r7 = r0.GetID()
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            long r7 = r0.GetKey()
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            long r7 = r0.GetValue()
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x000f
        L_0x0044:
            java.lang.String r11 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r12 = "report idkeyGroupStat ID %d, key %d, value %d <0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r4 = r0.GetID()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r6] = r4
            long r4 = r0.GetKey()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r3] = r4
            long r3 = r0.GetValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r12, r1)
            return
        L_0x006d:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r12 == 0) goto L_0x007d
            com.tencent.mm.plugin.report.service.n$$j r12 = new com.tencent.mm.plugin.report.service.n$$j
            r12.<init>(r11, r6)
            r10.mo175905B(r12)
            goto L_0x015d
        L_0x007d:
            com.tencent.mm.sdk.platformtools.MMHandler r12 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346929a
            java.lang.String r12 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r0 = "receive group id size:%d, isImportant:%b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r7 = r11.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r6] = r7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2[r3] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r0, r2)
            r12 = 0
        L_0x0098:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0117
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mars.smc.IDKey r0 = (com.tencent.mars.smc.IDKey) r0
            long r7 = r0.GetID()
            int r0 = (int) r7
            boolean r0 = com.tencent.p014mm.plugin.report.service.C42880f.m46540b(r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "The IDKey has not applied yet, check your code. IDKey:("
            r2.append(r7)
            java.lang.Object r7 = r11.get(r12)
            com.tencent.mars.smc.IDKey r7 = (com.tencent.mars.smc.IDKey) r7
            long r7 = r7.GetID()
            r2.append(r7)
            java.lang.String r7 = ","
            r2.append(r7)
            java.lang.Object r7 = r11.get(r12)
            com.tencent.mars.smc.IDKey r7 = (com.tencent.mars.smc.IDKey) r7
            long r7 = r7.GetKey()
            r2.append(r7)
            java.lang.String r7 = ")"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.String r2 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r7 = "exception:%s"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r8)
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mars.smc.IDKey r0 = (com.tencent.mars.smc.IDKey) r0
            r2 = 1566(0x61e, float:2.194E-42)
            r0.SetID(r2)
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mars.smc.IDKey r0 = (com.tencent.mars.smc.IDKey) r0
            r0.SetKey(r3)
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mars.smc.IDKey r0 = (com.tencent.mars.smc.IDKey) r0
            r7 = 1
            r0.SetValue(r7)
        L_0x0114:
            int r12 = r12 + 1
            goto L_0x0098
        L_0x0117:
            java.lang.Object r12 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346934f
            monitor-enter(r12)
            com.tencent.mm.plugin.report.service.BroadCastData r0 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346933e     // Catch:{ all -> 0x015e }
            com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo r2 = new com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo     // Catch:{ all -> 0x015e }
            r2.<init>(r11, r6)     // Catch:{ all -> 0x015e }
            java.util.ArrayList<com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo> r11 = r0.f346925f     // Catch:{ all -> 0x015e }
            r11.add(r2)     // Catch:{ all -> 0x015e }
            java.util.ArrayList<com.tencent.mars.smc.IDKey> r11 = r2.f346927d     // Catch:{ all -> 0x015e }
            int r11 = r11.size()     // Catch:{ all -> 0x015e }
            int r11 = r11 * 3
            int r11 = r11 * 8
            int r11 = r11 + 4
            r0.mo175883a(r11)     // Catch:{ all -> 0x015e }
            monitor-exit(r12)     // Catch:{ all -> 0x015e }
            long r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346931c
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0154
            boolean r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.m162689a()
            if (r11 == 0) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346929a
            boolean r11 = r11.hasMessages(r3)
            if (r11 == 0) goto L_0x014c
            goto L_0x015d
        L_0x014c:
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346929a
            long r0 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346931c
            r11.sendEmptyMessageDelayed(r3, r0)
            goto L_0x015d
        L_0x0154:
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346929a
            android.os.Message r11 = r11.obtainMessage(r3)
            r11.sendToTarget()
        L_0x015d:
            return
        L_0x015e:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x015e }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C115669n.mo160124a(java.util.ArrayList, boolean):void");
    }

    /* renamed from: b */
    public void mo160125b(int i) {
        SmcLogic.setUin((long) i);
        this.f346956d = i;
    }

    /* renamed from: c */
    public void mo160126c(int i, String str, boolean z, boolean z2) {
        if (!MMApplicationContext.isMMProcess()) {
            mo175906C(i, str, false, z, false);
        } else if (C88544a.f255754a) {
            mo175905B(new n$$a(i, str));
        } else {
            mo175905B(new n$$f(i, str, z, false));
        }
    }

    /* renamed from: e */
    public void mo160128e(int i, boolean z, boolean z2, boolean z3, Object... objArr) {
        mo160134j(i, mo175909s(objArr), z, z2, z3);
    }

    /* renamed from: f */
    public boolean mo160129f(int i, String str) {
        if (!MMApplicationContext.isMainProcess()) {
            kvStat(i, str);
            return true;
        } else if (this.f346956d == 0) {
            return false;
        } else {
            kvStat(i, str);
            return true;
        }
    }

    /* renamed from: g */
    public void mo160130g(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(i);
        iDKey.SetKey(i3);
        iDKey.SetValue((long) i5);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(i2);
        iDKey2.SetKey(i4);
        iDKey2.SetValue((long) i6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        mo160124a(arrayList, z);
    }

    /* renamed from: h */
    public void mo160131h(int i, Object... objArr) {
        if (C88544a.f255754a) {
            boolean z = C88544a.f255755b;
            mo160140o(i, z, z, objArr);
            return;
        }
        mo160140o(i, false, false, objArr);
    }

    /* renamed from: i */
    public void mo160132i(int i, int i2, String str, boolean z, boolean z2) {
        if (!MMApplicationContext.isMMProcess()) {
            KVReportDataInfo kVReportDataInfo = new KVReportDataInfo();
            kVReportDataInfo.f346938d = (long) i;
            kVReportDataInfo.f346940f = str;
            kVReportDataInfo.f346939e = (long) i2;
            kVReportDataInfo.f346942h = false;
            kVReportDataInfo.f346941g = z;
            kVReportDataInfo.f346943i = false;
            KVCommCrossProcessReceiver.m162691c(kVReportDataInfo);
        } else if (C88544a.f255754a) {
            mo175905B(new n$$m(i, i2, str));
        } else {
            mo175905B(new n$$n(i, i2, str, z, false));
        }
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (j4 < 0 || j5 < 0 || j6 <= 0) {
            Log.m105921e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        } else if (MMApplicationContext.isMMProcess()) {
            mo175905B(new n$$b(j, j2, j3, false));
        } else {
            StIDKeyDataInfo stIDKeyDataInfo = new StIDKeyDataInfo();
            stIDKeyDataInfo.f346944d = j4;
            stIDKeyDataInfo.f346945e = j5;
            stIDKeyDataInfo.f346946f = j6;
            stIDKeyDataInfo.f346947g = false;
            MMHandler mMHandler = KVCommCrossProcessReceiver.f346929a;
            Log.m105919d("MicroMsg.ReportManagerKvCheck", "receive id ID:%d, key:%d,value:%d, isImportant:%b", Long.valueOf(j), Long.valueOf(stIDKeyDataInfo.f346945e), Long.valueOf(stIDKeyDataInfo.f346946f), Boolean.valueOf(stIDKeyDataInfo.f346947g));
            if (C42880f.m46540b((int) stIDKeyDataInfo.f346944d)) {
                Log.m105921e("MicroMsg.ReportManagerKvCheck", "exception:%s", Util.stackTraceToString(new Exception("The IDKey has not applied yet, check your code, IDKey:(" + stIDKeyDataInfo.f346944d + "," + stIDKeyDataInfo.f346945e + ")")));
                stIDKeyDataInfo.f346944d = 1566;
                stIDKeyDataInfo.f346945e = 1;
                stIDKeyDataInfo.f346946f = 1;
            }
            synchronized (KVCommCrossProcessReceiver.f346934f) {
                BroadCastData broadCastData = KVCommCrossProcessReceiver.f346933e;
                broadCastData.f346924e.add(stIDKeyDataInfo);
                broadCastData.mo175883a(28);
            }
            if (KVCommCrossProcessReceiver.f346931c == 0 || KVCommCrossProcessReceiver.m162689a()) {
                KVCommCrossProcessReceiver.f346929a.obtainMessage(1).sendToTarget();
            } else if (!KVCommCrossProcessReceiver.f346929a.hasMessages(1)) {
                KVCommCrossProcessReceiver.f346929a.sendEmptyMessageDelayed(1, KVCommCrossProcessReceiver.f346931c);
            }
        }
    }

    /* renamed from: j */
    public void mo160134j(int i, String str, boolean z, boolean z2, boolean z3) {
        if (!MMApplicationContext.isMMProcess()) {
            mo175906C(i, str, false, z, z3);
        } else if (C88544a.f255754a) {
            int i2 = i;
            String str2 = str;
            mo175905B(new n$$k(i, str, z3));
        } else {
            int i3 = i;
            String str3 = str;
            boolean z4 = z3;
            mo175905B(new n$$l(i, str, z, false, z3));
        }
    }

    /* renamed from: k */
    public void mo160135k(String str, String str2, Map<String, Object> map) {
        mo175908r(str, new n$$r(this, map, str2));
    }

    public void kvStat(int i, String str) {
        if (C88544a.f255754a) {
            boolean z = C88544a.f255755b;
            mo160126c(i, str, z, z);
            return;
        }
        mo160126c(i, str, false, false);
    }

    /* renamed from: l */
    public void mo160137l(int i, List<String> list) {
        if (C88544a.f255754a) {
            boolean z = C88544a.f255755b;
            mo175914x(i, list, z, z);
            return;
        }
        mo175914x(i, list, false, false);
    }

    /* renamed from: m */
    public void mo160138m(int i, int i2, int i3, int i4, boolean z) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(i);
        iDKey.SetKey(i2);
        iDKey.SetValue((long) i4);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(i);
        iDKey2.SetKey(i3);
        iDKey2.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        mo160124a(arrayList, false);
    }

    /* renamed from: n */
    public void mo160139n() {
        if (MMApplicationContext.isMMProcess()) {
            Mars.onSingalCrash(0);
        }
    }

    /* renamed from: o */
    public void mo160140o(int i, boolean z, boolean z2, Object... objArr) {
        String s = mo175909s(objArr);
        if (CrashReportFactory.hasDebuger()) {
            Log.m105927v("MicroMsg.ReportManagerKvCheck", "kvTypedStat id:%d [%b,%b] val:%s", Integer.valueOf(i), Boolean.valueOf(z), Boolean.FALSE, s);
        }
        if (MMApplicationContext.isMMProcess()) {
            mo175905B(new n$$c(i, s, z, false));
        } else {
            mo175906C(i, s, false, z, false);
        }
    }

    /* renamed from: q */
    public void mo175907q(String str, String str2) {
        mo160135k(str, str2, (Map<String, Object>) null);
    }

    /* renamed from: r */
    public final void mo175908r(String str, Callable<JSONArray> callable) {
        String str2 = str;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105919d("MicroMsg.cLog", "[%s] Sampling hit: (debug)", str2);
        } else {
            HashMap<String, Long> hashMap = this.f346959g;
            Long l = hashMap != null ? hashMap.get(str2) : null;
            if (l != null) {
                byte[] g = C90193h.m112879g((str2 + this.f346956d + currentTimeMillis).getBytes());
                if (g != null && g.length == 16) {
                    long j = ((((long) (((g[1] + g[5]) + g[9]) + g[13])) & 255) << 8) | (((long) (g[0] + g[4] + g[8] + g[12])) & 255) | ((((long) (((g[2] + g[6]) + g[10]) + g[14])) & 255) << 16) | ((((long) (((g[3] + g[7]) + g[11]) + g[15])) & 255) << 24);
                    boolean z2 = j < l.longValue();
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[1] = z2 ? "hit" : "miss";
                    objArr[2] = Long.valueOf(j);
                    objArr[3] = l;
                    Log.m105919d("MicroMsg.cLog", "[%s] Sampling %s: 0x%08x / 0x%08x", objArr);
                    z = z2;
                }
            }
            Log.m105919d("MicroMsg.cLog", "[%s] Sampling hit: (default)", str);
            z = true;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183876g(new n$$s(this, callable, str, currentTimeMillis), "ReportManager_cLog");
        }
    }

    /* renamed from: s */
    public String mo175909s(Object... objArr) {
        return C117407d.INSTANCE.mo182087p(objArr);
    }

    /* renamed from: t */
    public void mo175910t(int i, int i2, int i3, boolean z) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(i);
        iDKey.SetKey(i2);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(i);
        iDKey2.SetKey(i3);
        iDKey2.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        mo160124a(arrayList, false);
    }

    /* renamed from: u */
    public void mo175911u(int i, int i2) {
        mo175912v((long) i, (long) i2);
    }

    /* renamed from: v */
    public void mo175912v(long j, long j2) {
        mo175913w(j, j2, 1);
    }

    /* renamed from: w */
    public void mo175913w(long j, long j2, long j3) {
        idkeyStat(j, j2, j3, false);
    }

    /* renamed from: x */
    public void mo175914x(int i, List<String> list, boolean z, boolean z2) {
        String str;
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            int size = list.size() - 1;
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(list.get(i2));
                sb.append(',');
            }
            sb.append(list.get(size));
            str = sb.toString();
        }
        String str2 = str;
        if (MMApplicationContext.isMMProcess()) {
            mo175905B(new n$$i(i, str2, z, false));
        } else {
            mo175906C(i, str2, false, z, false);
        }
    }

    /* renamed from: y */
    public void mo175915y(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        if (!MMApplicationContext.isMMProcess()) {
            KVReportDataInfo kVReportDataInfo = new KVReportDataInfo();
            kVReportDataInfo.f346938d = (long) i;
            kVReportDataInfo.f346940f = str;
            kVReportDataInfo.f346939e = (long) i2;
            kVReportDataInfo.f346942h = false;
            kVReportDataInfo.f346941g = z;
            kVReportDataInfo.f346943i = z3;
            KVCommCrossProcessReceiver.m162691c(kVReportDataInfo);
        } else if (C88544a.f255754a) {
            mo175905B(new n$$g(i, i2, str, z3));
        } else {
            mo175905B(new n$$h(i, i2, str, z, false, z3));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(3:4|5|6)|7|8|9|10|(2:12|(1:14)(1:15))(1:16)|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0095 A[Catch:{ IOException -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab A[Catch:{ IOException -> 0x00b2 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo175916z(int r11, pe3.C47465a r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r14 = "MicroMsg.ReportManagerKvCheck"
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.Class r3 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "import_ds_"
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch:{ Exception -> 0x00c8 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3.setInt(r12, r4)     // Catch:{ Exception -> 0x00c8 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x00c8 }
            r5 = 86400(0x15180, double:4.26873E-319)
            long r5 = r3 / r5
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x003b
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "yyyyMMdd"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c8 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x003b }
            r6.<init>()     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = r5.format(r6)     // Catch:{ Exception -> 0x003b }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x003b }
            r10.f346957e = r5     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            java.lang.Class r5 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "ds_"
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x00c8 }
            int r6 = r10.f346957e     // Catch:{ Exception -> 0x00c8 }
            r5.setInt(r12, r6)     // Catch:{ Exception -> 0x00c8 }
            int r5 = r10.f346956d     // Catch:{ Exception -> 0x00c8 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x00c8 }
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            java.lang.Class r7 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r8 = "uin_"
            java.lang.reflect.Field r7 = r7.getField(r8)     // Catch:{ Exception -> 0x00c8 }
            r7.setLong(r12, r5)     // Catch:{ Exception -> 0x00c8 }
            java.lang.Class r5 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "device_"
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x00c8 }
            r5.setInt(r12, r1)     // Catch:{ Exception -> 0x00c8 }
            java.lang.Class r5 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "clientVersion_"
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x00c8 }
            int r6 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x00c8 }
            r5.setInt(r12, r6)     // Catch:{ Exception -> 0x00c8 }
            java.lang.Class r5 = r12.getClass()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "time_stamp_"
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x00c8 }
            r5.setLong(r12, r3)     // Catch:{ Exception -> 0x00c8 }
            byte[] r12 = r12.toByteArray()     // Catch:{ IOException -> 0x00b2 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ IOException -> 0x00b2 }
            if (r3 == 0) goto L_0x00ab
            boolean r3 = lj2.C88544a.f255754a     // Catch:{ IOException -> 0x00b2 }
            if (r3 == 0) goto L_0x00a2
            com.tencent.mm.plugin.report.service.n$$d r13 = new com.tencent.mm.plugin.report.service.n$$d     // Catch:{ IOException -> 0x00b2 }
            r13.<init>(r11, r12)     // Catch:{ IOException -> 0x00b2 }
            r10.mo175905B(r13)     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b1
        L_0x00a2:
            com.tencent.mm.plugin.report.service.n$$e r3 = new com.tencent.mm.plugin.report.service.n$$e     // Catch:{ IOException -> 0x00b2 }
            r3.<init>(r11, r12, r13, r2)     // Catch:{ IOException -> 0x00b2 }
            r10.mo175905B(r3)     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b1
        L_0x00ab:
            java.lang.String r12 = "not in MM Process"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r14, r12)     // Catch:{ IOException -> 0x00b2 }
        L_0x00b1:
            return r0
        L_0x00b2:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r2] = r11
            java.lang.String r11 = r12.toString()
            r13[r0] = r11
            java.lang.String r11 = "pbKVStat LocalReportPb error, %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r11, r13)
            return r2
        L_0x00c8:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r2] = r11
            java.lang.String r11 = r12.toString()
            r13[r0] = r11
            java.lang.String r11 = "pbKVStat  set values error, %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r11, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C115669n.mo175916z(int, pe3.a, boolean, boolean):boolean");
    }
}
