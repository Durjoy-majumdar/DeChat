package p864t5;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.List;
import o24.C21768j;
import p1105d5.C106989b;
import p1126j5.C108576g;
import p593l5.C109269b;
import p972h5.C108139e;
import rx3.C13604l;

/* renamed from: t5.b */
public final class C110903b {
    /* renamed from: a */
    public static final Object m151201a(C106989b bVar, Object obj) {
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(obj, "data");
        List<C13604l<C109269b<? extends Object, ?>, Class<? extends Object>>> list = bVar.f320253b;
        int i = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                C13604l lVar = list.get(i);
                C109269b bVar2 = (C109269b) lVar.f38555d;
                if (((Class) lVar.f38556e).isAssignableFrom(obj.getClass()) && bVar2.mo59477a(obj)) {
                    obj = bVar2.mo59478f(obj);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static final <T> C108139e m151202b(C106989b bVar, T t, C21768j jVar, String str) {
        C108139e eVar;
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(t, "data");
        C87412m.m108594g(jVar, FirebaseAnalytics.C113379b.SOURCE);
        List<C108139e> list = bVar.f320255d;
        int i = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                eVar = list.get(i);
                if (eVar.mo158532a(jVar, str)) {
                    break;
                } else if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        eVar = null;
        C108139e eVar2 = eVar;
        if (eVar2 != null) {
            return eVar2;
        }
        throw new IllegalStateException(C87412m.m108600m("Unable to decode data. No decoder supports: ", t).toString());
    }

    /* renamed from: c */
    public static final <T> C108576g<T> m151203c(C106989b bVar, T t) {
        C13604l<C108576g<? extends Object>, Class<? extends Object>> lVar;
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(t, "data");
        List<C13604l<C108576g<? extends Object>, Class<? extends Object>>> list = bVar.f320254c;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                lVar = list.get(i);
                C13604l lVar2 = lVar;
                if (((Class) lVar2.f38556e).isAssignableFrom(t.getClass()) && ((C108576g) lVar2.f38555d).mo159568a(t)) {
                    break;
                } else if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        lVar = null;
        C13604l lVar3 = lVar;
        if (lVar3 != null) {
            return (C108576g) lVar3.f38555d;
        }
        throw new IllegalStateException(C87412m.m108600m("Unable to fetch data. No fetcher supports: ", t).toString());
    }
}
