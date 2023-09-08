package ub2;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import f14.C58901s;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import sb2.C63759f0;
import wb2.C65946a;
import wx3.C15601d;

/* renamed from: ub2.v */
public final class C65315v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187988d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65315v(MusicMVCardChooseView musicMVCardChooseView) {
        super(0);
        this.f187988d = musicMVCardChooseView;
    }

    public Object invoke() {
        C39818r rVar = C39818r.f106831a;
        Context context = this.f187988d.getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(context).…ycleScopeUIC::class.java)");
        C65946a aVar = (C65946a) a;
        Context context2 = this.f187988d.getContext();
        C87412m.m108593f(context2, "context");
        C39622i0 a2 = rVar.mo62443b(context2).mo75002a(C63759f0.class);
        C87412m.m108593f(a2, "UICProvider.of(context).…rFlexEditUIC::class.java)");
        C63759f0 f0Var = (C63759f0) a2;
        C53973z1 z1Var = this.f187988d.f163483V0;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        MusicMVCardChooseView musicMVCardChooseView = this.f187988d;
        LifecycleScope c3 = aVar.mo89983c3();
        C53896h0 h0Var = C53872d1.f151117a;
        musicMVCardChooseView.f163483V0 = C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C65313u(f0Var, this.f187988d, (C15601d<? super C65313u>) null), 2, (Object) null);
        return C13598b0.f38549a;
    }
}
