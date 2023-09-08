package p1040te;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p1046ue.C90650d;
import p1046ue.C90652e;
import p1046ue.C90655f;
import p723vf.C118672d;

/* renamed from: te.d */
public abstract class C90397d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public List<C90398a> f259409d = new LinkedList();

    /* renamed from: te.d$a */
    public class C90398a {

        /* renamed from: a */
        public int f259410a;

        /* renamed from: b */
        public C90396c f259411b;

        public C90398a(C90397d dVar, int i, C90396c cVar) {
            this.f259410a = i;
            this.f259411b = cVar;
        }

        /* renamed from: a */
        public List<C90650d> mo124617a() {
            ArrayList arrayList = new ArrayList();
            C90396c cVar = this.f259411b;
            if (cVar == null) {
                return arrayList;
            }
            C90655f fVar = cVar.f259408a;
            fVar.getClass();
            C90652e eVar = C90652e.f260459f;
            synchronized (eVar.f260460a) {
                ((LinkedList) eVar.f260460a).remove(fVar);
            }
            return cVar.f259408a.f260465a;
        }

        /* renamed from: b */
        public void mo124618b() {
            C90396c cVar = this.f259411b;
            if (cVar != null) {
                C90655f fVar = cVar.f259408a;
                synchronized (fVar.f260465a) {
                    ((LinkedList) fVar.f260465a).clear();
                }
                C90655f fVar2 = cVar.f259408a;
                fVar2.getClass();
                C90652e eVar = C90652e.f260459f;
                synchronized (eVar.f260460a) {
                    if (!((LinkedList) eVar.f260460a).contains(fVar2)) {
                        ((LinkedList) eVar.f260460a).add(fVar2);
                    }
                }
            }
        }

        public String toString() {
            return "ActivityLeakMonitor{mActivityHashCode=" + this.f259410a + ", mMonitor=" + this.f259411b + '}';
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C90398a aVar = new C90398a(this, activity.hashCode(), new C90396c());
        aVar.mo124618b();
        C118672d.m167353c("matrix.LeakMonitorDefault", "onActivityCreated " + aVar, new Object[0]);
        synchronized (this.f259409d) {
            ((LinkedList) this.f259409d).add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r1.remove();
        r6 = r2.mo124617a().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r6.hasNext() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r1 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r3 = r1.f260451j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r3 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r3.f260662a != r2.f259410a) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r3 = (p1040te.C90399e) r5;
        r4 = r3.f259416i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        ((java.util.LinkedList) r3.f259416i).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        monitor-exit(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityDestroyed(android.app.Activity r6) {
        /*
            r5 = this;
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "matrix.LeakMonitorDefault"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onActivityDestroyed "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p723vf.C118672d.m167353c(r0, r1, r2)
            java.util.List<te.d$a> r0 = r5.f259409d
            monitor-enter(r0)
            java.util.List<te.d$a> r1 = r5.f259409d     // Catch:{ all -> 0x0078 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0078 }
        L_0x002a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0078 }
            te.d$a r2 = (p1040te.C90397d.C90398a) r2     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x0039
            goto L_0x002a
        L_0x0039:
            int r3 = r2.f259410a     // Catch:{ all -> 0x0078 }
            int r4 = r6.intValue()     // Catch:{ all -> 0x0078 }
            if (r3 != r4) goto L_0x002a
            r1.remove()     // Catch:{ all -> 0x0078 }
            java.util.List r6 = r2.mo124617a()     // Catch:{ all -> 0x0078 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0078 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0078 }
            ue.d r1 = (p1046ue.C90650d) r1     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x004c
            ve.a$a r3 = r1.f260451j     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x004c
            int r3 = r3.f260662a     // Catch:{ all -> 0x0078 }
            int r4 = r2.f259410a     // Catch:{ all -> 0x0078 }
            if (r3 != r4) goto L_0x004c
            r3 = r5
            te.e r3 = (p1040te.C90399e) r3     // Catch:{ all -> 0x0078 }
            java.util.List<ue.d> r4 = r3.f259416i     // Catch:{ all -> 0x0078 }
            monitor-enter(r4)     // Catch:{ all -> 0x0078 }
            java.util.List<ue.d> r3 = r3.f259416i     // Catch:{ all -> 0x0073 }
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x0073 }
            r3.add(r1)     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            goto L_0x004c
        L_0x0073:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r6     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1040te.C90397d.onActivityDestroyed(android.app.Activity):void");
    }

    public void onActivityPaused(Activity activity) {
        C118672d.m167353c("matrix.LeakMonitorDefault", "onActivityPaused " + activity.hashCode(), new Object[0]);
    }

    public void onActivityResumed(Activity activity) {
        C118672d.m167353c("matrix.LeakMonitorDefault", "onActivityResumed " + activity.hashCode(), new Object[0]);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C118672d.m167353c("matrix.LeakMonitorDefault", "onActivityStarted " + activity.hashCode(), new Object[0]);
    }

    public void onActivityStopped(Activity activity) {
        C118672d.m167353c("matrix.LeakMonitorDefault", "onActivityStopped " + activity.hashCode(), new Object[0]);
    }
}
