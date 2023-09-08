package po0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p975hd.C87482f;

/* renamed from: po0.k */
public class C89425k implements C87482f {

    /* renamed from: a */
    public int f257456a;

    /* renamed from: b */
    public int f257457b;

    /* renamed from: c */
    public int f257458c;

    /* renamed from: d */
    public int f257459d;

    /* renamed from: e */
    public int f257460e;

    /* renamed from: f */
    public int f257461f;

    /* renamed from: g */
    public String f257462g;

    /* renamed from: h */
    public float f257463h;

    /* renamed from: i */
    public float f257464i;

    /* renamed from: a */
    public boolean mo123754a(String str, int i, int i2, int i3, int i4) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, scale type is null");
            return false;
        } else if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, width or height is 0");
            return false;
        } else if (str.equalsIgnoreCase(this.f257462g) && this.f257456a == i && this.f257457b == i2 && this.f257458c == i3 && this.f257459d == i4) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, same as last calculated");
            return true;
        } else {
            this.f257462g = str;
            this.f257456a = i;
            this.f257457b = i2;
            this.f257458c = i3;
            this.f257459d = i4;
            float f = (((float) i3) * 1.0f) / ((float) i4);
            float f2 = (((float) i) * 1.0f) / ((float) i2);
            if (str.equalsIgnoreCase("contain")) {
                int i5 = this.f257456a;
                int i6 = this.f257457b;
                if (i5 < i6) {
                    int i7 = (int) (((float) i5) / f);
                    this.f257461f = i7;
                    this.f257460e = i5;
                    if (i7 > i6) {
                        this.f257460e = (int) (((float) i6) * f);
                        this.f257461f = i6;
                    }
                } else {
                    int i8 = (int) (((float) i6) * f);
                    this.f257460e = i8;
                    this.f257461f = i6;
                    if (i8 > i5) {
                        this.f257461f = (int) (((float) i5) / f);
                        this.f257460e = i5;
                    }
                }
            } else if (this.f257462g.equalsIgnoreCase("fill")) {
                this.f257461f = this.f257457b;
                this.f257460e = this.f257456a;
            } else if (this.f257462g.equalsIgnoreCase("cover")) {
                int i9 = this.f257456a;
                int i15 = this.f257457b;
                if (i9 > i15) {
                    int i16 = (int) (((float) i9) / f);
                    this.f257461f = i16;
                    this.f257460e = i9;
                    if (i16 < i15) {
                        this.f257460e = (int) (((float) i15) * f);
                        this.f257461f = i15;
                    }
                } else {
                    int i17 = (int) (((float) i15) * f);
                    this.f257460e = i17;
                    this.f257461f = i15;
                    if (i17 < i9) {
                        this.f257461f = (int) (((float) i9) / f);
                        this.f257460e = i9;
                    }
                }
            } else if (((double) Math.abs(f - f2)) > 0.05d) {
                int i18 = this.f257456a;
                int i19 = this.f257457b;
                if (i18 < i19) {
                    this.f257461f = (int) (((float) i18) / f);
                    this.f257460e = i18;
                } else {
                    this.f257460e = (int) (((float) i19) * f);
                    this.f257461f = i19;
                }
            } else {
                int i25 = this.f257456a;
                int i26 = this.f257457b;
                if (i25 > i26) {
                    this.f257461f = (int) (((float) i25) / f);
                    this.f257460e = i25;
                } else {
                    this.f257460e = (int) (((float) i26) * f);
                    this.f257461f = i26;
                }
            }
            int i27 = this.f257456a;
            this.f257463h = (((float) this.f257460e) * 1.0f) / ((float) i27);
            this.f257464i = (((float) this.f257461f) * 1.0f) / ((float) this.f257457b);
            Log.m105919d("MicroMsg.SameLayer.AppBrandVideoScaleHandler", "calculateScale, screen[%d, %d], video[%d, %d], measure[%d, %d], scale[%f, %f]", Integer.valueOf(i27), Integer.valueOf(this.f257457b), Integer.valueOf(this.f257458c), Integer.valueOf(this.f257459d), Integer.valueOf(this.f257460e), Integer.valueOf(this.f257461f), Float.valueOf(this.f257463h), Float.valueOf(this.f257464i));
            return true;
        }
    }
}
