package com.tencent.mars.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.feature.performance.C80860a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.TreeMap;
import p970gg.C87186a;

public class Alarm extends BroadcastReceiver {
    private static final int IDKEY_ALARM_DELAY_REPORT = 1256;
    private static final int INTENT_FILTER_ACTION_ID_DEFAULT = 10000;
    private static final String KEXTRA_ID = "ID";
    private static final String KEXTRA_PID = "PID";
    private static final int KV_ALARM_DELAY_REPORT = 18860;
    private static final String TAG = "MicroMsg.Alarm";
    private static Alarm bc_alarm;
    private static TreeMap<Long, AlarmRecord> gPendingAlarms = new TreeMap<>();
    private static WakerLock wakerlock;

    public static class AlarmRecord implements Comparable<AlarmRecord> {

        /* renamed from: id */
        public final long f342917id;
        public PendingIntent pendingIntent;
        public long waitTime;

        public AlarmRecord(long j, long j2, PendingIntent pendingIntent2) {
            this.f342917id = j;
            this.waitTime = j2;
            this.pendingIntent = pendingIntent2;
        }

        public int compareTo(AlarmRecord alarmRecord) {
            return (int) (this.f342917id - alarmRecord.f342917id);
        }
    }

    private static boolean cancelAlarmMgr(long j, Context context, PendingIntent pendingIntent) {
        if (((AlarmManager) context.getSystemService("alarm")) == null) {
            Log.m105920e(TAG, "am == null");
            return false;
        } else if (pendingIntent == null) {
            Log.m105920e(TAG, "pendingIntent == null");
            return false;
        } else {
            C87186a.m108238a(context, (int) j, pendingIntent);
            pendingIntent.cancel();
            return true;
        }
    }

    private native void onAlarm(long j);

    public static void resetAlarm(Context context) {
        synchronized (gPendingAlarms) {
            for (AlarmRecord next : gPendingAlarms.values()) {
                cancelAlarmMgr(next.f342917id, context, next.pendingIntent);
            }
            gPendingAlarms.clear();
            Alarm alarm = bc_alarm;
            if (alarm != null) {
                context.unregisterReceiver(alarm);
                bc_alarm = null;
            }
        }
    }

    private static PendingIntent setAlarmMgr(int i, long j, long j2, Context context) {
        PendingIntent pendingIntent = null;
        if (((AlarmManager) context.getSystemService("alarm")) == null) {
            Log.m105920e(TAG, "am == null");
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("ALARM_ACTION(" + String.valueOf(10000) + ")");
        intent.putExtra(KEXTRA_ID, j);
        intent.putExtra(KEXTRA_PID, Process.myPid());
        Log.m105925i("MicroMsg.AlarmHelper", "setExact(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s stack:%s)", 2, Integer.valueOf(i), Long.valueOf(j2), intent, 268435456, C87186a.m108240c());
        C87186a.f252848b = C87186a.f252848b + 1;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): am == null", Integer.valueOf(i));
        } else {
            if (!(i >= 100 && i <= 119)) {
                Log.m105921e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            } else {
                pendingIntent = PendingIntent.getBroadcast(context, i, intent, 268435456);
                try {
                    alarmManager.setExact(2, j2, pendingIntent);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AlarmHelper", "setExact Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                    if (C87186a.f252847a != null) {
                        ((C80860a) C87186a.f252847a).mo112619b(i, 1, C87186a.m108240c());
                    }
                }
            }
        }
        return pendingIntent;
    }

    public static boolean start(int i, long j, int i2, Context context) {
        int i3 = i2;
        Context context2 = context;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i3 < 0) {
            Log.m105921e(TAG, "id:%d, after:%d", Long.valueOf(j), Integer.valueOf(i2));
            return false;
        } else if (context2 == null) {
            Log.m105921e(TAG, "null==context, id:%d, after:%d", Long.valueOf(j), Integer.valueOf(i2));
            return false;
        } else {
            synchronized (gPendingAlarms) {
                if (wakerlock == null) {
                    wakerlock = new WakerLock(context2, TAG);
                    Log.m105924i(TAG, "start new wakerlock");
                }
                if (bc_alarm == null) {
                    Alarm alarm = new Alarm();
                    bc_alarm = alarm;
                    context2.registerReceiver(alarm, new IntentFilter("ALARM_ACTION(" + String.valueOf(10000) + ")"));
                }
                if (gPendingAlarms.containsKey(Long.valueOf(j))) {
                    Log.m105921e(TAG, "id exist=%d", Long.valueOf(j));
                    return false;
                }
                if (i3 >= 0) {
                    elapsedRealtime += (long) i3;
                }
                long j2 = elapsedRealtime;
                PendingIntent alarmMgr = setAlarmMgr(i, j, j2, context);
                if (alarmMgr == null) {
                    return false;
                }
                gPendingAlarms.put(Long.valueOf(j), new AlarmRecord(j, j2, alarmMgr));
                Log.m105925i(TAG, "Alarm.start [id: %d, after: %d, size: %d]", Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(gPendingAlarms.size()));
                return true;
            }
        }
    }

    public static boolean stop(long j, Context context) {
        Log.m105925i(TAG, "Alarm.stop [id: %d]", Long.valueOf(j));
        if (context == null) {
            Log.m105920e(TAG, "context==null");
            return false;
        }
        synchronized (gPendingAlarms) {
            if (wakerlock == null) {
                wakerlock = new WakerLock(context, TAG);
                Log.m105924i(TAG, "stop new wakerlock");
            }
            if (bc_alarm == null) {
                bc_alarm = new Alarm();
                context.registerReceiver(bc_alarm, new IntentFilter());
                Log.m105924i(TAG, "stop new Alarm");
            }
            AlarmRecord remove = gPendingAlarms.remove(Long.valueOf(j));
            if (remove == null) {
                return false;
            }
            cancelAlarmMgr(remove.f342917id, context, remove.pendingIntent);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r22, android.content.Intent r23) {
        /*
            r21 = this;
            r0 = r23
            if (r22 == 0) goto L_0x0104
            if (r0 != 0) goto L_0x0008
            goto L_0x0104
        L_0x0008:
            java.lang.String r1 = "ID"
            r2 = 0
            long r4 = r0.getLongExtra(r1, r2)
            java.lang.String r1 = "PID"
            r6 = 0
            int r0 = r0.getIntExtra(r1, r6)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0101
            if (r0 != 0) goto L_0x001f
            goto L_0x0101
        L_0x001f:
            int r1 = android.os.Process.myPid()
            r7 = 2
            r8 = 3
            r9 = 1
            if (r0 == r1) goto L_0x0048
            java.lang.String r1 = "MicroMsg.Alarm"
            java.lang.String r2 = "onReceive id:%d, pid:%d, mypid:%d"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r6] = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r9] = r0
            int r0 = android.os.Process.myPid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r3)
            return
        L_0x0048:
            java.util.TreeMap<java.lang.Long, com.tencent.mars.comm.Alarm$AlarmRecord> r1 = gPendingAlarms
            monitor-enter(r1)
            java.util.TreeMap<java.lang.Long, com.tencent.mars.comm.Alarm$AlarmRecord> r10 = gPendingAlarms     // Catch:{ all -> 0x00fa }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00fa }
            java.lang.Object r10 = r10.remove(r11)     // Catch:{ all -> 0x00fa }
            com.tencent.mars.comm.Alarm$AlarmRecord r10 = (com.tencent.mars.comm.Alarm.AlarmRecord) r10     // Catch:{ all -> 0x00fa }
            if (r10 == 0) goto L_0x00d5
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00fa }
            long r13 = r10.waitTime     // Catch:{ all -> 0x00fa }
            long r11 = r11 - r13
            java.lang.String r0 = "MicroMsg.Alarm"
            java.lang.String r10 = "Alarm.onReceive [id: %d, delta miss time: %d, size: %d]"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00fa }
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00fa }
            r8[r6] = r13     // Catch:{ all -> 0x00fa }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00fa }
            r8[r9] = r13     // Catch:{ all -> 0x00fa }
            java.util.TreeMap<java.lang.Long, com.tencent.mars.comm.Alarm$AlarmRecord> r13 = gPendingAlarms     // Catch:{ all -> 0x00fa }
            int r13 = r13.size()     // Catch:{ all -> 0x00fa }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00fa }
            r8[r7] = r13     // Catch:{ all -> 0x00fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r8)     // Catch:{ all -> 0x00fa }
            r7 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
        L_0x0087:
            r16 = r2
            goto L_0x00ab
        L_0x008a:
            r2 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0094
            r2 = 1
            goto L_0x0087
        L_0x0094:
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            r2 = 2
            goto L_0x0087
        L_0x009e:
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            r2 = 3
            goto L_0x0087
        L_0x00a8:
            r2 = 4
            goto L_0x0087
        L_0x00ab:
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x00fa }
            r14 = 1256(0x4e8, double:6.205E-321)
            r18 = 1
            r20 = 0
            r13 = r0
            r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ all -> 0x00fa }
            r2 = 18860(0x49ac, float:2.6428E-41)
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x00fa }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00fa }
            r3[r6] = r7     // Catch:{ all -> 0x00fa }
            r0.mo160131h(r2, r3)     // Catch:{ all -> 0x00fa }
            com.tencent.mars.comm.WakerLock r0 = wakerlock     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00cf
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.String r6 = "Alarm.onReceive"
            r0.lock(r2, r6)     // Catch:{ all -> 0x00fa }
        L_0x00cf:
            r2 = r21
            r2.onAlarm(r4)     // Catch:{ all -> 0x00ff }
            goto L_0x00f8
        L_0x00d5:
            r2 = r21
            java.lang.String r3 = "MicroMsg.Alarm"
            java.lang.String r10 = "onReceive not found id:%d, pid:%d, gPendingAlarms.size:%d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ff }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00ff }
            r8[r6] = r4     // Catch:{ all -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ff }
            r8[r9] = r0     // Catch:{ all -> 0x00ff }
            java.util.TreeMap<java.lang.Long, com.tencent.mars.comm.Alarm$AlarmRecord> r0 = gPendingAlarms     // Catch:{ all -> 0x00ff }
            int r0 = r0.size()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ff }
            r8[r7] = r0     // Catch:{ all -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r10, r8)     // Catch:{ all -> 0x00ff }
        L_0x00f8:
            monitor-exit(r1)     // Catch:{ all -> 0x00ff }
            return
        L_0x00fa:
            r0 = move-exception
            r2 = r21
        L_0x00fd:
            monitor-exit(r1)     // Catch:{ all -> 0x00ff }
            throw r0
        L_0x00ff:
            r0 = move-exception
            goto L_0x00fd
        L_0x0101:
            r2 = r21
            return
        L_0x0104:
            r2 = r21
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.comm.Alarm.onReceive(android.content.Context, android.content.Intent):void");
    }
}
