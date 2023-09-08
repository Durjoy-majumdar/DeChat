package com.tencent.p014mm.sdk.pipeline;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0017J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R7\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f`\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/FlowPipelineComponent;", "Lcom/tencent/mm/sdk/pipeline/PipelineComponent;", "Lcom/tencent/mm/sdk/statecenter/BaseStateAction;", "returnAction", "Lrx3/b0;", "handleReturnAction", "onCreate", "onCreateAfter", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "start", "onPipelineDuplicated", "", "getUniqueKey", "Ljava/util/HashMap;", "Ljava/lang/reflect/Method;", "Lkotlin/collections/HashMap;", "actionMethodMap$delegate", "Lrx3/g;", "getActionMethodMap", "()Ljava/util/HashMap;", "actionMethodMap", "Lcom/tencent/mm/sdk/pipeline/Pipeline;", "pipeline", "<init>", "(Lcom/tencent/mm/sdk/pipeline/Pipeline;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.FlowPipelineComponent */
public abstract class FlowPipelineComponent extends PipelineComponent {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.Pipeline.FlowPipelineComponent";
    /* access modifiers changed from: private */
    public static final HashMap<String, Set<WeakReference<FlowPipelineComponent>>> uniquePipelineMap = new HashMap<>();
    private final C13601g actionMethodMap$delegate = C36568h.m40985a(FlowPipelineComponent$actionMethodMap$2.INSTANCE);

    @Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000RB\u0010\u0005\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006j\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/FlowPipelineComponent$Companion;", "", "()V", "TAG", "", "uniquePipelineMap", "Ljava/util/HashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/sdk/pipeline/FlowPipelineComponent;", "Lkotlin/collections/HashMap;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.pipeline.FlowPipelineComponent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowPipelineComponent(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    /* access modifiers changed from: private */
    public final HashMap<String, Method> getActionMethodMap() {
        return (HashMap) this.actionMethodMap$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleReturnAction(BaseStateAction baseStateAction) {
        Log.m105918d(TAG, "handleReturnAction " + getUniqueKey() + ' ' + hashCode() + ' ' + baseStateAction.getClass().getName());
        String uniqueKey = getUniqueKey();
        if (baseStateAction instanceof PipelineSuccessAction) {
            if (!C112551y.m153811k(uniqueKey)) {
                Log.m105918d(TAG, "start success pipeline remove duplicated task " + uniqueKey);
                runOnPipelineThread$wechat_sdk_release(new FlowPipelineComponent$handleReturnAction$1(this, baseStateAction));
                return;
            }
            setResultFinish(((PipelineSuccessAction) baseStateAction).getPipelineState());
        } else if (baseStateAction instanceof PipelineFailAction) {
            Set remove = uniquePipelineMap.remove(getUniqueKey());
            if (!C112551y.m153811k(uniqueKey)) {
                Log.m105918d(TAG, "start error pipeline remove duplicated task " + uniqueKey);
                runOnPipelineThread$wechat_sdk_release(new FlowPipelineComponent$handleReturnAction$2(remove, this, baseStateAction));
                return;
            }
            setResultError(((PipelineFailAction) baseStateAction).getPipelineState());
        } else {
            dispatch(baseStateAction);
        }
    }

    public String getUniqueKey() {
        return "";
    }

    public void onCreate() {
        process(new FlowPipelineComponent$onCreate$1(this));
        observe(new FlowPipelineComponent$onCreate$2(this));
    }

    public void onCreateAfter() {
        String uniqueKey = getUniqueKey();
        boolean z = true;
        if (!C112551y.m153811k(uniqueKey)) {
            HashMap<String, Set<WeakReference<FlowPipelineComponent>>> hashMap = uniquePipelineMap;
            Set<WeakReference<FlowPipelineComponent>> set = hashMap.get(uniqueKey);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                hashMap.put(uniqueKey, set);
            }
            Set set2 = set;
            if (!set2.isEmpty()) {
                set2.add(new WeakReference(this));
                onPipelineDuplicated();
                Log.m105918d(TAG, "duplicated add to list " + getUniqueKey() + ' ' + hashCode());
                return;
            }
            set2.add(new WeakReference(this));
            Log.m105918d(TAG, "first add to list " + getUniqueKey() + ' ' + hashCode());
        }
        BaseStateAction start = start(state());
        if (start instanceof PipelineSuccessAction) {
            Set remove = uniquePipelineMap.remove(getUniqueKey());
            if (remove == null || !(!remove.isEmpty())) {
                z = false;
            }
            if (z) {
                Log.m105918d(TAG, "success remove " + getUniqueKey() + ' ' + remove.size());
            }
        } else if (start instanceof PipelineFailAction) {
            Set remove2 = uniquePipelineMap.remove(getUniqueKey());
            if (remove2 == null || !(!remove2.isEmpty())) {
                z = false;
            }
            if (z) {
                Log.m105918d(TAG, "error remove " + getUniqueKey() + ' ' + remove2.size());
            }
        }
        handleReturnAction(new PipelineInitAction(start));
    }

    public void onPipelineDuplicated() {
    }

    public abstract BaseStateAction start(PipelineState pipelineState);
}
