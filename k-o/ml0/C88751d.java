package ml0;

import android.os.Bundle;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import org.json.JSONObject;

/* renamed from: ml0.d */
public interface C88751d {
    /* renamed from: b */
    C21511u mo33714b();

    /* renamed from: d */
    C21511u mo33715d(boolean z);

    /* renamed from: e */
    C21511u mo21073e(Bundle bundle);

    /* renamed from: f */
    C21511u mo21074f(String str, JSONObject jSONObject);

    /* renamed from: g */
    void mo33716g(TXLivePusher.OnBGMNotify onBGMNotify);

    /* renamed from: h */
    C21511u mo21076h();

    /* renamed from: i */
    void mo33717i(int i);

    /* renamed from: j */
    void mo33718j(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame);

    /* renamed from: k */
    void mo33719k(TXLivePusher.ITXSnapshotListener iTXSnapshotListener);

    /* renamed from: m */
    void mo33720m(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    /* renamed from: n */
    C21511u mo21079n(TXCloudVideoView tXCloudVideoView, Bundle bundle);

    /* renamed from: o */
    void mo33721o(boolean z);

    void setPushListener(ITXLivePushListener iTXLivePushListener);
}
