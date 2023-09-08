package p1132m5;

import coil.size.PixelSize;
import coil.size.Size;
import gy3.C87412m;
import java.io.File;
import p864t5.C110908h;

/* renamed from: m5.k */
public final class C109513k extends C109507g {

    /* renamed from: a */
    public static final C109513k f327763a = new C109513k();

    /* renamed from: b */
    public static final File f327764b = new File("/proc/self/fd");

    /* renamed from: c */
    public static volatile int f327765c;

    /* renamed from: d */
    public static volatile boolean f327766d = true;

    /* renamed from: a */
    public boolean mo160738a(Size size, C110908h hVar) {
        boolean z;
        C87412m.m108594g(size, "size");
        boolean z2 = false;
        if (size instanceof PixelSize) {
            PixelSize pixelSize = (PixelSize) size;
            if (pixelSize.f309028d < 75 || pixelSize.f309029e < 75) {
                return false;
            }
        }
        synchronized (this) {
            int i = f327765c;
            f327765c = i + 1;
            if (i >= 50) {
                f327765c = 0;
                String[] list = f327764b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 750) {
                    z2 = true;
                }
                f327766d = z2;
                if (!f327766d) {
                    if (hVar != null) {
                        if (hVar.getLevel() <= 5) {
                            hVar.mo162595a("LimitedFileDescriptorHardwareBitmapService", 5, C87412m.m108600m("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", Integer.valueOf(length)), (Throwable) null);
                        }
                    }
                }
            }
            z = f327766d;
        }
        return z;
    }
}
