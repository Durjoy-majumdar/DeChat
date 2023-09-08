package pr0;

import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import hp3.C87581a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C52020xu;

/* renamed from: pr0.b */
public final class C47519b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Boolean, WxaShortLinkInfo, C13598b0> f127490a;

    public C47519b(C32227p<? super Boolean, ? super WxaShortLinkInfo, C13598b0> pVar) {
        this.f127490a = pVar;
    }

    public Object call(Object obj) {
        C52020xu xuVar = (C52020xu) obj;
        String str = null;
        if (xuVar.BaseResponse.f135955d != 0) {
            Log.m105920e("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig fail. Ret[" + xuVar.BaseResponse.f135955d + "]  ErrMsg[" + xuVar.BaseResponse.f135956e + ']');
            this.f127490a.invoke(Boolean.FALSE, null);
        } else {
            Log.m105924i("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig success.");
            C32227p<Boolean, WxaShortLinkInfo, C13598b0> pVar = this.f127490a;
            Boolean bool = Boolean.TRUE;
            C89349b bVar = xuVar.f144963d;
            String g = bVar != null ? bVar.mo123704g("UTF-8") : null;
            String str2 = g == null ? "" : g;
            C89349b bVar2 = xuVar.f144965f;
            String g2 = bVar2 != null ? bVar2.mo123704g("UTF-8") : null;
            String str3 = g2 == null ? "" : g2;
            C89349b bVar3 = xuVar.f144964e;
            String g3 = bVar3 != null ? bVar3.mo123704g("UTF-8") : null;
            String str4 = g3 == null ? "" : g3;
            int i = xuVar.f144966g;
            int i2 = xuVar.f144967h;
            C89349b bVar4 = xuVar.f144968i;
            if (bVar4 != null) {
                str = bVar4.mo123705h();
            }
            if (str == null) {
                str = "";
            }
            pVar.invoke(bool, new WxaShortLinkInfo(str2, str3, str4, i, i2, str, ""));
        }
        return C13598b0.f38549a;
    }
}
