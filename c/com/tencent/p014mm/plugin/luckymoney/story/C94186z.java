package com.tencent.p014mm.plugin.luckymoney.story;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.api.ITPPlayer;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.z */
public class C94186z implements C96814a.C57541b {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeStoryVideoManager.C94180e f272102d;

    /* renamed from: e */
    public final /* synthetic */ EnvelopeStoryVideoManager f272103e;

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.z$a */
    public class C94187a implements Runnable {
        public C94187a() {
        }

        public void run() {
            ProgressBar progressBar = C94186z.this.f272102d.f272087s;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            View findViewById = C94186z.this.f272102d.f272081m.findViewById(C0966R.C0970id.l7c);
            if (findViewById != null) {
                View view = (View) findViewById.getParent();
                view.setFocusable(false);
                ((View) view.getParent()).setFocusable(false);
            }
            if (C94186z.this.f272102d.f272081m.getParent() != null) {
                ((ViewGroup) C94186z.this.f272102d.f272081m.getParent()).bringToFront();
            }
            EnvelopeStoryVideoManager.C94180e eVar = C94186z.this.f272102d;
            if (!eVar.f272074f) {
                eVar.f272085q.setVisibility(0);
            }
        }
    }

    public C94186z(EnvelopeStoryVideoManager envelopeStoryVideoManager, EnvelopeStoryVideoManager.C94180e eVar) {
        this.f272103e = envelopeStoryVideoManager;
        this.f272102d = eVar;
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaitingEnd: %s, %s", str, str2);
        EnvelopeStoryVideoManager.C94180e eVar = this.f272102d;
        if (eVar.f272075g > 0) {
            long j = (long) eVar.f272076h;
            EnvelopeStoryVideoManager.C94180e eVar2 = this.f272102d;
            eVar.f272076h = (int) (j + ((SystemClock.elapsedRealtime() / 1000) - ((long) eVar2.f272075g)));
            eVar2.f272075g = 0;
        }
        ProgressBar progressBar = this.f272102d.f272087s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "onVideoFirstFrameDraw: %s, %s", str, str2);
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaiting: %s, %s, %s", str, str2, bool);
        if (this.f272103e.f272050d.isFinishing() || this.f272103e.f272050d.isDestroyed()) {
            this.f272103e.mo129406e();
            return;
        }
        this.f272102d.f272075g = ((int) SystemClock.elapsedRealtime()) / 1000;
        ProgressBar progressBar = this.f272102d.f272087s;
        if (progressBar != null) {
            progressBar.bringToFront();
            this.f272102d.f272087s.setVisibility(0);
        }
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "on video end: %s, %s", str, str2);
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        Log.m105921e("MicroMsg.EnvelopeStoryVideoManager", "onError: %s, %s, %s", str, str2, str3);
        C115669n nVar = C115669n.INSTANCE;
        EnvelopeStoryVideoManager.C94180e eVar = this.f272102d;
        nVar.mo160131h(19228, eVar.f272071c, Integer.valueOf(eVar.f272081m.getVideoDurationSec()), 2, Integer.valueOf(this.f272102d.f272077i), Integer.valueOf(this.f272102d.f272081m.getRealPlayDurationSec()), Integer.valueOf(this.f272102d.f272076h), 0, Integer.valueOf(i));
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "on prepared: %s, %s", str, str2);
        EnvelopeStoryVideoManager.C94180e eVar = this.f272102d;
        eVar.f272081m.getVideoDurationSec();
        eVar.getClass();
        MMHandlerThread.postToMainThreadDelayed(new C94187a(), 10);
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPause: %s, %s", str, str2);
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPlay: %s, %s", str, str2);
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }
}
