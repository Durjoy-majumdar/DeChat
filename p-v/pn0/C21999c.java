package pn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView;

/* renamed from: pn0.c */
public class C21999c implements C17978c.C17982d {

    /* renamed from: a */
    public final /* synthetic */ AbstractVideoView f62255a;

    public C21999c(AbstractVideoView abstractVideoView) {
        this.f62255a = abstractVideoView;
    }

    /* renamed from: a */
    public void mo22286a(int i) {
        if (this.f62255a.mo22294a((double) i, true)) {
            this.f62255a.mo22456n(false);
        }
        VideoPlayerSeekBar videoPlayerSeekBar = this.f62255a.f49702j;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIsPlay(true);
        }
    }

    public void onSeekPre() {
    }
}
