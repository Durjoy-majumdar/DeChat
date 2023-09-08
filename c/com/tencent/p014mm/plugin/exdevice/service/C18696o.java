package com.tencent.p014mm.plugin.exdevice.service;

import android.bluetooth.BluetoothAdapter;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41182c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;
import java.util.HashMap;
import java.util.UUID;
import junit.framework.Assert;
import l71.C117461a;
import lw0.C117482b;
import lw0.C117483c;
import lw0.C21462f;
import lw0.C21470g;
import lw0.C21471h;
import lw0.C88659k;
import mw0.C21565f;
import p206nj.C11171e;
import pw0.C118131a;
import y71.C112396n;
import y71.C23260a;
import y71.C23269b;
import y71.C23270c;
import y71.C23272e;
import y71.C23276j;
import z71.C53752a;

/* renamed from: com.tencent.mm.plugin.exdevice.service.o */
public final class C18696o extends C41182c.C41183a implements C23276j, C117482b, C118131a.C118133b {

    /* renamed from: e */
    public C23260a f52294e;

    /* renamed from: f */
    public RemoteCallbackList<C41191f> f52295f;

    /* renamed from: g */
    public RemoteCallbackList<C41200j> f52296g;

    /* renamed from: h */
    public RemoteCallbackList<C41188e> f52297h;

    /* renamed from: i */
    public RemoteCallbackList<C41185d> f52298i;

    /* renamed from: j */
    public RemoteCallbackList<C41203k> f52299j;

    /* renamed from: n */
    public RemoteCallbackList<C41197h> f52300n;

    /* renamed from: o */
    public final C18711o f52301o;

    /* renamed from: p */
    public final MMHandler f52302p;

    /* renamed from: q */
    public final C21462f f52303q;

    /* renamed from: r */
    public RemoteCallbackList<C41188e> f52304r;

    /* renamed from: s */
    public RemoteCallbackList<C41191f> f52305s;

    /* renamed from: t */
    public RemoteCallbackList<C41206l> f52306t;

    /* renamed from: u */
    public RemoteCallbackList<C41209m> f52307u;

    /* renamed from: v */
    public C21565f f52308v;

    /* renamed from: w */
    public C21565f.C21570d f52309w;

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$a */
    public class C18697a extends C21565f.C21570d {
        public C18697a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$b */
    public class C18698b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f52311d;

        /* renamed from: e */
        public final /* synthetic */ C41188e f52312e;

        public C18698b(int i, C41188e eVar) {
            this.f52311d = i;
            this.f52312e = eVar;
        }

        public void run() {
            boolean z;
            boolean z2;
            C18696o oVar = C18696o.this;
            int i = this.f52311d;
            C41188e eVar = this.f52312e;
            oVar.getClass();
            if (eVar != null) {
                Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnscanCallback");
                boolean register = oVar.f52297h.register(eVar);
                if (!register) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.register Failed!!!");
                }
                if (!register) {
                    try {
                        eVar.mo64196gj(0, -1, "scanImp: registScanCallback failed!!!", "", "", 0, (byte[]) null);
                    } catch (RemoteException e) {
                        Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
                    }
                    z = false;
                } else {
                    C23260a aVar = oVar.f52294e;
                    aVar.getClass();
                    Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "------scan------ bluetooth version = %d", Integer.valueOf(i));
                    C23272e e2 = C23272e.m27752e();
                    boolean post = e2.f66901e.post(new C23269b(e2, i, aVar, new int[0]));
                    if (!post) {
                        Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
                    }
                    if (!post) {
                        Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.scan Failed!!!");
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.scan Failed!!!");
                        try {
                            eVar.mo64196gj(0, -1, "scanImp: mBTDeviceMrg.scan failed!!!", "", "", 0, (byte[]) null);
                        } catch (RemoteException e3) {
                            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e3.getMessage());
                            Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e3, "", new Object[0]);
                        }
                        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
                        boolean unregister = oVar.f52297h.unregister(eVar);
                        if (!unregister) {
                            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
                        }
                        if (!unregister) {
                            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
                        }
                    }
                    z = z2;
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scanImp failed!!!");
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            throw new IllegalArgumentException("scanImp: null == aCallback");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$c */
    public class C18699c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f52314d;

        /* renamed from: e */
        public final /* synthetic */ C41188e f52315e;

        public C18699c(int i, C41188e eVar) {
            this.f52314d = i;
            this.f52315e = eVar;
        }

        public void run() {
            boolean z;
            C18696o oVar = C18696o.this;
            int i = this.f52314d;
            C41188e eVar = this.f52315e;
            boolean z2 = false;
            if (eVar == null) {
                oVar.getClass();
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            } else {
                oVar.f52294e.getClass();
                Log.m105924i("MicroMsg.exdevice.BTDeviceManager", "------stopScan------");
                Log.m105925i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", Integer.valueOf(i));
                C23272e e = C23272e.m27752e();
                boolean post = e.f66901e.post(new C23270c(e, i));
                if (!post) {
                    Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
                }
                if (!post) {
                    Log.m105920e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.stopScan Failed!!!");
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
                    try {
                        eVar.mo64196gj(0, -1, "stopScanImp: mBTDeviceMrg.stopScan failed!!!", "", "", 0, (byte[]) null);
                    } catch (RemoteException e2) {
                        Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp: aCallback.onScanCallback failed!!!, %s", e2.getMessage());
                        Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e2, "", new Object[0]);
                    }
                }
                Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
                boolean unregister = oVar.f52297h.unregister(eVar);
                if (!unregister) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
                }
                if (!unregister) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
                }
                z2 = z;
            }
            if (!z2) {
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp failed!!!");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$d */
    public final class C18700d extends MMHandler {
        public C18700d(String str) {
            super(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:134:0x0421  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x044a  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x06e7  */
        /* JADX WARNING: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x026f  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0303  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r27) {
            /*
                r26 = this;
                r1 = r26
                r0 = r27
                int r2 = r0.what
                r3 = 1
                r4 = 2
                r5 = 0
                java.lang.String r6 = "callback.onStateChange Failed!!!"
                java.lang.String r7 = "MicroMsg.exdevice.BTDeviceManager"
                java.lang.String r8 = "BLE Unsupport"
                java.lang.String r9 = "MicroMsg.exdevice.BluetoothLESimpleManager"
                r10 = 4
                java.lang.String r11 = "Cannot find Callback By deviceId = "
                r12 = 3
                java.lang.String r13 = ""
                java.lang.String r14 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
                switch(r2) {
                    case 0: goto L_0x067d;
                    case 1: goto L_0x05f8;
                    case 2: goto L_0x05e5;
                    case 3: goto L_0x05cb;
                    case 4: goto L_0x0571;
                    case 5: goto L_0x04e9;
                    case 6: goto L_0x0452;
                    case 7: goto L_0x035c;
                    case 8: goto L_0x0311;
                    case 9: goto L_0x0277;
                    case 10: goto L_0x01c0;
                    case 11: goto L_0x0135;
                    case 12: goto L_0x00c8;
                    case 13: goto L_0x001e;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x06ed
            L_0x001e:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$j r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18706j) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r4 = r2.f52304r
                int r4 = r4.beginBroadcast()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
                r3[r5] = r6
                java.lang.String r6 = "simpleBTOnDiscoverCallback size=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r6, r3)
                if (r4 > 0) goto L_0x003f
                java.lang.String r3 = "no simpleBTOnDiscoverCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
            L_0x003f:
                r3 = 0
            L_0x0040:
                if (r3 >= r4) goto L_0x00c1
                boolean r6 = r0.f52337a     // Catch:{ RemoteException -> 0x009c }
                if (r6 == 0) goto L_0x0075
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r6 = r2.f52304r     // Catch:{ RemoteException -> 0x009c }
                android.os.IInterface r6 = r6.getBroadcastItem(r3)     // Catch:{ RemoteException -> 0x009c }
                r15 = r6
                com.tencent.mm.plugin.exdevice.service.e r15 = (com.tencent.p014mm.plugin.exdevice.service.C41188e) r15     // Catch:{ RemoteException -> 0x009c }
                r16 = 2
                r17 = 0
                java.lang.String r18 = "scan finish"
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r15.mo64196gj(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x009c }
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r6 = r2.f52304r     // Catch:{ RemoteException -> 0x009c }
                android.os.IInterface r7 = r6.getBroadcastItem(r3)     // Catch:{ RemoteException -> 0x009c }
                com.tencent.mm.plugin.exdevice.service.e r7 = (com.tencent.p014mm.plugin.exdevice.service.C41188e) r7     // Catch:{ RemoteException -> 0x009c }
                boolean r6 = r6.unregister(r7)     // Catch:{ RemoteException -> 0x009c }
                if (r6 != 0) goto L_0x0097
                java.lang.String r6 = "onScanCallback: mSimpleOnScanCallbackList.unregister failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r6)     // Catch:{ RemoteException -> 0x009c }
                goto L_0x0097
            L_0x0075:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r6 = r2.f52304r     // Catch:{ RemoteException -> 0x009c }
                android.os.IInterface r6 = r6.getBroadcastItem(r3)     // Catch:{ RemoteException -> 0x009c }
                r15 = r6
                com.tencent.mm.plugin.exdevice.service.e r15 = (com.tencent.p014mm.plugin.exdevice.service.C41188e) r15     // Catch:{ RemoteException -> 0x009c }
                r16 = 1
                r17 = 0
                java.lang.String r18 = "discover device"
                java.lang.String r6 = r0.f52338b     // Catch:{ RemoteException -> 0x009c }
                java.lang.String r7 = r0.f52339c     // Catch:{ RemoteException -> 0x009c }
                int r8 = r0.f52340d     // Catch:{ RemoteException -> 0x009c }
                byte[] r9 = r0.f52341e     // Catch:{ RemoteException -> 0x009c }
                r19 = r6
                r20 = r7
                r21 = r8
                r22 = r9
                r15.mo64196gj(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x009c }
            L_0x0097:
                int r3 = r3 + 1
                goto L_0x0040
            L_0x009a:
                r0 = move-exception
                goto L_0x00bb
            L_0x009c:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
                r3.<init>()     // Catch:{ all -> 0x009a }
                java.lang.String r4 = "onScanCallback Exception: "
                r3.append(r4)     // Catch:{ all -> 0x009a }
                java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x009a }
                r3.append(r4)     // Catch:{ all -> 0x009a }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009a }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)     // Catch:{ all -> 0x009a }
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x009a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r13, r3)     // Catch:{ all -> 0x009a }
                goto L_0x00c1
            L_0x00bb:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r2 = r2.f52304r
                r2.finishBroadcast()
                throw r0
            L_0x00c1:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.e> r0 = r2.f52304r
                r0.finishBroadcast()
                goto L_0x06ed
            L_0x00c8:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$i r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18705i) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r6 = r0.f52335a
                byte[] r0 = r0.f52336b
                r2.getClass()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                r4[r5] = r8
                if (r0 != 0) goto L_0x00e2
                java.lang.String r8 = "null"
                goto L_0x00e6
            L_0x00e2:
                java.lang.String r8 = d81.C45288e.m50130a(r0)
            L_0x00e6:
                r4[r3] = r8
                java.lang.String r8 = "simpleBTOnRecvImpl. mac=%d, data = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r8, r4)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.l> r4 = r2.f52306t
                int r4 = r4.beginBroadcast()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                r3[r5] = r8
                java.lang.String r8 = "SimpleOnRecvList size = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r8, r3)
                r3 = 0
            L_0x0102:
                if (r3 >= r4) goto L_0x012e
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.l> r8 = r2.f52306t     // Catch:{ RemoteException -> 0x011c }
                android.os.IInterface r8 = r8.getBroadcastItem(r3)     // Catch:{ RemoteException -> 0x011c }
                com.tencent.mm.plugin.exdevice.service.l r8 = (com.tencent.p014mm.plugin.exdevice.service.C41206l) r8     // Catch:{ RemoteException -> 0x011c }
                if (r8 == 0) goto L_0x0112
                r8.Cc0(r6, r0)     // Catch:{ RemoteException -> 0x011c }
                goto L_0x0117
            L_0x0112:
                java.lang.String r8 = "ISimpleBTOnRecv_AIDL callback is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r8)     // Catch:{ RemoteException -> 0x011c }
            L_0x0117:
                int r3 = r3 + 1
                goto L_0x0102
            L_0x011a:
                r0 = move-exception
                goto L_0x0128
            L_0x011c:
                r0 = move-exception
                java.lang.String r3 = "callback.onDataRecv Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)     // Catch:{ all -> 0x011a }
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x011a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r13, r3)     // Catch:{ all -> 0x011a }
                goto L_0x012e
            L_0x0128:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.l> r2 = r2.f52306t
                r2.finishBroadcast()
                throw r0
            L_0x012e:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.l> r0 = r2.f52306t
                r0.finishBroadcast()
                goto L_0x06ed
            L_0x0135:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$k r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18707k) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r6 = r0.f52342a
                int r8 = r0.f52343b
                int r9 = r0.f52344c
                java.lang.String r0 = r0.f52345d
                r2.getClass()
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Long r15 = java.lang.Long.valueOf(r6)
                r10[r5] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
                r10[r3] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
                r10[r4] = r15
                r10[r12] = r0
                java.lang.String r4 = "simpleBTOnSendEndImpl. mac=%d, errType = %d, errCode=%d, errMsg=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r4, r10)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r4 = r2.f52307u
                int r4 = r4.beginBroadcast()
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r10 = r2.f52307u
                android.os.IInterface r4 = r2.mo23548c(r6, r10, r4)
                r15 = r4
                com.tencent.mm.plugin.exdevice.service.m r15 = (com.tencent.p014mm.plugin.exdevice.service.C41209m) r15
                if (r15 != 0) goto L_0x018b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r0 = r2.f52307u
                r0.finishBroadcast()
                goto L_0x01af
            L_0x018b:
                r16 = r6
                r18 = r8
                r19 = r9
                r20 = r0
                r15.mo64187qV(r16, r18, r19, r20)     // Catch:{ RemoteException -> 0x019e }
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r0 = r2.f52307u
                r0.finishBroadcast()
                goto L_0x01b0
            L_0x019c:
                r0 = move-exception
                goto L_0x01ba
            L_0x019e:
                r0 = move-exception
                r3 = r0
                java.lang.String r0 = "callback.onSendEnd Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)     // Catch:{ all -> 0x019c }
                java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x019c }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r3, r13, r0)     // Catch:{ all -> 0x019c }
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r0 = r2.f52307u
                r0.finishBroadcast()
            L_0x01af:
                r3 = 0
            L_0x01b0:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "simpleBTOnSendEndImpl error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x01ba:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r2 = r2.f52307u
                r2.finishBroadcast()
                throw r0
            L_0x01c0:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$l r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18708l) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r6 = r0.f52346a
                byte[] r10 = r0.f52347b
                com.tencent.mm.plugin.exdevice.service.m r15 = r0.f52348c
                r2.getClass()
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.Long r11 = java.lang.Long.valueOf(r6)
                r0[r5] = r11
                java.lang.String r11 = d81.C45288e.m50130a(r10)
                r0[r3] = r11
                java.lang.String r11 = "simpleBTSendDataImpl. mac=%d, data=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r11, r0)
                mw0.f r0 = r2.f52308v
                if (r0 == 0) goto L_0x025e
                java.lang.Object[] r11 = new java.lang.Object[r3]
                java.lang.Long r16 = java.lang.Long.valueOf(r6)
                r11[r5] = r16
                java.lang.String r4 = "writeData. mac = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r4, r11)
                boolean r4 = r0.mo33795a()
                if (r4 != 0) goto L_0x01ff
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r8)
                goto L_0x0213
            L_0x01ff:
                java.util.HashMap<java.lang.Long, mw0.h> r0 = r0.f61074i
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                java.lang.Object r0 = r0.get(r4)
                mw0.h r0 = (mw0.C21572h) r0
                if (r0 != 0) goto L_0x0215
                java.lang.String r0 = "session is null, may be this session is closed"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            L_0x0213:
                r0 = 0
                goto L_0x0240
            L_0x0215:
                java.lang.Object[] r4 = new java.lang.Object[r12]
                int r8 = r10.length
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r4[r5] = r8
                long r8 = r0.f61087a
                java.lang.String r8 = d81.C45288e.m50135f(r8)
                r4[r3] = r8
                android.bluetooth.BluetoothDevice r8 = r0.f61088b
                java.lang.String r8 = r8.getName()
                r9 = 2
                r4[r9] = r8
                java.lang.String r8 = "MicroMsg.exdevice.BluetoothLESimpleSession"
                java.lang.String r9 = "------writeData------parserobj, length = %d, mac=%s, name=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r4)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f61094h
                android.os.Message r4 = r0.obtainMessage(r12, r10)
                boolean r0 = r0.sendMessage(r4)
            L_0x0240:
                if (r0 != 0) goto L_0x025e
                java.lang.String r0 = "writeData error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                if (r15 == 0) goto L_0x026c
                r18 = -1
                r19 = -1
                java.lang.String r20 = "start write data error"
                r16 = r6
                r15.mo64187qV(r16, r18, r19, r20)     // Catch:{ RemoteException -> 0x0257 }
                goto L_0x026c
            L_0x0257:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r13, r2)
                goto L_0x026c
            L_0x025e:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.m> r0 = r2.f52307u
                boolean r0 = r2.mo23554i(r0, r6, r15)
                if (r0 != 0) goto L_0x026d
                java.lang.String r0 = "register on send end callback error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            L_0x026c:
                r3 = 0
            L_0x026d:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "simpleBTSendDataImpl error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x0277:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$f r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18702f) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r7 = r0.f52323a
                int r4 = r0.f52324b
                int r9 = r0.f52325c
                int r15 = r0.f52326d
                r25 = r13
                long r12 = r0.f52327e
                r2.getClass()
                java.lang.Object[] r0 = new java.lang.Object[r10]
                java.lang.Long r10 = java.lang.Long.valueOf(r7)
                r0[r5] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
                r0[r3] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r16 = 2
                r0[r16] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
                r16 = 3
                r0[r16] = r10
                java.lang.String r10 = "simpleBTOnSateChangeImpl. mac=%d, oldstate = %d, newsate=%d, errcode=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r10, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52305s
                int r0 = r0.beginBroadcast()
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r10 = r2.f52305s
                android.os.IInterface r0 = r2.mo23548c(r7, r10, r0)
                r17 = r0
                com.tencent.mm.plugin.exdevice.service.f r17 = (com.tencent.p014mm.plugin.exdevice.service.C41191f) r17
                if (r17 != 0) goto L_0x02da
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52305s
                r0.finishBroadcast()
                goto L_0x0300
            L_0x02da:
                r18 = r7
                r20 = r4
                r21 = r9
                r22 = r15
                r23 = r12
                r17.k20(r18, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x02ef }
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52305s
                r0.finishBroadcast()
                goto L_0x0301
            L_0x02ed:
                r0 = move-exception
                goto L_0x030b
            L_0x02ef:
                r0 = move-exception
                r3 = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r6)     // Catch:{ all -> 0x02ed }
                java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ed }
                r4 = r25
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r3, r4, r0)     // Catch:{ all -> 0x02ed }
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52305s
                r0.finishBroadcast()
            L_0x0300:
                r3 = 0
            L_0x0301:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "simpleBTOnSateChangeImpl error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x030b:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r2 = r2.f52305s
                r2.finishBroadcast()
                throw r0
            L_0x0311:
                java.lang.Object r0 = r0.obj
                java.lang.Long r0 = (java.lang.Long) r0
                long r6 = r0.longValue()
                com.tencent.mm.plugin.exdevice.service.o r0 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                r0.getClass()
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                r2[r5] = r4
                java.lang.String r4 = "simpleBTDisonnectImpl. mac=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r4, r2)
                mw0.f r0 = r0.f52308v
                if (r0 == 0) goto L_0x06ed
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Long r3 = java.lang.Long.valueOf(r6)
                r2[r5] = r3
                java.lang.String r3 = "disconnect. mac = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r2)
                boolean r2 = r0.mo33795a()
                if (r2 != 0) goto L_0x0348
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r8)
                goto L_0x06ed
            L_0x0348:
                mw0.g r2 = new mw0.g
                r2.<init>(r0, r6)
                java.util.concurrent.locks.ReentrantLock r3 = r0.f61069d
                r3.lock()
                r2.run()
                java.util.concurrent.locks.ReentrantLock r0 = r0.f61069d
                r0.unlock()
                goto L_0x06ed
            L_0x035c:
                r4 = r13
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$h r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18704h) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r6 = r0.f52332a
                int r10 = r0.f52333b
                com.tencent.mm.plugin.exdevice.service.f r11 = r0.f52334c
                r2.getClass()
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Long r12 = java.lang.Long.valueOf(r6)
                r0[r5] = r12
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r0[r3] = r10
                java.lang.String r10 = "simpleBTConnectImpl. mac=%d, bTVersion=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r10, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52305s
                boolean r0 = r2.mo23554i(r0, r6, r11)
                if (r0 != 0) goto L_0x03a9
                java.lang.String r0 = "register connect callback error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                r20 = -1
                r21 = 4
                r22 = -1
                r23 = 0
                r17 = r11
                r18 = r6
                r17.k20(r18, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x03a0 }
                goto L_0x0447
            L_0x03a0:
                r0 = move-exception
                r2 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r2, r4, r0)
                goto L_0x0447
            L_0x03a9:
                r20 = -1
                r21 = 1
                r22 = -1
                r23 = 0
                r17 = r11
                r18 = r6
                r17.k20(r18, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x03b9 }
                goto L_0x03c0
            L_0x03b9:
                r0 = move-exception
                r10 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r10, r4, r0)
            L_0x03c0:
                mw0.f r0 = r2.f52308v
                if (r0 == 0) goto L_0x0448
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Long r10 = java.lang.Long.valueOf(r6)
                r2[r5] = r10
                java.lang.String r10 = "connect. mac = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r2)
                boolean r2 = r0.mo33795a()
                if (r2 != 0) goto L_0x03db
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r8)
                goto L_0x041e
            L_0x03db:
                java.util.HashMap<java.lang.Long, mw0.h> r2 = r0.f61074i
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                java.lang.Object r2 = r2.get(r8)
                mw0.h r2 = (mw0.C21572h) r2
                if (r2 == 0) goto L_0x03f4
                java.lang.String r0 = "session(mac=%s) has been in map"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
                boolean r0 = r2.mo33803c()
                goto L_0x041f
            L_0x03f4:
                mw0.h r2 = new mw0.h
                android.content.Context r8 = r0.f61068c
                mw0.h$e r10 = r0.f61076k
                r2.<init>(r6, r8, r10)
                boolean r8 = r2.mo33803c()
                if (r8 == 0) goto L_0x0418
                java.util.concurrent.locks.ReentrantLock r8 = r0.f61069d
                r8.lock()
                java.util.HashMap<java.lang.Long, mw0.h> r8 = r0.f61074i
                java.lang.Long r9 = java.lang.Long.valueOf(r6)
                r8.put(r9, r2)
                java.util.concurrent.locks.ReentrantLock r0 = r0.f61069d
                r0.unlock()
                r0 = 1
                goto L_0x041f
            L_0x0418:
                java.lang.String r0 = "tmpConnectForScan error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            L_0x041e:
                r0 = 0
            L_0x041f:
                if (r0 != 0) goto L_0x0448
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0[r5] = r2
                java.lang.String r2 = "connect device(mac=%d) error"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r2, r0)
                if (r11 == 0) goto L_0x0447
                r20 = 1
                r21 = 4
                r22 = -1
                r23 = 0
                r17 = r11
                r18 = r6
                r17.k20(r18, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x0440 }
                goto L_0x0447
            L_0x0440:
                r0 = move-exception
                r2 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r2, r4, r0)
            L_0x0447:
                r3 = 0
            L_0x0448:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "simpleBTConnectImpl error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x0452:
                r4 = r13
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$e r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18701e) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                int r6 = r0.f52322e
                long r7 = r0.f52318a
                short r9 = r0.f52319b
                short r11 = r0.f52320c
                byte[] r12 = r0.f52321d
                r2.getClass()
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
                r0[r5] = r13
                java.lang.Long r13 = java.lang.Long.valueOf(r7)
                r0[r3] = r13
                java.lang.Short r13 = java.lang.Short.valueOf(r9)
                r15 = 2
                r0[r15] = r13
                java.lang.Short r13 = java.lang.Short.valueOf(r11)
                r15 = 3
                r0[r15] = r13
                if (r12 != 0) goto L_0x0487
                r13 = 0
                goto L_0x0488
            L_0x0487:
                int r13 = r12.length
            L_0x0488:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r10] = r13
                java.lang.String r10 = "onDeviceRequestImp errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.d> r0 = r2.f52298i
                int r10 = r0.beginBroadcast()
                r13 = 0
            L_0x049a:
                if (r13 >= r10) goto L_0x04e2
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.d> r0 = r2.f52298i     // Catch:{ Exception -> 0x04c4 }
                android.os.IInterface r0 = r0.getBroadcastItem(r13)     // Catch:{ Exception -> 0x04c4 }
                r18 = r0
                com.tencent.mm.plugin.exdevice.service.d r18 = (com.tencent.p014mm.plugin.exdevice.service.C41185d) r18     // Catch:{ Exception -> 0x04c4 }
                if (r18 == 0) goto L_0x04b6
                r19 = r6
                r20 = r7
                r22 = r9
                r23 = r11
                r24 = r12
                r18.mo64239fY(r19, r20, r22, r23, r24)     // Catch:{ Exception -> 0x04c4 }
                goto L_0x04de
            L_0x04b6:
                java.lang.String r0 = "get req callback failed, cmdId = %d"
                java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x04c4 }
                java.lang.Short r16 = java.lang.Short.valueOf(r11)     // Catch:{ Exception -> 0x04c4 }
                r15[r5] = r16     // Catch:{ Exception -> 0x04c4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r15)     // Catch:{ Exception -> 0x04c4 }
                goto L_0x04de
            L_0x04c4:
                r0 = move-exception
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r3 = "onDeviceRequest Failed!!! i = "
                r15.append(r3)
                r15.append(r13)
                java.lang.String r3 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)
                java.lang.Object[] r3 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r4, r3)
            L_0x04de:
                int r13 = r13 + 1
                r3 = 1
                goto L_0x049a
            L_0x04e2:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.d> r0 = r2.f52298i
                r0.finishBroadcast()
                goto L_0x06ed
            L_0x04e9:
                r4 = r13
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$f r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18702f) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r7 = r0.f52323a
                int r3 = r0.f52324b
                int r9 = r0.f52325c
                int r0 = r0.f52326d
                r2.getClass()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "onStateChangeImp deviceId = "
                r10.append(r12)
                r10.append(r7)
                java.lang.String r12 = " oldState"
                r10.append(r12)
                r10.append(r3)
                java.lang.String r12 = " newState = "
                r10.append(r12)
                r10.append(r9)
                java.lang.String r12 = " errCode = "
                r10.append(r12)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r10 = r2.f52295f
                int r10 = r10.beginBroadcast()
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r12 = r2.f52295f
                android.os.IInterface r10 = r2.mo23548c(r7, r12, r10)
                r15 = r10
                com.tencent.mm.plugin.exdevice.service.f r15 = (com.tencent.p014mm.plugin.exdevice.service.C41191f) r15
                if (r15 != 0) goto L_0x0552
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52295f
                r0.finishBroadcast()
                goto L_0x06ed
            L_0x0552:
                r21 = 0
                r16 = r7
                r18 = r3
                r19 = r9
                r20 = r0
                r15.k20(r16, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x0560 }
                goto L_0x056a
            L_0x0560:
                r0 = move-exception
                r3 = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r6)
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r3, r4, r0)
            L_0x056a:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.f> r0 = r2.f52295f
                r0.finishBroadcast()
                goto L_0x06ed
            L_0x0571:
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                java.lang.Object r0 = r0.obj
                java.lang.Long r0 = (java.lang.Long) r0
                long r3 = r0.longValue()
                r2.getClass()
                r6 = 1
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.Long r6 = java.lang.Long.valueOf(r3)
                r0[r5] = r6
                java.lang.String r6 = "stopChannelImp deviceId = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r6, r0)
                y71.a r0 = r2.f52294e
                r0.getClass()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "stopChannel deviceId = "
                r2.append(r6)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f66863f
                java.lang.Long r2 = java.lang.Long.valueOf(r3)
                r3 = 12
                android.os.Message r2 = r0.obtainMessage(r3, r2)
                boolean r0 = r0.sendMessage(r2)
                if (r0 != 0) goto L_0x05c0
                java.lang.String r0 = "mBTDeviceMrg.stopChannel Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                r3 = 0
                goto L_0x05c1
            L_0x05c0:
                r3 = 1
            L_0x05c1:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "stopChannelImp failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x05cb:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$m r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18709m) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r3 = r0.f52349a
                int r5 = r0.f52350b
                com.tencent.mm.plugin.exdevice.service.f r0 = r0.f52351c
                boolean r0 = com.tencent.p014mm.plugin.exdevice.service.C18696o.m19474a(r2, r3, r5, r0)
                if (r0 != 0) goto L_0x06ed
                java.lang.String r0 = "startChannelImp failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x05e5:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$g r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18703g) r0
                com.tencent.mm.plugin.exdevice.service.o r2 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r3 = r0.f52328a
                int r5 = r0.f52329b
                int r6 = r0.f52330c
                java.lang.String r7 = r0.f52331d
                r2.mo23553h(r3, r5, r6, r7)
                goto L_0x06ed
            L_0x05f8:
                java.lang.Object r0 = r0.obj
                java.lang.Long r0 = (java.lang.Long) r0
                long r10 = r0.longValue()
                com.tencent.mm.plugin.exdevice.service.o r0 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                r0.getClass()
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Long r2 = java.lang.Long.valueOf(r10)
                r3[r5] = r2
                java.lang.String r2 = "stopTaskImp, task id = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r3)
                r2 = 0
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 >= 0) goto L_0x0621
                java.lang.String r0 = "taskId < 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x0674
            L_0x0621:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r2 = r0.f52296g
                int r13 = r2.beginBroadcast()
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r2 = r0.f52296g
                android.os.IInterface r2 = r0.mo23548c(r10, r2, r13)
                r12 = r2
                com.tencent.mm.plugin.exdevice.service.j r12 = (com.tencent.p014mm.plugin.exdevice.service.C41200j) r12
                if (r12 != 0) goto L_0x063e
                java.lang.String r2 = "stopTask Failed, Cannot find such netCmd in RemoteCallbackList"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r0 = r0.f52296g
                r0.finishBroadcast()
                goto L_0x0674
            L_0x063e:
                y71.a r2 = r0.f52294e
                r2.getClass()
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Long r4 = java.lang.Long.valueOf(r10)
                r3[r5] = r4
                java.lang.String r4 = "stopTask taskId = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r3)
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f66863f
                java.lang.Long r3 = java.lang.Long.valueOf(r10)
                r4 = 9
                android.os.Message r3 = r2.obtainMessage(r4, r3)
                r2.sendMessage(r3)
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r9 = r0.f52296g
                r8 = r0
                boolean r5 = r8.mo23556j(r9, r10, r12, r13)
                if (r5 != 0) goto L_0x066f
                java.lang.String r2 = "mCBListTask.unregister Failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            L_0x066f:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r0 = r0.f52296g
                r0.finishBroadcast()
            L_0x0674:
                if (r5 != 0) goto L_0x06ed
                java.lang.String r0 = "stopTaskImp failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                goto L_0x06ed
            L_0x067d:
                java.lang.Object r0 = r0.obj
                com.tencent.mm.plugin.exdevice.service.o$n r0 = (com.tencent.p014mm.plugin.exdevice.service.C18696o.C18710n) r0
                com.tencent.mm.plugin.exdevice.service.o r6 = com.tencent.p014mm.plugin.exdevice.service.C18696o.this
                long r7 = r0.f52352a
                com.tencent.mm.plugin.exdevice.service.j r0 = r0.f52353b
                r6.getClass()
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                r3[r5] = r4
                java.lang.String r4 = "startTaskImp, task Id = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
                if (r0 != 0) goto L_0x06a8
                java.lang.String r0 = "null == aTask"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                r9 = -1
                r10 = -1
                java.lang.String r11 = "null == aTask"
                r6.mo23553h(r7, r9, r10, r11)
                goto L_0x06e2
            L_0x06a8:
                y71.a r3 = r6.f52294e
                int r3 = r3.mo36736k(r7, r0)
                if (r3 == 0) goto L_0x06cc
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "mBTDeviceMrg.startTask Failed ret = "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                r9 = -1
                r10 = -1
                java.lang.String r11 = "mBTDeviceMrg.startTask Failed!!!"
                r6.mo23553h(r7, r9, r10, r11)
                goto L_0x06e2
            L_0x06cc:
                android.os.RemoteCallbackList<com.tencent.mm.plugin.exdevice.service.j> r3 = r6.f52296g
                boolean r0 = r6.mo23554i(r3, r7, r0)
                if (r0 != 0) goto L_0x06e4
                java.lang.String r0 = "registerRemoteCB Fail!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                r9 = -1
                r10 = -1
                java.lang.String r11 = "registerRemoteCB Fail!!!"
                r6.mo23553h(r7, r9, r10, r11)
            L_0x06e2:
                r3 = 0
                goto L_0x06e5
            L_0x06e4:
                r3 = 1
            L_0x06e5:
                if (r3 != 0) goto L_0x06ed
                java.lang.String r0 = "startTaskImp failed!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            L_0x06ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.service.C18696o.C18700d.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$e */
    public static final class C18701e {

        /* renamed from: a */
        public long f52318a = 0;

        /* renamed from: b */
        public short f52319b = 0;

        /* renamed from: c */
        public short f52320c = 0;

        /* renamed from: d */
        public byte[] f52321d = null;

        /* renamed from: e */
        public int f52322e = 0;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$f */
    public static final class C18702f {

        /* renamed from: a */
        public long f52323a = 0;

        /* renamed from: b */
        public int f52324b = 0;

        /* renamed from: c */
        public int f52325c = 0;

        /* renamed from: d */
        public int f52326d = 0;

        /* renamed from: e */
        public long f52327e = 0;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$g */
    public static final class C18703g {

        /* renamed from: a */
        public long f52328a = 0;

        /* renamed from: b */
        public int f52329b = 0;

        /* renamed from: c */
        public int f52330c = 0;

        /* renamed from: d */
        public String f52331d = null;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$h */
    public static final class C18704h {

        /* renamed from: a */
        public long f52332a;

        /* renamed from: b */
        public int f52333b;

        /* renamed from: c */
        public C41191f f52334c;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$i */
    public static final class C18705i {

        /* renamed from: a */
        public long f52335a;

        /* renamed from: b */
        public byte[] f52336b;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$j */
    public static final class C18706j {

        /* renamed from: a */
        public boolean f52337a;

        /* renamed from: b */
        public String f52338b;

        /* renamed from: c */
        public String f52339c;

        /* renamed from: d */
        public int f52340d;

        /* renamed from: e */
        public byte[] f52341e;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$k */
    public static final class C18707k {

        /* renamed from: a */
        public long f52342a;

        /* renamed from: b */
        public int f52343b;

        /* renamed from: c */
        public int f52344c;

        /* renamed from: d */
        public String f52345d;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$l */
    public static final class C18708l {

        /* renamed from: a */
        public long f52346a;

        /* renamed from: b */
        public byte[] f52347b;

        /* renamed from: c */
        public C41209m f52348c;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$m */
    public static final class C18709m {

        /* renamed from: a */
        public long f52349a;

        /* renamed from: b */
        public int f52350b;

        /* renamed from: c */
        public C41191f f52351c;

        public C18709m(long j, int i, C41191f fVar) {
            this.f52349a = j;
            this.f52350b = i;
            this.f52351c = fVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$n */
    public static final class C18710n {

        /* renamed from: a */
        public long f52352a;

        /* renamed from: b */
        public C41200j f52353b;

        public C18710n(long j, C41200j jVar) {
            this.f52352a = j;
            this.f52353b = jVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.service.o$o */
    public static final class C18711o {

        /* renamed from: a */
        public long f52354a = 0;

        public C18711o(C18697a aVar) {
        }
    }

    public C18696o() {
        this.f52294e = null;
        this.f52295f = new RemoteCallbackList<>();
        this.f52296g = new RemoteCallbackList<>();
        this.f52297h = new RemoteCallbackList<>();
        this.f52298i = new RemoteCallbackList<>();
        this.f52299j = new RemoteCallbackList<>();
        this.f52300n = new RemoteCallbackList<>();
        this.f52301o = new C18711o((C18697a) null);
        this.f52304r = new RemoteCallbackList<>();
        this.f52305s = new RemoteCallbackList<>();
        this.f52306t = new RemoteCallbackList<>();
        this.f52307u = new RemoteCallbackList<>();
        this.f52294e = new C23260a(this);
        this.f52302p = new C18700d(C112396n.m153349b().f336526b.getSerialTag());
        this.f52303q = new C21462f(this);
        new C118131a(this);
        this.f52309w = new C18697a();
        if (C11171e.m11046c(18)) {
            this.f52308v = new C21565f(this.f52309w);
        }
    }

    /* renamed from: a */
    public static boolean m19474a(C18696o oVar, long j, int i, C41191f fVar) {
        oVar.getClass();
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannelImp deviceId = %d, bluetoothVersion = %d", Long.valueOf(j), Integer.valueOf(i));
        Assert.assertNotNull(fVar);
        C112396n.m153349b().mo164108c(j, i);
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registChannelStateChange, deviceId = %d", Long.valueOf(j));
        boolean i2 = oVar.mo23554i(oVar.f52295f, j, fVar);
        if (!i2) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnStateChange.register Failed!!!");
        }
        if (!i2) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registChannelStateChange Failed!!!");
            oVar.mo23550f(j, 1, 4, -1);
            return false;
        } else if (oVar.f52294e.mo36735j(j)) {
            return true;
        } else {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.startChannel Failed!!!");
            Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unregistChannelStateChange, deviceId = %d", Long.valueOf(j));
            C18696o oVar2 = oVar;
            boolean j2 = oVar2.mo23556j(oVar.f52295f, j, fVar, oVar.f52295f.beginBroadcast());
            if (!j2) {
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
            }
            oVar.f52295f.finishBroadcast();
            if (!j2) {
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unregistChannelStateChange");
            }
            oVar.mo23550f(j, 1, 4, -1);
            return false;
        }
    }

    /* renamed from: Ds */
    public void mo23540Ds(long j, byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---setChannelSessionKey--- deviceId = %d", Long.valueOf(j));
        C23260a aVar = this.f52294e;
        aVar.getClass();
        Log.m105925i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKey------ deviceId = %d", Long.valueOf(j));
        C23260a.C23267g gVar = new C23260a.C23267g(j, bArr);
        MMHandler mMHandler = aVar.f66863f;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(10, gVar))) {
            Log.m105921e("MicroMsg.exdevice.BTDeviceManager", "mHandler.sendMessage failed!!! messageWhat = %d", 10);
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
    }

    /* renamed from: Eh */
    public boolean mo23541Eh(int i, C41188e eVar) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---stopScan--- aBluetoothVersion = " + i);
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback");
            return false;
        }
        boolean post = this.f52302p.post(new C18699c(i, eVar));
        if (post) {
            C117461a.m165683c(C117461a.C117463b.STOP_SCANNING);
        }
        if (!post) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScan: mHandler.post failed!!!");
        }
        return post;
    }

    public boolean Fk0(C41185d dVar) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnDeviceRequest");
        boolean register = this.f52298i.register(dVar);
        if (!register) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.register Failed!!!");
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
        return register;
    }

    public boolean J90(int i, C41188e eVar) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---scan--- aBluetoothVersion = " + i);
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            return false;
        }
        boolean post = this.f52302p.post(new C18698b(i, eVar));
        if (post) {
            C117461a.m165683c(C117461a.C117463b.SCANNING);
        }
        if (!post) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan: mHandler.post failed!!!");
        }
        return post;
    }

    public boolean Ks0(int i, C41188e eVar) {
        Log.m105919d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothScan. bluetoothVersion=%d", Integer.valueOf(i));
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan callback is null. just return");
            return false;
        } else if (i != 0) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "this is not ble scan cmd");
            return false;
        } else {
            boolean register = this.f52304r.register(eVar);
            if (register) {
                Log.m105918d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback ok");
            } else {
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback fail");
            }
            C21565f fVar = this.f52308v;
            if (fVar == null || fVar.mo33796b()) {
                C117461a.m165683c(C117461a.C117463b.SIMPLE_BLUETOOTH_SCAN);
                return true;
            }
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simple ble scan fail");
            try {
                eVar.mo64196gj(0, -1, "simpleBLE.scan failed!!!", "", "", 0, (byte[]) null);
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.scan callback failed!!!, %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
            }
            if (register) {
                this.f52304r.unregister(eVar);
            }
            return false;
        }
    }

    public boolean Pr0(long j, int i, C41191f fVar) {
        if (fVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        } else if (j < 0) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", Long.valueOf(j));
            return false;
        } else if (i != 0) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", Integer.valueOf(i));
            return false;
        } else {
            C18704h hVar = new C18704h();
            hVar.f52332a = j;
            hVar.f52333b = i;
            hVar.f52334c = fVar;
            MMHandler mMHandler = this.f52302p;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(7, hVar))) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 7);
                return false;
            }
            C117461a.m165683c(C117461a.C117463b.SIMPLE_BLUETOOTH_CONNECT);
            return true;
        }
    }

    /* renamed from: Qk */
    public boolean mo23546Qk(String str, boolean z, C41203k kVar) {
        boolean z2;
        if (this.f52303q == null) {
            return false;
        }
        boolean hasSystemFeature = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (hasSystemFeature && defaultAdapter != null) {
            Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "ranging, uuid = %s, op = %s", str, String.valueOf(z));
            if (!this.f52299j.register(kVar)) {
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.register failed!!!");
                return false;
            }
            try {
                UUID fromString = UUID.fromString(str);
                C21462f fVar = this.f52303q;
                fVar.getClass();
                C21462f.f60772x = MMApplicationContext.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
                Object[] objArr = new Object[2];
                objArr[0] = fromString == null ? "" : fromString.toString();
                objArr[1] = String.valueOf(z);
                Log.m105919d("MicroMsg.exdevice.IBeaconServer", "Ranging, uuid = %s, op = %s", objArr);
                if (fromString == null) {
                    Log.m105920e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
                    z2 = false;
                } else {
                    z2 = z ? fVar.f60778i.post(new C21470g(fVar, fromString)) : fVar.f60778i.post(new C21471h(fVar, fromString));
                }
                if (z2) {
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mIBeaconServer.ranging failed!!!");
                if (!this.f52299j.unregister(kVar)) {
                    Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.unregister failed!!!");
                }
                return false;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "UUID.fromString failed!!!, (%s)", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: bO */
    public boolean mo23547bO(long j, byte[] bArr, C41209m mVar) {
        if (0 > j) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mac < 0");
            return false;
        } else if (bArr == null || bArr.length <= 0) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "data is empty");
            return false;
        } else if (mVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        } else {
            C18708l lVar = new C18708l();
            lVar.f52346a = j;
            lVar.f52347b = bArr;
            lVar.f52348c = mVar;
            MMHandler mMHandler = this.f52302p;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(10, lVar))) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 10);
                return false;
            }
            C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
            return true;
        }
    }

    /* renamed from: c */
    public final IInterface mo23548c(long j, RemoteCallbackList remoteCallbackList, int i) {
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "findCallbackbyId, Id = %d, count = %d", Long.valueOf(j), Integer.valueOf(i));
        for (int i2 = 0; i2 < i; i2++) {
            HashMap hashMap = (HashMap) remoteCallbackList.getBroadcastCookie(i2);
            if (hashMap.containsKey(Long.valueOf(j))) {
                return (IInterface) hashMap.get(Long.valueOf(j));
            }
        }
        Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find id in the callback list");
        return null;
    }

    /* renamed from: e */
    public void mo23549e(double d, C117483c cVar) {
        C117483c cVar2 = cVar;
        if (cVar2 == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aContext is null");
            return;
        }
        C88659k kVar = cVar2.f351585a.f255971b;
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onRangingCallback, distance = %f, uuid = %s, major = %d, minor = %d ,minor&0xFFFF = %d", Double.valueOf(d), C45288e.m50130a(kVar.f255973c), Short.valueOf(kVar.f255974d), Short.valueOf(kVar.f255975e), Integer.valueOf(kVar.f255975e & 65535));
        try {
            int beginBroadcast = this.f52299j.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    short s = kVar.f255974d;
                    short s2 = kVar.f255975e;
                    byte[] bArr = kVar.f255973c;
                    double d2 = cVar2.f351586b;
                    double d3 = d2;
                    this.f52299j.getBroadcastItem(i).wt0(d, s, s2, bArr, d3, cVar2.f351585a.f255971b.f255976f, cVar2.f351587c);
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.getBroadcastItem failed!!!, i = %d, (%s)", Integer.valueOf(i), e.toString());
                    Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "[shakezb] beginBroadcast fail!", e2.toString());
            Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e2, "", new Object[0]);
        } catch (Throwable th) {
            this.f52299j.finishBroadcast();
            throw th;
        }
        this.f52299j.finishBroadcast();
    }

    /* renamed from: f */
    public void mo23550f(long j, int i, int i2, int i3) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onStateChange deviceId = " + j + " oldState" + i + " newState = " + i2 + " errCode = " + i3);
        C18702f fVar = new C18702f();
        fVar.f52323a = j;
        fVar.f52324b = i;
        fVar.f52325c = i2;
        fVar.f52326d = i3;
        MMHandler mMHandler = this.f52302p;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(5, fVar))) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, messagewhat = %d", 5);
        }
    }

    /* renamed from: g */
    public void mo23551g(long j, int i, int i2, String str) {
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEnd taskId = %d, errTpye = %d, errCode = %d, errMsg = %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str);
        C18703g gVar = new C18703g();
        gVar.f52328a = j;
        gVar.f52329b = i;
        gVar.f52330c = i2;
        gVar.f52331d = str;
        MMHandler mMHandler = this.f52302p;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(2, gVar))) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, MessageWhat = %d", 2);
        }
    }

    /* renamed from: gj */
    public void mo23552gj(int i, int i2, String str, String str2, String str3, int i3, byte[] bArr) {
        int beginBroadcast = this.f52297h.beginBroadcast();
        for (int i4 = 0; i4 < beginBroadcast; i4++) {
            try {
                this.f52297h.getBroadcastItem(i4).mo64196gj(i, i2, str, str2, str3, i3, bArr);
                if (2 == i) {
                    try {
                        RemoteCallbackList<C41188e> remoteCallbackList = this.f52297h;
                        if (!remoteCallbackList.unregister(remoteCallbackList.getBroadcastItem(i4))) {
                            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback: mCBListOnScanCallback.unregister failed!!!");
                        }
                    } catch (RemoteException e) {
                        e = e;
                        Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback Exception i = " + i4);
                        Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
                    }
                }
            } catch (RemoteException e2) {
                e = e2;
                int i5 = i;
                Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback Exception i = " + i4);
                Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
            }
        }
        this.f52297h.finishBroadcast();
    }

    /* renamed from: h */
    public final void mo23553h(long j, int i, int i2, String str) {
        long j2 = j;
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEndImp taskId = %d, errType = %d, errCode =%d, errMsg = %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str);
        int beginBroadcast = this.f52296g.beginBroadcast();
        C41200j jVar = (C41200j) mo23548c(j2, this.f52296g, beginBroadcast);
        if (jVar == null) {
            Log.m105928w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By taskId = " + j2);
            this.f52296g.finishBroadcast();
            return;
        }
        try {
            jVar.wb0().Jt0(j, i, i2, str, jVar);
        } catch (RemoteException e) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onTaskEnd Error!!!");
            Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
        }
        if (!mo23556j(this.f52296g, j, jVar, beginBroadcast)) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB failed!!!");
        }
        this.f52296g.finishBroadcast();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23554i(android.os.RemoteCallbackList r7, long r8, android.os.IInterface r10) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
            java.lang.String r4 = "registerRemoteCB, ID = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            if (r7 == 0) goto L_0x0067
            if (r10 != 0) goto L_0x0017
            goto L_0x0067
        L_0x0017:
            int r1 = r7.beginBroadcast()
        L_0x001b:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0031
            android.os.IInterface r4 = r7.getBroadcastItem(r1)
            android.os.IBinder r4 = r4.asBinder()
            android.os.IBinder r5 = r10.asBinder()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001b
        L_0x0031:
            if (r1 >= 0) goto L_0x004b
            java.lang.String r1 = "Register a new process in callback list."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.put(r8, r10)
            r7.register(r10, r1)
            r7.finishBroadcast()
            return r0
        L_0x004b:
            java.lang.Object r1 = r7.getBroadcastCookie(r1)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 != 0) goto L_0x005c
            java.lang.String r8 = "null == map"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            r7.finishBroadcast()
            return r3
        L_0x005c:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r1.put(r8, r10)
            r7.finishBroadcast()
            return r0
        L_0x0067:
            java.lang.String r7 = "null == aCallbackList || null == aCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.service.C18696o.mo23554i(android.os.RemoteCallbackList, long, android.os.IInterface):boolean");
    }

    public boolean i60(int i, C41188e eVar) {
        Log.m105919d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothStopScan. bluetoothVersion=%d", Integer.valueOf(i));
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan callback is null. just return");
            return false;
        }
        C21565f fVar = this.f52308v;
        if (fVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan mBLESimpleMgr is null. just return");
            return false;
        }
        boolean c = fVar.mo33797c();
        if (!c) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
            try {
                eVar.mo64196gj(0, -1, "simpleBLE.stopScan failed!!!", "", "", 0, (byte[]) null);
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.onScanCallback failed!!!, %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new Object[0]);
            }
        }
        C117461a.m165683c(C117461a.C117463b.SIMPLE_BLUETOOTH_STOP_SCAN);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23556j(android.os.RemoteCallbackList r6, long r7, android.os.IInterface r9, int r10) {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
            java.lang.String r4 = "unRegisterRemoteCB, device id = %d, aCount = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            if (r6 == 0) goto L_0x0074
            if (r9 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0034
            android.os.IInterface r0 = r6.getBroadcastItem(r10)
            android.os.IBinder r0 = r0.asBinder()
            android.os.IBinder r4 = r9.asBinder()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x001e
        L_0x0034:
            if (r10 >= 0) goto L_0x003c
            java.lang.String r6 = "Can not find callback in callback list"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r2
        L_0x003c:
            java.lang.Object r10 = r6.getBroadcastCookie(r10)
            java.util.HashMap r10 = (java.util.HashMap) r10
            if (r10 != 0) goto L_0x004a
            java.lang.String r6 = "null == map"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r2
        L_0x004a:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r7 = r10.remove(r7)
            android.os.IInterface r7 = (android.os.IInterface) r7
            if (r7 != 0) goto L_0x005c
            java.lang.String r6 = "Cannot find id in the map"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r2
        L_0x005c:
            boolean r7 = r10.isEmpty()
            if (r7 != 0) goto L_0x0063
            return r3
        L_0x0063:
            java.lang.String r7 = "No id is in the map, unregister this process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            boolean r6 = r6.unregister(r9)
            if (r6 != 0) goto L_0x0073
            java.lang.String r7 = "aCallbackList.unregister failed!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x0073:
            return r6
        L_0x0074:
            java.lang.String r6 = "null == aCallbackList || null == aCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.service.C18696o.mo23556j(android.os.RemoteCallbackList, long, android.os.IInterface, int):boolean");
    }

    /* renamed from: mc */
    public long[] mo23557mc() {
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
        this.f52294e.getClass();
        return C53752a.m60248b("conneted_device");
    }

    public void n90(C41197h hVar) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registExDeviceInvokerHandler");
        if (!this.f52300n.register(hVar)) {
            Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.register failed!!!");
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
    }

    /* renamed from: pR */
    public long mo23559pR(C41200j jVar) {
        Log.m105924i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTask");
        if (jVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
            return -1;
        }
        C18711o oVar = this.f52301o;
        if (MAlarmHandler.NEXT_FIRE_INTERVAL == oVar.f52354a) {
            Log.m105928w("MicroMsg.TaskId", "TaskId Data-overrun!!!");
            oVar.f52354a = 0;
        }
        long j = oVar.f52354a;
        oVar.f52354a = 1 + j;
        C18710n nVar = new C18710n(j, jVar);
        MMHandler mMHandler = this.f52302p;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(0, nVar))) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! messsage what  = %d", 0);
            return -1;
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
        return j;
    }

    public boolean pq0(long j) {
        if (j < 0) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", Long.valueOf(j));
            return false;
        }
        MMHandler mMHandler = this.f52302p;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(8, Long.valueOf(j)))) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 8);
            return false;
        }
        C117461a.m165683c(C117461a.C117463b.SIMPLE_BLUETOOTH_DISCONNECT);
        return true;
    }

    public boolean vc0(long j, int i, C41191f fVar) {
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannel deviceId = %d, bluetoothVersion = %d", Long.valueOf(j), Integer.valueOf(i));
        if (fVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == callback");
            return false;
        } else if (j < 0) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", Long.valueOf(j));
            return false;
        } else if (1 == i || i == 0) {
            C18709m mVar = new C18709m(j, i, fVar);
            MMHandler mMHandler = this.f52302p;
            if (!mMHandler.sendMessage(mMHandler.obtainMessage(3, mVar))) {
                Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", 3);
                return false;
            }
            C117461a.m165683c(C117461a.C117463b.START_CHANNEL_SERVICE);
            return true;
        } else {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", Integer.valueOf(i));
            return false;
        }
    }

    /* renamed from: vu */
    public boolean mo23562vu(C41206l lVar) {
        if (lVar == null) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        }
        boolean register = this.f52306t.register(lVar);
        if (!register) {
            Log.m105920e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBluetoothRegistOnRecv error");
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
        return register;
    }

    public boolean wl0(long j) {
        Log.m105925i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannel deviceId = %d", Long.valueOf(j));
        if (j < 0) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", Long.valueOf(j));
            return false;
        }
        MMHandler mMHandler = this.f52302p;
        if (!mMHandler.sendMessage(mMHandler.obtainMessage(4, Long.valueOf(j)))) {
            Log.m105921e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", 4);
            return false;
        }
        C117461a.m165683c(C117461a.C117463b.STOP_CHANNEL_SERVICE);
        return true;
    }
}
