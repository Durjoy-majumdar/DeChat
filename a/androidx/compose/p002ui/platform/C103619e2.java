package androidx.compose.p002ui.platform;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p1120i3.C108332a;
import p1120i3.C108333b;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.e2 */
public final class C103619e2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AbstractComposeView f306073d;

    /* renamed from: e */
    public final /* synthetic */ C103622f2 f306074e;

    /* renamed from: f */
    public final /* synthetic */ C108333b f306075f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103619e2(AbstractComposeView abstractComposeView, C103622f2 f2Var, C108333b bVar) {
        super(0);
        this.f306073d = abstractComposeView;
        this.f306074e = f2Var;
        this.f306075f = bVar;
    }

    public Object invoke() {
        this.f306073d.removeOnAttachStateChangeListener(this.f306074e);
        AbstractComposeView abstractComposeView = this.f306073d;
        C108333b bVar = this.f306075f;
        C87412m.m108594g(abstractComposeView, "<this>");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C108332a.m146751a(abstractComposeView).f324357a.remove(bVar);
        return C13598b0.f38549a;
    }
}
