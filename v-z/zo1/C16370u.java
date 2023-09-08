package zo1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C15133e0;

/* renamed from: zo1.u */
public final class C16370u implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f43760d;

    /* renamed from: e */
    public final /* synthetic */ C15133e0 f43761e;

    /* renamed from: f */
    public final /* synthetic */ Context f43762f;

    /* renamed from: zo1.u$a */
    public static final class C16371a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C16371a f43763d = new C16371a();

        public C16371a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    public C16370u(C77407n nVar, C15133e0 e0Var, Context context) {
        this.f43760d = nVar;
        this.f43761e = e0Var;
        this.f43762f = context;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f43760d;
        C15133e0 e0Var2 = this.f43761e;
        Context context = this.f43762f;
        C87412m.m108593f(e0Var, LocaleUtil.ITALIAN);
        e0Var2.mo14095wW(context, e0Var, nVar, 2, C16371a.f43763d);
    }
}
