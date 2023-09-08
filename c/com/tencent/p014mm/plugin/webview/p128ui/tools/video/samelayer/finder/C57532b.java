package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b */
public final class C57532b extends C87413o implements C32226l<FinderFeedInfoForVideoPlugin, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f164774d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f164775e;

    /* renamed from: f */
    public final /* synthetic */ String f164776f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57532b(C13855j jVar, C13851h1 h1Var, String str) {
        super(1);
        this.f164774d = jVar;
        this.f164775e = h1Var;
        this.f164776f = str;
    }

    public Object invoke(Object obj) {
        FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin = (FinderFeedInfoForVideoPlugin) obj;
        C87412m.m108594g(finderFeedInfoForVideoPlugin, "finderFeedInfo");
        boolean z = true;
        Log.m105925i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo callback result: %s", finderFeedInfoForVideoPlugin);
        if (finderFeedInfoForVideoPlugin.f164761d.length() != 0) {
            z = false;
        }
        if (z) {
            this.f164774d.f39001d.mo10774a(this.f164775e.f38990c, this.f164775e.f38996i + ":fail", (Map<String, Object>) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("localFeedId", this.f164776f);
            hashMap.put("isLike", Boolean.valueOf(finderFeedInfoForVideoPlugin.f164762e));
            hashMap.put("likeCount", Integer.valueOf(finderFeedInfoForVideoPlugin.f164764g));
            hashMap.put("isFav", Boolean.valueOf(finderFeedInfoForVideoPlugin.f164763f));
            hashMap.put("favCount", Integer.valueOf(finderFeedInfoForVideoPlugin.f164765h));
            C13598b0 b0Var = C13598b0.f38549a;
            this.f164774d.f39001d.mo10774a(this.f164775e.f38990c, this.f164775e.f38996i + ":ok", hashMap);
        }
        return C13598b0.f38549a;
    }
}
