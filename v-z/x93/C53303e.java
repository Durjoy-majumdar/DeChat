package x93;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import nj3.C76874e0;
import te3.C50187kw2;

/* renamed from: x93.e */
public class C53303e {

    /* renamed from: x93.e$a */
    public class C53304a implements Comparator<C50187kw2> {
        public int compare(Object obj, Object obj2) {
            return ((C50187kw2) obj).f137074i - ((C50187kw2) obj2).f137074i;
        }
    }

    /* renamed from: x93.e$b */
    public enum C53305b {
        HVGAME_MENU_ACTION_DEFAULT(0);
        

        /* renamed from: f */
        public static EnumMap<C53305b, Integer> f148889f;

        /* renamed from: d */
        public int f148891d;

        /* access modifiers changed from: public */
        static {
            Class<C53305b> cls;
            f148889f = new EnumMap<>(cls);
            Iterator<E> it = EnumSet.allOf(cls).iterator();
            while (it.hasNext()) {
                C53305b bVar = (C53305b) it.next();
                f148889f.put(bVar, Integer.valueOf(bVar.f148891d));
            }
        }

        /* access modifiers changed from: public */
        C53305b(int i) {
            this.f148891d = i;
        }
    }

    /* renamed from: a */
    public static C76874e0 m59727a(Context context, List<C50187kw2> list) {
        if (Util.isNullOrNil((List) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C50187kw2 next : list) {
            if (next != null) {
                if (C53305b.f148889f.containsValue(Integer.valueOf(next.f137072g))) {
                    arrayList.add(next);
                }
            }
        }
        if (Util.isNullOrNil((List) arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new C53304a());
        int i = ((C50187kw2) arrayList.get(arrayList.size() - 1)).f137074i;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList2.add((Object) null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C50187kw2 kw22 = (C50187kw2) it.next();
            int i3 = kw22.f137074i;
            if (i3 > 0 && i3 <= arrayList2.size()) {
                arrayList2.set(kw22.f137074i - 1, kw22);
            }
        }
        C76874e0 e0Var = new C76874e0(context);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C50187kw2 kw23 = (C50187kw2) it4.next();
            if (kw23 == null) {
                e0Var.mo107142f(-1, "");
            } else {
                e0Var.mo107142f(kw23.f137069d, kw23.f137070e + "__" + kw23.f137071f);
            }
        }
        return e0Var;
    }
}
