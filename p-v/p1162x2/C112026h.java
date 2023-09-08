package p1162x2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: x2.h */
public final class C112026h extends Drawable.ConstantState {

    /* renamed from: a */
    public int f335351a;

    /* renamed from: b */
    public Drawable.ConstantState f335352b;

    /* renamed from: c */
    public ColorStateList f335353c = null;

    /* renamed from: d */
    public PorterDuff.Mode f335354d = C112024f.f335343j;

    public C112026h(C112026h hVar) {
        if (hVar != null) {
            this.f335351a = hVar.f335351a;
            this.f335352b = hVar.f335352b;
            this.f335353c = hVar.f335353c;
            this.f335354d = hVar.f335354d;
        }
    }

    public int getChangingConfigurations() {
        int i = this.f335351a;
        Drawable.ConstantState constantState = this.f335352b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return new C112025g(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new C112025g(this, resources);
    }
}
