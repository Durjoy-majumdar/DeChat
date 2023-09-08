package com.tencent.p014mm.p136ui.chatting.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.view.e */
public class C73884e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public C77407n.C47880p f216824d;

    /* renamed from: e */
    public Dialog f216825e;

    /* renamed from: f */
    public Context f216826f;

    /* renamed from: g */
    public View f216827g;

    /* renamed from: h */
    public boolean f216828h = false;

    /* renamed from: i */
    public int f216829i;

    /* renamed from: j */
    public View f216830j;

    /* renamed from: n */
    public BottomSheetBehavior f216831n;

    /* renamed from: o */
    public ViewTreeObserver f216832o;

    public C73884e(Context context, View view) {
        this.f216827g = view;
        this.f216826f = context;
        if (context instanceof Activity) {
            this.f216830j = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        this.f216825e = new C104428a(this.f216826f, C0966R.style.f8363ft);
        this.f216828h = mo102945a();
        Dialog dialog = this.f216825e;
        if (dialog != null) {
            dialog.setContentView(this.f216827g);
        }
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f216827g.getParent());
        this.f216831n = y;
        y.mo146384B(3);
        Dialog dialog2 = this.f216825e;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new C73882c(this));
        }
    }

    /* renamed from: a */
    public final boolean mo102945a() {
        return this.f216826f.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public void mo102946b() {
        Dialog dialog = this.f216825e;
        if (dialog != null) {
            BottomSheetBehavior bottomSheetBehavior = this.f216831n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = true;
            }
            Context context = this.f216826f;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f216826f).isDestroyed()) {
                this.f216825e.dismiss();
            }
        }
    }

    public void onGlobalLayout() {
        Dialog dialog = this.f216825e;
        boolean z = true;
        int i = 0;
        if (dialog != null && dialog.isShowing()) {
            View view = this.f216830j;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo102946b();
                return;
            }
            Dialog dialog2 = this.f216825e;
            if (dialog2 == null || !dialog2.isShowing()) {
                z = false;
            }
            if (z) {
                if (this.f216828h == mo102945a()) {
                    int i2 = this.f216829i;
                    Context context = this.f216826f;
                    if (context instanceof Activity) {
                        i = ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
                    }
                    if (i2 == i) {
                        return;
                    }
                }
                mo102946b();
            }
        }
    }
}
