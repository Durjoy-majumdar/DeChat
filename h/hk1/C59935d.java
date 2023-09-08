package hk1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayer;
import vp3.C111580c;

/* renamed from: hk1.d */
public final class C59935d implements C111580c.C111581a {

    /* renamed from: d */
    public final /* synthetic */ C59932c f171051d;

    public C59935d(C59932c cVar) {
        this.f171051d = cVar;
    }

    /* renamed from: a */
    public void mo81095a(SurfaceTexture surfaceTexture) {
        Log.m105924i("LivePullDownView", "liveEffectView onSurfaceDestroy");
        C59932c cVar = this.f171051d;
        cVar.f171044i = null;
        TXLivePlayer tXLivePlayer = cVar.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface((Surface) null);
        }
    }

    /* renamed from: b */
    public void mo81096b(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("LivePullDownView", "liveEffectView onSurfaceAvailable width:" + i + " height:" + i2);
        C59932c cVar = this.f171051d;
        cVar.f171044i = surfaceTexture;
        TXLivePlayer tXLivePlayer = cVar.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface(new Surface(this.f171051d.f171044i));
        }
    }

    /* renamed from: c */
    public void mo81097c(SurfaceTexture surfaceTexture) {
        Log.m105924i("LivePullDownView", "liveEffectView onSurfaceUpdate");
    }
}
