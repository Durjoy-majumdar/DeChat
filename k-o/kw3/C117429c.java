package kw3;

import fw3.C116904a;
import gw3.C117003g;
import gw3.C117005i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kw3.C117426a;
import rv3.C118245h;
import vv3.C118702d;

/* renamed from: kw3.c */
public class C117429c extends C117426a {

    /* renamed from: e */
    public C116904a f351479e;

    public C117429c(C118702d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public void mo182123a(boolean z) {
        if (!z || this.f351471b == null) {
            this.f351472c.mo182122b();
            this.f351472c.f351477d.clear();
            return;
        }
        C118245h.m166799a("sensor_MasterEngine", "[method: dataPush ] ");
        C116904a aVar = this.f351479e;
        if (aVar != null) {
            C117426a.C117427a aVar2 = this.f351472c;
            aVar.mo180868c(aVar2.f351474a, aVar2.f351475b, aVar2.f351476c, this.f351471b);
        }
        this.f351472c.mo182122b();
    }

    /* renamed from: b */
    public void mo182124b(int i, Object obj) {
        int i2;
        C117003g gVar;
        boolean z = false;
        if (i == 1) {
            List<C117003g> list = (List) obj;
            C117426a.C117427a aVar = this.f351472c;
            aVar.getClass();
            if (list != null && !list.isEmpty() && (gVar = (C117003g) list.get(0)) != null) {
                int i3 = gVar.f350635d;
                List list2 = aVar.f351474a.get(Integer.valueOf(i3));
                if (list2 == null) {
                    list2 = new ArrayList();
                    aVar.f351474a.put(Integer.valueOf(i3), list2);
                }
                for (C117003g gVar2 : list) {
                    if (gVar2 != null) {
                        list2.add(gVar2);
                    }
                }
            }
        } else if (i == 11 && (obj instanceof C117005i)) {
            C117005i iVar = (C117005i) obj;
            C117426a.C117427a aVar2 = this.f351472c;
            if (iVar != null) {
                List<C117005i> list3 = aVar2.f351475b;
                if (list3 != null) {
                    ArrayList arrayList = (ArrayList) list3;
                    if (!arrayList.isEmpty()) {
                        C117005i iVar2 = (C117005i) arrayList.get(arrayList.size() - 1);
                        long j = iVar.f350646g;
                        if (j == iVar2.f350646g && iVar.f350649j == iVar2.f350649j) {
                            int i4 = iVar2.f350643d;
                            if (i4 == 1 && ((i2 = iVar.f350643d) == 3 || i2 == 4)) {
                                iVar.f350646g = j + 1;
                                arrayList.add(iVar);
                            } else if (!(i4 == 1 && iVar.f350643d == 2)) {
                                arrayList.remove(iVar2);
                                arrayList.add(iVar);
                            }
                            z = true;
                        }
                    }
                }
                if (!z) {
                    ((ArrayList) aVar2.f351475b).add(iVar);
                    return;
                }
                return;
            }
            aVar2.getClass();
        }
    }

    /* renamed from: c */
    public final void mo182125c() {
        for (Map.Entry next : this.f351472c.f351477d.entrySet()) {
            ArrayList arrayList = (ArrayList) next.getValue();
            C117426a.C117427a aVar = this.f351472c;
            String str = (String) next.getKey();
            aVar.getClass();
            if ((str.contains("_") ? Integer.valueOf(str.split("_")[0]).intValue() : Integer.valueOf(str).intValue()) == 1) {
                mo182124b(1, arrayList);
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    mo182124b(Integer.valueOf((String) next.getKey()).intValue(), arrayList.get(i));
                }
            }
        }
        this.f351472c.f351477d.clear();
    }
}
