package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.graphics.Insets;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.Set;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.tools.r0 */
public final class C74854r0 {

    /* renamed from: a */
    public static final C74854r0 f220091a = new C74854r0();

    /* renamed from: b */
    public static int f220092b = 1;

    /* renamed from: c */
    public static final Set<C74851q0> f220093c = new LinkedHashSet();

    /* renamed from: com.tencent.mm.ui.tools.r0$a */
    public static final class C74855a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Window f220094d;

        /* renamed from: e */
        public final /* synthetic */ Activity f220095e;

        /* renamed from: f */
        public final /* synthetic */ boolean f220096f;

        /* renamed from: com.tencent.mm.ui.tools.r0$a$a */
        public static final class C74856a implements View.OnApplyWindowInsetsListener {

            /* renamed from: d */
            public final /* synthetic */ Activity f220097d;

            /* renamed from: e */
            public final /* synthetic */ boolean f220098e;

            public C74856a(Activity activity, boolean z) {
                this.f220097d = activity;
                this.f220098e = z;
            }

            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                boolean isVisible = windowInsets.isVisible(WindowInsets.Type.ime());
                Insets insets = windowInsets.getInsets(WindowInsets.Type.ime());
                C87412m.m108593f(insets, "insets.getInsets(WindowInsets.Type.ime())");
                if (C76866m.m92677f()) {
                    Insets insets2 = windowInsets.getInsets(256);
                    C87412m.m108593f(insets2, "insets.getInsets(WINDOW_INSET_TYPE_VIVO_SEC_IME)");
                    insets = Insets.max(insets, insets2);
                    C87412m.m108593f(insets, "max(imeInsets, secImeInsets)");
                    isVisible = isVisible || windowInsets.isVisible(256);
                }
                Insets insets3 = windowInsets.getInsets(WindowInsets.Type.navigationBars());
                C87412m.m108593f(insets3, "insets.getInsets(WindowI…ts.Type.navigationBars())");
                Insets max = Insets.max(Insets.subtract(insets, insets3), Insets.NONE);
                C87412m.m108593f(max, "max(Insets.subtract(imeI…BarsInsets), Insets.NONE)");
                int i = max.bottom - max.top;
                Log.m105925i("KeyBoardHeightProviderUtil", "onApplyWindowInsets %s, %s, %s ,%s , %s, %s ,%s", insets, Boolean.valueOf(windowInsets.isVisible(WindowInsets.Type.ime())), Integer.valueOf(i), this.f220097d, view, windowInsets, Integer.valueOf(C74854r0.f220092b));
                C74854r0.f220091a.getClass();
                for (C74851q0 b : C74854r0.f220093c) {
                    b.mo104020b(i, isVisible);
                }
                if (isVisible) {
                    if (view.findViewById(C0966R.C0970id.fft) != null) {
                        view.setPadding(0, 0, 0, i);
                    }
                } else if (view.findViewById(C0966R.C0970id.fft) != null) {
                    view.setPadding(0, 0, 0, 0);
                }
                if (C74854r0.f220092b == 1 && this.f220098e) {
                    view.onApplyWindowInsets(windowInsets);
                }
                return WindowInsets.CONSUMED;
            }
        }

        public C74855a(Window window, Activity activity, boolean z) {
            this.f220094d = window;
            this.f220095e = activity;
            this.f220096f = z;
        }

        public final void run() {
            this.f220094d.setDecorFitsSystemWindows(true);
            this.f220094d.getDecorView().setOnApplyWindowInsetsListener(new C74856a(this.f220095e, this.f220096f));
            this.f220094d.getDecorView().requestApplyInsets();
        }
    }

    /* renamed from: a */
    public final void mo104080a(C74851q0 q0Var, Activity activity, boolean z) {
        Window window;
        if (q0Var == null || activity == null) {
            Log.m105920e("KeyBoardHeightProviderUtil", "register: NPE");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("register: activity:");
        sb.append(activity);
        sb.append(" , observer: ");
        sb.append(q0Var);
        sb.append(" , hasWindowFocus: ");
        sb.append(activity.hasWindowFocus());
        sb.append("  isFinishing:");
        sb.append(activity.isFinishing());
        sb.append(" decorView:");
        Window window2 = activity.getWindow();
        sb.append(window2 != null ? window2.getDecorView() : null);
        sb.append(" observer.getActivity:");
        sb.append(q0Var.mo104073a());
        Log.m105924i("KeyBoardHeightProviderUtil", sb.toString());
        f220093c.add(q0Var);
        Activity a = q0Var.mo104073a();
        if (a == null || (window = a.getWindow()) == null) {
            Log.m105920e("KeyBoardHeightProviderUtil", "setOnApplyWindowInsetsListener fail");
            return;
        }
        View decorView = window.getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.post(new C74855a(window, activity, z));
    }

    /* renamed from: b */
    public final void mo104081b(C74851q0 q0Var) {
        Window window;
        Object[] objArr = new Object[2];
        objArr[0] = q0Var != null ? q0Var.mo104073a() : null;
        objArr[1] = q0Var;
        Log.m105925i("KeyBoardHeightProviderUtil", "unRegister: activity:%s observer:%s ", objArr);
        if (q0Var != null) {
            f220093c.remove(q0Var);
            C74854r0 r0Var = f220091a;
            Activity a = q0Var.mo104073a();
            r0Var.getClass();
            if (a != null && (window = a.getWindow()) != null) {
                View decorView = window.getDecorView();
                C87412m.m108593f(decorView, "window.decorView");
                decorView.post(new C7019s0(window));
            }
        }
    }
}
