package an1;

import bn1.C0331b;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import te3.C48682a91;

/* renamed from: an1.c */
public final class C0090c extends C0331b {

    /* renamed from: h */
    public final int f527h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0090c(FinderItem finderItem, C48682a91 a912, boolean z, String str, String str2, int i) {
        super(finderItem, a912, str, str2, z);
        C87412m.m108594g(finderItem, "feedObject");
        C87412m.m108594g(a912, "container");
        this.f527h = i;
    }

    /* renamed from: p0 */
    public int mo83p0() {
        return this.f527h;
    }
}
