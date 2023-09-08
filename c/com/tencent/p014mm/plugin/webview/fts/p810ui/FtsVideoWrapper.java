package com.tencent.p014mm.plugin.webview.fts.p810ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.ITPPlayer;
import eb0.C97621e;
import vd3.C102173o;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper */
public class FtsVideoWrapper extends RelativeLayout implements C96814a, C96814a.C96815a, C96814a.C96816c, C96814a.C57541b, C97621e.C97622a {

    /* renamed from: d */
    public Context f282927d;

    /* renamed from: e */
    public C96814a f282928e;

    /* renamed from: f */
    public C96814a.C57541b f282929f;

    /* renamed from: g */
    public C102173o f282930g;

    /* renamed from: h */
    public C96814a.C96817e f282931h;

    /* renamed from: i */
    public boolean f282932i;

    /* renamed from: j */
    public float f282933j;

    /* renamed from: n */
    public int f282934n;

    /* renamed from: o */
    public boolean f282935o;

    /* renamed from: p */
    public String f282936p;

    /* renamed from: q */
    public C97621e f282937q;

    public FtsVideoWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        C96814a.C57541b bVar = this.f282929f;
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
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22957I3(str, str2, bool);
        }
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f282929f;
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
        Log.m105929w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), str3, Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22960T(str, str2, str3, i, i2);
        }
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", Integer.valueOf(hashCode()));
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22962Z(str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return ((CommonVideoView) aVar).mo79613a(d, z);
        }
        return false;
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        Log.m105919d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", Integer.valueOf(hashCode()));
        setKeepScreenOn(false);
        this.f282937q.mo136889a();
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22963a0(str, str2);
        }
    }

    /* renamed from: b */
    public void mo79614b() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.mo79614b();
        }
        this.f282937q.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: c */
    public void mo79616c() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.mo79616c();
        }
        this.f282937q.mo136889a();
        setKeepScreenOn(false);
    }

    /* renamed from: d */
    public boolean mo134736d(double d) {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return ((AbstractVideoView) aVar).mo79609Q(d);
        }
        return false;
    }

    /* renamed from: f */
    public void mo79617f() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            ((CommonVideoView) aVar).mo79617f();
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    public int getCacheTimeSec() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.getCacheTimeSec();
        }
        return 0;
    }

    public int getCurrPosMs() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.getCurrPosMs();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.getCurrPosSec();
        }
        return 0;
    }

    public int getPlayerType() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.getPlayerType();
        }
        return 0;
    }

    public int getVideoDurationSec() {
        C96814a aVar = this.f282928e;
        return aVar != null ? aVar.getVideoDurationSec() : this.f282934n;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        this.f282934n = i;
        this.f282935o = z;
        PString pString = new PString();
        pString.value = str;
        Util.isNullOrNil(str);
        this.f282936p = pString.value;
        C96814a aVar = this.f282928e;
        boolean z2 = true;
        if (aVar == null) {
            Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", Integer.valueOf(hashCode()));
            CommonVideoView commonVideoView = new CommonVideoView(this.f282927d);
            commonVideoView.setReporter(this);
            commonVideoView.setIMMVideoViewCallback(this);
            this.f282928e = commonVideoView;
        } else if (aVar instanceof MMVideoView) {
            ((AbstractVideoView) aVar).stop();
            ((AbstractVideoView) this.f282928e).mo135081w();
            removeView((View) this.f282928e);
            Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", Integer.valueOf(hashCode()));
            CommonVideoView commonVideoView2 = new CommonVideoView(this.f282927d);
            commonVideoView2.setReporter(this);
            commonVideoView2.setIMMVideoViewCallback(this);
            this.f282928e = commonVideoView2;
        } else {
            Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", Integer.valueOf(hashCode()));
            ((AbstractVideoView) this.f282928e).stop();
            z2 = false;
        }
        setScaleType(this.f282931h);
        setPlayRate(this.f282933j);
        setMute(this.f282932i);
        if (z2) {
            setVideoFooterView(this.f282930g);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            addView((View) this.f282928e, layoutParams);
        }
        ((CommonVideoView) this.f282928e).mo76636h(this.f282935o, this.f282936p, this.f282934n);
    }

    /* renamed from: i */
    public boolean mo129198i() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.mo129198i();
        }
        return false;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
    }

    public boolean isPlaying() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.isPlaying();
        }
        return false;
    }

    public void kvStat(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22964l0(str, str2, i, i2);
        }
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        Log.m105919d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", Integer.valueOf(hashCode()));
        setKeepScreenOn(true);
        this.f282937q.mo136891c(this);
        C96814a.C57541b bVar = this.f282929f;
        if (bVar != null) {
            bVar.mo22965m0(str, str2);
        }
    }

    /* renamed from: o */
    public void mo129208o(String str, boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", Integer.valueOf(hashCode()), str, Boolean.valueOf(z));
        if (!z) {
            C96814a aVar = this.f282928e;
            if (aVar instanceof MMVideoView) {
                ((AbstractVideoView) aVar).stop();
                ((AbstractVideoView) this.f282928e).mo135081w();
                removeView((View) this.f282928e);
                Log.m105925i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", Integer.valueOf(hashCode()));
                CommonVideoView commonVideoView = new CommonVideoView(this.f282927d);
                commonVideoView.setReporter(this);
                commonVideoView.setIMMVideoViewCallback(this);
                this.f282928e = commonVideoView;
                z2 = true;
            }
            setScaleType(this.f282931h);
            setPlayRate(this.f282933j);
            setMute(this.f282932i);
            if (z2) {
                setVideoFooterView(this.f282930g);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(13);
                addView((View) this.f282928e, layoutParams);
                ((CommonVideoView) this.f282928e).mo76636h(this.f282935o, this.f282936p, this.f282934n);
                ((CommonVideoView) this.f282928e).start();
            }
        }
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }

    public boolean pause() {
        if (this.f282928e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f282937q.mo136889a();
        return this.f282928e.pause();
    }

    public boolean play() {
        if (this.f282928e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f282937q.mo136891c(this);
        return ((AbstractVideoView) this.f282928e).play();
    }

    public void setCover(Bitmap bitmap) {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setCover(bitmap);
        }
    }

    public void setFullDirection(int i) {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setFullDirection(i);
        }
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        this.f282929f = bVar;
    }

    public void setIsShowBasicControls(boolean z) {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setIsShowBasicControls(z);
        }
    }

    public void setKeepScreenOn(boolean z) {
        Log.m105919d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", Boolean.valueOf(z), Util.getStack());
        super.setKeepScreenOn(z);
    }

    public void setLoop(boolean z) {
    }

    public void setLoopCompletionCallback(C96814a.C57542d dVar) {
    }

    public void setMute(boolean z) {
        this.f282932i = z;
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setMute(z);
        }
    }

    public boolean setPlayRate(float f) {
        if (f <= 0.0f) {
            return false;
        }
        this.f282933j = f;
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            return aVar.setPlayRate(f);
        }
        return false;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        this.f282931h = eVar;
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setScaleType(eVar);
        }
    }

    public void setVideoFooterView(C102173o oVar) {
        this.f282930g = oVar;
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.setVideoFooterView(oVar);
        }
    }

    public void start() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.start();
            setKeepScreenOn(true);
            this.f282937q.mo136891c(this);
        }
    }

    public void stop() {
        C96814a aVar = this.f282928e;
        if (aVar != null) {
            aVar.stop();
            this.f282937q.mo136889a();
            setKeepScreenOn(false);
        }
    }

    public FtsVideoWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f282931h = C96814a.C96817e.CONTAIN;
        this.f282932i = false;
        this.f282933j = -1.0f;
        this.f282927d = context;
        this.f282937q = new C97621e();
    }
}
