package com.tencent.p014mm.sdk.platformtools;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53965x0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64175a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H@¨\u0006\u0003"}, mo182094d2 = {"T", "La14/n0;", "Lrx3/b0;", "com/tencent/mm/sdk/platformtools/MMBatchRunKt$batchRun$2", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$lambda-3$$inlined$batchRun$default$1", mo125469f = "MMSlot.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$lambda-3$$inlined$batchRun$default$1  reason: invalid class name */
public final class MMFileSlotManager$clearSlot$lambda3$$inlined$batchRun$default$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ long $delay;
    public final /* synthetic */ String $key;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MMFileSlotManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFileSlotManager$clearSlot$lambda3$$inlined$batchRun$default$1(long j, String str, C15601d dVar, MMFileSlotManager mMFileSlotManager) {
        super(2, dVar);
        this.$delay = j;
        this.$key = str;
        this.this$0 = mMFileSlotManager;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        MMFileSlotManager$clearSlot$lambda3$$inlined$batchRun$default$1 r0 = new MMFileSlotManager$clearSlot$lambda3$$inlined$batchRun$default$1(this.$delay, this.$key, dVar, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((MMFileSlotManager$clearSlot$lambda3$$inlined$batchRun$default$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        ArrayList<List> arrayList;
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
                arrayList = new ArrayList<>(queue2);
            }
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (List list : arrayList) {
                C87412m.m108591d(list);
                C64175a0.m75508p(arrayList2, list);
            }
            if (!arrayList2.isEmpty()) {
                String access$getTAG$p = this.this$0.TAG;
                Log.m105924i(access$getTAG$p, "clear file slots:\n" + C110818d0.m150921S(arrayList2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                ((C119157j) C119157j.f356862d).mo183884o(new MMFileSlotManager$clearSlot$3$1$1(arrayList2));
            }
        }
        __BATCH_RUN_OBJ.INSTANCE.getBatchJobs().remove(this.$key);
        return C13598b0.f38549a;
    }
}
