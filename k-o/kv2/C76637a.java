package kv2;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: kv2.a */
public class C76637a {

    /* renamed from: a */
    public ArrayList<Runnable> f224256a = new ArrayList<>();

    /* renamed from: b */
    public HandlerThread f224257b;

    /* renamed from: c */
    public Handler f224258c;

    /* renamed from: d */
    public Runnable f224259d = new C34070a(this);

    /* renamed from: kv2.a$a */
    public class C34070a implements Runnable {
        public C34070a(C76637a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("InitTaskMgr", "mDeviceIdInitTask exp=" + r0.toString());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x003d }
                java.lang.Class<do2.a> r2 = do2.C97503a.class
                monitor-enter(r2)     // Catch:{ Exception -> 0x003d }
                java.lang.String r3 = "initAllDeviceInfo"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x003a }
                java.lang.String r3 = "initAllDeviceInfo"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x003a }
                monitor-exit(r2)     // Catch:{ Exception -> 0x003d }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x003d }
                java.lang.String r4 = "InitTaskMgr"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
                r5.<init>()     // Catch:{ Exception -> 0x003d }
                java.lang.String r6 = "DeviceIdInitTask run, timeCost="
                r5.append(r6)     // Catch:{ Exception -> 0x003d }
                long r2 = r2 - r0
                r5.append(r2)     // Catch:{ Exception -> 0x003d }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x003d }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x003d }
                goto L_0x0059
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ Exception -> 0x003d }
                throw r0     // Catch:{ Exception -> 0x003d }
            L_0x003d:
                r0 = move-exception
                java.lang.String r1 = "InitTaskMgr"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "mDeviceIdInitTask exp="
                r2.append(r3)
                java.lang.String r0 = r0.toString()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            L_0x0059:
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kv2.C76637a.C34070a.run():void");
        }
    }

    public C76637a() {
        SnsMethodCalculate.markStartTimeMs("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        this.f224256a.add(this.f224259d);
        SnsMethodCalculate.markEndTimeMs("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        SnsMethodCalculate.markStartTimeMs("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            HandlerThread handlerThread = new HandlerThread("waidproviderInitTask");
            this.f224257b = handlerThread;
            handlerThread.start();
            this.f224258c = new Handler(this.f224257b.getLooper());
        } catch (Exception e) {
            Log.m105920e("InitTaskMgr", "initWorkThread exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
    }
}
