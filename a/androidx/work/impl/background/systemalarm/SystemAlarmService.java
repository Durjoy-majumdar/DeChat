package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.C113058d;
import java.util.HashMap;
import java.util.WeakHashMap;
import p1014o4.C117693m;
import p1222y4.C118929m;

public class SystemAlarmService extends LifecycleService implements C113058d.C113061c {

    /* renamed from: g */
    public static final String f338381g = C117693m.m165967e("SystemAlarmService");

    /* renamed from: e */
    public C113058d f338382e;

    /* renamed from: f */
    public boolean f338383f;

    /* renamed from: a */
    public final void mo165542a() {
        C113058d dVar = new C113058d(this);
        this.f338382e = dVar;
        if (dVar.f338413p != null) {
            C117693m.m165966c().mo182390b(C113058d.f338403q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f338413p = this;
        }
    }

    /* renamed from: b */
    public void mo165543b() {
        this.f338383f = true;
        C117693m.m165966c().mo182389a(f338381g, "All commands completed in dispatcher", new Throwable[0]);
        String str = C118929m.f356217a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C118929m.f356218b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C117693m.m165966c().mo182392f(C118929m.f356217a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        mo165542a();
        this.f338383f = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f338383f = true;
        this.f338382e.mo165554c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f338383f) {
            C117693m.m165966c().mo182391d(f338381g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f338382e.mo165554c();
            mo165542a();
            this.f338383f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f338382e.mo165552a(intent, i2);
        return 3;
    }
}
