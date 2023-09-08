package xn2;

import com.tencent.p014mm.plugin.sight.decode.p1077ui.VideoPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xn2.e */
public class C102700e implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ VideoPlayView f303321d;

    public C102700e(VideoPlayView videoPlayView) {
        this.f303321d = videoPlayView;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        Log.m105924i("MicroMsg.VideoPlayView", "onSeek time " + i);
        VideoPlayView videoPlayView = this.f303321d;
        double d = (double) i;
        videoPlayView.f273588o = d;
        videoPlayView.f273586j.mo24788d(d);
        VideoPlayView videoPlayView2 = this.f303321d;
        videoPlayView2.f273592s.removeCallbacks(videoPlayView2.f273578F);
        VideoPlayView videoPlayView3 = this.f303321d;
        videoPlayView3.f273592s.postDelayed(videoPlayView3.f273578F, 3000);
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        VideoPlayView videoPlayView = this.f303321d;
        videoPlayView.f273592s.removeCallbacks(videoPlayView.f273578F);
        this.f303321d.mo130124g();
    }
}
