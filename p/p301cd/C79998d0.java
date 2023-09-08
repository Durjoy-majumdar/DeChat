package p301cd;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17656d;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import gy3.C87412m;
import ml0.C21511u;
import org.json.JSONObject;

/* renamed from: cd.d0 */
public final class C79998d0 implements C79999m {

    /* renamed from: a */
    public final /* synthetic */ C79999m f234300a;

    public C79998d0(Context context) {
        this.f234300a = new C17656d(context);
    }

    /* renamed from: a */
    public void mo21071a() {
        this.f234300a.mo21071a();
    }

    /* renamed from: b */
    public C21511u mo33714b() {
        return this.f234300a.mo33714b();
    }

    /* renamed from: c */
    public void mo21072c() {
        this.f234300a.mo21072c();
    }

    /* renamed from: d */
    public C21511u mo33715d(boolean z) {
        return this.f234300a.mo33715d(z);
    }

    /* renamed from: e */
    public C21511u mo21073e(Bundle bundle) {
        return this.f234300a.mo21073e(bundle);
    }

    /* renamed from: f */
    public C21511u mo21074f(String str, JSONObject jSONObject) {
        return this.f234300a.mo21074f(str, jSONObject);
    }

    /* renamed from: g */
    public void mo33716g(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.f234300a.mo33716g(onBGMNotify);
    }

    public int getMaxZoom() {
        return this.f234300a.getMaxZoom();
    }

    /* renamed from: h */
    public C21511u mo21076h() {
        return this.f234300a.mo21076h();
    }

    /* renamed from: i */
    public void mo33717i(int i) {
        this.f234300a.mo33717i(i);
    }

    public boolean isPushing() {
        return this.f234300a.isPushing();
    }

    /* renamed from: j */
    public void mo33718j(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        C87412m.m108594g(v2TXLiveVideoFrame, "videoFrame");
        this.f234300a.mo33718j(v2TXLiveVideoFrame);
    }

    /* renamed from: k */
    public void mo33719k(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.f234300a.mo33719k(iTXSnapshotListener);
    }

    /* renamed from: l */
    public C21511u mo21078l(Bundle bundle) {
        return this.f234300a.mo21078l(bundle);
    }

    /* renamed from: m */
    public void mo33720m(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f234300a.mo33720m(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: n */
    public C21511u mo21079n(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return this.f234300a.mo21079n(tXCloudVideoView, bundle);
    }

    /* renamed from: o */
    public void mo33721o(boolean z) {
        this.f234300a.mo33721o(z);
    }

    public C21511u setFocusPosition(float f, float f2) {
        return this.f234300a.setFocusPosition(f, f2);
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.f234300a.setPushListener(iTXLivePushListener);
    }

    public C21511u setSurface(Surface surface) {
        return this.f234300a.setSurface(surface);
    }

    public C21511u setSurfaceSize(int i, int i2) {
        return this.f234300a.setSurfaceSize(i, i2);
    }

    public C21511u setZoom(int i) {
        return this.f234300a.setZoom(i);
    }
}
