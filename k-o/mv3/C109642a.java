package mv3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: mv3.a */
public class C109642a {

    /* renamed from: a */
    public HashMap<String, Object> f328239a = new HashMap<>();

    /* renamed from: b */
    public Object f328240b = new Object();

    /* renamed from: c */
    public C109644c f328241c;

    /* renamed from: a */
    public void mo160862a(String str, int i, int i2, int i3, Object obj) {
        LinkedList linkedList;
        T t;
        C109645d dVar;
        String str2 = str;
        if (str2 != null) {
            C109644c cVar = this.f328241c;
            synchronized (cVar.f327569b) {
                int i4 = cVar.f327570c;
                linkedList = null;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    cVar.f327570c = i5;
                    T[] tArr = cVar.f327568a;
                    t = tArr[i5];
                    tArr[i5] = null;
                } else {
                    t = null;
                }
            }
            if (t == null) {
                t = new C109646e();
            } else {
                C109646e eVar = (C109646e) t;
                eVar.f328243a = null;
                eVar.f328244b = 0;
                eVar.f328245c = 0;
                eVar.f328246d = 0;
                eVar.f328247e = null;
            }
            T t2 = (C109646e) t;
            t2.f328243a = str2;
            t2.f328244b = i;
            t2.f328245c = i2;
            t2.f328246d = i3;
            t2.f328247e = obj;
            if (str2 != null) {
                System.currentTimeMillis();
                String str3 = t2.f328243a;
                synchronized (this.f328240b) {
                    Object obj2 = this.f328239a.get(str3);
                    if (obj2 != null) {
                        if (obj2 instanceof C109645d) {
                            dVar = (C109645d) obj2;
                        } else if (obj2 instanceof List) {
                            dVar = null;
                            linkedList = (LinkedList) ((LinkedList) obj2).clone();
                        }
                    }
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.mo160863a(str3, t2.f328244b, t2.f328245c, t2.f328246d, t2.f328247e);
                }
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((C109645d) it.next()).mo160863a(str3, t2.f328244b, t2.f328245c, t2.f328246d, t2.f328247e);
                    }
                }
                C109644c cVar2 = this.f328241c;
                synchronized (cVar2.f327569b) {
                    T[] tArr2 = cVar2.f327568a;
                    int length = tArr2.length;
                    int i6 = cVar2.f327570c;
                    if (i6 < length) {
                        tArr2[i6] = t2;
                        cVar2.f327570c = i6 + 1;
                    }
                }
            }
        }
    }
}
