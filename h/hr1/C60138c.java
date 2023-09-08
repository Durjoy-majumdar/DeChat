package hr1;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import dp1.C58358d0;
import ef1.C58556f;
import ef1.C7644m;
import er1.C58744l;
import gy3.C87412m;
import hr1.C60134a;
import java.util.List;
import jq3.C60905o;
import rs1.C13442s8;

/* renamed from: hr1.c */
public final class C60138c implements FinderRecyclerView.C55692a {

    /* renamed from: a */
    public final /* synthetic */ C60134a f171670a;

    public C60138c(C60134a aVar) {
        this.f171670a = aVar;
    }

    /* renamed from: e */
    public void mo77206e(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C60134a.C60135a aVar = this.f171670a.f171658d;
        if (aVar != null) {
            aVar.mo79665e(recyclerView, i);
        }
    }

    /* renamed from: f */
    public void mo77207f(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C60134a aVar = this.f171670a;
        aVar.getClass();
        Log.m105924i("FinderFeedSelectorAdapter", "handleOnPageSelected position:" + i);
        aVar.f171663i.mo12481a("handleOnPageSelected begin");
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        List data = ((WxRecyclerAdapter) adapter).getData();
        C58744l d = aVar.mo85113d(i, (C60905o) null);
        if (d == null) {
            Log.m105928w("FinderFeedSelectorAdapter", "handleOnPageSelected return for valid feed.");
        } else if (d.f168207e == 9) {
            Log.m105928w("FinderFeedSelectorAdapter", "handleOnPageSelected return for valid feed type:" + d.f168207e + '.');
        } else {
            if (aVar.mo85114e(d, "handleOnPageSelected")) {
                FeedData feedData = d.f168206d;
                if (!(feedData != null && feedData.getMediaType() == 15)) {
                    aVar.mo85115f(recyclerView, d.f168204b);
                }
                C39818r rVar = C39818r.f106831a;
                Context context = recyclerView.getContext();
                C87412m.m108593f(context, "recyclerView.context");
                C58556f j3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12854j3(aVar.f171657c);
                if (j3 != null) {
                    C7644m mVar = new C7644m(1);
                    mVar.f25962c = i;
                    mVar.f25963d = d.f168204b;
                    recyclerView.post(new C60142f(j3, mVar));
                }
            }
            C58744l lVar = aVar.f171660f;
            long j = lVar.f168204b;
            if (j <= 0 || j != d.f168204b) {
                aVar.mo85112c(data, lVar);
                FeedData feedData2 = d.f168206d;
                if (feedData2 != null && feedData2.getMediaType() == 9) {
                    C58358d0.m67593e(C58358d0.f167115a, false, aVar.f171664j, 1, (Object) null);
                }
                aVar.f171664j = false;
                aVar.mo85111b(data, d);
                aVar.f171663i.mo11310b("handleOnPageSelected end");
                return;
            }
            Log.m105928w("FinderFeedSelectorAdapter", "handleOnPageSelected return for selected same feed:" + aVar.f171660f);
        }
    }

    /* renamed from: g */
    public void mo77208g(RecyclerView recyclerView, int i, float f, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
    }
}
