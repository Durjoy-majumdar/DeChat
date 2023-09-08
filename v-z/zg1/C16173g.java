package zg1;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import ok1.C62042e;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.g */
public final class C16173g extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16173g(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Context context;
        C87412m.m108594g(linkedList, "msgList");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_LIKE_ENTER_APPLAUD, (Bundle) null, 2, (Object) null);
        }
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo87027N0()) {
            finderLiveService.getClass();
            C56032b bVar2 = FinderLiveService.f159379g;
            if (bVar2 != null && (context = bVar2.getContext()) != null) {
                eVar.mo86990A1(context);
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20041};
    }
}
