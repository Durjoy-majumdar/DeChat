package p292ad;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tav.core.AssetExtension;
import ml0.C21511u;
import ml0.C21512z;
import org.json.JSONObject;

/* renamed from: ad.n */
public class C16455n extends C21512z implements C79501a {
    public C16455n(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo14921a() {
        ITXLivePlayListener iTXLivePlayListener = this.f60909b;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE, new Bundle());
        }
    }

    /* renamed from: b */
    public C21511u mo14922b() {
        return mo33727m(AssetExtension.SCENE_PLAY, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo14923c() {
        ITXLivePlayListener iTXLivePlayListener = this.f60909b;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(6000, new Bundle());
        }
    }

    /* renamed from: d */
    public C21511u mo14924d() {
        return this.f60908a.isPlaying() ? mo33727m("stop", (JSONObject) null) : new C21511u();
    }

    /* renamed from: e */
    public C21511u mo14925e(Bundle bundle) {
        return super.mo14925e(bundle);
    }

    /* renamed from: f */
    public C21511u mo14926f(Bundle bundle) {
        return new C21511u(this.f60908a.initLivePlayer(bundle));
    }

    /* renamed from: g */
    public C21511u mo14927g(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        return super.mo14927g(tXCloudVideoView, bundle);
    }

    public boolean isMuted() {
        return this.f60908a.isMuted();
    }

    public boolean isPlaying() {
        return this.f60908a.isPlaying();
    }

    public C21511u setSurface(Surface surface) {
        return new C21511u(this.f60908a.setSurface(surface));
    }

    public C21511u setSurfaceSize(int i, int i2) {
        return new C21511u(this.f60908a.setSurfaceSize(i, i2));
    }
}
