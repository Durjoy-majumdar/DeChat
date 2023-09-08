package ku0;

import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: ku0.f */
public final class C88300f implements MagicBrushView.C80325f {

    /* renamed from: a */
    public final /* synthetic */ C80301a f255246a;

    /* renamed from: b */
    public final /* synthetic */ C88288a f255247b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f255248c;

    /* renamed from: ku0.f$a */
    public static final class C88301a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88288a f255249d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f255250e;

        public C88301a(C88288a aVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f255249d = aVar;
            this.f255250e = lVar;
        }

        public final void run() {
            Log.m105924i(this.f255249d.f255208f, "setupWebGLEnv, done");
            this.f255250e.invoke(Boolean.TRUE);
        }
    }

    public C88300f(C80301a aVar, C88288a aVar2, C32226l<? super Boolean, C13598b0> lVar) {
        this.f255246a = aVar;
        this.f255247b = aVar2;
        this.f255248c = lVar;
    }

    public void onPrepared() {
        this.f255246a.f235057f.mo123773p(new C88301a(this.f255247b, this.f255248c), false);
    }
}
