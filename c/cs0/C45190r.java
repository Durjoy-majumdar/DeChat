package cs0;

import a14.C53895h;
import a14.C53934p0;
import android.view.MenuItem;
import androidx.lifecycle.C54218t;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11184p0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: cs0.r */
public final class C45190r implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122503d;

    /* renamed from: e */
    public final /* synthetic */ C45166g0 f122504e;

    /* renamed from: cs0.r$a */
    public static final class C45191a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45181m f122505d;

        /* renamed from: e */
        public final /* synthetic */ C45166g0 f122506e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45191a(C45181m mVar, C45166g0 g0Var) {
            super(0);
            this.f122505d = mVar;
            this.f122506e = g0Var;
        }

        public Object invoke() {
            C45164f0 K = this.f122505d.f122487d.mo63404K();
            C45166g0 g0Var = this.f122506e;
            K.getClass();
            C87412m.m108594g(g0Var, "usageInfoItem");
            Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onRevokeBtnClick");
            C53895h.m60466d(C54218t.m60906a(K.f122459d), (C66212f) null, (C53934p0) null, new C45161e0(K, g0Var, (C15601d<? super C45161e0>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C45190r(C45181m mVar, C45166g0 g0Var) {
        this.f122503d = mVar;
        this.f122504e = g0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C45181m mVar = this.f122503d;
        C45181m.m50001F4(mVar, menuItem, new C45191a(mVar, this.f122504e));
    }
}
