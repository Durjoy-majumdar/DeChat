package wf1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C77813z;
import te3.C48769aw;
import te3.C50767p11;
import te3.C50852pn2;
import te3.C52291zp0;
import tj1.C13929a;
import tj1.C13931b;
import tj1.C13954j;
import tj1.C13955k;

/* renamed from: wf1.s */
public final class C15236s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41457d;

    /* renamed from: wf1.s$a */
    public static final class C15237a<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ C15193l f41458d;

        public C15237a(C15193l lVar) {
            this.f41458d = lVar;
        }

        public int compare(Object obj, Object obj2) {
            int i;
            float f;
            C48769aw awVar = (C48769aw) obj;
            C48769aw awVar2 = (C48769aw) obj2;
            int i2 = awVar.f130787e;
            int i3 = 0;
            if (i2 > 0 && awVar2.f130787e > 0) {
                C50767p11 p112 = this.f41458d.f41372E.get(awVar2.f130786d);
                i = p112 != null ? (int) p112.f139516p : 0;
                C50767p11 p113 = this.f41458d.f41372E.get(awVar.f130786d);
                if (p113 != null) {
                    f = p113.f139516p;
                }
                return i - i3;
            } else if (i2 != 0 || awVar2.f130787e != 0) {
                return awVar2.f130787e - i2;
            } else {
                C50767p11 p114 = this.f41458d.f41372E.get(awVar2.f130786d);
                i = p114 != null ? (int) p114.f139516p : 0;
                C50767p11 p115 = this.f41458d.f41372E.get(awVar.f130786d);
                if (p115 != null) {
                    f = p115.f139516p;
                }
                return i - i3;
            }
            i3 = (int) f;
            return i - i3;
        }
    }

    public C15236s(C15193l lVar) {
        this.f41457d = lVar;
    }

    public final void onClick(View view) {
        C13604l lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62042e.f176370a.mo87013I1(4);
        C13931b bVar = (C13931b) ((C36570n) this.f41457d.f41397w).getValue();
        C15193l lVar2 = this.f41457d;
        int i = lVar2.f41379L;
        long j = lVar2.f41375H;
        LinkedList linkedList = new LinkedList();
        C15193l lVar3 = this.f41457d;
        LinkedList linkedList2 = new LinkedList(lVar3.f41371D);
        C77813z.m93909o(linkedList2, new C15237a(lVar3));
        Iterator it = linkedList2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C48769aw awVar = (C48769aw) it.next();
            if (awVar.f130787e > 0) {
                z = true;
            }
            linkedList.add(new C13929a.C13930a(z, awVar));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        C13929a aVar = new C13929a(i, j, linkedList);
        bVar.getClass();
        C32224a<? extends C13604l<? extends C52291zp0, ? extends LinkedHashMap<String, C50767p11>>> aVar2 = bVar.f39144j;
        if (!(aVar2 == null || (lVar = (C13604l) aVar2.invoke()) == null)) {
            C52291zp0 zp02 = (C52291zp0) lVar.f38555d;
            bVar.f39146l = zp02.f146169h;
            bVar.f39147m = zp02.f146170i;
            bVar.f39148n = (LinkedHashMap) lVar.f38556e;
            LinkedList<C50852pn2> linkedList3 = zp02.f146168g;
            C87412m.m108593f(linkedList3, "pair.first.level_config_list");
            bVar.f39149o = linkedList3;
            if (linkedList3.size() > 1) {
                C77813z.m93909o(linkedList3, new C13955k());
            }
            bVar.f39150p = ((C52291zp0) lVar.f38555d).f146167f;
        }
        String str = bVar.f39136b;
        Log.m105924i(str, "[showPanel] data = " + aVar);
        bVar.f39145k = aVar;
        bVar.f39151q = aVar.f39130a;
        LinkedList<C13929a.C13930a> linkedList4 = aVar.f39132c;
        ArrayList arrayList2 = new ArrayList();
        for (T next : linkedList4) {
            C13929a.C13930a aVar3 = (C13929a.C13930a) next;
            if (aVar3.f39133a && aVar3.f39134b.f130787e > 0) {
                arrayList2.add(next);
            }
        }
        bVar.f39157w = arrayList2.size();
        ((C13931b.C13935d) ((C36570n) bVar.f39142h).getValue()).notifyDataSetChanged();
        bVar.mo13396b();
        ((View) ((C36570n) bVar.f39138d).getValue()).post(new C13954j(bVar));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
