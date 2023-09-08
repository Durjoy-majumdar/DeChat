package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;
import p1162x2.C112019a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.widget.j */
public class C103541j extends C103538i {

    /* renamed from: d */
    public final SeekBar f305766d;

    /* renamed from: e */
    public Drawable f305767e;

    /* renamed from: f */
    public ColorStateList f305768f = null;

    /* renamed from: g */
    public PorterDuff.Mode f305769g = null;

    /* renamed from: h */
    public boolean f305770h = false;

    /* renamed from: i */
    public boolean f305771i = false;

    public C103541j(SeekBar seekBar) {
        super(seekBar);
        this.f305766d = seekBar;
    }

    /* renamed from: a */
    public void mo144349a(AttributeSet attributeSet, int i) {
        super.mo144349a(attributeSet, i);
        C103533f0 l = C103533f0.m137562l(this.f305766d.getContext(), attributeSet, C107593a.f321911k, i, 0);
        Drawable f = l.mo144337f(0);
        if (f != null) {
            this.f305766d.setThumb(f);
        }
        Drawable e = l.mo144336e(1);
        Drawable drawable = this.f305767e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f305767e = e;
        if (e != null) {
            e.setCallback(this.f305766d);
            SeekBar seekBar = this.f305766d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C112019a.m152745c(e, C107207u.C107209c.m145195d(seekBar));
            if (e.isStateful()) {
                e.setState(this.f305766d.getDrawableState());
            }
            mo144385c();
        }
        this.f305766d.invalidate();
        if (l.mo144342k(3)) {
            this.f305769g = C103556p.m137674d(l.mo144339h(3, -1), this.f305769g);
            this.f305771i = true;
        }
        if (l.mo144342k(2)) {
            this.f305768f = l.mo144333b(2);
            this.f305770h = true;
        }
        l.mo144343m();
        mo144385c();
    }

    /* renamed from: c */
    public final void mo144385c() {
        Drawable drawable = this.f305767e;
        if (drawable == null) {
            return;
        }
        if (this.f305770h || this.f305771i) {
            Drawable g = C112019a.m152749g(drawable.mutate());
            this.f305767e = g;
            if (this.f305770h) {
                g.setTintList(this.f305768f);
            }
            if (this.f305771i) {
                this.f305767e.setTintMode(this.f305769g);
            }
            if (this.f305767e.isStateful()) {
                this.f305767e.setState(this.f305766d.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public void mo144386d(Canvas canvas) {
        if (this.f305767e != null) {
            int max = this.f305766d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f305767e.getIntrinsicWidth();
                int intrinsicHeight = this.f305767e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f305767e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f305766d.getWidth() - this.f305766d.getPaddingLeft()) - this.f305766d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f305766d.getPaddingLeft(), (float) (this.f305766d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f305767e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
