package ah1;

import cj1.C0556j5;
import cj1.C0564k3;
import cj1.C0581o5;
import cj1.C0626v1;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kl1.C10300b;
import sx3.C110823p;
import sx3.C36907w;
import te3.C48742ao0;
import te3.C52013xs0;
import te3.C64674r41;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ah1.a */
public final class C0044a extends C66639f {

    /* renamed from: a */
    public final C45795b f51a;

    /* renamed from: b */
    public final String f52b = "LiveMsgBulletInterceptor";

    /* renamed from: c */
    public final int[] f53c = {10012, 10005};

    /* renamed from: d */
    public final int[] f54d = {20076, 20078};

    public C0044a(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f51a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        ArrayList arrayList;
        LinkedList<C52013xs0> linkedList;
        LinkedList<C64674r41> linkedList2;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        ArrayList arrayList2 = null;
        if (ao02 == null || (linkedList2 = ao02.f130677e) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (T next : linkedList2) {
                if (C110823p.m151008x(this.f53c, ((C64674r41) next).f185127g)) {
                    arrayList.add(next);
                }
            }
        }
        C48742ao0 ao03 = aVar.f105072a;
        if (!(ao03 == null || (linkedList = ao03.f130689t) == null)) {
            arrayList2 = new ArrayList();
            for (T next2 : linkedList) {
                if (C110823p.m151008x(this.f54d, ((C52013xs0) next2).f144903e)) {
                    arrayList2.add(next2);
                }
            }
        }
        LinkedList<C64674r41> linkedList3 = new LinkedList<>(arrayList);
        LinkedList linkedList4 = new LinkedList(arrayList2);
        Class cls = C0702z0.class;
        ((C0702z0) this.f51a.mo71262a(cls)).f1673g.clear();
        List<C0581o5> list = ((C0702z0) this.f51a.mo71262a(cls)).f1673g;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList3, 10));
        for (C64674r41 j5Var : linkedList3) {
            arrayList3.add(new C0556j5(j5Var));
        }
        list.addAll(arrayList3);
        if (BuildInfo.DEBUG) {
            C10300b bVar = C10300b.f31392a;
            String str = this.f52b;
            C87412m.m108594g(str, "prefix");
            int size = linkedList3.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                C64674r41 r412 = (C64674r41) linkedList3.get(i);
                sb.append("content:" + r412.f185126f + ",seq:" + r412.f185129i + ",id:" + r412.f185130j + ", msgType:" + r412.f185127g + "},{msgHashCode:" + r412.hashCode() + '!');
            }
            Log.m105924i("BulletCommentHelper", str + ' ' + sb);
        }
        List<C0581o5> list2 = ((C0702z0) this.f51a.mo71262a(cls)).f1673g;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = linkedList4.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next3 = it.next();
            if (((C52013xs0) next3).f144903e != 20076) {
                z = false;
            }
            if (z) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(new C0564k3((C52013xs0) it4.next()));
        }
        list2.addAll(arrayList5);
        List<C0581o5> list3 = ((C0702z0) this.f51a.mo71262a(cls)).f1673g;
        ArrayList arrayList6 = new ArrayList();
        for (Object next4 : linkedList4) {
            if (((C52013xs0) next4).f144903e == 20078) {
                arrayList6.add(next4);
            }
        }
        ArrayList arrayList7 = new ArrayList(C36907w.m41090l(arrayList6, 10));
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            arrayList7.add(new C0626v1((C52013xs0) it5.next()));
        }
        list3.addAll(arrayList7);
        if (C58739j4.f168176a.mo83692U() && ((C0702z0) this.f51a.mo71262a(cls)).f1673g.size() > 0) {
            String str2 = this.f52b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("handleBulletMsg size:");
            sb4.append(((C0702z0) this.f51a.mo71262a(cls)).f1673g.size());
            sb4.append(',');
            List<C0581o5> list4 = ((C0702z0) this.f51a.mo71262a(cls)).f1673g;
            C87412m.m108593f(list4, "liveContext.business(\n  …       ).bulletCommetList");
            ArrayList arrayList8 = new ArrayList(C36907w.m41090l(list4, 10));
            for (C0581o5 f : list4) {
                arrayList8.add(f.mo572f());
            }
            sb4.append(arrayList8);
            Log.m105924i(str2, sb4.toString());
        }
        return true;
    }
}
