package zn1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import com.tencent.p014mm.C0966R;
import f14.C58901s;
import fy3.C32227p;
import jq3.C60905o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListFeedConvert$refreshSelectedItem$1", mo125469f = "FinderPlayListFeedConvert.kt", mo125470l = {147, 148}, mo125471m = "invokeSuspend")
/* renamed from: zn1.s */
public final class C16337s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43688d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f43689e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListFeedConvert$refreshSelectedItem$1$1", mo125469f = "FinderPlayListFeedConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zn1.s$a */
    public static final class C16338a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f43690d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16338a(C60905o oVar, C15601d<? super C16338a> dVar) {
            super(2, dVar);
            this.f43690d = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16338a(this.f43690d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16338a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f43690d.mo85812D(C0966R.C0970id.nmm).setBackgroundResource(C0966R.color.ahf);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16337s(C60905o oVar, C15601d<? super C16337s> dVar) {
        super(2, dVar);
        this.f43689e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C16337s(this.f43689e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16337s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43688d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f43688d = 1;
            if (C53965x0.m60607b(2000, this) == aVar) {
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
        C16338a aVar2 = new C16338a(this.f43689e, (C15601d<? super C16338a>) null);
        this.f43688d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
