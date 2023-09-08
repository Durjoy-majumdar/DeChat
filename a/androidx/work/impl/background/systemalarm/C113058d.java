package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p1014o4.C117693m;
import p1169a5.C112757a;
import p1169a5.C112758b;
import p1206p4.C117969b;
import p1206p4.C117971d;
import p1206p4.C117979k;
import p1222y4.C118925j;
import p1222y4.C118929m;
import p1222y4.C118936r;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public class C113058d implements C117969b {

    /* renamed from: q */
    public static final String f338403q = C117693m.m165967e("SystemAlarmDispatcher");

    /* renamed from: d */
    public final Context f338404d;

    /* renamed from: e */
    public final C112757a f338405e;

    /* renamed from: f */
    public final C118936r f338406f = new C118936r();

    /* renamed from: g */
    public final C117971d f338407g;

    /* renamed from: h */
    public final C117979k f338408h;

    /* renamed from: i */
    public final C113055a f338409i;

    /* renamed from: j */
    public final Handler f338410j;

    /* renamed from: n */
    public final List<Intent> f338411n;

    /* renamed from: o */
    public Intent f338412o;

    /* renamed from: p */
    public C113061c f338413p;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class C113059a implements Runnable {
        public C113059a() {
        }

        public void run() {
            C113062d dVar;
            C113058d dVar2;
            synchronized (C113058d.this.f338411n) {
                C113058d dVar3 = C113058d.this;
                dVar3.f338412o = (Intent) ((ArrayList) dVar3.f338411n).get(0);
            }
            Intent intent = C113058d.this.f338412o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C113058d.this.f338412o.getIntExtra("KEY_START_ID", 0);
                C117693m c = C117693m.m165966c();
                String str = C113058d.f338403q;
                c.mo182389a(str, String.format("Processing command %s, %s", new Object[]{C113058d.this.f338412o, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a = C118929m.m167680a(C113058d.this.f338404d, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C117693m.m165966c().mo182389a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    C117292a.m165357c(a, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    a.acquire();
                    C117292a.m165359e(a, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    C113058d dVar4 = C113058d.this;
                    dVar4.f338409i.mo165544c(dVar4.f338412o, intExtra, dVar4);
                    C117693m.m165966c().mo182389a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    PowerManager.WakeLock wakeLock = a;
                    C117292a.m165357c(wakeLock, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    a.release();
                    C117292a.m165359e(wakeLock, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    dVar2 = C113058d.this;
                    dVar = new C113062d(dVar2);
                } catch (Throwable th) {
                    C117693m.m165966c().mo182389a(C113058d.f338403q, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    PowerManager.WakeLock wakeLock2 = a;
                    C117292a.m165357c(wakeLock2, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    a.release();
                    C117292a.m165359e(wakeLock2, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    C113058d dVar5 = C113058d.this;
                    dVar5.mo165555d(new C113062d(dVar5));
                    throw th;
                }
                dVar2.mo165555d(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class C113060b implements Runnable {

        /* renamed from: d */
        public final C113058d f338415d;

        /* renamed from: e */
        public final Intent f338416e;

        /* renamed from: f */
        public final int f338417f;

        public C113060b(C113058d dVar, Intent intent, int i) {
            this.f338415d = dVar;
            this.f338416e = intent;
            this.f338417f = i;
        }

        public void run() {
            this.f338415d.mo165552a(this.f338416e, this.f338417f);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface C113061c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class C113062d implements Runnable {

        /* renamed from: d */
        public final C113058d f338418d;

        public C113062d(C113058d dVar) {
            this.f338418d = dVar;
        }

        public void run() {
            boolean z;
            C113058d dVar = this.f338418d;
            dVar.getClass();
            C117693m c = C117693m.m165966c();
            String str = C113058d.f338403q;
            c.mo182389a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.mo165553b();
            synchronized (dVar.f338411n) {
                boolean z2 = true;
                if (dVar.f338412o != null) {
                    C117693m.m165966c().mo182389a(str, String.format("Removing command %s", new Object[]{dVar.f338412o}), new Throwable[0]);
                    if (((Intent) ((ArrayList) dVar.f338411n).remove(0)).equals(dVar.f338412o)) {
                        dVar.f338412o = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C118925j jVar = ((C112758b) dVar.f338405e).f337642a;
                C113055a aVar = dVar.f338409i;
                synchronized (aVar.f338387f) {
                    z = !((HashMap) aVar.f338386e).isEmpty();
                }
                if (!z) {
                    if (((ArrayList) dVar.f338411n).isEmpty()) {
                        synchronized (jVar.f356206f) {
                            if (jVar.f356204d.isEmpty()) {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            C117693m.m165966c().mo182389a(str, "No more commands & intents.", new Throwable[0]);
                            C113061c cVar = dVar.f338413p;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).mo165543b();
                            }
                        }
                    }
                }
                if (!((ArrayList) dVar.f338411n).isEmpty()) {
                    dVar.mo165556f();
                }
            }
        }
    }

    public C113058d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f338404d = applicationContext;
        this.f338409i = new C113055a(applicationContext);
        C117979k b = C117979k.m166386b(context);
        this.f338408h = b;
        C117971d dVar = b.f352609f;
        this.f338407g = dVar;
        this.f338405e = b.f352607d;
        dVar.mo182722a(this);
        this.f338411n = new ArrayList();
        this.f338412o = null;
        this.f338410j = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean mo165552a(Intent intent, int i) {
        boolean z;
        C117693m c = C117693m.m165966c();
        String str = f338403q;
        boolean z2 = false;
        c.mo182389a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo165553b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C117693m.m165966c().mo182392f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            mo165553b();
            synchronized (this.f338411n) {
                Iterator it = ((ArrayList) this.f338411n).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f338411n) {
            if (!((ArrayList) this.f338411n).isEmpty()) {
                z2 = true;
            }
            ((ArrayList) this.f338411n).add(intent);
            if (!z2) {
                mo165556f();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo165553b() {
        if (this.f338410j.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    public void mo165554c() {
        C117693m.m165966c().mo182389a(f338403q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        C117971d dVar = this.f338407g;
        synchronized (dVar.f352583q) {
            ((ArrayList) dVar.f352582p).remove(this);
        }
        C118936r rVar = this.f338406f;
        if (!rVar.f356239a.isShutdown()) {
            rVar.f356239a.shutdownNow();
        }
        this.f338413p = null;
    }

    /* renamed from: d */
    public void mo165555d(Runnable runnable) {
        this.f338410j.post(runnable);
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        Context context = this.f338404d;
        String str2 = C113055a.f338384g;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        mo165555d(new C113060b(this, intent, 0));
    }

    /* renamed from: f */
    public final void mo165556f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        mo165553b();
        PowerManager.WakeLock a = C118929m.m167680a(this.f338404d, "ProcessCommand");
        try {
            C117292a.m165357c(a, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            a.acquire();
            C117292a.m165359e(a, "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher", "processCommand", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            ((C112758b) this.f338408h.f352607d).mo164514a(new C113059a());
        } finally {
            str = "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher";
            str2 = "processCommand";
            str3 = "()V";
            str4 = "android/os/PowerManager$WakeLock_EXEC_";
            str5 = "release";
            str6 = "()V";
            PowerManager.WakeLock wakeLock = a;
            C117292a.m165357c(wakeLock, str, str2, str3, str4, str5, str6);
            a.release();
            str7 = "androidx/work/impl/background/systemalarm/SystemAlarmDispatcher";
            str8 = "processCommand";
            str9 = "()V";
            str10 = "android/os/PowerManager$WakeLock_EXEC_";
            str11 = "release";
            str12 = "()V";
            C117292a.m165359e(wakeLock, str7, str8, str9, str10, str11, str12);
        }
    }
}
