package com.tencent.p014mm.sdk.coroutines;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k14.C60949f;
import k14.C99088c;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/FlowController;", "", "", "itemId", "", "inFlow", "(Ljava/lang/String;Lwx3/d;)Ljava/lang/Object;", "", "outFlow", "interval", "Lrx3/b0;", "waitEmpty", "(JLwx3/d;)Ljava/lang/Object;", "", "currentFlowInfo", "(Lwx3/d;)Ljava/lang/Object;", "", "maxFlow", "I", "getMaxFlow", "()I", "Lkotlin/Function0;", "timeTick", "Lfy3/a;", "getTimeTick", "()Lfy3/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "flowMap$delegate", "Lrx3/g;", "getFlowMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "flowMap", "Lk14/c;", "mutex", "Lk14/c;", "<init>", "(ILfy3/a;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.FlowController */
public final class FlowController {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.FlowController";
    private static final AtomicInteger callbackId = new AtomicInteger(0);
    private final C13601g flowMap$delegate;
    private final int maxFlow;
    private final C99088c mutex;
    private final C32224a<Long> timeTick;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/FlowController$Companion;", "", "()V", "TAG", "", "callbackId", "Ljava/util/concurrent/atomic/AtomicInteger;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.coroutines.FlowController$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public FlowController(int i, C32224a<Long> aVar) {
        C87412m.m108594g(aVar, "timeTick");
        this.maxFlow = i;
        this.timeTick = aVar;
        this.flowMap$delegate = C36568h.m40985a(FlowController$flowMap$2.INSTANCE);
        this.mutex = C60949f.m71437a(false, 1, (Object) null);
    }

    private final ConcurrentHashMap<String, Long> getFlowMap() {
        return (ConcurrentHashMap) this.flowMap$delegate.getValue();
    }

    public static /* synthetic */ Object waitEmpty$default(FlowController flowController, long j, C15601d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        return flowController.waitEmpty(j, dVar);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ all -> 0x0090 }, LOOP:0: B:18:0x0070->B:20:0x0076, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object currentFlowInfo(wx3.C15601d<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.sdk.coroutines.FlowController$currentFlowInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.sdk.coroutines.FlowController$currentFlowInfo$1 r0 = (com.tencent.p014mm.sdk.coroutines.FlowController$currentFlowInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.coroutines.FlowController$currentFlowInfo$1 r0 = new com.tencent.mm.sdk.coroutines.FlowController$currentFlowInfo$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.L$2
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r2 = r0.L$1
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r0 = r0.L$0
            com.tencent.mm.sdk.coroutines.FlowController r0 = (com.tencent.p014mm.sdk.coroutines.FlowController) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005b
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r6)
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            sx3.f0 r6 = sx3.C64186f0.f181907d
            r2.f27484d = r6
            k14.c r6 = r5.mutex
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r0 = r6.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            r1 = r6
        L_0x005b:
            java.util.concurrent.ConcurrentHashMap r6 = r0.getFlowMap()     // Catch:{ all -> 0x0090 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0090 }
            int r4 = r6.size()     // Catch:{ all -> 0x0090 }
            r0.<init>(r4)     // Catch:{ all -> 0x0090 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0090 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0090 }
        L_0x0070:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x0090 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0090 }
            java.lang.Object r4 = r4.getKey()     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0090 }
            r0.add(r4)     // Catch:{ all -> 0x0090 }
            goto L_0x0070
        L_0x0086:
            r2.f27484d = r0     // Catch:{ all -> 0x0090 }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0090 }
            r1.mo85909c(r3)
            T r6 = r2.f27484d
            return r6
        L_0x0090:
            r6 = move-exception
            r1.mo85909c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.coroutines.FlowController.currentFlowInfo(wx3.d):java.lang.Object");
    }

    public final int getMaxFlow() {
        return this.maxFlow;
    }

    public final C32224a<Long> getTimeTick() {
        return this.timeTick;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object inFlow(java.lang.String r6, wx3.C15601d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.sdk.coroutines.FlowController$inFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.sdk.coroutines.FlowController$inFlow$1 r0 = (com.tencent.p014mm.sdk.coroutines.FlowController$inFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.coroutines.FlowController$inFlow$1 r0 = new com.tencent.mm.sdk.coroutines.FlowController$inFlow$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r6 = r0.L$2
            k14.c r6 = (k14.C99088c) r6
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.tencent.mm.sdk.coroutines.FlowController r0 = (com.tencent.p014mm.sdk.coroutines.FlowController) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            r6 = r1
            goto L_0x0053
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r7)
            k14.c r7 = r5.mutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r5
        L_0x0053:
            java.util.concurrent.ConcurrentHashMap r1 = r0.getFlowMap()     // Catch:{ all -> 0x0080 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0077
            java.util.concurrent.ConcurrentHashMap r1 = r0.getFlowMap()     // Catch:{ all -> 0x0080 }
            int r1 = r1.size()     // Catch:{ all -> 0x0080 }
            int r2 = r0.maxFlow     // Catch:{ all -> 0x0080 }
            if (r1 > r2) goto L_0x0077
            java.util.concurrent.ConcurrentHashMap r1 = r0.getFlowMap()     // Catch:{ all -> 0x0080 }
            fy3.a<java.lang.Long> r0 = r0.timeTick     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x0080 }
            r1.put(r6, r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0080 }
            r7.mo85909c(r3)
            return r6
        L_0x0080:
            r6 = move-exception
            r7.mo85909c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.coroutines.FlowController.inFlow(java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object outFlow(java.lang.String r7, wx3.C15601d<? super java.lang.Long> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.sdk.coroutines.FlowController$outFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.sdk.coroutines.FlowController$outFlow$1 r0 = (com.tencent.p014mm.sdk.coroutines.FlowController$outFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.coroutines.FlowController$outFlow$1 r0 = new com.tencent.mm.sdk.coroutines.FlowController$outFlow$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r7 = r0.L$2
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.tencent.mm.sdk.coroutines.FlowController r0 = (com.tencent.p014mm.sdk.coroutines.FlowController) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r1
            goto L_0x0053
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            k14.c r8 = r6.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r0 = r8.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r6
        L_0x0053:
            fy3.a<java.lang.Long> r1 = r0.timeTick     // Catch:{ all -> 0x0080 }
            java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x0080 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0080 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0080 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.getFlowMap()     // Catch:{ all -> 0x0080 }
            java.lang.Object r7 = r0.remove(r7)     // Catch:{ all -> 0x0080 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0080 }
            if (r7 != 0) goto L_0x0072
            r4 = -1
            java.lang.Long r7 = new java.lang.Long     // Catch:{ all -> 0x0080 }
            r7.<init>(r4)     // Catch:{ all -> 0x0080 }
        L_0x0072:
            long r4 = r7.longValue()     // Catch:{ all -> 0x0080 }
            long r1 = r1 - r4
            java.lang.Long r7 = new java.lang.Long     // Catch:{ all -> 0x0080 }
            r7.<init>(r1)     // Catch:{ all -> 0x0080 }
            r8.mo85909c(r3)
            return r7
        L_0x0080:
            r7 = move-exception
            r8.mo85909c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.coroutines.FlowController.outFlow(java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object waitEmpty(long r7, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.tencent.p014mm.sdk.coroutines.FlowController$waitEmpty$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.tencent.mm.sdk.coroutines.FlowController$waitEmpty$1 r0 = (com.tencent.p014mm.sdk.coroutines.FlowController$waitEmpty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sdk.coroutines.FlowController$waitEmpty$1 r0 = new com.tencent.mm.sdk.coroutines.FlowController$waitEmpty$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.tencent.mm.sdk.coroutines.FlowController r2 = (com.tencent.p014mm.sdk.coroutines.FlowController) r2
            kotlin.ResultKt.throwOnFailure(r9)
        L_0x002f:
            r9 = r2
            goto L_0x0047
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            long r7 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.tencent.mm.sdk.coroutines.FlowController r2 = (com.tencent.p014mm.sdk.coroutines.FlowController) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0057
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r6
        L_0x0047:
            r0.L$0 = r9
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r2 = r9.currentFlowInfo(r0)
            if (r2 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r5 = r2
            r2 = r9
            r9 = r5
        L_0x0057:
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x006d
            r0.L$0 = r2
            r0.J$0 = r7
            r0.label = r3
            java.lang.Object r9 = a14.C53965x0.m60607b(r7, r0)
            if (r9 != r1) goto L_0x002f
            return r1
        L_0x006d:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.coroutines.FlowController.waitEmpty(long, wx3.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowController(int i, C32224a aVar, int i2, C8480h hVar) {
        this(i, (i2 & 2) != 0 ? C307081.INSTANCE : aVar);
    }
}
