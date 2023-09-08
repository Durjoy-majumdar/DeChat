package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.u0 */
public final class C44199u0 {

    /* renamed from: l */
    public static final C44200a f119735l = new C44200a((C8480h) null);

    /* renamed from: a */
    public final View f119736a;

    /* renamed from: b */
    public final View f119737b;

    /* renamed from: c */
    public MMWebView f119738c;

    /* renamed from: d */
    public long f119739d;

    /* renamed from: e */
    public int f119740e;

    /* renamed from: f */
    public final int f119741f = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    /* renamed from: g */
    public boolean f119742g;

    /* renamed from: h */
    public Boolean f119743h;

    /* renamed from: i */
    public boolean f119744i;

    /* renamed from: j */
    public int f119745j;

    /* renamed from: k */
    public final C13601g f119746k;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.u0$a */
    public static final class C44200a {
        public C44200a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo68846a(Context context) {
            C87412m.m108594g(context, "context");
            if (Build.VERSION.SDK_INT > 28) {
                try {
                    Object invoke = Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new Class[0]).invoke((Object) null, new Object[0]);
                    Class<?> cls = invoke.getClass();
                    Class cls2 = Integer.TYPE;
                    C87412m.m108591d(cls2);
                    Object invoke2 = cls.getMethod("hasNavigationBar", new Class[]{cls2}).invoke(invoke, new Object[]{context.getClass().getMethod("getDisplayId", new Class[0]).invoke(context, new Object[0])});
                    C87412m.m108592e(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                    return ((Boolean) invoke2).booleanValue();
                } catch (Throwable th) {
                    Log.m105929w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar Q ex:%s", th.getMessage());
                    return false;
                }
            } else {
                try {
                    Object invoke3 = Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new Class[0]).invoke((Object) null, new Object[0]);
                    Object invoke4 = invoke3.getClass().getMethod("hasNavigationBar", new Class[0]).invoke(invoke3, new Object[0]);
                    C87412m.m108592e(invoke4, "null cannot be cast to non-null type kotlin.Boolean");
                    return ((Boolean) invoke4).booleanValue();
                } catch (Throwable th4) {
                    Log.m105929w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar ex:%s", th4.getMessage());
                    return false;
                }
            }
        }

        /* renamed from: b */
        public final boolean mo68847b(Context context) {
            C87412m.m108594g(context, "context");
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", Platform.ANDROID);
            boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Object invoke = cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"qemu.hw.mainkeys"});
                C87412m.m108592e(invoke, "null cannot be cast to non-null type kotlin.String");
                String str = (String) invoke;
                if (C87412m.m108589b("1", str)) {
                    return false;
                }
                if (C87412m.m108589b("0", str)) {
                    return true;
                }
                return z;
            } catch (Throwable th) {
                Log.m105929w("MicroMsg.WebViewBottomNavigatorHelper", "hasNavigationBar ex:%s", th.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.u0$b */
    public static final class C44201b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C44199u0 f119747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44201b(C44199u0 u0Var) {
            super(0);
            this.f119747d = u0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0128, code lost:
            if (r0 != false) goto L_0x012a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r13 = this;
                com.tencent.mm.plugin.webview.ui.tools.u0 r0 = r13.f119747d
                r0.getClass()
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r1 = "force_fsg_nav_bar"
                r2 = 0
                int r0 = android.provider.Settings.Global.getInt(r0, r1, r2)
                r1 = 1
                if (r0 == 0) goto L_0x0019
                r0 = 1
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                java.lang.String r3 = "MicroMsg.WebViewBottomNavigatorHelper"
                java.lang.String r4 = "getContext()"
                if (r0 != 0) goto L_0x0022
                r0 = 0
                goto L_0x003c
            L_0x0022:
                com.tencent.mm.plugin.webview.ui.tools.u0$a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44199u0.f119735l
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r5, r4)
                boolean r0 = r0.mo68846a(r5)
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                r5[r2] = r6
                java.lang.String r6 = "miui hasNavigationBar %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            L_0x003c:
                if (r0 != 0) goto L_0x012a
                com.tencent.mm.plugin.webview.ui.tools.u0 r0 = r13.f119747d
                r0.getClass()
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r5 = "secure_gesture_navigation"
                int r0 = android.provider.Settings.Secure.getInt(r0, r5, r2)
                if (r0 == 0) goto L_0x0055
                r0 = 1
                goto L_0x0056
            L_0x0055:
                r0 = 0
            L_0x0056:
                if (r0 != 0) goto L_0x005a
                r0 = 0
                goto L_0x0074
            L_0x005a:
                com.tencent.mm.plugin.webview.ui.tools.u0$a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44199u0.f119735l
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r5, r4)
                boolean r0 = r0.mo68847b(r5)
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                r5[r2] = r6
                java.lang.String r6 = "huawei hasNavigationBar %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            L_0x0074:
                if (r0 != 0) goto L_0x012a
                com.tencent.mm.plugin.webview.ui.tools.u0 r0 = r13.f119747d
                r0.getClass()
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r5 = "hide_navigationbar_enable"
                int r0 = android.provider.Settings.Secure.getInt(r0, r5, r2)
                r5 = 3
                if (r0 != r5) goto L_0x008e
                r0 = 1
                goto L_0x008f
            L_0x008e:
                r0 = 0
            L_0x008f:
                if (r0 != 0) goto L_0x0093
                r0 = 0
                goto L_0x00ad
            L_0x0093:
                com.tencent.mm.plugin.webview.ui.tools.u0$a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44199u0.f119735l
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r5, r4)
                boolean r0 = r0.mo68847b(r5)
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                r5[r2] = r6
                java.lang.String r6 = "oppo hasNavigationBar %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            L_0x00ad:
                if (r0 != 0) goto L_0x012a
                com.tencent.mm.plugin.webview.ui.tools.u0 r0 = r13.f119747d
                r0.getClass()
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r5 = "navigation_gesture_on"
                int r0 = android.provider.Settings.Secure.getInt(r0, r5, r2)
                if (r0 == 0) goto L_0x00c6
                r0 = 1
                goto L_0x00c7
            L_0x00c6:
                r0 = 0
            L_0x00c7:
                if (r0 != 0) goto L_0x00ca
                goto L_0x00f8
            L_0x00ca:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r5 = "navigation_gesture_mode"
                int r0 = android.provider.Settings.Secure.getInt(r0, r5, r2)
                if (r0 != r1) goto L_0x00dc
                r0 = 1
                goto L_0x00dd
            L_0x00dc:
                r0 = 0
            L_0x00dd:
                if (r0 != 0) goto L_0x00fa
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r0 = 18210(0x4722, float:2.5518E-41)
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r3[r2] = r4
                r5.mo160131h(r0, r3)
                r6 = 1160(0x488, double:5.73E-321)
                r8 = 1
                r10 = 1
                r12 = 0
                r5.idkeyStat(r6, r8, r10, r12)
            L_0x00f8:
                r0 = 0
                goto L_0x0128
            L_0x00fa:
                com.tencent.mm.plugin.webview.ui.tools.u0$a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44199u0.f119735l
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r5, r4)
                boolean r5 = r0.mo68846a(r5)
                if (r5 != 0) goto L_0x0119
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r5, r4)
                boolean r0 = r0.mo68847b(r5)
                if (r0 == 0) goto L_0x0117
                goto L_0x0119
            L_0x0117:
                r0 = 0
                goto L_0x011a
            L_0x0119:
                r0 = 1
            L_0x011a:
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                r4[r2] = r5
                java.lang.String r5 = "vivo hasNavigationBar %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            L_0x0128:
                if (r0 == 0) goto L_0x012b
            L_0x012a:
                r2 = 1
            L_0x012b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C44199u0.C44201b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.u0$c */
    public static final class C44202c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C44199u0 f119748d;

        public C44202c(C44199u0 u0Var) {
            this.f119748d = u0Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f119748d.f119736a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewBottomNavigatorHelper$hideBottomNavigator$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewBottomNavigatorHelper$hideBottomNavigator$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C44199u0.m48461a(this.f119748d, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.u0$d */
    public static final class C44203d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C44199u0 f119749d;

        public C44203d(C44199u0 u0Var) {
            this.f119749d = u0Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C44199u0.m48461a(this.f119749d, true);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f119749d.f119736a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewBottomNavigatorHelper$showBottomNavigator$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewBottomNavigatorHelper$showBottomNavigator$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C44199u0(View view, View view2, MMWebView mMWebView) {
        C87412m.m108594g(view, "bottomNavigator");
        C87412m.m108594g(view2, "root");
        this.f119736a = view;
        this.f119737b = view2;
        this.f119738c = mMWebView;
        MMWebView mMWebView2 = this.f119738c;
        if (mMWebView2 != null) {
            this.f119744i = mMWebView2.isXWalkKernel();
        }
        this.f119746k = C36568h.m40985a(new C44201b(this));
    }

    /* renamed from: a */
    public static final void m48461a(C44199u0 u0Var, boolean z) {
        if (u0Var.f119744i) {
            if (u0Var.f119745j <= 0) {
                u0Var.f119745j = u0Var.f119736a.getHeight();
            }
            if (z) {
                MMWebView mMWebView = u0Var.f119738c;
                if (mMWebView != null) {
                    mMWebView.setBottomHeight(u0Var.f119745j);
                    return;
                }
                return;
            }
            MMWebView mMWebView2 = u0Var.f119738c;
            if (mMWebView2 != null) {
                mMWebView2.setBottomHeight(0);
            }
        } else if (u0Var.f119737b.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            View view = u0Var.f119737b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.addRule(2, C0966R.C0970id.llz);
            } else {
                layoutParams2.removeRule(2);
            }
            view.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: b */
    public final void mo68844b() {
        if (this.f119736a.getVisibility() != 8) {
            Log.m105924i("MicroMsg.WebViewBottomNavigatorHelper", "hideBottomNavigator");
            this.f119736a.clearAnimation();
            this.f119736a.animate().setDuration(300).translationY((float) this.f119736a.getHeight()).setInterpolator(new AccelerateInterpolator(2.0f)).setListener(new C44202c(this)).start();
        }
    }

    /* renamed from: c */
    public final void mo68845c() {
        if (this.f119736a.getVisibility() != 0) {
            Log.m105924i("MicroMsg.WebViewBottomNavigatorHelper", "showBottomNavigator");
            this.f119736a.clearAnimation();
            this.f119736a.animate().setDuration(300).translationY(0.0f).setInterpolator(new AccelerateInterpolator(2.0f)).setListener(new C44203d(this)).start();
        }
    }
}
