package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114486j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p329d3.C58104c;
import p981ie.C87705i;
import sx3.C64197v;

/* renamed from: w33.m */
public final class C118731m<T> implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ int f355262a;

    /* renamed from: b */
    public final /* synthetic */ C104289g f355263b;

    /* renamed from: c */
    public final /* synthetic */ C114467i f355264c;

    public C118731m(int i, C104289g gVar, C114467i iVar) {
        this.f355262a = i;
        this.f355263b = gVar;
        this.f355264c = iVar;
    }

    public void accept(Object obj) {
        int i;
        Log.m105924i("MicroMsg.VoIPProfileReport", "dump looper tasks:");
        Set entrySet = ((Map) obj).entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = entrySet.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object value = ((Map.Entry) next).getValue();
            C87412m.m108593f(value, "it.value");
            Iterable iterable = (Iterable) value;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it4 = iterable.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (C87412m.m108589b(((C58104c) it4.next()).f166179a, C114486j0.class)) {
                            i = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        int i2 = this.f355262a;
        C104289g gVar = this.f355263b;
        C114467i iVar = this.f355264c;
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            int i3 = i + 1;
            if (i >= 0) {
                Map.Entry entry = (Map.Entry) next2;
                if (i < i2) {
                    C118738t.m167430a(gVar, String.valueOf(i), new C118730l(entry, iVar, i));
                }
                i = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
