package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l2 */
public abstract class C29527l2 implements C82724i0 {

    /* renamed from: d */
    public volatile boolean f80412d;

    /* renamed from: e */
    public final Object f80413e = new Object();

    /* renamed from: f */
    public Set<C29528a> f80414f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l2$a */
    public static final class C29528a implements C82724i0.C29522b {

        /* renamed from: a */
        public final long f80415a;

        /* renamed from: b */
        public final boolean f80416b;

        /* renamed from: c */
        public final C82724i0.C29521a f80417c;

        public C29528a(long j, boolean z, C82724i0.C29521a aVar) {
            this.f80415a = j;
            this.f80416b = z;
            this.f80417c = aVar;
        }

        /* renamed from: a */
        public boolean mo56769a() {
            return this.f80416b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29528a)) {
                return false;
            }
            C29528a aVar = (C29528a) obj;
            return this.f80415a == aVar.f80415a && this.f80416b == aVar.f80416b && C87412m.m108589b(this.f80417c, aVar.f80417c);
        }

        public int hashCode() {
            long j = this.f80415a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            boolean z = this.f80416b;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            C82724i0.C29521a aVar = this.f80417c;
            return i2 + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Session(sessionId=" + this.f80415a + ", gainFocus=" + this.f80416b + ", onAudioFocusChange=" + this.f80417c + ')';
        }
    }

    /* renamed from: c */
    public abstract boolean mo56764c();

    /* renamed from: d */
    public final C29528a mo56772d(boolean z, C82724i0.C29521a aVar, boolean z2) {
        C29528a aVar2;
        synchronized (this.f80413e) {
            aVar2 = new C29528a((long) (aVar != null ? aVar.hashCode() : 0), z, aVar);
            if (z2) {
                Set set = this.f80414f;
                if (set == null) {
                    set = new HashSet();
                    this.f80414f = set;
                }
                set.add(aVar2);
            }
        }
        return aVar2;
    }

    /* renamed from: e */
    public abstract String mo56765e();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56767i(com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0.C29522b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "session"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.media.C29527l2.C29528a
            r1 = 0
            if (r0 != 0) goto L_0x0015
            java.lang.String r7 = r6.mo56765e()
            java.lang.String r0 = "abandonFocus, unknown session"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return r1
        L_0x0015:
            com.tencent.mm.plugin.appbrand.jsapi.media.l2$a r7 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.C29527l2.C29528a) r7
            java.lang.Object r0 = r6.f80413e
            monitor-enter(r0)
            java.util.Set<com.tencent.mm.plugin.appbrand.jsapi.media.l2$a> r2 = r6.f80414f     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0023
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x0076 }
            r2.remove(r7)     // Catch:{ all -> 0x0076 }
        L_0x0023:
            java.util.Set<com.tencent.mm.plugin.appbrand.jsapi.media.l2$a> r7 = r6.f80414f     // Catch:{ all -> 0x0076 }
            r2 = 1
            if (r7 == 0) goto L_0x0033
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ all -> 0x0076 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r7 = 0
            goto L_0x0034
        L_0x0033:
            r7 = 1
        L_0x0034:
            r3 = 0
            if (r7 == 0) goto L_0x003b
            r6.f80414f = r3     // Catch:{ all -> 0x0076 }
            r7 = 1
            goto L_0x003c
        L_0x003b:
            r7 = 0
        L_0x003c:
            monitor-exit(r0)
            java.lang.String r0 = r6.mo56765e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "abandonFocusForSession, need do real abandonFocus: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            if (r7 == 0) goto L_0x0075
            boolean r7 = r6.mo56764c()
            if (r7 == 0) goto L_0x0074
            r6.f80412d = r1
            java.lang.Object r7 = r6.f80413e
            monitor-enter(r7)
            java.util.Set<com.tencent.mm.plugin.appbrand.jsapi.media.l2$a> r0 = r6.f80414f     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006b
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0071 }
            r0.clear()     // Catch:{ all -> 0x0071 }
        L_0x006b:
            r6.f80414f = r3     // Catch:{ all -> 0x0071 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0071 }
            monitor-exit(r7)
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0074:
            return r1
        L_0x0075:
            return r2
        L_0x0076:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C29527l2.mo56767i(com.tencent.mm.plugin.appbrand.jsapi.media.i0$b):boolean");
    }

    /* renamed from: k */
    public final void mo56773k() {
        Set<C29528a> emptySet;
        Log.m105924i(mo56765e(), "onAudioFocusPause");
        this.f80412d = false;
        synchronized (this.f80413e) {
            Set<C29528a> set = this.f80414f;
            emptySet = set == null ? Collections.emptySet() : new HashSet<>(set);
        }
        C87412m.m108593f(emptySet, "sessionSetSnapshot");
        for (C29528a aVar : emptySet) {
            C82724i0.C29521a aVar2 = aVar.f80417c;
            if (aVar2 != null) {
                aVar2.onPause();
            }
        }
    }

    /* renamed from: l */
    public final void mo56774l() {
        Set<C29528a> emptySet;
        Log.m105924i(mo56765e(), "onAudioFocusResume");
        this.f80412d = true;
        synchronized (this.f80413e) {
            Set<C29528a> set = this.f80414f;
            emptySet = set == null ? Collections.emptySet() : new HashSet<>(set);
        }
        C87412m.m108593f(emptySet, "sessionSetSnapshot");
        for (C29528a aVar : emptySet) {
            C82724i0.C29521a aVar2 = aVar.f80417c;
            if (aVar2 != null) {
                aVar2.onResume();
            }
        }
    }

    /* renamed from: o */
    public final void mo56775o() {
        Set<C29528a> emptySet;
        Log.m105924i(mo56765e(), "onAudioFocusStop");
        this.f80412d = false;
        synchronized (this.f80413e) {
            Set<C29528a> set = this.f80414f;
            emptySet = set == null ? Collections.emptySet() : new HashSet<>(set);
        }
        C87412m.m108593f(emptySet, "sessionSetSnapshot");
        for (C29528a aVar : emptySet) {
            C82724i0.C29521a aVar2 = aVar.f80417c;
            if (aVar2 != null) {
                aVar2.onStop();
            }
        }
    }

    /* renamed from: q */
    public abstract boolean mo56766q();

    /* renamed from: v */
    public final C82724i0.C29522b mo56768v(C82724i0.C29521a aVar) {
        if (this.f80412d) {
            return mo56772d(true, aVar, true);
        }
        if (!mo56766q()) {
            return mo56772d(false, aVar, false);
        }
        this.f80412d = true;
        return mo56772d(true, aVar, true);
    }
}
