package n20;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import f14.C58901s;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: n20.o */
public final class C61609o extends PipelineComponent {

    /* renamed from: n20.o$a */
    public static final class C61610a extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61609o f175203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61610a(C61609o oVar) {
            super(1);
            this.f175203d = oVar;
        }

        public Object invoke(Object obj) {
            PipelineState pipelineState = (PipelineState) obj;
            C87412m.m108594g(pipelineState, "state");
            C61609o oVar = this.f175203d;
            IStateAction action = pipelineState.getAction();
            if (action != null && (action instanceof C61606l)) {
                LifecycleScope lifecycleScope = oVar.stateCenter().getLifecycleScope();
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C61608n((C61606l) action, pipelineState, oVar, (C15601d<? super C61608n>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61609o(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public void onCreate() {
        observe(new C61610a(this));
    }
}
