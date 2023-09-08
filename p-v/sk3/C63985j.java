package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import android.view.View;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$firstTimeIdentify$1", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {188, 189}, mo125471m = "invokeSuspend")
/* renamed from: sk3.j */
public final class C63985j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181399d;

    /* renamed from: e */
    public final /* synthetic */ C63995m f181400e;

    /* renamed from: f */
    public final /* synthetic */ View f181401f;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$firstTimeIdentify$1$1", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.j$a */
    public static final class C63986a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181402d;

        /* renamed from: e */
        public final /* synthetic */ View f181403e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63986a(C63995m mVar, View view, C15601d<? super C63986a> dVar) {
            super(2, dVar);
            this.f181402d = mVar;
            this.f181403e = view;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63986a(this.f181402d, this.f181403e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63986a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C89779i0 i0Var = this.f181402d.f181430h;
            boolean z = true;
            if (i0Var == null || !i0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C89779i0 i0Var2 = this.f181402d.f181430h;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                this.f181402d.f181430h = null;
            }
            this.f181402d.mo88768k3(this.f181403e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63985j(C63995m mVar, View view, C15601d<? super C63985j> dVar) {
        super(2, dVar);
        this.f181400e = mVar;
        this.f181401f = view;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63985j(this.f181400e, this.f181401f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63985j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181399d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f181399d = 1;
            if (C53965x0.m60607b(3000, this) == aVar) {
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
        C63986a aVar2 = new C63986a(this.f181400e, this.f181401f, (C15601d<? super C63986a>) null);
        this.f181399d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
