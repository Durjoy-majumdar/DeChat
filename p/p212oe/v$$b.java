package p212oe;

import android.app.Activity;
import p210o.C11323a;

/* renamed from: oe.v$$b */
public final /* synthetic */ class v$$b implements C11323a {
    public final Object apply(Object obj) {
        String name = ((Activity) obj).getClass().getName();
        if (!name.equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI")) {
            if (!name.equals("com.tencent.mm.plugin.finder.ui.FinderHomeUI")) {
                if (name.equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI")) {
                    return "FinderLiveAnchor";
                }
                if (!name.equals("com.tencent.mm.plugin.finder.nearby.NearbyUI")) {
                    if (!name.equals("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI")) {
                        return null;
                    }
                }
            }
            return "Finder";
        }
        return "FinderLive";
    }
}
