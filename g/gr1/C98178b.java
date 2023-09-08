package gr1;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f72.C97842b;
import fh2.C97877b;
import fh2.C97884j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98323a;
import hd0.C98398h0;
import hi2.C98452d;
import hi2.C98453h;
import ht1.C60206u1;
import i72.C108388k;
import i72.C108392r;
import rx3.C13598b0;
import s80.C110777a;
import sh2.C110789b;
import sh2.C110790c;

/* renamed from: gr1.b */
public final class C98178b extends C97877b {

    /* renamed from: o */
    public final String f287845o = "Finder.FinderCameraContainerProcess";

    /* renamed from: gr1.b$a */
    public static final class C98179a implements C98323a {

        /* renamed from: a */
        public final /* synthetic */ C98178b f287846a;

        public C98179a(C98178b bVar) {
            this.f287846a = bVar;
        }

        /* renamed from: b */
        public String mo128056b() {
            return "";
        }

        /* renamed from: c */
        public int mo128057c() {
            int i = 1;
            if (MultiProcessMMKV.getSingleDefault().getBoolean("mediacodec_create_error", false)) {
                return 1;
            }
            if (!C97884j.f287168e) {
                return this.f287846a.f287118d.f272922g;
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
            C98453h hVar = C98453h.f288774a;
            String Ax0 = C98398h0.wx0().Ax0();
            C87412m.m108593f(Ax0, "getCore().subVideoPath");
            if (!C86013q1.m106450k(Ax0)) {
                String Ax02 = C98398h0.wx0().Ax0();
                C87412m.m108593f(Ax02, "getCore().subVideoPath");
                C86013q1.m106461v(Ax02);
            }
            return C98398h0.wx0().Ax0() + XVFSFile.SEPARATOR_CHAR + System.currentTimeMillis();
        }
    }

    /* renamed from: gr1.b$b */
    public static final class C98180b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98178b f287847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98180b(C98178b bVar) {
            super(2);
            this.f287847d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C110789b bVar = this.f287847d.f287125n;
            if (bVar != null) {
                bVar.mo162347v(intValue, intValue2);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98178b(RecordConfigProvider recordConfigProvider, CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView) {
        super(recordConfigProvider, cameraPreviewGLSurfaceView);
        Class cls = C60206u1.class;
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C87412m.m108594g(cameraPreviewGLSurfaceView, "previewPlugin");
        if (((C60206u1) C86312j.m106911c(cls)).I70()) {
            super.getVideoTransPara().f267169g = ((C60206u1) C86312j.m106911c(cls)).mo60948Lk();
        }
    }

    public C98323a getEncodeConfig() {
        return new C98179a(this);
    }

    public C110777a getPreviewRenderer() {
        XEffectConfig xEffectConfig = this.f287118d.f272915Q;
        if ((xEffectConfig.f318441e || xEffectConfig.f318442f) && this.f287124j == null) {
            this.f287124j = new C110790c(6);
            this.f287125n = new C110789b();
            C110790c cVar = this.f287124j;
            if (cVar != null) {
                cVar.f331430y = new C98180b(this);
            }
        }
        return super.getPreviewRenderer();
    }

    public int getResolutionLimit() {
        return 2500;
    }

    public VideoTransPara getVideoTransPara() {
        VideoTransPara videoTransPara = super.getVideoTransPara();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_record_max_size, 1920);
        if (videoTransPara.f267166d > Qe || videoTransPara.f267167e > Qe) {
            String str = this.f287845o;
            Log.m105924i(str, "getVideoTransPara, size to large, originWidth:" + videoTransPara.f267166d + ", originHeight:" + videoTransPara.f267167e + ", maxSize:" + Qe);
            int i = videoTransPara.f267167e;
            int i2 = videoTransPara.f267166d;
            float f = ((float) i) / ((float) i2);
            if (i2 > i) {
                videoTransPara.f267167e = (int) (((float) Qe) * f);
                videoTransPara.f267166d = Qe;
            } else {
                videoTransPara.f267166d = (int) (((float) Qe) / f);
                videoTransPara.f267167e = Qe;
            }
            videoTransPara.f267166d = C97842b.m126284a(videoTransPara.f267166d);
            videoTransPara.f267167e = C97842b.m126284a(videoTransPara.f267167e);
            String str2 = this.f287845o;
            Log.m105924i(str2, "getVideoTransPara, do size crop, width:" + videoTransPara.f267166d + ", height:" + videoTransPara.f267167e + ", maxSize:" + Qe);
        }
        return videoTransPara;
    }

    /* renamed from: v */
    public boolean mo128038v() {
        Class cls = C60206u1.class;
        boolean z = false;
        if (mo128017d()) {
            Log.m105924i(this.f287845o, "useDaemonRecorder useCpuCrop false");
            C98452d.f288772b = false;
            return false;
        }
        if (((C60206u1) C86312j.m106911c(cls)).I70() && this.f287121g.mo58581a()) {
            z = true;
        }
        String str = this.f287845o;
        Log.m105924i(str, "useDaemonRecorder useDaemonRecorder:" + z + ", FinderConfig.USE_DAEMON_RECORD:" + ((C60206u1) C86312j.m106911c(cls)).I70());
        C98452d.f288772b = z;
        return z;
    }
}
