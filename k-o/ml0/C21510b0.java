package ml0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.xweb.IXWebBroadcastListener;
import org.json.JSONObject;

/* renamed from: ml0.b0 */
public class C21510b0 implements C88751d {

    /* renamed from: a */
    public final V2TXLivePusherJSAdapter f60902a;

    /* renamed from: b */
    public boolean f60903b = false;

    /* renamed from: c */
    public boolean f60904c = false;

    public C21510b0(Context context) {
        this.f60902a = new V2TXLivePusherJSAdapter(context);
    }

    /* renamed from: b */
    public C21511u mo33714b() {
        return this.f60903b ? this.f60904c ? mo21074f(IXWebBroadcastListener.STAGE_START, (JSONObject) null) : mo21074f("resume", (JSONObject) null) : new C21511u();
    }

    /* renamed from: d */
    public C21511u mo33715d(boolean z) {
        boolean isPushing = this.f60902a.isPushing();
        this.f60903b = isPushing;
        if (!isPushing) {
            return new C21511u();
        }
        if (!z) {
            return mo21074f("pause", (JSONObject) null);
        }
        this.f60904c = z;
        return mo21074f("stop", (JSONObject) null);
    }

    /* renamed from: e */
    public C21511u mo21073e(Bundle bundle) {
        return new C21511u(this.f60902a.updateLivePusher(bundle));
    }

    /* renamed from: f */
    public C21511u mo21074f(String str, JSONObject jSONObject) {
        return new C21511u(this.f60902a.operateLivePusher(str, jSONObject));
    }

    /* renamed from: g */
    public void mo33716g(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.f60902a.setBGMNotifyListener(onBGMNotify);
    }

    /* renamed from: h */
    public C21511u mo21076h() {
        return new C21511u(this.f60902a.unInitLivePusher());
    }

    /* renamed from: i */
    public void mo33717i(int i) {
        this.f60902a.notifyOrientationChanged(i);
    }

    /* renamed from: j */
    public void mo33718j(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        this.f60902a.sendCustomVideoFrame(v2TXLiveVideoFrame);
    }

    /* renamed from: k */
    public void mo33719k(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.f60902a.setSnapshotListener(iTXSnapshotListener);
    }

    /* renamed from: m */
    public void mo33720m(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f60902a.setAudioVolumeListener(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: n */
    public C21511u mo21079n(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return new C21511u(this.f60902a.initLivePusher(tXCloudVideoView, bundle));
    }

    /* renamed from: o */
    public void mo33721o(boolean z) {
        this.f60902a.enableCustomVideoCapture(z);
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.f60902a.setPushListener(iTXLivePushListener);
    }
}
