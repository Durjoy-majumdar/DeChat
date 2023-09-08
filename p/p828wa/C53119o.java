package p828wa;

import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wa.o */
public class C53119o {

    /* renamed from: a */
    public ConcurrentHashMap<C53125f, Boolean> f148228a = new ConcurrentHashMap<>();

    /* renamed from: wa.o$a */
    public static abstract class C53120a extends C53125f {
        /* renamed from: a */
        public boolean mo73810a() {
            return mo67945b();
        }

        /* renamed from: b */
        public abstract boolean mo67945b();
    }

    /* renamed from: wa.o$b */
    public static abstract class C53121b extends C53125f {
        /* renamed from: a */
        public boolean mo73810a() {
            mo73811b();
            return false;
        }

        /* renamed from: b */
        public abstract void mo73811b();
    }

    /* renamed from: wa.o$c */
    public static abstract class C53122c extends C53125f {
        /* renamed from: a */
        public boolean mo73810a() {
            mo73812b();
            return false;
        }

        /* renamed from: b */
        public abstract void mo73812b();
    }

    /* renamed from: wa.o$d */
    public static abstract class C53123d extends C53125f {
        /* renamed from: a */
        public boolean mo73810a() {
            mo73813b();
            return false;
        }

        /* renamed from: b */
        public abstract void mo73813b();
    }

    /* renamed from: wa.o$e */
    public static abstract class C53124e extends C53125f {
        /* renamed from: a */
        public boolean mo73810a() {
            mo73798b();
            return false;
        }

        /* renamed from: b */
        public abstract void mo73798b();
    }

    /* renamed from: wa.o$f */
    public static abstract class C53125f {
        /* renamed from: a */
        public abstract boolean mo73810a();
    }

    public C53119o() {
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final boolean mo73809a(Class<? extends C53125f> cls) {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            Log.m105920e("LuggagePageEventBus", "notifyListener on non-UI thread");
            return false;
        }
        for (C53125f next : this.f148228a.keySet()) {
            if (cls.isInstance(next)) {
                boolean a = next.mo73810a();
                if (this.f148228a.get(next).booleanValue()) {
                    this.f148228a.remove(next);
                }
                if (a) {
                    return true;
                }
            }
        }
        return false;
    }
}
