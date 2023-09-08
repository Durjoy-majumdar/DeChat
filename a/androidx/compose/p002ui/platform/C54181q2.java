package androidx.compose.p002ui.platform;

import a14.C0000n0;
import a14.C53930o0;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54216o0;
import d14.C58050i1;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.Map;
import p175j0.C60645c1;
import p175j0.C60661k1;
import p175j0.C60677q0;
import p175j0.C60683t0;
import p721v0.C65508k;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: androidx.compose.ui.platform.q2 */
public interface C54181q2 {

    /* renamed from: a */
    public static final C54182a f152130a = C54182a.f152131a;

    /* renamed from: androidx.compose.ui.platform.q2$a */
    public static final class C54182a {

        /* renamed from: a */
        public static final /* synthetic */ C54182a f152131a = new C54182a();

        /* renamed from: androidx.compose.ui.platform.q2$a$a */
        public static final class C54183a implements C54181q2 {

            /* renamed from: b */
            public static final C54183a f152132b = new C54183a();

            /* renamed from: a */
            public final C60661k1 mo74979a(View view) {
                C66212f fVar;
                C60645c1 c1Var;
                C87412m.m108594g(view, "rootView");
                Map<Context, C58050i1<Float>> map = C54196x2.f152157a;
                C66217g gVar = C66217g.f190253d;
                C13601g<C66212f> gVar2 = C54163d0.f152101r;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    fVar = (C66212f) ((C36570n) C54163d0.f152101r).getValue();
                } else {
                    fVar = C54163d0.f152102s.get();
                    if (fVar == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                C66212f plus = fVar.plus(gVar);
                C60683t0 t0Var = (C60683t0) plus.get(C60683t0.C60684a.f172855d);
                C39623j jVar = null;
                if (t0Var != null) {
                    C60645c1 c1Var2 = new C60645c1(t0Var);
                    C60677q0 q0Var = c1Var2.f172752e;
                    synchronized (q0Var.f172830a) {
                        q0Var.f172833d = false;
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    c1Var = c1Var2;
                } else {
                    c1Var = null;
                }
                C8479f0 f0Var = new C8479f0();
                T t = (C65508k) plus.get(C65508k.C65509a.f188492d);
                if (t == null) {
                    t = new C54176k1();
                    f0Var.f27484d = t;
                }
                if (c1Var != null) {
                    gVar = c1Var;
                }
                C66212f plus2 = plus.plus(gVar).plus(t);
                C60661k1 k1Var = new C60661k1(plus2);
                C0000n0 a = C53930o0.m60554a(plus2);
                C0125s a2 = C54216o0.m60904a(view);
                if (a2 != null) {
                    jVar = a2.getLifecycle();
                }
                C39623j jVar2 = jVar;
                if (jVar2 != null) {
                    view.addOnAttachStateChangeListener(new C54190u2(view, k1Var));
                    jVar2.addObserver(new C54153xff837ba9(a, c1Var, k1Var, f0Var, view));
                    return k1Var;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    /* renamed from: a */
    C60661k1 mo74979a(View view);
}
