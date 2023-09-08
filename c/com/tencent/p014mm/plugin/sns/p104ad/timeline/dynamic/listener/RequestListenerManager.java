package com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener;

import android.util.ArrayMap;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import eq2.C97690b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager */
public class RequestListenerManager implements C0124r {

    /* renamed from: e */
    public static final Map<Integer, RequestListenerManager> f274151e = new ArrayMap();

    /* renamed from: d */
    public C97690b f274152d = new C97690b();

    private RequestListenerManager() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager m119934a(android.app.Activity r5) {
        /*
            java.lang.String r0 = "getInstance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r5 instanceof androidx.lifecycle.C0125s
            r3 = 0
            if (r2 == 0) goto L_0x0056
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager> r2 = f274151e
            int r4 = r5.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2
            java.lang.Object r2 = r2.get(r4)
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r2 = (com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager) r2
            if (r2 != 0) goto L_0x0052
            java.lang.String r2 = "newInstance"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r4 = r5 instanceof androidx.lifecycle.C0125s     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            r4 = r5
            androidx.lifecycle.s r4 = (androidx.lifecycle.C0125s) r4     // Catch:{ all -> 0x0035 }
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r3 = m119935b(r4)     // Catch:{ all -> 0x0035 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0038
        L_0x0035:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0038:
            if (r3 == 0) goto L_0x0051
            java.lang.String r2 = "RequestListenerManager"
            java.lang.String r4 = "new one RequestListenerManager instance!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager> r2 = f274151e
            int r5 = r5.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2
            r2.put(r5, r3)
        L_0x0051:
            r2 = r3
        L_0x0052:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0056:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager.m119934a(android.app.Activity):com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("RequestListenerManager", "RequestListenerManager attachToOwner failed!");
        r6 = false;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("RequestListenerManager", "new one instance of RequestListenerManager failed!");
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0010, B:9:0x0021] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager m119935b(androidx.lifecycle.C0125s r6) {
        /*
            java.lang.String r0 = "newInstanceInner"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            java.lang.String r3 = "RequestListenerManager"
            if (r6 != 0) goto L_0x0017
            java.lang.String r6 = "the input life cycle owner is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)     // Catch:{ all -> 0x0040 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0017:
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r4 = new com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager     // Catch:{ all -> 0x0040 }
            r4.<init>()     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "attachToOwner"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)     // Catch:{ all -> 0x0040 }
            androidx.lifecycle.j r6 = r6.getLifecycle()     // Catch:{ all -> 0x002d }
            r6.addObserver(r4)     // Catch:{ all -> 0x002d }
            r6 = 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0036
        L_0x002d:
            java.lang.String r6 = "RequestListenerManager attachToOwner failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)     // Catch:{ all -> 0x0040 }
            r6 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)     // Catch:{ all -> 0x0040 }
        L_0x0036:
            if (r6 != 0) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x003c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x0040:
            java.lang.String r6 = "new one instance of RequestListenerManager failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager.m119935b(androidx.lifecycle.s):com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void doDestroy(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        try {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            C97690b bVar = this.f274152d;
            if (bVar != null) {
                SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                ((HashMap) bVar.f286536a).clear();
                SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }
}
