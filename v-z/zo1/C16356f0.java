package zo1;

import a14.C0000n0;
import a14.C53965x0;
import android.widget.TextView;
import fy3.C32227p;
import gy3.C8478d0;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.plugin.ReplayTransitionLazyPlugin$playAppendAnim$1", mo125469f = "ReplayTransitionLazyPlugin.kt", mo125470l = {72}, mo125471m = "invokeSuspend")
/* renamed from: zo1.f0 */
public final class C16356f0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43721d;

    /* renamed from: e */
    public final /* synthetic */ C16344b0 f43722e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f43723f;

    /* renamed from: g */
    public final /* synthetic */ TextView f43724g;

    /* renamed from: h */
    public final /* synthetic */ String f43725h;

    /* renamed from: i */
    public final /* synthetic */ List<String> f43726i;

    /* renamed from: j */
    public final /* synthetic */ int f43727j;

    /* renamed from: n */
    public final /* synthetic */ long f43728n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16356f0(C16344b0 b0Var, C8478d0 d0Var, TextView textView, String str, List<String> list, int i, long j, C15601d<? super C16356f0> dVar) {
        super(2, dVar);
        this.f43722e = b0Var;
        this.f43723f = d0Var;
        this.f43724g = textView;
        this.f43725h = str;
        this.f43726i = list;
        this.f43727j = i;
        this.f43728n = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16356f0(this.f43722e, this.f43723f, this.f43724g, this.f43725h, this.f43726i, this.f43727j, this.f43728n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16356f0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43721d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f43722e.f43697A = true;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (this.f43722e.f43697A) {
            C8478d0 d0Var = this.f43723f;
            int i2 = d0Var.f27483d + 1;
            d0Var.f27483d = i2;
            if (i2 > Integer.MAX_VALUE) {
                d0Var.f27483d = 0;
            }
            TextView textView = this.f43724g;
            textView.setText(this.f43725h + this.f43726i.get(this.f43723f.f27483d % this.f43727j));
            long j = this.f43728n;
            this.f43721d = 1;
            if (C53965x0.m60607b(j, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
