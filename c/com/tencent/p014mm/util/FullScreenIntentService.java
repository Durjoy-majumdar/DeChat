package com.tencent.p014mm.util;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.RemoteViews;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C11171e;
import p645pj.C77091b;
import p918s2.C90116e;
import zc2.C91661e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/util/FullScreenIntentService;", "Landroid/app/Service;", "<init>", "()V", "FullScreenOperationReceiver", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.util.FullScreenIntentService */
public final class FullScreenIntentService extends Service {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/util/FullScreenIntentService$FullScreenOperationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.util.FullScreenIntentService$FullScreenOperationReceiver */
    public static final class FullScreenOperationReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
        }
    }

    public IBinder onBind(Intent intent) {
        C87412m.m108594g(intent, "intent");
        return null;
    }

    public void onCreate() {
        Log.m105924i("MicroMsg.FullScreenIntentService", "FullScreenIntentService onCreate");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.FullScreenIntentService", "FullScreenIntentService service onDestroy");
        ((MMNotification) C91661e.f262638a).mo93207e(41);
        stopForeground(true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C90116e.C90121c cVar;
        Intent intent2 = intent;
        if ((C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q")) && intent2 != null) {
            Log.m105924i("MicroMsg.FullScreenIntentService", "FullScreenIntentService calling service is on bind " + "MicroMsg.FullScreenIntentService" + intent.hasFileDescriptors());
            if (C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q")) {
                Log.m105924i("MicroMsg.FullScreenIntentService", "FullScreenIntentService calling  service is on bind " + "MicroMsg.FullScreenIntentService" + intent.hasFileDescriptors());
                String packageName = getPackageName();
                String stringExtra = intent2.getStringExtra("destClass");
                C87412m.m108591d(stringExtra);
                intent2.setClassName(packageName, stringExtra);
                RemoteViews remoteViews = (RemoteViews) intent2.getParcelableExtra("fullscreenRemoteview");
                String stringExtra2 = intent2.getStringExtra("contentText");
                intent2.setFlags(268435456);
                String stringExtra3 = intent2.getStringExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
                boolean booleanExtra = intent2.getBooleanExtra("notifyStill", false);
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, 134217728);
                if (Build.VERSION.SDK_INT >= 26) {
                    if (remoteViews != null) {
                        C87412m.m108591d(stringExtra3);
                        cVar = new C90116e.C90121c(this, stringExtra3);
                        cVar.f258798j = 1;
                        cVar.f258806r = "call";
                        long currentTimeMillis = System.currentTimeMillis();
                        Notification notification = cVar.f258814z;
                        notification.when = currentTimeMillis;
                        cVar.f258810v = remoteViews;
                        cVar.f258811w = remoteViews;
                        notification.icon = C0966R.C0969drawable.c9k;
                        cVar.f258795g = activity;
                        cVar.mo124383h(getString(C0966R.string.a25));
                        cVar.mo124382g(stringExtra2);
                        cVar.f258796h = activity;
                        cVar.mo124384i(128, true);
                        cVar.mo124384i(2, true);
                        cVar.mo124384i(16, true);
                    } else {
                        cVar = new C90116e.C90121c(this, C77091b.m93028j());
                        cVar.f258798j = 1;
                        cVar.f258806r = "reminder";
                        cVar.f258814z.when = System.currentTimeMillis();
                        cVar.mo124382g(stringExtra2);
                        cVar.mo124383h(getString(C0966R.string.a25));
                        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
                        cVar.f258795g = activity;
                        cVar.f258796h = activity;
                        cVar.mo124384i(128, true);
                        cVar.mo124384i(2, true);
                        cVar.mo124384i(16, true);
                    }
                    Notification b = cVar.mo124378b();
                    C87412m.m108593f(b, "builder.build()");
                    if (booleanExtra) {
                        b.flags |= 4;
                    }
                    try {
                        if (MMApplicationContext.isMMProcessExist()) {
                            Log.m105924i("MicroMsg.FullScreenIntentService", "current mmprocess is exits");
                        }
                        ((MMNotification) C91661e.f262638a).mo93215l(41, b, true);
                    } catch (Exception e) {
                        Log.m105925i("MicroMsg.FullScreenIntentService", "start foreground service happened error %s", e.getMessage());
                    }
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
        C87412m.m108594g(intent, "rootIntent");
        Log.m105925i("MicroMsg.FullScreenIntentService", "onTaskRemoved: %s", intent);
        super.onTaskRemoved(intent);
        ((MMNotification) C91661e.f262638a).mo93207e(41);
        stopSelf();
    }

    public boolean onUnbind(Intent intent) {
        C87412m.m108594g(intent, "intent");
        Log.m105924i("MicroMsg.FullScreenIntentService", "FullScreenIntentService service onUnbind");
        return super.onUnbind(intent);
    }

    public boolean stopService(Intent intent) {
        C87412m.m108594g(intent, "name");
        ((MMNotification) C91661e.f262638a).mo93207e(41);
        stopForeground(true);
        return super.stopService(intent);
    }
}
