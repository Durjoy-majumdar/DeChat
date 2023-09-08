package eb0;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C85798u1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import f62.C75707s0;
import jc3.C98937f;
import ob0.C100321i0;
import ob0.C89137b0;
import p620nm.C89013r;

/* renamed from: eb0.j3 */
public final class C97625j3 {

    /* renamed from: b */
    public static volatile C97625j3 f286396b;

    /* renamed from: a */
    public final C75566c f286397a = new C75566c();

    /* renamed from: eb0.j3$a */
    public class C97626a implements C98937f {
        public C97626a(C97625j3 j3Var) {
        }
    }

    public C97625j3() {
        C100321i0.f293898n = new C97626a(this);
    }

    /* renamed from: a */
    public static boolean m125811a() {
        if (!MMApplicationContext.isMMProcess()) {
            return false;
        }
        return C86709a0.m107522a();
    }

    /* renamed from: b */
    public static C75566c m125812b() {
        return m125814d().f286397a;
    }

    /* renamed from: c */
    public static C75587k2 m125813c() {
        C80610p1 p1Var = C80610p1.f235824f;
        if (p1Var.f235833e == null) {
            p1Var.f235833e = C92614a.m116679d();
        }
        return p1Var.f235833e;
    }

    /* renamed from: d */
    public static C97625j3 m125814d() {
        if (f286396b == null) {
            synchronized (C97625j3.class) {
                if (f286396b == null) {
                    f286396b = new C97625j3();
                }
            }
        }
        return f286396b;
    }

    /* renamed from: e */
    public static C89137b0 m125815e() {
        C86709a0.m107528h();
        return C86709a0.m107529k().f251779b;
    }

    /* renamed from: f */
    public static C86492u2 m125816f() {
        C80610p1 p1Var = C80610p1.f235824f;
        return ((C89013r) C86312j.m106911c(C89013r.class)).mo123387kA();
    }

    @Deprecated
    /* renamed from: g */
    public static MMHandlerThread m125817g() {
        return C86709a0.m107525e();
    }

    /* renamed from: h */
    public static C85798u1 m125818h() {
        C86709a0.m107528h();
        return C86709a0.m107535s().f251803a;
    }

    /* renamed from: i */
    public static C86497v5 m125819i() {
        return ((C75707s0) C86312j.m106911c(C75707s0.class)).H60();
    }

    /* renamed from: j */
    public static boolean m125820j() {
        return C86709a0.m107523b().mo121115m();
    }

    /* renamed from: k */
    public static void m125821k() {
        C86718e.m107550n();
    }
}
