package u81;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import te3.C118421b70;
import te3.C118483z60;
import te3.C64225a70;
import te3.C64276c70;
import te3.C64701s60;
import te3.C64723t60;
import te3.C64746u60;
import u24.C90599h;
import v81.C118666a;
import v81.C118667b;
import v81.C118668c;

/* renamed from: u81.c */
public class C118606c {
    /* renamed from: a */
    public static List<C118604a> m167291a(C64723t60 t602) {
        if (t602 == null || t602.f185506d.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C64701s60> it = t602.f185506d.iterator();
        while (it.hasNext()) {
            C64701s60 next = it.next();
            C118604a aVar = new C118604a();
            aVar.f354921s = next.f185353e;
            aVar.f354922t = next.f185354f;
            aVar.f354920r = next.f185352d;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, C118667b> m167292b(C64225a70 a702) {
        if (a702 == null || a702.f182037d.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<C118483z60> it = a702.f182037d.iterator();
        while (it.hasNext()) {
            C118483z60 next = it.next();
            if (!C90599h.m113511d(next.f354616d)) {
                C118667b bVar = new C118667b();
                bVar.f355080a = next.f354616d;
                bVar.f355081b = next.f354617e;
                bVar.f355082c = next.f354618f;
                bVar.f355083d = next.f354619g;
                bVar.f355085f = next.f354621i;
                bVar.f355089j = next.f354628s;
                bVar.f355086g = next.f354626q;
                bVar.f355087h = next.f354625p;
                bVar.f355088i = next.f354622j;
                bVar.f355090k = next.f354623n;
                bVar.f355091l = next.f354629t;
                bVar.f355093n = next.f354627r;
                bVar.f355084e = new ArrayList();
                Iterator<C64746u60> it4 = next.f354620h.iterator();
                while (it4.hasNext()) {
                    C64746u60 next2 = it4.next();
                    C118666a aVar = new C118666a();
                    aVar.f355077a = next2.f185718d;
                    aVar.f355079c = next2.f185720f;
                    aVar.f355078b = next2.f185719e;
                    bVar.f355084e.add(aVar);
                }
                hashMap.put(bVar.f355080a, bVar);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static Map<String, C118668c> m167293c(C64276c70 c702) {
        if (c702 == null || c702.f182425d.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<C118421b70> it = c702.f182425d.iterator();
        while (it.hasNext()) {
            C118421b70 next = it.next();
            if (!C90599h.m113511d(next.f353912d)) {
                C118668c cVar = new C118668c();
                String str = next.f353912d;
                cVar.f355094a = str;
                cVar.f355095b = next.f353913e;
                cVar.f355096c = next.f353914f;
                cVar.f355097d = next.f353919n;
                cVar.f355101h = next.f353917i;
                cVar.f355098e = next.f353915g;
                cVar.f355099f = next.f353918j;
                cVar.f355100g = next.f353916h;
                hashMap.put(str, cVar);
            }
        }
        return hashMap;
    }
}
