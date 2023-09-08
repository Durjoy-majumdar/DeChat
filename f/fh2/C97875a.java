package fh2;

import android.content.Context;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import gy3.C87412m;
import h90.C98323a;
import i72.C108388k;
import i72.C108392r;
import j90.C108667e;
import l90.C109291a;
import m90.C88716b;
import s80.C110777a;
import z04.C112550d0;

/* renamed from: fh2.a */
public final class C97875a implements C109291a {

    /* renamed from: d */
    public VideoTransPara f287114d;

    /* renamed from: e */
    public CameraPreviewGLSurfaceView f287115e;

    /* renamed from: f */
    public String f287116f;

    /* renamed from: fh2.a$a */
    public static final class C97876a implements C98323a {

        /* renamed from: a */
        public final /* synthetic */ C97875a f287117a;

        public C97876a(C97875a aVar) {
            this.f287117a = aVar;
        }

        /* renamed from: b */
        public String mo128056b() {
            return ((String) C112550d0.m153785U(this.f287117a.f287116f, new String[]{"."}, false, 0, 6, (Object) null).get(0)) + "_thumb.jpg";
        }

        /* renamed from: c */
        public int mo128057c() {
            if (!C97884j.f287168e) {
                return 2;
            }
            Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Media_CaptureSoft_Int, 0);
            if (!C87412m.m108589b(a, 0)) {
                return C87412m.m108589b(a, 1) ? 1 : 2;
            }
            C108392r rVar = C108388k.f324540d;
            if (rVar == null || !C97884j.f287168e) {
                return 2;
            }
            return rVar.f324551a;
        }

        public String getFilePath() {
            return this.f287117a.f287116f;
        }
    }

    public C97875a(VideoTransPara videoTransPara, CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView, String str) {
        C87412m.m108594g(videoTransPara, "recordVideoTransPara");
        C87412m.m108594g(cameraPreviewGLSurfaceView, "previewPlugin");
        C87412m.m108594g(str, "videoPath");
        this.f287114d = videoTransPara;
        this.f287115e = cameraPreviewGLSurfaceView;
        this.f287116f = str;
    }

    /* renamed from: b */
    public boolean mo128015b() {
        return false;
    }

    /* renamed from: d */
    public boolean mo128017d() {
        return false;
    }

    /* renamed from: f */
    public boolean mo128018f() {
        return false;
    }

    public C108667e getCameraPreviewView() {
        return this.f287115e;
    }

    public Context getContext() {
        Context context = this.f287115e.getContext();
        C87412m.m108593f(context, "previewPlugin.context");
        return context;
    }

    public VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    public C98323a getEncodeConfig() {
        return new C97876a(this);
    }

    public C110777a getPreviewRenderer() {
        return null;
    }

    public C110777a getRecordRenderer() {
        return null;
    }

    public int getRecordScene() {
        return 9;
    }

    public C88716b getRecorder() {
        return null;
    }

    public int getResolutionLimit() {
        return C97884j.f287168e ? C97884j.f287166c : this.f287114d.f267166d;
    }

    public VideoTransPara getVideoTransPara() {
        VideoTransPara videoTransPara;
        if (C97884j.f287168e && (videoTransPara = C97884j.f287165b) != null) {
            int i = videoTransPara.f267166d;
            VideoTransPara videoTransPara2 = this.f287114d;
            if (!(i == videoTransPara2.f267166d && videoTransPara.f267167e == videoTransPara2.f267167e)) {
                videoTransPara2.f267166d = i;
                videoTransPara2.f267167e = videoTransPara.f267167e;
            }
        }
        return this.f287114d;
    }

    /* renamed from: v */
    public boolean mo128038v() {
        return false;
    }
}
