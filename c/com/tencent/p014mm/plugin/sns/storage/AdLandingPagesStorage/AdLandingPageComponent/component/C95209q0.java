package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.tencent.p014mm.p136ui.base.CustomScrollView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C9557b;
import ps2.C100862c0;
import qs2.C101255a0;
import qs2.C101298y;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 */
public class C95209q0 extends C95250a {

    /* renamed from: s */
    public C101298y f276283s;

    /* renamed from: t */
    public List<C95295z> f276284t = new ArrayList();

    /* renamed from: u */
    public C100862c0 f276285u;

    /* renamed from: v */
    public CustomScrollView f276286v;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0$a */
    public class C95210a implements CustomScrollView.C57659a {
        public C95210a() {
        }

        /* renamed from: a */
        public void mo12459a(ScrollView scrollView, int i, int i2, int i3, int i4) {
            C9557b bVar = new C9557b();
            bVar.mo10236c(scrollView);
            bVar.mo10235b(i);
            bVar.mo10235b(i2);
            bVar.mo10235b(i3);
            bVar.mo10235b(i4);
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLayout$1", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", this, bVar.mo10234a());
            SnsMethodCalculate.markStartTimeMs("onScrollChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout$1");
            C95209q0 q0Var = C95209q0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
            List<C95295z> list = q0Var.f276284t;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C95295z zVar = (C95295z) it.next();
                if (zVar.mo131640s()) {
                    zVar.mo124360B();
                    zVar.mo130145A();
                } else {
                    zVar.mo124361D();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onScrollChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLayout$1", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V");
        }
    }

    public C95209q0(Context context, C101298y yVar, ViewGroup viewGroup) {
        super(context, yVar, viewGroup);
        this.f276283s = yVar;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        Iterator it = ((ArrayList) this.f276284t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo130145A();
            }
        }
        super.mo130145A();
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        Iterator it = ((ArrayList) this.f276284t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo124360B();
            }
        }
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        super.mo67235C();
        Iterator it = ((ArrayList) this.f276284t).iterator();
        while (it.hasNext()) {
            ((C95295z) it.next()).mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        Iterator it = ((ArrayList) this.f276284t).iterator();
        while (it.hasNext()) {
            ((C95295z) it.next()).mo124361D();
        }
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: E */
    public List<C95295z> mo130196E() {
        SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        ArrayList arrayList = new ArrayList(this.f276285u.mo140331a());
        SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        return arrayList;
    }

    /* renamed from: G */
    public void mo130197G() {
        SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        Iterator it = ((ArrayList) this.f276284t).iterator();
        while (it.hasNext()) {
            C95295z zVar = (C95295z) it.next();
            if (zVar.mo131640s()) {
                zVar.mo124360B();
                zVar.mo130145A();
            } else {
                zVar.mo124361D();
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(this.f276579d);
        CustomScrollView customScrollView = new CustomScrollView(this.f276579d);
        this.f276286v = customScrollView;
        customScrollView.setOverScrollMode(2);
        this.f276286v.setHorizontalScrollBarEnabled(false);
        this.f276286v.setVerticalScrollBarEnabled(false);
        this.f276286v.setOnScrollChangeListener(new C95210a());
        roundedCornerFrameLayout.setBackgroundColor(this.f276581f);
        roundedCornerFrameLayout.addView(this.f276286v);
        roundedCornerFrameLayout.setRadius(this.f276283s.f296770A);
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        return roundedCornerFrameLayout;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        C100862c0 c0Var = this.f276285u;
        if (c0Var == null) {
            C100862c0 c0Var2 = new C100862c0(this.f276283s.f296775z, this.f276579d, 0, this.f276286v);
            this.f276285u = c0Var2;
            c0Var2.mo140332b();
            this.f276284t = mo130196E();
        } else {
            c0Var.mo140333c(this.f276283s.f296775z);
        }
        if (mo131852k() == 0) {
            ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                C101255a0 a0Var = this.f276580e;
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
            }
            this.f276586n.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    /* renamed from: z */
    public void mo130213z(C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        if (a0Var instanceof C101298y) {
            this.f276283s = (C101298y) a0Var;
        }
        super.mo130213z(a0Var);
        SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }
}
