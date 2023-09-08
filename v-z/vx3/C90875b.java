package vx3;

import fy3.C32224a;
import gy3.C87412m;

/* renamed from: vx3.b */
public final class C90875b {
    /* renamed from: a */
    public static Thread m113988a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C32224a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            classLoader = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        C87412m.m108594g(aVar, "block");
        C65904a aVar2 = new C65904a(aVar);
        if (z2) {
            aVar2.setDaemon(true);
        }
        if (i > 0) {
            aVar2.setPriority(i);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar2.start();
        }
        return aVar2;
    }
}
