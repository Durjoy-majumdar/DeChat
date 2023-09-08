package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$launchLongPressJob$1", mo125469f = "ImproveMMSightRecordButton.kt", mo125470l = {302, 303}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.mmsight.ui.d */
public final class C56883d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f162949d;

    /* renamed from: e */
    public final /* synthetic */ ImproveMMSightRecordButton f162950e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton$launchLongPressJob$1$1", mo125469f = "ImproveMMSightRecordButton.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mmsight.ui.d$a */
    public static final class C56884a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMMSightRecordButton f162951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56884a(ImproveMMSightRecordButton improveMMSightRecordButton, C15601d<? super C56884a> dVar) {
            super(2, dVar);
            this.f162951d = improveMMSightRecordButton;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56884a(this.f162951d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56884a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ViewPropertyAnimator viewPropertyAnimator;
            ViewPropertyAnimator animate;
            ResultKt.throwOnFailure(obj);
            ImproveMMSightRecordButton improveMMSightRecordButton = this.f162951d;
            ViewPropertyAnimator viewPropertyAnimator2 = improveMMSightRecordButton.f313732t;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator3 = null;
            improveMMSightRecordButton.f313732t = null;
            View view = improveMMSightRecordButton.f313719d;
            if (view == null || (viewPropertyAnimator = view.animate()) == null) {
                viewPropertyAnimator = null;
            } else {
                viewPropertyAnimator.scaleX(0.5f);
                viewPropertyAnimator.scaleY(0.5f);
                viewPropertyAnimator.setDuration(50);
                viewPropertyAnimator.start();
            }
            improveMMSightRecordButton.f313732t = viewPropertyAnimator;
            View view2 = improveMMSightRecordButton.f313720e;
            if (!(view2 == null || (animate = view2.animate()) == null)) {
                animate.scaleX(1.35f);
                animate.scaleY(1.35f);
                animate.alpha(0.0f);
                animate.setDuration(50);
                animate.setListener(new C105524e(improveMMSightRecordButton, animate));
                animate.start();
                viewPropertyAnimator3 = animate;
            }
            improveMMSightRecordButton.f313733u = viewPropertyAnimator3;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56883d(ImproveMMSightRecordButton improveMMSightRecordButton, C15601d<? super C56883d> dVar) {
        super(2, dVar);
        this.f162950e = improveMMSightRecordButton;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C56883d(this.f162950e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C56883d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f162949d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f162949d = 1;
            if (C53965x0.m60607b(250, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C56884a aVar2 = new C56884a(this.f162950e, (C15601d<? super C56884a>) null);
        this.f162949d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
