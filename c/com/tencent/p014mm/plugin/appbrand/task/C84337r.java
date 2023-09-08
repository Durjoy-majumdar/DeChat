package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import java.util.Queue;
import kr0.C88273g1;

/* renamed from: com.tencent.mm.plugin.appbrand.task.r */
public class C84337r<T extends C81879g> {

    /* renamed from: a */
    public final Queue<T> f246248a;

    /* renamed from: b */
    public final C88273g1[] f246249b = {C88273g1.WXA_JSAPI_PRELOAD, C88273g1.WXA_JSAPI_BATCH_PRELOAD};

    public C84337r(Queue<T> queue) {
        this.f246248a = queue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo117030a() {
        /*
            r5 = this;
            java.util.Queue<T> r0 = r5.f246248a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Queue<T> r0 = r5.f246248a
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.g r1 = (com.tencent.p014mm.plugin.appbrand.C81879g) r1
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.appbrand.page.C83928t1
            r3 = 0
            if (r2 == 0) goto L_0x0026
            r2 = r1
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2
            kr0.g1 r2 = r2.f245018b1
            goto L_0x002f
        L_0x0026:
            boolean r2 = r1 instanceof kr0.C88267e
            if (r2 == 0) goto L_0x003a
            r2 = r1
            kr0.e r2 = (kr0.C88267e) r2
            kr0.g1 r2 = r2.f255129N
        L_0x002f:
            if (r2 == 0) goto L_0x003a
            kr0.g1[] r4 = r5.f246249b
            boolean r2 = u24.C90595a.m113498b(r4, r2)
            if (r2 != 0) goto L_0x003a
            r3 = 1
        L_0x003a:
            if (r3 == 0) goto L_0x000f
            r0.remove()
            r1.mo114329F()
            goto L_0x000f
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84337r.mo117030a():void");
    }
}
