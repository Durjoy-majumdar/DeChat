package p155g0;

import gy3.C8480h;
import gy3.C87412m;
import java.text.BreakIterator;
import p009c2.C104269s;
import p1166z0.C112540f;
import p152f0.C107303c1;
import p155g0.C107617f;
import p544h2.C32658d;
import p735w1.C111703v;
import p735w1.C37958a;
import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: g0.f */
public abstract class C107617f<T extends C107617f<T>> {

    /* renamed from: a */
    public final C37958a f321999a;

    /* renamed from: b */
    public final long f322000b;

    /* renamed from: c */
    public final C111703v f322001c;

    /* renamed from: d */
    public final C104269s f322002d;

    /* renamed from: e */
    public final C107622i0 f322003e;

    /* renamed from: f */
    public long f322004f;

    /* renamed from: g */
    public C37958a f322005g;

    public C107617f(C37958a aVar, long j, C111703v vVar, C104269s sVar, C107622i0 i0Var, C8480h hVar) {
        this.f321999a = aVar;
        this.f322000b = j;
        this.f322001c = vVar;
        this.f322002d = sVar;
        this.f322003e = i0Var;
        this.f322004f = j;
        this.f322005g = aVar;
    }

    /* renamed from: a */
    public final Integer mo158028a() {
        C111703v vVar = this.f322001c;
        if (vVar == null) {
            return null;
        }
        return Integer.valueOf(this.f322002d.mo145896a(vVar.mo163367e(vVar.mo163369f(this.f322002d.mo145897b(C38006x.m41697e(this.f322004f))), true)));
    }

    /* renamed from: b */
    public final Integer mo158029b() {
        C111703v vVar = this.f322001c;
        if (vVar == null) {
            return null;
        }
        return Integer.valueOf(this.f322002d.mo145896a(vVar.mo163374j(vVar.mo163369f(this.f322002d.mo145897b(C38006x.m41698f(this.f322004f))))));
    }

    /* renamed from: c */
    public final int mo158030c(C111703v vVar, int i) {
        if (i >= this.f321999a.length()) {
            return this.f321999a.length();
        }
        int length = this.f322005g.f100413d.length() - 1;
        if (i <= length) {
            length = i;
        }
        long n = vVar.mo163378n(length);
        return C38006x.m41695c(n) <= i ? mo158030c(vVar, i + 1) : this.f322002d.mo145896a(C38006x.m41695c(n));
    }

    /* renamed from: d */
    public final int mo158031d(C111703v vVar, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.f322005g.f100413d.length() - 1;
        if (i <= length) {
            length = i;
        }
        int n = (int) (vVar.mo163378n(length) >> 32);
        return n >= i ? mo158031d(vVar, i - 1) : this.f322002d.mo145896a(n);
    }

    /* renamed from: e */
    public final boolean mo158032e() {
        C111703v vVar = this.f322001c;
        return (vVar != null ? vVar.mo163377m(C38006x.m41695c(this.f322004f)) : null) != C32658d.Rtl;
    }

    /* renamed from: f */
    public final int mo158033f(C111703v vVar, int i) {
        int b = this.f322002d.mo145897b(C38006x.m41695c(this.f322004f));
        C107622i0 i0Var = this.f322003e;
        if (i0Var.f322014a == null) {
            i0Var.f322014a = Float.valueOf(vVar.mo163365c(b).f336961a);
        }
        int f = vVar.mo163369f(b) + i;
        if (f < 0) {
            return 0;
        }
        if (f >= vVar.f334372b.f334319f) {
            return this.f322005g.f100413d.length();
        }
        float d = vVar.mo163366d(f) - ((float) 1);
        Float f2 = this.f322003e.f322014a;
        C87412m.m108591d(f2);
        float floatValue = f2.floatValue();
        if ((mo158032e() && floatValue >= vVar.mo163373i(f)) || (!mo158032e() && floatValue <= vVar.mo163371h(f))) {
            return vVar.mo163367e(f, true);
        }
        return this.f322002d.mo145896a(vVar.mo163376l(C112540f.m153745a(f2.floatValue(), d)));
    }

    /* renamed from: g */
    public final T mo158034g() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158039l();
            } else {
                mo158036i();
            }
        }
        return this;
    }

    /* renamed from: h */
    public final T mo158035h() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158041n();
            } else {
                mo158038k();
            }
        }
        return this;
    }

    /* renamed from: i */
    public final T mo158036i() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            String str = this.f322005g.f100413d;
            int c = C38006x.m41695c(this.f322004f);
            C87412m.m108594g(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int following = characterInstance.following(c);
            if (following != -1) {
                mo158050w(following, following);
            }
        }
        return this;
    }

    /* renamed from: j */
    public final T mo158037j() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            int a = C107303c1.m145447a(this.f322005g.f100413d, C38006x.m41697e(this.f322004f));
            mo158050w(a, a);
        }
        return this;
    }

    /* renamed from: k */
    public final T mo158038k() {
        Integer num = null;
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            C111703v vVar = this.f322001c;
            if (vVar != null) {
                num = Integer.valueOf(mo158030c(vVar, this.f322002d.mo145897b(C38006x.m41695c(this.f322004f))));
            }
            if (num != null) {
                int intValue = num.intValue();
                mo158050w(intValue, intValue);
            }
        }
        return this;
    }

    /* renamed from: l */
    public final T mo158039l() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            String str = this.f322005g.f100413d;
            int c = C38006x.m41695c(this.f322004f);
            C87412m.m108594g(str, "<this>");
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int preceding = characterInstance.preceding(c);
            if (preceding != -1) {
                mo158050w(preceding, preceding);
            }
        }
        return this;
    }

    /* renamed from: m */
    public final T mo158040m() {
        this.f322003e.f322014a = null;
        int i = 0;
        if (this.f322005g.f100413d.length() > 0) {
            String str = this.f322005g.f100413d;
            int f = C38006x.m41698f(this.f322004f);
            C87412m.m108594g(str, "<this>");
            int i2 = f - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                if (str.charAt(i3) == 10) {
                    i = i2;
                    break;
                }
                i2 = i3;
            }
            mo158050w(i, i);
        }
        return this;
    }

    /* renamed from: n */
    public final T mo158041n() {
        Integer num = null;
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            C111703v vVar = this.f322001c;
            if (vVar != null) {
                num = Integer.valueOf(mo158031d(vVar, this.f322002d.mo145897b(C38006x.m41695c(this.f322004f))));
            }
            if (num != null) {
                int intValue = num.intValue();
                mo158050w(intValue, intValue);
            }
        }
        return this;
    }

    /* renamed from: o */
    public final T mo158042o() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158036i();
            } else {
                mo158039l();
            }
        }
        return this;
    }

    /* renamed from: p */
    public final T mo158043p() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158038k();
            } else {
                mo158041n();
            }
        }
        return this;
    }

    /* renamed from: q */
    public final T mo158044q() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            int length = this.f322005g.f100413d.length();
            mo158050w(length, length);
        }
        return this;
    }

    /* renamed from: r */
    public final T mo158045r() {
        Integer a;
        this.f322003e.f322014a = null;
        if ((this.f322005g.f100413d.length() > 0) && (a = mo158028a()) != null) {
            int intValue = a.intValue();
            mo158050w(intValue, intValue);
        }
        return this;
    }

    /* renamed from: s */
    public final T mo158046s() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158048u();
            } else {
                mo158045r();
            }
        }
        return this;
    }

    /* renamed from: t */
    public final T mo158047t() {
        this.f322003e.f322014a = null;
        if (this.f322005g.f100413d.length() > 0) {
            if (mo158032e()) {
                mo158045r();
            } else {
                mo158048u();
            }
        }
        return this;
    }

    /* renamed from: u */
    public final T mo158048u() {
        Integer b;
        this.f322003e.f322014a = null;
        if ((this.f322005g.f100413d.length() > 0) && (b = mo158029b()) != null) {
            int intValue = b.intValue();
            mo158050w(intValue, intValue);
        }
        return this;
    }

    /* renamed from: v */
    public final T mo158049v() {
        if (this.f322005g.f100413d.length() > 0) {
            long j = this.f322000b;
            int i = C38006x.f100499c;
            this.f322004f = C38007y.m41701a((int) (j >> 32), C38006x.m41695c(this.f322004f));
        }
        return this;
    }

    /* renamed from: w */
    public final void mo158050w(int i, int i2) {
        this.f322004f = C38007y.m41701a(i, i2);
    }
}
