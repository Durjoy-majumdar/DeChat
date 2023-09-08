package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/sdk/pipeline/PipelineState;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.FlowPipelineComponent$onCreate$1 */
public final class FlowPipelineComponent$onCreate$1 extends C87413o implements C32226l<PipelineState, C13598b0> {
    public final /* synthetic */ FlowPipelineComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowPipelineComponent$onCreate$1(FlowPipelineComponent flowPipelineComponent) {
        super(1);
        this.this$0 = flowPipelineComponent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PipelineState) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(PipelineState pipelineState) {
        Class<BaseStateAction> cls = BaseStateAction.class;
        C87412m.m108594g(pipelineState, "state");
        FlowPipelineComponent flowPipelineComponent = this.this$0;
        IStateAction action = pipelineState.getAction();
        if (action != null && (action instanceof PipelineInitAction)) {
            PipelineInitAction pipelineInitAction = (PipelineInitAction) action;
            long currentTimeMillis = System.currentTimeMillis();
            Method[] declaredMethods = flowPipelineComponent.getClass().getDeclaredMethods();
            C87412m.m108593f(declaredMethods, "this::class.java.declaredMethods");
            for (Method method : declaredMethods) {
                if (method.isAnnotationPresent(PipelineFlow.class) && method.getParameterTypes().length == 2) {
                    Class cls2 = method.getParameterTypes()[0];
                    Class cls3 = method.getParameterTypes()[1];
                    Class<?> returnType = method.getReturnType();
                    if (!PipelineState.class.isAssignableFrom(cls2) || C87412m.m108589b(cls, cls3) || !cls.isAssignableFrom(cls3) || !cls.isAssignableFrom(returnType)) {
                        throw new RuntimeException("Invalid Flow Method Define, Must like public BaseStateAction flowMethod(DemoAction demoAction)");
                    }
                    flowPipelineComponent.getActionMethodMap().put(cls3.getName(), method);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("init cost ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(' ');
            HashMap access$getActionMethodMap = flowPipelineComponent.getActionMethodMap();
            ArrayList arrayList = new ArrayList(access$getActionMethodMap.size());
            for (Map.Entry value : access$getActionMethodMap.entrySet()) {
                arrayList.add(((Method) value.getValue()).getName());
            }
            sb.append(arrayList);
            sb.append(']');
            Log.m105918d("MicroMsg.Pipeline.FlowPipelineComponent", sb.toString());
        }
    }
}
