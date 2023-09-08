package xk1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C7813i5;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import kotlin.ResultKt;
import mk1.C10906h;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C49007cj0;
import te3.C50119ke1;
import tf0.C64916p1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: xk1.k0 */
public final class C15747k0 extends UIComponent {

    /* renamed from: d */
    public C7813i5 f42468d;

    /* renamed from: e */
    public final C10906h f42469e;

    /* renamed from: f */
    public C15748a f42470f;

    /* renamed from: g */
    public int f42471g = 8;

    /* renamed from: xk1.k0$a */
    public interface C15748a {

        /* renamed from: xk1.k0$a$a */
        public static final class C15749a {
            /* renamed from: a */
            public static /* synthetic */ void m14709a(C15748a aVar, boolean z, C49007cj0 cj02, C50119ke1 ke12, boolean z2, int i, long j, int i2, Object obj) {
                if (obj == null) {
                    C50119ke1 ke13 = null;
                    C49007cj0 cj03 = (i2 & 2) != 0 ? null : cj02;
                    if ((i2 & 4) == 0) {
                        ke13 = ke12;
                    }
                    int i3 = 0;
                    boolean z3 = (i2 & 8) != 0 ? false : z2;
                    if ((i2 & 16) == 0) {
                        i3 = i;
                    }
                    aVar.mo14469C0(z, cj03, ke13, z3, i3, (i2 & 32) != 0 ? 0 : j);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVerified");
            }
        }

        /* renamed from: C0 */
        void mo14469C0(boolean z, C49007cj0 cj02, C50119ke1 ke12, boolean z2, int i, long j);
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostVerifyUIC$handleConfirmPostLive$1", mo125469f = "FinderGameLivePostVerifyUIC.kt", mo125470l = {221}, mo125471m = "invokeSuspend")
    /* renamed from: xk1.k0$b */
    public static final class C15750b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f42472d;

        /* renamed from: e */
        public final /* synthetic */ C15747k0 f42473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15750b(C15747k0 k0Var, C15601d<? super C15750b> dVar) {
            super(2, dVar);
            this.f42473e = k0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15750b(this.f42473e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15750b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f42472d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10906h hVar = this.f42473e.f42469e;
                this.f42472d = 1;
                obj = hVar.mo11118g((C10906h.C10907a) null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10906h.C10912c cVar = (C10906h.C10912c) obj;
            if (cVar instanceof C10906h.C10912c.C10913a) {
                Log.m105924i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive failed, errCode:" + ((C10906h.C10912c.C10913a) cVar).f32546a);
                C15748a aVar2 = this.f42473e.f42470f;
                if (aVar2 != null) {
                    C15748a.C15749a.m14709a(aVar2, false, (C49007cj0) null, (C50119ke1) null, false, 0, 0, 62, (Object) null);
                }
            } else if (cVar instanceof C10906h.C10912c.C10915c) {
                Log.m105924i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive continueLive");
                C15747k0 k0Var = this.f42473e;
                C15748a aVar3 = k0Var.f42470f;
                if (aVar3 != null) {
                    C49007cj0 cj02 = ((C10906h.C10912c.C10915c) cVar).f32548a.f32543c;
                    C10906h hVar2 = k0Var.f42469e;
                    aVar3.mo14469C0(true, cj02, (C50119ke1) null, true, hVar2.f32535b, hVar2.f32536c);
                }
            } else if (cVar instanceof C10906h.C10912c.C10914b) {
                Log.m105924i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive success");
                C15747k0 k0Var2 = this.f42473e;
                C15748a aVar4 = k0Var2.f42470f;
                if (aVar4 != null) {
                    C49007cj0 cj03 = ((C10906h.C10912c.C10914b) cVar).f32547a;
                    C10906h hVar3 = k0Var2.f42469e;
                    aVar4.mo14469C0(true, cj03, (C50119ke1) null, false, hVar3.f32535b, hVar3.f32536c);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15747k0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C10906h hVar = new C10906h((MMFragmentActivity) appCompatActivity, 0, 0, 6, (C8480h) null);
        this.f42469e = hVar;
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0);
        hVar.f32535b = intExtra;
        hVar.f32536c = longExtra;
    }

    /* renamed from: c3 */
    public final void mo14468c3() {
        Log.m105924i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive");
        C7813i5 i5Var = this.f42468d;
        if (i5Var != null) {
            i5Var.mo8913b();
        }
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C10906h hVar = this.f42469e;
        C8777j5.C8778a.m8601b((C8777j5) c, 4, hVar.f32535b, hVar.f32536c, (Map) null, 8, (Object) null);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C15750b(this, (C15601d<? super C15750b>) null), 3, (Object) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akh;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult,requestCode:");
        sb.append(i);
        sb.append(",resultCode:");
        sb.append(i2);
        sb.append(",face verify result:");
        sb.append(intent != null ? Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        Log.m105924i("Finder.FinderLiveVerifyUIC", sb.toString());
        if (i != 10002) {
            return;
        }
        if (i2 == 1) {
            mo14468c3();
            return;
        }
        C15748a aVar = this.f42470f;
        if (aVar != null) {
            C15748a.C15749a.m14709a(aVar, false, (C49007cj0) null, (C50119ke1) null, false, 0, 0, 62, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        C7813i5 a = C7813i5.C7814a.m7953a(C7813i5.f26336f, getActivity(), getActivity().getResources().getString(C0966R.string.ett), 1000, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f42468d = a;
        a.begin();
        Log.m105924i("Finder.FinderLiveVerifyUIC", "prepare()");
        String O5 = C66785b.f191882e.mo90662O5();
        boolean z2 = false;
        if (!NetStatusUtil.isConnected((Context) getActivity())) {
            C77426q qVar = new C77426q(getActivity());
            qVar.mo107595g(getActivity().getResources().getString(C0966R.string.dpr));
            qVar.mo107602n(getActivity().getResources().getString(C0966R.string.f8028zq));
            qVar.mo107600l(new C15762o0(this));
            qVar.mo107603o();
            Log.m105920e("Finder.FinderLiveVerifyUIC", "checkNetworkAvailable() network problem");
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Log.m105920e("Finder.FinderLiveVerifyUIC", "prepare() checkNetworkAvailable failed");
            C7813i5 i5Var = this.f42468d;
            if (i5Var != null) {
                i5Var.mo8913b();
                return;
            }
            return;
        }
        Log.m105924i("Finder.FinderLiveVerifyUIC", "checkAccountValid()");
        if (Util.isNullOrNil(O5)) {
            Log.m105924i("Finder.FinderLiveVerifyUIC", "checkAccountValid() need create finder contact.");
            Intent intent = new Intent();
            intent.putExtra("KEY_GO_TO_AFTER_CREATE_SUCCESS", 1);
            intent.putExtra("key_router_to_profile", false);
            C8477a0 a0Var = new C8477a0();
            C115669n.INSTANCE.mo160131h(22385, 7, Long.valueOf(System.currentTimeMillis()));
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76709nI(getActivity(), 3, intent, 10002, new C15756l0(a0Var), new C15759m0(this), new C15760n0(a0Var, this));
        } else {
            z2 = true;
        }
        if (!z2) {
            Log.m105920e("Finder.FinderLiveVerifyUIC", "prepare() checkAccountValid failed");
            C7813i5 i5Var2 = this.f42468d;
            if (i5Var2 != null) {
                i5Var2.mo8913b();
                return;
            }
            return;
        }
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C15764p0(this, O5, (C15601d<? super C15764p0>) null), 3, (Object) null);
    }
}
