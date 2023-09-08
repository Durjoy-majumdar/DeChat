package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import vd3.C102171c0;

/* renamed from: com.tencent.mm.pluginsdk.ui.CommonVideoView */
public class CommonVideoView extends AbstractVideoView {

    /* renamed from: P */
    public boolean f283615P;

    /* renamed from: Q */
    public String f283616Q;

    /* renamed from: R */
    public int f283617R;

    /* renamed from: S */
    public int f283618S = 0;

    /* renamed from: T */
    public boolean f283619T = false;

    public CommonVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        this.f283601w = 0;
        return new VideoTextureView(context, (AttributeSet) null);
    }

    /* renamed from: F */
    public void mo135072F() {
        super.mo135072F();
    }

    /* renamed from: H */
    public void mo79392H() {
        super.mo79392H();
        this.f283586e = "MicroMsg.CommonVideoView";
        this.f283585d = "VideoView.CommonVideoView";
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        if (!mo129198i()) {
            return super.mo79613a(d, z);
        }
        Log.m105929w(this.f283586e, "%s it is live, don't seek ", mo76634K());
        return false;
    }

    /* renamed from: b */
    public void mo79614b() {
        super.mo79614b();
    }

    /* renamed from: f */
    public void mo79617f() {
        super.mo79617f();
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null && (r0Var instanceof VideoTextureView)) {
            if (this.f283597s) {
                play();
            } else {
                ((VideoTextureView) r0Var).mo25359F();
            }
        }
    }

    public int getCacheTimeSec() {
        try {
            C96875r0 r0Var = this.f283595q;
            if (r0Var instanceof VideoTextureView) {
                return (int) (((float) super.getVideoDurationSec()) * ((((float) ((VideoTextureView) r0Var).getDownloadPercent()) * 1.0f) / 100.0f));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f283586e, e, "%s get cache time sec error", mo76634K());
        }
        return 0;
    }

    public int getReportIdkey() {
        return 0;
    }

    public int getVideoDurationSec() {
        int i = this.f283617R;
        return i <= 0 ? super.getVideoDurationSec() : i;
    }

    public int getVideoSource() {
        return this.f283618S;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        Log.m105925i(this.f283586e, "%s set video path isLive [%b] url [%s] durationSec [%d]", mo76634K(), Boolean.valueOf(z), str, Integer.valueOf(i));
        this.f283615P = z;
        this.f283616Q = str;
        this.f283617R = i;
        this.f283584N.f300843i = str;
    }

    /* renamed from: i */
    public boolean mo129198i() {
        boolean I = mo135074I();
        C96875r0 r0Var = this.f283595q;
        int duration = r0Var != null ? r0Var.getDuration() : 0;
        boolean z = this.f283615P || (I && duration <= 0);
        Log.m105919d(this.f283586e, "%s is live video result [%b] isPrepared[%b] durationMs[%d] isLive[%b]", mo76634K(), Boolean.valueOf(z), Boolean.valueOf(mo135074I()), Integer.valueOf(duration), Boolean.valueOf(this.f283615P));
        return z;
    }

    /* renamed from: j */
    public void mo25380j(int i, int i2) {
        Log.m105919d(this.f283586e, "%s onInfo [%d %d]", mo76634K(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 701) {
            mo129179R();
            C102171c0 c0Var = this.f283584N;
            c0Var.f300842h++;
            c0Var.f300839e = Util.nowMilliSecond();
            mo135073G(600, (long) (getReportIdkey() + 40), 1, false);
        } else if (i == 702) {
            super.mo135072F();
            this.f283584N.f300840f = Util.nowMilliSecond();
            C102171c0 c0Var2 = this.f283584N;
            long j = c0Var2.f300839e;
            if (j > 0) {
                c0Var2.f300841g += c0Var2.f300840f - j;
            }
            mo135077P();
        }
    }

    public void onCompletion() {
        if (mo129198i()) {
            Log.m105925i(this.f283586e, "%s it is live video, do not completion", mo76634K());
            stop();
            start();
            return;
        }
        super.onCompletion();
        if (this.f283619T) {
            mo79613a(0.0d, true);
        }
    }

    public void setLoop(boolean z) {
        this.f283619T = z;
    }

    public boolean setPlayRate(float f) {
        Log.m105925i(this.f283586e, "%s set play rate [%f]", mo76634K(), Float.valueOf(f));
        if (!(this.f283595q instanceof VideoTextureView)) {
            return false;
        }
        mo135073G(600, (long) (getReportIdkey() + 13), 1, false);
        return ((VideoTextureView) this.f283595q).mo25362J(f);
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C96875r0 r0Var = this.f283595q;
        if (r0Var instanceof VideoTextureView) {
            ((VideoTextureView) r0Var).setScaleType(eVar);
            mo135073G(600, (long) (getReportIdkey() + 14), 1, false);
        }
    }

    public void start() {
        if (this.f283595q != null) {
            Log.m105925i(this.f283586e, "%s start path [%s] [%s]", mo76634K(), this.f283595q.getVideoPath(), Util.getStack());
            if (Util.isNullOrNil(this.f283595q.getVideoPath())) {
                this.f283595q.setVideoPath(this.f283616Q);
                mo129179R();
                mo135076O();
            } else {
                play();
            }
            mo135073G(600, (long) (getReportIdkey() + 1), 1, false);
        }
    }

    public CommonVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CommonVideoView(Context context) {
        super(context, (AttributeSet) null);
    }
}
