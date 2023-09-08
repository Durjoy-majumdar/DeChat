package je1;

import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.autogen.events.FinderTimelineRefreshEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import te3.C51446tu;
import wp1.C15585f;

/* renamed from: je1.d */
public final class C9299d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C51446tu> f29073d;

    /* renamed from: e */
    public final /* synthetic */ C9302e f29074e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9299d(List<? extends C51446tu> list, C9302e eVar) {
        super(0);
        this.f29073d = list;
        this.f29074e = eVar;
    }

    public Object invoke() {
        for (C51446tu tuVar : this.f29073d) {
            long j = tuVar.f142408d;
            if (j != 0) {
                C15585f.f42211a.mo14339b(j);
                FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
                feedDeleteEvent.f9154d.f9155a = tuVar.f142408d;
                feedDeleteEvent.publish();
                Log.m105924i("CgiCheckPrefetch", "onCgiEnd: deleteItem by id " + tuVar.f142408d);
            }
        }
        if ((!this.f29073d.isEmpty()) && this.f29073d.size() == this.f29074e.f29081t.size()) {
            Log.m105924i("CgiCheckPrefetch", "onCgiEnd: should trigger refresh, tabType = " + this.f29074e.f29080s);
            FinderTimelineRefreshEvent finderTimelineRefreshEvent = new FinderTimelineRefreshEvent();
            finderTimelineRefreshEvent.f9256d.f9257a = this.f29074e.f29080s;
            finderTimelineRefreshEvent.publish();
        }
        return C13598b0.f38549a;
    }
}
