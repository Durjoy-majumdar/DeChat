package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k */
public class C18485k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C18479j f51326d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k$a */
    public class C18486a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f51327d;

        public C18486a(List list) {
            this.f51327d = list;
        }

        public void run() {
            ((LinkedList) C18485k.this.f51326d.f51311c).clear();
            ((LinkedList) C18485k.this.f51326d.f51311c).addAll(this.f51327d);
        }
    }

    public C18485k(C18479j jVar) {
        this.f51326d = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = r5.f51326d
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r0.f51309a
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x000d
            goto L_0x0051
        L_0x000d:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = r5.f51326d
            r0.getClass()
            r1 = 1
            java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51312d     // Catch:{ all -> 0x0029 }
            int r2 = r2.size()     // Catch:{ all -> 0x0029 }
            if (r2 <= 0) goto L_0x003a
            java.util.List<com.tencent.mm.storage.o0> r0 = r0.f51312d     // Catch:{ all -> 0x0029 }
            int r2 = r0.size()     // Catch:{ all -> 0x0029 }
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            com.tencent.mm.storage.o0 r0 = (com.tencent.p014mm.storage.C19623o0) r0     // Catch:{ all -> 0x0029 }
            goto L_0x003b
        L_0x0029:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r0 = r0.getMessage()
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.BizTimeLineImgLoader"
            java.lang.String r2 = "getItem error %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r1)
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            r2 = 5
            long r3 = r0.field_orderFlag
            java.util.List r0 = r1.mo25813uP(r2, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k$a r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.k$a
            r1.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18485k.run():void");
    }
}
