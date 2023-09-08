package androidx.lifecycle;

import a14.C53873d2;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo182094d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/j;", "lifecycle", "Lwx3/f;", "coroutineContext", "<init>", "(Landroidx/lifecycle/j;Lwx3/f;)V", "lifecycle-runtime-ktx_release"}, mo182095k = 1, mo182096mv = {1, 4, 1})
public final class LifecycleCoroutineScopeImpl extends C54213l implements C103764p {

    /* renamed from: d */
    public final C39623j f152162d;

    /* renamed from: e */
    public final C66212f f152163e;

    public LifecycleCoroutineScopeImpl(C39623j jVar, C66212f fVar) {
        C87412m.m108594g(jVar, "lifecycle");
        C87412m.m108594g(fVar, "coroutineContext");
        this.f152162d = jVar;
        this.f152163e = fVar;
        if (jVar.getCurrentState() == C39623j.C39626c.DESTROYED) {
            C53873d2.m60390b(fVar, (CancellationException) null);
        }
    }

    public C66212f getCoroutineContext() {
        return this.f152163e;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (this.f152162d.getCurrentState().compareTo(C39623j.C39626c.DESTROYED) <= 0) {
            this.f152162d.removeObserver(this);
            C53873d2.m60390b(this.f152163e, (CancellationException) null);
        }
    }
}
