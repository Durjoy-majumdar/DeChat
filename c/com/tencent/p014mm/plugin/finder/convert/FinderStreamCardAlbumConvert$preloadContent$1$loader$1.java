package com.tencent.p014mm.plugin.finder.convert;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import gy3.C8480h;
import je1.C46511c0;
import kotlin.Metadata;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49203dy1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50159kp0;
import te3.db4;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$preloadContent$1$loader$1", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1 */
public final class FinderStreamCardAlbumConvert$preloadContent$1$loader$1 extends FinderFeedRelTimelineLoader {

    /* renamed from: w */
    public final /* synthetic */ db4 f158497w;

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1$a */
    public static final class C55690a extends FinderFeedRelTimelineLoader.C2665c {

        /* renamed from: i */
        public final /* synthetic */ FinderStreamCardAlbumConvert$preloadContent$1$loader$1 f158498i;

        /* renamed from: j */
        public final /* synthetic */ db4 f158499j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55690a(FinderStreamCardAlbumConvert$preloadContent$1$loader$1 finderStreamCardAlbumConvert$preloadContent$1$loader$1, db4 db4) {
            super();
            this.f158498i = finderStreamCardAlbumConvert$preloadContent$1$loader$1;
            this.f158499j = db4;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            db4 db4 = this.f158499j;
            C49712hj1 contextObj = this.f158498i.getContextObj();
            C50159kp0 kp02 = this.f158498i.f13549q;
            if (kp02 == null) {
                kp02 = new C50159kp0();
            }
            C46511c0 c0Var = new C46511c0(db4, contextObj, kp02);
            c0Var.f125308x = 0;
            return c0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderStreamCardAlbumConvert$preloadContent$1$loader$1(db4 db4, C49712hj1 hj12) {
        super(0, (String) null, 0, (String) null, 10, false, (C89349b) null, (C49203dy1) null, (C89349b) null, (db4) null, 0, (C50159kp0) null, hj12, 0.0f, 0.0f, 28655, (C8480h) null);
        this.f158497w = db4;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55690a(this, this.f158497w);
    }

    public boolean isObservePostEvent() {
        return false;
    }
}
