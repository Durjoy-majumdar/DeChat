package zr2;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zr2.e */
public final class C66984e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C66984e f192447d = new C66984e();

    public C66984e() {
        super(0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4 != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            zr2.a r0 = zr2.C66976a.f192427a
            java.lang.String r0 = "access$getThreadCreateLock$p"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r2 = zr2.C66976a.f192433g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            monitor-enter(r2)
            android.os.HandlerThread r0 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c9 }
            r1 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0036
            android.os.HandlerThread r0 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c9 }
            r4 = 1
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x00c9 }
            if (r0 != r4) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 == 0) goto L_0x0057
        L_0x0036:
            android.os.HandlerThread r0 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x003f
            r0.quitSafely()     // Catch:{ all -> 0x00c9 }
        L_0x003f:
            java.lang.String r0 = "access$setSpanThread$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)     // Catch:{ all -> 0x00c9 }
            zr2.C66976a.f192431e = r1     // Catch:{ all -> 0x00c9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "access$setSpanHandler$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)     // Catch:{ all -> 0x00c9 }
            zr2.C66976a.f192432f = r1     // Catch:{ all -> 0x00c9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)     // Catch:{ all -> 0x00c9 }
        L_0x0057:
            java.lang.String r0 = "SnsKeywordMatcher_Thread"
            int r4 = eu3.C58834h.f168432b     // Catch:{ all -> 0x00c9 }
            android.os.HandlerThread r0 = eu3.C97749e.m126093a(r0, r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r3 = "access$setSpanThread$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x00c9 }
            zr2.C66976a.f192431e = r0     // Catch:{ all -> 0x00c9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x00c9 }
            android.os.HandlerThread r0 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0074
            r0.start()     // Catch:{ all -> 0x00c9 }
        L_0x0074:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler     // Catch:{ all -> 0x00c9 }
            android.os.HandlerThread r3 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0080
            android.os.Looper r1 = r3.getLooper()     // Catch:{ all -> 0x00c9 }
        L_0x0080:
            r0.<init>((android.os.Looper) r1)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "access$setSpanHandler$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c9 }
            zr2.C66976a.f192432f = r0     // Catch:{ all -> 0x00c9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r1 = "start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Class<ht1.r4> r0 = ht1.C60197r4.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00c9 }
            ht1.r4 r0 = (ht1.C60197r4) r0     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b2
            zr2.a r1 = zr2.C66976a.f192427a     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "getOnStorageChange"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c9 }
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r4 = zr2.C66976a.f192435i     // Catch:{ all -> 0x00c9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c9 }
            r0.mo57052i(r4)     // Catch:{ all -> 0x00c9 }
        L_0x00b2:
            zr2.C66976a.m79132c()     // Catch:{ all -> 0x00c9 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c9 }
            monitor-exit(r2)
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)
            java.lang.String r1 = "invoke"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$startInner$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zr2.C66984e.invoke():java.lang.Object");
    }
}
