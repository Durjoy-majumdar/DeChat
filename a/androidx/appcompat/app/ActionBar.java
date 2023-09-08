package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p433g.C107593a;
import p990k.C108781a;

public abstract class ActionBar {

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class C0110b {
        /* renamed from: a */
        public abstract void mo89a();
    }

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C67075a {
        /* renamed from: a */
        void mo91116a(boolean z);
    }

    /* renamed from: A */
    public void mo91083A(boolean z) {
    }

    /* renamed from: B */
    public abstract void mo91084B(boolean z);

    /* renamed from: C */
    public abstract void mo91085C(int i);

    /* renamed from: D */
    public abstract void mo91086D(boolean z);

    /* renamed from: E */
    public abstract void mo91087E(boolean z);

    /* renamed from: F */
    public abstract void mo91088F(boolean z);

    /* renamed from: G */
    public void mo91089G(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: H */
    public abstract void mo91090H(int i);

    /* renamed from: I */
    public abstract void mo91091I(Drawable drawable);

    /* renamed from: J */
    public void mo91092J(boolean z) {
    }

    /* renamed from: K */
    public void mo91093K(CharSequence charSequence) {
    }

    /* renamed from: L */
    public abstract void mo91094L();

    /* renamed from: M */
    public C108781a mo91095M(C108781a.C108782a aVar) {
        return null;
    }

    /* renamed from: g */
    public boolean mo91096g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo91097h() {
        return false;
    }

    /* renamed from: i */
    public void mo91098i(boolean z) {
    }

    /* renamed from: j */
    public abstract View mo91099j();

    /* renamed from: k */
    public abstract int mo91100k();

    /* renamed from: l */
    public abstract int mo91101l();

    /* renamed from: m */
    public Context mo91102m() {
        return null;
    }

    /* renamed from: n */
    public abstract CharSequence mo91103n();

    /* renamed from: o */
    public abstract void mo91104o();

    /* renamed from: p */
    public boolean mo91105p() {
        return false;
    }

    /* renamed from: q */
    public abstract boolean mo91106q();

    /* renamed from: r */
    public void mo91107r(Configuration configuration) {
    }

    /* renamed from: s */
    public void mo91108s() {
    }

    /* renamed from: t */
    public boolean mo91109t(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: u */
    public boolean mo91110u(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: v */
    public boolean mo91111v() {
        return false;
    }

    /* renamed from: w */
    public abstract void mo91112w(Drawable drawable);

    /* renamed from: x */
    public abstract void mo91113x(int i);

    /* renamed from: y */
    public abstract void mo91114y(View view);

    /* renamed from: z */
    public abstract void mo91115z(View view, LayoutParams layoutParams);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f192646a = 8388627;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321902b);
            this.f192646a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f192646a = layoutParams.f192646a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
