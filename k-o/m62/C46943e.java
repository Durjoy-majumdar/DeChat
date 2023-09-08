package m62;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import d14.C45252f;
import d14.C45253g;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61926c;
import o40.C61937h;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import qo3.C89779i0;
import rx3.C13598b0;
import sf0.C48374j0;
import te3.C50164kq1;
import te3.C51065r63;
import te3.C51205s63;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.messenger.sec.SecurityMsgIntercept$doCgiIfNeed$1", mo125469f = "SecurityMsgIntercept.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: m62.e */
public final class C46943e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C46946f f126200d;

    /* renamed from: e */
    public final /* synthetic */ LifecycleScope f126201e;

    /* renamed from: f */
    public final /* synthetic */ boolean f126202f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f126203g;

    /* renamed from: h */
    public final /* synthetic */ int f126204h;

    /* renamed from: i */
    public final /* synthetic */ int f126205i;

    /* renamed from: j */
    public final /* synthetic */ C8479f0<C89779i0> f126206j;

    /* renamed from: n */
    public final /* synthetic */ Context f126207n;

    /* renamed from: o */
    public final /* synthetic */ Intent f126208o;

    /* renamed from: p */
    public final /* synthetic */ String f126209p;

    @C91590f(mo125468c = "com.tencent.mm.plugin.messenger.sec.SecurityMsgIntercept$doCgiIfNeed$1$2", mo125469f = "SecurityMsgIntercept.kt", mo125470l = {123}, mo125471m = "invokeSuspend")
    /* renamed from: m62.e$a */
    public static final class C46944a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f126210d;

        /* renamed from: e */
        public final /* synthetic */ C45252f<C47445a<C51205s63>> f126211e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C89779i0> f126212f;

        /* renamed from: g */
        public final /* synthetic */ C72963f4 f126213g;

        /* renamed from: h */
        public final /* synthetic */ boolean f126214h;

        /* renamed from: i */
        public final /* synthetic */ Context f126215i;

        /* renamed from: j */
        public final /* synthetic */ Intent f126216j;

        /* renamed from: n */
        public final /* synthetic */ int f126217n;

        /* renamed from: o */
        public final /* synthetic */ String f126218o;

        /* renamed from: p */
        public final /* synthetic */ C46946f f126219p;

        /* renamed from: m62.e$a$a */
        public static final class C46945a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f126220d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f126221e;

            /* renamed from: f */
            public final /* synthetic */ boolean f126222f;

            /* renamed from: g */
            public final /* synthetic */ Context f126223g;

            /* renamed from: h */
            public final /* synthetic */ Intent f126224h;

            /* renamed from: i */
            public final /* synthetic */ int f126225i;

            /* renamed from: j */
            public final /* synthetic */ String f126226j;

            /* renamed from: n */
            public final /* synthetic */ C46946f f126227n;

            public C46945a(C8479f0<C89779i0> f0Var, C72963f4 f4Var, boolean z, Context context, Intent intent, int i, String str, C46946f fVar) {
                this.f126220d = f0Var;
                this.f126221e = f4Var;
                this.f126222f = z;
                this.f126223g = context;
                this.f126224h = intent;
                this.f126225i = i;
                this.f126226j = str;
                this.f126227n = fVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C47445a aVar = (C47445a) obj;
                if (aVar.f128348a == C47798b.OnEnd) {
                    C61926c.m72668M(new C46942d(this.f126220d, aVar, this.f126221e, this.f126222f, this.f126223g, this.f126224h, this.f126225i, this.f126226j, this.f126227n));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46944a(C45252f<C47445a<C51205s63>> fVar, C8479f0<C89779i0> f0Var, C72963f4 f4Var, boolean z, Context context, Intent intent, int i, String str, C46946f fVar2, C15601d<? super C46944a> dVar) {
            super(2, dVar);
            this.f126211e = fVar;
            this.f126212f = f0Var;
            this.f126213g = f4Var;
            this.f126214h = z;
            this.f126215i = context;
            this.f126216j = intent;
            this.f126217n = i;
            this.f126218o = str;
            this.f126219p = fVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46944a(this.f126211e, this.f126212f, this.f126213g, this.f126214h, this.f126215i, this.f126216j, this.f126217n, this.f126218o, this.f126219p, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46944a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f126210d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C47445a<C51205s63>> fVar = this.f126211e;
                C46945a aVar2 = new C46945a(this.f126212f, this.f126213g, this.f126214h, this.f126215i, this.f126216j, this.f126217n, this.f126218o, this.f126219p);
                this.f126210d = 1;
                if (fVar.mo31880a(aVar2, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46943e(C46946f fVar, LifecycleScope lifecycleScope, boolean z, C72963f4 f4Var, int i, int i2, C8479f0<C89779i0> f0Var, Context context, Intent intent, String str, C15601d<? super C46943e> dVar) {
        super(2, dVar);
        this.f126200d = fVar;
        this.f126201e = lifecycleScope;
        this.f126202f = z;
        this.f126203g = f4Var;
        this.f126204h = i;
        this.f126205i = i2;
        this.f126206j = f0Var;
        this.f126207n = context;
        this.f126208o = intent;
        this.f126209p = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46943e(this.f126200d, this.f126201e, this.f126202f, this.f126203g, this.f126204h, this.f126205i, this.f126206j, this.f126207n, this.f126208o, this.f126209p, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46943e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C66212f fVar;
        ResultKt.throwOnFailure(obj);
        C51065r63 r632 = new C51065r63();
        C50164kq1 kq12 = new C50164kq1();
        C72963f4 f4Var = this.f126203g;
        int i = this.f126204h;
        int i2 = this.f126205i;
        kq12.f136978d = (int) f4Var.getMsgId();
        String p2 = f4Var.mo101010p2();
        String str = "";
        if (p2 == null) {
            p2 = str;
        }
        kq12.f136979e = C48374j0.m53720i(p2);
        String E2 = f4Var.mo100965E2();
        if (E2 == null) {
            E2 = str;
        }
        kq12.f136980f = C48374j0.m53720i(E2);
        kq12.f136981g = i;
        kq12.f136982h = i2;
        kq12.f136983i = (int) f4Var.getCreateTime();
        String str2 = f4Var.f230724G;
        if (str2 != null) {
            str = str2;
        }
        kq12.f136984j = str;
        kq12.f136985n = f4Var.mo108774y2();
        kq12.f136986o = (int) f4Var.mo108772w2();
        r632.f140732d = kq12;
        String str3 = this.f126200d.f126228d;
        StringBuilder sb = new StringBuilder();
        sb.append("doCgi, MsgInfo: ");
        C50164kq1 kq13 = r632.f140732d;
        C87412m.m108593f(kq13, "request.MsgInfo");
        sb.append(C61937h.m72709h(kq13));
        Log.m105924i(str3, sb.toString());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6999;
        bVar.f127068c = "/cgi-bin/micromsg-bin/forwardmsgviewspam";
        bVar.f127066a = r632;
        bVar.f127067b = new C51205s63();
        C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
        LifecycleScope lifecycleScope = this.f126201e;
        boolean z = this.f126202f;
        if (z) {
            C53896h0 h0Var = C53872d1.f151117a;
            fVar = C58901s.f168555a;
        } else {
            fVar = C53872d1.f151119c;
        }
        C53895h.m60466d(lifecycleScope, fVar, (C53934p0) null, new C46944a(a, this.f126206j, this.f126203g, z, this.f126207n, this.f126208o, this.f126205i, this.f126209p, this.f126200d, (C15601d<? super C46944a>) null), 2, (Object) null);
        return C13598b0.f38549a;
    }
}
