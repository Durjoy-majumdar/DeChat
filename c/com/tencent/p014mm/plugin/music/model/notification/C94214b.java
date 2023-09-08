package com.tencent.p014mm.plugin.music.model.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import la2.C99358f;
import la2.C99364n;
import ma2.C99815p;
import qa2.C101083d;
import ra2.C101365a;
import ua2.C101991b;
import za2.C102982a;

/* renamed from: com.tencent.mm.plugin.music.model.notification.b */
public class C94214b extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C94212a f272174a;

    public C94214b(C94212a aVar) {
        this.f272174a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        Class cls = C99358f.class;
        if (intent != null && !Util.isNullOrNil(intent.getAction())) {
            String stringExtra = intent.getStringExtra("mm_music_notification_action_key");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105920e("MicroMsg.Music.MMMusicNotification", "action is null, err, return");
                return;
            }
            Log.m105925i("MicroMsg.Music.MMMusicNotification", "action:%s", stringExtra);
            C94223g a = C99364n.m129616h().mo138822a();
            if (a == null) {
                Log.m105920e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
                return;
            }
            C101365a U = ((C99358f) C101991b.m134284b(cls)).mo138809U();
            if (U == null) {
                Log.m105920e("MicroMsg.Music.MMMusicNotification", "music is null, return");
            } else if (stringExtra.equals("mm_music_notification_action_play")) {
                a.resume();
                Bundle bundle = this.f272174a.f272167b;
                if (bundle != null) {
                    C99815p.C99817b.f292514b.mo139174L0(bundle);
                }
                C101083d.m132454c(2, U);
            } else if (stringExtra.equals("mm_music_notification_action_pause")) {
                a.mo32196i();
                C102982a l = C99364n.m129617l();
                l.getClass();
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
                AudioManager audioManager = l.f303912a;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(l.f303913b);
                }
                C101083d.m132454c(3, U);
            } else if (stringExtra.equals("mm_music_notification_action_pre")) {
                if (U.field_musicType == 11) {
                    Bundle bundle2 = this.f272174a.f272167b;
                    if (bundle2 != null) {
                        C99815p.C99817b.f292514b.mo139174L0(bundle2);
                    }
                    C99364n.m129616h().mo138833n(true);
                } else if (((C99358f) C101991b.m134284b(cls)).getMode() == 2) {
                    MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                    MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                    aVar.f9337a = 17;
                    aVar.f9341e = "";
                    musicPlayerEvent.asyncPublish(Looper.getMainLooper());
                    ((C99358f) C101991b.m134284b(cls)).mo138821y0();
                } else {
                    a.mo32203a(0);
                    a.resume();
                }
                this.f272174a.mo129516c(U, 13, a.mo32205c());
                C101083d.m132454c(1, U);
            } else if (stringExtra.equals("mm_music_notification_action_next")) {
                if (U.field_musicType == 11) {
                    Bundle bundle3 = this.f272174a.f272167b;
                    if (bundle3 != null) {
                        C99815p.C99817b.f292514b.mo139174L0(bundle3);
                    }
                    C99364n.m129616h().mo138833n(true);
                } else if (((C99358f) C101991b.m134284b(cls)).getMode() == 2) {
                    MusicPlayerEvent musicPlayerEvent2 = new MusicPlayerEvent();
                    MusicPlayerEvent.C1094a aVar2 = musicPlayerEvent2.f9336d;
                    aVar2.f9337a = 16;
                    aVar2.f9341e = "";
                    musicPlayerEvent2.asyncPublish(Looper.getMainLooper());
                    ((C99358f) C101991b.m134284b(cls)).mo138808R();
                } else {
                    a.mo32203a(0);
                    a.resume();
                }
                this.f272174a.mo129516c(U, 14, a.mo32205c());
                C101083d.m132454c(4, U);
            } else if (stringExtra.equals("mm_music_notification_action_close")) {
                MMHandlerThread.postToMainThread(this.f272174a.f272171f);
                a.mo32210j();
                C101083d.m132454c(5, U);
            }
        }
    }
}
