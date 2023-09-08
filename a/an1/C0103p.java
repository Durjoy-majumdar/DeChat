package an1;

import bn1.C0330a;
import cm1.C0740i2;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import en1.C7766a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import te3.C48682a91;
import te3.C52231z81;
import tf1.C13914m;

/* renamed from: an1.p */
public final class C0103p implements C0740i2, C0330a, C7766a {

    /* renamed from: d */
    public final C48682a91 f545d;

    /* renamed from: e */
    public final ArrayList<C0740i2> f546e = new ArrayList<>();

    public C0103p(C48682a91 a912) {
        C87412m.m108594g(a912, "container");
        this.f545d = a912;
    }

    /* renamed from: a */
    public C89349b mo78a() {
        return this.f545d.f130384n;
    }

    /* renamed from: b */
    public void mo79b(int i) {
        this.f545d.f130382i = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 3;
    }

    /* renamed from: d */
    public void mo80d(C89349b bVar) {
        this.f545d.f130384n = bVar;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0103p) || ((C0103p) mVar).f545d.f130377d != this.f545d.f130377d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f545d.f130377d;
    }

    /* renamed from: i */
    public C48682a91 mo84i() {
        return this.f545d;
    }

    /* renamed from: j */
    public List<Long> mo81j() {
        ArrayList arrayList = new ArrayList();
        LinkedList<C52231z81> linkedList = this.f545d.f130381h;
        C87412m.m108593f(linkedList, "container.card_list");
        for (C52231z81 z812 : linkedList) {
            FinderObject finderObject = z812.f145756f;
            if (finderObject != null) {
                arrayList.add(Long.valueOf(finderObject.f164794id));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int mo82k() {
        return this.f545d.f130377d;
    }
}
