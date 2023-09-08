package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1115h.C107922a;
import p1122i8.C108397b;
import p1139o8.C109991k;
import p1139o8.C109992l;
import p1145q8.C110368a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class MaterialButton extends AppCompatButton {

    /* renamed from: f */
    public final C108397b f309256f;

    /* renamed from: g */
    public int f309257g;

    /* renamed from: h */
    public PorterDuff.Mode f309258h;

    /* renamed from: i */
    public ColorStateList f309259i;

    /* renamed from: j */
    public Drawable f309260j;

    /* renamed from: n */
    public int f309261n;

    /* renamed from: o */
    public int f309262o;

    /* renamed from: p */
    public int f309263p;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2891w_);
    }

    /* renamed from: a */
    public final boolean mo146403a() {
        C108397b bVar = this.f309256f;
        return bVar != null && !bVar.f324588p;
    }

    /* renamed from: b */
    public final void mo146404b() {
        Drawable drawable = this.f309260j;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f309260j = mutate;
            mutate.setTintList(this.f309259i);
            PorterDuff.Mode mode = this.f309258h;
            if (mode != null) {
                this.f309260j.setTintMode(mode);
            }
            int i = this.f309261n;
            if (i == 0) {
                i = this.f309260j.getIntrinsicWidth();
            }
            int i2 = this.f309261n;
            if (i2 == 0) {
                i2 = this.f309260j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f309260j;
            int i3 = this.f309262o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        setCompoundDrawablesRelative(this.f309260j, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo146403a()) {
            return this.f309256f.f324578f;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f309260j;
    }

    public int getIconGravity() {
        return this.f309263p;
    }

    public int getIconPadding() {
        return this.f309257g;
    }

    public int getIconSize() {
        return this.f309261n;
    }

    public ColorStateList getIconTint() {
        return this.f309259i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f309258h;
    }

    public ColorStateList getRippleColor() {
        if (mo146403a()) {
            return this.f309256f.f324583k;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (mo146403a()) {
            return this.f309256f.f324582j;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo146403a()) {
            return this.f309256f.f324579g;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return mo146403a() ? this.f309256f.f324581i : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return mo146403a() ? this.f309256f.f324580h : super.getSupportBackgroundTintMode();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C108397b bVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (bVar = this.f309256f) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            GradientDrawable gradientDrawable = bVar.f324587o;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(bVar.f324574b, bVar.f324576d, i6 - bVar.f324575c, i5 - bVar.f324577e);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f309260j != null && this.f309263p == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f309261n;
            if (i3 == 0) {
                i3 = this.f309260j.getIntrinsicWidth();
            }
            int measuredWidth = getMeasuredWidth() - measureText;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            int e = ((((measuredWidth - C107207u.C107209c.m145196e(this)) - i3) - this.f309257g) - C107207u.C107209c.m145197f(this)) / 2;
            boolean z = true;
            if (C107207u.C107209c.m145195d(this) != 1) {
                z = false;
            }
            if (z) {
                e = -e;
            }
            if (this.f309262o != e) {
                this.f309262o = e;
                mo146404b();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo146403a()) {
            GradientDrawable gradientDrawable = this.f309256f.f324585m;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!mo146403a()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            C108397b bVar = this.f309256f;
            bVar.f324588p = true;
            bVar.f324573a.setSupportBackgroundTintList(bVar.f324581i);
            bVar.f324573a.setSupportBackgroundTintMode(bVar.f324580h);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C107922a.m146228b(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCornerRadius(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.mo146403a()
            if (r0 == 0) goto L_0x0086
            i8.b r0 = r6.f309256f
            int r1 = r0.f324578f
            if (r1 == r7) goto L_0x0086
            r0.f324578f = r7
            android.graphics.drawable.GradientDrawable r1 = r0.f324585m
            if (r1 == 0) goto L_0x0086
            android.graphics.drawable.GradientDrawable r1 = r0.f324586n
            if (r1 == 0) goto L_0x0086
            android.graphics.drawable.GradientDrawable r1 = r0.f324587o
            if (r1 == 0) goto L_0x0086
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r1 != r2) goto L_0x0075
            com.google.android.material.button.MaterialButton r1 = r0.f324573a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0048
            com.google.android.material.button.MaterialButton r1 = r0.f324573a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.RippleDrawable r1 = (android.graphics.drawable.RippleDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            android.graphics.drawable.InsetDrawable r1 = (android.graphics.drawable.InsetDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            goto L_0x0049
        L_0x0048:
            r1 = r4
        L_0x0049:
            float r5 = (float) r7
            float r5 = r5 + r3
            r1.setCornerRadius(r5)
            com.google.android.material.button.MaterialButton r1 = r0.f324573a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x0072
            com.google.android.material.button.MaterialButton r1 = r0.f324573a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.RippleDrawable r1 = (android.graphics.drawable.RippleDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            android.graphics.drawable.InsetDrawable r1 = (android.graphics.drawable.InsetDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            r2 = 1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r4 = r1
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
        L_0x0072:
            r4.setCornerRadius(r5)
        L_0x0075:
            android.graphics.drawable.GradientDrawable r1 = r0.f324585m
            float r7 = (float) r7
            float r7 = r7 + r3
            r1.setCornerRadius(r7)
            android.graphics.drawable.GradientDrawable r1 = r0.f324586n
            r1.setCornerRadius(r7)
            android.graphics.drawable.GradientDrawable r0 = r0.f324587o
            r0.setCornerRadius(r7)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.setCornerRadius(int):void");
    }

    public void setCornerRadiusResource(int i) {
        if (mo146403a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f309260j != drawable) {
            this.f309260j = drawable;
            mo146404b();
        }
    }

    public void setIconGravity(int i) {
        this.f309263p = i;
    }

    public void setIconPadding(int i) {
        if (this.f309257g != i) {
            this.f309257g = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C107922a.m146228b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f309261n != i) {
            this.f309261n = i;
            mo146404b();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f309259i != colorStateList) {
            this.f309259i = colorStateList;
            mo146404b();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f309258h != mode) {
            this.f309258h = mode;
            mo146404b();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C107922a.m146227a(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo146403a()) {
            C108397b bVar = this.f309256f;
            if (bVar.f324583k != colorStateList) {
                bVar.f324583k = colorStateList;
                if (bVar.f324573a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) bVar.f324573a.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (mo146403a()) {
            setRippleColor(C107922a.m146227a(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo146403a()) {
            C108397b bVar = this.f309256f;
            if (bVar.f324582j != colorStateList) {
                bVar.f324582j = colorStateList;
                Paint paint = bVar.f324584l;
                int i = 0;
                if (colorStateList != null) {
                    i = colorStateList.getColorForState(bVar.f324573a.getDrawableState(), 0);
                }
                paint.setColor(i);
                if (bVar.f324586n != null) {
                    bVar.f324573a.setInternalBackground(bVar.mo158931a());
                }
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo146403a()) {
            setStrokeColor(C107922a.m146227a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo146403a()) {
            C108397b bVar = this.f309256f;
            if (bVar.f324579g != i) {
                bVar.f324579g = i;
                bVar.f324584l.setStrokeWidth((float) i);
                if (bVar.f324586n != null) {
                    bVar.f324573a.setInternalBackground(bVar.mo158931a());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo146403a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo146403a()) {
            C108397b bVar = this.f309256f;
            if (bVar.f324581i != colorStateList) {
                bVar.f324581i = colorStateList;
                bVar.mo158932b();
            }
        } else if (this.f309256f != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (mo146403a()) {
            C108397b bVar = this.f309256f;
            if (bVar.f324580h != mode) {
                bVar.f324580h = mode;
                bVar.mo158932b();
            }
        } else if (this.f309256f != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322514n, i, C0966R.style.a3v, new int[0]);
        this.f309257g = d.getDimensionPixelSize(9, 0);
        this.f309258h = C109992l.m149512a(d.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.f309259i = C110368a.m150198a(getContext(), d, 11);
        this.f309260j = C110368a.m150199b(getContext(), d, 7);
        this.f309263p = d.getInteger(8, 1);
        this.f309261n = d.getDimensionPixelSize(10, 0);
        C108397b bVar = new C108397b(this);
        this.f309256f = bVar;
        bVar.f324574b = d.getDimensionPixelOffset(0, 0);
        bVar.f324575c = d.getDimensionPixelOffset(1, 0);
        bVar.f324576d = d.getDimensionPixelOffset(2, 0);
        bVar.f324577e = d.getDimensionPixelOffset(3, 0);
        bVar.f324578f = d.getDimensionPixelSize(6, 0);
        bVar.f324579g = d.getDimensionPixelSize(15, 0);
        bVar.f324580h = C109992l.m149512a(d.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        bVar.f324581i = C110368a.m150198a(bVar.f324573a.getContext(), d, 4);
        bVar.f324582j = C110368a.m150198a(bVar.f324573a.getContext(), d, 14);
        bVar.f324583k = C110368a.m150198a(bVar.f324573a.getContext(), d, 13);
        bVar.f324584l.setStyle(Paint.Style.STROKE);
        bVar.f324584l.setStrokeWidth((float) bVar.f324579g);
        Paint paint = bVar.f324584l;
        ColorStateList colorStateList = bVar.f324582j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(bVar.f324573a.getDrawableState(), 0) : i2);
        MaterialButton materialButton = bVar.f324573a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int f = C107207u.C107209c.m145197f(materialButton);
        int paddingTop = bVar.f324573a.getPaddingTop();
        int e = C107207u.C107209c.m145196e(bVar.f324573a);
        int paddingBottom = bVar.f324573a.getPaddingBottom();
        bVar.f324573a.setInternalBackground(bVar.mo158931a());
        C107207u.C107209c.m145202k(bVar.f324573a, f + bVar.f324574b, paddingTop + bVar.f324576d, e + bVar.f324575c, paddingBottom + bVar.f324577e);
        d.recycle();
        setCompoundDrawablePadding(this.f309257g);
        mo146404b();
    }
}
