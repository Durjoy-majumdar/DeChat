package p1162x2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: x2.g */
public class C112025g extends C112024f {

    /* renamed from: n */
    public static Method f335350n;

    public C112025g(Drawable drawable) {
        super(drawable);
        if (f335350n == null) {
            try {
                f335350n = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public boolean mo163695c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f335349i;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f335349i.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f335349i.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f335349i;
        if (!(drawable == null || (method = f335350n) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f335349i.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f335349i.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo163695c()) {
            super.setTint(i);
        } else {
            this.f335349i.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo163695c()) {
            super.setTintList(colorStateList);
        } else {
            this.f335349i.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo163695c()) {
            super.setTintMode(mode);
        } else {
            this.f335349i.setTintMode(mode);
        }
    }

    public C112025g(C112026h hVar, Resources resources) {
        super(hVar, resources);
        if (f335350n == null) {
            try {
                f335350n = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
