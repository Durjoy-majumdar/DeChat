package p695tj;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45616o2;
import eb0.C45628s0;
import eb0.C75572e0;
import f40.C86709a0;
import f62.C45759r0;
import f62.C75700k0;
import g62.C32330n;
import junit.framework.Assert;
import p920uj.C78177a;
import p920uj.C78178b;

/* renamed from: tj.a */
public class C52345a {

    /* renamed from: tj.a$a */
    public class C52346a extends C78033b {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f146316d;

        public C52346a(C72996z1 z1Var) {
            this.f146316d = z1Var;
        }

        /* renamed from: a */
        public void mo73364a(int i, int i2, String str, C75572e0 e0Var) {
            C78033b bVar = (C78033b) e0Var;
            Class cls = C75700k0.class;
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(this.f146316d.getUsername());
            if (j != null && "@blacklist".equals(j.mo108782C2())) {
                C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                ((C44660i2) Ku).mo69762e0(new String[]{j.getUsername()}, "");
            }
        }
    }

    /* renamed from: a */
    public static C45616o2 m58583a(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62853E3();
        return C72996z1.m85843n5(z1Var.getUsername()) ? ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71140s0(z1Var.getUsername()) : m58587e(z1Var2);
    }

    /* renamed from: b */
    public static void m58584b(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62853E3();
        m58588f(z1Var);
    }

    /* renamed from: c */
    public static C45616o2 m58585c(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62933t4();
        C45616o2 a1 = C72996z1.m85843n5(z1Var.getUsername()) ? ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71138a1(z1Var.getUsername()) : m58587e(z1Var2);
        if (a1 != null) {
            ((C78177a) a1).mo108162a(new C52346a(z1Var));
        }
        return a1;
    }

    /* renamed from: d */
    public static void m58586d(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62933t4();
        m58588f(z1Var);
    }

    /* renamed from: e */
    public static C45616o2 m58587e(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        if (C72996z1.m85843n5(z1Var.getUsername())) {
            return null;
        }
        C78178b bVar = new C78178b(false);
        bVar.mo108163b(new C32330n(2, C45628s0.m50786m(z1Var)));
        return bVar;
    }

    /* renamed from: f */
    public static void m58588f(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        if (z1Var.mo62907i3() == 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        }
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
    }
}
