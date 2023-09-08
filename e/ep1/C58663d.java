package ep1;

import a14.C0000n0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.report.jump.FinderJumpDataManager$getTaskIdAsync$1", mo125469f = "FinderJumpDataManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ep1.d */
public final class C58663d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ MMFragmentActivity f167942d;

    /* renamed from: e */
    public final /* synthetic */ C58661c f167943e;

    /* renamed from: f */
    public final /* synthetic */ int f167944f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58663d(MMFragmentActivity mMFragmentActivity, C58661c cVar, int i, C15601d<? super C58663d> dVar) {
        super(2, dVar);
        this.f167942d = mMFragmentActivity;
        this.f167943e = cVar;
        this.f167944f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58663d(this.f167942d, this.f167943e, this.f167944f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58663d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        int taskId = this.f167942d.getTaskId();
        this.f167943e.f167937b.put(new Integer(this.f167944f), new Integer(taskId));
        C58661c cVar = this.f167943e;
        MMFragmentActivity mMFragmentActivity = this.f167942d;
        cVar.getClass();
        if (C87412m.m108589b(mMFragmentActivity.getClass().getSimpleName(), "FinderHomeAffinityUI")) {
            this.f167943e.f167940e = taskId;
        }
        Log.m105924i("FinderJumpDataManager", "[getTaskIdAsync] taskId=" + taskId + ", finderTaskId=" + this.f167943e.f167940e);
        return C13598b0.f38549a;
    }
}
