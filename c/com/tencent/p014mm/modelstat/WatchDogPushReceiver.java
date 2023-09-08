package com.tencent.p014mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import ee0.C86509a;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.modelstat.WatchDogPushReceiver */
public class WatchDogPushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static String f237959a = "";

    /* renamed from: a */
    public static String m98922a() {
        if (Util.isNullOrNil(f237959a)) {
            f237959a = MMApplicationContext.getSourcePackageName() + ".modelstat.WatchDogPushReceiver";
        }
        return f237959a;
    }

    /* renamed from: b */
    public static void m98923b() {
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.WatchDogPushReceiver");
        intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), m98922a()));
        intent.putExtra("type", 3);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }

    /* renamed from: c */
    public static void m98924c(int i) {
        if (CrashReportFactory.hasDebuger()) {
            Intent intent = new Intent();
            intent.setAction("com.tencent.mm.WatchDogPushReceiver");
            intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), m98922a()));
            intent.putExtra("type", 5);
            intent.putExtra("jni", i);
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("type", 0);
        Log.m105918d("MicroMsg.WatchDogPushReceiver", "onReceive type:" + intExtra);
        if (intExtra == 1) {
            C86509a aVar = new C86509a();
            aVar.f251333a = (long) intent.getIntExtra("rtType", 0);
            aVar.f251334b = intent.getLongExtra("beginTime", 0);
            aVar.f251335c = intent.getLongExtra("endTime", 0);
            boolean booleanExtra = intent.getBooleanExtra("isSend", false);
            if (!booleanExtra) {
                aVar.f251338f = intent.getLongExtra("dataLen", 0);
            } else {
                aVar.f251337e = intent.getLongExtra("dataLen", 0);
            }
            aVar.f251336d = intent.getLongExtra("cost", 0);
            aVar.f251339g = intent.getLongExtra("doSceneCount", 0);
            Log.m105918d("MicroMsg.WatchDogPushReceiver", "onRecv: rtType:" + aVar.f251333a + " isSend:" + booleanExtra + " tx:" + aVar.f251337e + " rx:" + aVar.f251338f + " begin:" + aVar.f251334b + " end:" + aVar.f251335c);
            if (!(aVar.f251339g == 0 || aVar.f251333a == 0)) {
                long j = aVar.f251334b;
                if (j != 0) {
                    long j2 = aVar.f251335c;
                    if (j2 != 0 && j2 - j > 0) {
                        return;
                    }
                }
            }
            Log.m105928w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + aVar.f251339g + " rtType:" + aVar.f251333a + " begin:" + aVar.f251334b + " end:" + aVar.f251335c);
        } else if (intExtra != 2 && intExtra != 3 && intExtra != 4) {
            if (intExtra != 5 || !CrashReportFactory.hasDebuger()) {
                if (intExtra == 6) {
                    Log.appenderFlush();
                }
            } else if (intent.getIntExtra("jni", 1) == 1) {
                Assert.assertTrue("test errlog push " + new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date()), false);
            } else {
                MMProtocalJni.setClientPackVersion(-1);
            }
        }
    }
}
