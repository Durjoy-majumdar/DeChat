package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.VideoJsCallback;
import java.util.Arrays;
import s90.C48300n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.e */
public final class C44067e implements VideoJsCallback {

    /* renamed from: a */
    public long f119405a;

    /* renamed from: b */
    public final /* synthetic */ MPVideoPlayFullScreenView f119406b;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.e$a */
    public static final class C44068a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119407d;

        /* renamed from: e */
        public final /* synthetic */ double f119408e;

        /* renamed from: f */
        public final /* synthetic */ double f119409f;

        /* renamed from: g */
        public final /* synthetic */ double[] f119410g;

        public C44068a(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, double d, double d2, double[] dArr) {
            this.f119407d = mPVideoPlayFullScreenView;
            this.f119408e = d;
            this.f119409f = d2;
            this.f119410g = dArr;
        }

        public final void run() {
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar;
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = this.f119407d.f119374z;
            if (redesignVideoPlayerSeekBar2 != null) {
                redesignVideoPlayerSeekBar2.setVideoTotalTime((int) this.f119408e);
            }
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar3 = this.f119407d.f119374z;
            if (redesignVideoPlayerSeekBar3 != null) {
                redesignVideoPlayerSeekBar3.seek((int) this.f119409f);
            }
            double[] dArr = this.f119410g;
            if (dArr != null) {
                MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119407d;
                if ((!(dArr.length == 0)) && (redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f119374z) != null) {
                    redesignVideoPlayerSeekBar.mo135174v((int) dArr[dArr.length - 1]);
                }
            }
        }
    }

    public C44067e(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f119406b = mPVideoPlayFullScreenView;
    }

    public boolean onSetRequestedOrientation(int i) {
        return false;
    }

    public void onVideoEmptied() {
        Log.m105924i(this.f119406b.f119353d, "onVideoEmptied");
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
    }

    public void onVideoEnded() {
        Log.m105924i(this.f119406b.f119353d, "onVideoEnded");
        MPVideoPlayFullScreenView.m48336d(this.f119406b, false);
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
        C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView.f119371x, 7, mPVideoPlayFullScreenView.getEnterId(), 101);
        this.f119406b.getMpShareVideoReport().f119454i = 4;
    }

    public void onVideoEnterFullscreen(boolean z, long j, double d, double d2, boolean z2, boolean z3, double d3, double d4, double[] dArr) {
        String str = this.f119406b.f119353d;
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoEnterFullscreen isVideoTag:");
        boolean z4 = z;
        sb.append(z);
        sb.append(", id:");
        long j2 = j;
        sb.append(j);
        sb.append(", width:");
        double d5 = d;
        sb.append(d);
        sb.append(", height:");
        double d6 = d2;
        sb.append(d2);
        sb.append(", paused:");
        sb.append(z2);
        sb.append(", seeking:");
        boolean z5 = z3;
        sb.append(z3);
        sb.append(", currentTime:");
        sb.append(d3);
        sb.append(", duration:");
        sb.append(d4);
        sb.append(", buffered:");
        sb.append(Arrays.toString(dArr));
        Log.m105924i(str, sb.toString());
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        boolean z6 = !z2;
        mPVideoPlayFullScreenView.f119335E = z6;
        MPVideoPlayFullScreenView.m48336d(mPVideoPlayFullScreenView, z6);
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView2 = this.f119406b;
        if (mPVideoPlayFullScreenView2.f119335E) {
            mPVideoPlayFullScreenView2.getMpShareVideoReport().f119454i = 1;
            C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView3 = this.f119406b;
            mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView3.f119371x, mPVideoPlayFullScreenView3.getMpShareVideoReport().mo68720a(), this.f119406b.getEnterId(), 101);
        }
    }

    public void onVideoError(int i, String str) {
        String str2 = this.f119406b.f119353d;
        Log.m105920e(str2, "onVideoError " + i + ", " + str);
        MPVideoPlayFullScreenView.m48336d(this.f119406b, false);
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
        this.f119406b.getMpShareVideoReport().f119454i = 4;
        this.f119406b.getMpShareVideoReport().f119450e = str;
        C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView.f119371x, 11, mPVideoPlayFullScreenView.getEnterId(), 101);
    }

    public void onVideoExitFullscreen() {
        Log.m105924i(this.f119406b.f119353d, "onVideoExitFullscreen");
    }

    public void onVideoPause() {
        Log.m105924i(this.f119406b.f119353d, "onVideoPause");
        MPVideoPlayFullScreenView.m48336d(this.f119406b, false);
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
        if (this.f119406b.getMpShareVideoReport().f119454i != 3) {
            C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
            mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView.f119371x, 8, mPVideoPlayFullScreenView.getEnterId(), 101);
        }
        this.f119406b.getMpShareVideoReport().f119454i = 3;
    }

    public void onVideoPlay() {
        Log.m105924i(this.f119406b.f119353d, "onVideoPlay");
        MPVideoPlayFullScreenView.m48336d(this.f119406b, true);
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
        if (this.f119406b.getMpShareVideoReport().f119454i != 2) {
            C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
            mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView.f119371x, mPVideoPlayFullScreenView.getMpShareVideoReport().mo68720a(), this.f119406b.getEnterId(), 101);
        }
        this.f119406b.getMpShareVideoReport().f119454i = 2;
    }

    public void onVideoPlaying() {
        Log.m105918d(this.f119406b.f119353d, "onVideoPlaying");
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        if (!mPVideoPlayFullScreenView.f119335E) {
            MPVideoPlayFullScreenView.m48336d(mPVideoPlayFullScreenView, true);
            MPVideoPlayFullScreenView.m48333a(this.f119406b);
        }
        this.f119406b.getMpShareVideoReport().f119454i = 2;
    }

    public void onVideoRateChange(double d) {
    }

    public void onVideoSeeked() {
        Log.m105924i(this.f119406b.f119353d, "onVideoSeeked");
        MPVideoPlayFullScreenView.m48333a(this.f119406b);
        C44093w mpShareVideoReport = this.f119406b.getMpShareVideoReport();
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mpShareVideoReport.mo68721b(mPVideoPlayFullScreenView.f119371x, 13, mPVideoPlayFullScreenView.getEnterId(), 101);
    }

    public void onVideoSeeking() {
        Log.m105924i(this.f119406b.f119353d, "onVideoSeeking");
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mPVideoPlayFullScreenView.getClass();
        MMHandlerThread.postToMainThread(new C44077m(mPVideoPlayFullScreenView));
    }

    public void onVideoSizeUpdate(double d, double d2) {
        C48300n nVar = this.f119406b.f119371x;
        boolean z = true;
        if (!(nVar != null && nVar.f133372j == 0)) {
            if (nVar == null || nVar.f133373n != 0) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if (nVar != null) {
            nVar.f133372j = (int) d;
        }
        if (nVar != null) {
            nVar.f133373n = (int) d2;
        }
    }

    public void onVideoTimeUpdate(double d, double d2, double[] dArr) {
        if (System.currentTimeMillis() - this.f119405a >= 500) {
            this.f119405a = System.currentTimeMillis();
            MMHandlerThread.postToMainThread(new C44068a(this.f119406b, d2, d, dArr));
        }
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mPVideoPlayFullScreenView.f119334D = d;
        MPVideoPlayFullScreenView.m48333a(mPVideoPlayFullScreenView);
    }

    public void onVideoVolumeChange(boolean z) {
    }

    public void onVideoWaiting() {
        Log.m105924i(this.f119406b.f119353d, "onVideoWaiting");
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119406b;
        mPVideoPlayFullScreenView.getClass();
        MMHandlerThread.postToMainThread(new C44077m(mPVideoPlayFullScreenView));
    }
}
