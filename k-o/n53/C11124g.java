package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C87412m;
import m53.C10765k;
import te3.f35;
import te3.g35;

/* renamed from: n53.g */
public final class C11124g extends C11131n<g35> {
    public C11124g(String str, String str2, int i) {
        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(str2, "requestID");
        f35 f35 = new f35();
        f35.f133275e = str;
        f35.f133274d = str2;
        f35.f133276f = i;
        f35.f133277g = C10765k.f32240b;
        mo11234k(f35, new g35(), 6280, "/cgi-bin/micromsg-bin/wecoinrealnameauth");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiGetRealNameAuthRequest: ");
    }
}
