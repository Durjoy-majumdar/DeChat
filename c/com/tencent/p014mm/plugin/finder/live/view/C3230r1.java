package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53965x0;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView$modRecordCgi$1$job$1", mo125469f = "FinderLiveProductRecordView.kt", mo125470l = {375}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.live.view.r1 */
public final class C3230r1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f15355d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C89779i0> f15356e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveProductRecordView f15357f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3230r1(C8479f0<C89779i0> f0Var, FinderLiveProductRecordView finderLiveProductRecordView, C15601d<? super C3230r1> dVar) {
        super(2, dVar);
        this.f15356e = f0Var;
        this.f15357f = finderLiveProductRecordView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3230r1(this.f15356e, this.f15357f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3230r1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f15355d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f15355d = 1;
            if (C53965x0.m60607b(1000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f15356e.f27484d = C89779i0.m112248e(this.f15357f.getContext(), this.f15357f.getContext().getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null);
        return C13598b0.f38549a;
    }
}
