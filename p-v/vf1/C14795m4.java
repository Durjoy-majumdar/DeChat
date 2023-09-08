package vf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPosterCenterUI;
import f14.C58901s;
import fr1.C8195i;
import fr1.C8196j;
import fy3.C32227p;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C50119ke1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderPosterCenterUI$doPrepareUser$1", mo125469f = "FinderPosterCenterUI.kt", mo125470l = {79, 81}, mo125471m = "invokeSuspend")
/* renamed from: vf1.m4 */
public final class C14795m4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f40778d;

    /* renamed from: e */
    public int f40779e;

    /* renamed from: f */
    public final /* synthetic */ FinderPosterCenterUI f40780f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderPosterCenterUI$doPrepareUser$1$1$1", mo125469f = "FinderPosterCenterUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.m4$a */
    public static final class C14796a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderPosterCenterUI f40781d;

        /* renamed from: e */
        public final /* synthetic */ C50119ke1 f40782e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14796a(FinderPosterCenterUI finderPosterCenterUI, C50119ke1 ke12, C15601d<? super C14796a> dVar) {
            super(2, dVar);
            this.f40781d = finderPosterCenterUI;
            this.f40782e = ke12;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14796a(this.f40781d, this.f40782e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14796a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderPosterCenterUI finderPosterCenterUI = this.f40781d;
            C50119ke1 ke12 = this.f40782e;
            finderPosterCenterUI.getClass();
            if (ke12 != null) {
                Iterator<C8195i> it = finderPosterCenterUI.f14723f.iterator();
                while (it.hasNext()) {
                    C8195i next = it.next();
                    if (next instanceof C8196j) {
                        ((C8196j) next).mo9239d(ke12);
                    }
                }
                finderPosterCenterUI.mo3088H7(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14795m4(FinderPosterCenterUI finderPosterCenterUI, C15601d<? super C14795m4> dVar) {
        super(2, dVar);
        this.f40780f = finderPosterCenterUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14795m4(this.f40780f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14795m4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f40779e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            this.f40779e = 1;
            obj2 = bVar.mo90679u0(2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m168123unboximpl();
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderPosterCenterUI finderPosterCenterUI = this.f40780f;
        if (Result.m168121isSuccessimpl(obj2)) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C14796a aVar2 = new C14796a(finderPosterCenterUI, (C50119ke1) obj2, (C15601d<? super C14796a>) null);
            this.f40778d = obj2;
            this.f40779e = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
