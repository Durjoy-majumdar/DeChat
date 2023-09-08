package com.tencent.p014mm.plugin.rtos.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import p206nj.C11171e;
import p206nj.C88956h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard;", "Landroid/app/Service;", "<init>", "()V", "InnerService", "a", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard */
public final class RtosWatchServiceGuard extends Service {

    /* renamed from: d */
    public int f248879d = -1;

    /* renamed from: e */
    public int f248880e = -1;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard$InnerService;", "Landroid/app/Service;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard$InnerService */
    public static final class InnerService extends Service {
        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            try {
                startForeground(-1214, new Notification());
            } catch (NullPointerException e) {
                Log.m105921e("MicroMsg.Rtos.RtosWatchServiceGuard.InnerService", "set service for push exception:%s.", e);
            }
            stopSelf();
        }

        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard$a */
    public static final class C85407a extends Binder {
    }

    public IBinder onBind(Intent intent) {
        int myPid = Process.myPid();
        Log.m105919d("MicroMsg.Rtos.RtosWatchServiceGuard", "onBind last pid:%d pid:%d threadID:" + Thread.currentThread(), Integer.valueOf(this.f248879d), Integer.valueOf(myPid));
        return new C85407a();
    }

    public void onCreate() {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceGuard", "onCreate threadID:" + Thread.currentThread());
        super.onCreate();
        if (C11171e.m11044a(26)) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchServiceGuard", "stayForeground");
            if (Build.VERSION.SDK_INT < 24 && !C88956h.m111063d() && getSharedPreferences("system_config_prefs", 4).getBoolean("set_service", false)) {
                startForeground(-1214, new Notification());
                startService(new Intent(this, InnerService.class));
                Log.m105924i("MicroMsg.Rtos.RtosWatchServiceGuard", "set service for exdevice.");
            }
        }
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceGuard", "onDestroy threadID:" + Thread.currentThread());
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceGuard", "onRebind");
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int myPid = Process.myPid();
        Log.m105925i("MicroMsg.Rtos.RtosWatchServiceGuard", "onStartCommand last pid:%d pid:%d flags:%d startId:%d", Integer.valueOf(this.f248880e), Integer.valueOf(myPid), Integer.valueOf(i), Integer.valueOf(i2));
        if (myPid != this.f248880e) {
            this.f248880e = myPid;
        }
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        Log.m105918d("MicroMsg.Rtos.RtosWatchServiceGuard", "onUnbind");
        return super.onUnbind(intent);
    }
}
