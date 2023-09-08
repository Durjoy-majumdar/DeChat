package com.tencent.p014mm.plugin.finder.feed.model;

import cj1.C0539f6;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sx3.C110818d0;
import te3.C49098d51;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.v */
public final class C2816v {

    /* renamed from: a */
    public static final C2816v f14072a = new C2816v();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, ArrayList<C2817a>> f14073b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C0539f6> f14074c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final List<C49098d51> f14075d = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.v$a */
    public static final class C2817a {

        /* renamed from: a */
        public C49098d51 f14076a;

        /* renamed from: b */
        public long f14077b;

        public C2817a(C49098d51 d512, long j, int i, C8480h hVar) {
            j = (i & 2) != 0 ? System.currentTimeMillis() : j;
            C87412m.m108594g(d512, "info");
            this.f14076a = d512;
            this.f14077b = j;
        }

        /* renamed from: a */
        public final boolean mo2917a() {
            long currentTimeMillis = System.currentTimeMillis() - this.f14077b;
            C2816v vVar = C2816v.f14072a;
            return currentTimeMillis < ((long) 600000);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2817a)) {
                return false;
            }
            C2817a aVar = (C2817a) obj;
            return C87412m.m108589b(this.f14076a, aVar.f14076a) && this.f14077b == aVar.f14077b;
        }

        public int hashCode() {
            long j = this.f14077b;
            return (this.f14076a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "NoticeInfoCacheItem(info=" + this.f14076a + ", timeStamp=" + this.f14077b + ')';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.tencent.mm.plugin.finder.feed.model.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.tencent.mm.plugin.finder.feed.model.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.tencent.mm.plugin.finder.feed.model.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.tencent.mm.plugin.finder.feed.model.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.tencent.mm.plugin.finder.feed.model.v$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2912a(java.lang.String r8, java.lang.String r9, te3.C49098d51 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "noticeId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.v$a>> r0 = f14073b
            monitor-enter(r0)
            java.lang.String r1 = "FinderFeedLiveNoticeCache"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r2.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "[add] userName:"
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            r2.append(r8)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = " id: "
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r10.f132122h     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = " status: "
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            int r3 = r10.f132119e     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00bc }
            boolean r1 = r0.containsKey(r8)     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.get(r8)     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00bc }
            r2 = 0
            if (r1 == 0) goto L_0x006a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00bc }
        L_0x0050:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x0068
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00bc }
            r4 = r3
            com.tencent.mm.plugin.finder.feed.model.v$a r4 = (com.tencent.p014mm.plugin.finder.feed.model.C2816v.C2817a) r4     // Catch:{ all -> 0x00bc }
            te3.d51 r4 = r4.f14076a     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r4.f132122h     // Catch:{ all -> 0x00bc }
            boolean r4 = gy3.C87412m.m108589b(r4, r9)     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x0050
            r2 = r3
        L_0x0068:
            com.tencent.mm.plugin.finder.feed.model.v$a r2 = (com.tencent.p014mm.plugin.finder.feed.model.C2816v.C2817a) r2     // Catch:{ all -> 0x00bc }
        L_0x006a:
            if (r2 == 0) goto L_0x0072
            boolean r9 = r2.mo2917a()     // Catch:{ all -> 0x00bc }
            if (r9 != 0) goto L_0x00b8
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.v$a>> r9 = f14073b     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r9.get(r8)     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0083
            java.util.Collection r1 = gy3.C24564k0.m30737a(r1)     // Catch:{ all -> 0x00bc }
            r1.remove(r2)     // Catch:{ all -> 0x00bc }
        L_0x0083:
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00b8
            com.tencent.mm.plugin.finder.feed.model.v$a r9 = new com.tencent.mm.plugin.finder.feed.model.v$a     // Catch:{ all -> 0x00bc }
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r5, r6)     // Catch:{ all -> 0x00bc }
            r8.add(r9)     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x009a:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00bc }
            r9.<init>()     // Catch:{ all -> 0x00bc }
            r0.put(r8, r9)     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r0.get(r8)     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00b8
            com.tencent.mm.plugin.finder.feed.model.v$a r9 = new com.tencent.mm.plugin.finder.feed.model.v$a     // Catch:{ all -> 0x00bc }
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r5, r6)     // Catch:{ all -> 0x00bc }
            r8.add(r9)     // Catch:{ all -> 0x00bc }
        L_0x00b8:
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00bc }
            monitor-exit(r0)
            return
        L_0x00bc:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C2816v.mo2912a(java.lang.String, java.lang.String, te3.d51):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2 == false) goto L_0x0059;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2913b(java.lang.String r9, com.tencent.p014mm.protocal.protobuf.FinderObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cj1.f6> r0 = f14074c
            monitor-enter(r0)
            java.lang.String r1 = "FinderFeedLiveNoticeCache"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r2.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "[add] userName:"
            r2.append(r3)     // Catch:{ all -> 0x005d }
            r2.append(r9)     // Catch:{ all -> 0x005d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x005d }
            boolean r1 = r0.containsKey(r9)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x005d }
            cj1.f6 r1 = (cj1.C0539f6) r1     // Catch:{ all -> 0x005d }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0048
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005d }
            long r6 = r1.f1308b     // Catch:{ all -> 0x005d }
            long r4 = r4 - r6
            r6 = 600000(0x927c0, double:2.964394E-318)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0044
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 == 0) goto L_0x0059
        L_0x004b:
            cj1.f6 r7 = new cj1.f6     // Catch:{ all -> 0x005d }
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r10
            r1.<init>(r2, r3, r5, r6)     // Catch:{ all -> 0x005d }
            r0.put(r9, r7)     // Catch:{ all -> 0x005d }
        L_0x0059:
            rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005d }
            monitor-exit(r0)
            return
        L_0x005d:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C2816v.mo2913b(java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    /* renamed from: c */
    public final C49098d51 mo2914c(String str) {
        C49098d51 d512;
        C49098d51 d513;
        C87412m.m108594g(str, "userName");
        ConcurrentHashMap<String, ArrayList<C2817a>> concurrentHashMap = f14073b;
        synchronized (concurrentHashMap) {
            ArrayList arrayList = concurrentHashMap.get(str);
            d512 = null;
            C2817a aVar = arrayList != null ? (C2817a) C110818d0.m150916N(arrayList) : null;
            ArrayList<C2817a> arrayList2 = concurrentHashMap.get(str);
            if (arrayList2 != null) {
                for (C2817a aVar2 : arrayList2) {
                    if (aVar2.f14076a.f132118d < ((aVar == null || (d513 = aVar.f14076a) == null) ? 0 : d513.f132118d)) {
                        aVar = aVar2;
                    }
                }
            }
            if (aVar != null) {
                if (!aVar.mo2917a()) {
                    ArrayList arrayList3 = f14073b.get(str);
                    if (arrayList3 != null) {
                        arrayList3.remove(aVar);
                    }
                } else {
                    d512 = aVar.f14076a;
                }
            }
        }
        return d512;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r8 = r3.f14076a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C49098d51 mo2915d(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "noticeId"
            gy3.C87412m.m108594g(r8, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.v$a>> r0 = f14073b
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0083 }
            r2 = 0
            if (r1 == 0) goto L_0x0037
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0083 }
        L_0x001b:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0083 }
            r4 = r3
            com.tencent.mm.plugin.finder.feed.model.v$a r4 = (com.tencent.p014mm.plugin.finder.feed.model.C2816v.C2817a) r4     // Catch:{ all -> 0x0083 }
            te3.d51 r4 = r4.f14076a     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r4.f132122h     // Catch:{ all -> 0x0083 }
            boolean r4 = gy3.C87412m.m108589b(r4, r8)     // Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x001b
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            com.tencent.mm.plugin.finder.feed.model.v$a r3 = (com.tencent.p014mm.plugin.finder.feed.model.C2816v.C2817a) r3     // Catch:{ all -> 0x0083 }
            goto L_0x0038
        L_0x0037:
            r3 = r2
        L_0x0038:
            java.lang.String r1 = "FinderFeedLiveNoticeCache"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r4.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "[get] userName:"
            r4.append(r5)     // Catch:{ all -> 0x0083 }
            r4.append(r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = " id: "
            r4.append(r5)     // Catch:{ all -> 0x0083 }
            r4.append(r8)     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = " status: "
            r4.append(r8)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x005d
            te3.d51 r8 = r3.f14076a     // Catch:{ all -> 0x0083 }
            if (r8 == 0) goto L_0x005d
            int r8 = r8.f132119e     // Catch:{ all -> 0x0083 }
            goto L_0x005e
        L_0x005d:
            r8 = -1
        L_0x005e:
            r4.append(r8)     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0081
            boolean r8 = r3.mo2917a()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.v$a>> r8 = f14073b     // Catch:{ all -> 0x0083 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0081
            r7.remove(r3)     // Catch:{ all -> 0x0083 }
            goto L_0x0081
        L_0x007e:
            te3.d51 r7 = r3.f14076a     // Catch:{ all -> 0x0083 }
            r2 = r7
        L_0x0081:
            monitor-exit(r0)
            return r2
        L_0x0083:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C2816v.mo2915d(java.lang.String, java.lang.String):te3.d51");
    }

    /* renamed from: e */
    public final C0539f6 mo2916e(String str) {
        C0539f6 f6Var;
        C87412m.m108594g(str, "userName");
        ConcurrentHashMap<String, C0539f6> concurrentHashMap = f14074c;
        synchronized (concurrentHashMap) {
            C0539f6 f6Var2 = concurrentHashMap.get(str);
            f6Var = null;
            if (f6Var2 != null) {
                if (!(System.currentTimeMillis() - f6Var2.f1308b < 600000)) {
                    f14073b.remove(str);
                    f6Var2 = null;
                }
                f6Var = f6Var2;
            }
        }
        return f6Var;
    }
}
