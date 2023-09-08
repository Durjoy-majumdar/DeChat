package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.j2 */
public class C1998j2 extends C1986e4 {

    /* renamed from: A */
    public static final /* synthetic */ int f11925A = 0;

    /* renamed from: x */
    public final Bitmap f11926x;

    /* renamed from: y */
    public TextView f11927y;

    /* renamed from: z */
    public View f11928z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.j2$a */
    public class C1999a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f11929d;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.j2$a$a */
        public class C2000a implements Runnable {
            public C2000a() {
            }

            public void run() {
                C1998j2 j2Var = C1998j2.this;
                int i = C1998j2.f11925A;
                ProgressBar progressBar = (ProgressBar) j2Var.findViewById(C0966R.C0970id.i7j);
                if (progressBar != null && (progressBar.getIndeterminateDrawable() instanceof Animatable)) {
                    ((Animatable) progressBar.getIndeterminateDrawable()).stop();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.j2$a$b */
        public class C2001b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f11932d;

            /* renamed from: e */
            public final /* synthetic */ ViewGroup f11933e;

            public C2001b(View view, ViewGroup viewGroup) {
                this.f11932d = view;
                this.f11933e = viewGroup;
            }

            public void run() {
                View view = this.f11932d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f11933e.removeView(this.f11932d);
                C32224a aVar2 = C1999a.this.f11929d;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        }

        public C1999a(C32224a aVar) {
            this.f11929d = aVar;
        }

        public void run() {
            C1998j2 j2Var = C1998j2.this;
            if (j2Var.getParent() instanceof ViewGroup) {
                j2Var.animate().alpha(0.0f).withEndAction(new C2001b(j2Var, (ViewGroup) j2Var.getParent())).withStartAction(new C2000a()).start();
            }
        }
    }

    public C1998j2(Context context, Bitmap bitmap) {
        super(context);
        this.f11926x = bitmap;
        mo122166H(true);
        setBackground(new BitmapDrawable(getResources(), bitmap));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6471fr, this, false);
        this.f11928z = inflate;
        addView(inflate);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        this.f11927y = textView;
        textView.setText(C0966R.string.f7740px);
        View findViewById = inflate.findViewById(C0966R.C0970id.f358476fd0);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        post(new C1999a(aVar));
    }

    /* renamed from: S */
    public String mo1898S() {
        return "AppBrandRuntimeRestartLoadingSplash";
    }

    public View getView() {
        return this;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11926x.recycle();
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
    }

    /* renamed from: r */
    public void mo1913r(int i) {
    }

    public void setProgress(int i) {
    }

    public void setPromptText(String str) {
        this.f11927y.setText(str);
    }

    public void setPromptVisible(boolean z) {
        View view = this.f11928z;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
