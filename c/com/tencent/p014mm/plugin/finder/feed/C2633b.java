package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import dp1.C7435f2;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.finder.feed.b */
public final class C2633b extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f13471a;

    /* renamed from: b */
    public final /* synthetic */ int f13472b;

    public C2633b(FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter, int i) {
        this.f13471a = finderCampaignFeedUIContract$TopicFeedPresenter;
        this.f13472b = i;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            List<E> g3 = this.f13471a.f30443e.mo11505g3(BaseFinderFeed.class);
            int i = this.f13472b;
            if (i >= 0) {
                ArrayList arrayList = (ArrayList) g3;
                if (i < arrayList.size()) {
                    FinderItem o = ((BaseFinderFeed) arrayList.get(this.f13472b)).mo3513o();
                    MMActivity mMActivity = this.f13471a.f30442d;
                    long id = o.getId();
                    this.f13471a.getClass();
                    String str = this.f13471a.f13017i;
                    C87412m.m108594g(mMActivity, "context");
                    C87412m.m108594g(str, "topicName");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("feedid", C61926c.m72691p(id));
                        jSONObject.put("topicid", C61926c.m72691p(0));
                        jSONObject.put("topicname", str);
                    } catch (JSONException unused) {
                    }
                    C7435f2 f2Var = C7435f2.f25626a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
                    f2Var.mo8577a(f != null ? f.mo12861q3() : null, "video_card", 0, jSONObject);
                }
            }
        }
    }
}
