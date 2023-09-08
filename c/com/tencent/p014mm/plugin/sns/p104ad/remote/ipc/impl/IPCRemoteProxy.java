package com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl;

import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import qp2.C101232a;

/* renamed from: com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy */
public final class IPCRemoteProxy extends C96897a {

    /* renamed from: f */
    public C101232a f274150f;

    public IPCRemoteProxy(C96905d dVar, C101232a aVar) {
        super(dVar);
        this.f274150f = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a A[Catch:{ all -> 0x005f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallback(java.lang.String r9, android.os.Bundle r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r9 = "onCallback"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            r1 = 0
            if (r11 != 0) goto L_0x0063
            java.lang.String r11 = "onServerCall"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            qp2.a r2 = new qp2.a     // Catch:{ all -> 0x005f }
            r2.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "setRemoteProxy"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x005f }
            r2.f296419c = r8     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r3 = r8.getArgs(r10)     // Catch:{ all -> 0x005f }
            java.lang.String r4 = "findParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r0)     // Catch:{ all -> 0x005f }
            boolean r5 = rq2.C101425k.m133102f(r3)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x0044
            int r5 = r3.length     // Catch:{ all -> 0x005f }
        L_0x0033:
            if (r1 >= r5) goto L_0x0044
            r6 = r3[r1]     // Catch:{ all -> 0x005f }
            boolean r7 = r6 instanceof android.os.Bundle     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0041
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)     // Catch:{ all -> 0x005f }
            goto L_0x0048
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0044:
            r6 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)     // Catch:{ all -> 0x005f }
        L_0x0048:
            if (r6 == 0) goto L_0x005f
            java.lang.Class<com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy> r1 = com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl.IPCRemoteProxy.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x005f }
            r6.setClassLoader(r1)     // Catch:{ all -> 0x005f }
            android.os.Bundle r1 = r2.mo140692b(r2, r6)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005f
            java.lang.String r2 = "result_key"
            r10.putBundle(r2, r1)     // Catch:{ all -> 0x005f }
        L_0x005f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
            goto L_0x007b
        L_0x0063:
            java.lang.String r11 = "onClientCallback"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            java.lang.Object[] r10 = r8.getArgs(r10)     // Catch:{ Exception -> 0x0078 }
            qp2.a r2 = r8.f274150f     // Catch:{ Exception -> 0x0078 }
            if (r2 == 0) goto L_0x0078
            r10 = r10[r1]     // Catch:{ Exception -> 0x0078 }
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch:{ Exception -> 0x0078 }
            r2.mo140691a(r10)     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
        L_0x007b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl.IPCRemoteProxy.onCallback(java.lang.String, android.os.Bundle, boolean):void");
    }
}
