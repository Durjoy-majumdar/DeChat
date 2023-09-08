package mv3;

import lv3.C109431a;
import lv3.C109432b;
import lv3.C109435e;
import lv3.C109438g;
import nv3.C109760a;

/* renamed from: mv3.b */
public class C109643b implements C109432b {

    /* renamed from: a */
    public C109642a f328242a;

    /* renamed from: a */
    public void mo160617a(C109760a aVar) {
        C109642a aVar2 = new C109642a();
        this.f328242a = aVar2;
        aVar2.f328241c = new C109644c(20);
        C109642a aVar3 = this.f328242a;
        ((C109431a) aVar).getClass();
        C109435e b = C109435e.m148611b();
        b.getClass();
        if (aVar3 != null) {
            synchronized (b.f327575d) {
                b.f327573b.put("EventCenter", aVar3);
            }
            return;
        }
        throw new C109438g("TpfServiceCenter|registerService|name or service should not be null");
    }
}
