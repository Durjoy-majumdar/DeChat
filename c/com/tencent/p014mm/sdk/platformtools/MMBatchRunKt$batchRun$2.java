package com.tencent.p014mm.sdk.platformtools;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53965x0;
import fy3.C32226l;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H@"}, mo182094d2 = {"T", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.platformtools.MMBatchRunKt$batchRun$2", mo125469f = "MMBatchRun.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.platformtools.MMBatchRunKt$batchRun$2 */
public final class MMBatchRunKt$batchRun$2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ long $delay;
    public final /* synthetic */ String $key;
    public final /* synthetic */ C32226l<List<? extends T>, C13598b0> $run;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBatchRunKt$batchRun$2(long j, C32226l<? super List<? extends T>, C13598b0> lVar, String str, C15601d<? super MMBatchRunKt$batchRun$2> dVar) {
        super(2, dVar);
        this.$delay = j;
        this.$run = lVar;
        this.$key = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        MMBatchRunKt$batchRun$2 mMBatchRunKt$batchRun$2 = new MMBatchRunKt$batchRun$2(this.$delay, this.$run, this.$key, dVar);
        mMBatchRunKt$batchRun$2.L$0 = obj;
        return mMBatchRunKt$batchRun$2;
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((MMBatchRunKt$batchRun$2) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        ArrayList arrayList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.L$0;
            long j = this.$delay;
            this.L$0 = n0Var2;
            this.label = 1;
            if (C53965x0.m60607b(j, this) == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
        } else if (i == 1) {
            n0Var = (C0000n0) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!C53930o0.m60560g(n0Var)) {
            return C13598b0.f38549a;
        }
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        String str = this.$key;
        synchronized (__batch_run_obj) {
            Queue<?> queue = __batch_run_obj.getBatchData().get(str);
            arrayList = null;
            Queue queue2 = queue instanceof Queue ? queue : null;
            if (queue2 != null) {
                __batch_run_obj.getBatchData().remove(str);
                arrayList = new ArrayList(queue2);
            }
        }
        if (arrayList != null) {
            this.$run.invoke(arrayList);
        }
        __batch_run_obj.getBatchJobs().remove(this.$key);
        return C13598b0.f38549a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        ArrayList arrayList;
        C53965x0.m60607b(this.$delay, this);
        if (!C53930o0.m60560g((C0000n0) this.L$0)) {
            return C13598b0.f38549a;
        }
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        String str = this.$key;
        synchronized (__batch_run_obj) {
            Queue<?> queue = __batch_run_obj.getBatchData().get(str);
            arrayList = null;
            Queue queue2 = queue instanceof Queue ? queue : null;
            if (queue2 != null) {
                __batch_run_obj.getBatchData().remove(str);
                arrayList = new ArrayList(queue2);
            }
        }
        if (arrayList != null) {
            this.$run.invoke(arrayList);
        }
        __batch_run_obj.getBatchJobs().remove(this.$key);
        return C13598b0.f38549a;
    }
}
