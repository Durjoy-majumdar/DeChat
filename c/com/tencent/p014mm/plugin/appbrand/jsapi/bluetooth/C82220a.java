package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sk0.C90216b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a */
public class C82220a {

    /* renamed from: a */
    public static Map<String, C82225c> f241093a = new HashMap();

    /* renamed from: b */
    public static BroadcastReceiver f241094b;

    /* renamed from: c */
    public static boolean f241095c;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a$a */
    public class C82221a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.m105924i("MicroMsg.Ble.BleManager", "Receive intent failed");
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                int state = defaultAdapter.getState();
                boolean z = true;
                Log.m105919d("MicroMsg.Ble.BleManager", "state:%d", Integer.valueOf(state));
                if (state != 12) {
                    z = false;
                }
                boolean z2 = C82220a.f241095c;
                if ((z2 && !z) || (!z2 && z)) {
                    for (C82225c cVar : ((HashMap) C82220a.f241093a).values()) {
                        Iterator it = ((CopyOnWriteArrayList) cVar.f241103g).iterator();
                        while (it.hasNext()) {
                            ((C82225c.C82226a) it.next()).onBluetoothStateChange(z);
                        }
                    }
                }
                C82220a.f241095c = z;
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static synchronized qk0.C89696k m100946a(java.lang.String r5) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a.class
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.Ble.BleManager"
            java.lang.String r2 = "close appId:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0083 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0083 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c> r1 = f241093a     // Catch:{ all -> 0x0083 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0083 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x001e
            qk0.k r5 = qk0.C89696k.f257968e     // Catch:{ all -> 0x0083 }
            monitor-exit(r0)
            return r5
        L_0x001e:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c> r1 = f241093a     // Catch:{ all -> 0x0083 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.remove(r5)     // Catch:{ all -> 0x0083 }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c) r1     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.plugin.appbrand.C83231l.m102144e(r5, r1)     // Catch:{ all -> 0x0083 }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e r2 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82232e.f241129a     // Catch:{ all -> 0x0083 }
            r2.mo114630b(r5, r1)     // Catch:{ all -> 0x0083 }
            r5 = 0
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = "MicroMsg.Ble.BleManager"
            java.lang.String r2 = "close, bleWorker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0083 }
            goto L_0x0056
        L_0x003b:
            monitor-enter(r1)     // Catch:{ all -> 0x0083 }
            mk0.b r2 = r1.f241102f     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x0045
            r2.mo123179b()     // Catch:{ all -> 0x0080 }
            r1.f241102f = r5     // Catch:{ all -> 0x0080 }
        L_0x0045:
            java.util.List<qk0.i> r2 = r1.f241104h     // Catch:{ all -> 0x0080 }
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch:{ all -> 0x0080 }
            r2.clear()     // Catch:{ all -> 0x0080 }
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c$a> r2 = r1.f241103g     // Catch:{ all -> 0x0080 }
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch:{ all -> 0x0080 }
            r2.clear()     // Catch:{ all -> 0x0080 }
            r1.f241101e = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
        L_0x0056:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c> r1 = f241093a     // Catch:{ all -> 0x0083 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0083 }
            int r1 = r1.size()     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x007c
            monitor-enter(r0)     // Catch:{ all -> 0x0083 }
            android.content.BroadcastReceiver r1 = f241094b     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "MicroMsg.Ble.BleManager"
            java.lang.String r2 = "bluetoothStateListener uninit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0079 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0079 }
            android.content.BroadcastReceiver r2 = f241094b     // Catch:{ all -> 0x0079 }
            r1.unregisterReceiver(r2)     // Catch:{ all -> 0x0079 }
            f241094b = r5     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007c
        L_0x0079:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            throw r5     // Catch:{ all -> 0x0083 }
        L_0x007c:
            qk0.k r5 = qk0.C89696k.f257968e     // Catch:{ all -> 0x0083 }
            monitor-exit(r0)
            return r5
        L_0x0080:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r5     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a.m100946a(java.lang.String):qk0.k");
    }

    /* renamed from: b */
    public static synchronized C82225c m100947b(String str) {
        C82225c cVar;
        synchronized (C82220a.class) {
            cVar = (C82225c) ((HashMap) f241093a).get(str);
        }
        return cVar;
    }

    /* renamed from: c */
    public static synchronized void m100948c() {
        synchronized (C82220a.class) {
            if (f241094b == null) {
                Log.m105924i("MicroMsg.Ble.BleManager", "bluetoothStateListener init");
                f241094b = new C82221a();
                MMApplicationContext.getContext().registerReceiver(f241094b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                f241095c = C90216b.m112933b();
            }
        }
    }
}
