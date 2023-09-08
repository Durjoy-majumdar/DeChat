package pl0;

import java.util.LinkedList;
import tt0.C111053d;
import tt0.C78087b;

/* renamed from: pl0.x */
public class C110233x {

    /* renamed from: a */
    public static LinkedList<C111053d> f329755a = new LinkedList<>();

    /* renamed from: b */
    public static LinkedList<C78087b> f329756b = new LinkedList<>();

    static {
        new LinkedList();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static tt0.C111053d m149843a() {
        /*
            java.util.LinkedList<tt0.d> r0 = f329755a
            monitor-enter(r0)
            java.util.LinkedList<tt0.d> r1 = f329755a     // Catch:{ all -> 0x0031 }
            int r1 = r1.size()     // Catch:{ all -> 0x0031 }
            if (r1 > 0) goto L_0x000e
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r1
        L_0x000e:
            java.util.LinkedList<tt0.d> r1 = f329755a     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0031 }
            tt0.d r1 = (tt0.C111053d) r1     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x0019
            goto L_0x002f
        L_0x0019:
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            android.view.ViewParent r3 = r1.getParent()     // Catch:{ all -> 0x0031 }
            boolean r2 = r2.isInstance(r3)     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0026
            goto L_0x002f
        L_0x0026:
            android.view.ViewParent r2 = r1.getParent()     // Catch:{ all -> 0x0031 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0031 }
            r2.removeView(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r1
        L_0x0031:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pl0.C110233x.m149843a():tt0.d");
    }

    /* renamed from: b */
    public static boolean m149844b(C111053d dVar) {
        synchronized (f329755a) {
            if (f329755a.size() > 0) {
                return false;
            }
            f329755a.push(dVar);
            return true;
        }
    }
}
