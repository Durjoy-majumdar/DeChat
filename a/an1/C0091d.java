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

/* renamed from: an1.d */
public final class C0091d implements C0740i2, C0330a {

    /* renamed from: d */
    public final C48682a91 f528d;

    /* renamed from: e */
    public final ArrayList<C0740i2> f529e = new ArrayList<>();

    public C0091d(C48682a91 a912) {
        C87412m.m108594g(a912, "container");
        this.f528d = a912;
    }

    /* renamed from: a */
    public C89349b mo78a() {
        return this.f528d.f130384n;
    }

    /* renamed from: b */
    public void mo79b(int i) {
        this.f528d.f130382i = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2;
    }

    /* renamed from: d */
    public void mo80d(C89349b bVar) {
        this.f528d.f130384n = bVar;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0091d) || ((C0091d) mVar).f528d.f130377d != this.f528d.f130377d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f528d.f130377d;
    }

    /* renamed from: j */
    public List<Long> mo81j() {
        ArrayList arrayList = new ArrayList();
        LinkedList<C52231z81> linkedList = this.f528d.f130381h;
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
        return this.f528d.f130377d;
    }
}
