package da1;

import android.app.Activity;
import ba1.C113155g;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import op3.C117877b;
import te3.C118427eg2;
import te3.C118438ja3;
import te3.C22505ka3;
import te3.C64220a24;
import te3.C64250b24;

/* renamed from: da1.c */
public final class C116606c {

    /* renamed from: a */
    public static final Map<Integer, WeakReference<Activity>> f349667a = new HashMap();

    /* renamed from: a */
    public static void m164450a(Object obj, C22505ka3 ka32, boolean z) {
        HellSessionUBACloudConfig.m162216a().getClass();
        C64220a24 a = C113155g.m154832a();
        if (a != null && !a.f182010d) {
            Iterator<C64250b24> it = a.f182011e.iterator();
            while (it.hasNext()) {
                C64250b24 next = it.next();
                if (next != null) {
                    Iterator<C118438ja3> it4 = next.f182208e.iterator();
                    while (it4.hasNext()) {
                        C118438ja3 next2 = it4.next();
                        if (next2 != null) {
                            C117877b<C118427eg2, Integer> e = C113264b.m155059e(ka32.f64087d, obj.getClass().getSimpleName());
                            if (e != null) {
                                C118427eg2 eg22 = (C118427eg2) e.mo182596a(0);
                                C116605b.m164445a(obj, next2, eg22, true, z);
                                C113264b.m155063i(eg22, ((Integer) e.mo182596a(1)).intValue());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m164451b(int r3) {
        /*
            java.lang.Class<da1.c> r0 = da1.C116606c.class
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<android.app.Activity>> r1 = f349667a     // Catch:{ all -> 0x0032 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0032 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0032 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0032 }
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0032 }
            if (r3 != 0) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            boolean r1 = r3.isDestroyed()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0024
            monitor-exit(r0)
            return
        L_0x0024:
            te3.ka3 r1 = ba1.C16777c.m16413e()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002e
            r2 = 0
            m164450a(r3, r1, r2)     // Catch:{ all -> 0x0032 }
        L_0x002e:
            monitor-exit(r0)
            return
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: da1.C116606c.m164451b(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m164452c(int r3) {
        /*
            java.lang.Class<da1.c> r0 = da1.C116606c.class
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<android.app.Activity>> r1 = f349667a     // Catch:{ all -> 0x0032 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0032 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0032 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0032 }
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0032 }
            if (r3 != 0) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            boolean r1 = r3.isDestroyed()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0024
            monitor-exit(r0)
            return
        L_0x0024:
            te3.ka3 r1 = ba1.C16777c.m16413e()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002e
            r2 = 1
            m164450a(r3, r1, r2)     // Catch:{ all -> 0x0032 }
        L_0x002e:
            monitor-exit(r0)
            return
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: da1.C116606c.m164452c(int):void");
    }
}
