package dv0;

import java.util.HashMap;
import yu0.C102908a;

/* renamed from: dv0.e */
public class C97546e extends C102908a {

    /* renamed from: c */
    public static C97546e f286251c;

    /* renamed from: b */
    public HashMap<Integer, C75460n> f286252b;

    /* renamed from: d */
    public static C97546e m125691d() {
        if (f286251c == null) {
            C97546e eVar = new C97546e();
            f286251c = eVar;
            C102908a.m136012a(eVar);
        }
        return f286251c;
    }

    /* renamed from: b */
    public void mo17656b() {
        f286251c = null;
    }

    /* renamed from: c */
    public C75460n mo136817c(int i) {
        if (this.f286252b == null) {
            HashMap<Integer, C75460n> hashMap = new HashMap<>();
            this.f286252b = hashMap;
            hashMap.put(3, new C97547f());
            this.f286252b.put(47, new C97545d());
            this.f286252b.put(49, new C97544c());
            this.f286252b.put(34, new C97550i());
            C97549h hVar = new C97549h();
            this.f286252b.put(43, hVar);
            this.f286252b.put(44, hVar);
            this.f286252b.put(62, hVar);
            C97548g gVar = new C97548g();
            this.f286252b.put(48, gVar);
            this.f286252b.put(42, gVar);
            this.f286252b.put(66, gVar);
            this.f286252b.put(10000, gVar);
            this.f286252b.put(1, gVar);
            this.f286252b.put(37, gVar);
            this.f286252b.put(40, gVar);
            this.f286252b.put(50, gVar);
            this.f286252b.put(838860849, gVar);
        }
        return this.f286252b.get(Integer.valueOf(i));
    }
}
