package com.tencent.p014mm.plugin.finder.p056ui;

import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderShareGuideShowEvent;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60905o;
import kotlin.Metadata;
import qt1.C12931a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/ShareRelPresenter$buildItemCoverts$1$addListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderShareGuideShowEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1$addListener$1 */
public final class ShareRelPresenter$buildItemCoverts$1$addListener$1 extends IListener<FinderShareGuideShowEvent> {

    /* renamed from: d */
    public final /* synthetic */ int f17228d;

    /* renamed from: e */
    public final /* synthetic */ ShareRelPresenter f17229e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f17230f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareRelPresenter$buildItemCoverts$1$addListener$1(int i, ShareRelPresenter shareRelPresenter, C60905o oVar, C40008f fVar) {
        super(fVar);
        this.f17228d = i;
        this.f17229e = shareRelPresenter;
        this.f17230f = oVar;
    }

    public boolean callback(IEvent iEvent) {
        FinderShareGuideShowEvent finderShareGuideShowEvent = (FinderShareGuideShowEvent) iEvent;
        C87412m.m108594g(finderShareGuideShowEvent, "event");
        FinderShareGuideShowEvent.C1062a aVar = finderShareGuideShowEvent.f9248d;
        if (aVar != null) {
            int i = this.f17228d;
            ShareRelPresenter shareRelPresenter = this.f17229e;
            C60905o oVar = this.f17230f;
            if (i == aVar.f9249a) {
                String str = shareRelPresenter.f17207L;
                Log.m105924i(str, "type:" + aVar.f9250b + " position:" + aVar.f9249a);
                FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
                if (aVar.f9250b == 1) {
                    if (finderVideoLayout != null) {
                        int i2 = FinderVideoLayout.f161844x0;
                        finderVideoLayout.mo79540B(false);
                    }
                    FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.e7f);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                } else {
                    if (finderVideoLayout != null) {
                        FinderVideoLayout.m65078D(finderVideoLayout, 0, (C12931a) null, 3, (Object) null);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) oVar.mo85812D(C0966R.C0970id.e7f);
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                }
            }
        }
        return true;
    }
}
