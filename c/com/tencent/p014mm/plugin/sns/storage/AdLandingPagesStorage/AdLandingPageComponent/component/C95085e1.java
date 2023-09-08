package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import java.util.ArrayList;
import java.util.List;
import ps2.C100862c0;
import qs2.C101255a0;
import qs2.C101257b0;
import qs2.C101291s0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e1 */
public class C95085e1 extends C95250a {

    /* renamed from: s */
    public LinearLayout f275979s;

    /* renamed from: t */
    public C100862c0 f275980t;

    public C95085e1(Context context, C101257b0 b0Var, ViewGroup viewGroup) {
        super(context, b0Var, viewGroup);
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        for (C95295z next : this.f275980t.mo140331a()) {
            if (next.mo131640s()) {
                next.mo130145A();
            }
        }
        super.mo130145A();
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        for (C95295z next : this.f275980t.mo140331a()) {
            if (next.mo131640s()) {
                next.mo124360B();
            }
        }
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        super.mo67235C();
        for (C95295z C : this.f275980t.mo140331a()) {
            C.mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        for (C95295z D : this.f275980t.mo140331a()) {
            D.mo124361D();
        }
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: E */
    public List<C95295z> mo130196E() {
        SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        ArrayList arrayList = new ArrayList(this.f275980t.mo140331a());
        SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        return arrayList;
    }

    /* renamed from: G */
    public void mo130197G() {
        SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        for (C95295z next : this.f275980t.mo140331a()) {
            if (next.mo131640s()) {
                next.mo124360B();
                next.mo130145A();
            } else {
                next.mo124361D();
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: H */
    public final C101257b0 mo131592H() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        C101257b0 b0Var = (C101257b0) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        return b0Var;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        this.f275979s = (LinearLayout) this.f276586n.findViewById(C0966R.C0970id.jqc);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        if (mo131592H().f296548A == 0) {
            this.f275979s.setOrientation(1);
        } else if (mo131592H().f296548A == 1) {
            this.f275979s.setOrientation(0);
        }
        C100862c0 c0Var = this.f275980t;
        if (c0Var == null) {
            C100862c0 c0Var2 = new C100862c0(mo131592H().f296550z, this.f276579d, 0, this.f275979s);
            this.f275980t = c0Var2;
            c0Var2.mo140332b();
        } else {
            c0Var.mo140333c(mo131592H().f296550z);
        }
        View view = this.f276586n;
        C101291s0 s0Var = mo131592H().f296549B;
        SnsMethodCalculate.markStartTimeMs("handleBgColorAndCornerWithoutAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        C101291s0.m132869a(view, s0Var, 1.0f);
        SnsMethodCalculate.markEndTimeMs("handleBgColorAndCornerWithoutAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        return C0966R.C0971layout.c1c;
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageLinearLayoutComponent");
    }
}
