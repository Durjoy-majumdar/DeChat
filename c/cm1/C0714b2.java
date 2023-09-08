package cm1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gy3.C87412m;
import p749xh.C102666r2;
import te3.C51682vd1;
import te3.C64726td1;
import tf1.C13914m;

/* renamed from: cm1.b2 */
public final class C0714b2 extends BaseFinderFeed {

    /* renamed from: d */
    public final FinderItem f1711d;

    /* renamed from: e */
    public final C64726td1 f1712e;

    /* renamed from: f */
    public final C51682vd1 f1713f;

    /* renamed from: g */
    public int f1714g;

    /* renamed from: h */
    public boolean f1715h;

    /* renamed from: i */
    public C102666r2 f1716i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0714b2(FinderItem finderItem) {
        super(finderItem);
        C87412m.m108594g(finderItem, "qqMusicItem");
        this.f1711d = finderItem;
        FinderObjectDesc finderObjectDesc = finderItem.getFinderObject().objectDesc;
        this.f1712e = finderObjectDesc != null ? finderObjectDesc.musicInfo : null;
        this.f1713f = finderItem.getFinderObject().music_realtime_info;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0714b2.class.getName().hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C0714b2 b2Var = mVar instanceof C0714b2 ? (C0714b2) mVar : null;
        if (b2Var != null) {
            if (b2Var.f1711d.getFeedObject().f164794id != 0 && this.f1711d.getFeedObject().f164794id != 0 && b2Var.f1711d.getFeedObject().f164794id == this.f1711d.getFeedObject().f164794id) {
                return 0;
            }
            if (this.f1711d.getCreateTime() > b2Var.f1711d.getCreateTime()) {
                return 1;
            }
        }
        return -1;
    }

    public long getItemId() {
        return this.f1711d.getId();
    }
}
