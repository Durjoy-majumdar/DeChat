package p1028re;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import p723vf.C118672d;
import p723vf.C90778c;

/* renamed from: re.e */
public final class C89933e implements ComponentCallbacks2 {

    /* renamed from: d */
    public long f258434d;

    /* renamed from: e */
    public volatile int f258435e;

    /* renamed from: re.e$a */
    public static final class C89934a extends C80401d {

        /* renamed from: b */
        public final /* synthetic */ C89933e f258436b;

        public C89934a(C89933e eVar) {
            this.f258436b = eVar;
        }

        /* renamed from: a */
        public void mo17850a() {
            this.f258436b.f258435e = 0;
        }

        /* renamed from: b */
        public void mo17851b() {
        }
    }

    /* renamed from: re.e$b */
    public static final class C89935b implements Runnable {

        /* renamed from: d */
        public static final C89935b f258437d = new C89935b();

        public final void run() {
            C118672d.m167352b("Matrix.TrimMemoryNotifier", "onLowMemory", new Object[0]);
            C89931d dVar = C89931d.f258426c;
            C89931d.m112503a(dVar, C89931d.f258424a, 15);
            C89931d.m112503a(dVar, C89931d.f258425b, 15);
        }
    }

    /* renamed from: re.e$c */
    public static final class C89936c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f258438d;

        public C89936c(int i) {
            this.f258438d = i;
        }

        public final void run() {
            C118672d.m167352b("Matrix.TrimMemoryNotifier", "onTrimMemory: " + this.f258438d, new Object[0]);
            C89931d dVar = C89931d.f258426c;
            C89931d.m112503a(dVar, C89931d.f258424a, this.f258438d);
            C89931d.m112503a(dVar, C89931d.f258425b, this.f258438d);
        }
    }

    public C89933e() {
        ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) new C89934a(this));
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onLowMemory() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f258434d < TimeUnit.MINUTES.toMillis((long) (this.f258435e + 1)) || this.f258435e >= 10) {
            C118672d.m167356f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new Object[0]);
            return;
        }
        this.f258434d = currentTimeMillis;
        this.f258435e++;
        C118672d.m167352b("Matrix.TrimMemoryNotifier", "onLowMemory post", new Object[0]);
        C90778c.m113843a().post(C89935b.f258437d);
    }

    public void onTrimMemory(int i) {
        if (i <= 15) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f258434d < TimeUnit.MINUTES.toMillis((long) (this.f258435e + 1)) || this.f258435e >= 10) {
                C118672d.m167356f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new Object[0]);
                return;
            }
            this.f258434d = currentTimeMillis;
            this.f258435e++;
            C118672d.m167352b("Matrix.TrimMemoryNotifier", "onTrimMemory post: " + i, new Object[0]);
            C90778c.m113843a().post(new C89936c(i));
        }
    }
}
