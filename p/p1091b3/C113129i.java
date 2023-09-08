package p1091b3;

import p1091b3.C113130j;
import p329d3.C86165a;

/* renamed from: b3.i */
public class C113129i implements C86165a<C113130j.C113131a> {

    /* renamed from: a */
    public final /* synthetic */ String f338523a;

    public C113129i(String str) {
        this.f338523a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 >= r2.size()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        ((p329d3.C86165a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r5) {
        /*
            r4 = this;
            b3.j$a r5 = (p1091b3.C113130j.C113131a) r5
            java.lang.Object r0 = p1091b3.C113130j.f338526c
            monitor-enter(r0)
            u.i<java.lang.String, java.util.ArrayList<d3.a<b3.j$a>>> r1 = p1091b3.C113130j.f338527d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f338523a     // Catch:{ all -> 0x002e }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x002d
        L_0x0014:
            java.lang.String r3 = r4.f338523a     // Catch:{ all -> 0x002e }
            r1.remove(r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            r0 = 0
        L_0x001b:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002d
            java.lang.Object r1 = r2.get(r0)
            d3.a r1 = (p329d3.C86165a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x001b
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1091b3.C113129i.accept(java.lang.Object):void");
    }
}
