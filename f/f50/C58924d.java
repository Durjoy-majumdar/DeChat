package f50;

import android.graphics.Bitmap;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import fs3.C59318d;
import te3.C64890zp2;

/* renamed from: f50.d */
public interface C58924d extends C59318d {
    /* renamed from: b */
    boolean mo84111b();

    void callExperimentalAPI(String str);

    boolean enableHardwareDecode(boolean z);

    /* renamed from: f */
    void mo84115f(String str, int i, C64890zp2 zp22);

    Bitmap getBitmap();

    TXLivePlayer getPlayer();

    TXCloudVideoView getPlayerView();

    /* renamed from: h */
    void mo84120h(C58925e eVar);

    boolean isPlaying();

    /* renamed from: k */
    void mo84122k(C58925e eVar);

    /* renamed from: l */
    boolean mo84123l(C58925e eVar);

    /* renamed from: m */
    void mo84124m(String str);

    void pause();

    void resume();

    void setConfig(TXLivePlayConfig tXLivePlayConfig);

    void setMute(boolean z);

    void setPlayListener(ITXLivePlayListener iTXLivePlayListener);

    void setPlayerView(TXCloudVideoView tXCloudVideoView);

    void setRenderMode(int i);

    void setVolume(int i);

    void stopPlay(boolean z);

    int switchStream(String str);
}
