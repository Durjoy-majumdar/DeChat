package p1139o8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import p1114g8.C107764a;

/* renamed from: o8.k */
public final class C109991k {

    /* renamed from: a */
    public static final int[] f329152a = {C0966R.attr.f2735gf};

    /* renamed from: b */
    public static final int[] f329153b = {C0966R.attr.f2737gi};

    /* renamed from: a */
    public static void m149508a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322524x, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m149510c(context, f329153b, "Theme.MaterialComponents");
        }
        m149510c(context, f329152a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m149509b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = p1114g8.C107764a.f322524x
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = 1
            r3 = -1
            if (r10 == 0) goto L_0x0036
            int r4 = r10.length
            if (r4 != 0) goto L_0x001a
            goto L_0x0036
        L_0x001a:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = 0
        L_0x0020:
            if (r7 >= r6) goto L_0x0031
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r3)
            if (r8 != r3) goto L_0x002e
            r5.recycle()
            goto L_0x003d
        L_0x002e:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0031:
            r5.recycle()
        L_0x0034:
            r2 = 1
            goto L_0x003d
        L_0x0036:
            int r5 = r0.getResourceId(r2, r3)
            if (r5 == r3) goto L_0x003d
            goto L_0x0034
        L_0x003d:
            r0.recycle()
            if (r2 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1139o8.C109991k.m149509b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m149510c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: d */
    public static TypedArray m149511d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m149508a(context, attributeSet, i, i2);
        m149509b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
