package p292ad;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import gy3.C87412m;
import ml0.C21511u;
import org.json.JSONObject;

/* renamed from: ad.m */
public final class C79513m implements C79501a {

    /* renamed from: a */
    public final /* synthetic */ C79501a f233154a;

    public C79513m(Context context) {
        this.f233154a = new C16455n(context);
    }

    /* renamed from: a */
    public void mo14921a() {
        this.f233154a.mo14921a();
    }

    /* renamed from: b */
    public C21511u mo14922b() {
        return this.f233154a.mo14922b();
    }

    /* renamed from: c */
    public void mo14923c() {
        this.f233154a.mo14923c();
    }

    /* renamed from: d */
    public C21511u mo14924d() {
        return this.f233154a.mo14924d();
    }

    /* renamed from: e */
    public C21511u mo14925e(Bundle bundle) {
        return this.f233154a.mo14925e(bundle);
    }

    /* renamed from: f */
    public C21511u mo14926f(Bundle bundle) {
        return this.f233154a.mo14926f(bundle);
    }

    /* renamed from: g */
    public C21511u mo14927g(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return this.f233154a.mo14927g(tXCloudVideoView, bundle);
    }

    /* renamed from: h */
    public void mo33722h(boolean z, TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f233154a.mo33722h(z, iTXSnapshotListener);
    }

    /* renamed from: i */
    public C21511u mo33723i() {
        return this.f233154a.mo33723i();
    }

    public boolean isMuted() {
        return this.f233154a.isMuted();
    }

    public boolean isPlaying() {
        return this.f233154a.isPlaying();
    }

    /* renamed from: j */
    public void mo33724j(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f233154a.mo33724j(iTXSnapshotListener);
    }

    /* renamed from: k */
    public void mo33725k(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f233154a.mo33725k(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: l */
    public C21511u mo33726l(C82381f fVar, C83231l.C83235e eVar) {
        C87412m.m108594g(eVar, "pauseType");
        return this.f233154a.mo33726l(fVar, eVar);
    }

    /* renamed from: m */
    public C21511u mo33727m(String str, JSONObject jSONObject) {
        return this.f233154a.mo33727m(str, jSONObject);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.f233154a.setPlayListener(iTXLivePlayListener);
    }

    public C21511u setSurface(Surface surface) {
        return this.f233154a.setSurface(surface);
    }

    public C21511u setSurfaceSize(int i, int i2) {
        return this.f233154a.setSurfaceSize(i, i2);
    }
}
