package o92;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;

/* renamed from: o92.c */
public class C109999c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public Dialog f329175d;

    /* renamed from: e */
    public Context f329176e;

    /* renamed from: f */
    public View f329177f;

    /* renamed from: g */
    public boolean f329178g = false;

    /* renamed from: h */
    public int f329179h;

    /* renamed from: i */
    public View f329180i;

    /* renamed from: j */
    public ViewTreeObserver f329181j;

    /* renamed from: n */
    public BottomSheetBehavior f329182n;

    /* renamed from: o */
    public C110000a f329183o = null;

    /* renamed from: o92.c$a */
    public interface C110000a {
        void onDismiss();
    }

    public C109999c(Context context) {
        this.f329176e = context;
        if (context instanceof Activity) {
            this.f329180i = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        Context context2 = this.f329176e;
        this.f329175d = new C104428a(context2, C0966R.style.f8363ft);
        this.f329177f = View.inflate(context2, C0966R.C0971layout.bi8, (ViewGroup) null);
        this.f329178g = mo161340a();
        this.f329175d.setContentView(this.f329177f);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f329177f.getParent());
        this.f329182n = y;
        y.mo146384B(3);
        this.f329182n.f309240z = new C76994a(this);
        this.f329175d.setOnDismissListener(new C109998b(this));
    }

    /* renamed from: a */
    public final boolean mo161340a() {
        return this.f329176e.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public void mo161341b() {
        Dialog dialog = this.f329175d;
        if (dialog != null) {
            Context context = this.f329176e;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f329176e).isDestroyed()) {
                this.f329175d.dismiss();
            }
            BottomSheetBehavior bottomSheetBehavior = this.f329182n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = true;
            }
        }
    }

    public void onGlobalLayout() {
        Dialog dialog = this.f329175d;
        boolean z = true;
        int i = 0;
        if (dialog != null && dialog.isShowing()) {
            View view = this.f329180i;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo161341b();
                return;
            }
            Dialog dialog2 = this.f329175d;
            if (dialog2 == null || !dialog2.isShowing()) {
                z = false;
            }
            if (z) {
                if (this.f329178g == mo161340a()) {
                    int i2 = this.f329179h;
                    Context context = this.f329176e;
                    if (context instanceof Activity) {
                        i = ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
                    }
                    if (i2 == i) {
                        return;
                    }
                }
                mo161341b();
            }
        }
    }
}
