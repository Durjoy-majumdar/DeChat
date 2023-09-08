package qs0;

import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: qs0.g */
public final class C36075g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32224a<List<String>> f96161d;

    /* renamed from: qs0.g$a */
    public static final class C36076a<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ Map<C86009m1, Long> f96162d;

        public C36076a(Map<C86009m1, Long> map) {
            this.f96162d = map;
        }

        public int compare(Object obj, Object obj2) {
            Long l = this.f96162d.get((C86009m1) obj);
            C87412m.m108591d(l);
            long longValue = l.longValue();
            Long l2 = this.f96162d.get((C86009m1) obj2);
            C87412m.m108591d(l2);
            return (int) (longValue - l2.longValue());
        }
    }

    public C36075g(C32224a<? extends List<String>> aVar) {
        this.f96161d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            qs0.f r0 = qs0.C101246f.f296460a
            com.tencent.mm.vfs.m1 r0 = r0.mo140717b()
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            java.lang.String r1 = "MicroMsg.AppBrand.ThumbCdnCacheManager"
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "onCacheStart, allFiles is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0014:
            r2 = 0
            r4 = r17
            fy3.a<java.util.List<java.lang.String>> r5 = r4.f96161d
            java.lang.Object r5 = r5.invoke()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = 0
        L_0x0028:
            r10 = 2
            r11 = 0
            if (r9 >= r7) goto L_0x0069
            r12 = r0[r9]
            long r13 = r12.mo119980r()
            long r2 = r2 + r13
            java.lang.String r13 = r12.getName()
            java.lang.String r14 = "file.name"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.String r14 = ".mark"
            boolean r10 = z04.C112551y.m153808h(r13, r14, r8, r10, r11)
            if (r10 == 0) goto L_0x0060
            java.util.Iterator r10 = r5.iterator()
        L_0x0048:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x005c
            java.lang.Object r14 = r10.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = z04.C112551y.m153819s(r13, r15, r8)
            if (r15 == 0) goto L_0x0048
            r11 = r14
        L_0x005c:
            if (r11 != 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 == 0) goto L_0x0066
            r6.add(r12)
        L_0x0066:
            int r9 = r9 + 1
            goto L_0x0028
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "onCacheStart, totalSize: "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r12 = 268435456(0x10000000, double:1.32624737E-315)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x008a
            java.lang.String r0 = "onCacheStart, not need trim"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x008a:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "onCacheStart, markFiles is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0096:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r5 = 10
            int r7 = sx3.C36907w.m41090l(r6, r5)
            int r7 = sx3.C90363p0.m113142a(r7)
            r9 = 16
            if (r7 >= r9) goto L_0x00a8
            r7 = 16
        L_0x00a8:
            r0.<init>(r7)
            java.util.Iterator r7 = r6.iterator()
        L_0x00af:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00c8
            java.lang.Object r9 = r7.next()
            r14 = r9
            com.tencent.mm.vfs.m1 r14 = (com.tencent.p014mm.vfs.C86009m1) r14
            long r14 = r14.mo119979q()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r0.put(r9, r14)
            goto L_0x00af
        L_0x00c8:
            java.util.List r6 = sx3.C110818d0.m150900B0(r6)
            qs0.g$a r7 = new qs0.g$a     // Catch:{ Exception -> 0x00d5 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00d5 }
            sx3.C77813z.m93909o(r6, r7)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00ea
        L_0x00d5:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "onCacheStart, sort fail since "
            r7.append(r9)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x00ea:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r0 = r6.iterator()
        L_0x00f0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01b2
            java.lang.Object r6 = r0.next()
            com.tencent.mm.vfs.m1 r6 = (com.tencent.p014mm.vfs.C86009m1) r6
            java.lang.String r7 = r6.mo119971i()
            java.lang.String r9 = "markFile.absolutePath"
            gy3.C87412m.m108593f(r7, r9)
            java.lang.String r9 = ".temp.mark"
            boolean r9 = z04.C112551y.m153808h(r7, r9, r8, r10, r11)
            java.lang.String r14 = ".res"
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r9 == 0) goto L_0x012f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r16 = r7.length()
            int r10 = r16 + -10
            java.lang.String r10 = r7.substring(r8, r10)
            gy3.C87412m.m108593f(r10, r15)
            r9.append(r10)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            goto L_0x014b
        L_0x012f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r7.length()
            int r10 = r10 + -5
            java.lang.String r10 = r7.substring(r8, r10)
            gy3.C87412m.m108593f(r10, r15)
            r9.append(r10)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
        L_0x014b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "onCacheStart, markFilePath(virtual): "
            r10.append(r14)
            r10.append(r7)
            java.lang.String r7 = ", cacheFilePath(virtual): "
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r9)
            long r9 = r6.mo119980r()
            long r14 = r7.mo119980r()
            long r9 = r9 + r14
            boolean r6 = r6.mo119966f()
            boolean r7 = r7.mo119966f()
            long r2 = r2 - r9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "onCacheStart, trimSize: "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r9 = ", totalSize: "
            r14.append(r9)
            r14.append(r2)
            java.lang.String r9 = ", markDeleted: "
            r14.append(r9)
            r14.append(r6)
            java.lang.String r6 = ", cacheDeleted: "
            r14.append(r6)
            r14.append(r7)
            java.lang.String r6 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r10 = 2
            goto L_0x00f0
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qs0.C36075g.run():void");
    }
}
