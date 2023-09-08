package ss1;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFinderMsgUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C58413v0;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ls1.C10646d;
import os1.C11748p;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: ss1.a */
public class C13778a extends C10646d {

    /* renamed from: k */
    public final String f38896k = C66785b.f191882e.mo90662O5();

    /* renamed from: l */
    public TextView f38897l;

    /* renamed from: m */
    public View f38898m;

    /* renamed from: n */
    public C55718s0 f38899n;

    /* renamed from: o */
    public C64586nn1 f38900o;

    /* renamed from: p */
    public final C13601g f38901p = C36568h.m40985a(new C13779a(this));

    /* renamed from: q */
    public View f38902q;

    /* renamed from: r */
    public View f38903r;

    /* renamed from: ss1.a$a */
    public static final class C13779a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C13778a f38904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13779a(C13778a aVar) {
            super(0);
            this.f38904d = aVar;
        }

        public Object invoke() {
            return Integer.valueOf(((C11748p) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11748p.class)).mo11610c3(1, this.f38904d.f38896k));
        }
    }

    public C13778a(int i) {
        super(i);
    }

    /* renamed from: a */
    public int mo3852a() {
        return C0966R.C0971layout.aml;
    }

    /* renamed from: b */
    public int[] mo3853b() {
        return new int[]{0, 0};
    }

    /* renamed from: c */
    public void mo3854c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f32064i = (TextView) viewGroup.findViewById(C0966R.C0970id.kcp);
            this.f38897l = (TextView) viewGroup.findViewById(C0966R.C0970id.kcn);
            this.f38898m = viewGroup.findViewById(C0966R.C0970id.m6d);
            this.f38903r = viewGroup.findViewById(C0966R.C0970id.f358289e81);
            TextView textView = this.f32064i;
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            TextView textView2 = this.f38897l;
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "it.context");
            viewGroup.setContentDescription(mo10907i(context));
        }
        Log.m105924i("Finder.FinderTab", "onTabInflated lastTabIndex:" + mo9049p() + " index:" + this.f174600a);
        Class cls = FinderCommonFeatureService.class;
        int p = mo9049p();
        int i = this.f174600a;
        if (p != i) {
            String str = i != 0 ? i != 1 ? i != 2 ? "" : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike";
            this.f38899n = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77269i(str, this.f38896k);
            this.f38900o = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77285y(str, this.f38896k);
        }
        this.f38902q = viewGroup;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            this.f32057j = (View) parent;
            viewGroup.setTag(this);
        }
    }

    /* renamed from: d */
    public void mo3855d(boolean z, ViewGroup viewGroup) {
        TextPaint paint;
        C87412m.m108594g(viewGroup, "tabView");
        super.mo3855d(z, viewGroup);
        TextView textView = this.f32064i;
        if (textView != null && (paint = textView.getPaint()) != null) {
            if (z) {
                C85875k4.m106189j0(paint, 0.8f);
            } else {
                C85875k4.m106193l0(paint);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9047e(boolean r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0009
            r0 = 2131101252(0x7f060644, float:1.7814908E38)
            r6 = 2131101252(0x7f060644, float:1.7814908E38)
            goto L_0x000f
        L_0x0009:
            r0 = 2131100381(0x7f0602dd, float:1.7813142E38)
            r6 = 2131100381(0x7f0602dd, float:1.7813142E38)
        L_0x000f:
            r0 = 1
            if (r10 == 0) goto L_0x0026
            er1.w3 r1 = er1.C58784w3.f168295a
            java.lang.Integer r0 = r1.mo83917b0(r0, r0)
            if (r0 == 0) goto L_0x001f
            int r0 = r0.intValue()
            goto L_0x0035
        L_0x001f:
            r0 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r5 = 2131755982(0x7f1003ce, float:1.9142859E38)
            goto L_0x003d
        L_0x0026:
            er1.w3 r1 = er1.C58784w3.f168295a
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.Integer r0 = er1.C58784w3.m68436c0(r1, r0, r2, r3, r4)
            if (r0 == 0) goto L_0x0037
            int r0 = r0.intValue()
        L_0x0035:
            r5 = r0
            goto L_0x003d
        L_0x0037:
            r0 = 2131755983(0x7f1003cf, float:1.914286E38)
            r5 = 2131755983(0x7f1003cf, float:1.914286E38)
        L_0x003d:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "getContext()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.CharSequence r3 = r9.mo10907i(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131165329(0x7f070091, float:1.7944872E38)
            float r0 = r0.getDimension(r2)
            int r8 = (int) r0
            er1.w3 r0 = er1.C58784w3.f168295a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r2, r1)
            r4 = 35
            r1 = r0
            r7 = r8
            java.lang.CharSequence r0 = r1.mo83957q1(r2, r3, r4, r5, r6, r7, r8)
            android.widget.TextView r1 = r9.f32064i
            if (r1 == 0) goto L_0x0078
            r1.setText(r0)
            r9.mo3857k(r10)
            r9.mo10908j(r10)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ss1.C13778a.mo9047e(boolean):void");
    }

    /* renamed from: f */
    public void mo3856f(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        super.mo3856f(viewGroup);
        if (viewGroup.getContext() instanceof MMActivity) {
            C58784w3 w3Var = C58784w3.f168295a;
            C55718s0 s0Var = this.f38899n;
            C64586nn1 nn12 = this.f38900o;
            Context context = viewGroup.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            C58739j4 j4Var = C58739j4.f168176a;
            if (s0Var != null && nn12 != null) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, s0Var, nn12, 3, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
        }
    }

    /* renamed from: g */
    public void mo9048g(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        super.mo9048g(viewGroup);
        Log.m105924i("Finder.FinderTab", "onTabUnSelected real");
        String str = "";
        mo9050r(str, true);
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        int i = this.f174600a;
        if (i == 0) {
            str = "NotificationCenterLike";
        } else if (i == 1) {
            str = "NotificationCenterComment";
        } else if (i == 2) {
            str = "NotificationCenterFollow";
        }
        Nx0.mo77239M5(str);
    }

    /* renamed from: h */
    public int mo10906h() {
        return mo9049p();
    }

    /* renamed from: l */
    public View mo10903l() {
        return this.f32064i;
    }

    /* renamed from: m */
    public View mo10904m() {
        return this.f38903r;
    }

    /* renamed from: o */
    public View mo10905o() {
        return this.f38902q;
    }

    /* renamed from: p */
    public int mo9049p() {
        return ((Number) ((C36570n) this.f38901p).getValue()).intValue();
    }

    /* renamed from: q */
    public final void mo13139q(String str, boolean z, boolean z2) {
        if (!z2) {
            TextView textView = this.f38897l;
            if (textView != null) {
                textView.setVisibility(4);
            }
            if (Util.isNullOrNil(str) || z) {
                View view = this.f38898m;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            View view3 = this.f38898m;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        TextView textView2 = this.f38897l;
        if (textView2 != null) {
            if (Util.isNullOrNil(str)) {
                textView2.setVisibility(4);
                textView2.setText("");
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
            }
        }
        View view5 = this.f38898m;
        if (view5 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(4);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/notifytab/FinderNotifyTab", "refreshRedDotView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: r */
    public void mo9050r(String str, boolean z) {
        TextView textView = this.f38897l;
        if (!((textView != null ? textView.getContext() : null) instanceof FinderFinderMsgUI)) {
            TextView textView2 = this.f38897l;
            if (textView2 == null) {
                return;
            }
            if (Util.isNullOrNil(str)) {
                textView2.setVisibility(4);
                textView2.setText("");
                return;
            }
            textView2.setVisibility(0);
            textView2.setText(str);
        } else if (this.f38897l != null) {
            int i = this.f32063h;
            if (i == C0966R.string.efh) {
                mo13139q(str, z, C58739j4.f168176a.mo83684M(1));
            } else if (i == C0966R.string.eff) {
                mo13139q(str, z, C58739j4.f168176a.mo83684M(2));
            } else if (i == C0966R.string.efg) {
                mo13139q(str, z, C58739j4.f168176a.mo83684M(4));
            }
        }
    }
}
