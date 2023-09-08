package lt0;

import android.graphics.Color;

/* renamed from: lt0.a */
public class C76723a {

    /* renamed from: a */
    public int f224456a;

    /* renamed from: b */
    public int f224457b;

    /* renamed from: c */
    public int f224458c;

    /* renamed from: d */
    public int f224459d;

    /* renamed from: e */
    public int f224460e;

    /* renamed from: f */
    public int f224461f;

    /* renamed from: g */
    public int f224462g;

    /* renamed from: h */
    public int f224463h;

    public C76723a(int i, int i2) {
        this.f224456a = Color.red(i);
        this.f224457b = Color.green(i);
        this.f224458c = Color.blue(i);
        this.f224459d = Color.alpha(i);
        this.f224460e = Color.red(i2);
        this.f224461f = Color.green(i2);
        this.f224462g = Color.blue(i2);
        this.f224463h = Color.alpha(i2);
    }

    /* renamed from: a */
    public int mo107002a(float f) {
        int i = this.f224456a;
        int i2 = (int) (((double) i) + ((double) (((float) (this.f224460e - i)) * f)) + 0.5d);
        int i3 = this.f224457b;
        int i4 = (int) (((double) i3) + ((double) (((float) (this.f224461f - i3)) * f)) + 0.5d);
        int i5 = this.f224458c;
        int i6 = (int) (((double) i5) + ((double) (((float) (this.f224462g - i5)) * f)) + 0.5d);
        int i7 = this.f224459d;
        return Color.argb((int) (((double) i7) + ((double) (((float) (this.f224463h - i7)) * f)) + 0.5d), i2, i4, i6);
    }
}
