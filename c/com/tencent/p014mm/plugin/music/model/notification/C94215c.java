package com.tencent.p014mm.plugin.music.model.notification;

import android.os.Bundle;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import la2.C99358f;
import la2.C99364n;
import ma2.C99815p;
import ra2.C101365a;
import ua2.C101991b;

/* renamed from: com.tencent.mm.plugin.music.model.notification.c */
public class C94215c implements C99815p.C99818c {

    /* renamed from: a */
    public final /* synthetic */ C94212a f272175a;

    public C94215c(C94212a aVar) {
        this.f272175a = aVar;
    }

    /* renamed from: a */
    public void mo129519a(Bundle bundle) {
        Log.m105918d("MicroMsg.Music.MMMusicNotification", "alvinluo onMusicDataChanged");
        this.f272175a.f272167b = bundle;
        C94223g a = C99364n.m129616h().mo138822a();
        if (a == null) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
            return;
        }
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (U == null) {
            Log.m105920e("MicroMsg.Music.MMMusicNotification", "music is null, return");
        } else if (this.f272175a.f272168c != null && a.mo32211k()) {
            Log.m105924i("MicroMsg.Music.MMMusicNotification", "update notification");
            C94212a aVar = this.f272175a;
            aVar.f272169d.notify(291, aVar.mo129515a(aVar.f272168c, U, a.mo32206f()));
        }
    }
}
