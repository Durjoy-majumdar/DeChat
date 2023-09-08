package fq1;

import c30.C79922d;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fq1.a */
public final class C59269a extends C87413o implements C32226l<C79922d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f169475d;

    /* renamed from: e */
    public final /* synthetic */ VideoTransPara f169476e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59269a(int i, VideoTransPara videoTransPara) {
        super(1);
        this.f169475d = i;
        this.f169476e = videoTransPara;
    }

    public Object invoke(Object obj) {
        C79922d dVar = (C79922d) obj;
        C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
        if (dVar.f234147a.optInt("count", -1) == this.f169475d) {
            int optInt = dVar.f234147a.optInt("width", 0);
            int optInt2 = dVar.f234147a.optInt("height", 0);
            int optInt3 = dVar.f234147a.optInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS, 0);
            if (optInt > 0 && optInt2 > 0 && optInt3 > 0) {
                Log.m105924i("Finder.FinderVideoEditorConfig", "change width:" + optInt + " height:" + optInt2 + " fps:" + optInt3);
                VideoTransPara videoTransPara = this.f169476e;
                videoTransPara.f267166d = optInt;
                videoTransPara.f267167e = optInt2;
                videoTransPara.f267168f = optInt3;
            }
        }
        return C13598b0.f38549a;
    }
}
