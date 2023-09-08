package com.tencent.matrix.batterycanary.monitor.feature;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1177ce.C113314g;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C117159b;
import p981ie.C117187w;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e */
public final class C114451e extends C116608a {

    /* renamed from: b */
    public int f343131b = 1024;

    /* renamed from: c */
    public int f343132c = 1024;

    /* renamed from: d */
    public int f343133d = 100;

    /* renamed from: e */
    public List<C117187w.C117189b> f343134e = Collections.emptyList();

    /* renamed from: f */
    public List<C117187w.C117189b> f343135f = Collections.emptyList();

    /* renamed from: g */
    public Runnable f343136g = new C114452a();

    /* renamed from: h */
    public final C80407h f343137h = new C114453b();

    /* renamed from: i */
    public final C80407h f343138i = new C114454c();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$d */
    public class C80363d implements Runnable {
        public C80363d() {
        }

        public void run() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
            Context a = C114451e.this.f349668a.mo165879a();
            String packageName = a.getPackageName();
            if (packageName.contains(XVFSFile.PATH_SEPARATOR)) {
                packageName = packageName.substring(0, packageName.indexOf(XVFSFile.PATH_SEPARATOR));
            }
            ActivityManager activityManager = (ActivityManager) a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.processName.startsWith(packageName)) {
                        if (C114451e.this.f343132c > next.importance) {
                            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "update global importance: " + C114451e.this.f343132c + " > " + next.importance + ", reason = " + next.importanceReasonComponent, new Object[0]);
                            C114451e.this.f343132c = next.importance;
                        }
                        if (next.processName.equals(a.getPackageName()) && C114451e.this.f343131b > next.importance) {
                            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "update app importance: " + C114451e.this.f343131b + " > " + next.importance + ", reason = " + next.importanceReasonComponent, new Object[0]);
                            C114451e.this.f343131b = next.importance;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$a */
    public class C114452a implements Runnable {
        public C114452a() {
        }

        public void run() {
            if (C114451e.this.f343134e.size() >= C114451e.this.f349668a.f339057d.f339037h) {
                synchronized ("Matrix.battery.AppStatMonitorFeature") {
                    C117187w.m165274b(C114451e.this.f343134e);
                }
            }
            if (C114451e.this.f343135f.size() >= C114451e.this.f349668a.f339057d.f339037h) {
                synchronized ("Matrix.battery.AppStatMonitorFeature") {
                    C117187w.m165274b(C114451e.this.f343135f);
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$b */
    public class C114453b implements C80407h {
        public C114453b() {
        }

        public void off() {
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "fgSrv >> off", new Object[0]);
            C113314g gVar = C114451e.this.f349668a;
            boolean z = gVar.f339064n;
            int c = C117159b.m165202c(gVar.mo165879a(), z);
            if (c == 1 || c == 3 || c == 4) {
                C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z + ", currAppStat = " + c, new Object[0]);
                return;
            }
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 2", new Object[0]);
            C114451e.this.mo173654k(2);
        }

        /* renamed from: on */
        public void mo60742on() {
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "fgSrv >> on", new Object[0]);
            C113314g gVar = C114451e.this.f349668a;
            boolean z = gVar.f339064n;
            int c = C117159b.m165202c(gVar.mo165879a(), z);
            if (c != 1) {
                C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 3", new Object[0]);
                C114451e.this.mo173654k(3);
                return;
            }
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z + ", currAppStat = " + c, new Object[0]);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$c */
    public class C114454c implements C80407h {
        public C114454c() {
        }

        public void off() {
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "floatView >> off", new Object[0]);
            C113314g gVar = C114451e.this.f349668a;
            boolean z = gVar.f339064n;
            int c = C117159b.m165202c(gVar.mo165879a(), z);
            if (c == 1 || c == 3 || c == 4) {
                C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z + ", currAppStat = " + c, new Object[0]);
                return;
            }
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 2", new Object[0]);
            C114451e.this.mo173654k(2);
        }

        /* renamed from: on */
        public void mo60742on() {
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "floatView >> on", new Object[0]);
            C113314g gVar = C114451e.this.f349668a;
            boolean z = gVar.f339064n;
            int c = C117159b.m165202c(gVar.mo165879a(), z);
            if (c == 1 || c == 3) {
                C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "skip statAppStat, fg = " + z + ", currAppStat = " + c, new Object[0]);
                return;
            }
            C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "statAppStat: 4", new Object[0]);
            C114451e.this.mo173654k(4);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$e */
    public class C114455e implements C117187w.C117189b.C117190a {
        public C114455e() {
        }

        /* renamed from: a */
        public C117187w.C117189b mo173647a(String str) {
            return new C117187w.C117189b(String.valueOf(C117159b.m165201b(C114451e.this.f349668a.mo165879a(), C114451e.this.f349668a.f339064n)));
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$f */
    public class C114456f implements C117187w.C117189b.C117190a {
        public C114456f() {
        }

        /* renamed from: a */
        public C117187w.C117189b mo173647a(String str) {
            String str2;
            C113314g gVar = C114451e.this.f349668a;
            gVar.getClass();
            try {
                str2 = gVar.f339062i.call();
            } catch (Exception unused) {
                str2 = "unknown";
            }
            return new C117187w.C117189b(str2);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$g */
    public interface C114457g {
        /* renamed from: g */
        void mo165852g(boolean z, int i, int i2, ComponentName componentName, long j);
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.e$h */
    public static final class C114458h extends C114490k0.C114491a<C114458h> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343144d = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343145e = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: f */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343146f = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343147g = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: h */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343148h = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114460f(this, (C114458h) aVar, this);
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        int c = C117159b.m165202c(this.f349668a.mo165879a(), z);
        C117159b.C117160a aVar = (C117159b.C117160a) C117159b.f351002a;
        synchronized (aVar) {
            aVar.f351006d = new C117159b.C117161b.C117162a<>(Integer.valueOf(c), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        mo173654k(c);
        StringBuilder sb = new StringBuilder();
        sb.append("updateAppImportance when app ");
        sb.append(z ? "foreground" : "background");
        C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", sb.toString(), new Object[0]);
        mo173655l();
    }

    /* renamed from: b */
    public void mo111817b() {
        String str;
        super.mo111817b();
        C117187w.C117189b bVar = new C117187w.C117189b(String.valueOf(1));
        C113314g gVar = this.f349668a;
        gVar.getClass();
        try {
            str = gVar.f339062i.call();
        } catch (Exception unused) {
            str = "unknown";
        }
        C117187w.C117189b bVar2 = new C117187w.C117189b(str);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            ArrayList arrayList = new ArrayList();
            this.f343134e = arrayList;
            arrayList.add(0, bVar);
            ArrayList arrayList2 = new ArrayList();
            this.f343135f = arrayList2;
            arrayList2.add(0, bVar2);
        }
        ForegroundServiceLifecycleOwner.INSTANCE.observeForever(this.f343137h);
        OverlayWindowLifecycleOwner.INSTANCE.observeForever(this.f343138i);
    }

    /* renamed from: c */
    public void mo173651c(long j) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        long j2 = j;
        super.mo173651c(j);
        C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "#onBackgroundCheck, during = " + j2, new Object[0]);
        int i = this.f343132c;
        int i2 = this.f343133d;
        if (i > i2 || this.f343131b > i2) {
            Context a = this.f349668a.mo165879a();
            ActivityManager activityManager = (ActivityManager) a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
                for (ActivityManager.RunningServiceInfo next : runningServices) {
                    if (!TextUtils.isEmpty(next.process) && next.process.startsWith(a.getPackageName()) && next.foreground) {
                        C118672d.m167353c("Matrix.battery.AppStatMonitorFeature", "checkForegroundService whether app importance is low, during = " + j2, new Object[0]);
                        if (this.f343132c > this.f343133d) {
                            C118672d.m167356f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low global importance: " + this.f343131b + ", " + this.f343132c + ", " + next.service, new Object[0]);
                            this.f349668a.mo165852g(false, this.f343131b, this.f343132c, next.service, j);
                        }
                        if (this.f343131b > this.f343133d && next.process.equals(a.getPackageName())) {
                            C118672d.m167356f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low app importance: " + this.f343131b + ", " + this.f343132c + ", " + next.service, new Object[0]);
                            this.f349668a.mo165852g(true, this.f343131b, this.f343132c, next.service, j);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        this.f343133d = Math.max(gVar.f339057d.f339038i, 100);
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        ForegroundServiceLifecycleOwner.INSTANCE.removeObserver(this.f343137h);
        OverlayWindowLifecycleOwner.INSTANCE.removeObserver(this.f343138i);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            this.f343134e.clear();
            this.f343135f.clear();
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.AppStatMonitorFeature";
    }

    /* renamed from: i */
    public C114458h mo173652i(long j) {
        try {
            C117187w.C117192d a = C117187w.m165273a(this.f343134e, j, 10, new C114455e());
            C114458h hVar = new C114458h();
            hVar.f343204c = a.f351076c;
            hVar.f343144d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(a.f351074a));
            hVar.f343145e = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a(String.valueOf(1))));
            hVar.f343146f = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a(String.valueOf(2))));
            hVar.f343147g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a(String.valueOf(3))));
            hVar.f343148h = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a(String.valueOf(4))));
            return hVar;
        } catch (Throwable th) {
            C118672d.m167356f("Matrix.battery.AppStatMonitorFeature", "configureSnapshot fail: " + th.getMessage(), new Object[0]);
            C114458h hVar2 = new C114458h();
            hVar2.f343204c = false;
            return hVar2;
        }
    }

    /* renamed from: j */
    public C117187w.C117192d mo173653j(long j) {
        try {
            return C117187w.m165273a(this.f343135f, j, 10, new C114456f());
        } catch (Throwable th) {
            C118672d.m167356f("Matrix.battery.AppStatMonitorFeature", "currentSceneSnapshot fail: " + th.getMessage(), new Object[0]);
            C117187w.C117192d dVar = new C117187w.C117192d();
            dVar.f351076c = false;
            return dVar;
        }
    }

    /* renamed from: k */
    public void mo173654k(int i) {
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            if (this.f343134e != Collections.EMPTY_LIST) {
                StringBuilder sb = new StringBuilder();
                sb.append("onStat >> ");
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "float" : "fgSrv" : "bg" : "fg");
                C118672d.m167353c("Matrix.battery.LifeCycle", sb.toString(), new Object[0]);
                this.f343134e.add(0, new C117187w.C117189b(String.valueOf(i)));
                this.f349668a.f339059f.removeCallbacks(this.f343136g);
                this.f349668a.f339059f.postDelayed(this.f343136g, 1000);
            }
        }
    }

    /* renamed from: l */
    public final void mo173655l() {
        int i = this.f343131b;
        int i2 = this.f343133d;
        if (i > i2 || this.f343132c > i2) {
            C80363d dVar = new C80363d();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f349668a.f339059f.post(dVar);
            } else {
                dVar.run();
            }
        }
    }
}
