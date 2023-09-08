package p422y5;

import java.util.ArrayList;
import p421x5.C26533b;
import p421x5.C26534c;
import p421x5.C26536e;

/* renamed from: y5.a */
public class C26624a implements C26534c {

    /* renamed from: a */
    public C26625b f74064a;

    /* renamed from: b */
    public ArrayList<C26536e> f74065b;

    public int getDuration() {
        try {
            ArrayList<C26536e> arrayList = this.f74065b;
            C26533b bVar = arrayList.get(arrayList.size() - 1).f73838a;
            return "continuous".equals(bVar.f73830a) ? bVar.f73831b + bVar.f73832c : bVar.f73831b + 22;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getVersion() {
        this.f74064a.getClass();
        return 1;
    }
}
