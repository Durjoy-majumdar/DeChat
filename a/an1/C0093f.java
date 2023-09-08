package an1;

import bn1.C0330a;
import cm1.C0740i2;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import te3.C48682a91;
import te3.C52231z81;
import tf1.C13914m;

/* renamed from: an1.f */
public final class C0093f implements C0740i2, C0330a {

    /* renamed from: d */
    public final C48682a91 f530d;

    /* renamed from: e */
    public final ArrayList<C0740i2> f531e = new ArrayList<>();

    public C0093f(C48682a91 a912) {
        C87412m.m108594g(a912, "container");
        this.f530d = a912;
    }

    /* renamed from: a */
    public C89349b mo78a() {
        return this.f530d.f130384n;
    }

    /* renamed from: b */
    public void mo79b(int i) {
        this.f530d.f130382i = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    /* renamed from: d */
    public void mo80d(C89349b bVar) {
        this.f530d.f130384n = bVar;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0093f) || ((C0093f) mVar).f530d.f130377d != this.f530d.f130377d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f530d.f130377d;
    }

    /* renamed from: j */
    public List<Long> mo81j() {
        ArrayList arrayList = new ArrayList();
        LinkedList<C52231z81> linkedList = this.f530d.f130381h;
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
        return this.f530d.f130377d;
    }
}
