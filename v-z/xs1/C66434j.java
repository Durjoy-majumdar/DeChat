package xs1;

import a14.C0000n0;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51215sa1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.vote.plugin.FinderLiveVoteBubblePresenter$updateBubble$3", mo125469f = "FinderLiveVoteBubblePresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: xs1.j */
public final class C66434j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C66422e f191187d;

    /* renamed from: xs1.j$a */
    public static final class C66435a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66422e f191188d;

        public C66435a(C66422e eVar) {
            this.f191188d = eVar;
        }

        public final void run() {
            C58124b.C7172a.m7372a(this.f191188d.f191169f, C58124b.C58125b.FINDER_LIVE_VOTING_SHOW, (Bundle) null, 2, (Object) null);
            C51215sa1 sa12 = ((C54991o) this.f191188d.f191168e.mo71262a(C54991o.class)).f154275W3;
            int i = sa12 != null ? sa12.f141397p : 0;
            ((C119157j) C119157j.f356862d).mo183894y(this.f191188d.f191172i);
            C119179t tVar = C119157j.f356862d;
            C66422e eVar = this.f191188d;
            ((C119157j) tVar).mo183879j(eVar.f191173j, ((long) i) * 1000, eVar.f191172i);
            Log.m105924i(this.f191188d.f191170g, "force show voteInfo clear task execute");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66434j(C66422e eVar, C15601d<? super C66434j> dVar) {
        super(2, dVar);
        this.f191187d = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66434j(this.f191187d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66434j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15883o oVar;
        ViewGroup viewGroup;
        ResultKt.throwOnFailure(obj);
        C56032b e = this.f191187d.mo90517e();
        if (!(e == null || (oVar = (C15883o) e.getPlugin(C15883o.class)) == null || (viewGroup = oVar.f166287d) == null)) {
            viewGroup.postDelayed(new C66435a(this.f191187d), 2000);
        }
        return C13598b0.f38549a;
    }
}
