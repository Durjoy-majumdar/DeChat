package up1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: up1.y0 */
public final class C14370y0 {

    /* renamed from: a */
    public static final C14371a f39926a = new C14371a((C8480h) null);

    /* renamed from: up1.y0$a */
    public static final class C14371a {
        public C14371a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo13671a(List<Integer> list, String str) {
            C87412m.m108594g(list, "data");
            C87412m.m108594g(str, "col");
            StringBuilder sb = new StringBuilder("(");
            sb.append(str + " in (");
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().intValue());
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(")");
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            return sb4;
        }

        /* renamed from: b */
        public final ArrayList<Integer> mo13672b(List<Integer> list) {
            C87412m.m108594g(list, "data");
            ArrayList arrayList = new ArrayList(list);
            HashSet hashSet = new HashSet();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Integer) it4.next()).intValue();
                    C87412m.m108593f(num, "i");
                    arrayList3.add(Integer.valueOf(intValue | num.intValue()));
                }
                hashSet.addAll(new HashSet(arrayList3));
                hashSet.add(num);
            }
            hashSet.add(0);
            arrayList2.addAll(hashSet);
            return arrayList2;
        }
    }
}
