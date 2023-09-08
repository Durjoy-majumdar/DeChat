package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.__BATCH_RUN_OBJ;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcher$preAuth$$inlined$batchRun$1", mo125469f = "WebPrefetcher.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n0 */
public final class C40742n0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f109454d;

    /* renamed from: e */
    public /* synthetic */ Object f109455e;

    /* renamed from: f */
    public final /* synthetic */ long f109456f;

    /* renamed from: g */
    public final /* synthetic */ String f109457g;

    /* renamed from: h */
    public final /* synthetic */ C40717k0 f109458h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40742n0(long j, String str, C15601d dVar, C40717k0 k0Var) {
        super(2, dVar);
        this.f109456f = j;
        this.f109457g = str;
        this.f109458h = k0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C40742n0 n0Var = new C40742n0(this.f109456f, this.f109457g, dVar, this.f109458h);
        n0Var.f109455e = obj;
        return n0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C40742n0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        ArrayList arrayList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f109454d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f109455e;
            long j = this.f109456f;
            this.f109455e = n0Var2;
            this.f109454d = 1;
            if (C53965x0.m60607b(j, this) == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
        } else if (i == 1) {
            n0Var = (C0000n0) this.f109455e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!C53930o0.m60560g(n0Var)) {
            return C13598b0.f38549a;
        }
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        String str = this.f109457g;
        synchronized (__batch_run_obj) {
            Queue<?> queue = __batch_run_obj.getBatchData().get(str);
            Queue queue2 = queue instanceof Queue ? queue : null;
            if (queue2 != null) {
                __batch_run_obj.getBatchData().remove(str);
                arrayList = new ArrayList(queue2);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            C40717k0 k0Var = this.f109458h;
            C40717k0 k0Var2 = C40717k0.f109363a;
            k0Var.mo63621n(arrayList, 0, (HashMap<String, String>) null);
        }
        __batch_run_obj.getBatchJobs().remove(this.f109457g);
        return C13598b0.f38549a;
    }
}
