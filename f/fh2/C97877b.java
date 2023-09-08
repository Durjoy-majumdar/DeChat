package fh2;

import android.content.Context;
import android.opengl.EGLContext;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32227p;
import g90.C32354a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98323a;
import hi2.C98452d;
import hi2.C98453h;
import i72.C108388k;
import i72.C108392r;
import ih2.C60287a;
import j90.C108667e;
import l80.C99346b;
import l90.C109291a;
import m90.C109557d;
import m90.C88716b;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import sh2.C110789b;
import sh2.C110790c;
import y80.C38978c;

/* renamed from: fh2.b */
public class C97877b implements C109291a {

    /* renamed from: d */
    public RecordConfigProvider f287118d;

    /* renamed from: e */
    public CameraPreviewGLSurfaceView f287119e;

    /* renamed from: f */
    public VideoTransPara f287120f;

    /* renamed from: g */
    public C32354a f287121g;

    /* renamed from: h */
    public final boolean f287122h;

    /* renamed from: i */
    public boolean f287123i;

    /* renamed from: j */
    public C110790c f287124j;

    /* renamed from: n */
    public C110789b f287125n;

    /* renamed from: fh2.b$a */
    public static final class C97878a implements C98323a {

        /* renamed from: a */
        public final /* synthetic */ C97877b f287126a;

        public C97878a(C97877b bVar) {
            this.f287126a = bVar;
        }

        /* renamed from: b */
        public String mo128056b() {
            String str = this.f287126a.f287118d.f272902C;
            C87412m.m108593f(str, "configProvider.thumbPath");
            return str;
        }

        /* renamed from: c */
        public int mo128057c() {
            int i = 1;
            if (MultiProcessMMKV.getSingleDefault().getBoolean("mediacodec_create_error", false)) {
                return 1;
            }
            if (!C97884j.f287168e) {
                return this.f287126a.f287118d.f272922g;
            }
            Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Media_CaptureSoft_Int, 0);
            if (!C87412m.m108589b(a, 0)) {
                if (!C87412m.m108589b(a, 1)) {
                    i = 2;
                }
                return i;
            }
            C108392r rVar = C108388k.f324540d;
            if (rVar == null || !C97884j.f287168e) {
                return 2;
            }
            return rVar.f324551a;
        }

        public String getFilePath() {
            String str = this.f287126a.f287118d.f272900A;
            C87412m.m108593f(str, "configProvider.inputVideoPath");
            return str;
        }
    }

    /* renamed from: fh2.b$b */
    public static final class C97879b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97877b f287127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97879b(C97877b bVar) {
            super(2);
            this.f287127d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C110789b bVar = this.f287127d.f287125n;
            if (bVar != null) {
                bVar.mo162347v(intValue, intValue2);
            }
            return C13598b0.f38549a;
        }
    }

    public C97877b(RecordConfigProvider recordConfigProvider, CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView) {
        VideoTransPara videoTransPara;
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C87412m.m108594g(cameraPreviewGLSurfaceView, "previewPlugin");
        this.f287118d = recordConfigProvider;
        this.f287119e = cameraPreviewGLSurfaceView;
        Context context = cameraPreviewGLSurfaceView.getContext();
        C87412m.m108593f(context, "previewPlugin.context");
        this.f287121g = new C32354a(context);
        C98453h.f288774a.mo137804b(this.f287118d);
        Object clone = this.f287118d.f272926n.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
        this.f287120f = (VideoTransPara) clone;
        if (C97884j.f287168e && (videoTransPara = C97884j.f287165b) != null) {
            Object clone2 = videoTransPara.clone();
            C87412m.m108592e(clone2, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
            this.f287120f = (VideoTransPara) clone2;
        }
        boolean z = true;
        if (this.f287118d.f272923h == 1) {
            if (!C97884j.f287168e) {
                int i = C60287a.f171906a;
                int i2 = C60287a.f171907b;
                int i3 = C60287a.f171906a;
                VideoTransPara videoTransPara2 = this.f287120f;
                videoTransPara2.f267166d = (videoTransPara2.f267167e * i3) / i2;
                Log.m105924i("MicroMsg.CameraContainerProcess", "SightRecordConfig init failed, fix videoPara");
            }
            if (!C99346b.f291328a) {
                int i4 = this.f287118d.f272905F;
                if (i4 == 2) {
                    VideoTransPara videoTransPara3 = this.f287120f;
                    videoTransPara3.f267169g = (int) (((float) videoTransPara3.f267169g) * 6.0f);
                    Log.m105924i("MicroMsg.CameraContainerProcess", "final kbps: " + 6.0f + "  " + this.f287120f.f267169g);
                } else if (i4 == 1) {
                    VideoTransPara videoTransPara4 = this.f287120f;
                    videoTransPara4.f267169g = (int) (((float) videoTransPara4.f267169g) * 8.0f);
                    Log.m105924i("MicroMsg.CameraContainerProcess", "final kbps: " + 8.0f + "  " + this.f287120f.f267169g);
                } else {
                    this.f287120f.f267169g = 8000000;
                    Log.m105924i("MicroMsg.CameraContainerProcess", "final kbps: $2  " + this.f287120f.f267169g);
                }
            }
        }
        RecordConfigProvider recordConfigProvider2 = this.f287118d;
        XEffectConfig xEffectConfig = recordConfigProvider2.f272915Q;
        if (!xEffectConfig.f318441e && !xEffectConfig.f318442f) {
            z = false;
        }
        this.f287122h = z;
        C38978c.f105019b = recordConfigProvider2.f272905F;
        Log.m105924i("MicroMsg.CameraContainerProcess", "init CameraContainerProcess, scene: " + this.f287118d.f272905F + "   " + this.f287120f);
    }

    /* renamed from: b */
    public boolean mo128015b() {
        return this.f287123i;
    }

    /* renamed from: d */
    public boolean mo128017d() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_PREVIEW_CROP_INT_SYNC, -1);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f).intValue();
        Log.m105924i("MicroMsg.CameraContainerProcess", "cuttype : " + intValue);
        if (intValue == 1) {
            C98452d.f288771a = false;
            return false;
        } else if (intValue == 2) {
            C98452d.f288771a = true;
            return true;
        } else if (MultiProcessMMKV.getSingleDefault().getBoolean("mediacodec_create_error", false)) {
            C98452d.f288771a = true;
            return true;
        } else {
            Boolean valueOf = C97884j.f287168e ? Boolean.valueOf(C97884j.f287164a.mo137209b()) : this.f287118d.f272920e;
            C87412m.m108593f(valueOf, "cpuCrop");
            C98452d.f288771a = valueOf.booleanValue();
            return valueOf.booleanValue();
        }
    }

    /* renamed from: f */
    public boolean mo128018f() {
        return false;
    }

    public C108667e getCameraPreviewView() {
        return this.f287119e;
    }

    public Context getContext() {
        Context context = this.f287119e.getContext();
        C87412m.m108593f(context, "previewPlugin.context");
        return context;
    }

    public VideoTransPara getDaemonVideoTransPara() {
        VideoTransPara videoTransPara = this.f287118d.f272926n;
        C87412m.m108593f(videoTransPara, "configProvider.videoParam");
        return videoTransPara;
    }

    public C98323a getEncodeConfig() {
        return new C97878a(this);
    }

    public C110777a getPreviewRenderer() {
        if (!this.f287122h) {
            this.f287124j = null;
            this.f287125n = null;
        } else if (this.f287124j == null) {
            this.f287124j = new C110790c(0, 1, (C8480h) null);
            this.f287125n = new C110789b();
            C110790c cVar = this.f287124j;
            if (cVar != null) {
                cVar.f331430y = new C97879b(this);
            }
        }
        if (this.f287122h) {
            return this.f287124j;
        }
        return null;
    }

    public C110777a getRecordRenderer() {
        if (this.f287122h) {
            return this.f287125n;
        }
        return null;
    }

    public int getRecordScene() {
        return this.f287118d.f272905F;
    }

    public C88716b getRecorder() {
        C110194c cVar = null;
        if (!this.f287122h) {
            return null;
        }
        VideoTransPara videoTransPara = getVideoTransPara();
        C110789b bVar = this.f287125n;
        EGLContext eGLContext = this.f287119e.getEGLContext();
        C87412m.m108591d(eGLContext);
        C110790c cVar2 = this.f287124j;
        if (cVar2 != null) {
            cVar = cVar2.mo157953g();
        }
        C87412m.m108591d(cVar);
        return new C109557d(videoTransPara, bVar, eGLContext, cVar.f329652e);
    }

    public int getResolutionLimit() {
        return C97884j.f287168e ? C97884j.f287166c : this.f287118d.f272921f;
    }

    public VideoTransPara getVideoTransPara() {
        VideoTransPara videoTransPara;
        if (C97884j.f287168e && (videoTransPara = C97884j.f287165b) != null) {
            int i = videoTransPara.f267166d;
            VideoTransPara videoTransPara2 = this.f287120f;
            if (!(i == videoTransPara2.f267166d && videoTransPara.f267167e == videoTransPara2.f267167e)) {
                videoTransPara2.f267166d = i;
                videoTransPara2.f267167e = videoTransPara.f267167e;
            }
        }
        return this.f287120f;
    }

    /* renamed from: v */
    public boolean mo128038v() {
        boolean z = false;
        if (mo128017d()) {
            Log.m105924i("MicroMsg.CameraContainerProcess", "useDaemonRecorder false");
            C98452d.f288772b = false;
            return false;
        }
        int i = this.f287118d.f272905F;
        if (i != 2 && i != 1) {
            C98452d.f288772b = false;
            Log.m105924i("MicroMsg.CameraContainerProcess", "scene " + this.f287118d.f272905F + " not use DaemonRecorder");
            return false;
        } else if (getEncodeConfig().mo128057c() == 1) {
            return false;
        } else {
            C32354a aVar = this.f287121g;
            aVar.getClass();
            Log.m105924i("MicroMsg.DaemonChecker", "info: enable:[" + aVar.f85861b + "] ramConfig:[" + aVar.f85862c + "] blackModelList:[" + aVar.f85863d + ']');
            if (aVar.f85861b && aVar.mo58581a()) {
                z = true;
            }
            Log.m105924i("MicroMsg.CameraContainerProcess", "useDaemonRecorder " + z);
            C98452d.f288772b = z;
            return z;
        }
    }
}
