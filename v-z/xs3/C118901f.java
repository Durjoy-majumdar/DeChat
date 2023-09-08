package xs3;

import ft3.C116895f;
import ys3.C118989a;

/* renamed from: xs3.f */
public class C118901f {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167647a(java.io.File r5) {
        /*
            r0 = 0
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0031 }
            boolean r1 = ys3.C118991c.f356423c     // Catch:{ Exception -> 0x0031 }
            r2 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            r5 = 0
            goto L_0x002b
        L_0x000c:
            java.lang.reflect.Method r1 = ys3.C118991c.f356422b     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r3 = ys3.C118991c.f356421a     // Catch:{ Exception -> 0x0031 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0031 }
            r4[r0] = r5     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r5 = r1.invoke(r3, r4)     // Catch:{ Exception -> 0x0031 }
            if (r5 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            java.lang.Class r1 = r5.getClass()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = "st_mode"
            java.lang.Object r5 = ys3.C118994e.m167759b(r1, r3, r5)     // Catch:{ Exception -> 0x0031 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0031 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0031 }
        L_0x002b:
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 <= 0) goto L_0x0030
            r0 = 1
        L_0x0030:
            return r0
        L_0x0031:
            r5 = move-exception
            ft3.C116895f.m164893e(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xs3.C118901f.m167647a(java.io.File):boolean");
    }

    /* renamed from: b */
    public static boolean m167648b() {
        String str = new String(C118989a.m167752b("/proc/mounts"));
        C116895f.m164891c("RiskScanner", "SetuidBitChecker mounts : " + str);
        String[] split = str.split("\n");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = split[i];
            if (!str2.contains(" /system ")) {
                i++;
            } else if (str2.contains(",nosuid")) {
                C116895f.m164890b("SetuidBitChecker : nosuid found");
                return true;
            }
        }
        return false;
    }
}
