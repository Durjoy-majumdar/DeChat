package xm1;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import cm1.C55012e1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Set;
import jq3.C9493c;
import jq3.C9494d;
import ln1.C10583e;
import te3.C51449tu2;

/* renamed from: xm1.d */
public final class C15826d {

    /* renamed from: a */
    public static final C15826d f42633a = new C15826d();

    /* renamed from: b */
    public static boolean f42634b;

    /* renamed from: a */
    public final void mo14505a(Context context, Set<C9494d<C9493c>> set) {
        int i;
        Object tag;
        Object tag2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(set, "recordsSet");
        if (!f42634b) {
            LinkedList linkedList = new LinkedList();
            for (C9494d dVar : set) {
                if (dVar.f29663a instanceof BaseFinderFeed) {
                    C51449tu2 tu22 = new C51449tu2();
                    T t = dVar.f29663a;
                    C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) t;
                    tu22.f142417d = baseFinderFeed.getItemId();
                    C55012e1.f154468d.mo76062f(tu22, ((MMFinderUI) context).mo2194I7(), -1);
                    tu22.f142422i = (int) dVar.f29666d;
                    tu22.f142423j = dVar.f29667e;
                    tu22.f142421h = baseFinderFeed.mo3526z();
                    View view = dVar.f29668f;
                    boolean z = false;
                    if (view == null || (tag2 = view.getTag(C0966R.C0970id.ha_)) == null) {
                        Integer num = 0;
                        i = num.intValue();
                    } else {
                        long longValue = tag2 instanceof Long ? ((Number) tag2).longValue() : 0;
                        i = Integer.valueOf(longValue != 0 ? (int) (SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                    }
                    tu22.f142424n = i;
                    View view2 = dVar.f29668f;
                    if (view2 != null) {
                        view2.setTag(C0966R.C0970id.ha_, 0L);
                    }
                    View view3 = dVar.f29668f;
                    if (!(view3 == null || (tag = view3.getTag(C0966R.C0970id.had)) == null)) {
                        z = Boolean.valueOf(((Boolean) tag).booleanValue()).booleanValue();
                    }
                    tu22.f142425o = z;
                    linkedList.add(tu22);
                    Log.m105924i("Finder.FinderMarkReadUtils", "onExposeTimeRecorded pos:" + dVar.f29667e + " feedId: " + baseFinderFeed.mo3513o().getFeedObject().f164794id + " auto_play_time_ms:" + tu22.f142424n + " auto_play_with_sound:" + tu22.f142425o + " exposeTime:" + dVar.f29666d + " nick:" + baseFinderFeed.mo3513o().getFeedObject().nickname);
                }
            }
            C10583e.f31911a.mo10839g(((MMFinderUI) context).mo2194I7(), linkedList);
            C55012e1.f154468d.mo76060d(linkedList);
        }
    }
}
