package g50;

import android.content.Context;
import android.graphics.Matrix;
import android.os.HandlerThread;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.wxmm.v2helper;
import eu3.C58834h;
import eu3.C97749e;
import g50.C107747f;
import h50.C108144a;
import h50.C108147c;

/* renamed from: g50.g */
public class C107749g extends TXLivePlayer {

    /* renamed from: a */
    public boolean f322478a;

    /* renamed from: b */
    public C107747f f322479b = null;

    public C107749g(Context context, boolean z, int i) {
        super(context);
        this.f322478a = z;
        if (z) {
            C107747f fVar = new C107747f(context);
            this.f322479b = fVar;
            fVar.f322457E = i;
            fVar.f322476y = false;
            fVar.mo158168a();
            if (fVar.f322457E == 2) {
                fVar.f322458d = true;
            }
            C107744b bVar = this.f322479b.f322472u;
            if (bVar != null) {
                C108144a aVar = bVar.f322448x;
                if (aVar != null) {
                    aVar.f323829g = true;
                    return;
                }
                C108147c cVar = bVar.f322449y;
                if (cVar != null) {
                    cVar.f323845a = true;
                }
            }
        }
    }

    public void pause() {
        Log.m105924i("CustomRender.CustomTXLivePlayer", "pause");
        super.pause();
        if (this.f322478a && this.f322479b != null) {
            super.setVideoRenderListener((TXLivePlayer.ITXLivePlayVideoRenderListener) null, (Object) null);
        }
    }

    public void resume() {
        C107747f fVar;
        Log.m105924i("CustomRender.CustomTXLivePlayer", "resume");
        super.resume();
        if (this.f322478a && (fVar = this.f322479b) != null) {
            super.setVideoRenderListener(fVar, (Object) null);
        }
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        C107747f fVar;
        if (this.f322478a && (fVar = this.f322479b) != null) {
            fVar.getClass();
            Log.m105924i("CustomRender.CustomRender", "set listener " + iTXLivePlayListener);
            fVar.f322453A = iTXLivePlayListener;
        }
        super.setPlayListener(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        C107747f fVar;
        TextureView videoView;
        Log.m105924i("CustomRender.CustomTXLivePlayer", "setPlayerView");
        if (!this.f322478a || (fVar = this.f322479b) == null) {
            super.setPlayerView(tXCloudVideoView);
            return;
        }
        TXCloudVideoView tXCloudVideoView2 = fVar.f322461g;
        if (!(tXCloudVideoView2 == null || tXCloudVideoView2 == tXCloudVideoView || (videoView = tXCloudVideoView2.getVideoView()) == null)) {
            fVar.f322461g.removeView(videoView);
        }
        TXCloudVideoView tXCloudVideoView3 = fVar.f322461g;
        if ((tXCloudVideoView3 == null && tXCloudVideoView != null) || (tXCloudVideoView3 != null && !tXCloudVideoView3.equals(tXCloudVideoView))) {
            fVar.f322454B = false;
        }
        fVar.f322461g = tXCloudVideoView;
        if (tXCloudVideoView != null) {
            TextureView videoView2 = tXCloudVideoView.getVideoView();
            fVar.f322462h = videoView2;
            if (videoView2 == null) {
                fVar.f322462h = new TextureView(fVar.f322461g.getContext());
            }
            fVar.f322462h.setOpaque(false);
            fVar.f322462h.setTransform(new Matrix());
            fVar.f322462h.setScaleX(1.0f);
            fVar.f322462h.setScaleY(1.0f);
            fVar.f322462h.setRotation(0.0f);
            fVar.f322461g.addVideoView(fVar.f322462h);
        }
        TextureView textureView = fVar.f322462h;
        if (textureView != null && fVar.f322470s == null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        if (!(fVar.f322462h.getWidth() == 0 || fVar.f322462h.getHeight() == 0)) {
            fVar.f322464j = fVar.f322462h.getSurfaceTexture();
            fVar.f322465n = fVar.f322462h.getWidth();
            fVar.f322466o = fVar.f322462h.getHeight();
        }
        TextureView textureView2 = fVar.f322462h;
        if (!(textureView2 == null || fVar.f322457E == 1)) {
            fVar.f322465n = textureView2.getWidth();
            fVar.f322466o = fVar.f322462h.getHeight();
            C107752j jVar = new C107752j(fVar.f322462h);
            fVar.f322463i = jVar;
            jVar.mo158178d(fVar.f322467p, fVar.f322468q);
            fVar.f322463i.mo158179e(fVar.f322465n, fVar.f322466o);
            C107752j jVar2 = fVar.f322463i;
            int i = fVar.f322473v;
            jVar2.getClass();
            try {
                jVar2.f322485b.post(new C107750h(jVar2, i));
            } catch (Exception e) {
                Log.m105921e("CustomTextureViewWrapper", "set render mode failed", e);
            }
            C107752j jVar3 = fVar.f322463i;
            int i2 = fVar.f322474w % v2helper.VOIP_ENC_HEIGHT_LV1;
            jVar3.getClass();
            try {
                jVar3.f322485b.post(new C107751i(jVar3, i2));
            } catch (Exception e2) {
                Log.m105921e("CustomTextureViewWrapper", "set render rotation failed.", e2);
            }
        }
        fVar.f322462h.setSurfaceTextureListener(new C107745d(fVar));
        if (fVar.f322470s == null) {
            return;
        }
        if (fVar.f322462h.getSurfaceTexture() != fVar.f322470s) {
            Log.m105924i("CustomRender.CustomRender", "setSurfaceTexture " + fVar.f322462h + ", surfaceTexture " + fVar.f322470s);
            try {
                fVar.f322462h.setSurfaceTexture(fVar.f322470s);
                fVar.f322464j = fVar.f322470s;
            } catch (Exception e3) {
                Log.m105924i("CustomRender.CustomRender", "setSurfaceTexture error " + e3);
                fVar.f322464j = fVar.f322462h.getSurfaceTexture();
            }
        } else {
            Log.m105924i("CustomRender.CustomRender", "not setSurfaceTexture old surfaceTexture " + fVar.f322462h.getSurfaceTexture() + ", new surfaceTexture " + fVar.f322470s);
        }
    }

    public void setRenderMode(int i) {
        C107747f fVar;
        if (this.f322478a && (fVar = this.f322479b) != null) {
            fVar.f322473v = i;
            C107752j jVar = fVar.f322463i;
            if (!(jVar == null || fVar.f322457E == 1)) {
                try {
                    jVar.f322485b.post(new C107750h(jVar, i));
                } catch (Exception e) {
                    Log.m105921e("CustomTextureViewWrapper", "set render mode failed", e);
                }
            }
        }
        super.setRenderMode(i);
    }

    public void setRenderRotation(int i) {
        C107747f fVar;
        if (this.f322478a && (fVar = this.f322479b) != null) {
            fVar.f322474w = i;
            C107752j jVar = fVar.f322463i;
            if (!(jVar == null || fVar.f322457E == 1)) {
                try {
                    jVar.f322485b.post(new C107751i(jVar, i % v2helper.VOIP_ENC_HEIGHT_LV1));
                } catch (Exception e) {
                    Log.m105921e("CustomTextureViewWrapper", "set render rotation failed.", e);
                }
            }
        }
        super.setRenderRotation(i);
    }

    public int startPlay(String str, int i) {
        C107747f fVar;
        Log.m105924i("CustomRender.CustomTXLivePlayer", "startPlay");
        if (this.f322478a && (fVar = this.f322479b) != null) {
            super.setVideoRenderListener(fVar, (Object) null);
            C107747f fVar2 = this.f322479b;
            fVar2.mo158170c();
            fVar2.f322455C = true;
            synchronized (fVar2) {
                int i2 = C58834h.f168432b;
                HandlerThread a = C97749e.m126093a("CustomRender.CustomRender", 10);
                fVar2.f322459e = a;
                a.start();
                Log.m105924i("CustomRender.CustomRender", "CustomRender mGLThread start " + fVar2.f322459e.isAlive());
                fVar2.f322460f = new C107747f.C107748a(fVar2.f322459e.getLooper(), fVar2);
            }
            fVar2.f322475x = true;
            fVar2.f322476y = false;
            fVar2.f322471t = true;
            TXCloudVideoView tXCloudVideoView = fVar2.f322461g;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.clearLog();
                fVar2.f322461g.setVisibility(0);
            }
            TextureView textureView = fVar2.f322462h;
            if (textureView != null) {
                textureView.setVisibility(0);
            }
        }
        return super.startPlay(str, i);
    }

    public int stopPlay(boolean z) {
        C107747f fVar;
        C107747f.C107748a aVar;
        Log.m105924i("CustomRender.CustomTXLivePlayer", "stopPlay");
        if (this.f322478a && (fVar = this.f322479b) != null) {
            fVar.f322471t = false;
            fVar.f322475x = false;
            fVar.f322470s = null;
            if (z) {
                TXCloudVideoView tXCloudVideoView = fVar.f322461g;
                if (tXCloudVideoView != null) {
                    tXCloudVideoView.setVisibility(8);
                }
                TextureView textureView = fVar.f322462h;
                if (textureView != null) {
                    textureView.setVisibility(8);
                }
            }
            synchronized (fVar) {
                if (!(fVar.f322472u == null || (aVar = fVar.f322460f) == null)) {
                    aVar.obtainMessage(3, (Object) null).sendToTarget();
                }
            }
            fVar.mo158170c();
        }
        return super.stopPlay(z);
    }
}
