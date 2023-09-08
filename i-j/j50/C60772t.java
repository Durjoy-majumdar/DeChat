package j50;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.trtc.TRTCCloudDef;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import p500dy.C97560f;
import p80.C110194c;
import rx3.C13598b0;
import s50.C110747k;
import y80.C66557b;

/* renamed from: j50.t */
public final class C60772t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173092d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f173093e;

    /* renamed from: f */
    public final /* synthetic */ String f173094f;

    /* renamed from: j50.t$a */
    public static final class C60773a implements ITPPlayerListener.IOnPreparedListener {

        /* renamed from: d */
        public final /* synthetic */ C60735a f173095d;

        /* renamed from: e */
        public final /* synthetic */ String f173096e;

        /* renamed from: j50.t$a$a */
        public static final class C60774a extends C87413o implements C32226l<C110194c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60735a f173097d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60774a(C60735a aVar) {
                super(1);
                this.f173097d = aVar;
            }

            public Object invoke(Object obj) {
                C110194c cVar = (C110194c) obj;
                C60735a aVar = this.f173097d;
                if (!aVar.f172990B) {
                    Log.m105924i("MicroMsg.LiveCore", "startPushLocalVideo skip sendCustomVideoData by isPushing:" + this.f173097d.f172990B);
                } else if (aVar.f172989A.f166264k) {
                    Log.m105924i("MicroMsg.LiveCore", "startPushLocalVideo skip sendCustomVideoData by isDocMode:" + this.f173097d.f172989A.f166264k);
                    C60735a.m71076L(this.f173097d);
                } else if (cVar != null) {
                    aVar.f173027n.eglContext14 = aVar.f173031q.getEGLContext();
                    TRTCCloudDef.TRTCTexture tRTCTexture = aVar.f173027n;
                    tRTCTexture.textureId = cVar.f329652e;
                    TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = aVar.f173026j;
                    tRTCVideoFrame.texture = tRTCTexture;
                    tRTCVideoFrame.width = cVar.f329657j;
                    tRTCVideoFrame.height = cVar.f329658n;
                    tRTCVideoFrame.pixelFormat = 2;
                    tRTCVideoFrame.bufferType = 3;
                    aVar.mo85679W().sendCustomVideoData(aVar.f173026j);
                }
                return C13598b0.f38549a;
            }
        }

        public C60773a(C60735a aVar, String str) {
            this.f173095d = aVar;
            this.f173096e = str;
        }

        public final void onPrepared(ITPPlayer iTPPlayer) {
            int i;
            int i2;
            ITPPlayer iTPPlayer2 = this.f173095d.f173039x0;
            if (iTPPlayer2 != null) {
                iTPPlayer2.start();
            }
            Log.m105924i("MicroMsg.LiveCore", "startPushLocalVideo success");
            C60735a aVar = this.f173095d;
            C110747k kVar = aVar.f173031q;
            C66557b bVar = C66557b.f191414a;
            C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(this.f173096e);
            if (Z40 != null) {
                i = Z40.f273446d;
            } else {
                ITPPlayer iTPPlayer3 = aVar.f173039x0;
                i = iTPPlayer3 != null ? iTPPlayer3.getVideoHeight() : 0;
            }
            C66557b.f191415b = i;
            if (Z40 != null) {
                i2 = Z40.f273445c;
            } else {
                ITPPlayer iTPPlayer4 = aVar.f173039x0;
                i2 = iTPPlayer4 != null ? iTPPlayer4.getVideoWidth() : 0;
            }
            C66557b.f191416c = i2;
            C66557b.f191417d = Z40 != null ? Z40.f273456n : 0;
            C66557b.f191420g = false;
            kVar.mo148310m(bVar);
            C60735a aVar2 = this.f173095d;
            aVar2.f173031q.setOnDrawListener(new C60774a(aVar2));
        }
    }

    public C60772t(C60735a aVar, SurfaceTexture surfaceTexture, String str) {
        this.f173092d = aVar;
        this.f173093e = surfaceTexture;
        this.f173094f = str;
    }

    public final void run() {
        ITPPlayer iTPPlayer = this.f173092d.f173039x0;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(new Surface(this.f173093e));
        }
        ITPPlayer iTPPlayer2 = this.f173092d.f173039x0;
        if (iTPPlayer2 != null) {
            iTPPlayer2.prepareAsync();
        }
        C60735a aVar = this.f173092d;
        ITPPlayer iTPPlayer3 = aVar.f173039x0;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnPreparedListener(new C60773a(aVar, this.f173094f));
        }
    }
}
