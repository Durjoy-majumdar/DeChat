package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import java.util.LinkedList;

@Deprecated
/* renamed from: com.tencent.mm.plugin.finder.view.v0 */
public class C4191v0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public ViewGroup f18456A;

    /* renamed from: B */
    public ViewGroup f18457B;

    /* renamed from: C */
    public View f18458C;

    /* renamed from: D */
    public View f18459D;

    /* renamed from: E */
    public LinkedList<Object> f18460E = new LinkedList<>();

    /* renamed from: d */
    public Dialog f18461d;

    /* renamed from: e */
    public Context f18462e;

    /* renamed from: f */
    public View f18463f;

    /* renamed from: g */
    public boolean f18464g = false;

    /* renamed from: h */
    public int f18465h;

    /* renamed from: i */
    public int f18466i;

    /* renamed from: j */
    public View f18467j;

    /* renamed from: n */
    public ViewTreeObserver f18468n;

    /* renamed from: o */
    public boolean f18469o = false;

    /* renamed from: p */
    public boolean f18470p = false;

    /* renamed from: q */
    public BottomSheetBehavior f18471q;

    /* renamed from: r */
    public C4192a f18472r = null;

    /* renamed from: s */
    public LinearLayout f18473s;

    /* renamed from: t */
    public View f18474t;

    /* renamed from: u */
    public TextView f18475u;

    /* renamed from: v */
    public int f18476v;

    /* renamed from: w */
    public int f18477w = C0966R.style.f8363ft;

    /* renamed from: x */
    public boolean f18478x;

    /* renamed from: y */
    public boolean f18479y = false;

    /* renamed from: z */
    public ViewGroup f18480z;

    /* renamed from: com.tencent.mm.plugin.finder.view.v0$a */
    public interface C4192a {
        void onDismiss();
    }

    public C4191v0(Context context) {
        this.f18462e = context;
        this.f18470p = false;
        if (context instanceof Activity) {
            this.f18467j = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        this.f18476v = 0;
        Context context2 = this.f18462e;
        if (this.f18470p) {
            this.f18461d = new C4152q1(context2);
        } else {
            this.f18461d = new C104428a(context2, this.f18477w);
        }
        View inflate = View.inflate(context2, C0966R.C0971layout.aly, (ViewGroup) null);
        this.f18463f = inflate;
        this.f18480z = (ViewGroup) inflate.findViewById(C0966R.C0970id.ahb);
        this.f18456A = (ViewGroup) this.f18463f.findViewById(C0966R.C0970id.ahi);
        this.f18473s = (LinearLayout) this.f18463f.findViewById(C0966R.C0970id.ah_);
        this.f18474t = this.f18463f.findViewById(C0966R.C0970id.aq6);
        this.f18475u = (TextView) this.f18463f.findViewById(C0966R.C0970id.aq7);
        this.f18457B = (ViewGroup) this.f18463f.findViewById(C0966R.C0970id.eu_);
        this.f18458C = this.f18463f.findViewById(C0966R.C0970id.msp);
        this.f18459D = this.f18463f.findViewById(C0966R.C0970id.mso);
        this.f18473s.setOnClickListener(new C4144p0(this));
        this.f18464g = mo5068c();
        this.f18461d.requestWindowFeature(1);
        this.f18461d.setContentView(this.f18463f);
        if (!this.f18470p) {
            BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f18463f.getParent());
            this.f18471q = y;
            if (y != null) {
                if (this.f18476v > 0) {
                    y.mo146384B(4);
                    this.f18471q.mo146383A(this.f18476v);
                } else {
                    y.mo146384B(3);
                }
            }
        }
        this.f18461d.setOnDismissListener(new C4151q0(this));
    }

    /* renamed from: a */
    public void mo5066a() {
        this.f18480z.setBackgroundColor(this.f18462e.getResources().getColor(C0966R.color.ahf));
    }

    /* renamed from: b */
    public void mo5067b(boolean z) {
        LinearLayout linearLayout = this.f18473s;
        if (linearLayout != null) {
            if (z) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo5068c() {
        return this.f18462e.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: d */
    public boolean mo5069d() {
        Dialog dialog = this.f18461d;
        return dialog != null && dialog.isShowing();
    }

    /* renamed from: e */
    public C4191v0 mo5070e(int i) {
        LayoutInflater.from(this.f18463f.getContext()).inflate(i, this.f18480z, true);
        return this;
    }

    /* renamed from: f */
    public C4191v0 mo5071f(View view, FrameLayout.LayoutParams layoutParams) {
        this.f18480z.addView(view, 0, layoutParams);
        return this;
    }

    /* renamed from: g */
    public void mo5072g() {
        Dialog dialog = this.f18461d;
        if (dialog != null) {
            Context context = this.f18462e;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f18462e).isDestroyed()) {
                this.f18461d.dismiss();
            }
            BottomSheetBehavior bottomSheetBehavior = this.f18471q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = true;
            }
        }
    }

    /* renamed from: h */
    public void mo5073h() {
        this.f18464g = mo5068c();
        Context context = this.f18462e;
        boolean z = false;
        this.f18465h = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        this.f18463f.setTranslationY(0.0f);
        if (this.f18461d != null) {
            ((ViewGroup) this.f18463f.getParent()).setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18463f.getLayoutParams();
            if (!this.f18470p && this.f18464g && this.f18467j != null) {
                Rect rect = new Rect();
                this.f18467j.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = Math.min(rect.right, rect.bottom);
                layoutParams.gravity = 1;
                ViewParent parent = this.f18463f.getParent();
                if (parent instanceof View) {
                    ((View) parent).setOnTouchListener(new C4169s0(this, parent));
                }
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.getLayoutParams() instanceof CoordinatorLayout.C103717e) {
                        if (!this.f18479y) {
                            C4176t0 t0Var = new C4176t0(this);
                            t0Var.f309240z = new C4183u0(this);
                            ((CoordinatorLayout.C103717e) viewGroup.getLayoutParams()).mo144938b(t0Var);
                            this.f18471q = t0Var;
                        }
                        BottomSheetBehavior bottomSheetBehavior = this.f18471q;
                        if (bottomSheetBehavior != null) {
                            if (this.f18476v > 0) {
                                bottomSheetBehavior.mo146384B(4);
                                this.f18471q.mo146383A(this.f18476v);
                            } else {
                                bottomSheetBehavior.mo146384B(3);
                            }
                        }
                    }
                }
            }
            this.f18463f.setLayoutParams(layoutParams);
            this.f18461d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f18461d.getWindow().clearFlags(8);
            this.f18461d.getWindow().clearFlags(131072);
            this.f18461d.getWindow().clearFlags(128);
            this.f18461d.getWindow().getDecorView().setSystemUiVisibility(0);
            View view = this.f18467j;
            if (view != null) {
                if (this.f18468n == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f18468n = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            Context context2 = this.f18462e;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                this.f18461d.show();
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.f18471q;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.f309230p = this.f18478x;
            }
        }
    }

    public void onGlobalLayout() {
        if (mo5069d()) {
            View view = this.f18467j;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo5072g();
            } else if (mo5069d()) {
                if (this.f18464g == mo5068c()) {
                    int i = this.f18465h;
                    Context context = this.f18462e;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f18466i != this.f18480z.getHeight()) {
                            this.f18466i = this.f18480z.getHeight();
                            int width = this.f18480z.getWidth();
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f18456A.getLayoutParams();
                            layoutParams.height = this.f18466i;
                            layoutParams.width = width;
                            this.f18456A.setLayoutParams(layoutParams);
                            if (this.f18456A.getParent() instanceof ConstraintLayout) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) this.f18456A.getParent();
                                C16569a aVar = new C16569a();
                                aVar.mo16716c(constraintLayout);
                                aVar.mo16717d(this.f18456A.getId(), 2, 0, 2);
                                aVar.mo16717d(this.f18456A.getId(), 4, 0, 4);
                                aVar.mo16714a(constraintLayout);
                                constraintLayout.setConstraintSet((C16569a) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                mo5072g();
            }
        }
    }
}
