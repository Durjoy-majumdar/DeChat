package p212oe;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.util.SparseArray;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import oa1.C117731d;
import p1177ce.C113287a;
import p269xe.C118872b;
import p269xe.C91179e;
import p269xe.e$b$a$$o;
import p269xe.e$b$b$$a;
import p329d3.C58104c;
import p737wf.C38088a;
import p933be.C113159b;
import p933be.C113173i;
import p981ie.C117159b;
import zt3.C119157j;

/* renamed from: oe.j$$e */
public class j$$e extends C113159b.C113164d.C113165a {

    /* renamed from: b */
    public long f352180b = 0;

    /* renamed from: c */
    public final Runnable f352181c;

    /* renamed from: d */
    public final /* synthetic */ Context f352182d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j$$e(boolean z, Context context) {
        super(z);
        this.f352182d = context;
        this.f352181c = new j$$e$$a(context);
    }

    /* renamed from: h */
    public static /* synthetic */ void m166104h(C113159b.C113163c cVar, Context context) {
        WifiInfo wifiInfo;
        int i;
        int i2;
        int i3 = 0;
        Log.m105924i("Matrix.battery.LifeCycle", "chargingWatt = " + (cVar.mo165678c() ? C117159b.m165209j(context) : 0));
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                ArrayList arrayList = new ArrayList();
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    if (networkInfo != null && (networkInfo.isConnected() || networkInfo.isConnectedOrConnecting())) {
                        arrayList.add(Arrays.asList(new C58104c[]{new C58104c(Integer.valueOf(networkInfo.getType()), String.valueOf(networkInfo.getTypeName())), new C58104c(Integer.valueOf(networkInfo.getSubtype()), String.valueOf(networkInfo.getSubtypeName()))}));
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities != null) {
                            i = networkCapabilities.getLinkUpstreamBandwidthKbps() / 8;
                            i2 = networkCapabilities.getLinkDownstreamBandwidthKbps() / 8;
                        } else {
                            i2 = 0;
                            i = 0;
                        }
                        Log.m105924i("Matrix.battery.LifeCycle", "networkInfo = " + networkInfo.getType() + "(" + networkInfo.getTypeName() + "), " + networkInfo.getSubtype() + "(" + networkInfo.getSubtypeName() + "), speed = " + i + "/" + i2);
                    }
                }
                C117762j.f352169g = arrayList;
            } catch (Throwable th) {
                Log.m105928w("Matrix.battery.LifeCycle", "dump connected Networks failed: " + th.getMessage());
            }
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (!(wifiManager == null || (wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/matrix/manager/BatteryLifecycleMonitor$3", "lambda$onBatteryPowerChanged$4", "(Lcom/tencent/matrix/batterycanary/BatteryEventDelegate$BatteryState;Landroid/content/Context;)V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) == null)) {
                int rssi = wifiInfo.getRssi();
                if (Build.VERSION.SDK_INT >= 30) {
                    i3 = wifiManager.calculateSignalLevel(rssi);
                }
                Log.m105924i("Matrix.battery.LifeCycle", "wifiStrength: " + i3 + "/" + rssi);
            }
        } catch (Throwable th4) {
            Log.m105928w("Matrix.battery.LifeCycle", "dump wifi strength failed: " + th4.getMessage());
        }
        C117774q.m166123f(context);
    }

    /* renamed from: b */
    public boolean mo165685b(C113159b.C113163c cVar, int i) {
        int i2 = i;
        if (b$$f.m166058c()) {
            C113287a a = C113287a.m155093a();
            if (a.f338975m) {
                String f = C118872b.m167609f();
                int c = a.mo165839c();
                int d = a.mo165840d();
                e$b$b$$a e_b_b__a = new e$b$b$$a();
                SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                e_b_b__a.accept(linkedHashMap);
                String b = C91179e.C91181b.m114438b(linkedHashMap);
                Log.m105924i("Matrix.battery.BatteryReporter", "#statSamplingData");
                C91179e.C91181b.m114437a(0, 5, f, b, c, d, "samplingData", 0, "", 0, "", 0, a.f338971i, "", (long) a.f338964b, (long) a.f338967e, (long) a.f338972j, "");
            }
        }
        if (i2 >= 430 && ((C117750b.m166049g() || i2 >= 450) && MMApplicationContext.isMainProcess() && !AppExplicitBackgroundOwner.INSTANCE.isBackground())) {
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            C113287a a2 = C113287a.m155093a();
            String f2 = C118872b.m167609f();
            String a3 = C91179e.m114432a();
            e$b$a$$o e_b_a__o = new e$b$a$$o();
            SparseArray<Integer> sparseArray2 = C91179e.C91181b.f261436a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            e_b_a__o.accept(linkedHashMap2);
            String b2 = C91179e.C91181b.m114438b(linkedHashMap2);
            int q = C117159b.m165216q(MMApplicationContext.getContext());
            float a4 = C38088a.f100678a ? C38088a.m41721a() : 0.0f;
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportThermalException");
            C91179e.C91181b.m114437a(1, 5, f2, b2, a2.mo165839c(), a2.mo165840d(), "thermalException", (long) q, "oppo", (long) ((int) a4), "", (long) i2, a3, "", 0, 0, 0, "");
            C117783y yVar = C117783y.f352302f;
            yVar.getClass();
            try {
                if (C117731d.m166007c().mo182444f("clicfg_battery_thermal_enable", "1", false, true).equals("1")) {
                    C113173i iVar = yVar.f352307d;
                    if (iVar != null) {
                        Handler handler = iVar.f338613h.f339059f;
                        handler.post(new y$$a(yVar, handler));
                    }
                } else {
                    Log.m105928w("MicroMsg.ThermalExceptionMonitor", "monitor disabled");
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo165686c(C113159b.C113163c cVar, int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new j$$e$$e(cVar, this.f352182d));
        return false;
    }

    /* renamed from: e */
    public boolean mo165683e(C113159b.C113163c cVar, long j) {
        Log.m105924i("Matrix.battery.LifeCycle", "#onAppLowEnergy");
        ((C119157j) C119157j.f356862d).mo183875f(new j$$e$$b(cVar, j));
        return false;
    }

    /* renamed from: f */
    public boolean mo165687f(C113159b.C113163c cVar) {
        Log.m105924i("Matrix.battery.LifeCycle", "#onBatteryFullCharged");
        ((C119157j) C119157j.f356862d).mo183875f(new j$$e$$d(this));
        return false;
    }

    /* renamed from: g */
    public boolean mo165688g(C113159b.C113163c cVar, String str) {
        Log.m105924i("Matrix.battery.LifeCycle", "#onStateChanged");
        ((C119157j) C119157j.f356862d).mo183875f(new j$$e$$c(this, cVar, str, this.f352182d));
        return false;
    }
}
