package os1;

import java.util.Comparator;
import os1.C35279a;
import ux3.C65486b;

/* renamed from: os1.c */
public final class C35283c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C35279a f94539d;

    /* renamed from: os1.c$a */
    public static final class C35284a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C35279a.C35280a) t2).f94536g), Long.valueOf(((C35279a.C35280a) t).f94536g));
        }
    }

    public C35283c(C35279a aVar) {
        this.f94539d = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|(1:4)|5|(1:7)|8|9|10|11|12|13|14|15|16|17|34|(2:36|37)(1:38)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|26|(2:28|29)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd A[SYNTHETIC, Splitter:B:28:0x00bd] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x00c0=Splitter:B:30:0x00c0, B:16:0x0078=Splitter:B:16:0x0078} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "Finder.18054CacheVM"
            os1.a r1 = r7.f94539d
            r2 = 0
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x00c1 }
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x00c1 }
            er1.w3 r4 = er1.C58784w3.f168295a     // Catch:{ all -> 0x00c1 }
            r5 = 9
            java.lang.String r4 = r4.mo83907W(r5)     // Catch:{ all -> 0x00c1 }
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x00c1 }
            boolean r4 = r3.mo119977o()     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x001d
            r3.mo119966f()     // Catch:{ all -> 0x00c1 }
        L_0x001d:
            boolean r4 = r3.mo119967g()     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x0026
            r3.mo119987x()     // Catch:{ all -> 0x00c1 }
        L_0x0026:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r4.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r3.mo119971i()     // Catch:{ all -> 0x00c1 }
            r4.append(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "/18054.ext"
            r4.append(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00c1 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ all -> 0x00c1 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, os1.a$a> r4 = r1.f94532h     // Catch:{ all -> 0x00c1 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = "cache.values"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00c1 }
            os1.c$a r5 = new os1.c$a     // Catch:{ all -> 0x00c1 }
            r5.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.List r4 = sx3.C110818d0.m150943o0(r4, r5)     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            int r1 = r1.f94531g     // Catch:{ all -> 0x00c1 }
            int r6 = r4.size()     // Catch:{ all -> 0x00c1 }
            int r1 = java.lang.Math.min(r1, r6)     // Catch:{ all -> 0x00c1 }
            java.util.List r1 = r4.subList(r2, r1)     // Catch:{ all -> 0x00c1 }
            r5.<init>(r1)     // Catch:{ all -> 0x00c1 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00c1 }
            r4 = 512(0x200, float:7.175E-43)
            r1.<init>(r4)     // Catch:{ all -> 0x00c1 }
            r4 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x00b3 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x00b3 }
            r6.writeObject(r5)     // Catch:{ IOException -> 0x00ae, all -> 0x00ac }
            r6.close()     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x00c1 }
            int r1 = com.tencent.p014mm.vfs.C86013q1.m106437S(r3, r1)     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r3.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = "[storeCache] ret="
            r3.append(r4)     // Catch:{ all -> 0x00c1 }
            r3.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = " store cache["
            r3.append(r1)     // Catch:{ all -> 0x00c1 }
            int r1 = r5.size()     // Catch:{ all -> 0x00c1 }
            r3.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "]."
            r3.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00c1 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c1 }
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x00cc
        L_0x00ac:
            r1 = move-exception
            goto L_0x00bb
        L_0x00ae:
            r1 = move-exception
            r4 = r6
            goto L_0x00b4
        L_0x00b1:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b3:
            r1 = move-exception
        L_0x00b4:
            u24.e r3 = new u24.e     // Catch:{ all -> 0x00b1 }
            r3.<init>(r1)     // Catch:{ all -> 0x00b1 }
            throw r3     // Catch:{ all -> 0x00b1 }
        L_0x00ba:
            r6 = r4
        L_0x00bb:
            if (r6 == 0) goto L_0x00c0
            r6.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)
        L_0x00cc:
            java.lang.Throwable r1 = kotlin.Result.m168117exceptionOrNullimpl(r1)
            if (r1 == 0) goto L_0x00d9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r3, r2)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C35283c.run():void");
    }
}
