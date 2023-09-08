package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C107222v;

/* renamed from: androidx.appcompat.widget.k0 */
public class C103544k0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    public static C103544k0 f305774p;

    /* renamed from: q */
    public static C103544k0 f305775q;

    /* renamed from: d */
    public final View f305776d;

    /* renamed from: e */
    public final CharSequence f305777e;

    /* renamed from: f */
    public final int f305778f;

    /* renamed from: g */
    public final Runnable f305779g = new C103545a();

    /* renamed from: h */
    public final Runnable f305780h = new C103546b();

    /* renamed from: i */
    public int f305781i;

    /* renamed from: j */
    public int f305782j;

    /* renamed from: n */
    public C103549l0 f305783n;

    /* renamed from: o */
    public boolean f305784o;

    /* renamed from: androidx.appcompat.widget.k0$a */
    public class C103545a implements Runnable {
        public C103545a() {
        }

        public void run() {
            C103544k0.this.mo144388c(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$b */
    public class C103546b implements Runnable {
        public C103546b() {
        }

        public void run() {
            C103544k0.this.mo144387a();
        }
    }

    public C103544k0(View view, CharSequence charSequence) {
        this.f305776d = view;
        this.f305777e = charSequence;
        this.f305778f = C107222v.m145284c(ViewConfiguration.get(view.getContext()));
        this.f305781i = Integer.MAX_VALUE;
        this.f305782j = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m137615b(C103544k0 k0Var) {
        C103544k0 k0Var2 = f305774p;
        if (k0Var2 != null) {
            k0Var2.f305776d.removeCallbacks(k0Var2.f305779g);
        }
        f305774p = k0Var;
        if (k0Var != null) {
            k0Var.f305776d.postDelayed(k0Var.f305779g, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public void mo144387a() {
        if (f305775q == this) {
            f305775q = null;
            C103549l0 l0Var = this.f305783n;
            if (l0Var != null) {
                if (l0Var.f305801b.getParent() != null) {
                    ((WindowManager) l0Var.f305800a.getSystemService("window")).removeView(l0Var.f305801b);
                }
                this.f305783n = null;
                this.f305781i = Integer.MAX_VALUE;
                this.f305782j = Integer.MAX_VALUE;
                this.f305776d.removeOnAttachStateChangeListener(this);
            }
        }
        if (f305774p == this) {
            m137615b((C103544k0) null);
        }
        this.f305776d.removeCallbacks(this.f305780h);
    }

    /* renamed from: c */
    public void mo144388c(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        View view = this.f305776d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(view)) {
            m137615b((C103544k0) null);
            C103544k0 k0Var = f305775q;
            if (k0Var != null) {
                k0Var.mo144387a();
            }
            f305775q = this;
            this.f305784o = z;
            C103549l0 l0Var = new C103549l0(this.f305776d.getContext());
            this.f305783n = l0Var;
            View view2 = this.f305776d;
            int i4 = this.f305781i;
            int i5 = this.f305782j;
            boolean z2 = this.f305784o;
            CharSequence charSequence = this.f305777e;
            if (l0Var.f305801b.getParent() != null) {
                if (l0Var.f305801b.getParent() != null) {
                    ((WindowManager) l0Var.f305800a.getSystemService("window")).removeView(l0Var.f305801b);
                }
            }
            l0Var.f305802c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = l0Var.f305803d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = l0Var.f305800a.getResources().getDimensionPixelOffset(C0966R.dimen.ar8);
            if (view2.getWidth() < dimensionPixelOffset) {
                i4 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = l0Var.f305800a.getResources().getDimensionPixelOffset(C0966R.dimen.ar7);
                i = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                i = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = l0Var.f305800a.getResources().getDimensionPixelOffset(z2 ? C0966R.dimen.ara : C0966R.dimen.ar_);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(l0Var.f305804e);
                Rect rect = l0Var.f305804e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = l0Var.f305800a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    l0Var.f305804e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(l0Var.f305806g);
                view2.getLocationOnScreen(l0Var.f305805f);
                int[] iArr = l0Var.f305805f;
                int i6 = iArr[0];
                int[] iArr2 = l0Var.f305806g;
                int i7 = i6 - iArr2[0];
                iArr[0] = i7;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i7 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                l0Var.f305801b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = l0Var.f305801b.getMeasuredHeight();
                int i8 = l0Var.f305805f[1];
                int i9 = ((i2 + i8) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i8 + i + dimensionPixelOffset3;
                if (z2) {
                    if (i9 >= 0) {
                        layoutParams.y = i9;
                    } else {
                        layoutParams.y = i15;
                    }
                } else if (measuredHeight + i15 <= l0Var.f305804e.height()) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i9;
                }
            }
            ((WindowManager) l0Var.f305800a.getSystemService("window")).addView(l0Var.f305801b, l0Var.f305803d);
            this.f305776d.addOnAttachStateChangeListener(this);
            if (this.f305784o) {
                j = 2500;
            } else {
                if ((C107207u.C107208b.m145179g(this.f305776d) & 1) == 1) {
                    j2 = 3000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i3);
            }
            this.f305776d.removeCallbacks(this.f305780h);
            this.f305776d.postDelayed(this.f305780h, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f305783n != null && this.f305784o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f305776d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f305781i = Integer.MAX_VALUE;
                this.f305782j = Integer.MAX_VALUE;
                mo144387a();
            }
        } else if (this.f305776d.isEnabled() && this.f305783n == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f305781i) > this.f305778f || Math.abs(y - this.f305782j) > this.f305778f) {
                this.f305781i = x;
                this.f305782j = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m137615b(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f305781i = view.getWidth() / 2;
        this.f305782j = view.getHeight() / 2;
        mo144388c(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo144387a();
    }
}
