package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import ej0.C86525c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.m8 */
public final class C63571m8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86525c f180272d;

    /* renamed from: e */
    public final /* synthetic */ C56711j f180273e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63571m8(C86525c cVar, C56711j jVar) {
        super(0);
        this.f180272d = cVar;
        this.f180273e = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r6 = r6.f251382a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            java.lang.String r0 = "FinderProjectionScreenUIC"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onLinkingDevice mrDevice:"
            r1.append(r2)
            ej0.c r2 = r10.f180272d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            ej0.c r0 = r10.f180272d
            if (r0 == 0) goto L_0x007e
            ej0.b r0 = r0.f251382a
            if (r0 == 0) goto L_0x007e
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r10.f180273e
            java.util.ArrayList r0 = r0.mo80093f3()
            ej0.c r1 = r10.f180272d
            monitor-enter(r0)
            r2 = 0
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x007b }
            r4 = -1
            r5 = -1
        L_0x0030:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x007b }
            int r7 = r2 + 1
            r8 = 0
            if (r2 < 0) goto L_0x005c
            com.tencent.mm.plugin.finder.viewmodel.component.j$c r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.C56716c) r6     // Catch:{ all -> 0x007b }
            ej0.c r6 = r6.f162616a     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004c
            ej0.b r6 = r6.f251382a     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004c
            java.lang.String r6 = r6.f251380i     // Catch:{ all -> 0x007b }
            goto L_0x004d
        L_0x004c:
            r6 = r8
        L_0x004d:
            ej0.b r9 = r1.f251382a     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0053
            java.lang.String r8 = r9.f251380i     // Catch:{ all -> 0x007b }
        L_0x0053:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x005a
            r5 = r2
        L_0x005a:
            r2 = r7
            goto L_0x0030
        L_0x005c:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x007b }
            throw r8     // Catch:{ all -> 0x007b }
        L_0x0060:
            monitor-exit(r0)
            if (r5 == r4) goto L_0x007e
            if (r5 <= 0) goto L_0x007e
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r10.f180273e
            java.util.ArrayList r0 = r0.mo80093f3()
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x007e
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r10.f180273e
            com.tencent.mm.plugin.finder.viewmodel.component.j$a r0 = r0.mo80092e3()
            r0.notifyItemChanged(r5)
            goto L_0x007e
        L_0x007b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x007e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63571m8.invoke():java.lang.Object");
    }
}
