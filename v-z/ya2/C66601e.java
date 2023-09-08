package ya2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: ya2.e */
public final class C66601e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final Context f191512d;

    /* renamed from: e */
    public Dialog f191513e;

    /* renamed from: f */
    public View f191514f;

    /* renamed from: g */
    public boolean f191515g;

    /* renamed from: h */
    public int f191516h;

    /* renamed from: i */
    public View f191517i;

    /* renamed from: j */
    public ViewTreeObserver f191518j;

    /* renamed from: n */
    public BottomSheetBehavior<?> f191519n;

    public C66601e(Context context, boolean z) {
        this.f191512d = context;
        if (context instanceof Activity) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f191517i = ((ViewGroup) decorView).findViewById(C0966R.C0970id.br8);
        }
        C87412m.m108591d(context);
        this.f191513e = new C104428a(context, C0966R.style.f8363ft);
        this.f191514f = View.inflate(context, C0966R.C0971layout.bih, (ViewGroup) null);
        this.f191515g = mo90641a();
        View view = this.f191514f;
        if (view != null) {
            Dialog dialog = this.f191513e;
            C87412m.m108591d(dialog);
            dialog.setContentView(view);
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior<?> y = BottomSheetBehavior.m139527y((View) parent);
            this.f191519n = y;
            if (y != null) {
                y.mo146384B(3);
            }
            BottomSheetBehavior<?> bottomSheetBehavior = this.f191519n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309240z = new C15941c();
            }
            Dialog dialog2 = this.f191513e;
            C87412m.m108591d(dialog2);
            dialog2.setOnDismissListener(new C66600d(this));
        }
    }

    /* renamed from: a */
    public final boolean mo90641a() {
        Context context = this.f191512d;
        C87412m.m108591d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public final boolean mo90642b() {
        Dialog dialog = this.f191513e;
        if (dialog != null) {
            C87412m.m108591d(dialog);
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo90643c() {
        Dialog dialog = this.f191513e;
        if (dialog != null) {
            Context context = this.f191512d;
            if (!(context instanceof Activity)) {
                C87412m.m108591d(dialog);
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f191512d).isDestroyed()) {
                Dialog dialog2 = this.f191513e;
                C87412m.m108591d(dialog2);
                dialog2.dismiss();
            }
            BottomSheetBehavior<?> bottomSheetBehavior = this.f191519n;
            if (bottomSheetBehavior != null) {
                C87412m.m108591d(bottomSheetBehavior);
                bottomSheetBehavior.f309230p = true;
            }
        }
    }

    public void onGlobalLayout() {
        if (mo90642b()) {
            View view = this.f191517i;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo90643c();
            } else if (mo90642b()) {
                if (this.f191515g == mo90641a()) {
                    int i = this.f191516h;
                    Context context = this.f191512d;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                mo90643c();
            }
        }
    }
}
