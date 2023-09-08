package xs1;

import a14.C0000n0;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.vote.plugin.FinderLiveVoteBubblePresenter$resumeFinishStatus$1$2", mo125469f = "FinderLiveVoteBubblePresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: xs1.g */
public final class C66430g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C66422e f191183d;

    /* renamed from: xs1.g$a */
    public static final class C66431a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191184d;

        public C66431a(C66422e eVar) {
            this.f191184d = eVar;
        }

        public final void run() {
            C58124b.C7172a.m7372a(this.f191184d.f191169f, C58124b.C58125b.FINDER_LIVE_VOTING_SHOW, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66430g(C66422e eVar, C15601d<? super C66430g> dVar) {
        super(2, dVar);
        this.f191183d = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66430g(this.f191183d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66430g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15883o oVar;
        ViewGroup viewGroup;
        ResultKt.throwOnFailure(obj);
        C56032b e = this.f191183d.mo90517e();
        if (!(e == null || (oVar = (C15883o) e.getPlugin(C15883o.class)) == null || (viewGroup = oVar.f166287d) == null)) {
            viewGroup.postDelayed(new C66431a(this.f191183d), 2000);
        }
        return C13598b0.f38549a;
    }
}
