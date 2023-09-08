package q34;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import l34.C117459k;

/* renamed from: q34.m */
public final class C118165m implements C117459k {

    /* renamed from: d */
    public List<C117459k> f353196d;

    /* renamed from: e */
    public volatile boolean f353197e;

    public C118165m() {
    }

    /* renamed from: a */
    public void mo182955a(C117459k kVar) {
        if (!kVar.mo182164c()) {
            if (!this.f353197e) {
                synchronized (this) {
                    if (!this.f353197e) {
                        List list = this.f353196d;
                        if (list == null) {
                            list = new LinkedList();
                            this.f353196d = list;
                        }
                        list.add(kVar);
                        return;
                    }
                }
            }
            kVar.mo182165d();
        }
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f353197e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r0 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.next().mo182165d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r1.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        m34.C117527b.m165773a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo182165d() {
        /*
            r3 = this;
            boolean r0 = r3.f353197e
            if (r0 != 0) goto L_0x003e
            monitor-enter(r3)
            boolean r0 = r3.f353197e     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            return
        L_0x000b:
            r0 = 1
            r3.f353197e = r0     // Catch:{ all -> 0x003b }
            java.util.List<l34.k> r0 = r3.f353196d     // Catch:{ all -> 0x003b }
            r1 = 0
            r3.f353196d = r1     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0017
            goto L_0x003e
        L_0x0017:
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()
            l34.k r2 = (l34.C117459k) r2
            r2.mo182165d()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r2 = move-exception
            if (r1 != 0) goto L_0x0033
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0033:
            r1.add(r2)
            goto L_0x001b
        L_0x0037:
            m34.C117527b.m165773a(r1)
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q34.C118165m.mo182165d():void");
    }

    public C118165m(C117459k... kVarArr) {
        this.f353196d = new LinkedList(Arrays.asList(kVarArr));
    }

    public C118165m(C117459k kVar) {
        LinkedList linkedList = new LinkedList();
        this.f353196d = linkedList;
        linkedList.add(kVar);
    }
}
