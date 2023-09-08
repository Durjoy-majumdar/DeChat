package py2;

import android.content.Context;
import az2.C39674e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C36568h;
import ry0.C13606f;
import ty2.C37310d;
import tz2.C78118e;
import tz2.C78120g;
import yy2.C79169c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: py2.c */
public final class C35736c extends C86301e {

    /* renamed from: d */
    public C79169c f95449d;

    /* renamed from: py2.c$a */
    public static final class C35737a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C35737a f95450d = new C35737a();

        public C35737a() {
            super(0);
        }

        public Object invoke() {
            IStatusIconHelperKt.m39109a().mo62281K();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: py2.c$b */
    public static final class C35738b extends C87413o implements C32224a<C37310d> {

        /* renamed from: d */
        public static final C35738b f95451d = new C35738b();

        public C35738b() {
            super(0);
        }

        public Object invoke() {
            return new C37310d();
        }
    }

    public C35736c() {
        C36568h.m40985a(C35738b.f95451d);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        C78120g gVar = C78120g.f228929a;
        ((C119157j) C119157j.f356862d).mo183875f(C78118e.f228927d);
        C61926c.m72661F("TextStatusThread", C35737a.f95450d);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.TextStatus.PluginTextStatus", "onAccountRelease");
        IStatusIconHelperKt.m39109a().mo62282L();
        C39674e.f106452d.mo62242Np().mo124432b();
        ((C13606f) C86312j.m106911c(C13606f.class)).wh0(9);
    }
}
