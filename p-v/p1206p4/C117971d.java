package p1206p4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.C113038a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C113063a;
import androidx.work.impl.foreground.SystemForegroundService;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p1014o4.C109939f;
import p1014o4.C117693m;
import p1160w4.C118739a;
import p1167z8.C112608f;
import p1169a5.C112757a;
import p1169a5.C112758b;
import p1206p4.C117982n;
import p1222y4.C118929m;
import p283z4.C119060c;
import p385u2.C111105a;

/* renamed from: p4.d */
public class C117971d implements C117969b, C118739a {

    /* renamed from: r */
    public static final String f352572r = C117693m.m165967e("Processor");

    /* renamed from: d */
    public PowerManager.WakeLock f352573d;

    /* renamed from: e */
    public Context f352574e;

    /* renamed from: f */
    public C113038a f352575f;

    /* renamed from: g */
    public C112757a f352576g;

    /* renamed from: h */
    public WorkDatabase f352577h;

    /* renamed from: i */
    public Map<String, C117982n> f352578i = new HashMap();

    /* renamed from: j */
    public Map<String, C117982n> f352579j = new HashMap();

    /* renamed from: n */
    public List<C117973e> f352580n;

    /* renamed from: o */
    public Set<String> f352581o;

    /* renamed from: p */
    public final List<C117969b> f352582p;

    /* renamed from: q */
    public final Object f352583q;

    /* renamed from: p4.d$a */
    public static class C117972a implements Runnable {

        /* renamed from: d */
        public C117969b f352584d;

        /* renamed from: e */
        public String f352585e;

        /* renamed from: f */
        public C112608f<Boolean> f352586f;

        public C117972a(C117969b bVar, String str, C112608f<Boolean> fVar) {
            this.f352584d = bVar;
            this.f352585e = str;
            this.f352586f = fVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.f352586f.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f352584d.mo165545e(this.f352585e, z);
        }
    }

    public C117971d(Context context, C113038a aVar, C112757a aVar2, WorkDatabase workDatabase, List<C117973e> list) {
        this.f352574e = context;
        this.f352575f = aVar;
        this.f352576g = aVar2;
        this.f352577h = workDatabase;
        this.f352580n = list;
        this.f352581o = new HashSet();
        this.f352582p = new ArrayList();
        this.f352573d = null;
        this.f352583q = new Object();
    }

    /* renamed from: b */
    public static boolean m166368b(String str, C117982n nVar) {
        boolean z;
        if (nVar != null) {
            nVar.f352638y = true;
            nVar.mo182748i();
            C112608f<ListenableWorker.C113032a> fVar = nVar.f352637x;
            if (fVar != null) {
                z = fVar.isDone();
                nVar.f352637x.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = nVar.f352625i;
            if (listenableWorker == null || z) {
                C117693m.m165966c().mo182389a(C117982n.f352619z, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{nVar.f352624h}), new Throwable[0]);
            } else {
                listenableWorker.mo165508g();
            }
            C117693m.m165966c().mo182389a(f352572r, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C117693m.m165966c().mo182389a(f352572r, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public void mo182722a(C117969b bVar) {
        synchronized (this.f352583q) {
            ((ArrayList) this.f352582p).add(bVar);
        }
    }

    /* renamed from: c */
    public boolean mo182723c(String str) {
        boolean z;
        synchronized (this.f352583q) {
            if (!((HashMap) this.f352579j).containsKey(str)) {
                if (!((HashMap) this.f352578i).containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public void mo182724d(String str, C109939f fVar) {
        synchronized (this.f352583q) {
            C117693m.m165966c().mo182391d(f352572r, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C117982n nVar = (C117982n) ((HashMap) this.f352579j).remove(str);
            if (nVar != null) {
                if (this.f352573d == null) {
                    PowerManager.WakeLock a = C118929m.m167680a(this.f352574e, "ProcessorForegroundLck");
                    this.f352573d = a;
                    C117292a.m165357c(a, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    a.acquire();
                    C117292a.m165359e(a, "androidx/work/impl/Processor", "startForeground", "(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                }
                ((HashMap) this.f352578i).put(str, nVar);
                Intent b = C113063a.m154720b(this.f352574e, str, fVar);
                Context context = this.f352574e;
                Object obj = C111105a.f332697a;
                if (Build.VERSION.SDK_INT >= 26) {
                    C111105a.C111107f.m151506a(context, b);
                } else {
                    context.startService(b);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        synchronized (this.f352583q) {
            ((HashMap) this.f352579j).remove(str);
            C117693m.m165966c().mo182389a(f352572r, String.format("%s %s executed; reschedule = %s", new Object[]{C117971d.class.getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            Iterator it = ((ArrayList) this.f352582p).iterator();
            while (it.hasNext()) {
                ((C117969b) it.next()).mo165545e(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo182725f(String str, WorkerParameters.C113037a aVar) {
        synchronized (this.f352583q) {
            if (mo182723c(str)) {
                C117693m.m165966c().mo182389a(f352572r, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C117982n.C117983a aVar2 = new C117982n.C117983a(this.f352574e, this.f352575f, this.f352576g, this, this.f352577h, str);
            aVar2.f352645g = this.f352580n;
            if (aVar != null) {
                aVar2.f352646h = aVar;
            }
            C117982n nVar = new C117982n(aVar2);
            C119060c<Boolean> cVar = nVar.f352636w;
            cVar.addListener(new C117972a(this, str, cVar), ((C112758b) this.f352576g).f337644c);
            ((HashMap) this.f352579j).put(str, nVar);
            ((C112758b) this.f352576g).f337642a.execute(nVar);
            C117693m.m165966c().mo182389a(f352572r, String.format("%s: processing %s", new Object[]{C117971d.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: g */
    public final void mo182726g() {
        synchronized (this.f352583q) {
            if (!(!((HashMap) this.f352578i).isEmpty())) {
                Context context = this.f352574e;
                String str = C113063a.f338428q;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f352574e.startService(intent);
                } catch (Throwable th) {
                    C117693m.m165966c().mo182390b(f352572r, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f352573d;
                if (wakeLock != null) {
                    C117292a.m165357c(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    C117292a.m165359e(wakeLock, "androidx/work/impl/Processor", "stopForegroundService", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    this.f352573d = null;
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo182727h(String str) {
        boolean b;
        synchronized (this.f352583q) {
            C117693m.m165966c().mo182389a(f352572r, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            b = m166368b(str, (C117982n) ((HashMap) this.f352578i).remove(str));
        }
        return b;
    }

    /* renamed from: i */
    public boolean mo182728i(String str) {
        boolean b;
        synchronized (this.f352583q) {
            C117693m.m165966c().mo182389a(f352572r, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            b = m166368b(str, (C117982n) ((HashMap) this.f352579j).remove(str));
        }
        return b;
    }
}
