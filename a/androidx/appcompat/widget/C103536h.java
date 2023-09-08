package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p1115h.C107922a;
import p433g.C107593a;

/* renamed from: androidx.appcompat.widget.h */
public class C103536h {

    /* renamed from: a */
    public final ImageView f305739a;

    /* renamed from: b */
    public C103524d0 f305740b;

    /* renamed from: c */
    public C103524d0 f305741c;

    public C103536h(ImageView imageView) {
        this.f305739a = imageView;
    }

    /* renamed from: a */
    public void mo144345a() {
        Drawable drawable = this.f305739a.getDrawable();
        if (drawable != null) {
            C103556p.m137672b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f305741c == null) {
                    this.f305741c = new C103524d0();
                }
                C103524d0 d0Var = this.f305741c;
                d0Var.f305710a = null;
                d0Var.f305713d = false;
                d0Var.f305711b = null;
                d0Var.f305712c = false;
                ColorStateList imageTintList = this.f305739a.getImageTintList();
                if (imageTintList != null) {
                    d0Var.f305713d = true;
                    d0Var.f305710a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.f305739a.getImageTintMode();
                if (imageTintMode != null) {
                    d0Var.f305712c = true;
                    d0Var.f305711b = imageTintMode;
                }
                if (d0Var.f305713d || d0Var.f305712c) {
                    C103527f.m137548m(drawable, d0Var, this.f305739a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C103524d0 d0Var2 = this.f305740b;
            if (d0Var2 != null) {
                C103527f.m137548m(drawable, d0Var2, this.f305739a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public void mo144346b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int i2;
        C103533f0 l = C103533f0.m137562l(this.f305739a.getContext(), attributeSet, C107593a.f321910j, i, 0);
        try {
            Drawable drawable3 = this.f305739a.getDrawable();
            if (!(drawable3 != null || (i2 = l.mo144340i(1, -1)) == -1 || (drawable3 = C107922a.m146228b(this.f305739a.getContext(), i2)) == null)) {
                this.f305739a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C103556p.m137672b(drawable3);
            }
            if (l.mo144342k(2)) {
                ImageView imageView = this.f305739a;
                ColorStateList b = l.mo144333b(2);
                int i3 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(b);
                if (!(i3 != 21 || (drawable2 = imageView.getDrawable()) == null || imageView.getImageTintList() == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (l.mo144342k(3)) {
                ImageView imageView2 = this.f305739a;
                PorterDuff.Mode d = C103556p.m137674d(l.mo144339h(3, -1), (PorterDuff.Mode) null);
                int i4 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(d);
                if (!(i4 != 21 || (drawable = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            l.mo144343m();
        }
    }

    /* renamed from: c */
    public void mo144347c(int i) {
        if (i != 0) {
            Drawable b = C107922a.m146228b(this.f305739a.getContext(), i);
            if (b != null) {
                C103556p.m137672b(b);
            }
            this.f305739a.setImageDrawable(b);
        } else {
            this.f305739a.setImageDrawable((Drawable) null);
        }
        mo144345a();
    }
}
