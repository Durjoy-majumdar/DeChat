package mf1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import je1.C9385w3;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;

/* renamed from: mf1.d */
public final class C10808d implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C9385w3 f32299d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f32300e;

    /* renamed from: f */
    public final /* synthetic */ long f32301f;

    /* renamed from: g */
    public final /* synthetic */ Context f32302g;

    public C10808d(C9385w3 w3Var, BaseFinderFeed baseFinderFeed, long j, Context context) {
        this.f32299d = w3Var;
        this.f32300e = baseFinderFeed;
        this.f32301f = j;
        this.f32302g = context;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C9385w3) {
            C89137b0 d = C86709a0.m107524d();
            this.f32299d.getClass();
            d.mo123470p(5909, this);
            if (i == 0 && i2 == 0) {
                ActivityFeedRemoveEvent activityFeedRemoveEvent = new ActivityFeedRemoveEvent();
                activityFeedRemoveEvent.f9022d.f9023a = this.f32300e.mo3513o().getId();
                activityFeedRemoveEvent.f9022d.f9024b = this.f32300e.mo3513o().getLocalId();
                activityFeedRemoveEvent.f9022d.f9025c = this.f32301f;
                activityFeedRemoveEvent.publish();
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                BaseFinderFeed baseFinderFeed = this.f32300e;
                feedUpdateEvent.f9173d.f9174a = baseFinderFeed.mo3513o().getId();
                FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                aVar.f9177d = 1;
                aVar.f9175b = 12;
                feedUpdateEvent.publish();
                Log.m105924i("Finder.ActivityFeedHandler", "NetSceneFinderModEvent onSceneEnd publish ActivityFeedRemoveEvent:" + activityFeedRemoveEvent);
                return;
            }
            C76912y0.makeText(this.f32302g, (int) C0966R.string.czg, 0).show();
        }
    }
}
