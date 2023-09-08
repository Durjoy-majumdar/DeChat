package zu1;

import android.app.Activity;
import android.content.Context;
import android.os.PowerManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.p475ui.C106447f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import l33.C109247e;
import p492dn.C107054l;
import vu1.C111622e;
import yu1.C112489b;
import yu1.C112497d;
import yu1.C112501g;
import zt3.C119157j;

/* renamed from: zu1.b */
public final class C112689b implements C106447f {

    /* renamed from: d */
    public FlutterVoipMgr f337408d;

    /* renamed from: e */
    public C107054l.C107055a f337409e;

    /* renamed from: f */
    public PowerManager.WakeLock f337410f;

    /* renamed from: zu1.b$a */
    public static final class C112690a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112689b f337411d;

        public C112690a(C112689b bVar, int i) {
            this.f337411d = bVar;
        }

        public final void run() {
            this.f337411d.getClass();
        }
    }

    public C112689b(FlutterVoipMgr flutterVoipMgr) {
        C87412m.m108594g(flutterVoipMgr, "voipMgr");
        this.f337408d = flutterVoipMgr;
    }

    /* renamed from: B */
    public void mo152906B() {
    }

    /* renamed from: F3 */
    public void mo152907F3(int i, String str) {
        if (i == 233) {
            C109247e.xx0().mo152589C(1);
        }
    }

    /* renamed from: G */
    public void mo152908G(int i) {
        ((C119157j) C119157j.f356862d).mo183895z(new C112690a(this, i));
    }

    /* renamed from: G0 */
    public void mo152909G0(int i) {
    }

    /* renamed from: J1 */
    public void mo152912J1(List<C107054l.C107055a> list) {
        C87412m.m108594g(list, "devices");
        C112489b bVar = C112489b.f336867d;
        ArrayList arrayList = new ArrayList();
        for (C107054l.C107055a aVar : list) {
            Log.m105924i("MicroMsg.FlutterVoipService", "onExternalAudioOutputDeviceChanged is " + aVar.f320468a);
            if (aVar.f320469b != null) {
                VoIPFlutterPluginApi.AudioRouteInfo.Builder builder = new VoIPFlutterPluginApi.AudioRouteInfo.Builder();
                String str = aVar.f320469b;
                C87412m.m108591d(str);
                VoIPFlutterPluginApi.AudioRouteInfo.Builder deviceName = builder.setDeviceName(str);
                int i = aVar.f320468a;
                VoIPFlutterPluginApi.AudioRouteInfo build = deviceName.setDeviceType(i != 1 ? i != 2 ? i != 3 ? i != 4 ? VoIPFlutterPluginApi.AudioDevice.speaker : VoIPFlutterPluginApi.AudioDevice.bluetooth : VoIPFlutterPluginApi.AudioDevice.headset : VoIPFlutterPluginApi.AudioDevice.earpiece : VoIPFlutterPluginApi.AudioDevice.speaker).build();
                C87412m.m108593f(build, "Builder().setDeviceName(…e(it.deviceType)).build()");
                arrayList.add(build);
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C112501g(arrayList));
    }

    /* renamed from: Q2 */
    public void mo152915Q2(String str) {
        if (str != null) {
            C112489b.f336867d.mo164232B(C111622e.RiskTip, str);
        }
    }

    /* renamed from: R */
    public void mo152916R(int i) {
        C107054l.C107055a aVar;
        if (i == 1) {
            aVar = new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 0, 4, (C8480h) null);
        } else if (i == 2) {
            aVar = new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncd), 0, 4, (C8480h) null);
        } else if (i == 3) {
            aVar = new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.nce), 0, 4, (C8480h) null);
        } else if (i != 4) {
            aVar = new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncf), 0, 4, (C8480h) null);
        } else {
            aVar = new C107054l.C107055a(i, MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc), 0, 4, (C8480h) null);
        }
        mo152934p0(aVar);
    }

    /* renamed from: T6 */
    public void mo152917T6(long j) {
    }

    /* renamed from: V */
    public void mo152918V(int i) {
    }

    /* renamed from: V0 */
    public void mo152919V0() {
    }

    /* renamed from: Z1 */
    public void mo152920Z1(boolean z) {
        Log.m105918d("MicroMsg.FlutterVoipUI", "tryShowNetStatusWarning isSelfNetBad" + z);
        if (z) {
            C112489b.f336867d.mo164232B(C111622e.SelfNetworkWeak, (String) null);
        } else {
            C112489b.f336867d.mo164232B(C111622e.OtherNetworkWeak, (String) null);
        }
    }

    /* renamed from: a */
    public final synchronized void mo164419a() {
        PowerManager.WakeLock wakeLock = this.f337410f;
        if (wakeLock == null || !wakeLock.isHeld()) {
            Log.m105929w("MicroMsg.FlutterVoipUI", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            Log.m105925i("MicroMsg.FlutterVoipUI", "after release screen off wakelock from object: %s, isHeld: %s", toString(), Boolean.valueOf(wakeLock.isHeld()));
            this.f337410f = null;
            this.f337408d.mo149989X0(true);
        }
    }

    /* renamed from: a5 */
    public void mo152921a5() {
        C112489b.f336867d.mo164232B(C111622e.NetworkUseMobile, (String) null);
    }

    /* renamed from: c2 */
    public void mo152922c2() {
        Log.m105918d("MicroMsg.FlutterVoipUI", "dismissNetStatusWarning");
        C112489b.f336867d.mo164232B(C111622e.NetworkResume, (String) null);
    }

    /* renamed from: e3 */
    public void mo152923e3(int i) {
    }

    /* renamed from: e5 */
    public void mo152924e5(int i, int i2) {
        C112489b.f336867d.mo164234O(i, i2);
    }

    /* renamed from: f0 */
    public void mo152925f0(boolean z, boolean z2) {
    }

    /* renamed from: h0 */
    public void mo152926h0(boolean z) {
    }

    /* renamed from: i3 */
    public Context mo152927i3() {
        Activity activity = this.f337408d.f313170o1;
        if (activity != null) {
            return activity;
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        return context;
    }

    /* renamed from: i5 */
    public void mo152928i5() {
    }

    /* renamed from: k3 */
    public void mo152929k3(boolean z) {
        mo164419a();
    }

    /* renamed from: p0 */
    public void mo152934p0(C107054l.C107055a aVar) {
        int i;
        C87412m.m108594g(aVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
        if (!(this.f337409e == null || (i = aVar.f320468a) == 2)) {
            if (i != 4) {
                if (!this.f337408d.f317102s) {
                    setScreenEnable(true);
                }
            } else if (!this.f337408d.f317102s) {
                setScreenEnable(true);
            }
        }
        this.f337408d.mo152485p0(aVar);
        C112489b bVar = C112489b.f336867d;
        VoIPFlutterPluginApi.AudioRouteInfo.Builder builder = new VoIPFlutterPluginApi.AudioRouteInfo.Builder();
        String str = aVar.f320469b;
        if (str == null) {
            str = "";
        }
        VoIPFlutterPluginApi.AudioRouteInfo.Builder deviceName = builder.setDeviceName(str);
        int i2 = aVar.f320468a;
        VoIPFlutterPluginApi.AudioRouteInfo build = deviceName.setDeviceType(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? VoIPFlutterPluginApi.AudioDevice.speaker : VoIPFlutterPluginApi.AudioDevice.bluetooth : VoIPFlutterPluginApi.AudioDevice.headset : VoIPFlutterPluginApi.AudioDevice.earpiece : VoIPFlutterPluginApi.AudioDevice.speaker).build();
        C87412m.m108593f(build, "Builder()\n            .s…vice.deviceType)).build()");
        ((C119157j) C119157j.f356862d).mo183895z(new C112497d(build, aVar));
        this.f337409e = aVar;
    }

    /* renamed from: r */
    public void mo152935r() {
        boolean z;
        C109247e.xx0().getClass();
        if (v2protocal.f317539Z1 < 900 || v2protocal.f317538Y1) {
            z = false;
        } else {
            z = true;
            v2protocal.f317538Y1 = true;
        }
        if (z) {
            C112489b.f336867d.mo164232B(C111622e.NetworkCostMax, (String) null);
        }
    }

    public void setMute(boolean z) {
    }

    public void setScreenEnable(boolean z) {
        if (!z) {
            synchronized (this) {
                Object systemService = MMApplicationContext.getContext().getSystemService("power");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager powerManager = (PowerManager) systemService;
                PowerManager.WakeLock wakeLock = this.f337410f;
                if (wakeLock == null) {
                    wakeLock = powerManager.newWakeLock(32, "wechat:screen flutter-Lock");
                    this.f337410f = wakeLock;
                }
                PowerManager.WakeLock wakeLock2 = wakeLock;
                if (!wakeLock2.isHeld()) {
                    C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock2.acquire();
                    C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    Log.m105925i("MicroMsg.FlutterVoipUI", "after acquire screen off wakelock from object: %s, isHeld: %s", toString(), Boolean.valueOf(wakeLock2.isHeld()));
                    this.f337408d.mo149989X0(false);
                } else {
                    Log.m105929w("MicroMsg.FlutterVoipUI", "repeatedly acquire screen off wakelock from object: %s, drop this call.", toString());
                }
            }
            return;
        }
        mo164419a();
    }
}
