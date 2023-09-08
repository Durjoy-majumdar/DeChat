package xu0;

import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p196ln.C76706g;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C50052jy2;

/* renamed from: xu0.e */
public final class C102728e extends PipelineComponent {

    /* renamed from: xu0.e$a */
    public static final class C78990a extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public static final C78990a f231942d = new C78990a();

        public C78990a() {
            super(1);
        }

        public Object invoke(Object obj) {
            PipelineState pipelineState = (PipelineState) obj;
            Class cls = C75700k0.class;
            C87412m.m108594g(pipelineState, "state");
            IStateAction action = pipelineState.getAction();
            if (action != null && (action instanceof C78989c)) {
                C78989c cVar = (C78989c) action;
                C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(cVar.f231941a);
                if (Lo == null) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(cVar.f231941a);
                    byte[] f4 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69697f4(cVar.f231941a);
                    if (f4 != null) {
                        String str = cVar.f231941a;
                        C47465a parseFrom = new C50052jy2().parseFrom(f4);
                        C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModContact");
                        Lo = C68081f.m80470e(str, (C50052jy2) parseFrom, z1Var);
                    }
                }
                if (Lo != null) {
                    pipelineState.put("Avatar_ImgFlag", Lo);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xu0.e$b */
    public static final class C102729b extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102728e f303342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102729b(C102728e eVar) {
            super(1);
            this.f303342d = eVar;
        }

        public Object invoke(Object obj) {
            PipelineState pipelineState = (PipelineState) obj;
            C87412m.m108594g(pipelineState, "state");
            C102728e eVar = this.f303342d;
            IStateAction action = pipelineState.getAction();
            if (action != null && (action instanceof C78989c)) {
                C78989c cVar = (C78989c) action;
                eVar.dispatch(new C102727d((C68097n) pipelineState.get("Avatar_ImgFlag")));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102728e(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public void onCreate() {
        process(C78990a.f231942d);
        observe(new C102729b(this));
    }
}
