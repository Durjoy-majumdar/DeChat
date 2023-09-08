package p1154s9;

import com.robinhood.ticker.C104497a;
import com.robinhood.ticker.C104499b;
import com.robinhood.ticker.C104500c;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: s9.b */
public class C110782b {

    /* renamed from: a */
    public final ArrayList<C104499b> f331403a = new ArrayList<>();

    /* renamed from: b */
    public final C104500c f331404b;

    /* renamed from: c */
    public C104497a[] f331405c;

    /* renamed from: d */
    public Set<Character> f331406d;

    public C110782b(C104500c cVar) {
        this.f331404b = cVar;
    }

    /* renamed from: a */
    public void mo162338a(float f) {
        int size = this.f331403a.size();
        for (int i = 0; i < size; i++) {
            C104499b bVar = this.f331403a.get(i);
            if (f == 1.0f) {
                bVar.f309698c = bVar.f309699d;
                bVar.f309710o = 0.0f;
                bVar.f309711p = 0.0f;
            }
            float f2 = bVar.f309697b.f309715c;
            float abs = ((((float) Math.abs(bVar.f309702g - bVar.f309701f)) * f2) * f) / f2;
            int i2 = (int) abs;
            float f3 = bVar.f309711p * (1.0f - f);
            int i3 = bVar.f309712q;
            bVar.f309704i = ((abs - ((float) i2)) * f2 * ((float) i3)) + f3;
            bVar.f309703h = bVar.f309701f + (i2 * i3);
            bVar.f309705j = f2;
            float f4 = bVar.f309706k;
            bVar.f309707l = f4 + ((bVar.f309708m - f4) * f);
        }
    }
}
