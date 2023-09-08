package com.tencent.p014mm.plugin.finder.convert;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import dg1.C58263a;
import go1.C8368c;
import gy3.C87412m;
import java.util.Iterator;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$uiLifecycleObserver$1", "Ldg1/a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1 */
public final class FinderFeedFullConvert$uiLifecycleObserver$1 implements C58263a {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullConvert<T> f12770d;

    public FinderFeedFullConvert$uiLifecycleObserver$1(FinderFeedFullConvert<T> finderFeedFullConvert) {
        this.f12770d = finderFeedFullConvert;
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        Iterator<FinderFeedFullConvert.StateListener<T>> it = this.f12770d.f12571o.iterator();
        while (it.hasNext()) {
            FinderFeedFullConvert.StateListener next = it.next();
            C8368c cVar = C8368c.f27352a;
            C60905o oVar = next.f12584e;
            C87412m.m108594g(oVar, "holder");
            int hashCode = oVar.hashCode();
            C8368c.f27353b.remove(Integer.valueOf(hashCode));
            C8368c.f27354c.remove(Integer.valueOf(hashCode));
            next.dead();
        }
        this.f12770d.f12571o.clear();
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }
}
