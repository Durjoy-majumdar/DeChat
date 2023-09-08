package com.tencent.p014mm.plugin.finder.feed.p052ui;

import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import gy3.C8480h;
import kotlin.Metadata;
import pe3.C89349b;
import te3.C49203dy1;
import te3.C49712hj1;
import te3.C50159kp0;
import te3.db4;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$feedLoader$2$1", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 */
public final class FinderAlbumTimelineUI$feedLoader$2$1 extends FinderFeedRelTimelineLoader {
    public FinderAlbumTimelineUI$feedLoader$2$1(int i, C49203dy1 dy12, C89349b bVar, db4 db4, C49712hj1 hj12) {
        super(0, (String) null, 0, (String) null, 0, false, (C89349b) null, dy12, bVar, db4, i, (C50159kp0) null, hj12, 0.0f, 0.0f, 26751, (C8480h) null);
    }

    public C13911k createDataFetch() {
        return new FinderFeedRelTimelineLoader.C2665c();
    }
}
