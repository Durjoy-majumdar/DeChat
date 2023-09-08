package kq1;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53965x0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C0317e;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58739j4;
import er1.C7829l5;
import er1.C7862q4;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import je1.C9378t1;
import jp3.C9487b;
import kotlin.ResultKt;
import lc3.C10485b;
import nr3.C89059e;
import o40.C61937h;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49143dg3;
import te3.C50401mh0;
import te3.h54;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kq1.r */
public class C10395r extends UIComponent {

    /* renamed from: d */
    public int f31613d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderSafePreCheckUIC$preCheckInner$1", mo125469f = "FinderSafePreCheckUIC.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
    /* renamed from: kq1.r$a */
    public static final class C10396a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f31614d;

        /* renamed from: e */
        public final /* synthetic */ long f31615e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f31616f;

        /* renamed from: g */
        public final /* synthetic */ C9378t1 f31617g;

        /* renamed from: h */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f31618h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10396a(long j, C8477a0 a0Var, C9378t1 t1Var, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C15601d<? super C10396a> dVar) {
            super(2, dVar);
            this.f31615e = j;
            this.f31616f = a0Var;
            this.f31617g = t1Var;
            this.f31618h = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10396a(this.f31615e, this.f31616f, this.f31617g, this.f31618h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10396a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31614d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f31615e;
                this.f31614d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("FinderSafePreCheckUIC", "[preCheckInner] endCheck:" + this.f31616f.f27482d);
            if (!this.f31616f.f27482d) {
                this.f31617g.mo85581g();
                this.f31618h.invoke(Boolean.TRUE, Boolean.FALSE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kq1.r$b */
    public static final class C10397b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f31619d;

        /* renamed from: e */
        public final /* synthetic */ C10395r f31620e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f31621f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10397b(C8477a0 a0Var, C10395r rVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f31619d = a0Var;
            this.f31620e = rVar;
            this.f31621f = aVar;
        }

        public Object invoke() {
            this.f31619d.f27482d = true;
            this.f31620e.f31613d++;
            this.f31621f.invoke();
            Log.m105924i("FinderSafePreCheckUIC", "[preCheckInner] onShowTipsDialog showCount:" + this.f31620e.f31613d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kq1.r$c */
    public static final class C10398c extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f31622d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f31623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10398c(C8477a0 a0Var, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
            super(2);
            this.f31622d = a0Var;
            this.f31623e = pVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            Log.m105924i("FinderSafePreCheckUIC", "[preCheckInner] onEndCheck confirm:" + booleanValue + " fromDialog:" + booleanValue2);
            this.f31622d.f27482d = true;
            this.f31623e.invoke(Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10395r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo10710c3(C7829l5 l5Var, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(l5Var, "preCheckInfo");
        C87412m.m108594g(aVar, "onShowTipsDialog");
        C87412m.m108594g(pVar, "onEndCheck");
        boolean d3 = mo10705d3();
        Log.m105924i("FinderSafePreCheckUIC", "[doPreCheck] enable:" + d3 + ", showCount:" + this.f31613d);
        if (!d3 || this.f31613d != 0) {
            pVar.invoke(Boolean.TRUE, Boolean.FALSE);
        } else {
            mo10711f3(l5Var, aVar, pVar);
        }
    }

    /* renamed from: d3 */
    public boolean mo10705d3() {
        return false;
    }

    /* renamed from: e3 */
    public int mo10706e3() {
        return 0;
    }

    /* renamed from: f3 */
    public void mo10711f3(C7829l5 l5Var, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        C89349b bVar;
        C7829l5 l5Var2 = l5Var;
        C32224a<C13598b0> aVar2 = aVar;
        C32227p<? super Boolean, ? super Boolean, C13598b0> pVar2 = pVar;
        C87412m.m108594g(l5Var2, "preCheckInfo");
        C87412m.m108594g(aVar2, "onShowTipsDialog");
        C87412m.m108594g(pVar2, "onEndCheck");
        C8477a0 a0Var = new C8477a0();
        AppCompatActivity activity = getActivity();
        int e3 = mo10706e3();
        C10397b bVar2 = new C10397b(a0Var, this, aVar2);
        C10398c cVar = new C10398c(a0Var, pVar2);
        C87412m.m108594g(activity, "context");
        Log.m105924i("FinderUtilsCmdUtils", "[doPreCheck] utilsCmdId:" + e3 + " desc:" + l5Var2.f26367a);
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = e3;
        C9487b bVar3 = null;
        if (e3 == 1) {
            C58739j4 j4Var = C58739j4.f168176a;
            C49143dg3 dg32 = new C49143dg3();
            dg32.f132310d = l5Var2.f26367a;
            byte[] bArr = l5Var2.f26368b;
            dg32.f132311e = bArr != null ? C61937h.m72710i(bArr) : null;
            dg32.f132312f = l5Var2.f26369c;
            C13598b0 b0Var = C13598b0.f38549a;
            bVar = j4Var.mo83710g0(dg32);
        } else if (e3 != 2) {
            bVar = null;
        } else {
            C58739j4 j4Var2 = C58739j4.f168176a;
            h54 h54 = new h54();
            h54.f134455d = l5Var2.f26367a;
            C13598b0 b0Var2 = C13598b0.f38549a;
            bVar = j4Var2.mo83710g0(h54);
        }
        mh02.f138029e = bVar;
        C9378t1 t1Var = new C9378t1(5, (String) null, 0, mh02, 6, (C8480h) null);
        C89059e i = t1Var.mo9225i();
        if (activity instanceof C9487b) {
            bVar3 = (C9487b) activity;
        }
        i.mo11397F(bVar3);
        i.mo123420E(new C7862q4(activity, e3, bVar2, cVar));
        C37521f.f99374d.getClass();
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderSafePrecheckMaxDuration", 2000);
        Log.m105924i("FinderConfig", "FINDER_SAFE_PRE_CHECK_MAX_DURATION maxDuration = " + b);
        long j = (long) b;
        Log.m105924i("FinderSafePreCheckUIC", "[preCheckInner] maxDuration:" + j);
        if (j > 0) {
            C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C10396a(j, a0Var, t1Var, pVar, (C15601d<? super C10396a>) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10395r(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
