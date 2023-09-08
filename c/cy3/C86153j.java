package cy3;

import gy3.C87412m;
import java.io.File;
import java.util.Iterator;

/* renamed from: cy3.j */
public class C86153j extends C86152i {
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        cy3.C58003b.m67160a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        cy3.C58003b.m67160a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
        throw r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m106663b(java.io.File r6, java.io.File r7, boolean r8, int r9, int r10, java.lang.Object r11) {
        /*
            r11 = r10 & 2
            if (r11 == 0) goto L_0x0005
            r8 = 0
        L_0x0005:
            r10 = r10 & 4
            if (r10 == 0) goto L_0x000b
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x000b:
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r6, r10)
            java.lang.String r10 = "target"
            gy3.C87412m.m108594g(r7, r10)
            boolean r10 = r6.exists()
            if (r10 == 0) goto L_0x007c
            boolean r10 = r7.exists()
            if (r10 == 0) goto L_0x003b
            if (r8 == 0) goto L_0x0033
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x002b
            goto L_0x003b
        L_0x002b:
            cy3.c r8 = new cy3.c
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0033:
            cy3.c r8 = new cy3.c
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x003b:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0050
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x0048
            goto L_0x006d
        L_0x0048:
            cy3.d r8 = new cy3.d
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0050:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x0059
            r8.mkdirs()
        L_0x0059:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0075 }
            r6.<init>(r7)     // Catch:{ all -> 0x0075 }
            cy3.C86147a.m106659a(r8, r6, r9)     // Catch:{ all -> 0x006e }
            r9 = 0
            cy3.C58003b.m67160a(r6, r9)     // Catch:{ all -> 0x0075 }
            cy3.C58003b.m67160a(r8, r9)
        L_0x006d:
            return r7
        L_0x006e:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r9 = move-exception
            cy3.C58003b.m67160a(r6, r7)     // Catch:{ all -> 0x0075 }
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r7 = move-exception
            cy3.C58003b.m67160a(r8, r6)
            throw r7
        L_0x007c:
            cy3.l r7 = new cy3.l
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.C86153j.m106663b(java.io.File, java.io.File, boolean, int, int, java.lang.Object):java.io.File");
    }

    /* renamed from: c */
    public static final boolean m106664c(File file) {
        C87412m.m108594g(file, "<this>");
        Iterator it = new C24394e(file, C7142f.BOTTOM_UP).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }
}
