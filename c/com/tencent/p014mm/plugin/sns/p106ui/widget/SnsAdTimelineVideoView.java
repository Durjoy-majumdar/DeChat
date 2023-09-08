package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.OfflineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import p329d3.C86165a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView */
public class SnsAdTimelineVideoView extends OfflineVideoView {

    /* renamed from: A */
    public C86165a<Boolean> f281514A;

    /* renamed from: B */
    public boolean f281515B;

    /* renamed from: C */
    public boolean f281516C;

    /* renamed from: z */
    public C86165a<Void> f281517z;

    public SnsAdTimelineVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: d */
    public void mo132280d() {
        SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo132280d();
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "clearTimer");
        SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public Drawable getThumbDrawable() {
        SnsMethodCalculate.markStartTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        ImageView imageView = this.f277118h;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            SnsMethodCalculate.markEndTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return drawable;
        }
        SnsMethodCalculate.markEndTimeMs("getThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        return null;
    }

    /* renamed from: l */
    public void mo132294l(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo132294l(i, z);
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "seekTo:" + i + ", afterSeekPlay=" + z);
        SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: m */
    public void mo132295m() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: n */
    public void mo132296n() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        boolean g = mo132283g();
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "start, hasPrepared=" + this.f281516C + ", shouldPlayWhenPrepared=" + this.f277124q + ", isPlaying=" + g);
        if (this.f281516C || !this.f277124q) {
            if (!g) {
                Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "do start");
                super.mo132296n();
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            return;
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: o */
    public void mo132297o() {
        SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo132297o();
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "startTimer:" + getTimerInterval());
        SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.onDetachedFromWindow();
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "onDetachedFromWindow");
        mo134051v();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void onError(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.onError(i, i2);
        C115669n.INSTANCE.mo175911u(1579, 7);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void onPrepared() {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        C86165a<Void> aVar = this.f281517z;
        if (aVar != null) {
            aVar.accept(null);
            this.f281517z = null;
        }
        Log.m105925i("MicroMsg.SnsAdTimelineVideoView", "onPrepared, path=%s , shouldPlayWhenPrepared=%s", getVideoPath(), Boolean.valueOf(this.f277124q));
        if (this.f277124q) {
            super.onPrepared();
        }
        this.f281516C = true;
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: p */
    public void mo132298p(boolean z, float f) {
        SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo132298p(z, f);
        StringBuilder sb = new StringBuilder();
        sb.append("switchVideoModel: thumVis=");
        sb.append(this.f277118h.getVisibility() == 0);
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", sb.toString());
        SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setOnPrepared(C86165a<Void> aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f281517z = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setOnReplay(C86165a<Boolean> aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        this.f281514A = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnReplay", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setShouldPlayWhenPrepared(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "setShouldPlayWhenPrepared:" + z);
        this.f277124q = z;
        SnsMethodCalculate.markEndTimeMs("setShouldPlayWhenPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumbBmp(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "setThumbBmp=" + bitmap);
        ImageView imageView = this.f277118h;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        SnsMethodCalculate.markEndTimeMs("setThumbBmp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumbDrawable(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "setThumbDrawable=" + drawable);
        ImageView imageView = this.f277118h;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        SnsMethodCalculate.markEndTimeMs("setThumbDrawable", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setThumpViewScaleType(ImageView.ScaleType scaleType) {
        SnsMethodCalculate.markStartTimeMs("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        ImageView imageView = this.f277118h;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
        SnsMethodCalculate.markEndTimeMs("setThumpViewScaleType", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public void setVideoPath(String str) {
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        String videoPath = getVideoPath();
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "setVideoPath, hasPrepared=" + this.f281515B + ", path=" + str + ", oldPath=" + videoPath);
        if (!this.f281515B || (str != null && !str.equals(videoPath))) {
            mo132293k(str);
            this.f281515B = true;
        }
        SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: t */
    public void mo132307t(int i) {
        SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        super.mo132307t(i);
        StringBuilder sb = new StringBuilder();
        sb.append("updateVideoUI: thumVis=");
        sb.append(this.f277118h.getVisibility() == 0);
        sb.append(", ms=");
        sb.append(i);
        sb.append(", second=");
        sb.append(i / 1000);
        Log.m105918d("MicroMsg.SnsAdTimelineVideoView", sb.toString());
        SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: v */
    public void mo134051v() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "clear");
        mo132291i();
        this.f281515B = false;
        this.f277124q = false;
        this.f281516C = false;
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "path after clear=" + getVideoPath());
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: w */
    public void mo134052w() {
        SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "restart, hasPrepared=" + this.f281515B);
        if (this.f281515B) {
            super.mo132294l(0, true);
        }
        SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    /* renamed from: x */
    public void mo134053x(boolean z) {
        SnsMethodCalculate.markStartTimeMs("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "showVideoThumb:" + z);
        mo132298p(!z, z ? 0.0f : 1.0f);
        SnsMethodCalculate.markEndTimeMs("showVideoThumb", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
    }

    public SnsAdTimelineVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f277124q = false;
    }
}
