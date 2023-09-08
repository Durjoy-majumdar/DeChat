package fh1;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import fi1.C59092a;
import fy3.C32227p;
import gy3.C8477a0;
import j50.C60735a;
import j50.C60760i;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.InteractiveGiftController$playOnce$playJob$1", mo125469f = "InteractiveGiftController.kt", mo125470l = {169}, mo125471m = "invokeSuspend")
/* renamed from: fh1.j0 */
public final class C59034j0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f168921d;

    /* renamed from: e */
    public Object f168922e;

    /* renamed from: f */
    public Object f168923f;

    /* renamed from: g */
    public int f168924g;

    /* renamed from: h */
    public final /* synthetic */ C59014f0 f168925h;

    /* renamed from: i */
    public final /* synthetic */ int f168926i;

    /* renamed from: j */
    public final /* synthetic */ C59092a.C59093a.C59095b f168927j;

    /* renamed from: n */
    public final /* synthetic */ C8477a0 f168928n;

    /* renamed from: fh1.j0$a */
    public static final class C59035a implements IWeEffectCallback {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f168929a;

        /* renamed from: b */
        public final /* synthetic */ C59014f0 f168930b;

        /* renamed from: c */
        public final /* synthetic */ int f168931c;

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f168932d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<C13598b0> f168933e;

        public C59035a(C8477a0 a0Var, C59014f0 f0Var, int i, C8477a0 a0Var2, C53916l<? super C13598b0> lVar) {
            this.f168929a = a0Var;
            this.f168930b = f0Var;
            this.f168931c = i;
            this.f168932d = a0Var2;
            this.f168933e = lVar;
        }

        /* renamed from: a */
        public void mo84253a(int i, int i2, int i3, int i4) {
            if (i == 0) {
                if (!this.f168929a.f27482d) {
                    String str = this.f168930b.f168847j;
                    Log.m105924i(str, hashCode() + ", animStarted, count:" + this.f168931c);
                }
                this.f168929a.f27482d = true;
            }
            boolean z = false;
            boolean z2 = i == 1;
            if (this.f168929a.f27482d && i == this.f168930b.f168848n) {
                z = true;
            }
            if (this.f168932d.f27482d) {
                return;
            }
            if (z2 || z) {
                String str2 = this.f168930b.f168847j;
                Log.m105924i(str2, hashCode() + ", animEnd, count:" + this.f168931c);
                this.f168932d.f27482d = true;
                C53916l<C13598b0> lVar = this.f168933e;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59034j0(C59014f0 f0Var, int i, C59092a.C59093a.C59095b bVar, C8477a0 a0Var, C15601d<? super C59034j0> dVar) {
        super(2, dVar);
        this.f168925h = f0Var;
        this.f168926i = i;
        this.f168927j = bVar;
        this.f168928n = a0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59034j0(this.f168925h, this.f168926i, this.f168927j, this.f168928n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59034j0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f168924g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C59014f0 f0Var = this.f168925h;
            int i2 = this.f168926i;
            C59092a.C59093a.C59095b bVar = this.f168927j;
            C8477a0 a0Var = this.f168928n;
            this.f168921d = f0Var;
            this.f168922e = bVar;
            this.f168923f = a0Var;
            this.f168924g = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            String str = f0Var.f168847j;
            Log.m105924i(str, "startPlay, count:" + i2);
            C8477a0 a0Var2 = new C8477a0();
            FinderLiveService.f159376d.getClass();
            C60735a aVar2 = FinderLiveService.f159378f;
            if (aVar2 != null) {
                String i3 = C86013q1.m106448i(bVar.f169057a, false);
                C59035a aVar3 = new C59035a(a0Var, f0Var, i2, a0Var2, mVar);
                Log.m105924i("MicroMsg.LiveCore", "setGiftMakeUpSuitEffectRes " + i3);
                aVar2.f173031q.mo148312q(new C60760i(aVar2, i3, aVar3));
            }
            if (mVar.mo74608o() == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C8477a0 a0Var3 = (C8477a0) this.f168923f;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
