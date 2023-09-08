package p176jc;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import rx3.C13598b0;

/* renamed from: jc.l */
public final class C117327l implements FlutterUiDisplayListener {

    /* renamed from: a */
    public final /* synthetic */ C53916l<C13598b0> f351250a;

    /* renamed from: b */
    public final /* synthetic */ FlutterRenderer f351251b;

    /* renamed from: jc.l$a */
    public static final class C117328a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FlutterRenderer f351252d;

        /* renamed from: e */
        public final /* synthetic */ C117327l f351253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117328a(FlutterRenderer flutterRenderer, C117327l lVar) {
            super(1);
            this.f351252d = flutterRenderer;
            this.f351253e = lVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f351252d.removeIsDisplayingFlutterUiListener(this.f351253e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jc.l$b */
    public static final class C117329b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FlutterRenderer f351254d;

        /* renamed from: e */
        public final /* synthetic */ C117327l f351255e;

        public C117329b(FlutterRenderer flutterRenderer, C117327l lVar) {
            this.f351254d = flutterRenderer;
            this.f351255e = lVar;
        }

        public final void run() {
            this.f351254d.removeIsDisplayingFlutterUiListener(this.f351255e);
        }
    }

    public C117327l(C53916l<? super C13598b0> lVar, FlutterRenderer flutterRenderer) {
        this.f351250a = lVar;
        this.f351251b = flutterRenderer;
        lVar.mo74599v(new C117328a(flutterRenderer, this));
    }

    public void onFlutterUiDisplayed() {
        if (this.f351250a.mo74597a()) {
            C53916l<C13598b0> lVar = this.f351250a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        MMHandlerThread.postToMainThread(new C117329b(this.f351251b, this));
    }

    public void onFlutterUiNoLongerDisplayed() {
    }
}
