package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p161h8.C108164a;
import p161h8.C108165b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.google.android.material.textfield.b */
public final class C104482b {

    /* renamed from: a */
    public final Context f309616a;

    /* renamed from: b */
    public final TextInputLayout f309617b;

    /* renamed from: c */
    public LinearLayout f309618c;

    /* renamed from: d */
    public int f309619d;

    /* renamed from: e */
    public FrameLayout f309620e;

    /* renamed from: f */
    public int f309621f;

    /* renamed from: g */
    public Animator f309622g;

    /* renamed from: h */
    public final float f309623h;

    /* renamed from: i */
    public int f309624i;

    /* renamed from: j */
    public int f309625j;

    /* renamed from: k */
    public CharSequence f309626k;

    /* renamed from: l */
    public boolean f309627l;

    /* renamed from: m */
    public TextView f309628m;

    /* renamed from: n */
    public int f309629n;

    /* renamed from: o */
    public CharSequence f309630o;

    /* renamed from: p */
    public boolean f309631p;

    /* renamed from: q */
    public TextView f309632q;

    /* renamed from: r */
    public int f309633r;

    /* renamed from: s */
    public Typeface f309634s;

    /* renamed from: com.google.android.material.textfield.b$a */
    public class C104483a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ int f309635d;

        /* renamed from: e */
        public final /* synthetic */ TextView f309636e;

        /* renamed from: f */
        public final /* synthetic */ int f309637f;

        /* renamed from: g */
        public final /* synthetic */ TextView f309638g;

        public C104483a(int i, TextView textView, int i2, TextView textView2) {
            this.f309635d = i;
            this.f309636e = textView;
            this.f309637f = i2;
            this.f309638g = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C104482b bVar = C104482b.this;
            bVar.f309624i = this.f309635d;
            bVar.f309622g = null;
            TextView textView2 = this.f309636e;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f309637f == 1 && (textView = C104482b.this.f309628m) != null) {
                    textView.setText((CharSequence) null);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f309638g;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C104482b(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f309616a = context;
        this.f309617b = textInputLayout;
        this.f309623h = (float) context.getResources().getDimensionPixelSize(C0966R.dimen.a1d);
    }

    /* renamed from: a */
    public void mo147053a(TextView textView, int i) {
        if (this.f309618c == null && this.f309620e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f309616a);
            this.f309618c = linearLayout;
            linearLayout.setOrientation(0);
            this.f309617b.addView(this.f309618c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f309616a);
            this.f309620e = frameLayout;
            this.f309618c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f309618c.addView(new Space(this.f309616a, (AttributeSet) null), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f309617b.getEditText() != null) {
                mo147054b();
            }
        }
        if (i == 0 || i == 1) {
            this.f309620e.setVisibility(0);
            this.f309620e.addView(textView);
            this.f309621f++;
        } else {
            this.f309618c.addView(textView, i);
        }
        this.f309618c.setVisibility(0);
        this.f309619d++;
    }

    /* renamed from: b */
    public void mo147054b() {
        if ((this.f309618c == null || this.f309617b.getEditText() == null) ? false : true) {
            LinearLayout linearLayout = this.f309618c;
            EditText editText = this.f309617b.getEditText();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107209c.m145202k(linearLayout, C107207u.C107209c.m145197f(editText), 0, C107207u.C107209c.m145196e(this.f309617b.getEditText()), 0);
        }
    }

    /* renamed from: c */
    public void mo147055c() {
        Animator animator = this.f309622g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void mo147056d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C108164a.f323890a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f309623h, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C108164a.f323893d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo147057e() {
        return this.f309625j == 1 && this.f309628m != null && !TextUtils.isEmpty(this.f309626k);
    }

    /* renamed from: f */
    public final TextView mo147058f(int i) {
        if (i == 1) {
            return this.f309628m;
        }
        if (i != 2) {
            return null;
        }
        return this.f309632q;
    }

    /* renamed from: g */
    public void mo147059g() {
        this.f309626k = null;
        mo147055c();
        if (this.f309624i == 1) {
            if (!this.f309631p || TextUtils.isEmpty(this.f309630o)) {
                this.f309625j = 0;
            } else {
                this.f309625j = 2;
            }
        }
        mo147062j(this.f309624i, this.f309625j, mo147061i(this.f309628m, (CharSequence) null));
    }

    /* renamed from: h */
    public void mo147060h(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f309618c;
        if (linearLayout != null) {
            boolean z = true;
            if (!(i == 0 || i == 1)) {
                z = false;
            }
            if (!z || (frameLayout = this.f309620e) == null) {
                linearLayout.removeView(textView);
            } else {
                int i2 = this.f309621f - 1;
                this.f309621f = i2;
                if (i2 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.f309620e.removeView(textView);
            }
            int i3 = this.f309619d - 1;
            this.f309619d = i3;
            LinearLayout linearLayout2 = this.f309618c;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo147061i(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f309617b;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107211e.m145208c(textInputLayout) && this.f309617b.isEnabled() && (this.f309625j != this.f309624i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: j */
    public final void mo147062j(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f309622g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i5 = i;
            int i6 = i2;
            mo147056d(arrayList2, this.f309631p, this.f309632q, 2, i5, i6);
            mo147056d(arrayList2, this.f309627l, this.f309628m, 1, i5, i6);
            C108165b.m146494a(animatorSet, arrayList);
            animatorSet.addListener(new C104483a(i2, mo147058f(i), i, mo147058f(i4)));
            animatorSet.start();
        } else if (i3 != i4) {
            if (!(i4 == 0 || (f2 = mo147058f(i4)) == null)) {
                f2.setVisibility(0);
                f2.setAlpha(1.0f);
            }
            if (!(i3 == 0 || (f = mo147058f(i)) == null)) {
                f.setVisibility(4);
                if (i3 == 1) {
                    f.setText((CharSequence) null);
                }
            }
            this.f309624i = i4;
        }
        this.f309617b.mo147002l();
        this.f309617b.mo147004n(z2, false);
        this.f309617b.mo147011q();
    }
}
