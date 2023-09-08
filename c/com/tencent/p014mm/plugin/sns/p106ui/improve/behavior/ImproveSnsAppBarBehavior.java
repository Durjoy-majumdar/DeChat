package com.tencent.p014mm.plugin.sns.p106ui.improve.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ImproveCollapsingToolbarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.cover.SnsImproveCoverLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p206nj.C47264o;
import rx3.C13601g;
import rx3.C36568h;
import ut2.C102107v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior */
public final class ImproveSnsAppBarBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: A */
    public CoordinatorLayout f279593A;

    /* renamed from: B */
    public AppBarLayout f279594B;

    /* renamed from: C */
    public View f279595C;

    /* renamed from: D */
    public View f279596D;

    /* renamed from: E */
    public View f279597E;

    /* renamed from: F */
    public View f279598F;

    /* renamed from: G */
    public View f279599G;

    /* renamed from: H */
    public View f279600H;

    /* renamed from: I */
    public QFadeImageView f279601I;

    /* renamed from: J */
    public int f279602J = -1;

    /* renamed from: K */
    public float f279603K;

    /* renamed from: L */
    public float f279604L;

    /* renamed from: j */
    public final int f279605j = C76577a.m92151b(MMApplicationContext.getContext(), 128);

    /* renamed from: n */
    public final int f279606n = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: o */
    public final int f279607o = C76577a.m92151b(MMApplicationContext.getContext(), 30);

    /* renamed from: p */
    public final int f279608p = C76577a.m92151b(MMApplicationContext.getContext(), 10);

    /* renamed from: q */
    public final int f279609q = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3679b9);

    /* renamed from: r */
    public final int f279610r = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.aop);

    /* renamed from: s */
    public final int f279611s = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f357038a60);

    /* renamed from: t */
    public final C13601g f279612t = C36568h.m40985a(C30468a.f82125d);

    /* renamed from: u */
    public int f279613u = -1;

    /* renamed from: v */
    public WeImageView f279614v;

    /* renamed from: w */
    public WeImageView f279615w;

    /* renamed from: x */
    public TextView f279616x;

    /* renamed from: y */
    public ImproveCollapsingToolbarLayout f279617y;

    /* renamed from: z */
    public SnsImproveCoverLayout f279618z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior$a */
    public static final class C30468a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30468a f82125d = new C30468a();

        public C30468a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior$isDarkMode$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior$isDarkMode$2");
            Boolean valueOf = Boolean.valueOf(C85875k4.m106211z());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior$isDarkMode$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior$isDarkMode$2");
            return valueOf;
        }
    }

    public ImproveSnsAppBarBehavior() {
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133274C(android.view.View r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "changeStatusBar"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.content.Context r2 = r8.getContext()
            java.lang.String r3 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r2, r3)
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            r5 = 0
            if (r3 < r4) goto L_0x0029
            e3.g0 r2 = p849e3.C107207u.C97600m.m125778b(r2)
            goto L_0x0055
        L_0x0029:
            android.content.Context r3 = r2.getContext()
        L_0x002d:
            boolean r6 = r3 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x0054
            boolean r6 = r3 instanceof android.app.Activity
            if (r6 == 0) goto L_0x004d
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x0054
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0046
            e3.g0 r2 = p849e3.C97596e0.m125774a(r3)
            goto L_0x0055
        L_0x0046:
            e3.g0 r4 = new e3.g0
            r4.<init>(r3, r2)
            r2 = r4
            goto L_0x0055
        L_0x004d:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L_0x002d
        L_0x0054:
            r2 = r5
        L_0x0055:
            java.lang.String r3 = "isDarkMode"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            rx3.g r4 = r7.f279612t
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            if (r4 == 0) goto L_0x006f
            r9 = 0
        L_0x006f:
            if (r2 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            e3.g0$e r2 = r2.f320795a
            r2.mo136862b(r9)
        L_0x0077:
            r9 = r9 ^ 1
            android.content.Context r8 = r8.getContext()
            boolean r2 = r8 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0084
            r5 = r8
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
        L_0x0084:
            if (r5 == 0) goto L_0x008f
            com.tencent.mm.ui.MMActivityController r8 = r5.getController()
            if (r8 == 0) goto L_0x008f
            r8.mo177049H0(r9)
        L_0x008f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.behavior.ImproveSnsAppBarBehavior.mo133274C(android.view.View, boolean):void");
    }

    /* renamed from: d */
    public boolean mo133275d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        QFadeImageView qFadeImageView;
        View view3 = view;
        View view4 = view2;
        SnsMethodCalculate.markStartTimeMs("onDependentViewChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        C87412m.m108594g(coordinatorLayout, "parent");
        C87412m.m108594g(view3, "child");
        C87412m.m108594g(view4, "dependency");
        if (this.f279614v == null || this.f279615w == null) {
            Log.m105926v("MicroMsg.Improve.SnsBehavior", "onDependentViewChanged: init, childView:" + view3 + ", dependency:" + view4);
            ViewParent parent = coordinatorLayout.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f279614v = (WeImageView) viewGroup.findViewById(C0966R.C0970id.f359396kp1);
            this.f279615w = (WeImageView) viewGroup.findViewById(C0966R.C0970id.oiz);
            this.f279616x = (TextView) viewGroup.findViewById(C0966R.C0970id.koh);
            this.f279600H = viewGroup.findViewById(C0966R.C0970id.of5);
            this.f279617y = (ImproveCollapsingToolbarLayout) viewGroup.findViewById(C0966R.C0970id.of4);
            CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) viewGroup.findViewById(C0966R.C0970id.oev);
            this.f279593A = coordinatorLayout2;
            this.f279594B = coordinatorLayout2 != null ? (AppBarLayout) coordinatorLayout2.findViewById(C0966R.C0970id.f6071wh) : null;
            this.f279601I = (QFadeImageView) viewGroup.findViewById(C0966R.C0970id.jvi);
            this.f279618z = (SnsImproveCoverLayout) view4.findViewById(C0966R.C0970id.oew);
            this.f279595C = viewGroup.findViewById(C0966R.C0970id.f358454of3);
            this.f279596D = view4.findViewById(C0966R.C0970id.a27);
            this.f279597E = view4.findViewById(C0966R.C0970id.hg4);
            this.f279598F = view4.findViewById(C0966R.C0970id.jrv);
            this.f279599G = view4.findViewById(C0966R.C0970id.oes);
            int f = C75044y4.m89994f(view.getContext());
            Log.m105924i("MicroMsg.Improve.SnsBehavior", "statusBarHeight:" + f);
            if (f == 0) {
                f = C47264o.m52556a(view.getContext(), 0);
                Log.m105924i("MicroMsg.Improve.SnsBehavior", "fix statusBarHeight:" + f);
            }
            this.f279613u = f + this.f279609q;
            TextView textView = this.f279616x;
            C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
        }
        SnsMethodCalculate.markStartTimeMs("handleAppBarChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        float y = ((view2.getY() + ((float) view2.getHeight())) - ((float) this.f279613u)) + ((float) this.f279610r);
        Log.m105926v("MicroMsg.Improve.SnsBehavior", "onDependentViewChanged distance:" + y + " y:" + view2.getY() + " height:" + view2.getHeight());
        float f2 = (float) this.f279608p;
        Float valueOf = Float.valueOf(1.0f);
        if (y >= f2 && y <= ((float) this.f279607o)) {
            if (this.f279602J != 2) {
                this.f279602J = 2;
                WeImageView weImageView = this.f279615w;
                if (weImageView != null) {
                    weImageView.mo104518r(C0966R.raw.icons_filled_camera, C0966R.color.f2975b6);
                }
                WeImageView weImageView2 = this.f279614v;
                if (weImageView2 != null) {
                    weImageView2.mo104518r(C0966R.raw.icons_filled_back, C0966R.color.f2975b6);
                }
                mo133274C(view3, false);
                TextView textView2 = this.f279616x;
                if (textView2 != null) {
                    textView2.setAlpha(0.0f);
                }
                ImproveCollapsingToolbarLayout improveCollapsingToolbarLayout = this.f279617y;
                if (improveCollapsingToolbarLayout != null) {
                    improveCollapsingToolbarLayout.setCustomScrimAlpha(0);
                }
                View view5 = this.f279600H;
                if (view5 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(valueOf);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            int i = this.f279608p;
            float f3 = ((y - ((float) i)) * 1.0f) / ((float) (this.f279607o - i));
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            WeImageView weImageView3 = this.f279615w;
            if (weImageView3 != null) {
                weImageView3.setAlpha(f3);
            }
            WeImageView weImageView4 = this.f279614v;
            if (weImageView4 != null) {
                weImageView4.setAlpha(f3);
            }
        } else if (y < f2) {
            if (this.f279602J != 1) {
                this.f279602J = 1;
                WeImageView weImageView5 = this.f279615w;
                if (weImageView5 != null) {
                    weImageView5.mo104518r(C0966R.raw.icons_outlined_camera, C0966R.color.f3021cg);
                }
                WeImageView weImageView6 = this.f279614v;
                if (weImageView6 != null) {
                    weImageView6.mo104518r(C0966R.raw.icons_filled_back, C0966R.color.f3021cg);
                }
                mo133274C(view3, true);
            }
            float f4 = (float) this.f279608p;
            float f5 = (f4 - y) / f4;
            WeImageView weImageView7 = this.f279615w;
            if (weImageView7 != null) {
                weImageView7.setAlpha(f5);
            }
            WeImageView weImageView8 = this.f279614v;
            if (weImageView8 != null) {
                weImageView8.setAlpha(f5);
            }
            TextView textView3 = this.f279616x;
            if (textView3 != null) {
                textView3.setAlpha(f5);
            }
            ImproveCollapsingToolbarLayout improveCollapsingToolbarLayout2 = this.f279617y;
            if (improveCollapsingToolbarLayout2 != null) {
                improveCollapsingToolbarLayout2.setCustomScrimAlpha(Math.min((int) (((float) 255) * f5), 255));
            }
            View view7 = this.f279600H;
            if (view7 != null) {
                float f6 = ((float) 1) - f5;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(f6));
                View view8 = view7;
                C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view7.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else if (this.f279602J != 3) {
            this.f279602J = 3;
            WeImageView weImageView9 = this.f279615w;
            if (weImageView9 != null) {
                weImageView9.mo104518r(C0966R.raw.icons_filled_camera, C0966R.color.f2975b6);
            }
            WeImageView weImageView10 = this.f279614v;
            if (weImageView10 != null) {
                weImageView10.mo104518r(C0966R.raw.icons_filled_back, C0966R.color.f2975b6);
            }
            WeImageView weImageView11 = this.f279614v;
            if (weImageView11 != null) {
                weImageView11.setAlpha(1.0f);
            }
            WeImageView weImageView12 = this.f279615w;
            if (weImageView12 != null) {
                weImageView12.setAlpha(1.0f);
            }
            TextView textView4 = this.f279616x;
            if (textView4 != null) {
                textView4.setAlpha(0.0f);
            }
            View view9 = this.f279600H;
            if (view9 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(valueOf);
                View view10 = view9;
                C117292a.m165358d(view10, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view9.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleAppBarChanged", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ImproveCollapsingToolbarLayout improveCollapsingToolbarLayout3 = this.f279617y;
            if (improveCollapsingToolbarLayout3 != null) {
                improveCollapsingToolbarLayout3.setCustomScrimAlpha(0);
            }
            mo133274C(view3, false);
        }
        SnsMethodCalculate.markEndTimeMs("handleAppBarChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        SnsMethodCalculate.markStartTimeMs("handleSnsCoverChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        SnsImproveCoverLayout snsImproveCoverLayout = this.f279618z;
        float stagePercent = snsImproveCoverLayout != null ? snsImproveCoverLayout.getStagePercent() : 0.0f;
        Log.m105918d("MicroMsg.Improve.SnsBehavior", "handleSnsCoverChanged: percent=" + stagePercent + ", lastPercent=" + this.f279604L);
        if (!(stagePercent == this.f279604L)) {
            SnsMethodCalculate.markStartTimeMs("handleOnSnsCoverChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
            View view11 = this.f279598F;
            if (view11 != null) {
                int i2 = stagePercent <= 0.01f ? 8 : 0;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(Integer.valueOf(i2));
                View view12 = view11;
                C117292a.m165358d(view12, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f279604L = stagePercent;
            View view13 = this.f279598F;
            if (view13 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(Float.valueOf(stagePercent));
                View view14 = view13;
                C117292a.m165358d(view14, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view13.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view15 = this.f279596D;
            if (view15 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(Float.valueOf(((float) 1) - stagePercent));
                View view16 = view15;
                C117292a.m165358d(view16, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view15.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view17 = this.f279597E;
            if (view17 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar7.mo10233c(Float.valueOf(((float) 1) - stagePercent));
                View view18 = view17;
                C117292a.m165358d(view18, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view17.setAlpha(((Float) aVar7.mo10231a(0)).floatValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view19 = this.f279595C;
            if (view19 != null) {
                view19.setTranslationY(((float) ((-this.f279609q) * 2)) * stagePercent);
            }
            AppBarLayout appBarLayout = this.f279594B;
            CoordinatorLayout.C103717e eVar = (CoordinatorLayout.C103717e) (appBarLayout != null ? appBarLayout.getLayoutParams() : null);
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) (eVar != null ? eVar.f306328a : null);
            if (behavior != null) {
                behavior.mo146260y((int) (((float) behavior.mo146259w()) * (((float) 1) - stagePercent)));
                AppBarLayout appBarLayout2 = this.f279594B;
                if (appBarLayout2 != null) {
                    appBarLayout2.requestLayout();
                }
            }
            float f7 = ((float) 1) - stagePercent;
            int i3 = (int) (((float) this.f279610r) * f7);
            CoordinatorLayout coordinatorLayout3 = this.f279593A;
            ViewGroup.LayoutParams layoutParams = coordinatorLayout3 != null ? coordinatorLayout3.getLayoutParams() : null;
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = i3;
            Log.m105918d("MicroMsg.Improve.SnsBehavior", "handleSnsCoverChanged coordinatorTopMargin=" + i3);
            CoordinatorLayout coordinatorLayout4 = this.f279593A;
            if (coordinatorLayout4 != null) {
                coordinatorLayout4.requestLayout();
            }
            View view20 = this.f279599G;
            ViewGroup.LayoutParams layoutParams2 = view20 != null ? view20.getLayoutParams() : null;
            if (layoutParams2 != null) {
                int i4 = this.f279606n;
                layoutParams2.height = (int) (((float) i4) + (stagePercent * ((float) (this.f279605j - i4))));
            }
            View view21 = this.f279599G;
            if (view21 != null) {
                view21.requestLayout();
            }
            if (f7 <= 0.0f) {
                View view22 = this.f279596D;
                if (view22 != null) {
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                    aVar8.mo10233c(4);
                    View view23 = view22;
                    C117292a.m165358d(view23, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view22.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view23, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view24 = this.f279597E;
                if (view24 != null) {
                    C9556a aVar9 = new C9556a();
                    ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                    aVar9.mo10233c(4);
                    View view25 = view24;
                    C117292a.m165358d(view25, aVar9.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view24.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view25, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                View view26 = this.f279596D;
                if (view26 != null) {
                    C9556a aVar10 = new C9556a();
                    ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                    aVar10.mo10233c(0);
                    View view27 = view26;
                    C117292a.m165358d(view27, aVar10.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view26.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view27, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view28 = this.f279597E;
                if (view28 != null) {
                    C9556a aVar11 = new C9556a();
                    ThreadLocal<C9556a> threadLocal11 = C60958c.f173611a;
                    aVar11.mo10233c(0);
                    View view29 = view28;
                    C117292a.m165358d(view29, aVar11.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view28.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view29, "com/tencent/mm/plugin/sns/ui/improve/behavior/ImproveSnsAppBarBehavior", "handleOnSnsCoverChanged", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleOnSnsCoverChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        }
        SnsMethodCalculate.markEndTimeMs("handleSnsCoverChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        SnsMethodCalculate.markStartTimeMs("handleTopImagePos", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        if (view2.getY() < this.f279603K) {
            QFadeImageView qFadeImageView2 = this.f279601I;
            C87412m.m108591d(qFadeImageView2);
            qFadeImageView2.setTranslationY(qFadeImageView2.getTranslationY() + ((view2.getY() - this.f279603K) * 0.75f));
            QFadeImageView qFadeImageView3 = this.f279601I;
            C87412m.m108591d(qFadeImageView3);
            float translationY = qFadeImageView3.getTranslationY();
            float f8 = (float) this.f279611s;
            if (translationY < f8 && (qFadeImageView = this.f279601I) != null) {
                qFadeImageView.setTranslationY(f8);
            }
        }
        this.f279603K = view2.getY();
        SnsMethodCalculate.markEndTimeMs("handleTopImagePos", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        Context context = coordinatorLayout.getContext();
        C87412m.m108593f(context, "parent.context");
        SnsMethodCalculate.markStartTimeMs("handleAdExpose", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        ((C102107v) C39818r.f106831a.mo62443b(context).mo75002a(C102107v.class)).mo141609d3(true);
        SnsMethodCalculate.markEndTimeMs("handleAdExpose", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        super.mo133275d(coordinatorLayout, view, view2);
        SnsMethodCalculate.markEndTimeMs("onDependentViewChanged", "com.tencent.mm.plugin.sns.ui.improve.behavior.ImproveSnsAppBarBehavior");
        return false;
    }

    public ImproveSnsAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
