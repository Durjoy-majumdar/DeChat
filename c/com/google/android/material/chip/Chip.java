package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C104438a;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import p1050v2.C111325g;
import p1108f3.C107453d;
import p1115h.C107922a;
import p1145q8.C110370c;
import p1148r8.C110504a;
import p1162x2.C112019a;
import p1162x2.C112023e;
import p161h8.C108168h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p874c3.C104279a;
import p905j3.C108539a;

public class Chip extends AppCompatCheckBox implements C104438a.C104440b {

    /* renamed from: u */
    public static final Rect f309265u = new Rect();

    /* renamed from: v */
    public static final int[] f309266v = {16842913};

    /* renamed from: e */
    public C104438a f309267e;

    /* renamed from: f */
    public RippleDrawable f309268f;

    /* renamed from: g */
    public View.OnClickListener f309269g;

    /* renamed from: h */
    public CompoundButton.OnCheckedChangeListener f309270h;

    /* renamed from: i */
    public boolean f309271i;

    /* renamed from: j */
    public int f309272j;

    /* renamed from: n */
    public boolean f309273n;

    /* renamed from: o */
    public boolean f309274o;

    /* renamed from: p */
    public boolean f309275p;

    /* renamed from: q */
    public final C104433b f309276q;

    /* renamed from: r */
    public final Rect f309277r;

    /* renamed from: s */
    public final RectF f309278s;

    /* renamed from: t */
    public final C111325g.C111328d f309279t;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C104432a extends C111325g.C111328d {
        public C104432a() {
        }

        /* renamed from: c */
        public void mo144403c(int i) {
        }

        /* renamed from: d */
        public void mo144404d(Typeface typeface) {
            Chip chip = Chip.this;
            chip.setText(chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C104433b extends C108539a {
        public C104433b(Chip chip) {
            super(chip);
        }

        public int getVirtualViewAt(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.f309265u;
            return (!chip.mo146445d() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? -1 : 0;
        }

        public void getVisibleVirtualViews(List<Integer> list) {
            Chip chip = Chip.this;
            Rect rect = Chip.f309265u;
            if (chip.mo146445d()) {
                list.add(0);
            }
        }

        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return Chip.this.mo146450f();
            }
            return false;
        }

        public void onPopulateNodeForHost(C107453d dVar) {
            C104438a aVar = Chip.this.f309267e;
            dVar.mo157851k(aVar != null && aVar.f309350z);
            dVar.mo157852l(Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                dVar.mo157866y(text);
            } else {
                dVar.mo157854n(text);
            }
        }

        public void onPopulateNodeForVirtualView(int i, C107453d dVar) {
            Chip chip = Chip.this;
            Rect rect = Chip.f309265u;
            CharSequence charSequence = "";
            if (chip.mo146445d()) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.mo157854n(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    dVar.mo157854n(context.getString(C0966R.string.gxl, objArr).trim());
                }
                dVar.mo157849i(Chip.this.getCloseIconTouchBoundsInt());
                dVar.mo157840b(C107453d.C107454a.f321478e);
                dVar.mo157855o(Chip.this.isEnabled());
                return;
            }
            dVar.mo157854n(charSequence);
            dVar.mo157849i(Chip.f309265u);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2717f6);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f309278s.setEmpty();
        if (mo146445d()) {
            C104438a aVar = this.f309267e;
            RectF rectF = this.f309278s;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.mo146618D()) {
                float f = aVar.f309304L + aVar.f309303K + aVar.f309346x + aVar.f309302J + aVar.f309301I;
                if (C112019a.m152744b(aVar) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.f309278s;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f309277r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f309277r;
    }

    private C110370c getTextAppearance() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309336o;
        }
        return null;
    }

    private void setCloseIconFocused(boolean z) {
        if (this.f309275p != z) {
            this.f309275p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f309274o != z) {
            this.f309274o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f309273n != z) {
            this.f309273n = z;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i) {
        int i2 = this.f309272j;
        if (i2 != i) {
            if (i2 == 0) {
                setCloseIconFocused(false);
            }
            this.f309272j = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    /* renamed from: a */
    public void mo146444a() {
        mo146451g();
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: d */
    public final boolean mo146445d() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            Drawable drawable = aVar.f309344v;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof C112023e) {
                drawable = ((C112023e) drawable).mo163694b();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.Class<j3.a> r0 = p905j3.C108539a.class
            int r1 = r8.getAction()
            r2 = 10
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0043
            java.lang.String r1 = "mHoveredVirtualViewId"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r1.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r2 = r7.f309276q     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0043
            java.lang.String r1 = "updateHoveredVirtualView"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r5[r4] = r6     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            com.google.android.material.chip.Chip$b r1 = r7.f309276q     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r5[r4] = r2     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0.invoke(r1, r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0043 }
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x0056
            com.google.android.material.chip.Chip$b r0 = r7.f309276q
            boolean r0 = r0.dispatchHoverEvent(r8)
            if (r0 != 0) goto L_0x0056
            boolean r8 = super.dispatchHoverEvent(r8)
            if (r8 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f309276q.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C104438a aVar = this.f309267e;
        boolean z = false;
        if (aVar != null && C104438a.m139569f(aVar.f309344v)) {
            C104438a aVar2 = this.f309267e;
            int isEnabled = isEnabled();
            if (this.f309275p) {
                isEnabled++;
            }
            if (this.f309274o) {
                isEnabled++;
            }
            if (this.f309273n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f309275p) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f309274o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f309273n) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.f309311R0, iArr)) {
                aVar2.f309311R0 = iArr;
                if (aVar2.mo146618D()) {
                    z = aVar2.mo146633h(aVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean mo146449e(boolean z) {
        if (this.f309272j == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
        if (z) {
            if (this.f309272j == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.f309272j == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo146450f() {
        boolean z;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f309269g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.f309276q.sendEventForVirtualView(0, 1);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (isChecked() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0 = r5.f309267e;
        r1 = r1 + ((r0.f309298F + r0.f309299G) + r0.f309342t);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo146451g() {
        /*
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008b
            com.google.android.material.chip.a r0 = r5.f309267e
            if (r0 != 0) goto L_0x0010
            goto L_0x008b
        L_0x0010:
            float r1 = r0.f309297E
            float r2 = r0.f309304L
            float r1 = r1 + r2
            float r2 = r0.f309300H
            float r1 = r1 + r2
            float r2 = r0.f309301I
            float r1 = r1 + r2
            boolean r2 = r0.f309339q
            r3 = 0
            if (r2 == 0) goto L_0x0032
            android.graphics.drawable.Drawable r0 = r0.f309340r
            if (r0 == 0) goto L_0x002f
            boolean r2 = r0 instanceof p1162x2.C112023e
            if (r2 == 0) goto L_0x0030
            x2.e r0 = (p1162x2.C112023e) r0
            android.graphics.drawable.Drawable r0 = r0.mo163694b()
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 != 0) goto L_0x0042
        L_0x0032:
            com.google.android.material.chip.a r0 = r5.f309267e
            android.graphics.drawable.Drawable r2 = r0.f309294B
            if (r2 == 0) goto L_0x004d
            boolean r0 = r0.f309293A
            if (r0 == 0) goto L_0x004d
            boolean r0 = r5.isChecked()
            if (r0 == 0) goto L_0x004d
        L_0x0042:
            com.google.android.material.chip.a r0 = r5.f309267e
            float r2 = r0.f309298F
            float r4 = r0.f309299G
            float r2 = r2 + r4
            float r0 = r0.f309342t
            float r2 = r2 + r0
            float r1 = r1 + r2
        L_0x004d:
            com.google.android.material.chip.a r0 = r5.f309267e
            boolean r2 = r0.f309343u
            if (r2 == 0) goto L_0x0070
            android.graphics.drawable.Drawable r0 = r0.f309344v
            if (r0 == 0) goto L_0x0063
            boolean r2 = r0 instanceof p1162x2.C112023e
            if (r2 == 0) goto L_0x0062
            x2.e r0 = (p1162x2.C112023e) r0
            android.graphics.drawable.Drawable r3 = r0.mo163694b()
            goto L_0x0063
        L_0x0062:
            r3 = r0
        L_0x0063:
            if (r3 == 0) goto L_0x0070
            com.google.android.material.chip.a r0 = r5.f309267e
            float r2 = r0.f309302J
            float r3 = r0.f309303K
            float r2 = r2 + r3
            float r0 = r0.f309346x
            float r2 = r2 + r0
            float r1 = r1 + r2
        L_0x0070:
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            int r0 = p849e3.C107207u.C107209c.m145196e(r5)
            float r0 = (float) r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            int r0 = p849e3.C107207u.C107209c.m145197f(r5)
            int r2 = r5.getPaddingTop()
            int r1 = (int) r1
            int r3 = r5.getPaddingBottom()
            p849e3.C107207u.C107209c.m145202k(r5, r0, r2, r1, r3)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo146451g():void");
    }

    public Drawable getCheckedIcon() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309294B;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309328d;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309330f;
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f309267e;
    }

    public float getChipEndPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309304L;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C104438a aVar = this.f309267e;
        if (aVar == null || (drawable = aVar.f309340r) == null) {
            return null;
        }
        if (drawable instanceof C112023e) {
            drawable = ((C112023e) drawable).mo163694b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309342t;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309341s;
        }
        return null;
    }

    public float getChipMinHeight() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309329e;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309297E;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309331g;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309332h;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C104438a aVar = this.f309267e;
        if (aVar == null || (drawable = aVar.f309344v) == null) {
            return null;
        }
        if (drawable instanceof C112023e) {
            drawable = ((C112023e) drawable).mo163694b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309348y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309303K;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309346x;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309302J;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309345w;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309323X0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f309272j == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C108168h getHideMotionSpec() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309296D;
        }
        return null;
    }

    public float getIconEndPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309299G;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309298F;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309333i;
        }
        return null;
    }

    public C108168h getShowMotionSpec() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309295C;
        }
        return null;
    }

    public CharSequence getText() {
        C104438a aVar = this.f309267e;
        return aVar != null ? aVar.f309334j : "";
    }

    public float getTextEndPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309301I;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            return aVar.f309300H;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void mo146481h(C110370c cVar) {
        TextPaint paint = getPaint();
        paint.drawableState = this.f309267e.getState();
        cVar.mo161878b(getContext(), paint, this.f309279t);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f309266v);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        C104438a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f309267e) == null || aVar.f309325Y0) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        float chipStartPadding = getChipStartPadding() + this.f309267e.mo146622c() + getTextStartPadding();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107209c.m145195d(this) != 0) {
            chipStartPadding = -chipStartPadding;
        }
        canvas.translate(chipStartPadding, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        this.f309276q.onFocusChanged(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 61
            if (r0 == r3) goto L_0x004d
            r3 = 66
            if (r0 == r3) goto L_0x003d
            switch(r0) {
                case 21: goto L_0x0029;
                case 22: goto L_0x0013;
                case 23: goto L_0x003d;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0079
        L_0x0013:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0079
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            int r0 = p849e3.C107207u.C107209c.m145195d(r6)
            if (r0 != r1) goto L_0x0022
            r2 = 1
        L_0x0022:
            r0 = r2 ^ 1
            boolean r2 = r6.mo146449e(r0)
            goto L_0x0079
        L_0x0029:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0079
            java.util.WeakHashMap<android.view.View, e3.a0> r0 = p849e3.C107207u.f320808a
            int r0 = p849e3.C107207u.C107209c.m145195d(r6)
            if (r0 != r1) goto L_0x0038
            r2 = 1
        L_0x0038:
            boolean r2 = r6.mo146449e(r2)
            goto L_0x0079
        L_0x003d:
            int r0 = r6.f309272j
            r3 = -1
            if (r0 == r3) goto L_0x0049
            if (r0 == 0) goto L_0x0045
            goto L_0x0079
        L_0x0045:
            r6.mo146450f()
            return r1
        L_0x0049:
            r6.performClick()
            return r1
        L_0x004d:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0055
            r0 = 2
            goto L_0x005e
        L_0x0055:
            boolean r0 = r8.hasModifiers(r1)
            if (r0 == 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0079
            android.view.ViewParent r3 = r6.getParent()
            r4 = r6
        L_0x0065:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0073
            if (r4 == r6) goto L_0x0073
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r3) goto L_0x0065
        L_0x0073:
            if (r4 == 0) goto L_0x0079
            r4.requestFocus()
            return r1
        L_0x0079:
            if (r2 == 0) goto L_0x007f
            r6.invalidate()
            return r1
        L_0x007f:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f309273n
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f309273n
            if (r0 == 0) goto L_0x0034
            r5.mo146450f()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.f309267e || drawable == this.f309268f) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.f309267e || drawable == this.f309268f) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146634i(z);
        }
    }

    public void setCheckableResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146634i(aVar.f309305M.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C104438a aVar = this.f309267e;
        if (aVar == null) {
            this.f309271i = z;
        } else if (aVar.f309350z) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f309270h) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146637j(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146637j(C107922a.m146228b(aVar.f309305M, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146638k(aVar.f309305M.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309328d != colorStateList) {
            aVar.f309328d = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList a;
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309328d != (a = C107922a.m146227a(aVar.f309305M, i))) {
            aVar.f309328d = a;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipCornerRadius(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309330f != f) {
            aVar.f309330f = f;
            aVar.invalidateSelf();
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309330f != dimension) {
                aVar.f309330f = dimension;
                aVar.invalidateSelf();
            }
        }
    }

    public void setChipDrawable(C104438a aVar) {
        C104438a aVar2 = this.f309267e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f309317U0 = new WeakReference<>((Object) null);
            }
            this.f309267e = aVar;
            aVar.getClass();
            aVar.f309317U0 = new WeakReference<>(this);
            this.f309268f = new RippleDrawable(C110504a.m150442a(this.f309267e.f309333i), this.f309267e, (Drawable) null);
            C104438a aVar3 = this.f309267e;
            if (aVar3.f309313S0) {
                aVar3.f309313S0 = false;
                aVar3.f309315T0 = null;
                aVar3.onStateChange(aVar3.getState());
            }
            RippleDrawable rippleDrawable = this.f309268f;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145189q(this, rippleDrawable);
        }
    }

    public void setChipEndPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309304L != f) {
            aVar.f309304L = f;
            aVar.invalidateSelf();
            aVar.mo146626g();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309304L != dimension) {
                aVar.f309304L = dimension;
                aVar.invalidateSelf();
                aVar.mo146626g();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146639l(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146639l(C107922a.m146228b(aVar.f309305M, i));
        }
    }

    public void setChipIconSize(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146640m(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146640m(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146641n(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146641n(C107922a.m146227a(aVar.f309305M, i));
        }
    }

    public void setChipIconVisible(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146642o(aVar.f309305M.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309329e != f) {
            aVar.f309329e = f;
            aVar.invalidateSelf();
            aVar.mo146626g();
        }
    }

    public void setChipMinHeightResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309329e != dimension) {
                aVar.f309329e = dimension;
                aVar.invalidateSelf();
                aVar.mo146626g();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309297E != f) {
            aVar.f309297E = f;
            aVar.invalidateSelf();
            aVar.mo146626g();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309297E != dimension) {
                aVar.f309297E = dimension;
                aVar.invalidateSelf();
                aVar.mo146626g();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309331g != colorStateList) {
            aVar.f309331g = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipStrokeColorResource(int i) {
        ColorStateList a;
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309331g != (a = C107922a.m146227a(aVar.f309305M, i))) {
            aVar.f309331g = a;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipStrokeWidth(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146646p(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146646p(aVar.f309305M.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146647q(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309348y != charSequence) {
            aVar.f309348y = C104279a.m139188c().mo145942d(charSequence);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146648r(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146648r(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146647q(C107922a.m146228b(aVar.f309305M, i));
        }
    }

    public void setCloseIconSize(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146649s(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146649s(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146656t(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146656t(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146657u(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146657u(C107922a.m146227a(aVar.f309305M, i));
        }
    }

    public void setCloseIconVisible(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146659v(aVar.f309305M.getResources().getBoolean(i));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f309267e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C104438a aVar = this.f309267e;
                if (aVar != null) {
                    aVar.f309323X0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C108168h hVar) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.f309296D = hVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.f309296D = C108168h.m146496b(aVar.f309305M, i);
        }
    }

    public void setIconEndPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146660w(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146660w(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146661x(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146661x(aVar.f309305M.getResources().getDimension(i));
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.f309327Z0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f309270h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f309269g = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146662y(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146662y(C107922a.m146227a(aVar.f309305M, i));
        }
    }

    public void setShowMotionSpec(C108168h hVar) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.f309295C = hVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.f309295C = C108168h.m146496b(aVar.f309305M, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f309267e != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence d = C104279a.m139188c().mo145942d(charSequence);
            if (this.f309267e.f309325Y0) {
                d = null;
            }
            super.setText(d, bufferType);
            C104438a aVar = this.f309267e;
            if (aVar != null) {
                aVar.mo146663z(charSequence);
            }
        }
    }

    public void setTextAppearance(C110370c cVar) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146615A(cVar);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo161879c(getContext(), getPaint(), this.f309279t);
            mo146481h(cVar);
        }
    }

    public void setTextAppearanceResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146615A(new C110370c(aVar.f309305M, i));
        }
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309301I != f) {
            aVar.f309301I = f;
            aVar.invalidateSelf();
            aVar.mo146626g();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309301I != dimension) {
                aVar.f309301I = dimension;
                aVar.invalidateSelf();
                aVar.mo146626g();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C104438a aVar = this.f309267e;
        if (aVar != null && aVar.f309300H != f) {
            aVar.f309300H = f;
            aVar.invalidateSelf();
            aVar.mo146626g();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            float dimension = aVar.f309305M.getResources().getDimension(i);
            if (aVar.f309300H != dimension) {
                aVar.f309300H = dimension;
                aVar.invalidateSelf();
                aVar.mo146626g();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        r6 = r13.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.f309272j = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f309277r = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f309278s = r0
            com.google.android.material.chip.Chip$a r0 = new com.google.android.material.chip.Chip$a
            r0.<init>()
            r10.f309279t = r0
            r0 = 8388627(0x800013, float:1.175497E-38)
            r1 = 1
            if (r12 != 0) goto L_0x0023
            goto L_0x0074
        L_0x0023:
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "background"
            java.lang.String r3 = r12.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x02db
            java.lang.String r3 = "drawableLeft"
            java.lang.String r3 = r12.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x02d3
            java.lang.String r3 = "drawableStart"
            java.lang.String r3 = r12.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x02cb
            java.lang.String r3 = "drawableEnd"
            java.lang.String r3 = r12.getAttributeValue(r2, r3)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r3 != 0) goto L_0x02c5
            java.lang.String r3 = "drawableRight"
            java.lang.String r3 = r12.getAttributeValue(r2, r3)
            if (r3 != 0) goto L_0x02bf
            java.lang.String r3 = "singleLine"
            boolean r3 = r12.getAttributeBooleanValue(r2, r3, r1)
            if (r3 == 0) goto L_0x02b7
            java.lang.String r3 = "lines"
            int r3 = r12.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x02b7
            java.lang.String r3 = "minLines"
            int r3 = r12.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x02b7
            java.lang.String r3 = "maxLines"
            int r3 = r12.getAttributeIntValue(r2, r3, r1)
            if (r3 != r1) goto L_0x02b7
            java.lang.String r3 = "gravity"
            r12.getAttributeIntValue(r2, r3, r0)
        L_0x0074:
            r8 = 2131887266(0x7f1204a2, float:1.9409134E38)
            com.google.android.material.chip.a r2 = new com.google.android.material.chip.a
            r2.<init>(r11)
            android.content.Context r4 = r2.f309305M
            int[] r6 = p1114g8.C107764a.f322506f
            r11 = 0
            int[] r9 = new int[r11]
            r5 = r12
            r7 = r13
            android.content.res.TypedArray r13 = p1139o8.C109991k.m149511d(r4, r5, r6, r7, r8, r9)
            android.content.Context r3 = r2.f309305M
            r4 = 8
            android.content.res.ColorStateList r3 = p1145q8.C110368a.m150198a(r3, r13, r4)
            android.content.res.ColorStateList r4 = r2.f309328d
            if (r4 == r3) goto L_0x009e
            r2.f309328d = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L_0x009e:
            r3 = 16
            r4 = 0
            float r3 = r13.getDimension(r3, r4)
            float r5 = r2.f309329e
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b3
            r2.f309329e = r3
            r2.invalidateSelf()
            r2.mo146626g()
        L_0x00b3:
            r3 = 9
            float r3 = r13.getDimension(r3, r4)
            float r5 = r2.f309330f
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c4
            r2.f309330f = r3
            r2.invalidateSelf()
        L_0x00c4:
            android.content.Context r3 = r2.f309305M
            r5 = 18
            android.content.res.ColorStateList r3 = p1145q8.C110368a.m150198a(r3, r13, r5)
            android.content.res.ColorStateList r5 = r2.f309331g
            if (r5 == r3) goto L_0x00d9
            r2.f309331g = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L_0x00d9:
            r3 = 19
            float r3 = r13.getDimension(r3, r4)
            r2.mo146646p(r3)
            android.content.Context r3 = r2.f309305M
            r5 = 30
            android.content.res.ColorStateList r3 = p1145q8.C110368a.m150198a(r3, r13, r5)
            r2.mo146662y(r3)
            r3 = 3
            java.lang.CharSequence r5 = r13.getText(r3)
            r2.mo146663z(r5)
            android.content.Context r5 = r2.f309305M
            boolean r6 = r13.hasValue(r11)
            if (r6 == 0) goto L_0x0109
            int r6 = r13.getResourceId(r11, r11)
            if (r6 == 0) goto L_0x0109
            q8.c r7 = new q8.c
            r7.<init>(r5, r6)
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            r2.mo146615A(r7)
            int r5 = r13.getInt(r1, r11)
            r6 = 2
            if (r5 == r1) goto L_0x0123
            if (r5 == r6) goto L_0x011e
            if (r5 == r3) goto L_0x0119
            goto L_0x0127
        L_0x0119:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r2.f309323X0 = r1
            goto L_0x0127
        L_0x011e:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            r2.f309323X0 = r1
            goto L_0x0127
        L_0x0123:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
            r2.f309323X0 = r1
        L_0x0127:
            r1 = 15
            boolean r1 = r13.getBoolean(r1, r11)
            r2.mo146642o(r1)
            java.lang.String r1 = "http://schemas.android.com/apk/res-auto"
            if (r12 == 0) goto L_0x014d
            java.lang.String r3 = "chipIconEnabled"
            java.lang.String r3 = r12.getAttributeValue(r1, r3)
            if (r3 == 0) goto L_0x014d
            java.lang.String r3 = "chipIconVisible"
            java.lang.String r3 = r12.getAttributeValue(r1, r3)
            if (r3 != 0) goto L_0x014d
            r3 = 12
            boolean r3 = r13.getBoolean(r3, r11)
            r2.mo146642o(r3)
        L_0x014d:
            android.content.Context r3 = r2.f309305M
            r5 = 11
            android.graphics.drawable.Drawable r3 = p1145q8.C110368a.m150199b(r3, r13, r5)
            r2.mo146639l(r3)
            android.content.Context r3 = r2.f309305M
            r5 = 14
            android.content.res.ColorStateList r3 = p1145q8.C110368a.m150198a(r3, r13, r5)
            r2.mo146641n(r3)
            r3 = 13
            float r3 = r13.getDimension(r3, r4)
            r2.mo146640m(r3)
            r3 = 26
            boolean r3 = r13.getBoolean(r3, r11)
            r2.mo146659v(r3)
            if (r12 == 0) goto L_0x0190
            java.lang.String r3 = "closeIconEnabled"
            java.lang.String r3 = r12.getAttributeValue(r1, r3)
            if (r3 == 0) goto L_0x0190
            java.lang.String r3 = "closeIconVisible"
            java.lang.String r3 = r12.getAttributeValue(r1, r3)
            if (r3 != 0) goto L_0x0190
            r3 = 21
            boolean r3 = r13.getBoolean(r3, r11)
            r2.mo146659v(r3)
        L_0x0190:
            android.content.Context r3 = r2.f309305M
            r5 = 20
            android.graphics.drawable.Drawable r3 = p1145q8.C110368a.m150199b(r3, r13, r5)
            r2.mo146647q(r3)
            android.content.Context r3 = r2.f309305M
            r5 = 25
            android.content.res.ColorStateList r3 = p1145q8.C110368a.m150198a(r3, r13, r5)
            r2.mo146657u(r3)
            r3 = 23
            float r3 = r13.getDimension(r3, r4)
            r2.mo146649s(r3)
            r3 = 4
            boolean r3 = r13.getBoolean(r3, r11)
            r2.mo146634i(r3)
            r3 = 7
            boolean r3 = r13.getBoolean(r3, r11)
            r2.mo146638k(r3)
            if (r12 == 0) goto L_0x01d9
            java.lang.String r3 = "checkedIconEnabled"
            java.lang.String r3 = r12.getAttributeValue(r1, r3)
            if (r3 == 0) goto L_0x01d9
            java.lang.String r3 = "checkedIconVisible"
            java.lang.String r12 = r12.getAttributeValue(r1, r3)
            if (r12 != 0) goto L_0x01d9
            r12 = 6
            boolean r12 = r13.getBoolean(r12, r11)
            r2.mo146638k(r12)
        L_0x01d9:
            android.content.Context r12 = r2.f309305M
            r1 = 5
            android.graphics.drawable.Drawable r12 = p1145q8.C110368a.m150199b(r12, r13, r1)
            r2.mo146637j(r12)
            android.content.Context r12 = r2.f309305M
            r1 = 31
            h8.h r12 = p161h8.C108168h.m146495a(r12, r13, r1)
            r2.f309295C = r12
            android.content.Context r12 = r2.f309305M
            r1 = 27
            h8.h r12 = p161h8.C108168h.m146495a(r12, r13, r1)
            r2.f309296D = r12
            r12 = 17
            float r12 = r13.getDimension(r12, r4)
            float r1 = r2.f309297E
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x020b
            r2.f309297E = r12
            r2.invalidateSelf()
            r2.mo146626g()
        L_0x020b:
            r12 = 29
            float r12 = r13.getDimension(r12, r4)
            r2.mo146661x(r12)
            r12 = 28
            float r12 = r13.getDimension(r12, r4)
            r2.mo146660w(r12)
            r12 = 33
            float r12 = r13.getDimension(r12, r4)
            float r1 = r2.f309300H
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0231
            r2.f309300H = r12
            r2.invalidateSelf()
            r2.mo146626g()
        L_0x0231:
            r12 = 32
            float r12 = r13.getDimension(r12, r4)
            float r1 = r2.f309301I
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0245
            r2.f309301I = r12
            r2.invalidateSelf()
            r2.mo146626g()
        L_0x0245:
            r12 = 24
            float r12 = r13.getDimension(r12, r4)
            r2.mo146656t(r12)
            r12 = 22
            float r12 = r13.getDimension(r12, r4)
            r2.mo146648r(r12)
            r12 = 10
            float r12 = r13.getDimension(r12, r4)
            float r1 = r2.f309304L
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x026b
            r2.f309304L = r12
            r2.invalidateSelf()
            r2.mo146626g()
        L_0x026b:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r13.getDimensionPixelSize(r6, r12)
            r2.f309327Z0 = r12
            r13.recycle()
            r10.setChipDrawable(r2)
            com.google.android.material.chip.Chip$b r12 = new com.google.android.material.chip.Chip$b
            r12.<init>(r10)
            r10.f309276q = r12
            p849e3.C107207u.m145168i(r10, r12)
            k8.a r12 = new k8.a
            r12.<init>(r10)
            r10.setOutlineProvider(r12)
            boolean r12 = r10.f309271i
            r10.setChecked(r12)
            r2.f309325Y0 = r11
            java.lang.CharSequence r12 = r2.f309334j
            r10.setText(r12)
            android.text.TextUtils$TruncateAt r12 = r2.f309323X0
            r10.setEllipsize(r12)
            r10.setIncludeFontPadding(r11)
            q8.c r11 = r10.getTextAppearance()
            if (r11 == 0) goto L_0x02ad
            q8.c r11 = r10.getTextAppearance()
            r10.mo146481h(r11)
        L_0x02ad:
            r10.setSingleLine()
            r10.setGravity(r0)
            r10.mo146451g()
            return
        L_0x02b7:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Chip does not support multi-line text"
            r11.<init>(r12)
            throw r11
        L_0x02bf:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>(r4)
            throw r11
        L_0x02c5:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>(r4)
            throw r11
        L_0x02cb:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Please set start drawable using R.attr#chipIcon."
            r11.<init>(r12)
            throw r11
        L_0x02d3:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Please set left drawable using R.attr#chipIcon."
            r11.<init>(r12)
            throw r11
        L_0x02db:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Do not set the background; Chip manages its own background drawable."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146638k(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146642o(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146659v(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146615A(new C110370c(aVar.f309305M, i));
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo161879c(context, getPaint(), this.f309279t);
            mo146481h(getTextAppearance());
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C104438a aVar = this.f309267e;
        if (aVar != null) {
            aVar.mo146615A(new C110370c(aVar.f309305M, i));
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo161879c(getContext(), getPaint(), this.f309279t);
            mo146481h(getTextAppearance());
        }
    }
}
