package p424z5;

import java.util.ArrayList;
import java.util.Iterator;
import p421x5.C26533b;
import p421x5.C26534c;
import p421x5.C26536e;

/* renamed from: z5.a */
public class C26654a implements C26534c {

    /* renamed from: a */
    public C26655b f74225a;

    /* renamed from: b */
    public ArrayList<C26656c> f74226b;

    public int getDuration() {
        int i;
        try {
            ArrayList<C26656c> arrayList = this.f74226b;
            C26656c cVar = arrayList.get(arrayList.size() - 1);
            Iterator<C26536e> it = cVar.f74228b.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C26536e next = it.next();
                if (next.f73838a.f73830a.equals("continuous")) {
                    C26533b bVar = next.f73838a;
                    i = bVar.f73831b + bVar.f73832c;
                } else {
                    i = next.f73838a.f73831b + 22;
                }
                if (i > i2) {
                    i2 = i;
                }
            }
            return i2 + cVar.f74227a;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getVersion() {
        this.f74225a.getClass();
        return 2;
    }
}
