package ml0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: ml0.y */
public final class C88782y implements C88750c {

    /* renamed from: a */
    public final /* synthetic */ C88750c f256200a;

    public C88782y(Context context) {
        this.f256200a = new C21512z(context);
    }

    /* renamed from: b */
    public C21511u mo14922b() {
        return this.f256200a.mo14922b();
    }

    /* renamed from: e */
    public C21511u mo14925e(Bundle bundle) {
        return this.f256200a.mo14925e(bundle);
    }

    /* renamed from: g */
    public C21511u mo14927g(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return this.f256200a.mo14927g(tXCloudVideoView, bundle);
    }

    /* renamed from: i */
    public C21511u mo33723i() {
        return this.f256200a.mo33723i();
    }

    /* renamed from: j */
    public void mo33724j(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f256200a.mo33724j(iTXSnapshotListener);
    }

    /* renamed from: k */
    public void mo33725k(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f256200a.mo33725k(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: l */
    public C21511u mo33726l(C82381f fVar, C83231l.C83235e eVar) {
        C87412m.m108594g(eVar, "pauseType");
        return this.f256200a.mo33726l(fVar, eVar);
    }

    /* renamed from: m */
    public C21511u mo33727m(String str, JSONObject jSONObject) {
        return this.f256200a.mo33727m(str, jSONObject);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.f256200a.setPlayListener(iTXLivePlayListener);
    }
}
