package ok1;

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

/* renamed from: ok1.i */
public final class C11460i extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f33698d;

    /* renamed from: e */
    public final /* synthetic */ String f33699e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11460i(BaseFinderFeed baseFinderFeed, String str) {
        super(1);
        this.f33698d = baseFinderFeed;
        this.f33699e = str;
    }

    public Object invoke(Object obj) {
        List<String> list = (List) obj;
        JSONObject jSONObject = new JSONObject();
        String str = "";
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
        C64273c21 liveInfo = this.f33698d.mo3513o().getLiveInfo();
        if (liveInfo != null) {
            l = Long.valueOf(liveInfo.f182392d);
        }
        C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f33698d.mo3513o().getFeedObject().f164794id), this.f33698d.mo3513o().getFeedObject().username, this.f33699e, "1", "1", jSONObject, (String) null, 128, (Object) null);
        return C13598b0.f38549a;
    }
}