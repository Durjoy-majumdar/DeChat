package v34;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import l34.C117459k;
import m34.C117527b;

/* renamed from: v34.b */
public final class C118646b implements C117459k {

    /* renamed from: d */
    public Set<C117459k> f355035d;

    /* renamed from: e */
    public volatile boolean f355036e;

    /* renamed from: f */
    public static void m167316f(Collection<C117459k> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (C117459k d : collection) {
                try {
                    d.mo182165d();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            C117527b.m165773a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo183370a(C117459k kVar) {
        if (!kVar.mo182164c()) {
            if (!this.f355036e) {
                synchronized (this) {
                    if (!this.f355036e) {
                        if (this.f355035d == null) {
                            this.f355035d = new HashSet(4);
                        }
                        this.f355035d.add(kVar);
                        return;
                    }
                }
            }
            kVar.mo182165d();
        }
    }

    /* renamed from: b */
    public void mo183371b() {
        if (!this.f355036e) {
            synchronized (this) {
                if (!this.f355036e) {
                    Set<C117459k> set = this.f355035d;
                    if (set != null) {
                        this.f355035d = null;
                        m167316f(set);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f355036e;
    }

    /* renamed from: d */
    public void mo182165d() {
        if (!this.f355036e) {
            synchronized (this) {
                if (!this.f355036e) {
                    this.f355036e = true;
                    Set<C117459k> set = this.f355035d;
                    this.f355035d = null;
                    m167316f(set);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r2.mo182165d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183372e(l34.C117459k r2) {
        /*
            r1 = this;
            boolean r0 = r1.f355036e
            if (r0 != 0) goto L_0x001e
            monitor-enter(r1)
            boolean r0 = r1.f355036e     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            java.util.Set<l34.k> r0 = r1.f355035d     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001b }
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            r2.mo182165d()
            goto L_0x001e
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v34.C118646b.mo183372e(l34.k):void");
    }
}
