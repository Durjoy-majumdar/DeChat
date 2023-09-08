package p1119i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: i.c */
public class C108289c extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    public Drawable f324242d;

    public C108289c(Drawable drawable) {
        Drawable drawable2 = this.f324242d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f324242d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f324242d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f324242d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f324242d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f324242d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f324242d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f324242d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f324242d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f324242d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f324242d.getPadding(rect);
    }

    public int[] getState() {
        return this.f324242d.getState();
    }

    public Region getTransparentRegion() {
        return this.f324242d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f324242d.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f324242d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f324242d.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f324242d.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f324242d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f324242d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f324242d.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f324242d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f324242d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f324242d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f324242d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f324242d.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f324242d.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f324242d.setState(iArr);
    }

    public void setTint(int i) {
        this.f324242d.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f324242d.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f324242d.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f324242d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
