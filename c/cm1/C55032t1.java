package cm1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import java.util.LinkedList;
import sx3.C110818d0;
import tf1.C13914m;

/* renamed from: cm1.t1 */
public final class C55032t1 extends BaseFinderFeed {

    /* renamed from: d */
    public final FinderItem f154491d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55032t1(FinderItem finderItem) {
        super(finderItem);
        C87412m.m108594g(finderItem, "musicItem");
        this.f154491d = finderItem;
        FinderContact finderContact = finderItem.getFeedObject().contact;
        mo3483Q(finderContact != null ? C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null) : null);
    }

    /* renamed from: c */
    public int mo75c() {
        return C55032t1.class.getName().hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C55032t1 t1Var = mVar instanceof C55032t1 ? (C55032t1) mVar : null;
        if (t1Var != null) {
            if (t1Var.f154491d.getFeedObject().f164794id != 0 && this.f154491d.getFeedObject().f164794id != 0 && t1Var.f154491d.getFeedObject().f164794id == this.f154491d.getFeedObject().f164794id) {
                return 0;
            }
            if (t1Var.f154491d.getLocalId() > 0 && this.f154491d.getLocalId() > 0 && t1Var.f154491d.getLocalId() == this.f154491d.getLocalId()) {
                return 0;
            }
            if (this.f154491d.getCreateTime() > t1Var.f154491d.getCreateTime()) {
                return 1;
            }
        }
        return -1;
    }

    public long getItemId() {
        return this.f154491d.getId();
    }

    /* renamed from: p0 */
    public final FinderObject mo76086p0() {
        return this.f154491d.getFeedObject();
    }

    /* renamed from: q0 */
    public final String mo76087q0() {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc = this.f154491d.getFeedObject().objectDesc;
        if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
            return null;
        }
        return finderMedia.url;
    }
}
