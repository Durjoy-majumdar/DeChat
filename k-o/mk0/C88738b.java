package mk0;

import android.content.Context;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import nk0.C89004f;
import rk0.C89982b;
import rk0.C89983c;
import rk0.C89989d;

/* renamed from: mk0.b */
public class C88738b {

    /* renamed from: a */
    public final C89004f f256136a;

    /* renamed from: b */
    public final C89983c f256137b;

    public C88738b(Context context) {
        this.f256136a = new C89004f(context);
        this.f256137b = new C89983c(context);
    }

    /* renamed from: a */
    public void mo123178a() {
        C89004f fVar = this.f256136a;
        synchronized (fVar) {
            Log.m105925i("MicroMsg.Ble.BleConnectMgr", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new Object[0]);
            if (fVar.f256596b == null) {
                fVar.f256596b = new ConcurrentHashMap();
            }
            fVar.f256596b.clear();
        }
        C89983c cVar = this.f256137b;
        synchronized (cVar) {
            Log.m105925i(cVar.f258545a, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new Object[0]);
            cVar.f258550f.set(true);
            cVar.f258558n = new C89982b(cVar.f258545a);
            cVar.f258548d = new HashMap();
            cVar.f258552h = new ArrayList();
            cVar.f258547c = new C89989d(cVar);
            cVar.mo124308b();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo123179b() {
        /*
            r6 = this;
            nk0.f r0 = r6.f256136a
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.Ble.BleConnectMgr"
            java.lang.String r2 = "uninit"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x00a3 }
            java.util.Map<java.lang.String, nk0.g> r1 = r0.f256596b     // Catch:{ all -> 0x00a3 }
            r2 = 0
            if (r1 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x00a3 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x001d:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x002d
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00a3 }
            nk0.g r4 = (nk0.C89007g) r4     // Catch:{ all -> 0x00a3 }
            r4.mo123381p()     // Catch:{ all -> 0x00a3 }
            goto L_0x001d
        L_0x002d:
            java.util.Map<java.lang.String, nk0.g> r1 = r0.f256596b     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x00a3 }
            r1.clear()     // Catch:{ all -> 0x00a3 }
            r0.f256596b = r2     // Catch:{ all -> 0x00a3 }
        L_0x0036:
            r0.f256597c = r2     // Catch:{ all -> 0x00a3 }
            r0.f256598d = r2     // Catch:{ all -> 0x00a3 }
            r0.f256599e = r2     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)
            rk0.c r0 = r6.f256137b
            monitor-enter(r0)
            java.lang.String r1 = r0.f258545a     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "uninit"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ all -> 0x00a0 }
            r0.mo124310d()     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f258550f     // Catch:{ all -> 0x00a0 }
            r1.set(r3)     // Catch:{ all -> 0x00a0 }
            rk0.h r1 = rk0.C89995h.f258572a     // Catch:{ all -> 0x00a0 }
            r0.f258558n = r1     // Catch:{ all -> 0x00a0 }
            java.util.Map<java.lang.String, qk0.d> r1 = r0.f258548d     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x005f
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x00a0 }
            r1.clear()     // Catch:{ all -> 0x00a0 }
        L_0x005f:
            java.util.List<qk0.d> r1 = r0.f258552h     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0068
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00a0 }
            r1.clear()     // Catch:{ all -> 0x00a0 }
        L_0x0068:
            android.bluetooth.BluetoothAdapter r1 = sk0.C90216b.m112935d()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x007f
            android.bluetooth.BluetoothAdapter r1 = sk0.C90216b.m112935d()     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.isDiscovering()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x007f
            android.bluetooth.BluetoothAdapter r1 = sk0.C90216b.m112935d()     // Catch:{ all -> 0x00a0 }
            r1.cancelDiscovery()     // Catch:{ all -> 0x00a0 }
        L_0x007f:
            monitor-enter(r0)     // Catch:{ all -> 0x00a0 }
            android.content.BroadcastReceiver r1 = r0.f258554j     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0098
            android.content.Context r1 = r0.f258546b     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r0.f258545a     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "bluetoothStateListener uninit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x009d }
            android.content.Context r1 = r0.f258546b     // Catch:{ all -> 0x009d }
            android.content.BroadcastReceiver r3 = r0.f258554j     // Catch:{ all -> 0x009d }
            r1.unregisterReceiver(r3)     // Catch:{ all -> 0x009d }
            r0.f258554j = r2     // Catch:{ all -> 0x009d }
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            r0.f258547c = r2     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)
            return
        L_0x009d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.C88738b.mo123179b():void");
    }
}
