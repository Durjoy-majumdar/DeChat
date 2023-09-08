package k23;

import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import k23.C99090a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C101773e70;
import te3.C101781gb0;
import te3.mp4;

/* renamed from: k23.b */
public final class C99093b extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99090a f290557d;

    /* renamed from: e */
    public final /* synthetic */ mp4 f290558e;

    /* renamed from: f */
    public final /* synthetic */ C101773e70 f290559f;

    /* renamed from: g */
    public final /* synthetic */ VideoMixer.MixConfig f290560g;

    /* renamed from: h */
    public final /* synthetic */ C101781gb0 f290561h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99093b(C99090a aVar, mp4 mp4, C101773e70 e702, VideoMixer.MixConfig mixConfig, C101781gb0 gb02) {
        super(2);
        this.f290557d = aVar;
        this.f290558e = mp4;
        this.f290559f = e702;
        this.f290560g = mixConfig;
        this.f290561h = gb02;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.VLogGenerateManager", "download music fail :" + str);
            ((C99090a.C99092b) this.f290557d.f290553h).mo162I("", "", Boolean.FALSE, 1);
        } else {
            mp4 mp4 = this.f290558e;
            mp4.f138147d.f131933e.f184941n = str;
            C101773e70 e702 = this.f290559f;
            e702.f298164j = str;
            e702.f298167p = true;
            e702.f298153E = C89349b.m111674a(mp4.toByteArray());
            C99090a.m129047a(this.f290557d, this.f290559f, this.f290560g, this.f290561h);
            ((C99090a.C99092b) this.f290557d.f290553h).mo162I("", "", Boolean.FALSE, 4);
        }
        return C13598b0.f38549a;
    }
}
