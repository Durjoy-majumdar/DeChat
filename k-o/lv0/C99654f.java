package lv0;

import java.util.HashMap;
import yu0.C102908a;

/* renamed from: lv0.f */
public class C99654f extends C102908a {

    /* renamed from: c */
    public static C99654f f292065c;

    /* renamed from: b */
    public HashMap<Integer, C99663m> f292066b;

    /* renamed from: b */
    public void mo17656b() {
        f292065c = null;
    }

    /* renamed from: c */
    public C99663m mo139035c(int i) {
        if (this.f292066b == null) {
            HashMap<Integer, C99663m> hashMap = new HashMap<>();
            this.f292066b = hashMap;
            hashMap.put(3, new C99655g());
            this.f292066b.put(47, new C99653e());
            this.f292066b.put(49, new C99652d());
            this.f292066b.put(34, new C99658j());
            C99657i iVar = new C99657i();
            this.f292066b.put(43, iVar);
            this.f292066b.put(44, iVar);
            this.f292066b.put(62, iVar);
            C99656h hVar = new C99656h();
            this.f292066b.put(48, hVar);
            this.f292066b.put(42, hVar);
            this.f292066b.put(66, hVar);
            this.f292066b.put(10000, hVar);
            this.f292066b.put(1, hVar);
            this.f292066b.put(37, hVar);
            this.f292066b.put(40, hVar);
            this.f292066b.put(50, hVar);
        }
        return this.f292066b.get(Integer.valueOf(i));
    }
}
