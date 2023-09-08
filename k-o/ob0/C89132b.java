package ob0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.C9486a;
import jp3.C9487b;
import junit.framework.Assert;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88643g;
import nr3.C89059e;
import te3.C49335eu3;

/* renamed from: ob0.b */
public class C89132b<_Resp extends C49335eu3> implements C9486a {

    /* renamed from: d */
    public C89135d<_Resp> f256787d = new C89135d<>(this);

    /* renamed from: e */
    public C89059e<C89134c<_Resp>> f256788e;

    /* renamed from: f */
    public C47350c f256789f;

    /* renamed from: g */
    public AtomicBoolean f256790g = new AtomicBoolean(false);

    /* renamed from: h */
    public boolean f256791h = false;

    /* renamed from: ob0.b$b */
    public class C11381b extends C89059e<C89134c<_Resp>> {
        public C11381b() {
        }

        /* renamed from: D */
        public C89059e mo11396D(C9487b bVar) {
            if ((BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) && bVar.getClass().getName().matches(".*\\$\\d*")) {
                throw new IllegalArgumentException("[DEBUG] keeper is wrong!!! leak happens [" + bVar.getClass().getName() + "], maybe you used `.lifecycle { context }` which is NOT working, you should call as `.lifecycle(context)`");
            }
            bVar.keep(C89132b.this);
            super.mo11397F(bVar);
            return this;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ C88629c mo11397F(C9487b bVar) {
            mo11396D(bVar);
            return this;
        }
    }

    /* renamed from: ob0.b$a */
    public class C89133a implements C88629c.C88630a<C89134c<_Resp>> {
        public C89133a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
            r0 = r0.f256802g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
                r6 = this;
                ob0.b r0 = ob0.C89132b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f256790g
                boolean r0 = r0.get()
                java.lang.String r1 = "MicroMsg.Cgi"
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x002c
                ob0.b r0 = ob0.C89132b.this
                ob0.b$d<_Resp> r0 = r0.f256787d
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                if (r0 == 0) goto L_0x0022
                ob0.c r0 = r0.f256802g
                if (r0 == 0) goto L_0x0022
                int r0 = r0.f127058d
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0024
            L_0x0022:
                java.lang.String r0 = ""
            L_0x0024:
                r4[r2] = r0
                java.lang.String r0 = "[call] has cancel. cgi=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r4)
                goto L_0x0064
            L_0x002c:
                lp3.b r0 = lp3.C88643g.m110545c()
                ob0.b r4 = ob0.C89132b.this
                ob0.b$d<_Resp> r4 = r4.f256787d
                r4.getClass()
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r0)
                r4.f256803h = r5
                ob0.l0$$f r4 = ob0.C89144l0.f256845a
                f40.g$a r4 = (f40.C86723g.C86724a) r4
                f40.g r4 = f40.C86723g.this
                ob0.b0 r4 = r4.f251779b
                ob0.b r5 = ob0.C89132b.this
                ob0.b$d<_Resp> r5 = r5.f256787d
                boolean r4 = r4.mo123461g(r5, r2)
                if (r4 != 0) goto L_0x0064
                java.lang.String r4 = "RunCgi doScene failed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
                if (r0 != 0) goto L_0x0061
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r1 = "Vending.QuickAccess"
                java.lang.String r2 = "dummy mario"
                kp3.C88253a.m109904c(r1, r2, r0)
                goto L_0x0064
            L_0x0061:
                r0.mo72091a(r3)
            L_0x0064:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ob0.C89132b.C89133a.call():java.lang.Object");
        }
    }

    /* renamed from: ob0.b$c */
    public static class C89134c<T extends C49335eu3> {

        /* renamed from: a */
        public int f256793a;

        /* renamed from: b */
        public int f256794b;

        /* renamed from: c */
        public String f256795c;

        /* renamed from: d */
        public T f256796d;

        /* renamed from: e */
        public C117747y f256797e;

        /* renamed from: f */
        public C89132b f256798f;

        /* renamed from: a */
        public static <T extends C49335eu3> C89134c<T> m111401a(int i, int i2, String str, T t, C117747y yVar, C89132b bVar) {
            C89134c<T> cVar = new C89134c<>();
            cVar.f256793a = i;
            cVar.f256794b = i2;
            cVar.f256795c = str;
            cVar.f256796d = t;
            cVar.f256797e = yVar;
            cVar.f256798f = bVar;
            if (bVar != null) {
                bVar.mo10094h(i, i2, str, t, yVar);
            }
            return cVar;
        }

        public String toString() {
            return "CgiBack{errType=" + this.f256793a + ", errCode=" + this.f256794b + ", errMsg='" + this.f256795c + '\'' + ", cgiFunId=" + this.f256798f.f256789f.f127055a.f127082c + ", cgiUri=" + this.f256798f.f256789f.f127057c + '}';
        }
    }

    /* renamed from: ob0.b$d */
    public static class C89135d<_Resp extends C49335eu3> extends C117747y {

        /* renamed from: d */
        public C11385n f256799d = null;

        /* renamed from: e */
        public final C117747y f256800e = this;

        /* renamed from: f */
        public final long f256801f = Util.nowMilliSecond();

        /* renamed from: g */
        public C47350c f256802g;

        /* renamed from: h */
        public WeakReference<C46888b> f256803h;

        /* renamed from: i */
        public C89132b f256804i;

        /* renamed from: j */
        public C1311n f256805j = new C89136a();

        /* renamed from: ob0.b$d$a */
        public class C89136a implements C1311n {
            public C89136a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
                r0 = r0.f256802g;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onGYNetEnd(int r9, int r10, int r11, java.lang.String r12, com.tencent.p014mm.network.C114799u r13, byte[] r14) {
                /*
                    r8 = this;
                    ob0.b$d r9 = ob0.C89132b.C89135d.this
                    ob0.b r9 = r9.f256804i
                    java.util.concurrent.atomic.AtomicBoolean r9 = r9.f256790g
                    boolean r9 = r9.get()
                    java.lang.String r13 = "MicroMsg.Cgi"
                    r14 = 0
                    r0 = 1
                    if (r9 == 0) goto L_0x0038
                    java.lang.Object[] r9 = new java.lang.Object[r0]
                    ob0.b$d r0 = ob0.C89132b.C89135d.this
                    ob0.b r0 = r0.f256804i
                    ob0.b$d<_Resp> r0 = r0.f256787d
                    if (r0 == 0) goto L_0x0025
                    ob0.c r0 = r0.f256802g
                    if (r0 == 0) goto L_0x0025
                    int r0 = r0.f127058d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    goto L_0x0027
                L_0x0025:
                    java.lang.String r0 = ""
                L_0x0027:
                    r9[r14] = r0
                    java.lang.String r14 = "[onGYNetEnd] has cancel. cgi=%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r14, r9)
                    ob0.b$d r9 = ob0.C89132b.C89135d.this
                    ob0.n r13 = r9.f256799d
                    ob0.y r9 = r9.f256800e
                    r13.onSceneEnd(r10, r11, r12, r9)
                    return
                L_0x0038:
                    ob0.b$d r9 = ob0.C89132b.C89135d.this
                    java.lang.ref.WeakReference<lp3.b> r9 = r9.f256803h
                    java.lang.Object r9 = r9.get()
                    lp3.b r9 = (lp3.C46888b) r9
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    ob0.b$d r6 = ob0.C89132b.C89135d.this
                    ob0.c r2 = r6.f256802g
                    ob0.c$d r2 = r2.f127056b
                    pe3.a r2 = r2.f127083a
                    r5 = r2
                    te3.eu3 r5 = (te3.C49335eu3) r5
                    ob0.b r7 = r6.f256804i
                    r2 = r10
                    r3 = r11
                    r4 = r12
                    ob0.b$c r2 = ob0.C89132b.C89134c.m111401a(r2, r3, r4, r5, r6, r7)
                    r1[r14] = r2
                    lp3.C88643g.m110553k(r9, r1)
                    ob0.b$d r9 = ob0.C89132b.C89135d.this
                    ob0.n r1 = r9.f256799d
                    ob0.y r9 = r9.f256800e
                    r1.onSceneEnd(r10, r11, r12, r9)
                    r9 = 6
                    java.lang.Object[] r9 = new java.lang.Object[r9]
                    ob0.b$d r1 = ob0.C89132b.C89135d.this
                    ob0.y r1 = r1.f256800e
                    int r1 = r1.hashCode()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r9[r14] = r1
                    ob0.b$d r14 = ob0.C89132b.C89135d.this
                    ob0.c r14 = r14.f256802g
                    int r14 = r14.f127058d
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    r9[r0] = r14
                    r14 = 2
                    long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                    ob0.b$d r2 = ob0.C89132b.C89135d.this
                    long r2 = r2.f256801f
                    long r0 = r0 - r2
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r9[r14] = r0
                    r14 = 3
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r9[r14] = r10
                    r10 = 4
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                    r9[r10] = r11
                    r10 = 5
                    r9[r10] = r12
                    java.lang.String r10 = "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ob0.C89132b.C89135d.C89136a.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
            }
        }

        public C89135d(C89132b bVar) {
            this.f256804i = bVar;
        }

        public int doScene(C114770g gVar, C11385n nVar) {
            this.f256799d = nVar;
            int dispatch = dispatch(gVar, this.f256802g, this.f256805j);
            Log.m105925i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", Integer.valueOf(this.f256800e.hashCode()), Integer.valueOf(this.f256802g.f127058d), Integer.valueOf(dispatch), Long.valueOf(Util.nowMilliSecond() - this.f256801f));
            if (dispatch < 0) {
                C88643g.m110553k(this.f256803h.get(), C89134c.m111401a(3, -1, "", (C49335eu3) this.f256802g.f127056b.f127083a, this, this.f256804i));
            }
            return dispatch;
        }

        public int getType() {
            return this.f256802g.f127058d;
        }

        public int securityLimitCount() {
            this.f256804i.getClass();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r0.f256802g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dead() {
        /*
            r7 = this;
            ob0.b$d<_Resp> r0 = r7.f256787d
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0014
            ob0.c r4 = r0.f256802g
            if (r4 == 0) goto L_0x0014
            int r4 = r4.f127058d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0015
        L_0x0014:
            r4 = r3
        L_0x0015:
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "MicroMsg.Cgi"
            java.lang.String r6 = "[afterDead] cgi=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r2)
            boolean r2 = r7.f256791h
            if (r2 != 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r0 == 0) goto L_0x0031
            ob0.c r0 = r0.f256802g
            if (r0 == 0) goto L_0x0031
            int r0 = r0.f127058d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0031:
            r1[r5] = r3
            java.lang.String r0 = "[cancelAfterDead] do cancel of cgi=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r1)
            r7.mo85581g()
        L_0x003b:
            r0 = 0
            r7.f256788e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C89132b.dead():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r3 = r3.f256802g;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85581g() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f256790g
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r2]
            ob0.b$d<_Resp> r3 = r4.f256787d
            if (r3 == 0) goto L_0x001b
            ob0.c r3 = r3.f256802g
            if (r3 == 0) goto L_0x001b
            int r3 = r3.f127058d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x001d
        L_0x001b:
            java.lang.String r3 = ""
        L_0x001d:
            r0[r1] = r3
            java.lang.String r1 = "MicroMsg.Cgi"
            java.lang.String r3 = "[cancel] cgi=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            ob0.b$d<_Resp> r0 = r4.f256787d
            if (r0 == 0) goto L_0x0037
            r1 = 0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.f256803h = r3
            ob0.b$d<_Resp> r0 = r4.f256787d
            ob0.C89144l0.m111426b(r0)
        L_0x0037:
            nr3.e<ob0.b$c<_Resp>> r0 = r4.f256788e
            if (r0 == 0) goto L_0x003e
            r0.mo123069i(r2)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C89132b.mo85581g():void");
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, _Resp _resp, C117747y yVar) {
    }

    /* renamed from: i */
    public synchronized C89059e<C89134c<_Resp>> mo9225i() {
        C11381b bVar;
        Assert.assertNotNull("You should set a CommReqResp!", this.f256789f);
        Assert.assertTrue("RunCgi NetSceneQueue not ready!", C89144l0.m111427c());
        bVar = null;
        if (this.f256788e == null) {
            bVar = new C11381b();
            bVar.mo123422J(new C89133a());
            this.f256788e = bVar;
        }
        return bVar;
    }

    /* renamed from: j */
    public void mo123453j(C47350c cVar) {
        this.f256789f = cVar;
        this.f256787d.f256802g = cVar;
    }
}
