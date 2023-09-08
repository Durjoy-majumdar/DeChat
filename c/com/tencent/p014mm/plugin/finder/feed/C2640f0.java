package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import dp1.C7435f2;
import gy3.C87412m;
import java.util.List;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.finder.feed.f0 */
public final class C2640f0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13491a;

    /* renamed from: b */
    public final /* synthetic */ int f13492b;

    public C2640f0(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, int i) {
        this.f13491a = finderTopicFeedUIContract$TopicFeedPresenter;
        this.f13492b = i;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            List<E> listOfType = this.f13491a.f30175e.getListOfType(BaseFinderFeed.class);
            int i = this.f13492b;
            if (i >= 0 && i < listOfType.size()) {
                FinderItem o = ((BaseFinderFeed) listOfType.get(this.f13492b)).mo3513o();
                MMActivity mMActivity = this.f13491a.f30174d;
                long id = o.getId();
                FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f13491a;
                long j3 = finderTopicFeedUIContract$TopicFeedPresenter.f13397j;
                String str = finderTopicFeedUIContract$TopicFeedPresenter.f13398n;
                C87412m.m108594g(mMActivity, "context");
                C87412m.m108594g(str, "topicName");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("feedid", C61926c.m72691p(id));
                    jSONObject.put("topicid", C61926c.m72691p(j3));
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
