package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import p156gj.C107835h0;
import p914oj.C89231c;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView */
public class VideoSightCenterView extends VideoSightView {

    /* renamed from: W */
    public volatile boolean f283826W = false;

    /* renamed from: p0 */
    public MediaMetadataRetriever f283827p0;

    /* renamed from: x0 */
    public int f283828x0 = 0;

    /* renamed from: y0 */
    public boolean f283829y0 = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView$a */
    public class C96860a implements SightPlayController.C94564e {
        public C96860a() {
        }

        /* renamed from: a */
        public void mo130064a(SightPlayController sightPlayController, int i) {
            if (-1 == i) {
                Log.m105925i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", Boolean.valueOf(VideoSightCenterView.this.f283826W));
                VideoSightCenterView videoSightCenterView = VideoSightCenterView.this;
                if (videoSightCenterView.f273544L != null && !videoSightCenterView.f283826W) {
                    VideoSightCenterView.this.f273544L.onError(0, 0);
                }
            } else if (i == 0) {
                Log.m105924i("MicroMsg.VideoSightCenterView", "normal stop");
                VideoSightCenterView.this.f283826W = true;
                C96875r0.C96876a aVar = VideoSightCenterView.this.f273544L;
                if (aVar != null) {
                    aVar.onCompletion();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView$b */
    public class C96861b implements SightPlayController.C94565f {
        public C96861b() {
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
            VideoSightCenterView videoSightCenterView = VideoSightCenterView.this;
            if (videoSightCenterView.f283834T == 0) {
                videoSightCenterView.f283834T = videoSightCenterView.getDuration();
            }
            if (VideoSightCenterView.this.f273544L != null) {
                Log.m105927v("MicroMsg.VideoSightCenterView", "onPlayTime, currentTime: %s, duration: %s", Long.valueOf(j), Integer.valueOf(VideoSightCenterView.this.f283834T));
                VideoSightCenterView videoSightCenterView2 = VideoSightCenterView.this;
                videoSightCenterView2.f283828x0 = (int) (1000 * j);
                videoSightCenterView2.f273544L.mo76207M0((int) j, videoSightCenterView2.f283834T);
            }
        }
    }

    public VideoSightCenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: c */
    public void mo130072c(int i, int i2) {
        super.mo130072c(i, i2);
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        Log.m105927v("MicroMsg.VideoSightCenterView", "seekTo, time: %s, isStart: %s, currentPosition: %s, getLastProgresstime: %s", Double.valueOf(d), Boolean.valueOf(this.f283829y0), Integer.valueOf(this.f283828x0), Double.valueOf(getLastProgresstime()));
        if (this.f283829y0 && getLastProgresstime() > 0.0d) {
            super.mo24788d(d / 1000.0d);
        }
    }

    public int getCurrentPosition() {
        Log.m105927v("MicroMsg.VideoSightCenterView", "getCurrentPosition: %s", Integer.valueOf(this.f283828x0));
        return this.f283828x0;
    }

    public int getDuration() {
        Log.m105924i("MicroMsg.VideoSightCenterView", "getDuration");
        if (!Util.isNullOrNil(this.f283833S)) {
            try {
                if (this.f283827p0 == null) {
                    C89231c cVar = new C89231c();
                    this.f283827p0 = cVar;
                    cVar.setDataSource(this.f283833S);
                }
                int intValue = Integer.valueOf(this.f283827p0.extractMetadata(9)).intValue();
                Log.m105925i("MicroMsg.VideoSightCenterView", "getDuration: %s", Integer.valueOf(intValue));
                return intValue;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.VideoSightCenterView", "getDuration error: %s", e.getMessage());
            }
        }
        return super.getDuration();
    }

    public double getLastProgresstime() {
        return super.getLastProgresstime();
    }

    public boolean isPlaying() {
        Log.m105927v("MicroMsg.VideoSightCenterView", "isPlaying, isStart: %s, currentPosition: %s", Boolean.valueOf(this.f283829y0), Integer.valueOf(this.f283828x0));
        return this.f283829y0;
    }

    public void pause() {
        Log.m105926v("MicroMsg.VideoSightCenterView", "pause");
        super.pause();
    }

    /* renamed from: s */
    public void mo135179s() {
        if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("other")) {
            Log.m105924i("MicroMsg.VideoSightCenterView", "init::use other player");
        } else {
            mo130096p(true);
        }
        setOnCompletionListener(new C96860a());
    }

    public void setDrawableWidth(int i) {
        super.setDrawableWidth(i);
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    public void setPlayProgressCallback(boolean z) {
        if (z) {
            setOnDecodeDurationListener(new C96861b());
        } else {
            setOnDecodeDurationListener((SightPlayController.C94565f) null);
        }
    }

    public boolean start() {
        Log.m105926v("MicroMsg.VideoSightCenterView", IXWebBroadcastListener.STAGE_START);
        this.f283829y0 = true;
        return super.start();
    }

    public void stop() {
        Log.m105926v("MicroMsg.VideoSightCenterView", "stop");
        clear();
        this.f283828x0 = 0;
        this.f283829y0 = false;
    }

    public VideoSightCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
