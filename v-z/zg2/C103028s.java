package zg2;

import ah2.C92000a;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ei2.C97652g;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C98464o;
import rx3.C13598b0;
import th2.C64938e;

/* renamed from: zg2.s */
public final class C103028s extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VideoMixer f304007d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103028s(boolean z, VideoMixer videoMixer) {
        super(1);
        this.f304007d = videoMixer;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.Media.VideoMixer", "remux failed, ret path is null");
            C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar = this.f304007d.f272851b;
            if (rVar != null) {
                rVar.mo162I("", "", Boolean.FALSE, -1);
            }
        } else {
            C92000a aVar = this.f304007d.f272850a;
            aVar.getClass();
            C87412m.m108594g(str, "<set-?>");
            aVar.f263374e = str;
            C97652g gVar = this.f304007d.f272854e;
            if (gVar != null) {
                gVar.mo136911d();
                try {
                    C98464o.C98465a a = C98464o.f288797a.mo137832a(this.f304007d.f272850a.f263374e);
                    if (a != null) {
                        C64938e.f186988a.mo89090a(this.f304007d.f272855f.f287132h, a.f288802e, a.f288803f);
                    }
                } catch (Exception unused) {
                }
                String b = VideoMixer.m119411b(this.f304007d);
                if (Util.isNullOrNil(b)) {
                    Log.m105924i("MicroMsg.Media.VideoMixer", "mix create thumb failed");
                    VideoMixer videoMixer = this.f304007d;
                    C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar2 = videoMixer.f272851b;
                    if (rVar2 != null) {
                        rVar2.mo162I(videoMixer.f272850a.f263374e, "", Boolean.FALSE, -1);
                    }
                } else {
                    Log.m105924i("MicroMsg.Media.VideoMixer", "mix create thumb succ");
                    VideoMixer videoMixer2 = this.f304007d;
                    C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar3 = videoMixer2.f272851b;
                    if (rVar3 != null) {
                        String str2 = videoMixer2.f272850a.f263374e;
                        C87412m.m108591d(b);
                        rVar3.mo162I(str2, b, Boolean.TRUE, -1);
                    }
                }
            } else {
                C87412m.m108603p("frameRetriever");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
