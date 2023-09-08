package kf1;

import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.List;
import te3.C48817b71;

/* renamed from: kf1.zb */
public final class C10072zb extends C0797z {

    /* renamed from: d */
    public final List<FinderObject> f30836d;

    /* renamed from: e */
    public final C48817b71 f30837e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10072zb(FinderItem finderItem, List<? extends FinderObject> list, C48817b71 b712) {
        super(finderItem);
        C87412m.m108594g(finderItem, "feedObject");
        C87412m.m108594g(list, "relateLiving");
        this.f30836d = list;
        this.f30837e = b712;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2021;
    }
}
