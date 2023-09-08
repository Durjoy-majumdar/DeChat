package lp3;

import kp3.C88253a;
import lp3.C88631d;
import op3.C117877b;
import op3.C117878c;
import op3.C117879d;
import op3.C117880e;
import op3.C117882j;
import op3.C89278g;

/* renamed from: lp3.g */
public class C88643g {

    /* renamed from: a */
    public static final C88628a f255953a = new C88628a();

    /* renamed from: lp3.g$a */
    public class C88644a implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C46888b f255954a;

        public C88644a(C46888b bVar) {
            this.f255954a = bVar;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            this.f255954a.mo72091a(obj);
        }
    }

    /* renamed from: lp3.g$b */
    public class C88645b implements C88631d.C88632b<_Var> {

        /* renamed from: a */
        public final /* synthetic */ C46888b f255955a;

        public C88645b(C46888b bVar) {
            this.f255955a = bVar;
        }

        /* renamed from: a */
        public void mo1772a(_Var _var) {
            C88643g.m110553k(this.f255955a, _var);
        }
    }

    /* renamed from: a */
    public static final <_Var> void m110543a(C88631d<_Var> dVar) {
        C46888b c = m110545c();
        dVar.mo114038a(new C88645b(c)).mo123065b(new C88644a(c));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: lp3.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final lp3.C46888b m110544b() {
        /*
            lp3.f r0 = lp3.C88642f.f255951b
            java.lang.ThreadLocal<java.util.Stack<lp3.c>> r1 = r0.f255952a
            java.lang.Object r1 = r1.get()
            java.util.Stack r1 = (java.util.Stack) r1
            r2 = 0
            if (r1 != 0) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0015
            goto L_0x0024
        L_0x0015:
            java.lang.ThreadLocal<java.util.Stack<lp3.c>> r0 = r0.f255952a
            java.lang.Object r0 = r0.get()
            java.util.Stack r0 = (java.util.Stack) r0
            java.lang.Object r0 = r0.peek()
            r2 = r0
            lp3.c r2 = (lp3.C88629c) r2
        L_0x0024:
            if (r2 == 0) goto L_0x002b
            lp3.b r0 = r2.mo123059P()
            goto L_0x002d
        L_0x002b:
            lp3.a r0 = f255953a
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lp3.C88643g.m110544b():lp3.b");
    }

    /* renamed from: c */
    public static final C46888b m110545c() {
        C46888b b = m110544b();
        if (b != null) {
            b.mo72092b();
        } else {
            C88253a.m109904c("Vending.QuickAccess", "dummy mario", new Object[0]);
        }
        return b;
    }

    /* renamed from: d */
    public static final C88629c<Void> m110546d() {
        C88633e eVar = new C88633e();
        eVar.mo123077t(new Object[0]);
        return eVar;
    }

    /* renamed from: e */
    public static final <Var1> C88629c<Var1> m110547e(Var1 var1) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1);
        return eVar;
    }

    /* renamed from: f */
    public static final <Var1, Var2> C88629c<C117877b<Var1, Var2>> m110548f(Var1 var1, Var2 var2) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1, var2);
        return eVar;
    }

    /* renamed from: g */
    public static final <Var1, Var2, Var3> C88629c<C117878c<Var1, Var2, Var3>> m110549g(Var1 var1, Var2 var2, Var3 var3) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1, var2, var3);
        return eVar;
    }

    /* renamed from: h */
    public static final <Var1, Var2, Var3, Var4> C88629c<C117879d<Var1, Var2, Var3, Var4>> m110550h(Var1 var1, Var2 var2, Var3 var3, Var4 var4) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1, var2, var3, var4);
        return eVar;
    }

    /* renamed from: i */
    public static final <Var1, Var2, Var3, Var4, Var5> C88629c<C117880e<Var1, Var2, Var3, Var4, Var5>> m110551i(Var1 var1, Var2 var2, Var3 var3, Var4 var4, Var5 var5) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1, var2, var3, var4, var5);
        return eVar;
    }

    /* renamed from: j */
    public static final <Var1, Var2, Var3, Var4, Var5, Var6, Var7> C88629c<C89278g<Var1, Var2, Var3, Var4, Var5, Var6, Var7>> m110552j(Var1 var1, Var2 var2, Var3 var3, Var4 var4, Var5 var5, Var6 var6, Var7 var7) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(var1, var2, var3, var4, var5, var6, var7);
        return eVar;
    }

    /* renamed from: k */
    public static final void m110553k(C46888b bVar, Object... objArr) {
        if (bVar == null) {
            C88253a.m109904c("Vending.QuickAccess", "dummy mario", new Object[0]);
        } else if (objArr.length > 0) {
            bVar.mo72093c(objArr);
        } else {
            bVar.resume();
        }
    }

    /* renamed from: l */
    public static <$1, $2> C117877b<$1, $2> m110554l($1 _1, $2 _2) {
        return C117882j.m166284c(_1, _2);
    }
}
