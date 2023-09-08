package tc0;

import g62.C45882k;
import g62.C75880o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import p261wl.C38166b;
import tc0.C48623d;
import te3.C48684a93;
import te3.C48825b93;
import te3.C52085y83;

/* renamed from: tc0.b */
public class C48621b implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f130145d;

    /* renamed from: e */
    public final /* synthetic */ C48622c f130146e;

    public C48621b(C48622c cVar, ArrayList arrayList) {
        this.f130146e = cVar;
        this.f130145d = arrayList;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C48623d dVar;
        C48623d.C48624a aVar;
        C48825b93 b932;
        LinkedList<Integer> linkedList;
        Class<C45882k.C45885c> cls = C45882k.C45885c.class;
        if (yVar.getType() == 681 && (aVar = dVar.f130154e) != null) {
            aVar.getClass();
            C48623d.C48624a aVar2 = (dVar = (C48623d) yVar).f130154e;
            C48684a93 a932 = aVar2.f130157b.f130159a;
            int i3 = ((C48623d.C48625b) aVar2.getReqObj()).f130158a.f145765d.f140594e.getLast().f140037d;
            int i4 = -1;
            if (a932 == null || (b932 = a932.f130391e) == null || (linkedList = b932.f131020e) == null) {
                List<C45882k.C45884b> list = this.f130146e.f130151d.get(i3);
                if (list != null) {
                    for (C45882k.C45884b u1 : list) {
                        u1.mo71282u1(-1, new C52085y83(), (C75880o) this.f130145d.get(0));
                    }
                }
                C38166b.m41756c(cls, Integer.valueOf(i3), new b$$a(this.f130145d));
                List<C45882k.C45883a> list2 = this.f130146e.f130152e.get(i3);
                if (list2 != null) {
                    for (C45882k.C45883a aVar3 : list2) {
                        LinkedList linkedList2 = new LinkedList();
                        LinkedList linkedList3 = new LinkedList();
                        for (int i5 = 0; i5 < this.f130145d.size(); i5++) {
                            linkedList2.add(new C52085y83());
                            linkedList3.add(-1);
                        }
                        aVar3.mo71316a(linkedList3, linkedList2, this.f130145d);
                    }
                    return;
                }
                return;
            }
            if (linkedList.size() > 0) {
                i4 = a932.f130391e.f131020e.getLast().intValue();
            }
            C52085y83 last = a932.f130391e.f131021f.size() > 0 ? a932.f130391e.f131021f.getLast() : new C52085y83();
            List<C45882k.C45884b> list3 = this.f130146e.f130151d.get(i3);
            if (list3 != null) {
                for (C45882k.C45884b u15 : list3) {
                    u15.mo71282u1(i4, last, (C75880o) this.f130145d.get(0));
                }
            }
            C38166b.m41756c(cls, Integer.valueOf(i3), new b$$b(i4, last, this.f130145d));
            List<C45882k.C45883a> list4 = this.f130146e.f130152e.get(i3);
            if (list4 != null) {
                for (C45882k.C45883a a : list4) {
                    C48825b93 b933 = a932.f130391e;
                    a.mo71316a(b933.f131020e, b933.f131021f, this.f130145d);
                }
            }
        }
    }
}
