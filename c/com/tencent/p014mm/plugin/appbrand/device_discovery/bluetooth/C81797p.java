package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import bj0.C79708a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import ny3.C89104m;
import p225rc.C89918i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk0.C90216b;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p */
public final class C81797p {

    /* renamed from: a */
    public static final C81797p f240015a;

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f240016b;

    /* renamed from: c */
    public static final boolean f240017c;

    /* renamed from: d */
    public static volatile C81808y f240018d;

    /* renamed from: e */
    public static final C13601g f240019e = C36568h.m40985a(C81798a.f240023d);

    /* renamed from: f */
    public static final ConcurrentHashMap<String, BluetoothGatt> f240020f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public static final C13601g f240021g = C36568h.m40985a(C81799b.f240024d);

    /* renamed from: h */
    public static final boolean f240022h = C90216b.m112934c();

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p$a */
    public static final class C81798a extends C87413o implements C32224a<C81769xff31332d> {

        /* renamed from: d */
        public static final C81798a f240023d = new C81798a();

        public C81798a() {
            super(0);
        }

        public Object invoke() {
            return new C81769xff31332d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p$b */
    public static final class C81799b extends C87413o implements C32224a<C81800q> {

        /* renamed from: d */
        public static final C81799b f240024d = new C81799b();

        public C81799b() {
            super(0);
        }

        public Object invoke() {
            return new C81800q();
        }
    }

    static {
        C89104m<Object>[] mVarArr = {C24560g0.m30726b(new C24570s(C81797p.class, "trustAutoConnectWillBeCanceledAfterCallbackDisConnected", "getTrustAutoConnectWillBeCanceledAfterCallbackDisConnected()Z", 0))};
        f240016b = mVarArr;
        C81797p pVar = new C81797p();
        f240015a = pVar;
        boolean booleanValue = ((Boolean) new C89918i(Boolean.FALSE).mo124238b(pVar, mVarArr[0])).booleanValue();
        Log.m105924i("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectWillBeCanceledAfterCallbackDisConnected: " + booleanValue);
        f240017c = booleanValue;
    }

    /* renamed from: a */
    public final boolean mo114177a(String str, C81809z zVar) {
        C87412m.m108594g(str, "deviceId");
        C87412m.m108594g(zVar, "gattConnectListener");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, deviceId: " + str);
        BluetoothAdapter d = C90216b.m112935d();
        BluetoothDevice remoteDevice = d != null ? d.getRemoteDevice(str) : null;
        if (remoteDevice == null) {
            aVar.mo109822b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, bluetoothDevice is null");
            return false;
        }
        try {
            Context context = MMApplicationContext.getContext();
            C81800q qVar = (C81800q) ((C36570n) f240021g).getValue();
            qVar.mo114180a(str, zVar);
            BluetoothGatt connectGatt = Build.VERSION.SDK_INT >= 23 ? remoteDevice.connectGatt(context, true, qVar, 2) : remoteDevice.connectGatt(context, true, qVar);
            if (connectGatt == null) {
                return false;
            }
            f240020f.put(str, connectGatt);
            return true;
        } catch (Exception e) {
            C79708a aVar2 = C79708a.f233619a;
            aVar2.mo109822b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, connectGattCompat fail since " + e);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo114178b(String str) {
        C87412m.m108594g(str, "deviceId");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disAutoConnect, deviceId: " + str);
        BluetoothGatt remove = f240020f.remove(str);
        boolean z = false;
        if (remove == null) {
            return false;
        }
        C81800q qVar = (C81800q) ((C36570n) f240021g).getValue();
        qVar.getClass();
        if (qVar.f240025a.remove(str) != null) {
            z = true;
        }
        aVar.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "unBind, deviceId: " + str + ", originBond: " + z);
        C23564m.m28136f(new C81796o(remove));
        return true;
    }

    /* renamed from: c */
    public final void mo114179c(C81808y yVar) {
        f240018d = yVar;
        if (yVar != null) {
            C81769xff31332d bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 = (C81769xff31332d) ((C36570n) f240019e).getValue();
            bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1.getClass();
            C79708a.f233619a.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "enable#sysBluetoothStateChangeListener");
            bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1.mo114152a();
            Context context = MMApplicationContext.getContext();
            if (context != null) {
                context.registerReceiver(bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                return;
            }
            return;
        }
        C81769xff31332d bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12 = (C81769xff31332d) ((C36570n) f240019e).getValue();
        bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12.getClass();
        C79708a.f233619a.mo109821a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener");
        try {
            Context context2 = MMApplicationContext.getContext();
            if (context2 != null) {
                context2.unregisterReceiver(bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12);
            }
        } catch (Exception e) {
            C79708a aVar = C79708a.f233619a;
            aVar.mo109822b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener, unregister fail since " + e);
        }
    }
}
