package ve1;

import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ve1.e2 */
public final class C14501e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullLiveConvert f40196d;

    /* renamed from: e */
    public final /* synthetic */ long f40197e;

    public C14501e2(FinderFeedFullLiveConvert finderFeedFullLiveConvert, long j) {
        this.f40196d = finderFeedFullLiveConvert;
        this.f40197e = j;
    }

    public final void run() {
        String str = this.f40196d.f12780N;
        Log.m105920e(str, "deleteLiveFeed send FeedDeleteEvent feedId: " + this.f40197e);
        FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
        feedDeleteEvent.f9154d.f9155a = this.f40197e;
        feedDeleteEvent.publish();
    }
}
