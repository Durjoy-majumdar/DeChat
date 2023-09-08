package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.n */
public class C73446n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public Dialog f215820d;

    /* renamed from: e */
    public Context f215821e;

    /* renamed from: f */
    public View f215822f;

    /* renamed from: g */
    public boolean f215823g = false;

    /* renamed from: h */
    public int f215824h;

    /* renamed from: i */
    public View f215825i;

    /* renamed from: j */
    public ViewTreeObserver f215826j;

    /* renamed from: n */
    public BottomSheetBehavior f215827n;

    public C73446n(Context context) {
        this.f215821e = context;
        if (context instanceof Activity) {
            this.f215825i = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        Context context2 = this.f215821e;
        C104428a aVar = new C104428a(context2, C0966R.style.f8363ft);
        this.f215820d = aVar;
        aVar.setCanceledOnTouchOutside(false);
        this.f215822f = View.inflate(context2, C0966R.C0971layout.f6584um, (ViewGroup) null);
        this.f215823g = mo102395a();
        this.f215820d.setContentView(this.f215822f);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f215822f.getParent());
        this.f215827n = y;
        y.mo146384B(3);
        this.f215827n.f309240z = new C73444l(this);
        this.f215820d.setOnDismissListener(new C73445m(this));
    }

    /* renamed from: a */
    public final boolean mo102395a() {
        return this.f215821e.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public void mo102396b() {
        Dialog dialog = this.f215820d;
        if (dialog != null) {
            Context context = this.f215821e;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f215821e).isDestroyed()) {
                this.f215820d.dismiss();
            }
            BottomSheetBehavior bottomSheetBehavior = this.f215827n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = true;
            }
        }
    }

    public void onGlobalLayout() {
        Dialog dialog = this.f215820d;
        boolean z = true;
        int i = 0;
        if (dialog != null && dialog.isShowing()) {
            View view = this.f215825i;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo102396b();
                return;
            }
            Dialog dialog2 = this.f215820d;
            if (dialog2 == null || !dialog2.isShowing()) {
                z = false;
            }
            if (z) {
                if (this.f215823g == mo102395a()) {
                    int i2 = this.f215824h;
                    Context context = this.f215821e;
                    if (context instanceof Activity) {
                        i = ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
                    }
                    if (i2 == i) {
                        return;
                    }
                }
                mo102396b();
            }
        }
    }
}
