package yh2;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import bh2.C104110c;
import bh2.C104113e;
import bh2.C104136w;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.StoryFakeVideoPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import gy3.C87412m;

/* renamed from: yh2.o */
public final class C112464o implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ StoryFakeVideoPlayView f336732d;

    public C112464o(StoryFakeVideoPlayView storyFakeVideoPlayView) {
        this.f336732d = storyFakeVideoPlayView;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        StoryFakeVideoPlayView storyFakeVideoPlayView = this.f336732d;
        C104136w wVar = storyFakeVideoPlayView.f315671e;
        if (wVar != null) {
            C104110c cVar = new C104110c(surfaceTexture, wVar);
            storyFakeVideoPlayView.f315670d = cVar;
            cVar.mo145763b();
            StoryFakeVideoPlayView storyFakeVideoPlayView2 = this.f336732d;
            C104110c cVar2 = storyFakeVideoPlayView2.f315670d;
            if (cVar2 != null) {
                C104136w wVar2 = cVar2.f308028c;
                wVar2.f308124a = i;
                wVar2.f308125b = i2;
                if (cVar2 != null) {
                    wVar2.f308127d = (long) 66;
                    storyFakeVideoPlayView2.f315673g = true;
                    int i3 = StoryFakeVideoPlayView.f315669o;
                    Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureAvailable");
                    return;
                }
                C87412m.m108603p("glThread");
                throw null;
            }
            C87412m.m108603p("glThread");
            throw null;
        }
        C87412m.m108603p(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
        throw null;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        int i = StoryFakeVideoPlayView.f315669o;
        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureDestroyed");
        StoryFakeVideoPlayView storyFakeVideoPlayView = this.f336732d;
        storyFakeVideoPlayView.f315673g = false;
        C104110c cVar = storyFakeVideoPlayView.f315670d;
        if (cVar != null) {
            MMHandler mMHandler = cVar.f308031f;
            if (mMHandler == null) {
                Log.m105924i("MicroMsg.Story.GLThread", "stop but handler is null");
                return true;
            }
            mMHandler.removeCallbacksAndMessages((Object) null);
            cVar.f308031f.post(new C104113e(cVar));
            return true;
        }
        C87412m.m108603p("glThread");
        throw null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        int i3 = StoryFakeVideoPlayView.f315669o;
        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        int i = StoryFakeVideoPlayView.f315669o;
        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureUpdated");
    }
}
