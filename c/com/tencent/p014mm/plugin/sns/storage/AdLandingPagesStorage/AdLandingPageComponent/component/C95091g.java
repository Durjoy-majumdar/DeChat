package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ps2.C100862c0;
import qs2.C101255a0;
import qs2.C101291s0;
import qs2.C101299z;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g */
public class C95091g extends C95250a {

    /* renamed from: s */
    public C101299z f275990s;

    /* renamed from: t */
    public List<C95295z> f275991t = new ArrayList();

    /* renamed from: u */
    public C100862c0 f275992u;

    public C95091g(Context context, C101299z zVar, ViewGroup viewGroup) {
        super(context, zVar, viewGroup);
        this.f275990s = zVar;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        Iterator it = ((ArrayList) this.f275991t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo130145A();
            }
        }
        super.mo130145A();
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        Iterator it = ((ArrayList) this.f275991t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo124360B();
            }
        }
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        super.mo67235C();
        Iterator it = ((ArrayList) this.f275991t).iterator();
        while (it.hasNext()) {
            ((C95295z) it.next()).mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        Iterator it = ((ArrayList) this.f275991t).iterator();
        while (it.hasNext()) {
            ((C95295z) it.next()).mo124361D();
        }
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: E */
    public List<C95295z> mo130196E() {
        SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        ArrayList arrayList = new ArrayList(this.f275992u.mo140331a());
        SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        return arrayList;
    }

    /* renamed from: G */
    public void mo130197G() {
        SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        Iterator it = ((ArrayList) this.f275991t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo124360B();
                zVar.mo130145A();
            } else {
                zVar.mo124361D();
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        FrameLayout frameLayout = new FrameLayout(this.f276579d);
        if (this.f275990s.f296777B > 0.0f) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(this.f276581f);
            gradientDrawable.setCornerRadius(this.f275990s.f296777B);
            frameLayout.setBackground(gradientDrawable);
            frameLayout.setClipToOutline(true);
        }
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        return frameLayout;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        C100862c0 c0Var = this.f275992u;
        if (c0Var == null) {
            C100862c0 c0Var2 = new C100862c0(this.f275990s.f296778z, this.f276579d, 0, (FrameLayout) this.f276586n);
            this.f275992u = c0Var2;
            c0Var2.mo140332b();
            this.f275991t = mo130196E();
        } else {
            c0Var.mo140333c(this.f275990s.f296778z);
        }
        View view = this.f276586n;
        C101291s0 s0Var = this.f275990s.f296776A;
        SnsMethodCalculate.markStartTimeMs("handleBgColorAndCornerWithoutAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        C101291s0.m132869a(view, s0Var, 1.0f);
        SnsMethodCalculate.markEndTimeMs("handleBgColorAndCornerWithoutAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }

    /* renamed from: z */
    public void mo130213z(C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
        if (a0Var instanceof C101299z) {
            this.f275990s = (C101299z) a0Var;
        }
        super.mo130213z(a0Var);
        SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFrameLayout");
    }
}
