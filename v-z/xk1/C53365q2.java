package xk1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorRoleUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dj1.C45381p0;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C8765f3;
import kotlin.Result;
import kotlin.ResultKt;
import lc3.C10485b;
import mp3.C88819d;
import pe3.C89349b;
import q40.C89456b;
import rx3.C13598b0;
import te3.C48664a41;
import te3.C50401mh0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: xk1.q2 */
public final class C53365q2 extends UIComponent implements C8765f3 {

    /* renamed from: d */
    public ViewGroup f150170d;

    /* renamed from: e */
    public MMSwitchBtn f150171e;

    /* renamed from: f */
    public ProgressBar f150172f;

    /* renamed from: g */
    public long f150173g;

    /* renamed from: h */
    public long f150174h;

    /* renamed from: xk1.q2$a */
    public static final class C53366a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C53365q2 f150175a;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorAnonymousSwitchUIC$onCreate$1$1", mo125469f = "FinderLiveVisitorAnonymousSwitchUIC.kt", mo125470l = {70, 76}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.q2$a$a */
        public static final class C53367a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public boolean f150176d;

            /* renamed from: e */
            public int f150177e;

            /* renamed from: f */
            public final /* synthetic */ C53365q2 f150178f;

            /* renamed from: g */
            public final /* synthetic */ C50401mh0 f150179g;

            /* renamed from: h */
            public final /* synthetic */ boolean f150180h;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorAnonymousSwitchUIC$onCreate$1$1$3", mo125469f = "FinderLiveVisitorAnonymousSwitchUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: xk1.q2$a$a$a */
            public static final class C53368a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C53365q2 f150181d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C53368a(C53365q2 q2Var, C15601d<? super C53368a> dVar) {
                    super(2, dVar);
                    this.f150181d = q2Var;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C53368a(this.f150181d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C53368a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    ProgressBar progressBar = this.f150181d.f150172f;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53367a(C53365q2 q2Var, C50401mh0 mh02, boolean z, C15601d<? super C53367a> dVar) {
                super(2, dVar);
                this.f150178f = q2Var;
                this.f150179g = mh02;
                this.f150180h = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C53367a(this.f150178f, this.f150179g, this.f150180h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C53367a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                boolean z;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f150177e;
                boolean z2 = true;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C53365q2 q2Var = this.f150178f;
                    C50401mh0 mh02 = this.f150179g;
                    boolean z3 = this.f150180h;
                    Result.Companion companion = Result.Companion;
                    C45381p0 p0Var = new C45381p0(q2Var.f150173g, q2Var.f150174h, mh02.f138028d, mh02);
                    this.f150176d = z3;
                    this.f150177e = 1;
                    if (C89456b.m111831a(p0Var, 0, (C88819d) null, this, 3, (Object) null) == aVar) {
                        return aVar;
                    }
                    z = z3;
                } else if (i == 1) {
                    z = this.f150176d;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
                    }
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_ANONYMOUS_SWITCH_BOOLEAN_SYNC, Boolean.valueOf(z));
                StringBuilder sb = new StringBuilder();
                sb.append("anonymous switch status change: isCheck = ");
                if (!z) {
                    z2 = false;
                }
                sb.append(z2);
                Log.m105924i("Finder.FinderLiveVisitorAnonymousSwitchUIC", sb.toString());
                obj2 = Result.m168114constructorimpl(C13598b0.f38549a);
                Throwable r0 = Result.m168117exceptionOrNullimpl(obj2);
                if (r0 != null) {
                    Log.printErrStackTrace("Finder.FinderLiveVisitorAnonymousSwitchUIC", r0, "", new Object[0]);
                }
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C53368a aVar2 = new C53368a(this.f150178f, (C15601d<? super C53368a>) null);
                this.f150177e = 2;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
                return C13598b0.f38549a;
            }
        }

        public C53366a(C53365q2 q2Var) {
            this.f150175a = q2Var;
        }

        public final void onStatusChange(boolean z) {
            ProgressBar progressBar = this.f150175a.f150172f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            C45381p0.C45382a aVar = C45381p0.f122894u;
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = 6;
            C48664a41 a412 = new C48664a41();
            a412.f130306d = z ? 1 : 0;
            mh02.f138029e = C89349b.m111674a(a412.toByteArray());
            C53365q2 q2Var = this.f150175a;
            C0317e.launch$default(q2Var, (C66212f) null, (C53934p0) null, new C53367a(q2Var, mh02, z, (C15601d<? super C53367a>) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53365q2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = getActivity() instanceof FinderLiveVisitorRoleUI;
        this.f150173g = getActivity().getIntent().getLongExtra("LIVE_ID", 0);
        this.f150174h = getActivity().getIntent().getLongExtra("OBJECT_ID", 0);
        this.f150170d = (ViewGroup) getActivity().findViewById(C0966R.C0970id.m7e);
        this.f150171e = (MMSwitchBtn) getActivity().findViewById(C0966R.C0970id.m6v);
        this.f150172f = (ProgressBar) getActivity().findViewById(C0966R.C0970id.g3j);
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderLiveJoinLiveInvisiableSwitch", 0) == 1) {
            ViewGroup viewGroup = this.f150170d;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_ANONYMOUS_SWITCH_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f).booleanValue();
            MMSwitchBtn mMSwitchBtn = this.f150171e;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(booleanValue);
            }
            MMSwitchBtn mMSwitchBtn2 = this.f150171e;
            if (mMSwitchBtn2 != null) {
                mMSwitchBtn2.setEnabled(true);
            }
            MMSwitchBtn mMSwitchBtn3 = this.f150171e;
            if (mMSwitchBtn3 != null) {
                mMSwitchBtn3.setSwitchListener(new C53366a(this));
            }
        }
    }
}
