package p301cd;

import com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter;
import com.tencent.rtmp.TXLivePusher;
import gy3.C87412m;

/* renamed from: cd.e0 */
public final class C16922e0 implements C16927n {

    /* renamed from: a */
    public final /* synthetic */ V2TXLivePusherJSAdapter f45747a;

    public C16922e0(V2TXLivePusherJSAdapter v2TXLivePusherJSAdapter) {
        this.f45747a = v2TXLivePusherJSAdapter;
    }

    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        C87412m.m108594g(videoCustomProcessListener, "videoProcessListener");
        this.f45747a.setVideoProcessListener(videoCustomProcessListener);
    }
}
