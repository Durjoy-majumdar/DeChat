package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p1124j.C108490a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class SwitchCompat extends CompoundButton {

    /* renamed from: T */
    public static final Property<SwitchCompat, Float> f305595T = new C103510a(Float.class, "thumbPos");

    /* renamed from: U */
    public static final int[] f305596U = {16842912};

    /* renamed from: A */
    public float f305597A;

    /* renamed from: B */
    public VelocityTracker f305598B;

    /* renamed from: C */
    public int f305599C;

    /* renamed from: D */
    public float f305600D;

    /* renamed from: E */
    public int f305601E;

    /* renamed from: F */
    public int f305602F;

    /* renamed from: G */
    public int f305603G;

    /* renamed from: H */
    public int f305604H;

    /* renamed from: I */
    public int f305605I;

    /* renamed from: J */
    public int f305606J;

    /* renamed from: K */
    public int f305607K;

    /* renamed from: L */
    public final TextPaint f305608L;

    /* renamed from: M */
    public ColorStateList f305609M;

    /* renamed from: N */
    public Layout f305610N;

    /* renamed from: P */
    public Layout f305611P;

    /* renamed from: Q */
    public TransformationMethod f305612Q;

    /* renamed from: R */
    public ObjectAnimator f305613R;

    /* renamed from: S */
    public final Rect f305614S;

    /* renamed from: d */
    public Drawable f305615d;

    /* renamed from: e */
    public ColorStateList f305616e;

    /* renamed from: f */
    public PorterDuff.Mode f305617f;

    /* renamed from: g */
    public boolean f305618g;

    /* renamed from: h */
    public boolean f305619h;

    /* renamed from: i */
    public Drawable f305620i;

    /* renamed from: j */
    public ColorStateList f305621j;

    /* renamed from: n */
    public PorterDuff.Mode f305622n;

    /* renamed from: o */
    public boolean f305623o;

    /* renamed from: p */
    public boolean f305624p;

    /* renamed from: q */
    public int f305625q;

    /* renamed from: r */
    public int f305626r;

    /* renamed from: s */
    public int f305627s;

    /* renamed from: t */
    public boolean f305628t;

    /* renamed from: u */
    public CharSequence f305629u;

    /* renamed from: v */
    public CharSequence f305630v;

    /* renamed from: w */
    public boolean f305631w;

    /* renamed from: x */
    public int f305632x;

    /* renamed from: y */
    public int f305633y;

    /* renamed from: z */
    public float f305634z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public static class C103510a extends Property<SwitchCompat, Float> {
        public C103510a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).f305600D);
        }

        public void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a2o);
    }

    private boolean getTargetCheckedState() {
        return this.f305600D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C103553n0.m137647a(this) ? 1.0f - this.f305600D : this.f305600D) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f305620i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f305614S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f305615d;
        Rect c = drawable2 != null ? C103556p.m137673c(drawable2) : C103556p.f305821a;
        return ((((this.f305601E - this.f305603G) - rect.left) - rect.right) - c.left) - c.right;
    }

    /* renamed from: a */
    public final void mo144162a() {
        Drawable drawable = this.f305615d;
        if (drawable == null) {
            return;
        }
        if (this.f305618g || this.f305619h) {
            Drawable mutate = drawable.mutate();
            this.f305615d = mutate;
            if (this.f305618g) {
                mutate.setTintList(this.f305616e);
            }
            if (this.f305619h) {
                this.f305615d.setTintMode(this.f305617f);
            }
            if (this.f305615d.isStateful()) {
                this.f305615d.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo144163b() {
        Drawable drawable = this.f305620i;
        if (drawable == null) {
            return;
        }
        if (this.f305623o || this.f305624p) {
            Drawable mutate = drawable.mutate();
            this.f305620i = mutate;
            if (this.f305623o) {
                mutate.setTintList(this.f305621j);
            }
            if (this.f305624p) {
                this.f305620i.setTintMode(this.f305622n);
            }
            if (this.f305620i.isStateful()) {
                this.f305620i.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public final Layout mo144164c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f305612Q;
        if (transformationMethod != null) {
            charSequence = ((C108490a) transformationMethod).getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f305608L;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f305614S;
        int i3 = this.f305604H;
        int i4 = this.f305605I;
        int i5 = this.f305606J;
        int i6 = this.f305607K;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f305615d;
        Rect c = drawable != null ? C103556p.m137673c(drawable) : C103556p.f305821a;
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (c != null) {
                int i8 = c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = c.top;
                int i15 = rect.top;
                i = i9 > i15 ? (i9 - i15) + i4 : i4;
                int i16 = c.right;
                int i17 = rect.right;
                if (i16 > i17) {
                    i5 -= i16 - i17;
                }
                int i18 = c.bottom;
                int i19 = rect.bottom;
                if (i18 > i19) {
                    i2 = i6 - (i18 - i19);
                    this.f305620i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f305620i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f305615d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i25 = thumbOffset - rect.left;
            int i26 = thumbOffset + this.f305603G + rect.right;
            this.f305615d.setBounds(i25, i4, i26, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i25, i4, i26, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f305615d;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f305615d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C103553n0.m137647a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f305601E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f305627s : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C103553n0.m137647a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f305601E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f305627s : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f305631w;
    }

    public boolean getSplitTrack() {
        return this.f305628t;
    }

    public int getSwitchMinWidth() {
        return this.f305626r;
    }

    public int getSwitchPadding() {
        return this.f305627s;
    }

    public CharSequence getTextOff() {
        return this.f305630v;
    }

    public CharSequence getTextOn() {
        return this.f305629u;
    }

    public Drawable getThumbDrawable() {
        return this.f305615d;
    }

    public int getThumbTextPadding() {
        return this.f305625q;
    }

    public ColorStateList getThumbTintList() {
        return this.f305616e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f305617f;
    }

    public Drawable getTrackDrawable() {
        return this.f305620i;
    }

    public ColorStateList getTrackTintList() {
        return this.f305621j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f305622n;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f305615d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f305613R;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f305613R.end();
            this.f305613R = null;
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f305596U);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f305614S;
        Drawable drawable = this.f305620i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f305605I;
        int i3 = this.f305607K;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f305615d;
        if (drawable != null) {
            if (!this.f305628t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = C103556p.m137673c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f305610N : this.f305611P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f305609M;
            if (colorStateList != null) {
                this.f305608L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f305608L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f305629u : this.f305630v;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        super.onLayout(z, i, i2, i3, i4);
        int i16 = 0;
        if (this.f305615d != null) {
            Rect rect = this.f305614S;
            Drawable drawable = this.f305620i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = C103556p.m137673c(this.f305615d);
            i5 = Math.max(0, c.left - rect.left);
            i16 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C103553n0.m137647a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f305601E + i7) - i5) - i16;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i16;
            i7 = (i6 - this.f305601E) + i5 + i16;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i15 = this.f305602F;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i15 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i15 = this.f305602F;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f305602F;
            this.f305604H = i7;
            this.f305605I = i9;
            this.f305607K = i8;
            this.f305606J = i6;
        }
        i8 = i15 + i9;
        this.f305604H = i7;
        this.f305605I = i9;
        this.f305607K = i8;
        this.f305606J = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f305631w) {
            if (this.f305610N == null) {
                this.f305610N = mo144164c(this.f305629u);
            }
            if (this.f305611P == null) {
                this.f305611P = mo144164c(this.f305630v);
            }
        }
        Rect rect = this.f305614S;
        Drawable drawable = this.f305615d;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f305615d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f305615d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f305603G = Math.max(this.f305631w ? Math.max(this.f305610N.getWidth(), this.f305611P.getWidth()) + (this.f305625q * 2) : 0, i4);
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f305620i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f305615d;
        if (drawable3 != null) {
            Rect c = C103556p.m137673c(drawable3);
            i6 = Math.max(i6, c.left);
            i7 = Math.max(i7, c.right);
        }
        int max = Math.max(this.f305626r, (this.f305603G * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f305601E = max;
        this.f305602F = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f305629u : this.f305630v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0153;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f305598B
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0100
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0093
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0093
            goto L_0x0153
        L_0x0018:
            int r0 = r10.f305632x
            if (r0 == r2) goto L_0x005f
            if (r0 == r5) goto L_0x0020
            goto L_0x0153
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f305634z
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003e
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003e
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003e:
            boolean r0 = androidx.appcompat.widget.C103553n0.m137647a(r10)
            if (r0 == 0) goto L_0x0045
            float r1 = -r1
        L_0x0045:
            float r0 = r10.f305600D
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            r10.f305634z = r11
            r10.setThumbPosition(r4)
        L_0x005e:
            return r2
        L_0x005f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f305634z
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f305633y
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0085
            float r3 = r10.f305597A
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f305633y
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0153
        L_0x0085:
            r10.f305632x = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.f305634z = r0
            r10.f305597A = r1
            return r2
        L_0x0093:
            int r0 = r10.f305632x
            if (r0 != r5) goto L_0x00f8
            r10.f305632x = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a7
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00de
            android.view.VelocityTracker r0 = r10.f305598B
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.f305598B
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.f305599C
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d9
            boolean r6 = androidx.appcompat.widget.C103553n0.m137647a(r10)
            if (r6 == 0) goto L_0x00d1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00d1:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            goto L_0x00df
        L_0x00d7:
            r0 = 0
            goto L_0x00df
        L_0x00d9:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00df
        L_0x00de:
            r0 = r5
        L_0x00df:
            if (r0 == r5) goto L_0x00e4
            r10.playSoundEffect(r1)
        L_0x00e4:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f8:
            r10.f305632x = r1
            android.view.VelocityTracker r0 = r10.f305598B
            r0.clear()
            goto L_0x0153
        L_0x0100:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0153
            android.graphics.drawable.Drawable r4 = r10.f305615d
            if (r4 != 0) goto L_0x0113
            goto L_0x014b
        L_0x0113:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f305615d
            android.graphics.Rect r6 = r10.f305614S
            r5.getPadding(r6)
            int r5 = r10.f305605I
            int r6 = r10.f305633y
            int r5 = r5 - r6
            int r7 = r10.f305604H
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.f305603G
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f305614S
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.f305607K
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x014b
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x014b
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            r1 = 1
        L_0x014b:
            if (r1 == 0) goto L_0x0153
            r10.f305632x = r2
            r10.f305634z = r0
            r10.f305597A = r3
        L_0x0153:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(this)) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f305595T, new float[]{f});
                this.f305613R = ofFloat;
                ofFloat.setDuration(250);
                this.f305613R.setAutoCancel(true);
                this.f305613R.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f305613R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C103733h.m138112i(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f305631w != z) {
            this.f305631w = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f305628t = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f305626r = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f305627s = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f305608L.getTypeface() != null && !this.f305608L.getTypeface().equals(typeface)) || (this.f305608L.getTypeface() == null && typeface != null)) {
            this.f305608L.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f305630v = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f305629u = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f305615d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f305615d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f305600D = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C107922a.m146228b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f305625q = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f305616e = colorStateList;
        this.f305618g = true;
        mo144162a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f305617f = mode;
        this.f305619h = true;
        mo144162a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f305620i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f305620i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C107922a.m146228b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f305621j = colorStateList;
        this.f305623o = true;
        mo144163b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f305622n = mode;
        this.f305624p = true;
        mo144163b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f305615d || drawable == this.f305620i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f6, code lost:
        r8 = p1115h.C107922a.m146227a(r11, (r8 = r7.getResourceId(3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 0
            r10.f305616e = r0
            r10.f305617f = r0
            r1 = 0
            r10.f305618g = r1
            r10.f305619h = r1
            r10.f305621j = r0
            r10.f305622n = r0
            r10.f305623o = r1
            r10.f305624p = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f305598B = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.f305614S = r2
            android.text.TextPaint r2 = new android.text.TextPaint
            r3 = 1
            r2.<init>(r3)
            r10.f305608L = r2
            android.content.res.Resources r4 = r10.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r2.density = r4
            int[] r4 = p433g.C107593a.f321895A
            androidx.appcompat.widget.f0 r5 = new androidx.appcompat.widget.f0
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r4, r13, r1)
            r5.<init>(r11, r12)
            r12 = 2
            android.graphics.drawable.Drawable r13 = r5.mo144336e(r12)
            r10.f305615d = r13
            if (r13 == 0) goto L_0x004d
            r13.setCallback(r10)
        L_0x004d:
            r13 = 11
            android.graphics.drawable.Drawable r13 = r5.mo144336e(r13)
            r10.f305620i = r13
            if (r13 == 0) goto L_0x005a
            r13.setCallback(r10)
        L_0x005a:
            java.lang.CharSequence r13 = r5.mo144341j(r1)
            r10.f305629u = r13
            java.lang.CharSequence r13 = r5.mo144341j(r3)
            r10.f305630v = r13
            r13 = 3
            boolean r4 = r5.mo144332a(r13, r3)
            r10.f305631w = r4
            r4 = 8
            int r4 = r5.mo144335d(r4, r1)
            r10.f305625q = r4
            r4 = 5
            int r4 = r5.mo144335d(r4, r1)
            r10.f305626r = r4
            r4 = 6
            int r4 = r5.mo144335d(r4, r1)
            r10.f305627s = r4
            r4 = 4
            boolean r4 = r5.mo144332a(r4, r1)
            r10.f305628t = r4
            r4 = 9
            android.content.res.ColorStateList r4 = r5.mo144333b(r4)
            if (r4 == 0) goto L_0x0096
            r10.f305616e = r4
            r10.f305618g = r3
        L_0x0096:
            r4 = 10
            r6 = -1
            int r4 = r5.mo144339h(r4, r6)
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.C103556p.m137674d(r4, r0)
            android.graphics.PorterDuff$Mode r7 = r10.f305617f
            if (r7 == r4) goto L_0x00a9
            r10.f305617f = r4
            r10.f305619h = r3
        L_0x00a9:
            boolean r4 = r10.f305618g
            if (r4 != 0) goto L_0x00b1
            boolean r4 = r10.f305619h
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            r10.mo144162a()
        L_0x00b4:
            r4 = 12
            android.content.res.ColorStateList r7 = r5.mo144333b(r4)
            if (r7 == 0) goto L_0x00c0
            r10.f305621j = r7
            r10.f305623o = r3
        L_0x00c0:
            r7 = 13
            int r7 = r5.mo144339h(r7, r6)
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.C103556p.m137674d(r7, r0)
            android.graphics.PorterDuff$Mode r8 = r10.f305622n
            if (r8 == r7) goto L_0x00d2
            r10.f305622n = r7
            r10.f305624p = r3
        L_0x00d2:
            boolean r7 = r10.f305623o
            if (r7 != 0) goto L_0x00da
            boolean r7 = r10.f305624p
            if (r7 == 0) goto L_0x00dd
        L_0x00da:
            r10.mo144163b()
        L_0x00dd:
            r7 = 7
            int r7 = r5.mo144340i(r7, r1)
            if (r7 == 0) goto L_0x0186
            int[] r8 = p433g.C107593a.f321896B
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r7, r8)
            boolean r8 = r7.hasValue(r13)
            if (r8 == 0) goto L_0x00fd
            int r8 = r7.getResourceId(r13, r1)
            if (r8 == 0) goto L_0x00fd
            android.content.res.ColorStateList r8 = p1115h.C107922a.m146227a(r11, r8)
            if (r8 == 0) goto L_0x00fd
            goto L_0x0101
        L_0x00fd:
            android.content.res.ColorStateList r8 = r7.getColorStateList(r13)
        L_0x0101:
            if (r8 == 0) goto L_0x0106
            r10.f305609M = r8
            goto L_0x010c
        L_0x0106:
            android.content.res.ColorStateList r8 = r10.getTextColors()
            r10.f305609M = r8
        L_0x010c:
            int r8 = r7.getDimensionPixelSize(r1, r1)
            if (r8 == 0) goto L_0x0121
            float r8 = (float) r8
            float r9 = r2.getTextSize()
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0121
            r2.setTextSize(r8)
            r10.requestLayout()
        L_0x0121:
            int r8 = r7.getInt(r3, r6)
            int r6 = r7.getInt(r12, r6)
            if (r8 == r3) goto L_0x0137
            if (r8 == r12) goto L_0x0134
            if (r8 == r13) goto L_0x0131
            r13 = r0
            goto L_0x0139
        L_0x0131:
            android.graphics.Typeface r13 = android.graphics.Typeface.MONOSPACE
            goto L_0x0139
        L_0x0134:
            android.graphics.Typeface r13 = android.graphics.Typeface.SERIF
            goto L_0x0139
        L_0x0137:
            android.graphics.Typeface r13 = android.graphics.Typeface.SANS_SERIF
        L_0x0139:
            r8 = 0
            if (r6 <= 0) goto L_0x0166
            if (r13 != 0) goto L_0x0143
            android.graphics.Typeface r13 = android.graphics.Typeface.defaultFromStyle(r6)
            goto L_0x0147
        L_0x0143:
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r6)
        L_0x0147:
            r10.setSwitchTypeface(r13)
            if (r13 == 0) goto L_0x0151
            int r13 = r13.getStyle()
            goto L_0x0152
        L_0x0151:
            r13 = 0
        L_0x0152:
            int r13 = ~r13
            r13 = r13 & r6
            r6 = r13 & 1
            if (r6 == 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r3 = 0
        L_0x015a:
            r2.setFakeBoldText(r3)
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0162
            r8 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0162:
            r2.setTextSkewX(r8)
            goto L_0x016f
        L_0x0166:
            r2.setFakeBoldText(r1)
            r2.setTextSkewX(r8)
            r10.setSwitchTypeface(r13)
        L_0x016f:
            boolean r12 = r7.getBoolean(r4, r1)
            if (r12 == 0) goto L_0x0181
            j.a r12 = new j.a
            android.content.Context r13 = r10.getContext()
            r12.<init>(r13)
            r10.f305612Q = r12
            goto L_0x0183
        L_0x0181:
            r10.f305612Q = r0
        L_0x0183:
            r7.recycle()
        L_0x0186:
            r5.mo144343m()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r12 = r11.getScaledTouchSlop()
            r10.f305633y = r12
            int r11 = r11.getScaledMinimumFlingVelocity()
            r10.f305599C = r11
            r10.refreshDrawableState()
            boolean r11 = r10.isChecked()
            r10.setChecked(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
