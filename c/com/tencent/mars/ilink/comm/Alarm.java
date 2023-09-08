package com.tencent.mars.ilink.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.mars.ilink.xlog.Log;
import java.util.TreeMap;

public class Alarm extends BroadcastReceiver {
    private static final String KEXTRA_ID = "ID";
    private static final String KEXTRA_PID = "PID";
    private static final String TAG = "MicroMsg.Alarm";
    private static Alarm bc_alarm;
    private static TreeMap<Long, AlarmRecord> gPendingAlarms = new TreeMap<>();
    private static WakerLock wakerlock;

    public static class AlarmRecord implements Comparable<AlarmRecord> {

        /* renamed from: id */
        public final long f342918id;
        public PendingIntent pendingIntent;
        public long waitTime;

        public AlarmRecord(long j, long j2, PendingIntent pendingIntent2) {
            this.f342918id = j;
            this.waitTime = j2;
            this.pendingIntent = pendingIntent2;
        }

        public int compareTo(AlarmRecord alarmRecord) {
            return (int) (this.f342918id - alarmRecord.f342918id);
        }
    }

    private static boolean cancelAlarmMgr(long j, Context context, PendingIntent pendingIntent) {
        if (((AlarmManager) context.getSystemService("alarm")) == null) {
            Log.m160924e(TAG, "am == null");
            return false;
        } else if (pendingIntent == null) {
            Log.m160924e(TAG, "pendingIntent == null");
            return false;
        } else {
            AlarmHelper.cancel(context, (int) j, pendingIntent);
            pendingIntent.cancel();
            return true;
        }
    }

    private native void onAlarm(long j);

    public static void resetAlarm(Context context) {
        synchronized (gPendingAlarms) {
            for (AlarmRecord next : gPendingAlarms.values()) {
                cancelAlarmMgr(next.f342918id, context, next.pendingIntent);
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
        if (((AlarmManager) context.getSystemService("alarm")) == null) {
            Log.m160924e(TAG, "am == null");
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")");
        intent.putExtra(KEXTRA_ID, j);
        intent.putExtra(KEXTRA_PID, Process.myPid());
        return AlarmHelper.setExact(context, i, 2, j2, intent, 268435456);
    }

    public static boolean start(int i, long j, int i2, Context context) {
        int i3 = i2;
        Context context2 = context;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i3 < 0) {
            Log.m160925e(TAG, "id:%d, after:%d", Long.valueOf(j), Integer.valueOf(i2));
            return false;
        } else if (context2 == null) {
            Log.m160925e(TAG, "null==context, id:%d, after:%d", Long.valueOf(j), Integer.valueOf(i2));
            return false;
        } else {
            synchronized (gPendingAlarms) {
                if (wakerlock == null) {
                    wakerlock = new WakerLock(context2);
                    Log.m160928i(TAG, "start new wakerlock");
                }
                if (bc_alarm == null) {
                    Alarm alarm = new Alarm();
                    bc_alarm = alarm;
                    context2.registerReceiver(alarm, new IntentFilter("ALARM_ACTION(" + String.valueOf(Process.myPid()) + ")"));
                }
                if (gPendingAlarms.containsKey(Long.valueOf(j))) {
                    Log.m160925e(TAG, "id exist=%d", Long.valueOf(j));
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
                Log.m160929i(TAG, "Alarm.start [id: %d, after: %d, size: %d]", Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(gPendingAlarms.size()));
                return true;
            }
        }
    }

    public static boolean stop(long j, Context context) {
        Log.m160929i(TAG, "Alarm.stop [id: %d]", Long.valueOf(j));
        if (context == null) {
            Log.m160924e(TAG, "context==null");
            return false;
        }
        synchronized (gPendingAlarms) {
            if (wakerlock == null) {
                wakerlock = new WakerLock(context);
                Log.m160928i(TAG, "stop new wakerlock");
            }
            if (bc_alarm == null) {
                bc_alarm = new Alarm();
                context.registerReceiver(bc_alarm, new IntentFilter());
                Log.m160928i(TAG, "stop new Alarm");
            }
            AlarmRecord remove = gPendingAlarms.remove(Long.valueOf(j));
            if (remove == null) {
                return false;
            }
            cancelAlarmMgr(remove.f342918id, context, remove.pendingIntent);
            return true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            long longExtra = intent.getLongExtra(KEXTRA_ID, 0);
            int intExtra = intent.getIntExtra(KEXTRA_PID, 0);
            if (0 != longExtra && intExtra != 0) {
                if (intExtra != Process.myPid()) {
                    Log.m160933w(TAG, "onReceive id:%d, pid:%d, mypid:%d", Long.valueOf(longExtra), Integer.valueOf(intExtra), Integer.valueOf(Process.myPid()));
                    return;
                }
                synchronized (gPendingAlarms) {
                    AlarmRecord remove = gPendingAlarms.remove(Long.valueOf(longExtra));
                    if (remove != null) {
                        Log.m160929i(TAG, "Alarm.onReceive [id: %d, delta miss time: %d, size: %d]", Long.valueOf(longExtra), Long.valueOf(SystemClock.elapsedRealtime() - remove.waitTime), Integer.valueOf(gPendingAlarms.size()));
                        WakerLock wakerLock = wakerlock;
                        if (wakerLock != null) {
                            wakerLock.lock(200);
                        }
                        onAlarm(longExtra);
                    } else {
                        Log.m160925e(TAG, "onReceive not found id:%d, pid:%d, gPendingAlarms.size:%d", Long.valueOf(longExtra), Integer.valueOf(intExtra), Integer.valueOf(gPendingAlarms.size()));
                    }
                }
            }
        }
    }
}
