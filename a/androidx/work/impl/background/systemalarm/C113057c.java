package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.C113058d;
import j20.C117292a;
import java.util.Collections;
import java.util.List;
import p1014o4.C117693m;
import p1206p4.C117969b;
import p1214t4.C118384c;
import p1214t4.C118385d;
import p1221x4.C118847o;
import p1221x4.C118850q;
import p1222y4.C118929m;
import p1222y4.C118936r;

/* renamed from: androidx.work.impl.background.systemalarm.c */
public class C113057c implements C118384c, C117969b, C118936r.C118938b {

    /* renamed from: p */
    public static final String f338393p = C117693m.m165967e("DelayMetCommandHandler");

    /* renamed from: d */
    public final Context f338394d;

    /* renamed from: e */
    public final int f338395e;

    /* renamed from: f */
    public final String f338396f;

    /* renamed from: g */
    public final C113058d f338397g;

    /* renamed from: h */
    public final C118385d f338398h;

    /* renamed from: i */
    public final Object f338399i = new Object();

    /* renamed from: j */
    public int f338400j = 0;

    /* renamed from: n */
    public PowerManager.WakeLock f338401n;

    /* renamed from: o */
    public boolean f338402o = false;

    public C113057c(Context context, int i, String str, C113058d dVar) {
        this.f338394d = context;
        this.f338395e = i;
        this.f338397g = dVar;
        this.f338396f = str;
        this.f338398h = new C118385d(context, dVar.f338405e, this);
    }

    /* renamed from: a */
    public void mo165546a(String str) {
        C117693m.m165966c().mo182389a(f338393p, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        mo165551g();
    }

    /* renamed from: b */
    public final void mo165547b() {
        synchronized (this.f338399i) {
            this.f338398h.mo183176c();
            this.f338397g.f338406f.mo183614b(this.f338396f);
            PowerManager.WakeLock wakeLock = this.f338401n;
            if (wakeLock != null && wakeLock.isHeld()) {
                C117693m.m165966c().mo182389a(f338393p, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f338401n, this.f338396f}), new Throwable[0]);
                PowerManager.WakeLock wakeLock2 = this.f338401n;
                C117292a.m165357c(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "cleanUp", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        }
    }

    /* renamed from: c */
    public void mo165548c() {
        this.f338401n = C118929m.m167680a(this.f338394d, String.format("%s (%s)", new Object[]{this.f338396f, Integer.valueOf(this.f338395e)}));
        C117693m c = C117693m.m165966c();
        String str = f338393p;
        c.mo182389a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f338401n, this.f338396f}), new Throwable[0]);
        PowerManager.WakeLock wakeLock = this.f338401n;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        C117292a.m165359e(wakeLock2, "androidx/work/impl/background/systemalarm/DelayMetCommandHandler", "handleProcessWork", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        C118847o i = ((C118850q) this.f338397g.f338408h.f352606c.mo165532n()).mo183560i(this.f338396f);
        if (i == null) {
            mo165551g();
            return;
        }
        boolean b = i.mo183545b();
        this.f338402o = b;
        if (!b) {
            C117693m.m165966c().mo182389a(str, String.format("No constraints for %s", new Object[]{this.f338396f}), new Throwable[0]);
            mo165550f(Collections.singletonList(this.f338396f));
            return;
        }
        this.f338398h.mo183175b(Collections.singletonList(i));
    }

    /* renamed from: d */
    public void mo165549d(List<String> list) {
        mo165551g();
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        C117693m.m165966c().mo182389a(f338393p, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        mo165547b();
        if (z) {
            Intent b = C113055a.m154701b(this.f338394d, this.f338396f);
            C113058d dVar = this.f338397g;
            dVar.mo165555d(new C113058d.C113060b(dVar, b, this.f338395e));
        }
        if (this.f338402o) {
            Intent intent = new Intent(this.f338394d, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            C113058d dVar2 = this.f338397g;
            dVar2.mo165555d(new C113058d.C113060b(dVar2, intent, this.f338395e));
        }
    }

    /* renamed from: f */
    public void mo165550f(List<String> list) {
        if (list.contains(this.f338396f)) {
            synchronized (this.f338399i) {
                if (this.f338400j == 0) {
                    this.f338400j = 1;
                    C117693m.m165966c().mo182389a(f338393p, String.format("onAllConstraintsMet for %s", new Object[]{this.f338396f}), new Throwable[0]);
                    if (this.f338397g.f338407g.mo182725f(this.f338396f, (WorkerParameters.C113037a) null)) {
                        this.f338397g.f338406f.mo183613a(this.f338396f, 600000, this);
                    } else {
                        mo165547b();
                    }
                } else {
                    C117693m.m165966c().mo182389a(f338393p, String.format("Already started work for %s", new Object[]{this.f338396f}), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo165551g() {
        synchronized (this.f338399i) {
            if (this.f338400j < 2) {
                this.f338400j = 2;
                C117693m c = C117693m.m165966c();
                String str = f338393p;
                c.mo182389a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f338396f}), new Throwable[0]);
                Context context = this.f338394d;
                String str2 = this.f338396f;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                C113058d dVar = this.f338397g;
                dVar.mo165555d(new C113058d.C113060b(dVar, intent, this.f338395e));
                if (this.f338397g.f338407g.mo182723c(this.f338396f)) {
                    C117693m.m165966c().mo182389a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f338396f}), new Throwable[0]);
                    Intent b = C113055a.m154701b(this.f338394d, this.f338396f);
                    C113058d dVar2 = this.f338397g;
                    dVar2.mo165555d(new C113058d.C113060b(dVar2, b, this.f338395e));
                } else {
                    C117693m.m165966c().mo182389a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f338396f}), new Throwable[0]);
                }
            } else {
                C117693m.m165966c().mo182389a(f338393p, String.format("Already stopped work for %s", new Object[]{this.f338396f}), new Throwable[0]);
            }
        }
    }
}
