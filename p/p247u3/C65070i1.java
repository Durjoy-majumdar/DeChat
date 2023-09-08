package p247u3;

import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;

/* renamed from: u3.i1 */
public class C65070i1 {

    /* renamed from: u3.i1$a */
    public static class C65071a extends C54248l.C54250b {

        /* renamed from: a */
        public final /* synthetic */ C65067h1 f187281a;

        /* renamed from: b */
        public final /* synthetic */ int f187282b;

        /* renamed from: c */
        public final /* synthetic */ C65067h1 f187283c;

        /* renamed from: d */
        public final /* synthetic */ C54248l.C54252d f187284d;

        /* renamed from: e */
        public final /* synthetic */ int f187285e;

        /* renamed from: f */
        public final /* synthetic */ int f187286f;

        public C65071a(C65067h1 h1Var, int i, C65067h1 h1Var2, C54248l.C54252d dVar, int i2, int i3) {
            this.f187281a = h1Var;
            this.f187282b = i;
            this.f187283c = h1Var2;
            this.f187284d = dVar;
            this.f187285e = i2;
            this.f187286f = i3;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            Object obj = this.f187281a.get(i + this.f187282b);
            C65067h1 h1Var = this.f187283c;
            Object obj2 = h1Var.get(i2 + h1Var.getLeadingNullCount());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f187284d.mo75048a(obj, obj2);
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            Object obj = this.f187281a.get(i + this.f187282b);
            C65067h1 h1Var = this.f187283c;
            Object obj2 = h1Var.get(i2 + h1Var.getLeadingNullCount());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f187284d.mo75049b(obj, obj2);
        }

        /* renamed from: c */
        public Object mo11467c(int i, int i2) {
            Object obj = this.f187281a.get(i + this.f187282b);
            C65067h1 h1Var = this.f187283c;
            Object obj2 = h1Var.get(i2 + h1Var.getLeadingNullCount());
            if (!(obj == null || obj2 == null)) {
                this.f187284d.getClass();
            }
            return null;
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f187286f;
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f187285e;
        }
    }

    /* renamed from: u3.i1$b */
    public static class C65072b implements C54258u {

        /* renamed from: a */
        public final int f187287a;

        /* renamed from: b */
        public final C54258u f187288b;

        public C65072b(int i, C54258u uVar) {
            this.f187287a = i;
            this.f187288b = uVar;
        }

        /* renamed from: a */
        public void mo2860a(int i, int i2) {
            this.f187288b.mo2860a(i + this.f187287a, i2);
        }

        /* renamed from: b */
        public void mo2861b(int i, int i2) {
            this.f187288b.mo2861b(i + this.f187287a, i2);
        }

        /* renamed from: c */
        public void mo2862c(int i, int i2, Object obj) {
            this.f187288b.mo2862c(i + this.f187287a, i2, obj);
        }

        /* renamed from: d */
        public void mo2863d(int i, int i2) {
            C54258u uVar = this.f187288b;
            int i3 = this.f187287a;
            uVar.mo2863d(i + i3, i2 + i3);
        }
    }

    /* renamed from: a */
    public static <T> C54248l.C54251c m76685a(C65067h1<T> h1Var, C65067h1<T> h1Var2, C54248l.C54252d<T> dVar) {
        int computeLeadingNulls = h1Var.computeLeadingNulls();
        int computeLeadingNulls2 = h1Var2.computeLeadingNulls();
        return C54248l.m60949a(new C65071a(h1Var, computeLeadingNulls, h1Var2, dVar, (h1Var.size() - computeLeadingNulls) - h1Var.computeTrailingNulls(), (h1Var2.size() - computeLeadingNulls2) - h1Var2.computeTrailingNulls()), true);
    }

    /* renamed from: b */
    public static <T> void m76686b(C54258u uVar, C65067h1<T> h1Var, C65067h1<T> h1Var2, C54248l.C54251c cVar) {
        int computeTrailingNulls = h1Var.computeTrailingNulls();
        int computeTrailingNulls2 = h1Var2.computeTrailingNulls();
        int computeLeadingNulls = h1Var.computeLeadingNulls();
        int computeLeadingNulls2 = h1Var2.computeLeadingNulls();
        if (computeTrailingNulls == 0 && computeTrailingNulls2 == 0 && computeLeadingNulls == 0 && computeLeadingNulls2 == 0) {
            cVar.mo75045a(uVar);
            return;
        }
        if (computeTrailingNulls > computeTrailingNulls2) {
            int i = computeTrailingNulls - computeTrailingNulls2;
            uVar.mo2860a(h1Var.size() - i, i);
        } else if (computeTrailingNulls < computeTrailingNulls2) {
            uVar.mo2861b(h1Var.size(), computeTrailingNulls2 - computeTrailingNulls);
        }
        if (computeLeadingNulls > computeLeadingNulls2) {
            uVar.mo2860a(0, computeLeadingNulls - computeLeadingNulls2);
        } else if (computeLeadingNulls < computeLeadingNulls2) {
            uVar.mo2861b(0, computeLeadingNulls2 - computeLeadingNulls);
        }
        if (computeLeadingNulls2 != 0) {
            cVar.mo75045a(new C65072b(computeLeadingNulls2, uVar));
        } else {
            cVar.mo75045a(uVar);
        }
    }

    /* renamed from: c */
    public static int m76687c(C54248l.C54251c cVar, C65067h1 h1Var, C65067h1 h1Var2, int i) {
        int computeLeadingNulls = h1Var.computeLeadingNulls();
        int i2 = i - computeLeadingNulls;
        int size = (h1Var.size() - computeLeadingNulls) - h1Var.computeTrailingNulls();
        if (i2 >= 0 && i2 < size) {
            for (int i3 = 0; i3 < 30; i3++) {
                int i4 = ((i3 / 2) * (i3 % 2 == 1 ? -1 : 1)) + i2;
                if (i4 >= 0 && i4 < h1Var.f187275g) {
                    if (i4 >= 0) {
                        int[] iArr = cVar.f152271b;
                        if (i4 < iArr.length) {
                            int i5 = iArr[i4];
                            int i6 = (i5 & 31) == 0 ? -1 : i5 >> 5;
                            if (i6 != -1) {
                                return i6 + h1Var2.getLeadingNullCount();
                            }
                        }
                    } else {
                        cVar.getClass();
                    }
                    throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i4 + ", old list size = " + cVar.f152271b.length);
                }
            }
        }
        return Math.max(0, Math.min(i, h1Var2.size() - 1));
    }
}
