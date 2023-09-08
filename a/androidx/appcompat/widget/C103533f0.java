package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import p1050v2.C111325g;

/* renamed from: androidx.appcompat.widget.f0 */
public class C103533f0 {

    /* renamed from: a */
    public final Context f305735a;

    /* renamed from: b */
    public final TypedArray f305736b;

    /* renamed from: c */
    public TypedValue f305737c;

    public C103533f0(Context context, TypedArray typedArray) {
        this.f305735a = context;
        this.f305736b = typedArray;
    }

    /* renamed from: l */
    public static C103533f0 m137562l(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C103533f0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo144332a(int i, boolean z) {
        return this.f305736b.getBoolean(i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p1115h.C107922a.m146227a(r2.f305735a, (r0 = r2.f305736b.getResourceId(r3, 0)));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo144333b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f305736b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f305736b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f305735a
            android.content.res.ColorStateList r0 = p1115h.C107922a.m146227a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f305736b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103533f0.mo144333b(int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public int mo144334c(int i, int i2) {
        return this.f305736b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public int mo144335d(int i, int i2) {
        return this.f305736b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f305736b.getResourceId(r3, 0);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo144336e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f305736b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f305736b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f305735a
            android.graphics.drawable.Drawable r3 = p1115h.C107922a.m146228b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f305736b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103533f0.mo144336e(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: f */
    public Drawable mo144337f(int i) {
        int resourceId;
        if (!this.f305736b.hasValue(i) || (resourceId = this.f305736b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C103527f.m137545g().mo144329i(this.f305735a, resourceId, true);
    }

    /* renamed from: g */
    public Typeface mo144338g(int i, int i2, C111325g.C111328d dVar) {
        int resourceId = this.f305736b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f305737c == null) {
            this.f305737c = new TypedValue();
        }
        Context context = this.f305735a;
        TypedValue typedValue = this.f305737c;
        ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
        if (context.isRestricted()) {
            return null;
        }
        return C111325g.m151809c(context, resourceId, typedValue, i2, dVar, (Handler) null, true, false);
    }

    /* renamed from: h */
    public int mo144339h(int i, int i2) {
        return this.f305736b.getInt(i, i2);
    }

    /* renamed from: i */
    public int mo144340i(int i, int i2) {
        return this.f305736b.getResourceId(i, i2);
    }

    /* renamed from: j */
    public CharSequence mo144341j(int i) {
        return this.f305736b.getText(i);
    }

    /* renamed from: k */
    public boolean mo144342k(int i) {
        return this.f305736b.hasValue(i);
    }

    /* renamed from: m */
    public void mo144343m() {
        this.f305736b.recycle();
    }
}
