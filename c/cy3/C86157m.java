package cy3;

import gy3.C87412m;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import y04.C112349m;
import y04.C15925h;

/* renamed from: cy3.m */
public final class C86157m {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        cy3.C58003b.m67160a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106665a(java.io.Reader r3, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r4) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "action"
            gy3.C87412m.m108594g(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            y04.h r1 = m106666b(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.invoke(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0036 }
            cy3.C58003b.m67160a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            cy3.C58003b.m67160a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.C86157m.m106665a(java.io.Reader, fy3.l):void");
    }

    /* renamed from: b */
    public static final C15925h<String> m106666b(BufferedReader bufferedReader) {
        C87412m.m108594g(bufferedReader, "<this>");
        return C112349m.m153279b(new C86154k(bufferedReader));
    }

    /* renamed from: c */
    public static final String m106667c(Reader reader) {
        C87412m.m108594g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        C87412m.m108593f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
