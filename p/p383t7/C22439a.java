package p383t7;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: t7.a */
public class C22439a {

    /* renamed from: d */
    public final CharSequence f63565d;

    /* renamed from: e */
    public final float f63566e;

    /* renamed from: f */
    public final float f63567f;

    public C22439a(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C22439a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C22439a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, (Bitmap) null, f, i, i2, f2, i3, f3, Float.MIN_VALUE, z, i4);
    }

    public C22439a(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, float f3, float f4, boolean z, int i4) {
        this.f63565d = charSequence;
        this.f63566e = f;
        this.f63567f = f2;
    }
}
