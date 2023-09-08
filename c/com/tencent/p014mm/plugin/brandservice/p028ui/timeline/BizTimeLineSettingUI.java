package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C47465a;
import pj3.C47511g;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48829ba2;
import te3.C48951c34;
import te3.C48976ca2;
import te3.C49090d34;
import te3.qg4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI */
public final class BizTimeLineSettingUI extends MMPreference {

    /* renamed from: j */
    public static final /* synthetic */ int f109272j = 0;

    /* renamed from: d */
    public final C13601g f109273d = C36568h.m40985a(new C40679f(this));

    /* renamed from: e */
    public final C13601g f109274e = C36568h.m40985a(new C40678e(this));

    /* renamed from: f */
    public final C48951c34 f109275f;

    /* renamed from: g */
    public final C53973z1 f109276g;

    /* renamed from: h */
    public boolean f109277h;

    /* renamed from: i */
    public C89779i0 f109278i;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$a */
    public static final class C40673a extends C87413o implements C32224a<BizTimelineSettingLoadingPreference> {

        /* renamed from: d */
        public final /* synthetic */ BizTimeLineSettingUI f109279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40673a(BizTimeLineSettingUI bizTimeLineSettingUI) {
            super(0);
            this.f109279d = bizTimeLineSettingUI;
        }

        public Object invoke() {
            C47511g preferenceScreen = this.f109279d.getPreferenceScreen();
            C87412m.m108591d(preferenceScreen);
            Preference a = preferenceScreen.mo72519a("biz_msg_rec_loading_pref");
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.BizTimelineSettingLoadingPreference");
            return (BizTimelineSettingLoadingPreference) a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$firstLoadingJob$1", mo125469f = "BizTimeLineSettingUI.kt", mo125470l = {44, 45}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$b */
    public static final class C40674b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f109280d;

        /* renamed from: e */
        public final /* synthetic */ BizTimeLineSettingUI f109281e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$firstLoadingJob$1$1", mo125469f = "BizTimeLineSettingUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$b$a */
        public static final class C40675a extends C91594j implements C32227p<C0000n0, C15601d<? super CheckBoxPreference>, Object> {

            /* renamed from: d */
            public final /* synthetic */ BizTimeLineSettingUI f109282d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40675a(BizTimeLineSettingUI bizTimeLineSettingUI, C15601d<? super C40675a> dVar) {
                super(2, dVar);
                this.f109282d = bizTimeLineSettingUI;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C40675a(this.f109282d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C40675a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C47511g preferenceScreen = this.f109282d.getPreferenceScreen();
                C87412m.m108591d(preferenceScreen);
                return preferenceScreen.mo72529n("biz_msg_rec_loading_pref", false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40674b(BizTimeLineSettingUI bizTimeLineSettingUI, C15601d<? super C40674b> dVar) {
            super(2, dVar);
            this.f109281e = bizTimeLineSettingUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40674b(this.f109281e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40674b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f109280d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f109280d = 1;
                if (C53965x0.m60607b(800, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.BizTimeLineSettingUI", "e = " + e.getMessage());
                }
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C40675a aVar2 = new C40675a(this.f109281e, (C15601d<? super C40675a>) null);
            this.f109280d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$c */
    public static final class C40676c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f109283d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<BizTimeLineSettingUI> f109284e;

        public C40676c(C8477a0 a0Var, WeakReference<BizTimeLineSettingUI> weakReference) {
            this.f109283d = a0Var;
            this.f109284e = weakReference;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            boolean z;
            C87412m.m108594g(cVar, "rr");
            C87412m.m108594g(yVar, "<anonymous parameter 4>");
            Log.m105924i("MicroMsg.BizTimeLineSettingUI", "getTimelineSetting callback " + i + ", " + i2);
            C8477a0 a0Var = this.f109283d;
            if (a0Var.f27482d) {
                return 0;
            }
            boolean z2 = true;
            a0Var.f27482d = true;
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                if (!(aVar instanceof C48976ca2)) {
                    Log.m105928w("MicroMsg.BizTimeLineSettingUI", "not my resp");
                    return 0;
                }
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetTimelineSettingResp");
                C48976ca2 ca22 = (C48976ca2) aVar;
                BizTimeLineSettingUI bizTimeLineSettingUI = this.f109284e.get();
                if (bizTimeLineSettingUI != null) {
                    int i3 = BizTimeLineSettingUI.f109272j;
                    Log.m105924i("MicroMsg.BizTimeLineSettingUI", "initData personalized_recommend_setting=" + ca22.f131591d);
                    C53973z1.C53974a.m60623a(bizTimeLineSettingUI.f109276g, (CancellationException) null, 1, (Object) null);
                    C47511g preferenceScreen = bizTimeLineSettingUI.getPreferenceScreen();
                    C87412m.m108591d(preferenceScreen);
                    preferenceScreen.mo72529n("biz_msg_rec_loading_pref", true);
                    ((CheckBoxPreference) ((C36570n) bizTimeLineSettingUI.f109273d).getValue()).mo6805K(ca22.f131591d);
                    ((CheckBoxPreference) ((C36570n) bizTimeLineSettingUI.f109274e).getValue()).mo6805K(ca22.f131593f);
                    C47511g preferenceScreen2 = bizTimeLineSettingUI.getPreferenceScreen();
                    C87412m.m108591d(preferenceScreen2);
                    C44545a aVar2 = C44545a.f120794a;
                    qg4 b = aVar2.mo69324b();
                    if (b == null) {
                        Log.m105924i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting settingInfo is null");
                        z = false;
                    } else {
                        Log.m105925i("MicroMsg.BizTimeLineSettingUI", "isOpenTimeLineSetting timelineSettingControlBit=%d", Integer.valueOf(b.f140315d));
                        z = aVar2.mo69326d(b.f140315d);
                    }
                    preferenceScreen2.mo72529n("biz_msg_rec_pref", !z);
                    C47511g preferenceScreen3 = bizTimeLineSettingUI.getPreferenceScreen();
                    C87412m.m108591d(preferenceScreen3);
                    preferenceScreen3.mo72529n("biz_msg_pay_for_head_pref", false);
                }
                return 0;
            }
            BizTimeLineSettingUI bizTimeLineSettingUI2 = this.f109284e.get();
            if (bizTimeLineSettingUI2 != null) {
                int i4 = BizTimeLineSettingUI.f109272j;
                if (str != null && !C112551y.m153811k(str)) {
                    z2 = false;
                }
                if (z2) {
                    str = bizTimeLineSettingUI2.getString(C0966R.string.apv);
                }
                String str2 = str;
                C87412m.m108593f(str2, "if (errMsg.isNullOrBlank…tting_failed) else errMsg");
                C76879j.m92707A(bizTimeLineSettingUI2, "", str2, bizTimeLineSettingUI2.getString(C0966R.string.a2k), bizTimeLineSettingUI2.getString(C0966R.string.f7926wf), new C40805u3(bizTimeLineSettingUI2), new C40806v3(bizTimeLineSettingUI2));
            }
            return 0;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$onCreate$1", mo125469f = "BizTimeLineSettingUI.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$d */
    public static final class C40677d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f109285d;

        /* renamed from: e */
        public final /* synthetic */ BizTimeLineSettingUI f109286e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40677d(BizTimeLineSettingUI bizTimeLineSettingUI, C15601d<? super C40677d> dVar) {
            super(2, dVar);
            this.f109286e = bizTimeLineSettingUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40677d(this.f109286e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40677d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f109285d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f109286e.f109276g;
                this.f109285d = 1;
                if (((C53884f2) z1Var).mo74521O(this) == aVar) {
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

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$e */
    public static final class C40678e extends C87413o implements C32224a<CheckBoxPreference> {

        /* renamed from: d */
        public final /* synthetic */ BizTimeLineSettingUI f109287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40678e(BizTimeLineSettingUI bizTimeLineSettingUI) {
            super(0);
            this.f109287d = bizTimeLineSettingUI;
        }

        public Object invoke() {
            C47511g preferenceScreen = this.f109287d.getPreferenceScreen();
            C87412m.m108591d(preferenceScreen);
            Preference a = preferenceScreen.mo72519a("biz_msg_pay_for_head_pref");
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            return (CheckBoxPreference) a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$f */
    public static final class C40679f extends C87413o implements C32224a<CheckBoxPreference> {

        /* renamed from: d */
        public final /* synthetic */ BizTimeLineSettingUI f109288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40679f(BizTimeLineSettingUI bizTimeLineSettingUI) {
            super(0);
            this.f109288d = bizTimeLineSettingUI;
        }

        public Object invoke() {
            C47511g preferenceScreen = this.f109288d.getPreferenceScreen();
            C87412m.m108591d(preferenceScreen);
            Preference a = preferenceScreen.mo72519a("biz_msg_rec_pref");
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            return (CheckBoxPreference) a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI$g */
    public static final class C40680g implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f109289d;

        /* renamed from: e */
        public final /* synthetic */ BizTimeLineSettingUI f109290e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<BizTimeLineSettingUI> f109291f;

        /* renamed from: g */
        public final /* synthetic */ String f109292g;

        /* renamed from: h */
        public final /* synthetic */ C48951c34 f109293h;

        public C40680g(C8477a0 a0Var, BizTimeLineSettingUI bizTimeLineSettingUI, WeakReference<BizTimeLineSettingUI> weakReference, String str, C48951c34 c342) {
            this.f109289d = a0Var;
            this.f109290e = bizTimeLineSettingUI;
            this.f109291f = weakReference;
            this.f109292g = str;
            this.f109293h = c342;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C89779i0 i0Var;
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C47350c cVar2 = cVar;
            C87412m.m108594g(cVar2, "rr");
            C87412m.m108594g(yVar, "<anonymous parameter 4>");
            Log.m105924i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting callback " + i3 + ", " + i4 + ", " + str2);
            if (this.f109289d.f27482d) {
                return 0;
            }
            this.f109290e.f109277h = false;
            BizTimeLineSettingUI bizTimeLineSettingUI = this.f109291f.get();
            if (!(bizTimeLineSettingUI == null || (i0Var = bizTimeLineSettingUI.f109278i) == null)) {
                i0Var.dismiss();
                bizTimeLineSettingUI.f109278i = null;
            }
            boolean z = true;
            this.f109289d.f27482d = true;
            if (!(cVar2.f127056b.f127083a instanceof C49090d34)) {
                Log.m105928w("MicroMsg.BizTimeLineSettingUI", "not my resp");
                return 0;
            } else if (i3 == 0 && i4 == 0) {
                BizTimePersonalizedRecommendUpdateEvent bizTimePersonalizedRecommendUpdateEvent = new BizTimePersonalizedRecommendUpdateEvent();
                bizTimePersonalizedRecommendUpdateEvent.f107388d.f107389a = this.f109293h.f131482d;
                bizTimePersonalizedRecommendUpdateEvent.asyncPublish(Looper.getMainLooper());
                return 0;
            } else {
                BizTimeLineSettingUI bizTimeLineSettingUI2 = this.f109291f.get();
                if (bizTimeLineSettingUI2 != null) {
                    String str3 = this.f109292g;
                    if (C112551y.m153808h("biz_msg_rec_pref", str3, false, 2, (Object) null)) {
                        ((CheckBoxPreference) ((C36570n) bizTimeLineSettingUI2.f109273d).getValue()).mo6808N(!bizTimeLineSettingUI2.f109275f.f131482d);
                    } else if (C112551y.m153808h("biz_msg_pay_for_head_pref", str3, false, 2, (Object) null)) {
                        ((CheckBoxPreference) ((C36570n) bizTimeLineSettingUI2.f109274e).getValue()).mo6808N(!bizTimeLineSettingUI2.f109275f.f131483e);
                    }
                    if (str2 != null && !C112551y.m153811k(str)) {
                        z = false;
                    }
                    String string = z ? bizTimeLineSettingUI2.getString(C0966R.string.aqk) : str2;
                    C87412m.m108593f(string, "if (errMsg.isNullOrBlank…tting_failed) else errMsg");
                    C76879j.m92707A(bizTimeLineSettingUI2, "", string, bizTimeLineSettingUI2.getString(C0966R.string.a2k), bizTimeLineSettingUI2.getString(C0966R.string.f7926wf), new C40808y3(bizTimeLineSettingUI2, str3), new C40809z3(bizTimeLineSettingUI2));
                }
                return 0;
            }
        }
    }

    public BizTimeLineSettingUI() {
        C36568h.m40985a(new C40673a(this));
        this.f109275f = new C48951c34();
        this.f109276g = C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C40674b(this, (C15601d<? super C40674b>) null), 3, (Object) null);
    }

    /* renamed from: H7 */
    public static final void m43920H7(BizTimeLineSettingUI bizTimeLineSettingUI) {
        C89779i0 i0Var = bizTimeLineSettingUI.f109278i;
        if (i0Var != null) {
            i0Var.dismiss();
            bizTimeLineSettingUI.f109278i = null;
        }
        C89779i0 Q = C76879j.m92723Q(bizTimeLineSettingUI, (String) null, bizTimeLineSettingUI.getString(C0966R.string.a4d), true, false, C2148w3.f12118d);
        bizTimeLineSettingUI.f109278i = Q;
        if (Q != null) {
            Q.setOnCancelListener(new C40807x3(bizTimeLineSettingUI));
        }
    }

    /* renamed from: I7 */
    public final void mo63584I7() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48829ba2();
        bVar.f127067b = new C48976ca2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/gettimelinesetting";
        bVar.f127069d = 4758;
        C89144l0.m111429e(bVar.mo72403a(), new C40676c(new C8477a0(), new WeakReference(this)), false);
    }

    /* renamed from: J7 */
    public final void mo63585J7(C48951c34 c342, String str) {
        C87412m.m108594g(c342, "req");
        C87412m.m108594g(str, "key");
        Log.m105925i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting personalized_recommend_setting = " + c342.f131482d, "pay for head = " + c342.f131483e);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = c342;
        bVar.f127067b = new C49090d34();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/settimelinesetting";
        bVar.f127069d = 1460;
        C47350c a = bVar.mo72403a();
        C8477a0 a0Var = new C8477a0();
        WeakReference weakReference = new WeakReference(this);
        this.f109277h = true;
        C89144l0.m111429e(a, new C40680g(a0Var, this, weakReference, str, c342), false);
    }

    public int getResourceId() {
        return C0966R.C0971layout.f6653ku;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.a2z);
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new C40804t3(this));
        C47511g preferenceScreen = getPreferenceScreen();
        C87412m.m108591d(preferenceScreen);
        preferenceScreen.mo72529n("biz_msg_rec_pref", true);
        C47511g preferenceScreen2 = getPreferenceScreen();
        C87412m.m108591d(preferenceScreen2);
        preferenceScreen2.mo72529n("biz_msg_pay_for_head_pref", true);
        C47511g preferenceScreen3 = getPreferenceScreen();
        C87412m.m108591d(preferenceScreen3);
        preferenceScreen3.mo72529n("biz_msg_rec_loading_pref", true);
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C40677d(this, (C15601d<? super C40677d>) null), 3, (Object) null);
        mo63584I7();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (gVar == null) {
            return false;
        }
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.BizTimeLineSettingUI", str + " item has been clicked!");
        C87412m.m108593f(str, "key");
        if (C112551y.m153808h("biz_msg_rec_pref", str, false, 2, (Object) null) || C112551y.m153808h("biz_msg_pay_for_head_pref", str, false, 2, (Object) null)) {
            this.f109275f.f131482d = ((CheckBoxPreference) ((C36570n) this.f109273d).getValue()).mo6804J();
            this.f109275f.f131483e = ((CheckBoxPreference) ((C36570n) this.f109274e).getValue()).mo6804J();
            C119179t tVar = C119157j.f356862d;
            C40803s3 s3Var = new C40803s3(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(s3Var, 800, false);
            mo63585J7(this.f109275f, str);
        }
        return false;
    }
}
