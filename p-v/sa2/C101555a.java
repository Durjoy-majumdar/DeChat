package sa2;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.music.player.base.C94225h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import com.tencent.tav.core.AssetExtension;
import di3.C86312j;
import java.util.LinkedList;
import la2.C99355b;
import la2.C99357e;
import p385u2.C111105a;
import qc0.C101106m;

/* renamed from: sa2.a */
public abstract class C101555a implements C94223g {

    /* renamed from: d */
    public boolean f297302d;

    /* renamed from: e */
    public String f297303e = "";

    /* renamed from: f */
    public boolean f297304f;

    /* renamed from: g */
    public C99357e f297305g;

    /* renamed from: h */
    public C99355b f297306h;

    /* renamed from: i */
    public long f297307i = 0;

    /* renamed from: j */
    public long f297308j = 0;

    /* renamed from: n */
    public long f297309n = 0;

    /* renamed from: o */
    public final PhoneStatusWatcher.PhoneCallListener[] f297310o = {null};

    /* renamed from: p */
    public LinkedList<C94223g.C94224a> f297311p = new LinkedList<>();

    /* renamed from: sa2.a$a */
    public class C101556a implements PhoneStatusWatcher.PhoneCallListener {
        public C101556a() {
        }

        public void onPhoneCall(int i) {
            if (i == 0) {
                C101555a aVar = C101555a.this;
                if (aVar.f297302d) {
                    aVar.f297302d = false;
                    aVar.resume();
                }
            } else if ((i == 1 || i == 2) && C101555a.this.mo32206f()) {
                C101555a aVar2 = C101555a.this;
                aVar2.f297302d = true;
                aVar2.pause();
            }
        }
    }

    /* renamed from: A */
    public void mo141020A(C94223g.C94224a aVar) {
        if (aVar != null && this.f297311p.contains(aVar)) {
            this.f297311p.remove(aVar);
        }
    }

    /* renamed from: l */
    public void mo141021l() {
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138774L();
        }
    }

    /* renamed from: m */
    public void mo141022m() {
        if (C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.READ_PHONE_STATE") != 0) {
            Log.m105920e("MicroMsg.Music.BaseMusicPlayer", "addPhoneStatusWatcher() not have read_phone_state perm");
            return;
        }
        PhoneStatusWatcher.PhoneCallListener[] phoneCallListenerArr = this.f297310o;
        if (phoneCallListenerArr[0] == null) {
            synchronized (phoneCallListenerArr) {
                PhoneStatusWatcher.PhoneCallListener[] phoneCallListenerArr2 = this.f297310o;
                if (phoneCallListenerArr2[0] == null) {
                    phoneCallListenerArr2[0] = new C101556a();
                    ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).addPhoneCallListener(this.f297310o[0]);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo141023n(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onCompleteEvent");
        this.f297303e = "ended";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 7;
        aVar.f9338b = mVar;
        aVar.f9341e = "ended";
        aVar.f9340d = (long) getDuration();
        MusicPlayerEvent.C1094a aVar2 = musicPlayerEvent.f9336d;
        aVar2.f9339c = mVar.f295960e;
        aVar2.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138783i(mVar);
        }
    }

    /* renamed from: o */
    public void mo141024o(C101106m mVar, int i) {
        Log.m105925i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent with errCode:%d", Integer.valueOf(i));
        this.f297303e = "error";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 4;
        aVar.f9338b = mVar;
        aVar.f9341e = "error";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.f9336d.f9345i = C94225h.m119168b(i);
        musicPlayerEvent.f9336d.f9346j = C94225h.m119167a(i);
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138780a0(mVar, i);
        }
    }

    /* renamed from: p */
    public void mo141025p(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onPauseEvent");
        this.f297303e = "pause";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 3;
        aVar.f9338b = mVar;
        aVar.f9341e = "pause";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138770C(mVar);
        }
    }

    /* renamed from: q */
    public void mo141026q(C101106m mVar) {
        Log.m105925i("MicroMsg.Music.BaseMusicPlayer", "onPrepareEvent %b", Boolean.valueOf(mo32206f()));
        this.f297303e = "canplay";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 9;
        aVar.f9338b = mVar;
        aVar.f9341e = "canplay";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138788p0(mVar);
        }
    }

    /* renamed from: r */
    public void mo141027r(C101106m mVar) {
        Log.m105925i("MicroMsg.Music.BaseMusicPlayer", "onPreparingEvent %b", Boolean.valueOf(mo32206f()));
        this.f297303e = "waiting";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 11;
        aVar.f9338b = mVar;
        aVar.f9341e = "waiting";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138785j(mVar);
        }
    }

    /* renamed from: s */
    public void mo141028s(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onResumeEvent");
        this.f297303e = AssetExtension.SCENE_PLAY;
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 1;
        aVar.f9338b = mVar;
        aVar.f9341e = AssetExtension.SCENE_PLAY;
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138769B0(mVar);
        }
    }

    /* renamed from: t */
    public void mo141029t(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onSeekToEvent");
        this.f297303e = "seeked";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 8;
        aVar.f9338b = mVar;
        aVar.f9341e = "seeked";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138777P(mVar);
        }
    }

    /* renamed from: u */
    public void mo141030u(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onSeekingEvent");
        this.f297303e = "seeking";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 12;
        aVar.f9338b = mVar;
        aVar.f9341e = "seeking";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138781b0(mVar);
        }
    }

    /* renamed from: v */
    public void mo141031v(C101106m mVar) {
        Log.m105925i("MicroMsg.Music.BaseMusicPlayer", "onStartEvent %b", Boolean.valueOf(mo32206f()));
        this.f297303e = AssetExtension.SCENE_PLAY;
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 0;
        aVar.f9338b = mVar;
        aVar.f9341e = AssetExtension.SCENE_PLAY;
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138794v0(mVar);
        }
    }

    /* renamed from: w */
    public void mo141032w(C101106m mVar) {
        Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent");
        this.f297303e = "stop";
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 2;
        aVar.f9338b = mVar;
        aVar.f9341e = "stop";
        aVar.f9340d = (long) getDuration();
        musicPlayerEvent.f9336d.f9342f = mo32205c();
        MusicPlayerEvent.C1094a aVar2 = musicPlayerEvent.f9336d;
        boolean z = this.f297304f;
        this.f297304f = false;
        aVar2.f9343g = z;
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
        C99355b bVar = this.f297306h;
        if (bVar != null) {
            bVar.mo138786n0(mVar);
        }
    }

    /* renamed from: x */
    public void mo141033x(C94223g.C94224a aVar) {
        if (aVar != null && !this.f297311p.contains(aVar)) {
            this.f297311p.add(aVar);
        }
    }

    /* renamed from: y */
    public void mo141034y() {
        synchronized (this.f297310o) {
            PhoneStatusWatcher.PhoneCallListener phoneCallListener = this.f297310o[0];
            if (phoneCallListener != null) {
                ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).removePhoneCallListener(phoneCallListener);
                this.f297310o[0] = null;
            }
        }
    }

    /* renamed from: z */
    public boolean mo141035z() {
        C99355b bVar = this.f297306h;
        return bVar != null && bVar.requestFocus();
    }
}
