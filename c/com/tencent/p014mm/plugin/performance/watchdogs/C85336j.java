package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p723vf.C118672d;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.j */
public final class C85336j {
    /* renamed from: a */
    public static final void m105351a(Context context, int i, String str, String str2, Intent intent) {
        Notification.Builder builder;
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent activity = i2 >= 23 ? PendingIntent.getActivity(context, 0, intent, 201326592) : PendingIntent.getActivity(context, 0, intent, 134217728);
        if (i2 >= 26) {
            Object systemService = context.getSystemService("notification");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor") == null) {
                C118672d.m167355e("MicroMsg.MemoryLimitPublisher", "create channel", new Object[0]);
                notificationManager.createNotificationChannel(new NotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor", "com.tencent.matrix.resource.processor.ManualDumpProcessor", 4));
            }
            builder = new Notification.Builder(context, "com.tencent.matrix.resource.processor.ManualDumpProcessor");
        } else {
            builder = new Notification.Builder(context);
        }
        builder.setContentTitle(str).setStyle(new Notification.BigTextStyle().bigText(str2)).setSmallIcon(C0966R.C0969drawable.bsd).setAutoCancel(true).setContentIntent(activity).setWhen(System.currentTimeMillis());
        Object systemService2 = context.getSystemService("notification");
        C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService2).notify(i, builder.build());
    }
}
