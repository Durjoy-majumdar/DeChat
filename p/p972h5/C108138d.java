package p972h5;

import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import gy3.C87412m;
import iy3.C60641c;
import o24.C21769k;
import p643p5.C110168e;
import rx3.C13603j;

/* renamed from: h5.d */
public final class C108138d {

    /* renamed from: a */
    public static final /* synthetic */ int f323803a = 0;

    static {
        C21769k.C21770a aVar = C21769k.f61697h;
        aVar.mo34164a("GIF87a");
        aVar.mo34164a("GIF89a");
        aVar.mo34164a("RIFF");
        aVar.mo34164a("WEBP");
        aVar.mo34164a("VP8X");
        aVar.mo34164a("ftyp");
        aVar.mo34164a("msf1");
        aVar.mo34164a("hevc");
        aVar.mo34164a("hevx");
    }

    /* renamed from: a */
    public static final int m146471a(int i, int i2, int i3, int i4, C110168e eVar) {
        C87412m.m108594g(eVar, "scale");
        int highestOneBit = Integer.highestOneBit(i / i3);
        if (highestOneBit < 1) {
            highestOneBit = 1;
        }
        int highestOneBit2 = Integer.highestOneBit(i2 / i4);
        if (highestOneBit2 < 1) {
            highestOneBit2 = 1;
        }
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return Math.min(highestOneBit, highestOneBit2);
        }
        if (ordinal == 1) {
            return Math.max(highestOneBit, highestOneBit2);
        }
        throw new C13603j();
    }

    /* renamed from: b */
    public static final PixelSize m146472b(int i, int i2, Size size, C110168e eVar) {
        C87412m.m108594g(size, "dstSize");
        C87412m.m108594g(eVar, "scale");
        if (size instanceof OriginalSize) {
            return new PixelSize(i, i2);
        }
        if (size instanceof PixelSize) {
            PixelSize pixelSize = (PixelSize) size;
            double d = m146474d(i, i2, pixelSize.f309028d, pixelSize.f309029e, eVar);
            return new PixelSize(C60641c.m70920a(((double) i) * d), C60641c.m70920a(d * ((double) i2)));
        }
        throw new C13603j();
    }

    /* renamed from: c */
    public static final double m146473c(double d, double d2, double d3, double d4, C110168e eVar) {
        C87412m.m108594g(eVar, "scale");
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return Math.max(d5, d6);
        }
        if (ordinal == 1) {
            return Math.min(d5, d6);
        }
        throw new C13603j();
    }

    /* renamed from: d */
    public static final double m146474d(int i, int i2, int i3, int i4, C110168e eVar) {
        C87412m.m108594g(eVar, "scale");
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return Math.max(d, d2);
        }
        if (ordinal == 1) {
            return Math.min(d, d2);
        }
        throw new C13603j();
    }
}
