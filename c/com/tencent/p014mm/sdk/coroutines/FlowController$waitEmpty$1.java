package com.tencent.p014mm.sdk.coroutines;

import kotlin.Metadata;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
@C91590f(mo125468c = "com.tencent.mm.sdk.coroutines.FlowController", mo125469f = "FlowController.kt", mo125470l = {43, 44}, mo125471m = "waitEmpty")
/* renamed from: com.tencent.mm.sdk.coroutines.FlowController$waitEmpty$1 */
public final class FlowController$waitEmpty$1 extends C66704d {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowController$waitEmpty$1(FlowController flowController, C15601d<? super FlowController$waitEmpty$1> dVar) {
        super(dVar);
        this.this$0 = flowController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitEmpty(0, this);
    }
}
