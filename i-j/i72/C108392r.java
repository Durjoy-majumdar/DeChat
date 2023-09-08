package i72;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVExporter;

/* renamed from: i72.r */
public class C108392r {

    /* renamed from: a */
    public int f324551a;

    /* renamed from: b */
    public VideoTransPara f324552b;

    /* renamed from: c */
    public int f324553c;

    /* renamed from: d */
    public int f324554d;

    /* renamed from: e */
    public boolean f324555e;

    /* renamed from: f */
    public boolean f324556f;

    /* renamed from: g */
    public int f324557g;

    /* renamed from: h */
    public boolean f324558h;

    /* renamed from: i */
    public boolean f324559i;

    public C108392r() {
        this.f324551a = 2;
        this.f324553c = -1;
        this.f324555e = false;
        this.f324556f = false;
        this.f324557g = -1;
        this.f324558h = true;
        this.f324559i = false;
    }

    /* renamed from: a */
    public static C108392r m146847a(int i, VideoTransPara videoTransPara) {
        C108392r rVar;
        switch (i) {
            case 1:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig1");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = false;
                break;
            case 2:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig2");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = false;
                rVar.mo158926c();
                rVar.mo158927d(TAVExporter.VIDEO_EXPORT_WIDTH);
                break;
            case 3:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig3");
                rVar = new C108392r(1, videoTransPara);
                rVar.f324556f = false;
                break;
            case 4:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig4");
                rVar = new C108392r(1, videoTransPara);
                rVar.f324556f = false;
                rVar.mo158926c();
                rVar.mo158927d(TAVExporter.VIDEO_EXPORT_WIDTH);
                break;
            case 5:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig5");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = true;
                rVar.f324555e = false;
                rVar.mo158927d(TAVExporter.VIDEO_EXPORT_WIDTH);
                break;
            case 6:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig6");
                rVar = new C108392r(1, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158927d(TAVExporter.VIDEO_EXPORT_WIDTH);
                break;
            case 7:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig7");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158925b();
                rVar.f324555e = false;
                break;
            case 8:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig8");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158925b();
                rVar.f324555e = true;
                break;
            case 9:
                rVar = new C108392r(1, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158925b();
                rVar.f324555e = false;
                break;
            case 10:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                rVar = new C108392r(1, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158925b();
                rVar.f324555e = true;
                break;
            case 11:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = true;
                rVar.mo158925b();
                rVar.f324555e = false;
                rVar.mo158926c();
                break;
            case 12:
                Log.m105924i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                rVar = new C108392r(2, videoTransPara);
                rVar.f324556f = true;
                rVar.f324557g = 1080;
                rVar.f324555e = false;
                rVar.mo158926c();
                break;
            default:
                return null;
        }
        rVar.f324553c = i;
        return rVar;
    }

    /* renamed from: b */
    public C108392r mo158925b() {
        this.f324557g = this.f324552b.f267166d * 2;
        return this;
    }

    /* renamed from: c */
    public C108392r mo158926c() {
        this.f324554d = this.f324552b.f267169g * 2;
        this.f324559i = true;
        return this;
    }

    /* renamed from: d */
    public C108392r mo158927d(int i) {
        this.f324557g = i;
        return this;
    }

    public String toString() {
        return String.format("mediatype %s videoBitrate : %s isEnableLandscapeMode %s needRotateEachFrame %s isNeedRealtimeScale %s resolutionLimit %s videoParams %s", new Object[]{Integer.valueOf(this.f324551a), Integer.valueOf(this.f324554d), Boolean.FALSE, Boolean.valueOf(this.f324555e), Boolean.valueOf(this.f324556f), Integer.valueOf(this.f324557g), this.f324552b});
    }

    public C108392r(int i, VideoTransPara videoTransPara) {
        this.f324553c = -1;
        this.f324555e = false;
        this.f324556f = false;
        this.f324557g = -1;
        this.f324558h = true;
        this.f324559i = false;
        this.f324552b = videoTransPara;
        this.f324551a = i;
        this.f324554d = videoTransPara.f267169g;
        this.f324557g = videoTransPara.f267166d;
    }
}
