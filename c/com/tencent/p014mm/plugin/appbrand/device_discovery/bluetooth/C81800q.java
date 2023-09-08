package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.bluetooth.BluetoothGattCallback;
import bj0.C79708a;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.q */
public final class C81800q extends BluetoothGattCallback {

    /* renamed from: a */
    public final ConcurrentHashMap<String, C81809z> f240025a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final BluetoothGattCallback mo114180a(String str, C81809z zVar) {
        C87412m.m108594g(str, "deviceId");
        C87412m.m108594g(zVar, "gattConnectListener");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "bindOnce, deviceId: " + str);
        this.f240025a.put(str, zVar);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.getDevice();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            android.bluetooth.BluetoothDevice r5 = r5.getDevice()
            if (r5 == 0) goto L_0x000e
            java.lang.String r5 = r5.getAddress()
            goto L_0x000f
        L_0x000e:
            r5 = r0
        L_0x000f:
            bj0.a r1 = bj0.C79708a.f233619a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onConnectionStateChange, gatt("
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "), status: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", newState: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery"
            r1.mo109821a(r3, r2)
            if (r5 != 0) goto L_0x003a
            return
        L_0x003a:
            r1 = 2
            if (r1 != r7) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0044
        L_0x0040:
            if (r7 != 0) goto L_0x0044
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0044:
            if (r0 == 0) goto L_0x00d2
            r0.booleanValue()
            if (r6 != 0) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            boolean r7 = r0.booleanValue()
            if (r7 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0068
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z> r6 = r4.f240025a
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z r6 = (com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81809z) r6
            if (r6 == 0) goto L_0x00d2
            boolean r7 = r0.booleanValue()
            r6.mo114171a(r5, r7)
            goto L_0x00d2
        L_0x0068:
            boolean r7 = r0.booleanValue()
            if (r7 != 0) goto L_0x00a2
            if (r6 != 0) goto L_0x00a2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z> r6 = r4.f240025a
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z r6 = (com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81809z) r6
            if (r6 == 0) goto L_0x0081
            boolean r7 = r0.booleanValue()
            r6.mo114171a(r5, r7)
        L_0x0081:
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240015a
            r6.getClass()
            boolean r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240017c
            if (r6 == 0) goto L_0x00d2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z> r6 = r4.f240025a
            r6.remove(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.bluetooth.BluetoothGatt> r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240020f
            java.lang.Object r5 = r6.remove(r5)
            android.bluetooth.BluetoothGatt r5 = (android.bluetooth.BluetoothGatt) r5
            if (r5 == 0) goto L_0x00d2
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o r6 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o
            r6.<init>(r5)
            zp3.C23564m.m28136f(r6)
            goto L_0x00d2
        L_0x00a2:
            boolean r7 = r0.booleanValue()
            if (r7 == 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00b2
        L_0x00aa:
            boolean r7 = r0.booleanValue()
            if (r7 != 0) goto L_0x00d2
            if (r6 == 0) goto L_0x00d2
        L_0x00b2:
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240015a
            r6.getClass()
            boolean r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240017c
            if (r6 == 0) goto L_0x00d2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z> r6 = r4.f240025a
            r6.remove(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.bluetooth.BluetoothGatt> r6 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81797p.f240020f
            java.lang.Object r5 = r6.remove(r5)
            android.bluetooth.BluetoothGatt r5 = (android.bluetooth.BluetoothGatt) r5
            if (r5 == 0) goto L_0x00d2
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o r6 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o
            r6.<init>(r5)
            zp3.C23564m.m28136f(r6)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81800q.onConnectionStateChange(android.bluetooth.BluetoothGatt, int, int):void");
    }
}
