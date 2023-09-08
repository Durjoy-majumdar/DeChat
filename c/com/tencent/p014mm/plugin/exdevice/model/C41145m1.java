package com.tencent.p014mm.plugin.exdevice.model;

import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51370tb;
import te3.C51519ub;
import y71.C53501k;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.model.m1 */
public class C41145m1 extends C41188e.C41189a implements C11385n {

    /* renamed from: n */
    public static final byte[] f110843n = {-2, 1, 1};

    /* renamed from: o */
    public static C41145m1 f110844o;

    /* renamed from: p */
    public static Object f110845p = new Object();

    /* renamed from: q */
    public static LinkedList<String> f110846q = new LinkedList<>();

    /* renamed from: r */
    public static HashMap<String, C51519ub> f110847r = new HashMap<>(32);

    /* renamed from: e */
    public C41147b f110848e;

    /* renamed from: f */
    public volatile String f110849f;

    /* renamed from: g */
    public boolean f110850g = false;

    /* renamed from: h */
    public HashMap<String, byte[]> f110851h = new HashMap<>();

    /* renamed from: i */
    public LinkedList<C117747y> f110852i = new LinkedList<>();

    /* renamed from: j */
    public final MTimerHandler f110853j = new MTimerHandler(new C41146a(), true);

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m1$a */
    public class C41146a implements MTimerHandler.CallBack {
        public C41146a() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.exdevice.ScanDeviceLogic", "Restart scanning...");
            C41166r1.xx0().mo64206d(0, C41145m1.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m1$b */
    public interface C41147b {
    }

    /* renamed from: e */
    public static C41145m1 m44587e() {
        C41145m1 m1Var = f110844o;
        if (m1Var != null) {
            return m1Var;
        }
        C41145m1 m1Var2 = new C41145m1();
        f110844o = m1Var2;
        return m1Var2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209f(te3.C51519ub r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.exdevice.ScanDeviceLogic"
            if (r13 != 0) goto L_0x000a
            java.lang.String r13 = "item null.."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            return
        L_0x000a:
            java.lang.String r1 = r13.f142714g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0018
            java.lang.String r13 = "invalid mac(null or nil)"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            return
        L_0x0018:
            int r1 = r13.f142711d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r13 = r13.f142714g
            r1[r2] = r13
            java.lang.String r13 = "device(%s) is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r13, r1)
            return
        L_0x002a:
            te3.hf2 r1 = r13.f142716i
            if (r1 == 0) goto L_0x011d
            java.lang.String r1 = r1.f134597e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0038
            goto L_0x011d
        L_0x0038:
            te3.hf2 r1 = r13.f142716i
            java.lang.String r1 = r1.f134596d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r4 = 2
            if (r1 != 0) goto L_0x010d
            te3.hf2 r1 = r13.f142716i
            java.lang.String r1 = r1.f134596d
            java.lang.String r5 = r12.f110849f
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0051
            goto L_0x010d
        L_0x0051:
            java.util.HashMap<java.lang.String, byte[]> r1 = r12.f110851h
            java.lang.String r5 = r13.f142714g
            java.lang.Object r1 = r1.get(r5)
            byte[] r1 = (byte[]) r1
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r13.f142714g
            r5[r2] = r6
            te3.hf2 r6 = r13.f142716i
            java.lang.String r7 = r6.f134596d
            r5[r3] = r7
            java.lang.String r6 = r6.f134597e
            r5[r4] = r6
            r4 = 3
            java.lang.String r6 = r13.f142715h
            r5[r4] = r6
            r4 = 4
            if (r1 != 0) goto L_0x0076
            r6 = 0
            goto L_0x0077
        L_0x0076:
            int r6 = r1.length
        L_0x0077:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            java.lang.String r4 = "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)
            com.tencent.mm.plugin.exdevice.model.m1$b r4 = r12.f110848e
            if (r4 == 0) goto L_0x0107
            r4 = 0
            if (r1 == 0) goto L_0x00fb
            r6 = r4
            r5 = 0
            r7 = 0
        L_0x008c:
            int r8 = r1.length     // Catch:{ Exception -> 0x00e6 }
            int r8 = r8 + -2
            if (r5 >= r8) goto L_0x00e4
            int r8 = r5 + 1
            byte r5 = r1[r5]     // Catch:{ Exception -> 0x00e6 }
            if (r5 != 0) goto L_0x0098
            goto L_0x00e4
        L_0x0098:
            int r9 = r8 + 1
            byte r8 = r1[r8]     // Catch:{ Exception -> 0x00e6 }
            r10 = -1
            if (r8 == r10) goto L_0x00a4
            int r5 = r5 + -1
            int r9 = r9 + r5
        L_0x00a2:
            r5 = r9
            goto L_0x008c
        L_0x00a4:
            java.lang.String r6 = "hakon, Manufacturer Specific Data size = %s"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00e6 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00e6 }
            r8[r2] = r10     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r8)     // Catch:{ Exception -> 0x00e6 }
            int r6 = r5 + -1
            byte[] r8 = new byte[r6]     // Catch:{ Exception -> 0x00e6 }
        L_0x00b5:
            if (r5 <= r3) goto L_0x00ca
            r10 = 32
            if (r7 >= r10) goto L_0x00c7
            if (r7 >= r6) goto L_0x00c7
            int r10 = r7 + 1
            int r11 = r9 + 1
            byte r9 = r1[r9]     // Catch:{ Exception -> 0x00e6 }
            r8[r7] = r9     // Catch:{ Exception -> 0x00e6 }
            r7 = r10
            r9 = r11
        L_0x00c7:
            int r5 = r5 + -1
            goto L_0x00b5
        L_0x00ca:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6 }
            r5.<init>()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r6 = "hakon, Manufacturer Specific Data %s"
            r5.append(r6)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r6 = d81.C45288e.m50130a(r8)     // Catch:{ Exception -> 0x00e6 }
            r5.append(r6)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ Exception -> 0x00e6 }
            r6 = r8
            goto L_0x00a2
        L_0x00e4:
            r4 = r6
            goto L_0x00fb
        L_0x00e6:
            r1 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r6, r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = r1.getMessage()
            r3[r2] = r1
            java.lang.String r1 = "EX in parseBroadcastPacket %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)
        L_0x00fb:
            com.tencent.mm.plugin.exdevice.model.m1$b r0 = r12.f110848e
            te3.hf2 r13 = r13.f142716i
            java.lang.String r13 = r13.f134597e
            com.tencent.mm.plugin.exdevice.model.t r0 = (com.tencent.p014mm.plugin.exdevice.model.C41167t) r0
            r0.mo64229a(r13, r4, r2)
            goto L_0x010c
        L_0x0107:
            java.lang.String r13 = "mCallback null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
        L_0x010c:
            return
        L_0x010d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r13 = r13.f142715h
            r1[r2] = r13
            java.lang.String r13 = r12.f110849f
            r1[r3] = r13
            java.lang.String r13 = "device type (%s) is not equal to brand name (%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r13, r1)
            return
        L_0x011d:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r13 = r13.f142714g
            r1[r2] = r13
            java.lang.String r13 = "invalid device id(mac=%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r13, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41145m1.mo64209f(te3.ub):void");
    }

    /* renamed from: g */
    public void mo64210g(int i) {
        boolean z;
        Log.m105925i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", Integer.valueOf(i));
        this.f110853j.stopTimer();
        if (this.f110850g) {
            C41140m xx02 = C41166r1.xx0();
            xx02.getClass();
            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", Integer.valueOf(i));
            if (xx02.f110826a == null) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (C53502m.m60039c().f110806a == null) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                C53501k kVar = C53502m.m60039c().f110806a;
                C41188e eVar = xx02.f110831f;
                C53503o oVar = (C53503o) kVar;
                oVar.getClass();
                try {
                    z = oVar.f150455a.mo23541Eh(i, eVar);
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                    z = false;
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
                }
            }
            this.f110850g = false;
            this.f110849f = null;
            this.f110851h.clear();
            C86709a0.m107529k().f251779b.mo123470p(542, this);
            Iterator<C117747y> it = this.f110852i.iterator();
            while (it.hasNext()) {
                C117747y next = it.next();
                if (next != null) {
                    C86709a0.m107529k().f251779b.mo123458d(next);
                }
            }
            this.f110852i.clear();
            C41147b bVar = this.f110848e;
            if (bVar != null) {
                ((C41167t) bVar).mo64229a((String) null, (byte[]) null, true);
            }
            this.f110848e = null;
        } else {
            Log.m105924i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
        }
        synchronized (f110845p) {
            f110846q.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r6 = new com.tencent.p014mm.plugin.exdevice.model.C41168t0(new java.lang.String[]{r8}, r4.f110849f, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (f40.C86709a0.m107529k().f251779b.mo123461g(r6, 0) == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r4.f110852i.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        f110846q.remove(r5);
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.exdevice.ScanDeviceLogic", "network().getNetSceneQueue().doScene failed!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    /* renamed from: gj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64196gj(int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, byte[] r11) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, byte[]> r5 = r4.f110851h
            boolean r5 = r5.containsKey(r8)
            if (r5 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r8 != 0) goto L_0x0013
            java.lang.String r5 = "MicroMsg.exdevice.ScanDeviceLogic"
            java.lang.String r6 = "deviceMac is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            return
        L_0x0013:
            java.lang.String r5 = ":"
            java.lang.String r6 = ""
            java.lang.String r5 = r8.replaceAll(r5, r6)
            byte[] r6 = f110843n
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r11)
            r9 = 3
            r10 = -1
            r0 = 0
            if (r7 != 0) goto L_0x003e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
            if (r7 != 0) goto L_0x003e
            int r7 = r11.length
            if (r9 <= r7) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            r7 = 0
        L_0x0031:
            int r1 = r11.length
            if (r7 >= r1) goto L_0x003e
            boolean r1 = d81.C45288e.m50132c(r11, r7, r6)
            if (r1 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x003e:
            r7 = -1
        L_0x003f:
            r6 = 2
            r1 = 0
            r2 = 1
            if (r7 == r10) goto L_0x006b
            int r7 = r7 + 9
            int r10 = r11.length
            if (r7 > r10) goto L_0x0065
            byte[] r10 = new byte[r7]
            java.lang.System.arraycopy(r11, r0, r10, r0, r7)
            java.lang.String r7 = "MicroMsg.exdevice.ScanDeviceLogic"
            java.lang.String r11 = "hakon, scanFound mac:%s, realAd:%s"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r0] = r5
            java.lang.String r3 = d81.C45288e.m50130a(r10)
            r1[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r1)
            java.util.HashMap<java.lang.String, byte[]> r7 = r4.f110851h
            r7.put(r5, r10)
            goto L_0x0070
        L_0x0065:
            java.util.HashMap<java.lang.String, byte[]> r7 = r4.f110851h
            r7.put(r5, r1)
            goto L_0x0070
        L_0x006b:
            java.util.HashMap<java.lang.String, byte[]> r7 = r4.f110851h
            r7.put(r5, r1)
        L_0x0070:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r4.f110849f
            r5.append(r7)
            java.lang.String r7 = "_"
            r5.append(r7)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.util.HashMap<java.lang.String, te3.ub> r7 = f110847r
            boolean r7 = r7.containsKey(r5)
            if (r7 != 0) goto L_0x00d5
            java.lang.Object r7 = f110845p
            monitor-enter(r7)
            java.util.LinkedList<java.lang.String> r6 = f110846q     // Catch:{ all -> 0x00d2 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00a2
            java.lang.String r5 = "MicroMsg.exdevice.ScanDeviceLogic"
            java.lang.String r6 = "hakon, already doing"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00a2:
            java.util.LinkedList<java.lang.String> r6 = f110846q     // Catch:{ all -> 0x00d2 }
            r6.add(r5)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d2 }
            com.tencent.mm.plugin.exdevice.model.t0 r6 = new com.tencent.mm.plugin.exdevice.model.t0
            java.lang.String[] r7 = new java.lang.String[r2]
            r7[r0] = r8
            java.lang.String r8 = r4.f110849f
            r6.<init>(r7, r8, r9)
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            boolean r7 = r7.mo123461g(r6, r0)
            if (r7 == 0) goto L_0x00c5
            java.util.LinkedList<ob0.y> r5 = r4.f110852i
            r5.add(r6)
            goto L_0x00ef
        L_0x00c5:
            java.util.LinkedList<java.lang.String> r6 = f110846q
            r6.remove(r5)
            java.lang.String r5 = "MicroMsg.exdevice.ScanDeviceLogic"
            java.lang.String r6 = "network().getNetSceneQueue().doScene failed!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            goto L_0x00ef
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d2 }
            throw r5
        L_0x00d5:
            java.lang.String r7 = "MicroMsg.exdevice.ScanDeviceLogic"
            java.lang.String r9 = "hakon, hit cache %s, %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r10 = r4.f110849f
            r6[r0] = r10
            r6[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r6)
            java.util.HashMap<java.lang.String, te3.ub> r6 = f110847r
            java.lang.Object r5 = r6.get(r5)
            te3.ub r5 = (te3.C51519ub) r5
            r4.mo64209f(r5)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41145m1.mo64196gj(int, int, java.lang.String, java.lang.String, java.lang.String, int, byte[]):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C47465a aVar;
        Object[] objArr = new Object[4];
        objArr[0] = yVar == null ? "" : Integer.valueOf(yVar.getType());
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        Log.m105925i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", objArr);
        this.f110852i.remove(yVar);
        if (i != 0 || i2 != 0 || yVar == null) {
            Log.m105920e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
        } else if (542 == yVar.getType()) {
            C47350c cVar = ((C41168t0) yVar).f110919d;
            Iterator<C51519ub> it = ((cVar == null || (aVar = cVar.f127056b.f127083a) == null) ? null : (C51370tb) aVar).f142083d.iterator();
            while (it.hasNext()) {
                C51519ub next = it.next();
                if (Util.isNullOrNil(next.f142714g)) {
                    Log.m105920e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
                } else {
                    String str2 = this.f110849f + "_" + next.f142714g;
                    synchronized (f110845p) {
                        if (f110846q.contains(str2)) {
                            f110846q.remove(str2);
                        }
                    }
                    if (!f110847r.containsKey(str2)) {
                        Log.m105925i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", str2);
                        f110847r.put(str2, next);
                    }
                    mo64209f(next);
                }
            }
        }
    }
}
