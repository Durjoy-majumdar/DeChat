package p1213s4;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p1014o4.C117693m;

/* renamed from: s4.a */
public class C118268a {

    /* renamed from: b */
    public static final String f353481b = C117693m.m165967e("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f353482a;

    public C118268a(Context context) {
        this.f353482a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        if (r2 < 26) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo mo183052a(p1221x4.C118847o r13, int r14) {
        /*
            r12 = this;
            o4.c r0 = r13.f355550j
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r13.f355541a
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r3, r2)
            boolean r2 = r13.mo183546c()
            java.lang.String r3 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r3, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = r12.f353482a
            r2.<init>(r14, r3)
            boolean r14 = r0.f351996b
            android.app.job.JobInfo$Builder r14 = r2.setRequiresCharging(r14)
            boolean r2 = r0.f351997c
            android.app.job.JobInfo$Builder r14 = r14.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r14 = r14.setExtras(r1)
            o4.n r1 = r0.f351995a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 1
            r5 = 30
            r6 = 26
            r7 = 24
            if (r2 < r5) goto L_0x0053
            o4.n r5 = p1014o4.C117695n.TEMPORARILY_UNMETERED
            if (r1 != r5) goto L_0x0053
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r5 = 25
            android.net.NetworkRequest$Builder r1 = r1.addCapability(r5)
            android.net.NetworkRequest r1 = r1.build()
            r14.setRequiredNetwork(r1)
            goto L_0x008a
        L_0x0053:
            int r5 = r1.ordinal()
            r8 = 4
            r9 = 2
            r10 = 3
            if (r5 == 0) goto L_0x0086
            if (r5 == r4) goto L_0x0084
            if (r5 == r9) goto L_0x0082
            if (r5 == r10) goto L_0x0068
            if (r5 == r8) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            if (r2 < r6) goto L_0x006c
            goto L_0x0087
        L_0x0068:
            if (r2 < r7) goto L_0x006c
            r8 = 3
            goto L_0x0087
        L_0x006c:
            o4.m r5 = p1014o4.C117693m.m165966c()
            java.lang.String r8 = f353481b
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r1
            java.lang.String r1 = "API version too low. Cannot convert network type value %s"
            java.lang.String r1 = java.lang.String.format(r1, r9)
            java.lang.Throwable[] r9 = new java.lang.Throwable[r3]
            r5.mo182389a(r8, r1, r9)
            goto L_0x0084
        L_0x0082:
            r8 = 2
            goto L_0x0087
        L_0x0084:
            r8 = 1
            goto L_0x0087
        L_0x0086:
            r8 = 0
        L_0x0087:
            r14.setRequiredNetworkType(r8)
        L_0x008a:
            boolean r1 = r0.f351997c
            if (r1 != 0) goto L_0x009c
            o4.a r1 = r13.f355552l
            o4.a r5 = p1014o4.C117681a.LINEAR
            if (r1 != r5) goto L_0x0096
            r1 = 0
            goto L_0x0097
        L_0x0096:
            r1 = 1
        L_0x0097:
            long r8 = r13.f355553m
            r14.setBackoffCriteria(r8, r1)
        L_0x009c:
            long r8 = r13.mo183544a()
            long r10 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r10
            r10 = 0
            long r8 = java.lang.Math.max(r8, r10)
            r1 = 28
            if (r2 > r1) goto L_0x00b3
            r14.setMinimumLatency(r8)
            goto L_0x00c2
        L_0x00b3:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bb
            r14.setMinimumLatency(r8)
            goto L_0x00c2
        L_0x00bb:
            boolean r1 = r13.f355557q
            if (r1 != 0) goto L_0x00c2
            r14.setImportantWhileForeground(r4)
        L_0x00c2:
            if (r2 < r7) goto L_0x0102
            o4.d r1 = r0.f352002h
            java.util.Set<o4.d$a> r1 = r1.f352004a
            java.util.HashSet r1 = (java.util.HashSet) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00d2
            r1 = 1
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            if (r1 == 0) goto L_0x0102
            o4.d r1 = r0.f352002h
            java.util.Set<o4.d$a> r1 = r1.f352004a
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00df:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r1.next()
            o4.d$a r2 = (p1014o4.C117684d.C117685a) r2
            boolean r5 = r2.f352006b
            android.app.job.JobInfo$TriggerContentUri r7 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r2 = r2.f352005a
            r7.<init>(r2, r5)
            r14.addTriggerContentUri(r7)
            goto L_0x00df
        L_0x00f8:
            long r1 = r0.f352000f
            r14.setTriggerContentUpdateDelay(r1)
            long r1 = r0.f352001g
            r14.setTriggerContentMaxDelay(r1)
        L_0x0102:
            r14.setPersisted(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L_0x0113
            boolean r1 = r0.f351998d
            r14.setRequiresBatteryNotLow(r1)
            boolean r0 = r0.f351999e
            r14.setRequiresStorageNotLow(r0)
        L_0x0113:
            int r0 = r13.f355551k
            if (r0 <= 0) goto L_0x0119
            r0 = 1
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x011f
            r3 = 1
        L_0x011f:
            boolean r1 = p834a3.C103297a.m136810a()
            if (r1 == 0) goto L_0x0130
            boolean r13 = r13.f355557q
            if (r13 == 0) goto L_0x0130
            if (r0 != 0) goto L_0x0130
            if (r3 != 0) goto L_0x0130
            r14.setExpedited(r4)
        L_0x0130:
            android.app.job.JobInfo r13 = r14.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1213s4.C118268a.mo183052a(x4.o, int):android.app.job.JobInfo");
    }
}
