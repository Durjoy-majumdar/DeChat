package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.C113038a;
import java.util.concurrent.TimeUnit;
import p1014o4.C117693m;
import p1206p4.C117979k;
import p1222y4.C118924i;
import p834a3.C103297a;

public class ForceStopRunnable implements Runnable {

    /* renamed from: g */
    public static final String f338439g = C117693m.m165967e("ForceStopRunnable");

    /* renamed from: h */
    public static final long f338440h = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: d */
    public final Context f338441d;

    /* renamed from: e */
    public final C117979k f338442e;

    /* renamed from: f */
    public int f338443f = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            C117693m.m165967e("ForceStopRunnable$Rcvr");
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i = ((C117693m.C117694a) C117693m.m165966c()).f352016b;
                ForceStopRunnable.m154725c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C117979k kVar) {
        this.f338441d = context.getApplicationContext();
        this.f338442e = kVar;
    }

    /* renamed from: c */
    public static void m154725c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = C103297a.m136810a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f338440h;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165567a() {
        /*
            r15 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = -1
            r6 = 23
            if (r0 < r6) goto L_0x0102
            android.content.Context r0 = r15.f338441d
            p4.k r6 = r15.f338442e
            java.lang.String r7 = p1213s4.C118269b.f353483h
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r0.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            java.util.List r0 = p1213s4.C118269b.m166831f(r0, r7)
            androidx.work.impl.WorkDatabase r8 = r6.f352606c
            x4.h r8 = r8.mo165529k()
            x4.i r8 = (p1221x4.C118836i) r8
            r8.getClass()
            java.lang.String r9 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            z3.i r9 = p1223z3.C119046i.m167801c(r9, r3)
            z3.g r10 = r8.f355531a
            r10.mo183702b()
            z3.g r8 = r8.f355531a
            android.database.Cursor r8 = p452b4.C113140c.m154797a(r8, r9, r3, r1)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00fa }
            int r11 = r8.getCount()     // Catch:{ all -> 0x00fa }
            r10.<init>(r11)     // Catch:{ all -> 0x00fa }
        L_0x0042:
            boolean r11 = r8.moveToNext()     // Catch:{ all -> 0x00fa }
            if (r11 == 0) goto L_0x0050
            java.lang.String r11 = r8.getString(r3)     // Catch:{ all -> 0x00fa }
            r10.add(r11)     // Catch:{ all -> 0x00fa }
            goto L_0x0042
        L_0x0050:
            r8.close()
            r9.mo183710d()
            if (r0 == 0) goto L_0x0060
            r8 = r0
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            goto L_0x0061
        L_0x0060:
            r8 = 0
        L_0x0061:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r8)
            if (r0 == 0) goto L_0x00a6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x00a6
            java.util.Iterator r0 = r0.iterator()
        L_0x0074:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00a6
            java.lang.Object r8 = r0.next()
            android.app.job.JobInfo r8 = (android.app.job.JobInfo) r8
            java.lang.String r11 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r12 = r8.getExtras()
            if (r12 == 0) goto L_0x0093
            boolean r13 = r12.containsKey(r11)     // Catch:{ NullPointerException -> 0x0093 }
            if (r13 == 0) goto L_0x0093
            java.lang.String r11 = r12.getString(r11)     // Catch:{ NullPointerException -> 0x0093 }
            goto L_0x0094
        L_0x0093:
            r11 = r1
        L_0x0094:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x009e
            r9.add(r11)
            goto L_0x0074
        L_0x009e:
            int r8 = r8.getId()
            p1213s4.C118269b.m166829d(r7, r8)
            goto L_0x0074
        L_0x00a6:
            java.util.Iterator r0 = r10.iterator()
        L_0x00aa:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00cb
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r9.contains(r7)
            if (r7 != 0) goto L_0x00aa
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r7 = p1213s4.C118269b.f353483h
            java.lang.Throwable[] r8 = new java.lang.Throwable[r3]
            java.lang.String r9 = "Reconciling jobs"
            r0.mo182389a(r7, r9, r8)
            r0 = 1
            goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            if (r0 == 0) goto L_0x0103
            androidx.work.impl.WorkDatabase r6 = r6.f352606c
            r6.mo183703c()
            x4.p r7 = r6.mo165532n()     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x00db:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x00ee
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00f5 }
            r10 = r7
            x4.q r10 = (p1221x4.C118850q) r10     // Catch:{ all -> 0x00f5 }
            r10.mo183563l(r9, r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x00db
        L_0x00ee:
            r6.mo183706h()     // Catch:{ all -> 0x00f5 }
            r6.mo183704f()
            goto L_0x0103
        L_0x00f5:
            r0 = move-exception
            r6.mo183704f()
            throw r0
        L_0x00fa:
            r0 = move-exception
            r8.close()
            r9.mo183710d()
            throw r0
        L_0x0102:
            r0 = 0
        L_0x0103:
            p4.k r6 = r15.f338442e
            androidx.work.impl.WorkDatabase r6 = r6.f352606c
            x4.p r7 = r6.mo165532n()
            x4.m r8 = r6.mo165531m()
            r6.mo183703c()
            x4.q r7 = (p1221x4.C118850q) r7     // Catch:{ all -> 0x0253 }
            java.util.List r9 = r7.mo183555d()     // Catch:{ all -> 0x0253 }
            r10 = r9
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x0253 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0253 }
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x0145
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0253 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0253 }
        L_0x0128:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0253 }
            if (r11 == 0) goto L_0x0145
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0253 }
            x4.o r11 = (p1221x4.C118847o) r11     // Catch:{ all -> 0x0253 }
            o4.u r12 = p1014o4.C117705u.ENQUEUED     // Catch:{ all -> 0x0253 }
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x0253 }
            java.lang.String r14 = r11.f355541a     // Catch:{ all -> 0x0253 }
            r13[r3] = r14     // Catch:{ all -> 0x0253 }
            r7.mo183567p(r12, r13)     // Catch:{ all -> 0x0253 }
            java.lang.String r11 = r11.f355541a     // Catch:{ all -> 0x0253 }
            r7.mo183563l(r11, r4)     // Catch:{ all -> 0x0253 }
            goto L_0x0128
        L_0x0145:
            x4.n r8 = (p1221x4.C118844n) r8     // Catch:{ all -> 0x0253 }
            r8.mo183543b()     // Catch:{ all -> 0x0253 }
            r6.mo183706h()     // Catch:{ all -> 0x0253 }
            r6.mo183704f()
            if (r10 != 0) goto L_0x0157
            if (r0 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r0 = 0
            goto L_0x0158
        L_0x0157:
            r0 = 1
        L_0x0158:
            p4.k r4 = r15.f338442e
            y4.h r4 = r4.f352610g
            androidx.work.impl.WorkDatabase r4 = r4.f356202a
            x4.e r4 = r4.mo165528j()
            x4.f r4 = (p1221x4.C118832f) r4
            java.lang.String r5 = "reschedule_needed"
            java.lang.Long r4 = r4.mo183535a(r5)
            if (r4 == 0) goto L_0x0178
            long r6 = r4.longValue()
            r8 = 1
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0178
            r4 = 1
            goto L_0x0179
        L_0x0178:
            r4 = 0
        L_0x0179:
            if (r4 == 0) goto L_0x01a8
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338439g
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            java.lang.String r3 = "Rescheduling Workers."
            r0.mo182389a(r1, r3, r2)
            p4.k r0 = r15.f338442e
            r0.mo182735e()
            p4.k r0 = r15.f338442e
            y4.h r0 = r0.f352610g
            r0.getClass()
            x4.d r1 = new x4.d
            r2 = 0
            r1.<init>(r5, r2)
            androidx.work.impl.WorkDatabase r0 = r0.f356202a
            x4.e r0 = r0.mo165528j()
            x4.f r0 = (p1221x4.C118832f) r0
            r0.mo183536b(r1)
            goto L_0x0252
        L_0x01a8:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r5 = p834a3.C103297a.m136810a()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            if (r5 == 0) goto L_0x01b2
            r4 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x01b2:
            android.content.Context r5 = r15.f338441d     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            r6.<init>()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r8 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r7.<init>(r5, r8)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            r6.setComponent(r7)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            java.lang.String r7 = "ACTION_FORCE_STOP_RESCHEDULE"
            r6.setAction(r7)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            r7 = -1
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r5, r7, r6, r4)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            r6 = 30
            if (r5 < r6) goto L_0x0207
            if (r4 == 0) goto L_0x01d8
            r4.cancel()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
        L_0x01d8:
            android.content.Context r4 = r15.f338441d     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            java.util.List r1 = r4.getHistoricalProcessExitReasons(r1, r3, r3)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            if (r1 == 0) goto L_0x020f
            boolean r4 = r1.isEmpty()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            if (r4 != 0) goto L_0x020f
            r4 = 0
        L_0x01ef:
            int r5 = r1.size()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            if (r4 >= r5) goto L_0x020f
            java.lang.Object r5 = r1.get(r4)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            android.app.ApplicationExitInfo r5 = (android.app.ApplicationExitInfo) r5     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            int r5 = r5.getReason()     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            r6 = 10
            if (r5 != r6) goto L_0x0204
            goto L_0x0223
        L_0x0204:
            int r4 = r4 + 1
            goto L_0x01ef
        L_0x0207:
            if (r4 != 0) goto L_0x020f
            android.content.Context r1 = r15.f338441d     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            m154725c(r1)     // Catch:{ SecurityException -> 0x0213, IllegalArgumentException -> 0x0211 }
            goto L_0x0223
        L_0x020f:
            r2 = 0
            goto L_0x0223
        L_0x0211:
            r1 = move-exception
            goto L_0x0214
        L_0x0213:
            r1 = move-exception
        L_0x0214:
            o4.m r4 = p1014o4.C117693m.m165966c()
            java.lang.String r5 = f338439g
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]
            r6[r3] = r1
            java.lang.String r1 = "Ignoring exception"
            r4.mo182392f(r5, r1, r6)
        L_0x0223:
            if (r2 == 0) goto L_0x0238
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338439g
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            java.lang.String r3 = "Application was force-stopped, rescheduling."
            r0.mo182389a(r1, r3, r2)
            p4.k r0 = r15.f338442e
            r0.mo182735e()
            goto L_0x0252
        L_0x0238:
            if (r0 == 0) goto L_0x0252
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338439g
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            java.lang.String r3 = "Found unfinished work, scheduling it."
            r0.mo182389a(r1, r3, r2)
            p4.k r0 = r15.f338442e
            androidx.work.a r1 = r0.f352605b
            androidx.work.impl.WorkDatabase r2 = r0.f352606c
            java.util.List<p4.e> r0 = r0.f352608e
            p1206p4.C117974f.m166380a(r1, r2, r0)
        L_0x0252:
            return
        L_0x0253:
            r0 = move-exception
            r6.mo183704f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.mo165567a():void");
    }

    /* renamed from: b */
    public boolean mo165568b() {
        C113038a aVar = this.f338442e.f352605b;
        aVar.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            C117693m.m165966c().mo182389a(f338439g, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = C118924i.m167678a(this.f338441d, aVar);
        C117693m.m165966c().mo182389a(f338439g, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(a)}), new Throwable[0]);
        return a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c A[LOOP:0: B:5:0x000c->B:26:0x000c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            boolean r0 = r11.mo165568b()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x000c
            p4.k r0 = r11.f338442e
            r0.mo182734d()
            return
        L_0x000c:
            android.content.Context r0 = r11.f338441d     // Catch:{ all -> 0x0081 }
            p1206p4.C117978j.m166385a(r0)     // Catch:{ all -> 0x0081 }
            o4.m r0 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = f338439g     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "Performing cleanup operations."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0081 }
            r0.mo182389a(r1, r2, r4)     // Catch:{ all -> 0x0081 }
            r11.mo165567a()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x0032, SQLiteDatabaseCorruptException -> 0x0030, SQLiteDatabaseLockedException -> 0x002e, SQLiteTableLockedException -> 0x002c, SQLiteConstraintException -> 0x002a, SQLiteAccessPermException -> 0x0028 }
            p4.k r0 = r11.f338442e
            r0.mo182734d()
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0 = move-exception
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            int r1 = r11.f338443f     // Catch:{ all -> 0x0081 }
            r2 = 1
            int r1 = r1 + r2
            r11.f338443f = r1     // Catch:{ all -> 0x0081 }
            r4 = 3
            if (r1 >= r4) goto L_0x0065
            long r4 = (long) r1     // Catch:{ all -> 0x0081 }
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            o4.m r1 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0081 }
            java.lang.String r8 = f338439g     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = "Retrying after %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x0081 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0081 }
            r10[r3] = r4     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x0081 }
            r2[r3] = r0     // Catch:{ all -> 0x0081 }
            r1.mo182389a(r8, r4, r2)     // Catch:{ all -> 0x0081 }
            int r0 = r11.f338443f     // Catch:{ all -> 0x0081 }
            long r0 = (long) r0
            long r0 = r0 * r6
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x0065:
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            o4.m r4 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = f338439g     // Catch:{ all -> 0x0081 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x0081 }
            r2[r3] = r0     // Catch:{ all -> 0x0081 }
            r4.mo182390b(r5, r1, r2)     // Catch:{ all -> 0x0081 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0081 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0081 }
            p4.k r0 = r11.f338442e     // Catch:{ all -> 0x0081 }
            androidx.work.a r0 = r0.f352605b     // Catch:{ all -> 0x0081 }
            r0.getClass()     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            p4.k r1 = r11.f338442e
            r1.mo182734d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
