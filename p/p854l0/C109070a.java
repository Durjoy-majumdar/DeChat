package p854l0;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.List;
import p414p0.C110092c;
import sx3.C64177c;

/* renamed from: l0.a */
public interface C109070a<E> extends List<E>, Collection, C33145a {

    /* renamed from: l0.a$a */
    public static final class C109071a<E> extends C64177c<E> implements C109070a<E> {

        /* renamed from: e */
        public final C109070a<E> f326633e;

        /* renamed from: f */
        public final int f326634f;

        /* renamed from: g */
        public int f326635g;

        public C109071a(C109070a<? extends E> aVar, int i, int i2) {
            C87412m.m108594g(aVar, FirebaseAnalytics.C113379b.SOURCE);
            this.f326633e = aVar;
            this.f326634f = i;
            C110092c.m149677c(i, i2, aVar.size());
            this.f326635g = i2 - i;
        }

        /* renamed from: f */
        public int mo52189f() {
            return this.f326635g;
        }

        public E get(int i) {
            C110092c.m149675a(i, this.f326635g);
            return this.f326633e.get(this.f326634f + i);
        }

        public List subList(int i, int i2) {
            C110092c.m149677c(i, i2, this.f326635g);
            C109070a<E> aVar = this.f326633e;
            int i3 = this.f326634f;
            return new C109071a(aVar, i + i3, i3 + i2);
        }
    }
}
