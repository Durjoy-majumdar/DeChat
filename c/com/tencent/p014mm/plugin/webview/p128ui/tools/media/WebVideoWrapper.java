package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.ITPPlayer;
import eb0.C97621e;
import vd3.C102173o;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.WebVideoWrapper */
public class WebVideoWrapper extends RelativeLayout implements C96814a, C96814a.C96816c, C96814a.C57541b, C97621e.C97622a {

    /* renamed from: d */
    public int f283139d;

    /* renamed from: e */
    public Context f283140e;

    /* renamed from: f */
    public C96814a f283141f;

    /* renamed from: g */
    public C96814a.C57541b f283142g;

    /* renamed from: h */
    public C97621e f283143h;

    public WebVideoWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22955F(str, str2);
        }
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22957I3(str, str2, bool);
        }
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        Log.m105925i("MicroMsg.WebVideoWrapper", "%d onVideoEnded", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22958L(str, str2);
        }
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        Log.m105929w("MicroMsg.WebVideoWrapper", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), str3, Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22960T(str, str2, str3, i, i2);
        }
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        Log.m105925i("MicroMsg.WebVideoWrapper", "%d onPrepared", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22962Z(str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return ((CommonVideoView) aVar).mo79613a(d, z);
        }
        return false;
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        Log.m105919d("MicroMsg.WebVideoWrapper", "%d onVideoPause", Integer.valueOf(hashCode()));
        setKeepScreenOn(false);
        this.f283143h.mo136889a();
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22963a0(str, str2);
        }
    }

    /* renamed from: b */
    public void mo79614b() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((CommonVideoView) aVar).mo79614b();
        }
        this.f283143h.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: c */
    public void mo79616c() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((AbstractVideoView) aVar).mo79616c();
        }
        this.f283143h.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: f */
    public void mo79617f() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((CommonVideoView) aVar).mo79617f();
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    public int getCacheTimeSec() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return aVar.getCacheTimeSec();
        }
        return 0;
    }

    public int getCurrPosMs() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return aVar.getCurrPosMs();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return aVar.getCurrPosSec();
        }
        return 0;
    }

    public int getPlayerType() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return aVar.getPlayerType();
        }
        return 0;
    }

    public int getVideoDurationSec() {
        C96814a aVar = this.f283141f;
        return aVar != null ? aVar.getVideoDurationSec() : this.f283139d;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        this.f283139d = i;
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((CommonVideoView) aVar).mo76636h(z, str, i);
        }
    }

    /* renamed from: i */
    public boolean mo129198i() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return ((CommonVideoView) aVar).mo129198i();
        }
        return false;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
    }

    public boolean isPlaying() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            return ((AbstractVideoView) aVar).isPlaying();
        }
        return false;
    }

    public void kvStat(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.WebVideoWrapper", "%d onGetVideoSize[%d %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22964l0(str, str2, i, i2);
        }
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        Log.m105919d("MicroMsg.WebVideoWrapper", "%d onVideoPlay", Integer.valueOf(hashCode()));
        setKeepScreenOn(true);
        this.f283143h.mo136891c(this);
        C96814a.C57541b bVar = this.f283142g;
        if (bVar != null) {
            bVar.mo22965m0(str, str2);
        }
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }

    public boolean pause() {
        if (this.f283141f == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f283143h.mo136889a();
        return ((AbstractVideoView) this.f283141f).pause();
    }

    public boolean play() {
        if (this.f283141f == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f283143h.mo136891c(this);
        return ((AbstractVideoView) this.f283141f).play();
    }

    public void setCover(Bitmap bitmap) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setCover(bitmap);
        }
    }

    public void setFullDirection(int i) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setFullDirection(i);
        }
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        this.f283142g = bVar;
    }

    public void setIsShowBasicControls(boolean z) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setIsShowBasicControls(z);
        }
    }

    public void setKeepScreenOn(boolean z) {
        Log.m105919d("MicroMsg.WebVideoWrapper", "set keep screen on[%b] stack[%s]", Boolean.valueOf(z), Util.getStack());
        super.setKeepScreenOn(z);
    }

    public void setLoop(boolean z) {
    }

    public void setLoopCompletionCallback(C96814a.C57542d dVar) {
    }

    public void setMute(boolean z) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setMute(z);
        }
    }

    public boolean setPlayRate(float f) {
        C96814a aVar;
        if (f > 0.0f && (aVar = this.f283141f) != null) {
            return ((CommonVideoView) aVar).setPlayRate(f);
        }
        return false;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setScaleType(eVar);
        }
    }

    public void setVideoFooterView(C102173o oVar) {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            aVar.setVideoFooterView(oVar);
        }
    }

    public void start() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((CommonVideoView) aVar).start();
            setKeepScreenOn(true);
            this.f283143h.mo136891c(this);
        }
    }

    public void stop() {
        C96814a aVar = this.f283141f;
        if (aVar != null) {
            ((AbstractVideoView) aVar).stop();
            this.f283143h.mo136889a();
            setKeepScreenOn(false);
        }
    }

    public WebVideoWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283140e = context;
        this.f283143h = new C97621e();
        if (this.f283141f == null) {
            CommonVideoView commonVideoView = new CommonVideoView(this.f283140e);
            commonVideoView.setReporter(this);
            commonVideoView.setIMMVideoViewCallback(this);
            idkeyStat(600, 200, 1, false);
            this.f283141f = commonVideoView;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView((View) this.f283141f, layoutParams);
    }
}
