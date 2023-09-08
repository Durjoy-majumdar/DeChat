package com.tencent.p014mm.plugin.talkroom.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import p970gg.C87186a;

/* renamed from: com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver */
public class TalkRoomReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f347406a = 0;

    /* renamed from: a */
    public static void m162870a(Context context) {
        long fire = MAlarmHandler.fire();
        Log.m105918d("MicroMsg.TalkRoomReceiver", "bumper comes, next=" + fire);
        if (fire <= 600000) {
            if (fire < 30000) {
                fire = 30000;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Log.m105929w("MicroMsg.TalkRoomReceiver", "reset bumper, interval:%d, now:%d", Long.valueOf(fire), Long.valueOf(elapsedRealtime));
            C87186a.m108241d(context, 107, 2, elapsedRealtime + fire, new Intent(context, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 268435456, true);
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("MMBoot_Bump", false);
        Log.m105924i("MicroMsg.TalkRoomReceiver", "[ALARM NOTIFICATION] bump:" + booleanExtra);
        m162870a(context);
    }
}
