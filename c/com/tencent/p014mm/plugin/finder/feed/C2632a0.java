package com.tencent.p014mm.plugin.finder.feed;

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

/* renamed from: com.tencent.mm.plugin.finder.feed.a0 */
public final class C2632a0 extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f13470d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2632a0(BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f13470d = baseFinderFeed;
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
        C64273c21 liveInfo = this.f13470d.mo3513o().getLiveInfo();
        if (liveInfo != null) {
            l = Long.valueOf(liveInfo.f182392d);
        }
        aVar.mo11230a(String.valueOf(l), String.valueOf(this.f13470d.mo3513o().getFeedObject().f164794id), this.f13470d.mo3513o().getFeedObject().username, "1", "1", "1", jSONObject, this.f13470d.mo3526z());
        return C13598b0.f38549a;
    }
}
