package p1162x2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: x2.f */
public class C112024f extends Drawable implements Drawable.Callback, C112023e, C112022d {

    /* renamed from: j */
    public static final PorterDuff.Mode f335343j = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    public int f335344d;

    /* renamed from: e */
    public PorterDuff.Mode f335345e;

    /* renamed from: f */
    public boolean f335346f;

    /* renamed from: g */
    public C112026h f335347g;

    /* renamed from: h */
    public boolean f335348h;

    /* renamed from: i */
    public Drawable f335349i;

    public C112024f(C112026h hVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f335347g = hVar;
        if (hVar != null && (constantState = hVar.f335352b) != null) {
            mo163693a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    public final void mo163693a(Drawable drawable) {
        Drawable drawable2 = this.f335349i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f335349i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C112026h hVar = this.f335347g;
            if (hVar != null) {
                hVar.f335352b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo163694b() {
        return this.f335349i;
    }

    /* renamed from: c */
    public boolean mo163695c() {
        throw null;
    }

    /* renamed from: d */
    public final boolean mo163696d(int[] iArr) {
        if (!mo163695c()) {
            return false;
        }
        C112026h hVar = this.f335347g;
        ColorStateList colorStateList = hVar.f335353c;
        PorterDuff.Mode mode = hVar.f335354d;
        if (colorStateList == null || mode == null) {
            this.f335346f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f335346f && colorForState == this.f335344d && mode == this.f335345e)) {
                setColorFilter(colorForState, mode);
                this.f335344d = colorForState;
                this.f335345e = mode;
                this.f335346f = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.f335349i.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C112026h hVar = this.f335347g;
        return changingConfigurations | (hVar != null ? hVar.getChangingConfigurations() : 0) | this.f335349i.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C112026h hVar = this.f335347g;
        if (hVar == null) {
            return null;
        }
        if (!(hVar.f335352b != null)) {
            return null;
        }
        hVar.f335351a = getChangingConfigurations();
        return this.f335347g;
    }

    public Drawable getCurrent() {
        return this.f335349i.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f335349i.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f335349i.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C112019a.m152744b(this.f335349i);
    }

    public int getMinimumHeight() {
        return this.f335349i.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f335349i.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f335349i.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f335349i.getPadding(rect);
    }

    public int[] getState() {
        return this.f335349i.getState();
    }

    public Region getTransparentRegion() {
        return this.f335349i.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f335349i.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f335347g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo163695c()
            if (r0 == 0) goto L_0x000d
            x2.h r0 = r1.f335347g
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f335353c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f335349i
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1162x2.C112024f.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f335349i.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f335348h && super.mutate() == this) {
            this.f335347g = new C112026h(this.f335347g);
            Drawable drawable = this.f335349i;
            if (drawable != null) {
                drawable.mutate();
            }
            C112026h hVar = this.f335347g;
            if (hVar != null) {
                Drawable drawable2 = this.f335349i;
                hVar.f335352b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f335348h = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f335349i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C112019a.m152745c(this.f335349i, i);
    }

    public boolean onLevelChange(int i) {
        return this.f335349i.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f335349i.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f335349i.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f335349i.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f335349i.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f335349i.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f335349i.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return mo163696d(iArr) || this.f335349i.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f335347g.f335353c = colorStateList;
        mo163696d(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f335347g.f335354d = mode;
        mo163696d(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f335349i.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C112024f(Drawable drawable) {
        this.f335347g = new C112026h(this.f335347g);
        mo163693a(drawable);
    }
}
