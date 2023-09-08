package com.tencent.plugin.finder.detector.api.detect;

import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fs3.C59314b;
import fs3.C59316c;
import fs3.C59318d;
import gs3.C59697b;
import gy3.C87412m;
import hs3.C60149a;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lfs3/d;", "T", "Lcom/tencent/plugin/finder/detector/api/detect/BaseEventDetector;", "<init>", "()V", "plugin-finder-detector_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public abstract class FinderEventDetector<T extends C59318d> extends BaseEventDetector<T> {
    /* renamed from: o */
    public Object mo82664o(C60149a aVar, Map.Entry<String, C59316c<T>> entry, C15601d<? super C13598b0> dVar) {
        C59314b eventDetectorAdapter;
        C59316c value = entry.getValue();
        if (!(value == null || (eventDetectorAdapter = ((C59318d) value.f169613a).getEventDetectorAdapter()) == null)) {
            String j = mo76383j(value, aVar);
            C87412m.m108594g(j, "leakMsg");
            eventDetectorAdapter.f169607c = j;
            eventDetectorAdapter.f169608d = System.currentTimeMillis();
        }
        if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.DEBUG) {
            return C13598b0.f38549a;
        }
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C59697b(aVar, entry, (C15601d<? super C59697b>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* renamed from: p */
    public final boolean mo82665p(View view) {
        if (view != null) {
            String str = this.f165801e;
            Log.m105924i(str, "isFloatMode view: " + view + " it.rootView = " + view.getRootView() + " layoutParams: " + view.getRootView().getLayoutParams());
            ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                String str2 = this.f165801e;
                Log.m105924i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown());
                if (layoutParams2.type > 99) {
                    return true;
                }
            }
        }
        return false;
    }
}
