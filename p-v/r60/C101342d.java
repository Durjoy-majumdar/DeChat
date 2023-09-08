package r60;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import k60.C99102f;

/* renamed from: r60.d */
public abstract class C101342d<R> {

    /* renamed from: a */
    public C101350i<?> f296881a;

    /* renamed from: r60.d$a */
    public static final class C101343a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101340b f296882d;

        /* renamed from: e */
        public final /* synthetic */ C101342d<R> f296883e;

        /* renamed from: f */
        public final /* synthetic */ R f296884f;

        public C101343a(C101340b bVar, C101342d<R> dVar, R r) {
            this.f296882d = bVar;
            this.f296883e = dVar;
            this.f296884f = r;
        }

        public final void run() {
            C101340b bVar = this.f296882d;
            C101342d<R> dVar = this.f296883e;
            bVar.mo138483a(dVar.mo138755b(this.f296884f, dVar.f296881a));
        }
    }

    public C101342d(C101350i<?> iVar) {
        C87412m.m108594g(iVar, "weakHolder");
        this.f296881a = iVar;
    }

    /* renamed from: a */
    public final void mo140833a(R r, C101340b bVar) {
        C87412m.m108594g(bVar, "waitUI");
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bVar.mo138483a(mo138755b(r, this.f296881a));
        } else {
            MMHandlerThread.postToMainThread(new C101343a(bVar, this, r));
        }
    }

    /* renamed from: b */
    public abstract boolean mo138755b(R r, C101350i<?> iVar);

    /* renamed from: c */
    public abstract int mo140831c();

    /* renamed from: d */
    public abstract void mo140832d(C101350i<?> iVar, C99102f<?, ?> fVar);
}
