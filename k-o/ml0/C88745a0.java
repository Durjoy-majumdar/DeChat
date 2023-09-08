package ml0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import org.json.JSONObject;

/* renamed from: ml0.a0 */
public final class C88745a0 implements C88751d {

    /* renamed from: a */
    public final /* synthetic */ C88751d f256154a;

    public C88745a0(Context context) {
        this.f256154a = new C21510b0(context);
    }

    /* renamed from: b */
    public C21511u mo33714b() {
        return this.f256154a.mo33714b();
    }

    /* renamed from: d */
    public C21511u mo33715d(boolean z) {
        return this.f256154a.mo33715d(z);
    }

    /* renamed from: e */
    public C21511u mo21073e(Bundle bundle) {
        return this.f256154a.mo21073e(bundle);
    }

    /* renamed from: f */
    public C21511u mo21074f(String str, JSONObject jSONObject) {
        return this.f256154a.mo21074f(str, jSONObject);
    }

    /* renamed from: g */
    public void mo33716g(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.f256154a.mo33716g(onBGMNotify);
    }

    /* renamed from: h */
    public C21511u mo21076h() {
        return this.f256154a.mo21076h();
    }

    /* renamed from: i */
    public void mo33717i(int i) {
        this.f256154a.mo33717i(i);
    }

    /* renamed from: k */
    public void mo33719k(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.f256154a.mo33719k(iTXSnapshotListener);
    }

    /* renamed from: m */
    public void mo33720m(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f256154a.mo33720m(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: n */
    public C21511u mo21079n(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return this.f256154a.mo21079n(tXCloudVideoView, bundle);
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.f256154a.setPushListener(iTXLivePushListener);
    }
}
