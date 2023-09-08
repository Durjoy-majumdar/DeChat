package p849e3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p1042u.C111059i;

/* renamed from: e3.g0 */
public final class C107192g0 {

    /* renamed from: a */
    public final C97598e f320795a;

    /* renamed from: e3.g0$e */
    public static class C97598e {
        /* renamed from: a */
        public void mo136861a(boolean z) {
        }

        /* renamed from: b */
        public void mo136862b(boolean z) {
        }
    }

    /* renamed from: e3.g0$a */
    public static class C107193a extends C97598e {

        /* renamed from: a */
        public final Window f320796a;

        /* renamed from: b */
        public final View f320797b;

        public C107193a(Window window, View view) {
            this.f320796a = window;
            this.f320797b = view;
        }
    }

    /* renamed from: e3.g0$b */
    public static class C107194b extends C107193a {
        public C107194b(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public void mo136862b(boolean z) {
            if (z) {
                this.f320796a.clearFlags(67108864);
                this.f320796a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f320796a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            View decorView2 = this.f320796a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
    }

    /* renamed from: e3.g0$c */
    public static class C107195c extends C107194b {
        public C107195c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: a */
        public void mo136861a(boolean z) {
            if (z) {
                this.f320796a.clearFlags(134217728);
                this.f320796a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f320796a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            View decorView2 = this.f320796a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
    }

    public C107192g0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f320795a = new C107196d(windowInsetsController, this);
        } else {
            this.f320795a = new C97598e();
        }
    }

    /* renamed from: e3.g0$d */
    public static class C107196d extends C97598e {

        /* renamed from: a */
        public final WindowInsetsController f320798a;

        /* renamed from: b */
        public Window f320799b;

        public C107196d(Window window, C107192g0 g0Var) {
            this(window.getInsetsController(), g0Var);
            this.f320799b = window;
        }

        /* renamed from: a */
        public void mo136861a(boolean z) {
            if (z) {
                this.f320798a.setSystemBarsAppearance(16, 16);
            } else {
                this.f320798a.setSystemBarsAppearance(0, 16);
            }
        }

        /* renamed from: b */
        public void mo136862b(boolean z) {
            if (z) {
                Window window = this.f320799b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
                }
                this.f320798a.setSystemBarsAppearance(8, 8);
                return;
            }
            this.f320798a.setSystemBarsAppearance(0, 8);
        }

        public C107196d(WindowInsetsController windowInsetsController, C107192g0 g0Var) {
            new C111059i();
            this.f320798a = windowInsetsController;
        }
    }

    public C107192g0(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f320795a = new C107196d(window, this);
        } else if (i >= 26) {
            this.f320795a = new C107195c(window, view);
        } else if (i >= 23) {
            this.f320795a = new C107194b(window, view);
        } else {
            this.f320795a = new C107193a(window, view);
        }
    }
}
