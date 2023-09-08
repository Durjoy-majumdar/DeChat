package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.mm.ui.widget.picker.n */
public class C7061n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public C104428a f24887d = new C104428a(this.f24889f, 0);

    /* renamed from: e */
    public View f24888e;

    /* renamed from: f */
    public Context f24889f;

    /* renamed from: g */
    public int f24890g;

    /* renamed from: h */
    public BottomSheetBehavior f24891h;

    /* renamed from: i */
    public LinearLayout f24892i;

    /* renamed from: j */
    public LinearLayout f24893j;

    /* renamed from: n */
    public CustomTimePickerNew f24894n;

    /* renamed from: o */
    public C7062a f24895o;

    /* renamed from: com.tencent.mm.ui.widget.picker.n$a */
    public interface C7062a<T> {
        /* renamed from: a */
        void mo7432a(boolean z, T t);
    }

    public C7061n(Context context) {
        this.f24889f = context;
        View inflate = View.inflate(this.f24889f, C0966R.C0971layout.c__, (ViewGroup) null);
        this.f24888e = inflate;
        this.f24892i = (LinearLayout) inflate.findViewById(C0966R.C0970id.kkr);
        this.f24893j = (LinearLayout) this.f24888e.findViewById(C0966R.C0970id.kks);
        this.f24894n = new CustomTimePickerNew(this.f24889f);
        this.f24892i.removeAllViews();
        this.f24892i.setGravity(17);
        this.f24892i.addView(this.f24894n.getView(), new LinearLayout.LayoutParams(-1, -1));
        ((Button) this.f24888e.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C7058k(this));
        ((Button) this.f24888e.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C7059l(this));
        this.f24887d.setContentView(this.f24888e);
        this.f24890g = C74942w4.m89784a(this.f24889f, v2helper.EMethodSetPlayerPreCorrectCofOn);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f24888e.getParent());
        this.f24891h = y;
        if (y != null) {
            y.mo146383A(this.f24890g);
            this.f24891h.f309230p = false;
        }
        this.f24887d.setOnDismissListener(new C7060m(this));
    }

    public void onGlobalLayout() {
    }
}
