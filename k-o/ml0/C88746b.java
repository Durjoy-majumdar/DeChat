package ml0;

import android.content.Context;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import ml0.C88752e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ml0.b */
public class C88746b extends TXCloudVideoView {

    /* renamed from: d */
    public final C82381f f256155d;

    /* renamed from: e */
    public C88750c f256156e;

    /* renamed from: f */
    public C88747a f256157f;

    /* renamed from: g */
    public C88749c f256158g;

    /* renamed from: h */
    public int f256159h;

    /* renamed from: i */
    public boolean f256160i;

    /* renamed from: j */
    public C88748b f256161j;

    /* renamed from: ml0.b$a */
    public interface C88747a {
    }

    /* renamed from: ml0.b$b */
    public interface C88748b {
    }

    /* renamed from: ml0.b$c */
    public interface C88749c {
    }

    public C88746b(C82381f fVar, Context context) {
        super(context);
        this.f256155d = fVar;
        this.f256156e = new C88782y(context);
    }

    /* renamed from: a */
    public void mo123188a() {
        C21511u i = ((C88782y) this.f256156e).mo33723i();
        Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onDestroy code:%d info:%s", Integer.valueOf(i.f60905a), i.f60906b);
        C88748b bVar = this.f256161j;
        if (bVar != null) {
            C88752e.C88758f fVar = (C88752e.C88758f) bVar;
            fVar.f256172a.mo114863i(fVar.f256173b);
            fVar.f256172a.mo114866q(fVar.f256174c);
        }
    }

    /* renamed from: b */
    public final void mo123189b(boolean z) {
        C88749c cVar;
        if (this.f256160i && (cVar = this.f256158g) != null) {
            int i = this.f256159h;
            C88752e.C88759g gVar = (C88752e.C88759g) cVar;
            gVar.getClass();
            C88752e.C88763k kVar = new C88752e.C88763k((C88752e.C88753a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fullScreen", z);
                jSONObject.put(TencentLocation.EXTRA_DIRECTION, i);
                jSONObject.put("livePlayerId", gVar.f256175a);
            } catch (JSONException unused) {
            }
            C82520h hVar = gVar.f256176b;
            kVar.f242407f = jSONObject.toString();
            hVar.mo109669n(kVar, (int[]) null);
        }
    }

    /* renamed from: c */
    public boolean mo123190c(String str, JSONObject jSONObject) {
        C21511u m = ((C88782y) this.f256156e).mo33727m(str, jSONObject);
        Log.m105925i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", Integer.valueOf(m.f60905a), m.f60906b);
        return m.f60905a == 0;
    }

    public void setAudioVolumeEventListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((C88782y) this.f256156e).mo33725k(iTXAudioVolumeEvaluationListener);
    }

    public void setExitListener(C88748b bVar) {
        this.f256161j = bVar;
    }

    public void setFullScreenDelegate(C88747a aVar) {
        this.f256157f = aVar;
    }

    public void setNeedEvent(boolean z) {
        this.f256160i = z;
    }

    public void setOnFullScreenChangeListener(C88749c cVar) {
        this.f256158g = cVar;
    }

    public void setPlayEventListener(ITXLivePlayListener iTXLivePlayListener) {
        ((C88782y) this.f256156e).setPlayListener(iTXLivePlayListener);
    }

    public void setSnapshotListener(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        ((C88782y) this.f256156e).mo33724j(iTXSnapshotListener);
    }
}
