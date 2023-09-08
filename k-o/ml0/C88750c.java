package ml0;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import org.json.JSONObject;

/* renamed from: ml0.c */
public interface C88750c {
    /* renamed from: b */
    C21511u mo14922b();

    /* renamed from: e */
    C21511u mo14925e(Bundle bundle);

    /* renamed from: g */
    C21511u mo14927g(TXCloudVideoView tXCloudVideoView, Bundle bundle);

    /* renamed from: h */
    void mo33722h(boolean z, TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    /* renamed from: i */
    C21511u mo33723i();

    /* renamed from: j */
    void mo33724j(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    /* renamed from: k */
    void mo33725k(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    /* renamed from: l */
    C21511u mo33726l(C82381f fVar, C83231l.C83235e eVar);

    /* renamed from: m */
    C21511u mo33727m(String str, JSONObject jSONObject);

    void setPlayListener(ITXLivePlayListener iTXLivePlayListener);
}
