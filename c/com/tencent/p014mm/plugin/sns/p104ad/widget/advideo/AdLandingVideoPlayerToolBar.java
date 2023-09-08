package com.tencent.p014mm.plugin.sns.p104ad.widget.advideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94664q;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import p749xh.C66261f3;
import vd3.C102173o;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar */
public class AdLandingVideoPlayerToolBar extends RelativeLayout implements C102173o {

    /* renamed from: d */
    public View f274348d;

    /* renamed from: e */
    public AdLandingVideoPlayerSeekBar f274349e;

    /* renamed from: f */
    public ImageView f274350f;

    /* renamed from: g */
    public ImageView f274351g;

    /* renamed from: h */
    public boolean f274352h;

    /* renamed from: i */
    public boolean f274353i;

    /* renamed from: j */
    public boolean f274354j;

    /* renamed from: n */
    public C94651l.C94655d f274355n;

    public AdLandingVideoPlayerToolBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo130492a(int i) {
        AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar;
        SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        if (adLandingVideoPlayerSeekBar == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateTime, seekBar is null");
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        adLandingVideoPlayerSeekBar.seek(i);
        C94651l.C94655d dVar = this.f274355n;
        if (dVar != null) {
            C94664q qVar = (C94664q) dVar;
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
            if (C94651l.m119777Q(qVar.f273933a).f296586M != null && qVar.f273933a.mo130233K()) {
                C94651l lVar = qVar.f273933a;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                boolean z = lVar.f273894L;
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                if (!z && (adLandingVideoPlayerToolBar = qVar.f273933a.f273886D) != null) {
                    SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    boolean z2 = adLandingVideoPlayerToolBar.f274352h;
                    SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    if (!z2) {
                        int i2 = C94651l.m119777Q(qVar.f273933a).f296586M.f296648b;
                        C94651l lVar2 = qVar.f273933a;
                        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                        lVar2.mo130246e0(i2, i * 1000);
                        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
        }
        SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: b */
    public void mo130493b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f274352h = z;
        ImageView imageView = this.f274350f;
        if (imageView == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichScreenStatus, switchScreenIv is null");
            SnsMethodCalculate.markEndTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        if (z) {
            imageView.setImageResource(C0966R.raw.icon_video_short_screen);
        } else {
            imageView.setImageResource(C0966R.raw.icon_video_full_screen);
        }
        SnsMethodCalculate.markEndTimeMs("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: c */
    public void mo130494c(boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        if (adLandingVideoPlayerSeekBar == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateVideoStatus, seekBar is null");
            SnsMethodCalculate.markEndTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        adLandingVideoPlayerSeekBar.setIsPlay(z);
        SnsMethodCalculate.markEndTimeMs("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: d */
    public void mo130495d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        ImageView imageView = this.f274351g;
        if (imageView == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichVoiceStatus, voiceIv is null");
            SnsMethodCalculate.markEndTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        if (z) {
            imageView.setImageResource(C0966R.raw.icon_volume_on);
        } else {
            imageView.setImageResource(C0966R.raw.icon_volume_off);
        }
        SnsMethodCalculate.markEndTimeMs("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return C0966R.C0971layout.f6350ce;
    }

    public AdLandingVideoPlayerSeekBar getSeekBar() {
        SnsMethodCalculate.markStartTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        SnsMethodCalculate.markEndTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return adLandingVideoPlayerSeekBar;
    }

    public int getVideoTotalTime() {
        SnsMethodCalculate.markStartTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        if (adLandingVideoPlayerSeekBar == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar getVideoTotalTime, seekBar is null");
            SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return 0;
        }
        int videoTotalTime = adLandingVideoPlayerSeekBar.getVideoTotalTime();
        SnsMethodCalculate.markEndTimeMs("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return videoTotalTime;
    }

    public int getVisibility() {
        SnsMethodCalculate.markStartTimeMs("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        int visibility = this.f274349e.getVisibility();
        SnsMethodCalculate.markEndTimeMs("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return visibility;
    }

    public void setForceHideFullScreenIcon(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f274354j = z;
        ImageView imageView = this.f274350f;
        if (imageView != null && z) {
            imageView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setForceHideVoiceIcon(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f274353i = z;
        ImageView imageView = this.f274351g;
        if (imageView != null && z) {
            imageView.setVisibility(8);
            SnsMethodCalculate.markStartTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            ImageView imageView2 = this.f274350f;
            if (imageView2 == null) {
                SnsMethodCalculate.markEndTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            } else {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(11);
                }
                SnsMethodCalculate.markEndTimeMs("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            }
        }
        SnsMethodCalculate.markEndTimeMs("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setOnFullScreenClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        ImageView imageView = this.f274350f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        SnsMethodCalculate.markEndTimeMs("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setOnVoiceButtonClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        ImageView imageView = this.f274351g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        SnsMethodCalculate.markEndTimeMs("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setUpdateTimeListener(C94651l.C94655d dVar) {
        SnsMethodCalculate.markStartTimeMs("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f274355n = dVar;
        SnsMethodCalculate.markEndTimeMs("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setVideoTotalTime(int i) {
        SnsMethodCalculate.markStartTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        if (adLandingVideoPlayerSeekBar == null) {
            Log.m105920e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar setVideoTotalTime, seekBar is null");
            SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        adLandingVideoPlayerSeekBar.setVideoTotalTime(i);
        SnsMethodCalculate.markEndTimeMs("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        AdLandingVideoPlayerSeekBar adLandingVideoPlayerSeekBar = this.f274349e;
        if (!(adLandingVideoPlayerSeekBar == null || this.f274350f == null || this.f274351g == null)) {
            adLandingVideoPlayerSeekBar.setVisibility(i);
            if (!this.f274354j) {
                this.f274350f.setVisibility(i);
            }
            if (!this.f274353i) {
                this.f274351g.setVisibility(i);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public AdLandingVideoPlayerToolBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274348d = null;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f274348d = inflate;
        this.f274349e = (AdLandingVideoPlayerSeekBar) inflate.findViewById(C0966R.C0970id.f5540hu);
        this.f274350f = (ImageView) this.f274348d.findViewById(C0966R.C0970id.jqr);
        this.f274351g = (ImageView) this.f274348d.findViewById(C0966R.C0970id.jqs);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }
}
