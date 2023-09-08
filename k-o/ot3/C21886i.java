package ot3;

/* renamed from: ot3.i */
public class C21886i {

    /* renamed from: a */
    public static volatile C21888b f61888a = new C21887a();

    /* renamed from: ot3.i$a */
    public class C21887a implements C21888b {

        /* renamed from: a */
        public boolean f61889a = false;

        /* renamed from: a */
        public boolean mo34912a() {
            return this.f61889a;
        }

        /* renamed from: b */
        public void mo34913b() {
            C21881e.m25083b("Soter.SoterDelegate", "soter: triggered OOM. using default imp, just record the flag", new Object[0]);
            this.f61889a = true;
        }

        public void reset() {
            this.f61889a = false;
        }
    }

    /* renamed from: ot3.i$b */
    public interface C21888b {
        /* renamed from: a */
        boolean mo34912a();

        /* renamed from: b */
        void mo34913b();

        void reset();
    }

    /* renamed from: a */
    public static void m25096a() {
        f61888a.mo34913b();
    }

    /* renamed from: b */
    public static void m25097b() {
        f61888a.reset();
    }
}
