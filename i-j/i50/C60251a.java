package i50;

import android.content.Context;
import android.graphics.Point;
import c30.C104289g;
import c30.C79922d;
import c30.C79923f;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloud;
import eb0.C31543z5;
import gy3.C87412m;
import java.io.IOException;
import p50.C62197e;
import w50.C65928b;
import z04.C119027c;

/* renamed from: i50.a */
public final class C60251a extends C62197e {

    /* renamed from: k1 */
    public static C60251a f171781k1;

    /* renamed from: j1 */
    public final MTimerHandler f171782j1 = new MTimerHandler("anchor_secondary_sei_sender", (MTimerHandler.CallBack) new C60252a(this), true);

    /* renamed from: i50.a$a */
    public static final class C60252a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C60251a f171783d;

        public C60252a(C60251a aVar) {
            this.f171783d = aVar;
        }

        public final boolean onTimerExpired() {
            TRTCCloud W = this.f171783d.mo85679W();
            C60251a aVar = this.f171783d;
            aVar.getClass();
            C79922d dVar = new C79922d();
            dVar.mo110094b("userId", aVar.f172989A.f166260g);
            TXAudioEffectManager.AudioMusicParam audioMusicParam = aVar.f172994F;
            dVar.mo110094b("songId", Integer.valueOf(audioMusicParam != null ? audioMusicParam.f154608id : 0));
            dVar.mo110094b("playStatus", Integer.valueOf(aVar.f172995G ? 1 : 0));
            dVar.mo110094b("st", Long.valueOf(C31543z5.m39453c()));
            C104289g gVar = new C104289g();
            try {
                gVar.mo145967r("wxT", 16);
                gVar.mo145967r("d", dVar.toString());
            } catch (C79923f | IOException unused) {
            }
            Log.m105918d("MicroMsg.LiveCoreSecondaryDevice", "prepareAnchorSeiInfo json:" + gVar);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "prepareAnchorSeiInfo().toString()");
            byte[] bytes = gVar2.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            W.sendSEIMsg(bytes, 1);
            return true;
        }
    }

    /* renamed from: B */
    public void mo33283B(int i) {
        super.mo33283B(i);
        this.f171782j1.stopTimer();
    }

    /* renamed from: M0 */
    public void mo85235M0(boolean z) {
        TXAudioEffectManager.AudioMusicParam audioMusicParam;
        super.mo85235M0(z);
        if (z) {
            TXAudioEffectManager.AudioMusicParam audioMusicParam2 = this.f172994F;
            if (audioMusicParam2 != null) {
                mo85679W().getAudioEffectManager().pausePlayMusic(audioMusicParam2.f154608id);
            }
        } else if (this.f172995G && (audioMusicParam = this.f172994F) != null) {
            mo85679W().getAudioEffectManager().resumePlayMusic(audioMusicParam.f154608id);
        }
    }

    /* renamed from: P */
    public Point mo85236P(Context context) {
        C87412m.m108594g(context, "context");
        return C65928b.f189533a.mo89963a(this.f176825b1, this.f176826c1);
    }

    /* renamed from: o */
    public void mo33295o(long j) {
        super.mo33295o(j);
        if (j > 0) {
            this.f171782j1.startTimer(1000, 1000);
        }
    }

    /* renamed from: y0 */
    public void mo85237y0(String str) {
        C87412m.m108594g(str, "privateMapKey");
        if (!Util.isNullOrNil(str)) {
            C104289g gVar = new C104289g();
            gVar.put("privateMapKey", str);
            C104289g gVar2 = new C104289g();
            gVar2.put(ProviderConstants.API_PATH, "updatePrivateMapKey");
            gVar2.put("params", gVar);
            Log.m105924i("MicroMsg.LiveCoreSecondaryDevice", "updatePrivateMapKey:" + gVar2 + ' ');
            mo85679W().callExperimentalAPI(gVar2.toString());
        }
    }
}
