package p981ie;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: ie.l */
public class C108457l {

    /* renamed from: a */
    public final String f324774a;

    /* renamed from: b */
    public final int[] f324775b;

    public C108457l(int i, int[] iArr) {
        this.f324774a = "/proc/" + i + "/time_in_state";
        this.f324775b = iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 < 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r0.add(r5);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<long[]> mo158999a() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0062 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = r9.f324774a     // Catch:{ all -> 0x0062 }
            r2.<init>(r3)     // Catch:{ all -> 0x0062 }
            r1.<init>(r2)     // Catch:{ all -> 0x0062 }
            android.text.TextUtils$SimpleStringSplitter r2 = new android.text.TextUtils$SimpleStringSplitter     // Catch:{ all -> 0x0058 }
            r3 = 32
            r2.<init>(r3)     // Catch:{ all -> 0x0058 }
            r3 = -1
            r4 = 0
            r5 = 0
        L_0x001b:
            r6 = 0
        L_0x001c:
            java.lang.String r7 = r1.readLine()     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r8 = "cpu"
            boolean r8 = r7.startsWith(r8)     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x0038
            if (r3 < 0) goto L_0x002f
            r0.add(r5)     // Catch:{ all -> 0x0058 }
        L_0x002f:
            int r3 = r3 + 1
            int[] r5 = r9.f324775b     // Catch:{ all -> 0x0058 }
            r5 = r5[r3]     // Catch:{ all -> 0x0058 }
            long[] r5 = new long[r5]     // Catch:{ all -> 0x0058 }
            goto L_0x001b
        L_0x0038:
            int[] r8 = r9.f324775b     // Catch:{ all -> 0x0058 }
            r8 = r8[r3]     // Catch:{ all -> 0x0058 }
            if (r6 >= r8) goto L_0x001c
            r2.setString(r7)     // Catch:{ all -> 0x0058 }
            r2.next()     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = r2.next()     // Catch:{ all -> 0x0058 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0058 }
            r5[r6] = r7     // Catch:{ all -> 0x0058 }
            int r6 = r6 + 1
            goto L_0x001c
        L_0x0051:
            r0.add(r5)     // Catch:{ all -> 0x0058 }
            r1.close()     // Catch:{ all -> 0x0062 }
            return r0
        L_0x0058:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0062 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read cpu-freq: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C108457l.mo158999a():java.util.List");
    }

    /* renamed from: b */
    public void mo159000b() {
        ArrayList arrayList = (ArrayList) mo158999a();
        if (this.f324775b.length == arrayList.size()) {
            int i = 0;
            while (i < arrayList.size()) {
                long[] jArr = (long[]) arrayList.get(i);
                if (this.f324775b[i] == jArr.length) {
                    i++;
                } else {
                    throw new IOException("Cpu clusterStepNum unmatched, expect = " + this.f324775b[i] + ", actual = " + jArr.length + ", cluster = " + i);
                }
            }
            return;
        }
        throw new IOException("Cpu clusterNum unmatched, expect = " + this.f324775b.length + ", actual = " + arrayList.size());
    }
}
