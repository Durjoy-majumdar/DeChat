package b50;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ac3.C54010o;
import ac3.C54011p;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58115i;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import nj3.C76912y0;
import q00.C110264g;
import q00.C62571i;
import rx3.C13598b0;
import rx3.C13604l;
import s50.C110747k;
import s50.C36624a;
import s50.C63702d;
import s50.C63708h;
import s50.C63710m;
import s50.C63712o;
import w50.C65933h;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: b50.f */
public final class C54412f implements C54405b {

    /* renamed from: a */
    public final C54408d f152606a;

    /* renamed from: b */
    public final C110747k f152607b;

    /* renamed from: c */
    public final C54011p f152608c;

    /* renamed from: d */
    public final C54010o f152609d;

    /* renamed from: e */
    public int f152610e;

    /* renamed from: f */
    public boolean f152611f;

    /* renamed from: g */
    public final C0000n0 f152612g;

    @C91590f(mo125468c = "com.tencent.mm.live.core.core.LiveCameraOptManager$1", mo125469f = "LiveCameraOptManager.kt", mo125470l = {48}, mo125471m = "invokeSuspend")
    /* renamed from: b50.f$a */
    public static final class C54413a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152613d;

        /* renamed from: b50.f$a$a */
        public static final class C54414a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C54414a f152614d = new C54414a();

            public C54414a() {
                super(0);
            }

            public Object invoke() {
                return Boolean.TRUE;
            }
        }

        public C54413a(C15601d<? super C54413a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54413a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C54413a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152613d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65933h hVar = C65933h.f189544a;
                C65933h.C65934a aVar2 = C65933h.C65934a.LiveAnchorTRTCCore;
                C54414a aVar3 = C54414a.f152614d;
                this.f152613d = 1;
                if (hVar.mo89974d(aVar2, true, aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.live.core.core.LiveCameraOptManager$2", mo125469f = "LiveCameraOptManager.kt", mo125470l = {56}, mo125471m = "invokeSuspend")
    /* renamed from: b50.f$b */
    public static final class C54415b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152615d;

        /* renamed from: e */
        public final /* synthetic */ C54412f f152616e;

        /* renamed from: b50.f$b$a */
        public static final class C54416a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C54416a f152617d = new C54416a();

            public C54416a() {
                super(0);
            }

            public Object invoke() {
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54415b(C54412f fVar, C15601d<? super C54415b> dVar) {
            super(2, dVar);
            this.f152616e = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54415b(this.f152616e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54415b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152615d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65933h hVar = C65933h.f189544a;
                C65933h.C65934a aVar2 = C65933h.C65934a.LiveAnchorTRTCCore;
                C54416a aVar3 = C54416a.f152617d;
                this.f152615d = 1;
                if (hVar.mo89974d(aVar2, false, aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f152616e.mo75221d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b50.f$c */
    public static final class C54417c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54412f f152618d;

        /* renamed from: e */
        public final /* synthetic */ List<C13604l<String, String>> f152619e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54417c(C54412f fVar, List<C13604l<String, String>> list) {
            super(0);
            this.f152618d = fVar;
            this.f152619e = list;
        }

        public Object invoke() {
            this.f152618d.f152609d.mo74677b(this.f152619e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b50.f$d */
    public static final class C54418d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54412f f152620d;

        /* renamed from: e */
        public final /* synthetic */ int f152621e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54418d(C54412f fVar, int i) {
            super(0);
            this.f152620d = fVar;
            this.f152621e = i;
        }

        public Object invoke() {
            this.f152620d.f152608c.mo74681h(this.f152621e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b50.f$e */
    public static final class C54419e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54412f f152622d;

        /* renamed from: e */
        public final /* synthetic */ int f152623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54419e(C54412f fVar, int i) {
            super(0);
            this.f152622d = fVar;
            this.f152623e = i;
        }

        public Object invoke() {
            this.f152622d.f152608c.mo74682k(this.f152623e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b50.f$f */
    public static final class C54420f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54412f f152624d;

        /* renamed from: e */
        public final /* synthetic */ String f152625e;

        /* renamed from: f */
        public final /* synthetic */ String f152626f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54420f(C54412f fVar, String str, String str2) {
            super(0);
            this.f152624d = fVar;
            this.f152625e = str;
            this.f152626f = str2;
        }

        public Object invoke() {
            this.f152624d.f152608c.mo74680f("", "");
            this.f152624d.f152608c.mo74680f(this.f152625e, this.f152626f);
            return C13598b0.f38549a;
        }
    }

    public C54412f(C54408d dVar, C110747k kVar) {
        Class cls = C62571i.class;
        C87412m.m108594g(dVar, "liveCore");
        C87412m.m108594g(kVar, "renderManager");
        this.f152606a = dVar;
        this.f152607b = kVar;
        this.f152608c = ((C62571i) C86312j.m106911c(cls)).mo87570WL();
        this.f152609d = ((C62571i) C86312j.m106911c(cls)).mo87573oo();
        C0000n0 b = C53930o0.m60555b();
        this.f152612g = b;
        C65933h hVar = C65933h.f189544a;
        if (C65933h.f189549f) {
            mo75221d();
            C53895h.m60466d(b, (C66212f) null, (C53934p0) null, new C54413a((C15601d<? super C54413a>) null), 3, (Object) null);
            return;
        }
        C53895h.m60466d(b, (C66212f) null, (C53934p0) null, new C54415b(this, (C15601d<? super C54415b>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public void mo75187a(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "muteImage");
        this.f152606a.mo75215a(bitmap);
    }

    /* renamed from: b */
    public void mo75188b(int i, boolean z, boolean z2) {
        if (this.f152611f != z && z2) {
            if (z) {
                C76912y0.m92773l(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.m3h));
            } else {
                C76912y0.m92773l(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.m3n));
            }
        }
        this.f152611f = z;
        if (!z) {
            this.f152610e = i;
        }
        mo75221d();
        this.f152607b.mo148312q(new C54418d(this, i));
    }

    /* renamed from: c */
    public void mo75189c(boolean z) {
        C110747k kVar = this.f152607b;
        kVar.getClass();
        kVar.mo148312q(new C63712o(kVar, z));
    }

    /* renamed from: d */
    public final void mo75221d() {
        C110747k kVar = this.f152607b;
        C54011p pVar = this.f152608c;
        kVar.getClass();
        C87412m.m108594g(pVar, "effect");
        kVar.mo148312q(new C63708h(kVar, pVar));
    }

    /* renamed from: e */
    public void mo75222e() {
        C53930o0.m60558e(this.f152612g, (CancellationException) null, 1, (Object) null);
        this.f152608c.mo74671d((C110264g) null);
        this.f152609d.mo74671d((C110264g) null);
    }

    /* renamed from: f */
    public void mo75223f(List<C13604l<String, String>> list) {
        C87412m.m108594g(list, "res");
        C110747k kVar = this.f152607b;
        C54010o oVar = this.f152609d;
        kVar.getClass();
        C87412m.m108594g(oVar, "effect");
        kVar.mo148312q(new C63702d(kVar, oVar));
        this.f152607b.mo148312q(new C54417c(this, list));
    }

    /* renamed from: g */
    public void mo75224g(int i) {
        mo75221d();
        this.f152607b.mo148312q(new C54419e(this, i));
    }

    public C58115i getLiveStatus() {
        return this.f152606a.getLiveStatus();
    }

    /* renamed from: h */
    public void mo75225h(String str, String str2) {
        mo75221d();
        this.f152607b.mo148312q(new C54420f(this, str, str2));
    }

    /* renamed from: i */
    public void mo75226i(C36624a aVar) {
        C110747k kVar = this.f152607b;
        kVar.getClass();
        kVar.mo148312q(new C63710m(kVar, aVar));
    }
}
