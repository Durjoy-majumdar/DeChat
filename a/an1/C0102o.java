package an1;

import bn1.C0331b;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import te3.C48682a91;
import te3.C48817b71;

/* renamed from: an1.o */
public final class C0102o extends C0331b {

    /* renamed from: h */
    public final List<FinderObject> f543h;

    /* renamed from: i */
    public final C48817b71 f544i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102o(FinderItem finderItem, C48682a91 a912, List list, C48817b71 b712, String str, boolean z, int i, C8480h hVar) {
        this(finderItem, a912, list, b712, str, (i & 32) != 0 ? true : z);
    }

    /* renamed from: p0 */
    public int mo83p0() {
        return 6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0102o(FinderItem finderItem, C48682a91 a912, List<? extends FinderObject> list, C48817b71 b712, String str, boolean z) {
        super(finderItem, a912, str, (String) null, z);
        C87412m.m108594g(finderItem, "feedObject");
        C87412m.m108594g(a912, "container");
        C87412m.m108594g(list, "relateLiving");
        this.f543h = list;
        this.f544i = b712;
    }
}
