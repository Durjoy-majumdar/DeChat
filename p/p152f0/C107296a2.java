package p152f0;

import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p009c2.C104239a;
import p009c2.C104247d;
import p009c2.C28482z;
import p152f0.C107411s2;
import p155g0.C107655y;
import p735w1.C111703v;
import p735w1.C38006x;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: f0.a2 */
public final class C107296a2 extends C87413o implements C32226l<C107655y, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C27046k0 f321027d;

    /* renamed from: e */
    public final /* synthetic */ C107404r1 f321028e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f321029f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107296a2(C27046k0 k0Var, C107404r1 r1Var, C8477a0 a0Var) {
        super(1);
        this.f321027d = k0Var;
        this.f321028e = r1Var;
        this.f321029f = a0Var;
    }

    public Object invoke(Object obj) {
        C111703v vVar;
        C111703v vVar2;
        C107401q2 q2Var;
        C107401q2 q2Var2;
        C111703v vVar3;
        C111703v vVar4;
        C107401q2 q2Var3;
        C107401q2 q2Var4;
        C107411s2.C107412a aVar;
        C107655y yVar = (C107655y) obj;
        C87412m.m108594g(yVar, "$this$commandExecutionContext");
        C28482z zVar = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.f321027d.ordinal()) {
            case 0:
                C107410s1 s1Var = C107410s1.f321379d;
                C87412m.m108594g(s1Var, "or");
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    if (!C38006x.m41694b(yVar.f322004f)) {
                        if (!yVar.mo158032e()) {
                            int e = C38006x.m41697e(yVar.f322004f);
                            yVar.mo158050w(e, e);
                            break;
                        } else {
                            int f = C38006x.m41698f(yVar.f322004f);
                            yVar.mo158050w(f, f);
                            break;
                        }
                    } else {
                        s1Var.invoke(yVar);
                        break;
                    }
                }
                break;
            case 1:
                C107417t1 t1Var = C107417t1.f321412d;
                C87412m.m108594g(t1Var, "or");
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    if (!C38006x.m41694b(yVar.f322004f)) {
                        if (!yVar.mo158032e()) {
                            int f2 = C38006x.m41698f(yVar.f322004f);
                            yVar.mo158050w(f2, f2);
                            break;
                        } else {
                            int e2 = C38006x.m41697e(yVar.f322004f);
                            yVar.mo158050w(e2, e2);
                            break;
                        }
                    } else {
                        t1Var.invoke(yVar);
                        break;
                    }
                }
                break;
            case 2:
                yVar.mo158043p();
                break;
            case 3:
                yVar.mo158035h();
                break;
            case 4:
                yVar.mo158037j();
                break;
            case 5:
                yVar.mo158040m();
                break;
            case 6:
                yVar.mo158048u();
                break;
            case 7:
                yVar.mo158045r();
                break;
            case 8:
                yVar.mo158046s();
                break;
            case 9:
                yVar.mo158047t();
                break;
            case 10:
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z && (vVar = yVar.f322001c) != null) {
                    int f3 = yVar.mo158033f(vVar, -1);
                    yVar.mo158050w(f3, f3);
                    break;
                }
            case 11:
                if (yVar.f322005g.f100413d.length() > 0) {
                    z2 = true;
                }
                if (z2 && (vVar2 = yVar.f322001c) != null) {
                    int f4 = yVar.mo158033f(vVar2, 1);
                    yVar.mo158050w(f4, f4);
                    break;
                }
            case 12:
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z && (q2Var = yVar.f322056i) != null) {
                    int y = yVar.mo158071y(q2Var, -1);
                    yVar.mo158050w(y, y);
                    break;
                }
            case 13:
                if (yVar.f322005g.f100413d.length() > 0) {
                    z2 = true;
                }
                if (z2 && (q2Var2 = yVar.f322056i) != null) {
                    int y2 = yVar.mo158071y(q2Var2, 1);
                    yVar.mo158050w(y2, y2);
                    break;
                }
            case 14:
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    yVar.mo158050w(0, 0);
                    break;
                }
                break;
            case 15:
                yVar.mo158044q();
                break;
            case 16:
                this.f321028e.f321355b.mo158017d(false);
                break;
            case 17:
                this.f321028e.f321355b.mo158025l();
                break;
            case 18:
                this.f321028e.f321355b.mo158019f();
                break;
            case 19:
                List<C104247d> x = yVar.mo158070x(C107426u1.f321431d);
                if (x != null) {
                    this.f321028e.mo157816a(x);
                    break;
                }
                break;
            case 20:
                List<C104247d> x2 = yVar.mo158070x(C107429v1.f321434d);
                if (x2 != null) {
                    this.f321028e.mo157816a(x2);
                    break;
                }
                break;
            case 21:
                List<C104247d> x3 = yVar.mo158070x(C107432w1.f321437d);
                if (x3 != null) {
                    this.f321028e.mo157816a(x3);
                    break;
                }
                break;
            case 22:
                List<C104247d> x4 = yVar.mo158070x(C107435x1.f321444d);
                if (x4 != null) {
                    this.f321028e.mo157816a(x4);
                    break;
                }
                break;
            case 23:
                List<C104247d> x5 = yVar.mo158070x(C107438y1.f321449d);
                if (x5 != null) {
                    this.f321028e.mo157816a(x5);
                    break;
                }
                break;
            case 24:
                List<C104247d> x6 = yVar.mo158070x(C107442z1.f321458d);
                if (x6 != null) {
                    this.f321028e.mo157816a(x6);
                    break;
                }
                break;
            case 25:
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    yVar.mo158050w(0, yVar.f322005g.f100413d.length());
                    break;
                }
                break;
            case 26:
                yVar.mo158034g();
                yVar.mo158049v();
                break;
            case 27:
                yVar.mo158042o();
                yVar.mo158049v();
                break;
            case 28:
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z && (vVar3 = yVar.f322001c) != null) {
                    int f5 = yVar.mo158033f(vVar3, -1);
                    yVar.mo158050w(f5, f5);
                }
                yVar.mo158049v();
                break;
            case 29:
                if (yVar.f322005g.f100413d.length() > 0) {
                    z2 = true;
                }
                if (z2 && (vVar4 = yVar.f322001c) != null) {
                    int f6 = yVar.mo158033f(vVar4, 1);
                    yVar.mo158050w(f6, f6);
                }
                yVar.mo158049v();
                break;
            case 30:
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z && (q2Var3 = yVar.f322056i) != null) {
                    int y3 = yVar.mo158071y(q2Var3, -1);
                    yVar.mo158050w(y3, y3);
                }
                yVar.mo158049v();
                break;
            case 31:
                if (yVar.f322005g.f100413d.length() > 0) {
                    z2 = true;
                }
                if (z2 && (q2Var4 = yVar.f322056i) != null) {
                    int y4 = yVar.mo158071y(q2Var4, 1);
                    yVar.mo158050w(y4, y4);
                }
                yVar.mo158049v();
                break;
            case 32:
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    yVar.mo158050w(0, 0);
                }
                yVar.mo158049v();
                break;
            case 33:
                yVar.mo158044q();
                yVar.mo158049v();
                break;
            case 34:
                yVar.mo158035h();
                yVar.mo158049v();
                break;
            case 35:
                yVar.mo158043p();
                yVar.mo158049v();
                break;
            case 36:
                yVar.mo158037j();
                yVar.mo158049v();
                break;
            case 37:
                yVar.mo158040m();
                yVar.mo158049v();
                break;
            case 38:
                yVar.mo158048u();
                yVar.mo158049v();
                break;
            case 39:
                yVar.mo158045r();
                yVar.mo158049v();
                break;
            case 40:
                yVar.mo158046s();
                yVar.mo158049v();
                break;
            case 41:
                yVar.mo158047t();
                yVar.mo158049v();
                break;
            case 42:
                yVar.f322003e.f322014a = null;
                if (yVar.f322005g.f100413d.length() <= 0) {
                    z = false;
                }
                if (z) {
                    int c = C38006x.m41695c(yVar.f322004f);
                    yVar.mo158050w(c, c);
                    break;
                }
                break;
            case 43:
                C107404r1 r1Var = this.f321028e;
                if (r1Var.f321358e) {
                    this.f321029f.f27482d = false;
                    break;
                } else {
                    r1Var.mo157816a(C26236u.m33719b(new C104239a("\n", 1)));
                    break;
                }
            case 44:
                C107404r1 r1Var2 = this.f321028e;
                if (r1Var2.f321358e) {
                    this.f321029f.f27482d = false;
                    break;
                } else {
                    r1Var2.mo157816a(C26236u.m33719b(new C104239a("\t", 1)));
                    break;
                }
            case 45:
                C107411s2 s2Var = this.f321028e.f321361h;
                if (s2Var != null) {
                    s2Var.mo157820a(C28482z.m38223a(yVar.f322055h, yVar.f322005g, yVar.f322004f, (C38006x) null, 4, (Object) null));
                }
                C107411s2 s2Var2 = this.f321028e.f321361h;
                if (s2Var2 != null) {
                    C107411s2.C107412a aVar2 = s2Var2.f321381b;
                    if (!(aVar2 == null || (aVar = aVar2.f321386a) == null)) {
                        s2Var2.f321381b = aVar;
                        s2Var2.f321383d -= aVar2.f321387b.f78285a.f100413d.length();
                        s2Var2.f321382c = new C107411s2.C107412a(s2Var2.f321382c, aVar2.f321387b);
                        zVar = aVar.f321387b;
                    }
                    if (zVar != null) {
                        this.f321028e.f321363j.invoke(zVar);
                        break;
                    }
                }
                break;
            case 46:
                C107411s2 s2Var3 = this.f321028e.f321361h;
                if (s2Var3 != null) {
                    C107411s2.C107412a aVar3 = s2Var3.f321382c;
                    if (aVar3 != null) {
                        s2Var3.f321382c = aVar3.f321386a;
                        s2Var3.f321381b = new C107411s2.C107412a(s2Var3.f321381b, aVar3.f321387b);
                        s2Var3.f321383d += aVar3.f321387b.f78285a.f100413d.length();
                        zVar = aVar3.f321387b;
                    }
                    if (zVar != null) {
                        this.f321028e.f321363j.invoke(zVar);
                        break;
                    }
                }
                break;
        }
        return C13598b0.f38549a;
    }
}
