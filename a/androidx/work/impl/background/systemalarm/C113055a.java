package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import p1014o4.C117693m;
import p1206p4.C117969b;

/* renamed from: androidx.work.impl.background.systemalarm.a */
public class C113055a implements C117969b {

    /* renamed from: g */
    public static final String f338384g = C117693m.m165967e("CommandHandler");

    /* renamed from: d */
    public final Context f338385d;

    /* renamed from: e */
    public final Map<String, C117969b> f338386e = new HashMap();

    /* renamed from: f */
    public final Object f338387f = new Object();

    public C113055a(Context context) {
        this.f338385d = context;
    }

    /* renamed from: a */
    public static Intent m154700a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m154701b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0187  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165544c(android.content.Intent r11, int r12, androidx.work.impl.background.systemalarm.C113058d r13) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x011a
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338384g
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            java.lang.String r11 = "Handling constraints changed %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo182389a(r1, r11, r4)
            androidx.work.impl.background.systemalarm.b r11 = new androidx.work.impl.background.systemalarm.b
            android.content.Context r0 = r10.f338385d
            r11.<init>(r0, r12, r13)
            p4.k r12 = r13.f338408h
            androidx.work.impl.WorkDatabase r12 = r12.f352606c
            x4.p r12 = r12.mo165532n()
            x4.q r12 = (p1221x4.C118850q) r12
            java.util.List r12 = r12.mo183556e()
            java.lang.String r13 = androidx.work.impl.background.systemalarm.ConstraintProxy.f338375a
            r13 = r12
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r1 = r13.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0045:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r1.next()
            x4.o r8 = (p1221x4.C118847o) r8
            o4.c r8 = r8.f355550j
            boolean r9 = r8.f351998d
            r4 = r4 | r9
            boolean r9 = r8.f351996b
            r5 = r5 | r9
            boolean r9 = r8.f351999e
            r6 = r6 | r9
            o4.n r8 = r8.f351995a
            o4.n r9 = p1014o4.C117695n.f352017d
            if (r8 == r9) goto L_0x0064
            r8 = 1
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            r7 = r7 | r8
            if (r4 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
        L_0x006e:
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f338376a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r8 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r1.<init>(r8)
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r9 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r8.<init>(r0, r9)
            r1.setComponent(r8)
            java.lang.String r8 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r1.putExtra(r8, r4)
            java.lang.String r8 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r8, r5)
            java.lang.String r5 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r5, r6)
            java.lang.String r5 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r4.putExtra(r5, r7)
            r0.sendBroadcast(r1)
            t4.d r0 = r11.f338392d
            r0.mo183175b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r13.size()
            r12.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b1:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r13.next()
            x4.o r4 = (p1221x4.C118847o) r4
            java.lang.String r5 = r4.f355541a
            long r6 = r4.mo183544a()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00b1
            boolean r6 = r4.mo183545b()
            if (r6 == 0) goto L_0x00d5
            t4.d r6 = r11.f338392d
            boolean r5 = r6.mo183174a(r5)
            if (r5 == 0) goto L_0x00b1
        L_0x00d5:
            r12.add(r4)
            goto L_0x00b1
        L_0x00d9:
            java.util.Iterator r12 = r12.iterator()
        L_0x00dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0113
            java.lang.Object r13 = r12.next()
            x4.o r13 = (p1221x4.C118847o) r13
            java.lang.String r13 = r13.f355541a
            android.content.Context r0 = r11.f338389a
            android.content.Intent r0 = m154700a(r0, r13)
            o4.m r1 = p1014o4.C117693m.m165966c()
            java.lang.String r4 = androidx.work.impl.background.systemalarm.C113056b.f338388e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r13
            java.lang.String r13 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r1.mo182389a(r4, r13, r5)
            androidx.work.impl.background.systemalarm.d r13 = r11.f338391c
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b
            int r4 = r11.f338390b
            r1.<init>(r13, r0, r4)
            r13.mo165555d(r1)
            goto L_0x00dd
        L_0x0113:
            t4.d r11 = r11.f338392d
            r11.mo183176c()
            goto L_0x0382
        L_0x011a:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x0145
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338384g
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling reschedule %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r0.mo182389a(r1, r11, r12)
            p4.k r11 = r13.f338408h
            r11.mo182735e()
            goto L_0x0382
        L_0x0145:
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            if (r1 == 0) goto L_0x0169
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0158
            goto L_0x0169
        L_0x0158:
            r6 = 0
        L_0x0159:
            if (r6 >= r2) goto L_0x0167
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x0164
            goto L_0x0169
        L_0x0164:
            int r6 = r6 + 1
            goto L_0x0159
        L_0x0167:
            r1 = 1
            goto L_0x016a
        L_0x0169:
            r1 = 0
        L_0x016a:
            if (r1 != 0) goto L_0x0187
            o4.m r11 = p1014o4.C117693m.m165966c()
            java.lang.String r12 = f338384g
            java.lang.String r13 = "Invalid request for %s, requires %s."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r1[r2] = r0
            java.lang.String r13 = java.lang.String.format(r13, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.mo182390b(r12, r13, r0)
            goto L_0x0382
        L_0x0187:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0276
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f338384g
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r11
            java.lang.String r6 = "Handling schedule work for %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r0.mo182389a(r1, r5, r6)
            p4.k r0 = r13.f338408h
            androidx.work.impl.WorkDatabase r0 = r0.f352606c
            r0.mo183703c()
            x4.p r5 = r0.mo165532n()     // Catch:{ all -> 0x0271 }
            x4.q r5 = (p1221x4.C118850q) r5     // Catch:{ all -> 0x0271 }
            x4.o r5 = r5.mo183560i(r11)     // Catch:{ all -> 0x0271 }
            java.lang.String r6 = "Skipping scheduling "
            if (r5 != 0) goto L_0x01e2
            o4.m r12 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r13.<init>()     // Catch:{ all -> 0x0271 }
            r13.append(r6)     // Catch:{ all -> 0x0271 }
            r13.append(r11)     // Catch:{ all -> 0x0271 }
            java.lang.String r11 = " because it's no longer in the DB"
            r13.append(r11)     // Catch:{ all -> 0x0271 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0271 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0271 }
            r12.mo182392f(r1, r11, r13)     // Catch:{ all -> 0x0271 }
            goto L_0x026c
        L_0x01e2:
            o4.u r7 = r5.f355542b     // Catch:{ all -> 0x0271 }
            boolean r7 = r7.mo182396a()     // Catch:{ all -> 0x0271 }
            if (r7 == 0) goto L_0x0208
            o4.m r12 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r13.<init>()     // Catch:{ all -> 0x0271 }
            r13.append(r6)     // Catch:{ all -> 0x0271 }
            r13.append(r11)     // Catch:{ all -> 0x0271 }
            java.lang.String r11 = "because it is finished."
            r13.append(r11)     // Catch:{ all -> 0x0271 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0271 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0271 }
            r12.mo182392f(r1, r11, r13)     // Catch:{ all -> 0x0271 }
            goto L_0x026c
        L_0x0208:
            long r6 = r5.mo183544a()     // Catch:{ all -> 0x0271 }
            boolean r5 = r5.mo183545b()     // Catch:{ all -> 0x0271 }
            if (r5 != 0) goto L_0x0233
            o4.m r12 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0271 }
            java.lang.String r5 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0271 }
            r4[r3] = r11     // Catch:{ all -> 0x0271 }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0271 }
            r4[r2] = r8     // Catch:{ all -> 0x0271 }
            java.lang.String r2 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x0271 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0271 }
            r12.mo182389a(r1, r2, r3)     // Catch:{ all -> 0x0271 }
            android.content.Context r12 = r10.f338385d     // Catch:{ all -> 0x0271 }
            p4.k r13 = r13.f338408h     // Catch:{ all -> 0x0271 }
            p1211r4.C118222a.m166779b(r12, r13, r11, r6)     // Catch:{ all -> 0x0271 }
            goto L_0x0269
        L_0x0233:
            o4.m r5 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x0271 }
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0271 }
            r4[r3] = r11     // Catch:{ all -> 0x0271 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0271 }
            r4[r2] = r9     // Catch:{ all -> 0x0271 }
            java.lang.String r2 = java.lang.String.format(r8, r4)     // Catch:{ all -> 0x0271 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0271 }
            r5.mo182389a(r1, r2, r3)     // Catch:{ all -> 0x0271 }
            android.content.Context r1 = r10.f338385d     // Catch:{ all -> 0x0271 }
            p4.k r2 = r13.f338408h     // Catch:{ all -> 0x0271 }
            p1211r4.C118222a.m166779b(r1, r2, r11, r6)     // Catch:{ all -> 0x0271 }
            android.content.Context r11 = r10.f338385d     // Catch:{ all -> 0x0271 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0271 }
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r2 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            r1.<init>(r11, r2)     // Catch:{ all -> 0x0271 }
            java.lang.String r11 = "ACTION_CONSTRAINTS_CHANGED"
            r1.setAction(r11)     // Catch:{ all -> 0x0271 }
            androidx.work.impl.background.systemalarm.d$b r11 = new androidx.work.impl.background.systemalarm.d$b     // Catch:{ all -> 0x0271 }
            r11.<init>(r13, r1, r12)     // Catch:{ all -> 0x0271 }
            r13.mo165555d(r11)     // Catch:{ all -> 0x0271 }
        L_0x0269:
            r0.mo183706h()     // Catch:{ all -> 0x0271 }
        L_0x026c:
            r0.mo183704f()
            goto L_0x0382
        L_0x0271:
            r11 = move-exception
            r0.mo183704f()
            throw r11
        L_0x0276:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02d5
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r1 = r10.f338387f
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)     // Catch:{ all -> 0x02d2 }
            o4.m r0 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = f338384g     // Catch:{ all -> 0x02d2 }
            java.lang.String r5 = "Handing delay met for %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d2 }
            r6[r3] = r11     // Catch:{ all -> 0x02d2 }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x02d2 }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02d2 }
            r0.mo182389a(r4, r5, r6)     // Catch:{ all -> 0x02d2 }
            java.util.Map<java.lang.String, p4.b> r0 = r10.f338386e     // Catch:{ all -> 0x02d2 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x02d2 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x02d2 }
            if (r0 != 0) goto L_0x02bc
            androidx.work.impl.background.systemalarm.c r0 = new androidx.work.impl.background.systemalarm.c     // Catch:{ all -> 0x02d2 }
            android.content.Context r2 = r10.f338385d     // Catch:{ all -> 0x02d2 }
            r0.<init>(r2, r12, r11, r13)     // Catch:{ all -> 0x02d2 }
            java.util.Map<java.lang.String, p4.b> r12 = r10.f338386e     // Catch:{ all -> 0x02d2 }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ all -> 0x02d2 }
            r12.put(r11, r0)     // Catch:{ all -> 0x02d2 }
            r0.mo165548c()     // Catch:{ all -> 0x02d2 }
            goto L_0x02cf
        L_0x02bc:
            o4.m r12 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x02d2 }
            java.lang.String r13 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d2 }
            r0[r3] = r11     // Catch:{ all -> 0x02d2 }
            java.lang.String r11 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x02d2 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02d2 }
            r12.mo182389a(r4, r11, r13)     // Catch:{ all -> 0x02d2 }
        L_0x02cf:
            monitor-exit(r1)     // Catch:{ all -> 0x02d2 }
            goto L_0x0382
        L_0x02d2:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d2 }
            throw r11
        L_0x02d5:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0336
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r12 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r12)
            o4.m r12 = p1014o4.C117693m.m165966c()
            java.lang.String r0 = f338384g
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.mo182389a(r0, r1, r4)
            p4.k r12 = r13.f338408h
            r12.mo182737g(r11)
            android.content.Context r12 = r10.f338385d
            p4.k r0 = r13.f338408h
            java.lang.String r1 = p1211r4.C118222a.f353371a
            androidx.work.impl.WorkDatabase r0 = r0.f352606c
            x4.h r0 = r0.mo165529k()
            x4.i r0 = (p1221x4.C118836i) r0
            x4.g r1 = r0.mo183539a(r11)
            if (r1 == 0) goto L_0x0332
            int r1 = r1.f355530b
            p1211r4.C118222a.m166778a(r12, r11, r1)
            o4.m r12 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = p1211r4.C118222a.f353371a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r11
            java.lang.String r4 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.mo182389a(r1, r2, r4)
            r0.mo183541c(r11)
        L_0x0332:
            r13.mo165545e(r11, r3)
            goto L_0x0382
        L_0x0336:
            java.lang.String r13 = "ACTION_EXECUTION_COMPLETED"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x036d
            android.os.Bundle r13 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r13 = r13.getBoolean(r1)
            o4.m r1 = p1014o4.C117693m.m165966c()
            java.lang.String r5 = f338384g
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r1.mo182389a(r5, r11, r12)
            r10.mo165545e(r0, r13)
            goto L_0x0382
        L_0x036d:
            o4.m r12 = p1014o4.C117693m.m165966c()
            java.lang.String r13 = f338384g
            java.lang.String r0 = "Ignoring intent %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r11 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r12.mo182392f(r13, r11, r0)
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.C113055a.mo165544c(android.content.Intent, int, androidx.work.impl.background.systemalarm.d):void");
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        synchronized (this.f338387f) {
            C117969b bVar = (C117969b) ((HashMap) this.f338386e).remove(str);
            if (bVar != null) {
                bVar.mo165545e(str, z);
            }
        }
    }
}
