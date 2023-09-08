package com.tencent.p014mm.sdk.pipeline;

import a14.C53934p0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.plugin.PluginLifecycleRegistry;
import com.tencent.p014mm.sdk.statecenter.ServiceStateCenter;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 U2\u00020\u0001:\u0001UBE\b\u0002\u0012\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0'0&\u0012\u0006\u0010-\u001a\u00020\u001e\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010=\u001a\u00020<¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0019\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0000¢\u0006\u0004\b$\u0010\u0018R%\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0'0&8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010\u0016\u001a\u0004\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010=\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010L\u001a\u0012\u0012\u0004\u0012\u00020(0Jj\b\u0012\u0004\u0012\u00020(`K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0N8\u0000X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006V"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/Pipeline;", "Landroidx/lifecycle/s;", "Lrx3/b0;", "runInWorkerThread", "finishInWorkerThread", "runInUIThread", "finishInUIThread", "onCreate", "onDestroy", "onPause", "onResume", "Landroidx/lifecycle/j;", "getLifecycle", "run$wechat_sdk_release", "()Lcom/tencent/mm/sdk/pipeline/Pipeline;", "run", "finish$wechat_sdk_release", "()V", "finish", "cancel$wechat_sdk_release", "cancel", "Lkotlin/Function0;", "callback", "pause$wechat_sdk_release", "(Lfy3/a;)V", "pause", "resume$wechat_sdk_release", "resume", "", "resultCode", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "data", "setResult$wechat_sdk_release", "(ILcom/tencent/mm/sdk/pipeline/PipelineState;)V", "setResult", "block", "runOnPipelineThread$wechat_sdk_release", "runOnPipelineThread", "", "Ljava/lang/Class;", "Lcom/tencent/mm/sdk/pipeline/PipelineComponent;", "pipelineComponentSet", "Ljava/util/Set;", "getPipelineComponentSet", "()Ljava/util/Set;", "initState", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "getInitState", "()Lcom/tencent/mm/sdk/pipeline/PipelineState;", "", "bizName", "Ljava/lang/String;", "getBizName", "()Ljava/lang/String;", "Lcom/tencent/mm/sdk/pipeline/PipelineCallback;", "Lcom/tencent/mm/sdk/pipeline/PipelineCallback;", "getCallback", "()Lcom/tencent/mm/sdk/pipeline/PipelineCallback;", "setCallback", "(Lcom/tencent/mm/sdk/pipeline/PipelineCallback;)V", "", "uiThread", "Z", "getUiThread", "()Z", "Lcom/tencent/mm/sdk/plugin/PluginLifecycleRegistry;", "lifecycle", "Lcom/tencent/mm/sdk/plugin/PluginLifecycleRegistry;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "workerScope$delegate", "Lrx3/g;", "getWorkerScope", "()Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "workerScope", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "pipelineComponentInstanceSet", "Ljava/util/HashSet;", "Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter;", "stateCenter", "Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter;", "getStateCenter$wechat_sdk_release", "()Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter;", "<init>", "(Ljava/util/Set;Lcom/tencent/mm/sdk/pipeline/PipelineState;Ljava/lang/String;Lcom/tencent/mm/sdk/pipeline/PipelineCallback;Z)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.pipeline.Pipeline */
public final class Pipeline implements C0125s {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_FINISH = 0;
    public static final int RESULT_PROGRESS = 0;
    public static final String TAG = "MicroMsg.Pipeline.Pipeline";
    private final String bizName;
    private PipelineCallback callback;
    private final PipelineState initState;
    private final PluginLifecycleRegistry lifecycle;
    private final HashSet<PipelineComponent> pipelineComponentInstanceSet;
    private final Set<Class<? extends PipelineComponent>> pipelineComponentSet;
    private final ServiceStateCenter<PipelineState> stateCenter;
    private final boolean uiThread;
    private final C13601g workerScope$delegate;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J.\u0010\f\u001a\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J:\u0010\u000f\u001a\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J:\u0010\u0010\u001a\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007JC\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/pipeline/Pipeline$Companion;", "", "", "Ljava/lang/Class;", "Lcom/tencent/mm/sdk/pipeline/PipelineComponent;", "componentList", "Lcom/tencent/mm/sdk/pipeline/PipelineState;", "state", "", "bizName", "Lcom/tencent/mm/sdk/pipeline/PipelineController;", "startPipeline", "startUIPipeline", "Lcom/tencent/mm/sdk/pipeline/PipelineCallback;", "callback", "startPipelineForResult", "startUIPipelineForResult", "", "timeout", "Lcom/tencent/mm/sdk/pipeline/PipelineResult;", "startSyncPipelineForResult", "(Ljava/util/List;Lcom/tencent/mm/sdk/pipeline/PipelineState;Ljava/lang/String;JLwx3/d;)Ljava/lang/Object;", "", "RESULT_ERROR", "I", "RESULT_FINISH", "RESULT_PROGRESS", "TAG", "Ljava/lang/String;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.pipeline.Pipeline$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public static /* synthetic */ PipelineController startPipelineForResult$default(Companion companion, List list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback, int i, Object obj) {
            if ((i & 8) != 0) {
                pipelineCallback = null;
            }
            return companion.startPipelineForResult(list, pipelineState, str, pipelineCallback);
        }

        public static /* synthetic */ Object startSyncPipelineForResult$default(Companion companion, List list, PipelineState pipelineState, String str, long j, C15601d dVar, int i, Object obj) {
            if ((i & 8) != 0) {
                j = 300000;
            }
            return companion.startSyncPipelineForResult(list, pipelineState, str, j, dVar);
        }

        public static /* synthetic */ PipelineController startUIPipelineForResult$default(Companion companion, List list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback, int i, Object obj) {
            if ((i & 8) != 0) {
                pipelineCallback = null;
            }
            return companion.startUIPipelineForResult(list, pipelineState, str, pipelineCallback);
        }

        public final PipelineController startPipeline(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str) {
            C87412m.m108594g(list, "componentList");
            C87412m.m108594g(pipelineState, "state");
            C87412m.m108594g(str, "bizName");
            return new PipelineController(new WeakReference(new Pipeline(C110818d0.m150904D0(list), pipelineState, str, (PipelineCallback) null, false, 24, (C8480h) null).run$wechat_sdk_release()));
        }

        public final PipelineController startPipelineForResult(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback) {
            C87412m.m108594g(list, "componentList");
            C87412m.m108594g(pipelineState, "state");
            C87412m.m108594g(str, "bizName");
            return new PipelineController(new WeakReference(new Pipeline(C110818d0.m150904D0(list), pipelineState, str, pipelineCallback, false, 16, (C8480h) null).run$wechat_sdk_release()));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object startSyncPipelineForResult(java.util.List<? extends java.lang.Class<? extends com.tencent.p014mm.sdk.pipeline.PipelineComponent>> r13, com.tencent.p014mm.sdk.pipeline.PipelineState r14, java.lang.String r15, long r16, wx3.C15601d<? super com.tencent.p014mm.sdk.pipeline.PipelineResult> r18) {
            /*
                r12 = this;
                r0 = r12
                r1 = r18
                boolean r2 = r1 instanceof com.tencent.p014mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1
                if (r2 == 0) goto L_0x0016
                r2 = r1
                com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1 r2 = (com.tencent.p014mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0016
                int r3 = r3 - r4
                r2.label = r3
                goto L_0x001b
            L_0x0016:
                com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1 r2 = new com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$1
                r2.<init>(r12, r1)
            L_0x001b:
                java.lang.Object r1 = r2.result
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r2.label
                r5 = 1
                if (r4 == 0) goto L_0x003e
                if (r4 != r5) goto L_0x0036
                java.lang.Object r3 = r2.L$2
                gy3.f0 r3 = (gy3.C8479f0) r3
                java.lang.Object r4 = r2.L$1
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r2 = r2.L$0
                com.tencent.mm.sdk.pipeline.Pipeline$Companion r2 = (com.tencent.p014mm.sdk.pipeline.Pipeline.Companion) r2
                kotlin.ResultKt.throwOnFailure(r1)
                goto L_0x0066
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r1)
                gy3.f0 r1 = new gy3.f0
                r1.<init>()
                com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2 r4 = new com.tencent.mm.sdk.pipeline.Pipeline$Companion$startSyncPipelineForResult$2
                r11 = 0
                r6 = r4
                r7 = r1
                r8 = r13
                r9 = r14
                r10 = r15
                r6.<init>(r7, r8, r9, r10, r11)
                r2.L$0 = r0
                r6 = r15
                r2.L$1 = r6
                r2.L$2 = r1
                r2.label = r5
                r7 = r16
                java.lang.Object r2 = a14.C53860b3.m60375c(r7, r4, r2)
                if (r2 != r3) goto L_0x0063
                return r3
            L_0x0063:
                r3 = r1
                r1 = r2
                r4 = r6
            L_0x0066:
                com.tencent.mm.sdk.pipeline.PipelineResult r1 = (com.tencent.p014mm.sdk.pipeline.PipelineResult) r1
                if (r1 != 0) goto L_0x00c4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "pipeline is timeout "
                r1.append(r2)
                T r2 = r3.f27484d
                com.tencent.mm.sdk.pipeline.Pipeline r2 = (com.tencent.p014mm.sdk.pipeline.Pipeline) r2
                r5 = 0
                if (r2 == 0) goto L_0x0080
                java.lang.String r2 = r2.getBizName()
                goto L_0x0081
            L_0x0080:
                r2 = r5
            L_0x0081:
                r1.append(r2)
                r2 = 32
                r1.append(r2)
                T r2 = r3.f27484d
                com.tencent.mm.sdk.pipeline.Pipeline r2 = (com.tencent.p014mm.sdk.pipeline.Pipeline) r2
                if (r2 == 0) goto L_0x0099
                int r2 = r2.hashCode()
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r2)
                goto L_0x009a
            L_0x0099:
                r6 = r5
            L_0x009a:
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.Pipeline.Pipeline"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                T r1 = r3.f27484d
                com.tencent.mm.sdk.pipeline.Pipeline r1 = (com.tencent.p014mm.sdk.pipeline.Pipeline) r1
                if (r1 != 0) goto L_0x00ad
                goto L_0x00b0
            L_0x00ad:
                r1.setCallback(r5)
            L_0x00b0:
                T r1 = r3.f27484d
                com.tencent.mm.sdk.pipeline.Pipeline r1 = (com.tencent.p014mm.sdk.pipeline.Pipeline) r1
                if (r1 == 0) goto L_0x00b9
                r1.cancel$wechat_sdk_release()
            L_0x00b9:
                com.tencent.mm.sdk.pipeline.PipelineResult r1 = new com.tencent.mm.sdk.pipeline.PipelineResult
                r2 = -1
                com.tencent.mm.sdk.pipeline.PipelineState r3 = new com.tencent.mm.sdk.pipeline.PipelineState
                r3.<init>()
                r1.<init>(r4, r2, r3)
            L_0x00c4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.pipeline.Pipeline.Companion.startSyncPipelineForResult(java.util.List, com.tencent.mm.sdk.pipeline.PipelineState, java.lang.String, long, wx3.d):java.lang.Object");
        }

        public final PipelineController startUIPipeline(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str) {
            C87412m.m108594g(list, "componentList");
            C87412m.m108594g(pipelineState, "state");
            C87412m.m108594g(str, "bizName");
            return new PipelineController(new WeakReference(new Pipeline(C110818d0.m150904D0(list), pipelineState, str, (PipelineCallback) null, true, 8, (C8480h) null).run$wechat_sdk_release()));
        }

        public final PipelineController startUIPipelineForResult(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback) {
            C87412m.m108594g(list, "componentList");
            C87412m.m108594g(pipelineState, "state");
            C87412m.m108594g(str, "bizName");
            return new PipelineController(new WeakReference(new Pipeline(C110818d0.m150904D0(list), pipelineState, str, pipelineCallback, true, (C8480h) null).run$wechat_sdk_release()));
        }
    }

    private Pipeline(Set<? extends Class<? extends PipelineComponent>> set, PipelineState pipelineState, String str, PipelineCallback pipelineCallback, boolean z) {
        this.pipelineComponentSet = set;
        this.initState = pipelineState;
        this.bizName = str;
        this.callback = pipelineCallback;
        this.uiThread = z;
        this.lifecycle = new PluginLifecycleRegistry();
        this.workerScope$delegate = C36568h.m40985a(new Pipeline$workerScope$2(this));
        this.pipelineComponentInstanceSet = new HashSet<>();
        this.stateCenter = new ServiceStateCenter<>(pipelineState, this, TAG, getWorkerScope());
    }

    public /* synthetic */ Pipeline(Set set, PipelineState pipelineState, String str, PipelineCallback pipelineCallback, boolean z, C8480h hVar) {
        this(set, pipelineState, str, pipelineCallback, z);
    }

    private final void finishInUIThread() {
        CommonKt.uiThread(new Pipeline$finishInUIThread$1(this));
    }

    private final void finishInWorkerThread() {
        LifecycleScope.launchDefault$default(getWorkerScope(), (C53934p0) null, new Pipeline$finishInWorkerThread$1(this, (C15601d<? super Pipeline$finishInWorkerThread$1>) null), 1, (Object) null);
    }

    private final LifecycleScope getWorkerScope() {
        return (LifecycleScope) this.workerScope$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onCreate() {
        Log.m105924i(TAG, "onCreate " + hashCode());
        this.lifecycle.moveToCreateState();
        for (Class constructor : this.pipelineComponentSet) {
            HashSet<PipelineComponent> hashSet = this.pipelineComponentInstanceSet;
            hashSet.add((PipelineComponent) constructor.getConstructor(new Class[]{Pipeline.class}).newInstance(new Object[]{this}));
        }
        try {
            for (PipelineComponent onCreateBefore : this.pipelineComponentInstanceSet) {
                onCreateBefore.onCreateBefore();
            }
            for (PipelineComponent onCreate : this.pipelineComponentInstanceSet) {
                onCreate.onCreate();
            }
            for (PipelineComponent onCreateAfter : this.pipelineComponentInstanceSet) {
                onCreateAfter.onCreateAfter();
            }
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace(TAG, e, "onCreate", new Object[0]);
            PipelineState pipelineState = new PipelineState();
            pipelineState.put("ErrCode", -1);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult$wechat_sdk_release(-1, pipelineState);
            finish$wechat_sdk_release();
        }
    }

    /* access modifiers changed from: private */
    public final void onDestroy() {
        try {
            for (PipelineComponent onDestroy : this.pipelineComponentInstanceSet) {
                onDestroy.onDestroy();
            }
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace(TAG, e, "onDestroy", new Object[0]);
            PipelineState pipelineState = new PipelineState();
            pipelineState.put("ErrCode", -2);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult$wechat_sdk_release(-1, pipelineState);
            finish$wechat_sdk_release();
        }
        this.lifecycle.moveToDestroyState();
        Log.m105924i(TAG, "onDestroy " + hashCode());
    }

    /* access modifiers changed from: private */
    public final void onPause() {
        try {
            for (PipelineComponent onPause : this.pipelineComponentInstanceSet) {
                onPause.onPause();
            }
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace(TAG, e, "onPause", new Object[0]);
            PipelineState pipelineState = new PipelineState();
            pipelineState.put("ErrCode", -3);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult$wechat_sdk_release(-1, pipelineState);
            finish$wechat_sdk_release();
        }
    }

    /* access modifiers changed from: private */
    public final void onResume() {
        try {
            for (PipelineComponent onResume : this.pipelineComponentInstanceSet) {
                onResume.onResume();
            }
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace(TAG, e, "onResume", new Object[0]);
            PipelineState pipelineState = new PipelineState();
            pipelineState.put("ErrCode", -4);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult$wechat_sdk_release(-1, pipelineState);
            finish$wechat_sdk_release();
        }
    }

    public static /* synthetic */ void pause$wechat_sdk_release$default(Pipeline pipeline, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        pipeline.pause$wechat_sdk_release(aVar);
    }

    public static /* synthetic */ void resume$wechat_sdk_release$default(Pipeline pipeline, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        pipeline.resume$wechat_sdk_release(aVar);
    }

    private final void runInUIThread() {
        CommonKt.uiThread(new Pipeline$runInUIThread$1(this));
    }

    private final void runInWorkerThread() {
        LifecycleScope.launchDefault$default(getWorkerScope(), (C53934p0) null, new Pipeline$runInWorkerThread$1(this, (C15601d<? super Pipeline$runInWorkerThread$1>) null), 1, (Object) null);
    }

    public static final PipelineController startPipeline(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str) {
        return Companion.startPipeline(list, pipelineState, str);
    }

    public static final PipelineController startPipelineForResult(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback) {
        return Companion.startPipelineForResult(list, pipelineState, str, pipelineCallback);
    }

    public static final Object startSyncPipelineForResult(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, long j, C15601d<? super PipelineResult> dVar) {
        return Companion.startSyncPipelineForResult(list, pipelineState, str, j, dVar);
    }

    public static final PipelineController startUIPipeline(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str) {
        return Companion.startUIPipeline(list, pipelineState, str);
    }

    public static final PipelineController startUIPipelineForResult(List<? extends Class<? extends PipelineComponent>> list, PipelineState pipelineState, String str, PipelineCallback pipelineCallback) {
        return Companion.startUIPipelineForResult(list, pipelineState, str, pipelineCallback);
    }

    public final void cancel$wechat_sdk_release() {
        Log.m105918d(TAG, "cancel " + hashCode());
        finish$wechat_sdk_release();
    }

    public final void finish$wechat_sdk_release() {
        if (this.uiThread) {
            finishInWorkerThread();
        } else {
            finishInUIThread();
        }
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final PipelineCallback getCallback() {
        return this.callback;
    }

    public final PipelineState getInitState() {
        return this.initState;
    }

    public C39623j getLifecycle() {
        return this.lifecycle;
    }

    public final Set<Class<? extends PipelineComponent>> getPipelineComponentSet() {
        return this.pipelineComponentSet;
    }

    public final ServiceStateCenter<PipelineState> getStateCenter$wechat_sdk_release() {
        return this.stateCenter;
    }

    public final boolean getUiThread() {
        return this.uiThread;
    }

    public final void pause$wechat_sdk_release(C32224a<C13598b0> aVar) {
        LifecycleScope.launchDefault$default(getWorkerScope(), (C53934p0) null, new Pipeline$pause$1(this, (C15601d<? super Pipeline$pause$1>) null), 1, (Object) null);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void resume$wechat_sdk_release(C32224a<C13598b0> aVar) {
        LifecycleScope.launchDefault$default(getWorkerScope(), (C53934p0) null, new Pipeline$resume$1(this, (C15601d<? super Pipeline$resume$1>) null), 1, (Object) null);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final Pipeline run$wechat_sdk_release() {
        if (this.uiThread) {
            runInUIThread();
        } else {
            runInWorkerThread();
        }
        return this;
    }

    public final void runOnPipelineThread$wechat_sdk_release(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (this.uiThread) {
            CommonKt.uiThread(aVar);
        } else {
            LifecycleScope.launchDefault$default(getWorkerScope(), (C53934p0) null, new Pipeline$runOnPipelineThread$1(aVar, (C15601d<? super Pipeline$runOnPipelineThread$1>) null), 1, (Object) null);
        }
    }

    public final void setCallback(PipelineCallback pipelineCallback) {
        this.callback = pipelineCallback;
    }

    public final void setResult$wechat_sdk_release(int i, PipelineState pipelineState) {
        C87412m.m108594g(pipelineState, "data");
        Log.m105924i(TAG, "onResult " + hashCode() + ' ' + this.bizName + ' ' + i);
        PipelineCallback pipelineCallback = this.callback;
        if (pipelineCallback != null) {
            pipelineCallback.onResult(new PipelineResult(this.bizName, i, pipelineState));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pipeline(Set set, PipelineState pipelineState, String str, PipelineCallback pipelineCallback, boolean z, int i, C8480h hVar) {
        this(set, pipelineState, str, (i & 8) != 0 ? null : pipelineCallback, (i & 16) != 0 ? false : z);
    }
}
