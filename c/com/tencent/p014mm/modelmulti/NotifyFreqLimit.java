package com.tencent.p014mm.modelmulti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.modelmulti.NotifyFreqLimit */
public class NotifyFreqLimit extends BroadcastReceiver {

    /* renamed from: a */
    public static byte[] f10407a = new byte[0];

    static {
        new LinkedList();
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        try {
            synchronized (f10407a) {
                if (intent2 != null) {
                    if ("com.tencent.mm.NotifyFreqLimit.AlarmReceiver".equals(intent.getAction())) {
                        long longExtra = intent2.getLongExtra("hashCode", 0);
                        long nowMilliSecond = Util.nowMilliSecond() - longExtra;
                        int intExtra = intent2.getIntExtra("pid", 0);
                        long longExtra2 = intent2.getLongExtra("delaySecond", 0) * 1000;
                        int myPid = Process.myPid();
                        long id = Thread.currentThread().getId();
                        Log.m105925i("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", Long.valueOf(longExtra), Integer.valueOf(intExtra), Integer.valueOf(myPid), Long.valueOf(id), Long.valueOf(nowMilliSecond), Long.valueOf(longExtra2), null, null);
                        C115669n.INSTANCE.idkeyStat(99, 156, 1, false);
                        Log.m105921e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: SENDER NULL alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", Long.valueOf(longExtra), Integer.valueOf(intExtra), Integer.valueOf(myPid), Long.valueOf(id), Long.valueOf(nowMilliSecond), Long.valueOf(longExtra2), null, null);
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = intent2 == null ? "intent is null" : intent.getAction();
                Log.m105921e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive intent:%s", objArr);
            }
        } catch (Throwable th) {
            C115669n.INSTANCE.idkeyStat(99, 151, 1, false);
            Log.m105921e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive e:%s", Util.stackTraceToString(th));
        }
    }
}
