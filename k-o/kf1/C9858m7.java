package kf1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import ms3.C11091a;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64273c21;
import z04.C112551y;

/* renamed from: kf1.m7 */
public final class C9858m7 extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f30437d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9858m7(BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f30437d = baseFinderFeed;
    }

    public Object invoke(Object obj) {
        List<String> list = (List) obj;
        if (this.f30437d.mo3513o().isLiveFeed()) {
            String str = "";
            JSONObject jSONObject = new JSONObject();
            if (list != null) {
                for (String str2 : list) {
                    str = str + str2 + ';';
                }
            }
            Long l = null;
            if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                str = str.substring(0, str.length() - 1);
                C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            jSONObject.put("share_username", str);
            C11091a aVar = C11091a.f32868a;
            C64273c21 liveInfo = this.f30437d.mo3513o().getLiveInfo();
            if (liveInfo != null) {
                l = Long.valueOf(liveInfo.f182392d);
            }
            C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f30437d.mo3513o().getFeedObject().f164794id), this.f30437d.mo3513o().getFeedObject().username, "1", "1", "0", jSONObject, (String) null, 128, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
