package coil.util;

import a14.C53916l;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"coil/util/-Lifecycles$observeStarted$2$1", "Landroidx/lifecycle/e;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
/* renamed from: coil.util.-Lifecycles$observeStarted$2$1  reason: invalid class name */
public final class Lifecycles$observeStarted$2$1 implements C103757e {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13598b0> f154599d;

    public Lifecycles$observeStarted$2$1(C53916l<? super C13598b0> lVar) {
        this.f154599d = lVar;
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public /* synthetic */ void onDestroy(C0125s sVar) {
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public /* synthetic */ void onResume(C0125s sVar) {
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        this.f154599d.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }
}
