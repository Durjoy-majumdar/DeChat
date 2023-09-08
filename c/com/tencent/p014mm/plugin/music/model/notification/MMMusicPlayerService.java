package com.tencent.p014mm.plugin.music.model.notification;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import la2.C99358f;
import la2.C99364n;
import ma2.C99815p;
import ra2.C101365a;
import ua2.C101991b;

/* renamed from: com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService */
public class MMMusicPlayerService extends Service {

    /* renamed from: d */
    public C94212a f272162d;

    /* renamed from: e */
    public Runnable f272163e = new C94210a();

    /* renamed from: com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService$a */
    public class C94210a implements Runnable {
        public C94210a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "quit");
            MMHandlerThread.removeRunnable(MMMusicPlayerService.this.f272163e);
            MMMusicPlayerService.this.stopSelf();
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService$b */
    public class C94211b extends Binder {
        public C94211b() {
        }

        /* renamed from: a */
        public MMMusicPlayerService mo129514a() {
            return MMMusicPlayerService.this;
        }
    }

    /* renamed from: a */
    public void mo129505a(C101365a aVar) {
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "pause");
        if (aVar == null) {
            Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        MMHandlerThread.removeRunnable(this.f272163e);
        C94212a aVar2 = this.f272162d;
        if (!aVar2.f272166a) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, pause err");
        } else if (aVar2.f272168c == null) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        } else {
            Log.m105924i("MicroMsg.Music.MMMusicNotification", "pause");
            MMHandlerThread.removeRunnable(aVar2.f272171f);
            aVar2.f272169d.notify(291, aVar2.mo129515a(aVar2.f272168c, aVar, false));
        }
    }

    /* renamed from: b */
    public void mo129506b(C101365a aVar) {
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", AssetExtension.SCENE_PLAY);
        if (aVar == null) {
            Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        MMHandlerThread.removeRunnable(this.f272163e);
        C94212a aVar2 = this.f272162d;
        if (!aVar2.f272166a) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, play err");
        } else if (aVar2.f272168c == null) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        } else {
            Log.m105924i("MicroMsg.Music.MMMusicNotification", AssetExtension.SCENE_PLAY);
            MMHandlerThread.removeRunnable(aVar2.f272171f);
            try {
                MMMusicPlayerService mMMusicPlayerService = aVar2.f272168c;
                mMMusicPlayerService.startForeground(291, aVar2.mo129515a(mMMusicPlayerService, aVar, true));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Music.MMMusicNotification", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public void mo129507c() {
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "initNotification");
        C99358f fVar = (C99358f) C101991b.m134284b(C99358f.class);
        if (fVar == null) {
            Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "initNotification logic music is null, return");
            return;
        }
        C101365a U = fVar.mo138809U();
        if (U == null) {
            Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "initNotification music is null, return");
        } else if (!Util.isNullOrNil(U.field_protocol)) {
            Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "exoplayer play audio, ingore");
        } else {
            C94223g a = C99364n.m129616h().mo138822a();
            if (a == null) {
                Log.m105920e("MicroMsg.Music.MMMusicPlayerService", "musicPlayer is null, return");
            } else if (a.mo32206f()) {
                mo129506b(U);
            } else if (a.mo32194e()) {
                mo129505a(U);
            }
        }
    }

    /* renamed from: d */
    public void mo129508d() {
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "stop");
        C94212a aVar = this.f272162d;
        if (!aVar.f272166a) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, close err");
        } else if (aVar.f272168c == null) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        } else {
            Log.m105924i("MicroMsg.Music.MMMusicNotification", "close");
            MMHandlerThread.removeRunnable(aVar.f272171f);
            MMHandlerThread.postToMainThreadDelayed(aVar.f272171f, 1000);
        }
        MMHandlerThread.removeRunnable(this.f272163e);
        MMHandlerThread.postToMainThreadDelayed(this.f272163e, 60000);
    }

    public IBinder onBind(Intent intent) {
        return new C94211b();
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "onCreate");
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C94212a aVar = new C94212a();
        this.f272162d = aVar;
        Log.m105924i("MicroMsg.Music.MMMusicNotification", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        aVar.f272168c = this;
        aVar.f272169d = (NotificationManager) getSystemService("notification");
        aVar.f272172g = new C94214b(aVar);
        C94215c cVar = new C94215c(aVar);
        aVar.f272170e = cVar;
        C99815p.C99817b.f292514b.f292503o.add(cVar);
        registerReceiver(aVar.f272172g, new IntentFilter("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK"));
        aVar.f272166a = true;
        mo129507c();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.Music.MMMusicPlayerService", "onDestroy");
        C94212a aVar = this.f272162d;
        aVar.getClass();
        Log.m105924i("MicroMsg.Music.MMMusicNotification", "uninit");
        aVar.f272168c.unregisterReceiver(aVar.f272172g);
        C99815p pVar = C99815p.C99817b.f292514b;
        C99815p.C99818c cVar = aVar.f272170e;
        if (cVar != null) {
            pVar.f292503o.remove(cVar);
        } else {
            pVar.getClass();
        }
        aVar.f272172g = null;
        aVar.f272168c = null;
        aVar.f272169d = null;
        aVar.f272166a = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
