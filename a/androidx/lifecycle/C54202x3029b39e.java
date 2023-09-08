package androidx.lifecycle;

import a14.C53896h0;
import a14.C53916l;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, mo182094d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/p;", "lifecycle-runtime-ktx_release"}, mo182095k = 1, mo182096mv = {1, 4, 1})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 */
public final class C54202x3029b39e implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C53916l f152164d;

    /* renamed from: e */
    public final /* synthetic */ C39623j f152165e;

    /* renamed from: f */
    public final /* synthetic */ C39623j.C39626c f152166f;

    /* renamed from: g */
    public final /* synthetic */ C32224a f152167g;

    public C54202x3029b39e(C53916l lVar, C39623j jVar, C39623j.C39626c cVar, C32224a aVar, boolean z, C53896h0 h0Var) {
        this.f152164d = lVar;
        this.f152165e = jVar;
        this.f152166f = cVar;
        this.f152167g = aVar;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        Object obj;
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        int i = C39623j.C39624a.f106385a[this.f152166f.ordinal()];
        if (bVar == (i != 1 ? i != 2 ? i != 3 ? null : C39623j.C39625b.ON_RESUME : C39623j.C39625b.ON_START : C39623j.C39625b.ON_CREATE)) {
            this.f152165e.removeObserver(this);
            C53916l lVar = this.f152164d;
            C32224a aVar = this.f152167g;
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(aVar.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            lVar.resumeWith(obj);
        } else if (bVar == C39623j.C39625b.ON_DESTROY) {
            this.f152165e.removeObserver(this);
            C53916l lVar2 = this.f152164d;
            C54215n nVar = new C54215n();
            Result.Companion companion3 = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(nVar)));
        }
    }
}
