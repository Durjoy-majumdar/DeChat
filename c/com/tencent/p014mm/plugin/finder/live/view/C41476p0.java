package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53965x0;
import androidx.camera.core.FocusMeteringAction;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView$showBigMode$1", mo125469f = "FinderLiveGameWelfareTaskProgressView.kt", mo125470l = {186}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.live.view.p0 */
public final class C41476p0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f111694d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveGameWelfareTaskProgressView f111695e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41476p0(FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, C15601d<? super C41476p0> dVar) {
        super(2, dVar);
        this.f111695e = finderLiveGameWelfareTaskProgressView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C41476p0(this.f111695e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C41476p0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f111694d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f111694d = 1;
            if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = this.f111695e;
        int i2 = FinderLiveGameWelfareTaskProgressView.f111660r;
        finderLiveGameWelfareTaskProgressView.mo64553a();
        return C13598b0.f38549a;
    }
}
