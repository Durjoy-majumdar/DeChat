package p436a1;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: a1.n */
public final class C103249n {

    /* renamed from: a */
    public final int f304455a;

    public /* synthetic */ C103249n(int i) {
        this.f304455a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103249n) && this.f304455a == ((C103249n) obj).f304455a;
    }

    public int hashCode() {
        return this.f304455a;
    }

    public String toString() {
        int i = this.f304455a;
        boolean z = false;
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return ExifInterface.TAG_SATURATION;
        }
        if (i == 27) {
            return "Color";
        }
        if (i == 28) {
            z = true;
        }
        return z ? "Luminosity" : "Unknown";
    }
}
