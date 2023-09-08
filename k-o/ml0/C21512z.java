package ml0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterError;
import com.tencent.live2.jsplugin.player.V2TXLivePlayerJSAdapter;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tav.core.AssetExtension;
import org.json.JSONObject;

/* renamed from: ml0.z */
public class C21512z implements C88750c {

    /* renamed from: a */
    public V2TXLivePlayerJSAdapter f60908a;

    /* renamed from: b */
    public ITXLivePlayListener f60909b;

    /* renamed from: c */
    public boolean f60910c = false;

    /* renamed from: d */
    public boolean f60911d = false;

    /* renamed from: e */
    public boolean f60912e = true;

    /* renamed from: f */
    public boolean f60913f = true;

    public C21512z(Context context) {
        this.f60908a = new V2TXLivePlayerJSAdapter(context);
    }

    /* renamed from: b */
    public C21511u mo14922b() {
        return this.f60910c ? mo33727m(AssetExtension.SCENE_PLAY, (JSONObject) null) : new C21511u();
    }

    /* renamed from: e */
    public C21511u mo14925e(Bundle bundle) {
        V2TXJSAdapterError updateLivePlayer = this.f60908a.updateLivePlayer(bundle);
        int i = updateLivePlayer.errorCode;
        if (!(-1 == i || -3 == i)) {
            mo33728n(bundle, true);
        }
        return new C21511u(updateLivePlayer);
    }

    /* renamed from: g */
    public C21511u mo14927g(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        V2TXJSAdapterError initLivePlayer = this.f60908a.initLivePlayer(tXCloudVideoView, bundle);
        if (-1 != initLivePlayer.errorCode) {
            mo33728n(bundle, true);
        }
        return new C21511u(initLivePlayer);
    }

    /* renamed from: h */
    public void mo33722h(boolean z, TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f60908a.takePhoto(z, iTXSnapshotListener);
    }

    /* renamed from: i */
    public C21511u mo33723i() {
        return new C21511u(this.f60908a.uninitLivePlayer());
    }

    /* renamed from: j */
    public void mo33724j(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f60908a.setSnapshotListener(iTXSnapshotListener);
    }

    /* renamed from: k */
    public void mo33725k(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f60908a.setAudioVolumeListener(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: l */
    public C21511u mo33726l(C82381f fVar, C83231l.C83235e eVar) {
        ITXLivePlayListener iTXLivePlayListener;
        Log.m105925i("TXLivePlayerJSAdapterV2", "enterBackground, pauseType: %s", eVar);
        C82732k0 RV = C82731k.f242051e.mo115008RV(this.f60912e, this.f60913f);
        Log.m105925i("TXLivePlayerJSAdapterV2", "enterBackground, autoPauseStrategy: %s", RV);
        if (!RV.mo114992a(fVar, eVar)) {
            this.f60910c = false;
            return new C21511u();
        }
        boolean isPlaying = this.f60908a.isPlaying();
        this.f60910c = isPlaying;
        if (!isPlaying) {
            return new C21511u();
        }
        if (this.f60911d && (iTXLivePlayListener = this.f60909b) != null) {
            iTXLivePlayListener.onPlayEvent(6000, new Bundle());
        }
        return mo33727m("stop", (JSONObject) null);
    }

    /* renamed from: m */
    public C21511u mo33727m(String str, JSONObject jSONObject) {
        return new C21511u(this.f60908a.operateLivePlayer(str, jSONObject));
    }

    /* renamed from: n */
    public final void mo33728n(Bundle bundle, boolean z) {
        this.f60911d = bundle.getBoolean("needEvent", this.f60911d);
        this.f60912e = bundle.getBoolean("autoPauseIfNavigate", this.f60912e);
        this.f60913f = bundle.getBoolean("autoPauseIfOpenNative", this.f60913f);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.f60909b = iTXLivePlayListener;
        this.f60908a.setPlayListener(iTXLivePlayListener);
    }
}
