package bn1;

import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import java.util.List;
import pe3.C89349b;
import sx3.C64197v;
import te3.C48682a91;

/* renamed from: bn1.b */
public abstract class C0331b extends C0797z implements C0330a {

    /* renamed from: d */
    public final C48682a91 f903d;

    /* renamed from: e */
    public final String f904e;

    /* renamed from: f */
    public final String f905f;

    /* renamed from: g */
    public final boolean f906g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0331b(FinderItem finderItem, C48682a91 a912, String str, String str2, boolean z) {
        super(finderItem);
        C87412m.m108594g(finderItem, "feedObject");
        C87412m.m108594g(a912, "container");
        this.f903d = a912;
        this.f904e = str;
        this.f905f = str2;
        this.f906g = z;
    }

    /* renamed from: a */
    public C89349b mo78a() {
        return this.f903d.f130384n;
    }

    /* renamed from: b */
    public void mo79b(int i) {
        this.f903d.f130382i = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return mo83p0();
    }

    /* renamed from: d */
    public void mo80d(C89349b bVar) {
        this.f903d.f130384n = bVar;
    }

    /* renamed from: j */
    public List<Long> mo81j() {
        return C64197v.m75539h(Long.valueOf(mo3513o().getFeedObject().f164794id));
    }

    /* renamed from: k */
    public int mo82k() {
        return this.f903d.f130377d;
    }

    /* renamed from: p0 */
    public abstract int mo83p0();
}
