package p771yv;

import android.content.res.Configuration;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;
import g40.C87133d;
import zt3.C119157j;

/* renamed from: yv.c */
public class C91585c implements C87133d {

    /* renamed from: yv.c$a */
    public class C91586a implements Runnable {
        public C91586a(C91585c cVar) {
        }

        public void run() {
            Log.m105920e("MicroMsg.PluginPerformance", "onLowMemory -> dump memory");
            Log.m105925i("MicroMsg.PluginPerformance", "[onLowMemory] %s", MemoryWatchDog.f248575A.mo118581g());
        }
    }

    /* renamed from: yv.c$b */
    public class C91587b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f262432d;

        public C91587b(C91585c cVar, int i) {
            this.f262432d = i;
        }

        public void run() {
            Log.m105921e("MicroMsg.PluginPerformance", "onTrimMemory level:%d -> dump memory", Integer.valueOf(this.f262432d));
            Log.m105925i("MicroMsg.PluginPerformance", "[onTrimMemory] %s", MemoryWatchDog.f248575A.mo118581g());
        }
    }

    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
        if (i <= 15) {
            ((C119157j) C119157j.f356862d).mo183875f(new C91587b(this, i));
        }
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
        ((C119157j) C119157j.f356862d).mo183875f(new C91586a(this));
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
    }
}
