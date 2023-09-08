package p690sw;

import android.app.Activity;
import p210o.C11323a;

/* renamed from: sw.e$$a */
public final /* synthetic */ class e$$a implements C11323a {
    public final Object apply(Object obj) {
        Class<?> cls = ((Activity) obj).getClass();
        if (cls.getName().equals("com.tencent.mm.plugin.finder.ui.FinderHomeUI") || cls.getName().equals("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI")) {
            return "Finder";
        }
        if (cls.getName().equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI")) {
            return "FinderLive";
        }
        if (cls.getName().equals("com.tencent.mm.plugin.finder.nearby.NearbyUI")) {
            return "FinderNearby";
        }
        if (cls.getName().equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI")) {
            return "FinderLiveAnchor";
        }
        return null;
    }
}
