package com.tencent.p014mm.plugin.multitalk.model;

import android.content.Context;
import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import gy3.C87412m;
import j20.C117292a;

/* renamed from: com.tencent.mm.plugin.multitalk.model.u0 */
public final class C105841u0 {

    /* renamed from: a */
    public PowerManager.WakeLock f314789a;

    /* renamed from: b */
    public final SensorController f314790b;

    /* renamed from: c */
    public final SensorController.SensorEventCallBack f314791c = new C105842a(this);

    /* renamed from: com.tencent.mm.plugin.multitalk.model.u0$a */
    public static final class C105842a implements SensorController.SensorEventCallBack {

        /* renamed from: d */
        public final /* synthetic */ C105841u0 f314792d;

        public C105842a(C105841u0 u0Var) {
            this.f314792d = u0Var;
        }

        public final void onSensorEvent(boolean z) {
            Log.m105928w("MicroMsg.ScreenSensorController", "Sensor callback: on=" + z);
            if (z) {
                this.f314792d.mo150820a();
                return;
            }
            C105841u0 u0Var = this.f314792d;
            synchronized (u0Var) {
                Object systemService = MMApplicationContext.getContext().getSystemService("power");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager powerManager = (PowerManager) systemService;
                PowerManager.WakeLock wakeLock = u0Var.f314789a;
                if (wakeLock == null) {
                    wakeLock = powerManager.newWakeLock(32, "wechat:screen multi-talk");
                    u0Var.f314789a = wakeLock;
                }
                PowerManager.WakeLock wakeLock2 = wakeLock;
                if (!wakeLock2.isHeld()) {
                    C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/multitalk/model/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock2.acquire();
                    C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/multitalk/model/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    Log.m105925i("MicroMsg.ScreenSensorController", "after acquire screen off wakelock from object: %s, isHeld: %s", u0Var.toString(), Boolean.valueOf(wakeLock2.isHeld()));
                } else {
                    Log.m105929w("MicroMsg.ScreenSensorController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", u0Var.toString());
                }
            }
        }
    }

    public C105841u0(Context context) {
        C87412m.m108594g(context, "context");
        this.f314790b = new SensorController(context);
    }

    /* renamed from: a */
    public final synchronized void mo150820a() {
        PowerManager.WakeLock wakeLock = this.f314789a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            Log.m105929w("MicroMsg.ScreenSensorController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/multitalk/model/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/multitalk/model/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            Log.m105925i("MicroMsg.ScreenSensorController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), Boolean.valueOf(wakeLock.isHeld()));
            this.f314789a = null;
        }
    }
}
