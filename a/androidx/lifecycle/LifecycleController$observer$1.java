package androidx.lifecycle;

import a14.C53973z1;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$b;", "<anonymous parameter 1>", "Lrx3/b0;", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$b;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 4, 1})
final class LifecycleController$observer$1 implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C53973z1 f555d;

    public LifecycleController$observer$1(C0122k kVar, C53973z1 z1Var) {
        this.f555d = z1Var;
    }

    /* renamed from: k4 */
    public final void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "<anonymous parameter 1>");
        C39623j lifecycle = sVar.getLifecycle();
        C87412m.m108593f(lifecycle, "source.lifecycle");
        if (lifecycle.getCurrentState() == C39623j.C39626c.DESTROYED) {
            C53973z1.C53974a.m60623a(this.f555d, (CancellationException) null, 1, (Object) null);
            throw null;
        }
        C39623j lifecycle2 = sVar.getLifecycle();
        C87412m.m108593f(lifecycle2, "source.lifecycle");
        lifecycle2.getCurrentState();
        throw null;
    }
}
