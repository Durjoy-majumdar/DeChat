package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view;

import a70.C112760b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import lo2.C99556n;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView */
public class AdLandingGeneralVideoView extends MMVideoView {

    /* renamed from: g1 */
    public int f274012g1;

    /* renamed from: h1 */
    public String f274013h1;

    /* renamed from: i1 */
    public boolean f274014i1;

    public AdLandingGeneralVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String getRootPath() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (!Util.isNullOrNil(this.f274013h1)) {
            str = this.f274013h1;
        } else {
            str = C112760b.m154195C() + "video/";
        }
        SnsMethodCalculate.markEndTimeMs("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    /* renamed from: H */
    public void mo79392H() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.mo79392H();
        this.f283586e = "MicroMsg.AdLandingGeneralVideoView";
        this.f283585d = "VideoView.AdLandingGeneralVideoView";
        SnsMethodCalculate.markStartTimeMs("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        C96875r0 r0Var = this.f283595q;
        if (r0Var instanceof VideoPlayerTextureView) {
            ((VideoPlayerTextureView) r0Var).setNeedOperateSurfaceTexture(true);
        }
        SnsMethodCalculate.markEndTimeMs("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    /* renamed from: K */
    public String mo76634K() {
        SnsMethodCalculate.markStartTimeMs("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        String str = this.f267494W + " ";
        SnsMethodCalculate.markEndTimeMs("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        SnsMethodCalculate.markStartTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f274012g1 != 1) {
            boolean Y = super.mo79611Y(i, pInt, pInt2);
            SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return Y;
        }
        SnsMethodCalculate.markStartTimeMs("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        pInt.value = Math.max(i, this.f267495W0);
        int i2 = this.f267486Q0;
        if (i2 == 1) {
            pInt.value = i;
        }
        if (i2 == 2) {
            int i3 = i - 8;
            pInt.value = i3;
            if (i3 < 0) {
                pInt.value = 0;
            }
        }
        if (i2 == 3 || i2 == 4) {
            pInt.value = this.f267495W0;
        }
        pInt2.value = this.f267488S0 + 1;
        Log.m105925i(this.f283586e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", mo76634K(), Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W);
        SnsMethodCalculate.markEndTimeMs("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return true;
    }

    /* renamed from: Z */
    public boolean mo79612Z(int i) {
        SnsMethodCalculate.markStartTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        boolean z = true;
        if (this.f274012g1 != 1) {
            boolean Z = super.mo79612Z(i);
            SnsMethodCalculate.markEndTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return Z;
        }
        SnsMethodCalculate.markStartTimeMs("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f267488S0 - this.f267495W0 > 1 && this.f267506y0 != 3) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        SnsMethodCalculate.markEndTimeMs("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return z;
    }

    /* renamed from: c */
    public void mo79616c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        try {
            super.mo79616c();
            C96875r0 r0Var = this.f283595q;
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).mo153304K();
            }
        } catch (Throwable th) {
            Log.m105920e(this.f283586e, th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    /* renamed from: c0 */
    public void mo76635c0() {
        SnsMethodCalculate.markStartTimeMs("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (!Util.isNullOrNil(this.f283616Q)) {
            this.f267494W = C99556n.m129945h("AdLandingGeneralVideo_" + this.f283616Q.hashCode(), this.f274014i1);
            String str = getRootPath() + "AdLandingGeneralVideo_" + this.f283616Q.hashCode() + ".mp4";
            this.f267504p0 = str;
            C86013q1.m106461v(C86013q1.m106458s(str));
            Log.m105925i(this.f283586e, "%s set video path [%s %s]", mo76634K(), this.f267494W, this.f267504p0);
            Log.m105924i(this.f283585d, "setVideoPath, cdnMediaId = " + this.f267494W + ", url = " + this.f283616Q);
        }
        SnsMethodCalculate.markEndTimeMs("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public ImageView getThumbView() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        ImageView imageView = this.f283589h;
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return imageView;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        Log.m105925i(this.f283586e, "%s set video path isLive [%b] url [%s] durationSec [%d]", mo76634K(), Boolean.valueOf(z), str, Integer.valueOf(i));
        SnsMethodCalculate.markStartTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        SnsMethodCalculate.markEndTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        this.f274014i1 = true;
        this.f283615P = z;
        String j = C99556n.m129947j(str, true);
        this.f283616Q = j;
        this.f283617R = i;
        this.f283584N.f300843i = j;
        mo76635c0();
        SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    /* renamed from: i0 */
    public boolean mo79629i0(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        String str = this.f283585d;
        Log.m105924i(str, "seekTo, time = " + i + ", afterSeekPlay = " + z);
        boolean i0 = super.mo79629i0(i, z);
        if (this.f267506y0 == 3 && this.f274012g1 == 1) {
            this.f267489T0 = -1;
        }
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return i0;
    }

    public void setRootPath(String str) {
        SnsMethodCalculate.markStartTimeMs("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.f274013h1 = str;
        SnsMethodCalculate.markEndTimeMs("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public void setVideoPlayerMode(int i) {
        SnsMethodCalculate.markStartTimeMs("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.f274012g1 = i;
        SnsMethodCalculate.markEndTimeMs("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public AdLandingGeneralVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274012g1 = 0;
        this.f274014i1 = false;
    }
}
