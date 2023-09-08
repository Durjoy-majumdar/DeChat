package xk1;

import a14.C0000n0;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import bd1.C54446b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C7813i5;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import mk1.C10906h;
import rx3.C13598b0;
import te3.C49007cj0;
import te3.C50119ke1;
import tf0.C64916p1;
import wx3.C15601d;
import xk1.C15747k0;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66783a;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostVerifyUIC$prepare$1", mo125469f = "FinderGameLivePostVerifyUIC.kt", mo125470l = {96}, mo125471m = "invokeSuspend")
/* renamed from: xk1.p0 */
public final class C15764p0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42494d;

    /* renamed from: e */
    public final /* synthetic */ C15747k0 f42495e;

    /* renamed from: f */
    public final /* synthetic */ String f42496f;

    /* renamed from: xk1.p0$a */
    public static final class C15765a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f42497d;

        /* renamed from: e */
        public final /* synthetic */ C15747k0 f42498e;

        public C15765a(C8477a0 a0Var, C15747k0 k0Var) {
            this.f42497d = a0Var;
            this.f42498e = k0Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f42497d.f27482d = true;
            this.f42498e.mo14468c3();
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C115669n.INSTANCE.mo160131h(22385, 6, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: xk1.p0$b */
    public static final class C15766b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C15766b f42499d = new C15766b();

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: xk1.p0$c */
    public static final class C15767c implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f42500d;

        /* renamed from: e */
        public final /* synthetic */ C15747k0 f42501e;

        public C15767c(C8477a0 a0Var, C15747k0 k0Var) {
            this.f42500d = a0Var;
            this.f42501e = k0Var;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C15747k0.C15748a aVar;
            if (!this.f42500d.f27482d && (aVar = this.f42501e.f42470f) != null) {
                C15747k0.C15748a.C15749a.m14709a(aVar, false, (C49007cj0) null, (C50119ke1) null, false, 0, 0, 62, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15764p0(C15747k0 k0Var, String str, C15601d<? super C15764p0> dVar) {
        super(2, dVar);
        this.f42495e = k0Var;
        this.f42496f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15764p0(this.f42495e, this.f42496f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15764p0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f42494d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            int i2 = this.f42495e.f42471g;
            this.f42494d = 1;
            if (bVar.mo90679u0(i2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            ((Result) obj).m168123unboximpl();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if (c != null && c.mo75252n2()) {
            Log.m105920e("Finder.FinderLiveVerifyUIC", "prepare() checkAccountMaster failed");
            C58739j4.f168176a.mo83706e0();
            C7813i5 i5Var = this.f42495e.f42468d;
            if (i5Var != null) {
                i5Var.mo8913b();
            }
            this.f42495e.getActivity().finish();
            return C13598b0.f38549a;
        }
        C7813i5 i5Var2 = this.f42495e.f42468d;
        if (i5Var2 != null) {
            i5Var2.mo8913b();
        }
        C115669n.INSTANCE.mo160131h(22385, new Integer(5), new Long(System.currentTimeMillis()));
        C7335d c2 = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
        C10906h hVar = this.f42495e.f42469e;
        C8777j5.C8778a.m8601b((C8777j5) c2, 3, hVar.f32535b, hVar.f32536c, (Map) null, 8, (Object) null);
        C8477a0 a0Var = new C8477a0();
        C7335d c3 = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c3, "getService(IFinderCommon…atureService::class.java)");
        AppCompatActivity activity = this.f42495e.getActivity();
        String str = this.f42496f;
        C15747k0 k0Var = this.f42495e;
        C64916p1.C64917a.m76445l((C64916p1) c3, activity, str, new C15765a(a0Var, k0Var), C15766b.f42499d, new C15767c(a0Var, k0Var), false, 32, (Object) null);
        return C13598b0.f38549a;
    }
}
