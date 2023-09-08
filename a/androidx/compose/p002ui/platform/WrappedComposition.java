package androidx.compose.p002ui.platform;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p175j0.C108504h;
import p175j0.C108509q;
import p415q0.C110261c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lj0/q;", "Landroidx/lifecycle/p;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lj0/q;)V", "ui_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
final class WrappedComposition implements C108509q, C103764p {

    /* renamed from: d */
    public final AndroidComposeView f306042d;

    /* renamed from: e */
    public final C108509q f306043e;

    /* renamed from: f */
    public boolean f306044f;

    /* renamed from: g */
    public C39623j f306045g;

    /* renamed from: h */
    public C32227p<? super C108504h, ? super Integer, C13598b0> f306046h = C54174k0.f152123a;

    /* renamed from: androidx.compose.ui.platform.WrappedComposition$a */
    public static final class C103604a extends C87413o implements C32226l<AndroidComposeView$$e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WrappedComposition f306047d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f306048e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103604a(WrappedComposition wrappedComposition, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
            super(1);
            this.f306047d = wrappedComposition;
            this.f306048e = pVar;
        }

        public Object invoke(Object obj) {
            AndroidComposeView$$e androidComposeView$$e = (AndroidComposeView$$e) obj;
            C87412m.m108594g(androidComposeView$$e, LocaleUtil.ITALIAN);
            if (!this.f306047d.f306044f) {
                C39623j lifecycle = androidComposeView$$e.f306028a.getLifecycle();
                C87412m.m108593f(lifecycle, "it.lifecycleOwner.lifecycle");
                WrappedComposition wrappedComposition = this.f306047d;
                wrappedComposition.f306046h = this.f306048e;
                if (wrappedComposition.f306045g == null) {
                    wrappedComposition.f306045g = lifecycle;
                    lifecycle.addObserver(wrappedComposition);
                } else if (lifecycle.getCurrentState().mo62187a(C39623j.C39626c.CREATED)) {
                    WrappedComposition wrappedComposition2 = this.f306047d;
                    wrappedComposition2.f306043e.mo51662f(C110261c.m149879c(-2000640158, true, new C103610b3(wrappedComposition2, this.f306048e)));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, C108509q qVar) {
        C87412m.m108594g(androidComposeView, "owner");
        C87412m.m108594g(qVar, "original");
        this.f306042d = androidComposeView;
        this.f306043e = qVar;
        C32227p<C108504h, Integer, C13598b0> pVar = C54174k0.f152123a;
    }

    public void dispose() {
        if (!this.f306044f) {
            this.f306044f = true;
            this.f306042d.getView().setTag(C0966R.C0970id.ltt, (Object) null);
            C39623j jVar = this.f306045g;
            if (jVar != null) {
                jVar.removeObserver(this);
            }
        }
        this.f306043e.dispose();
    }

    /* renamed from: f */
    public void mo51662f(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        this.f306042d.setOnViewTreeOwnersAvailable(new C103604a(this, pVar));
    }

    /* renamed from: i */
    public boolean mo51665i() {
        return this.f306043e.mo51665i();
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_DESTROY) {
            dispose();
        } else if (bVar == C39623j.C39625b.ON_CREATE && !this.f306044f) {
            mo51662f(this.f306046h);
        }
    }

    /* renamed from: r */
    public boolean mo51674r() {
        return this.f306043e.mo51674r();
    }
}
