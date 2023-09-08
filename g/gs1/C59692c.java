package gs1;

import er1.C58775t;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import rx3.C13604l;
import te3.C64589nq2;

/* renamed from: gs1.c */
public final class C59692c {

    /* renamed from: a */
    public final HashMap<String, C64589nq2> f170520a = new HashMap<>(5);

    /* renamed from: b */
    public final ArrayList<C64589nq2> f170521b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C58775t.C58776a> f170522c = new ArrayList<>();

    /* renamed from: d */
    public int f170523d;

    /* renamed from: e */
    public int f170524e;

    /* renamed from: f */
    public ArrayList<C13604l<String, Integer>> f170525f = new ArrayList<>();

    /* renamed from: g */
    public HashMap<String, ArrayList<Integer>> f170526g = new HashMap<>();

    /* renamed from: a */
    public final ArrayList<C64589nq2> mo84674a() {
        ArrayList arrayList = new ArrayList();
        Iterator<C64589nq2> it = this.f170521b.iterator();
        while (it.hasNext()) {
            C64589nq2 next = it.next();
            arrayList.add(next);
            ArrayList arrayList2 = this.f170526g.get(next.f184532f);
            if (arrayList2 == null) {
                next.f184535i = 1;
            } else if (arrayList2.size() > 0) {
                Object remove = arrayList2.remove(0);
                C87412m.m108593f(remove, "types.removeAt(0)");
                next.f184535i = ((Number) remove).intValue();
            }
        }
        return this.f170521b;
    }

    /* renamed from: b */
    public final void mo84675b(int i, String str) {
        C87412m.m108594g(str, "nickname");
        this.f170523d++;
        if (i != 0) {
            this.f170524e++;
            this.f170525f.add(new C13604l(str, Integer.valueOf(i)));
            ArrayList arrayList = this.f170526g.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(Integer.valueOf(i));
            this.f170526g.put(str, arrayList);
        }
    }
}
