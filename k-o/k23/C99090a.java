package k23;

import android.content.Context;
import android.graphics.Point;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96556t0;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f72.C97842b;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h23.C108038q;
import hi2.C98453h;
import rx3.C13598b0;
import te3.C101773e70;
import te3.C101781gb0;

/* renamed from: k23.a */
public final class C99090a {

    /* renamed from: a */
    public final Context f290546a;

    /* renamed from: b */
    public final C96557v0 f290547b;

    /* renamed from: c */
    public final RecordConfigProvider f290548c;

    /* renamed from: d */
    public C60964e f290549d = new C60964e();

    /* renamed from: e */
    public C108038q f290550e;

    /* renamed from: f */
    public final C96556t0 f290551f;

    /* renamed from: g */
    public C32228q<? super Boolean, ? super Integer, ? super C99091a, C13598b0> f290552g;

    /* renamed from: h */
    public final C32229r<String, String, Boolean, Integer, C13598b0> f290553h;

    /* renamed from: k23.a$a */
    public static final class C99091a {

        /* renamed from: a */
        public String f290554a;

        /* renamed from: b */
        public String f290555b;

        public C99091a(String str, String str2) {
            C87412m.m108594g(str, "videoPath");
            C87412m.m108594g(str2, "thumbPath");
            this.f290554a = str;
            this.f290555b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C99091a)) {
                return false;
            }
            C99091a aVar = (C99091a) obj;
            return C87412m.m108589b(this.f290554a, aVar.f290554a) && C87412m.m108589b(this.f290555b, aVar.f290555b);
        }

        public int hashCode() {
            return (this.f290554a.hashCode() * 31) + this.f290555b.hashCode();
        }

        public String toString() {
            return "VLogOutputInfo(videoPath=" + this.f290554a + ", thumbPath=" + this.f290555b + ')';
        }
    }

    /* renamed from: k23.a$b */
    public static final class C99092b extends C87413o implements C32229r<String, String, Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99090a f290556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99092b(C99090a aVar) {
            super(4);
            this.f290556d = aVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            int intValue = ((Number) obj4).intValue();
            C87412m.m108594g(str, "mixVideo");
            C87412m.m108594g(str2, "mixThumb");
            Log.m105924i("MicroMsg.VLogGenerateManager", "onMuxEnd success:" + booleanValue + "  errorCode:" + intValue);
            C32228q<? super Boolean, ? super Integer, ? super C99091a, C13598b0> qVar = this.f290556d.f290552g;
            if (qVar != null) {
                C13598b0 invoke = qVar.invoke(Boolean.valueOf(booleanValue), Integer.valueOf(intValue), new C99091a(str, str2));
            }
            return C13598b0.f38549a;
        }
    }

    public C99090a(Context context, C96557v0 v0Var, RecordConfigProvider recordConfigProvider, boolean z, AudioCacheInfo audioCacheInfo) {
        C96557v0 v0Var2 = v0Var;
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        boolean z2 = z;
        AudioCacheInfo audioCacheInfo2 = audioCacheInfo;
        C87412m.m108594g(v0Var2, "model");
        C87412m.m108594g(recordConfigProvider2, "configProvider");
        this.f290546a = context;
        this.f290547b = v0Var2;
        this.f290548c = recordConfigProvider2;
        C96556t0 t0Var = new C96556t0(0, 0, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 2047, (C8480h) null);
        this.f290551f = t0Var;
        this.f290553h = new C99092b(this);
        int a = C97842b.m126284a(recordConfigProvider2.f272926n.f267166d);
        Point h = C85875k4.m106184h(MMApplicationContext.getContext());
        int a2 = recordConfigProvider2.f272905F == 11 ? C97842b.m126284a(recordConfigProvider2.f272926n.f267167e) : C97842b.m126284a((h.y * a) / h.x);
        Log.m105924i("MicroMsg.VLogGenerateManager", "targetWidth:" + a + " targetHeight:" + a2 + ", videoParam:" + recordConfigProvider2.f272926n);
        C98453h.f288774a.mo137806d(recordConfigProvider2);
        StringBuilder sb = new StringBuilder();
        sb.append("output path:");
        sb.append(recordConfigProvider2.f272901B);
        Log.m105924i("MicroMsg.VLogGenerateManager", sb.toString());
        int i = z2 ? audioCacheInfo2 == null ? 0 : 2 : audioCacheInfo2 == null ? 1 : 3;
        Log.m105924i("MicroMsg.VLogGenerateManager", "audioMixType:" + i + ", muteOrigin:" + z2 + ", audioInfo:" + audioCacheInfo2);
        long j = 0;
        for (C96533c0 c0Var : v0Var2.f282612b) {
            long j2 = c0Var.f282490b;
            if (j2 > j) {
                j = j2;
            }
        }
        Log.m105924i("MicroMsg.VLogGenerateManager", "parse config duration : " + j);
        t0Var.f282600a = (int) j;
        t0Var.f282601b = i;
        String str = this.f290548c.f272901B;
        C87412m.m108593f(str, "configProvider.outputVideoPath");
        t0Var.f282602c = str;
        t0Var.f282603d = a;
        t0Var.f282604e = a2;
        VideoTransPara videoTransPara = this.f290548c.f272926n;
        t0Var.f282605f = videoTransPara.f267169g;
        t0Var.f282606g = videoTransPara.f267173n;
        t0Var.f282607h = videoTransPara.f267168f;
        t0Var.f282609j = videoTransPara.f267174o;
        t0Var.f282610k = videoTransPara.f267175p;
        Log.m105924i("MicroMsg.VLogGenerateManager", "vLogGenerateModel is :" + this.f290551f);
        this.f290550e = new C108038q(this.f290547b, this.f290551f);
    }

    /* renamed from: a */
    public static final void m129047a(C99090a aVar, C101773e70 e702, VideoMixer.MixConfig mixConfig, C101781gb0 gb02) {
        aVar.getClass();
        CaptureDataManager.f272890c.f272892b.putBoolean("key_bg_generate", true);
        CaptureDataManager.f272890c.f272892b.putByteArray("key_bg_generate_extra_config", gb02.toByteArray());
        CaptureDataManager.f272890c.f272892b.putParcelable("key_bg_generate_mix_config", mixConfig);
        CaptureDataManager.f272890c.f272892b.putByteArray("key_bg_generate_pb", e702.toByteArray());
        CaptureDataManager captureDataManager = CaptureDataManager.f272890c;
        Context context = aVar.f290546a;
        Boolean bool = Boolean.FALSE;
        captureDataManager.mo129794a(context, new CaptureDataManager.CaptureVideoNormalModel(bool, "", "", 0L, bool, (RecordMediaReportInfo) null));
    }
}
