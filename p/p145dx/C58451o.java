package p145dx;

import d14.C45252f;
import gy3.C87412m;
import java.util.List;
import pj2.C62323d;

/* renamed from: dx.o */
public interface C58451o {

    /* renamed from: dx.o$a */
    public static final class C58452a {

        /* renamed from: a */
        public final List<C62323d> f167433a;

        /* renamed from: b */
        public final int f167434b;

        public C58452a(List<? extends C62323d> list, int i) {
            this.f167433a = list;
            this.f167434b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58452a)) {
                return false;
            }
            C58452a aVar = (C58452a) obj;
            return C87412m.m108589b(this.f167433a, aVar.f167433a) && this.f167434b == aVar.f167434b;
        }

        public int hashCode() {
            List<C62323d> list = this.f167433a;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.f167434b;
        }

        public String toString() {
            return "RingtoneUiState(ringtones=" + this.f167433a + ", uiState=" + this.f167434b + ')';
        }
    }

    /* renamed from: W */
    C45252f<C58452a> mo83412W();
}
