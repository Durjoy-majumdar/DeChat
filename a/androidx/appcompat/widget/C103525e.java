package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.widget.C92046c;
import p1115h.C107922a;
import p1162x2.C112019a;
import p433g.C107593a;

/* renamed from: androidx.appcompat.widget.e */
public class C103525e {

    /* renamed from: a */
    public final CompoundButton f305714a;

    /* renamed from: b */
    public ColorStateList f305715b = null;

    /* renamed from: c */
    public PorterDuff.Mode f305716c = null;

    /* renamed from: d */
    public boolean f305717d = false;

    /* renamed from: e */
    public boolean f305718e = false;

    /* renamed from: f */
    public boolean f305719f;

    public C103525e(CompoundButton compoundButton) {
        this.f305714a = compoundButton;
    }

    /* renamed from: a */
    public void mo144321a() {
        Drawable a = C92046c.m115680a(this.f305714a);
        if (a == null) {
            return;
        }
        if (this.f305717d || this.f305718e) {
            Drawable mutate = C112019a.m152749g(a).mutate();
            if (this.f305717d) {
                mutate.setTintList(this.f305715b);
            }
            if (this.f305718e) {
                mutate.setTintMode(this.f305716c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f305714a.getDrawableState());
            }
            this.f305714a.setButtonDrawable(mutate);
        }
    }

    /* renamed from: b */
    public void mo144322b(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f305714a.getContext().obtainStyledAttributes(attributeSet, C107593a.f321916p, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                CompoundButton compoundButton = this.f305714a;
                compoundButton.setButtonDrawable(C107922a.m146228b(compoundButton.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f305714a.setButtonTintList(obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.f305714a.setButtonTintMode(C103556p.m137674d(obtainStyledAttributes.getInt(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
