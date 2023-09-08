package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdBonusSlideEvent;
import com.tencent.p014mm.autogen.events.SnsAdVideoBonusSceneEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONObject;
import p1208q3.C118144a;
import qs2.C101287r;
import so2.C101675j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j */
public class C94646j extends C95295z {

    /* renamed from: A */
    public int f273862A;

    /* renamed from: B */
    public int f273863B;

    /* renamed from: C */
    public int f273864C;

    /* renamed from: D */
    public int f273865D;

    /* renamed from: E */
    public boolean f273866E;

    /* renamed from: F */
    public boolean f273867F = true;

    /* renamed from: s */
    public C101675j f273868s;

    /* renamed from: t */
    public IListener<SnsAdVideoBonusSceneEvent> f273869t;

    /* renamed from: u */
    public IListener<SnsAdBonusSlideEvent> f273870u;

    /* renamed from: v */
    public ViewGroup f273871v;

    /* renamed from: w */
    public TextView f273872w;

    /* renamed from: x */
    public ViewGroup f273873x;

    /* renamed from: y */
    public C95108i0 f273874y;

    /* renamed from: z */
    public BroadcastReceiver f273875z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j$a */
    public class C94647a extends BroadcastReceiver {
        public C94647a(C94645i iVar) {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$VideoProgressBarReceiver");
            try {
                int intExtra = IntentUtil.getIntExtra(intent, "show", 0);
                int intExtra2 = IntentUtil.getIntExtra(intent, "activity_code", 0);
                C94646j jVar = C94646j.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                Context context2 = jVar.f276579d;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                if (context2 == null || intExtra2 != context2.hashCode()) {
                    Log.m105928w("SnsAd.FloatJumpComp", "the context is not same!!");
                    SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$VideoProgressBarReceiver");
                }
                if (intExtra == 0) {
                    C94646j jVar2 = C94646j.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    boolean z = jVar2.f273867F;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    if (z) {
                        C94646j jVar3 = C94646j.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        View view = jVar3.f276586n;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$VideoProgressBarReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$VideoProgressBarReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    C94646j jVar4 = C94646j.this;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    View view2 = jVar4.f276586n;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$VideoProgressBarReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$VideoProgressBarReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$VideoProgressBarReceiver");
            } catch (Throwable unused) {
            }
        }
    }

    public C94646j(Context context, C101675j jVar, ViewGroup viewGroup, int i) {
        super(context, jVar, viewGroup);
        this.f273868s = jVar;
        this.f273862A = 0;
        this.f273863B = 0;
        this.f273865D = i;
        this.f273866E = true;
    }

    /* renamed from: E */
    public static void m119766E(C94646j jVar, SnsAdVideoBonusSceneEvent snsAdVideoBonusSceneEvent) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        jVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        Log.m105918d("SnsAd.FloatJumpComp", "the SnsAdVideoBonusSceneEvent is received!");
        C101675j jVar2 = jVar.f273868s;
        if (jVar2 != null && jVar2.f297625A > 0) {
            SnsMethodCalculate.markStartTimeMs("hasClicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            boolean z = jVar.f273862A > 0 || jVar.f273863B > 0 || jVar.f273864C > 0;
            SnsMethodCalculate.markEndTimeMs("hasClicked", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (!z) {
                jVar.f273863B++;
                jVar.mo130227G(true);
                SnsMethodCalculate.markEndTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            }
        }
        Log.m105918d("SnsAd.FloatJumpComp", "the comp is clicked, or the auto jump is less than 0!");
        SnsMethodCalculate.markEndTimeMs("onAutoJumpEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.mo124360B();
            C95108i0 i0Var = this.f273874y;
            if (i0Var != null) {
                i0Var.mo124360B();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.mo67235C();
            C95108i0 i0Var = this.f273874y;
            if (i0Var != null) {
                i0Var.mo67235C();
            }
            SnsMethodCalculate.markStartTimeMs("unregisterVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f273875z != null) {
                C118144a.m166672a(this.f276579d).mo182945d(this.f273875z);
                this.f273875z = null;
            }
            SnsMethodCalculate.markEndTimeMs("unregisterVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            IListener<SnsAdVideoBonusSceneEvent> iListener = this.f273869t;
            if (iListener != null) {
                iListener.dead();
                this.f273869t = null;
            }
            IListener<SnsAdBonusSlideEvent> iListener2 = this.f273870u;
            if (iListener2 != null) {
                iListener2.dead();
                this.f273870u = null;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.mo124361D();
            C95108i0 i0Var = this.f273874y;
            if (i0Var != null) {
                i0Var.mo124361D();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: G */
    public final void mo130227G(boolean z) {
        SnsMethodCalculate.markStartTimeMs("dispatchClickEventToButtonComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        C95108i0 i0Var = this.f273874y;
        if (!(i0Var == null || i0Var.mo131625N() == null)) {
            C95108i0 i0Var2 = this.f273874y;
            i0Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("setAutoJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            i0Var2.f276029x = z;
            SnsMethodCalculate.markEndTimeMs("setAutoJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            this.f273874y.mo131625N().performClick();
        }
        SnsMethodCalculate.markEndTimeMs("dispatchClickEventToButtonComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: H */
    public final void mo130228H() {
        C101287r rVar;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        View view = this.f276586n;
        if (view != null) {
            this.f273871v = (ViewGroup) view.findViewById(C0966R.C0970id.jpv);
            this.f273872w = (TextView) this.f276586n.findViewById(C0966R.C0970id.jpw);
            this.f273873x = (ViewGroup) this.f276586n.findViewById(C0966R.C0970id.jpu);
        }
        C101675j jVar = this.f273868s;
        if (!(jVar == null || (rVar = jVar.f297627C) == null)) {
            C95295z a = C96328z2.m123559a(this.f276579d, rVar, this.f273873x, 0);
            if (a instanceof C95108i0) {
                C95108i0 i0Var = (C95108i0) a;
                this.f273874y = i0Var;
                SnsMethodCalculate.markStartTimeMs("setInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                i0Var.f276030y = true;
                SnsMethodCalculate.markEndTimeMs("setInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                this.f273873x.removeAllViews();
                this.f273873x.addView(a.mo131855p());
            }
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: I */
    public final void mo130229I() {
        SnsMethodCalculate.markStartTimeMs("registerVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        if (this.f273875z == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tencent.mm.adlanding.video_progressbar_change");
            this.f273875z = new C94647a((C94645i) null);
            C118144a.m166672a(this.f276579d).mo182943b(this.f273875z, intentFilter);
        }
        SnsMethodCalculate.markEndTimeMs("registerVideoProgressBarReceiver", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            mo130229I();
            SnsMethodCalculate.markStartTimeMs("ensureAutoJumpEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f273869t == null) {
                AdLandingFloatJumpComp$2 adLandingFloatJumpComp$2 = new AdLandingFloatJumpComp$2(this, C40008f.f107254d);
                this.f273869t = adLandingFloatJumpComp$2;
                adLandingFloatJumpComp$2.alive();
            }
            SnsMethodCalculate.markEndTimeMs("ensureAutoJumpEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            SnsMethodCalculate.markStartTimeMs("ensureSlideEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            if (this.f273870u == null) {
                AdLandingFloatJumpComp$3 adLandingFloatJumpComp$3 = new AdLandingFloatJumpComp$3(this, C40008f.f107254d);
                this.f273870u = adLandingFloatJumpComp$3;
                adLandingFloatJumpComp$3.alive();
            }
            SnsMethodCalculate.markEndTimeMs("ensureSlideEventListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            mo130228H();
            SnsMethodCalculate.markStartTimeMs("initViewAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            ViewGroup viewGroup = this.f273871v;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new C94645i(this));
            }
            SnsMethodCalculate.markEndTimeMs("initViewAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        try {
            super.mo67240g();
            SnsMethodCalculate.markStartTimeMs("fillTitleContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            TextView textView = this.f273872w;
            C101675j jVar = this.f273868s;
            if (!(textView == null || jVar == null)) {
                textView.setText(jVar.f297628z);
            }
            SnsMethodCalculate.markEndTimeMs("fillTitleContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        return C0966R.C0971layout.c15;
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        if (jSONArray == null) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (mo118822v(jSONObject)) {
                jSONObject.put("clickCount", this.f273862A);
                jSONObject.put("autoJumpCount", this.f273863B);
                jSONObject.put("swipeJumpCount", this.f273864C);
                jSONArray.put(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                C95108i0 i0Var = this.f273874y;
                if (i0Var != null && i0Var.mo118822v(jSONObject2)) {
                    jSONArray.put(jSONObject2);
                }
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                return true;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        return false;
    }
}
