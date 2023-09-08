package cl1;

import al1.C54123a;
import al1.C54124c;
import al1.C54130j;
import al1.C54133o;
import cj1.C54733a1;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gi1.C59464c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import n50.C61620c;
import o40.C61926c;
import o40.C61937h;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import sx3.C64175a0;
import te3.C49765hx0;
import te3.C50034jt0;
import te3.C50209l31;
import te3.C50876pu0;
import te3.C51295st0;
import te3.C51887ww2;
import te3.C52013xs0;
import te3.C64756up2;
import tf0.C64918r1;
import y50.C66505a;
import y50.C66512f;
import y50.C66514h;
import y50.C66521k0;
import zc1.C66785b;

/* renamed from: cl1.d0 */
public final class C54963d0 extends C39970c<C45795b> {

    /* renamed from: A */
    public final List<C54130j> f154047A = Collections.synchronizedList(new ArrayList());

    /* renamed from: B */
    public C51887ww2 f154048B = new C51887ww2();

    /* renamed from: C */
    public long f154049C;

    /* renamed from: D */
    public boolean f154050D;

    /* renamed from: E */
    public C54733a1 f154051E;

    /* renamed from: F */
    public int f154052F;

    /* renamed from: G */
    public boolean f154053G;

    /* renamed from: H */
    public String f154054H = "";

    /* renamed from: I */
    public final int[] f154055I = {20004};

    /* renamed from: J */
    public final int[] f154056J = {20003};

    /* renamed from: K */
    public final int[] f154057K = {20005};

    /* renamed from: L */
    public final int[] f154058L = {20016};

    /* renamed from: M */
    public final int[] f154059M = {20015};

    /* renamed from: N */
    public final int[] f154060N = {20017};

    /* renamed from: P */
    public final int[] f154061P = {20018};

    /* renamed from: Q */
    public final int[] f154062Q = {20029};

    /* renamed from: R */
    public final int[] f154063R = {20026};

    /* renamed from: S */
    public final int[] f154064S = {20028};

    /* renamed from: T */
    public final int[] f154065T = {20039};

    /* renamed from: f */
    public C58087u0<C54133o> f154066f = C58056k1.m67214a(new C54133o());

    /* renamed from: g */
    public boolean f154067g;

    /* renamed from: h */
    public final C13601g f154068h = C36568h.m40985a(new C54964a(this));

    /* renamed from: i */
    public long f154069i;

    /* renamed from: j */
    public String f154070j = "";

    /* renamed from: n */
    public List<C54130j> f154071n = Collections.synchronizedList(new ArrayList());

    /* renamed from: o */
    public List<C54130j> f154072o = Collections.synchronizedList(new ArrayList());

    /* renamed from: p */
    public C54130j f154073p;

    /* renamed from: q */
    public List<C54130j> f154074q = Collections.synchronizedList(new ArrayList());

    /* renamed from: r */
    public List<C54130j> f154075r = Collections.synchronizedList(new ArrayList());

    /* renamed from: s */
    public List<C54130j> f154076s = Collections.synchronizedList(new ArrayList());

    /* renamed from: t */
    public final LiveMutableData<C59464c> f154077t = new LiveMutableData<>();

    /* renamed from: u */
    public int f154078u;

    /* renamed from: v */
    public int f154079v = -1;

    /* renamed from: w */
    public boolean f154080w;

    /* renamed from: x */
    public boolean f154081x = true;

    /* renamed from: y */
    public final HashMap<String, Integer> f154082y = new HashMap<>();

    /* renamed from: z */
    public C58087u0<String> f154083z = C58056k1.m67214a("");

    /* renamed from: cl1.d0$a */
    public static final class C54964a extends C87413o implements C32224a<C54130j> {

        /* renamed from: d */
        public final /* synthetic */ C54963d0 f154084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54964a(C54963d0 d0Var) {
            super(0);
            this.f154084d = d0Var;
        }

        public Object invoke() {
            Class cls = C54991o.class;
            String str = ((C55001u) this.f154084d.business(C55001u.class)).f154419p.f182319n;
            String str2 = ((C54991o) this.f154084d.business(cls)).f154345o;
            C58969q b = C58961d.f168673a.mo84155b(((C54991o) this.f154084d.business(cls)).f154345o);
            FinderContact finderContact = null;
            String nickname = b != null ? b.getNickname() : null;
            C49765hx0 hx02 = new C49765hx0();
            FinderObject finderObject = ((C54991o) this.f154084d.business(cls)).f154341n;
            if (finderObject != null) {
                finderContact = finderObject.contact;
            }
            hx02.f134919d = finderContact;
            hx02.f134926n = 3;
            C13598b0 b0Var = C13598b0.f38549a;
            return new C54130j(str, "", str2, nickname, 0, (String) null, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, 0, hx02, false, (Boolean) null, ((C54991o) this.f154084d.business(cls)).mo75973N3(), 0, 0, 7208896, (C8480h) null);
        }
    }

    /* renamed from: cl1.d0$b */
    public static final class C54965b extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C52013xs0 f154085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54965b(C52013xs0 xs02) {
            super(1);
            this.f154085d = xs02;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r0.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r2) {
            /*
                r1 = this;
                al1.j r2 = (al1.C54130j) r2
                java.lang.String r2 = r2.f151999c
                te3.xs0 r0 = r1.f154085d
                te3.hx0 r0 = r0.f144914s
                if (r0 == 0) goto L_0x0011
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
                if (r0 == 0) goto L_0x0011
                java.lang.String r0 = r0.username
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r0)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.C54965b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cl1.d0$c */
    public static final class C54966c extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C52013xs0 f154086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54966c(C52013xs0 xs02) {
            super(1);
            this.f154086d = xs02;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r0.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r2) {
            /*
                r1 = this;
                al1.j r2 = (al1.C54130j) r2
                java.lang.String r2 = r2.f151999c
                te3.xs0 r0 = r1.f154086d
                te3.hx0 r0 = r0.f144914s
                if (r0 == 0) goto L_0x0011
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
                if (r0 == 0) goto L_0x0011
                java.lang.String r0 = r0.username
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r0)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.C54966c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cl1.d0$d */
    public static final class C54967d extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f154087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54967d(String str) {
            super(1);
            this.f154087d = str;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(Util.isEqual(((C54130j) obj).f152002f, this.f154087d));
        }
    }

    /* renamed from: cl1.d0$e */
    public static final class C54968e extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public static final C54968e f154088d = new C54968e();

        public C54968e() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C54130j) obj).f152016t, Boolean.TRUE));
        }
    }

    /* renamed from: cl1.d0$f */
    public static final class C54969f extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C54130j f154089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54969f(C54130j jVar) {
            super(1);
            this.f154089d = jVar;
        }

        public Object invoke(Object obj) {
            C54130j jVar = (C54130j) obj;
            C54130j jVar2 = this.f154089d;
            return Boolean.valueOf(Util.isEqual(jVar2 != null ? jVar2.f151997a : null, jVar.f151997a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54963d0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: F3 */
    public final C54733a1 mo75900F3() {
        return this.f154051E;
    }

    /* renamed from: G3 */
    public final C54130j mo75901G3() {
        return this.f154073p;
    }

    /* renamed from: I3 */
    public final boolean mo75902I3() {
        return this.f154079v == 1;
    }

    /* renamed from: J3 */
    public final int mo75903J3() {
        return this.f154078u;
    }

    /* renamed from: K3 */
    public final List<C54130j> mo75904K3() {
        return this.f154076s;
    }

    /* renamed from: L3 */
    public final List<C54130j> mo75905L3() {
        return this.f154071n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0040 A[SYNTHETIC] */
    /* renamed from: M3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo75906M3() {
        /*
            r10 = this;
            java.util.List<al1.j> r0 = r10.f154074q
            java.lang.String r1 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r0, r1)
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x009c }
        L_0x0011:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009c }
            r4 = 1
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009c }
            r5 = r3
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x009c }
            java.lang.Boolean r5 = r5.f152016t     // Catch:{ all -> 0x009c }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            boolean r5 = gy3.C87412m.m108589b(r5, r6)     // Catch:{ all -> 0x009c }
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0011
            r1.add(r3)     // Catch:{ all -> 0x009c }
            goto L_0x0011
        L_0x002e:
            monitor-exit(r0)
            java.util.List<al1.j> r0 = r10.f154076s
            java.lang.String r2 = "linkMicUserInfoList"
            gy3.C87412m.m108593f(r0, r2)
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0040:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0099 }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x0099 }
            int r7 = r6.f152008l     // Catch:{ all -> 0x0099 }
            r8 = 0
            if (r7 == r4) goto L_0x0058
            r9 = 2
            if (r7 != r9) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r7 = 0
            goto L_0x0059
        L_0x0058:
            r7 = 1
        L_0x0059:
            if (r7 == 0) goto L_0x0062
            boolean r6 = r1.contains(r6)     // Catch:{ all -> 0x0099 }
            if (r6 != 0) goto L_0x0062
            r8 = 1
        L_0x0062:
            if (r8 == 0) goto L_0x0040
            r2.add(r5)     // Catch:{ all -> 0x0099 }
            goto L_0x0040
        L_0x0068:
            monitor-exit(r0)
            java.lang.String r0 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "linkingAndWaitingAudienceSize: linkSize:"
            r3.append(r4)
            int r4 = r1.size()
            r3.append(r4)
            java.lang.String r4 = ", waitSize:"
            r3.append(r4)
            int r4 = r2.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            int r0 = r1.size()
            int r1 = r2.size()
            int r0 = r0 + r1
            return r0
        L_0x0099:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x009c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75906M3():int");
    }

    /* renamed from: N3 */
    public final int mo75907N3() {
        boolean u = C61926c.m72696u(((C54991o) business(C54991o.class)).f154388y0, 268435456);
        Log.m105924i("MMFinder.LiveLinkMicSlice", "[isEnableMulitMicWithEightAudience] isEnable = " + u);
        return u ? 8 : 3;
    }

    /* renamed from: O3 */
    public final int mo75908O3() {
        ArrayList arrayList;
        List<C54130j> list = this.f154072o;
        C87412m.m108593f(list, "newLinkMicUserList");
        synchronized (list) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (!((C54130j) next).f152004h) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: P3 */
    public final int mo75909P3() {
        ArrayList arrayList;
        List<C54130j> list = this.f154072o;
        C87412m.m108593f(list, "newLinkMicUserList");
        synchronized (list) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (((C54130j) next).f152004h) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: Q3 */
    public final int mo75910Q3() {
        return this.f154052F;
    }

    /* renamed from: R3 */
    public final boolean mo75911R3() {
        return this.f154053G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r0.f169896a;
     */
    /* renamed from: T3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo75912T3() {
        /*
            r4 = this;
            al1.j r0 = r4.f154073p
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r0 = r4.f154077t
            java.lang.Object r0 = r0.getValue()
            gi1.c r0 = (gi1.C59464c) r0
            if (r0 == 0) goto L_0x0019
            java.util.LinkedList<gi1.a> r0 = r0.f169896a
            if (r0 == 0) goto L_0x0019
            int r0 = r0.size()
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r3 = 5
            if (r0 < r3) goto L_0x0031
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r0 = r4.f154077t
            java.lang.Object r0 = r0.getValue()
            gi1.c r0 = (gi1.C59464c) r0
            if (r0 == 0) goto L_0x002d
            int r0 = r0.f169898c
            if (r0 != 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75912T3():boolean");
    }

    /* renamed from: U3 */
    public final boolean mo75913U3() {
        Class cls = C54963d0.class;
        return ((C54963d0) business(cls)).f154078u == 1 || ((C54963d0) business(cls)).f154078u == 2 || ((C54963d0) business(cls)).f154078u == 5;
    }

    /* renamed from: V3 */
    public final boolean mo75914V3() {
        Class cls = C54963d0.class;
        return ((C54963d0) business(cls)).f154078u == 3 || ((C54963d0) business(cls)).f154078u == 4;
    }

    /* renamed from: W3 */
    public final void mo75915W3(C66505a aVar) {
        C66514h hVar = C66521k0.f191361a;
        if (hVar != null) {
            hVar.onAcceptLiveMic(aVar);
        }
        ((C58052j1) this.f154066f).setValue(new C54123a(aVar));
    }

    /* renamed from: X3 */
    public final void mo75916X3(C66512f fVar) {
        C66514h hVar = C66521k0.f191361a;
        if (hVar != null) {
            hVar.onCloseLiveMic(fVar);
        }
        ((C58052j1) this.f154066f).setValue(new C54124c(fVar));
    }

    /* renamed from: Y3 */
    public final void mo75917Y3(C54130j jVar) {
        if (jVar != null) {
            List<C54130j> list = this.f154076s;
            C87412m.m108593f(list, "linkMicUserInfoList");
            C61926c.m72700y(list, new C54969f(jVar));
            this.f154076s.add(jVar);
        }
    }

    /* renamed from: Z3 */
    public final void mo75918Z3(C54130j jVar) {
        this.f154073p = jVar;
    }

    /* renamed from: a4 */
    public final void mo75919a4(int i) {
        this.f154078u = i;
    }

    /* renamed from: b4 */
    public final List<C50034jt0> mo75920b4(List<? extends C50209l31> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C50209l31 l312 : list) {
            C50034jt0 jt02 = new C50034jt0();
            jt02.f136310d = l312.f137145d;
            jt02.f136311e = l312.f137146e;
            jt02.f136312f = l312.f137147f;
            jt02.f136313g = l312.f137148g;
            jt02.f136314h = l312.f137149h;
            arrayList.add(jt02);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0040 A[SYNTHETIC] */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75921c3(java.util.LinkedList<te3.C52013xs0> r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Class<tf0.r1> r0 = tf0.C64918r1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.r1 r0 = (tf0.C64918r1) r0
            boolean r0 = r0.mo89039GD()
            if (r0 == 0) goto L_0x0130
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r18.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()
            r5 = r4
            te3.xs0 r5 = (te3.C52013xs0) r5
            int[] r6 = r1.f154063R
            int r5 = r5.f144903e
            boolean r5 = sx3.C110823p.m151008x(r6, r5)
            if (r5 == 0) goto L_0x001e
            r2.add(r4)
            goto L_0x001e
        L_0x0039:
            r0.addAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r2.next()
            r3 = r0
            te3.xs0 r3 = (te3.C52013xs0) r3
            te3.et0 r0 = new te3.et0
            r0.<init>()
            pe3.b r4 = r3.f144906h
            r5 = 0
            if (r4 == 0) goto L_0x005c
            byte[] r4 = r4.mo123703f()
            goto L_0x005d
        L_0x005c:
            r4 = r5
        L_0x005d:
            if (r4 != 0) goto L_0x0061
        L_0x005f:
            r0 = r5
            goto L_0x0075
        L_0x0061:
            r0.parseFrom(r4)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0075
        L_0x0065:
            r0 = move-exception
            r4 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6 = 0
            r0[r6] = r4
            java.lang.String r4 = "safeParser"
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r6, r0)
            goto L_0x005f
        L_0x0075:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[Battle] receive battleApplyMsg. sessionId:"
            r4.append(r6)
            java.lang.String r6 = r3.f144909n
            r4.append(r6)
            java.lang.String r6 = " micId:"
            r4.append(r6)
            if (r0 == 0) goto L_0x008e
            java.lang.String r6 = r0.f133109d
            goto L_0x008f
        L_0x008e:
            r6 = r5
        L_0x008f:
            r4.append(r6)
            java.lang.String r6 = " battleSeq:"
            r4.append(r6)
            if (r0 == 0) goto L_0x00a0
            long r6 = r0.f133111f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x00a1
        L_0x00a0:
            r6 = r5
        L_0x00a1:
            r4.append(r6)
            java.lang.String r6 = " curPkUser:"
            r4.append(r6)
            al1.j r6 = r1.f154073p
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            if (r0 == 0) goto L_0x0040
            al1.j r4 = r1.f154073p
            if (r4 != 0) goto L_0x00c3
            java.lang.String r0 = "[Battle] receive battleApplyMsg skip. curPkUser is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return
        L_0x00c3:
            te3.hx0 r7 = r3.f144914s
            if (r7 == 0) goto L_0x00ce
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x00ce
            java.lang.String r7 = r7.username
            goto L_0x00cf
        L_0x00ce:
            r7 = r5
        L_0x00cf:
            java.lang.String r8 = r4.f151999c
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)
            if (r7 != 0) goto L_0x0100
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[Battle] receive battleApplyMsg skip. invalid username from:"
            r0.append(r2)
            te3.hx0 r2 = r3.f144914s
            if (r2 == 0) goto L_0x00eb
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x00eb
            java.lang.String r5 = r2.username
        L_0x00eb:
            r0.append(r5)
            java.lang.String r2 = " pkUser:"
            r0.append(r2)
            java.lang.String r2 = r4.f151999c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return
        L_0x0100:
            cj1.a1 r4 = r1.f154051E
            if (r4 == 0) goto L_0x0107
            long r4 = r4.f153389b
            goto L_0x0109
        L_0x0107:
            r4 = 0
        L_0x0109:
            long r9 = r0.f133111f
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0115
            java.lang.String r0 = "[Battle] receive battleApplyMsg skip. invalid seq"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return
        L_0x0115:
            cj1.a1 r0 = new cj1.a1
            java.lang.String r8 = r3.f144909n
            r11 = 0
            r12 = -1
            r13 = 1
            r14 = 0
            r15 = 32
            r16 = 0
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16)
            r1.f154051E = r0
            y50.h r0 = y50.C66521k0.f191361a
            if (r0 == 0) goto L_0x0040
            r0.onBattleApply()
            goto L_0x0040
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75921c3(java.util.LinkedList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x003e A[SYNTHETIC] */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75922d3(java.util.LinkedList<te3.C52013xs0> r7) {
        /*
            r6 = this;
            java.lang.Class<tf0.r1> r0 = tf0.C64918r1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.r1 r0 = (tf0.C64918r1) r0
            boolean r0 = r0.mo89039GD()
            if (r0 == 0) goto L_0x00f5
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x001c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r7.next()
            r3 = r2
            te3.xs0 r3 = (te3.C52013xs0) r3
            int[] r4 = r6.f154064S
            int r3 = r3.f144903e
            boolean r3 = sx3.C110823p.m151008x(r4, r3)
            if (r3 == 0) goto L_0x001c
            r1.add(r2)
            goto L_0x001c
        L_0x0037:
            r0.addAll(r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x003e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r7.next()
            te3.xs0 r0 = (te3.C52013xs0) r0
            te3.pt0 r1 = new te3.pt0
            r1.<init>()
            pe3.b r2 = r0.f144906h
            r3 = 0
            if (r2 == 0) goto L_0x0059
            byte[] r2 = r2.mo123703f()
            goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            r4 = 0
            if (r2 != 0) goto L_0x005f
        L_0x005d:
            r1 = r3
            goto L_0x0071
        L_0x005f:
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0071
        L_0x0063:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r1 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r5, r2)
            goto L_0x005d
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "[Battle] receive battleCloseMsg. sessionId:"
            r2.append(r5)
            java.lang.String r5 = r0.f144909n
            r2.append(r5)
            java.lang.String r5 = " scene:"
            r2.append(r5)
            if (r1 == 0) goto L_0x008e
            int r5 = r1.f139948d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x008f
        L_0x008e:
            r5 = r3
        L_0x008f:
            r2.append(r5)
            java.lang.String r5 = " curPkUser:"
            r2.append(r5)
            al1.j r5 = r6.f154073p
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r1 == 0) goto L_0x003e
            al1.j r1 = r6.f154073p
            if (r1 != 0) goto L_0x00b1
            java.lang.String r7 = "[Battle] receive battleCloseMsg skip. curPkUser is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
            return
        L_0x00b1:
            cj1.a1 r1 = r6.f154051E
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = r1.f153388a
            if (r1 != 0) goto L_0x00bd
        L_0x00b9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L_0x00bd:
            java.lang.String r2 = r0.f144909n
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x00ea
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "[Battle] receive battleCloseMsg skip. invalid session_id curBattleId:"
            r7.append(r1)
            cj1.a1 r1 = r6.f154051E
            if (r1 == 0) goto L_0x00d5
            java.lang.String r3 = r1.f153388a
        L_0x00d5:
            r7.append(r3)
            java.lang.String r1 = " appMsg.sessionId:"
            r7.append(r1)
            java.lang.String r0 = r0.f144909n
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
            return
        L_0x00ea:
            r6.f154051E = r3
            y50.h r0 = y50.C66521k0.f191361a
            if (r0 == 0) goto L_0x003e
            r0.onBattleClose()
            goto L_0x003e
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75922d3(java.util.LinkedList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75923e3(java.util.LinkedList<te3.C52013xs0> r37) {
        /*
            r36 = this;
            r1 = r36
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.Class<tf0.r1> r4 = tf0.C64918r1.class
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r37.iterator()
        L_0x0016:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0031
            java.lang.Object r7 = r6.next()
            r8 = r7
            te3.xs0 r8 = (te3.C52013xs0) r8
            int[] r9 = r1.f154062Q
            int r8 = r8.f144903e
            boolean r8 = sx3.C110823p.m151008x(r9, r8)
            if (r8 == 0) goto L_0x0016
            r5.add(r7)
            goto L_0x0016
        L_0x0031:
            r0.addAll(r5)
            java.util.Iterator r5 = r0.iterator()
        L_0x0038:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05de
            java.lang.Object r0 = r5.next()
            te3.xs0 r0 = (te3.C52013xs0) r0
            te3.kt0 r6 = new te3.kt0
            r6.<init>()
            pe3.b r0 = r0.f144906h
            if (r0 == 0) goto L_0x0052
            byte[] r0 = r0.mo123703f()
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r8 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0058
            goto L_0x0069
        L_0x0058:
            r6.parseFrom(r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x006a
        L_0x005c:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r6
            java.lang.String r6 = "safeParser"
            java.lang.String r10 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r10, r0)
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x006f
            te3.iw0 r0 = r6.f137034e
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            di3.d r6 = di3.C86312j.m106911c(r4)
            tf0.r1 r6 = (tf0.C64918r1) r6
            boolean r6 = r6.mo89049b5()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[Battle] receive battleStatusMsg. isAnchor:"
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = " battleId:"
            r10.append(r11)
            if (r0 == 0) goto L_0x0091
            java.lang.String r11 = r0.f135698d
            goto L_0x0092
        L_0x0091:
            r11 = 0
        L_0x0092:
            r10.append(r11)
            java.lang.String r11 = " battleStatusScene:"
            r10.append(r11)
            if (r0 == 0) goto L_0x00a3
            int r11 = r0.f135700f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            r10.append(r11)
            java.lang.String r11 = " battleStatusSeq:"
            r10.append(r11)
            if (r0 == 0) goto L_0x00b5
            long r11 = r0.f135699e
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            goto L_0x00b6
        L_0x00b5:
            r11 = 0
        L_0x00b6:
            r10.append(r11)
            java.lang.String r11 = " battleLeftTime:"
            r10.append(r11)
            if (r0 == 0) goto L_0x00c7
            int r11 = r0.f135701g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            r10.append(r11)
            java.lang.String r11 = " battleResult:"
            r10.append(r11)
            if (r0 == 0) goto L_0x00d9
            int r11 = r0.f135703i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00da
        L_0x00d9:
            r11 = 0
        L_0x00da:
            r10.append(r11)
            java.lang.String r11 = " players.size:"
            r10.append(r11)
            if (r0 == 0) goto L_0x00f1
            java.util.LinkedList<te3.ae3> r11 = r0.f135702h
            if (r11 == 0) goto L_0x00f1
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            r10.append(r11)
            java.lang.String r11 = " curLiveRoomData?.curLinkMicUser:"
            r10.append(r11)
            al1.j r11 = r1.f154073p
            r10.append(r11)
            java.lang.String r11 = " curLiveRoomData?.curBattle:"
            r10.append(r11)
            androidx.lifecycle.i0 r11 = r1.business(r3)
            cl1.d0 r11 = (cl1.C54963d0) r11
            cj1.a1 r11 = r11.f154051E
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            di3.d r10 = di3.C86312j.m106911c(r4)
            tf0.r1 r10 = (tf0.C64918r1) r10
            if (r0 == 0) goto L_0x0123
            java.util.LinkedList<te3.ae3> r12 = r0.f135702h
            goto L_0x0124
        L_0x0123:
            r12 = 0
        L_0x0124:
            r10.Jd0(r12)
            if (r0 == 0) goto L_0x05ce
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "[Battle] receive battle status msg:[battle_id:"
            r10.append(r12)
            java.lang.String r12 = r0.f135698d
            r10.append(r12)
            java.lang.String r12 = ", battle_seq"
            r10.append(r12)
            long r13 = r0.f135699e
            r10.append(r13)
            java.lang.String r13 = ", battle_leftTime:"
            r10.append(r13)
            int r13 = r0.f135701g
            r10.append(r13)
            java.lang.String r13 = " player_info.size:"
            r10.append(r13)
            java.util.LinkedList<te3.ae3> r13 = r0.f135702h
            int r13 = r13.size()
            r10.append(r13)
            r13 = 93
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.lang.String r10 = ", localBattleId:"
            java.lang.String r13 = "[Battle] receive battleStatusMsg skip. invalid battleId. recBattleId:"
            java.lang.String r14 = "[Battle] receive start battle status msg:[battle_id:"
            java.lang.String r15 = "[Battle] receive finish battle status msg:[battle_id:"
            java.lang.String r7 = "[Battle] receive unknown status msg:"
            java.lang.String r8 = "battleInfo.player_info"
            java.lang.String r9 = " curBattle:"
            r17 = r5
            java.lang.String r5 = " battleUser:"
            r18 = r3
            java.lang.String r3 = "[Battle] receive battleStatusMsg skip. battleUser is null"
            r19 = r14
            java.lang.String r14 = "[Battle] receive battleStatusMsg skip. invalid seq"
            r20 = 0
            r22 = 1000(0x3e8, double:4.94E-321)
            r24 = r4
            r4 = 10
            if (r6 == 0) goto L_0x0387
            androidx.lifecycle.i0 r6 = r1.business(r2)
            cl1.o r6 = (cl1.C54991o) r6
            r25 = r14
            int r14 = r0.f135700f
            if (r14 == r4) goto L_0x02b9
            r4 = 20
            if (r14 == r4) goto L_0x01b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            int r0 = r0.f135700f
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05c9
        L_0x01b0:
            java.util.LinkedList<te3.ae3> r4 = r0.f135702h
            gy3.C87412m.m108593f(r4, r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x01b9:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01e0
            java.lang.Object r7 = r4.next()
            r14 = r7
            te3.ae3 r14 = (te3.C48701ae3) r14
            java.lang.String r14 = r14.f130472d
            androidx.lifecycle.i0 r16 = r1.business(r2)
            r19 = r4
            r4 = r16
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154345o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r4)
            r14 = 1
            r4 = r4 ^ r14
            if (r4 == 0) goto L_0x01dd
            goto L_0x01e1
        L_0x01dd:
            r4 = r19
            goto L_0x01b9
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            te3.ae3 r7 = (te3.C48701ae3) r7
            cj1.a1 r4 = r1.f154051E
            if (r4 == 0) goto L_0x01ee
            java.lang.String r6 = r6.f154345o
            al1.g r4 = r4.mo75623b(r6)
            goto L_0x01ef
        L_0x01ee:
            r4 = 0
        L_0x01ef:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            java.lang.String r14 = r0.f135698d
            r6.append(r14)
            r6.append(r12)
            long r14 = r0.f135699e
            r6.append(r14)
            java.lang.String r12 = "] localBattleUser:"
            r6.append(r12)
            r6.append(r4)
            r6.append(r9)
            cj1.a1 r9 = r1.f154051E
            r6.append(r9)
            r6.append(r5)
            if (r7 == 0) goto L_0x021c
            java.lang.String r5 = r7.f130472d
            goto L_0x021d
        L_0x021c:
            r5 = 0
        L_0x021d:
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            if (r7 != 0) goto L_0x022e
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r3)
            goto L_0x05c9
        L_0x022e:
            if (r4 != 0) goto L_0x0237
            java.lang.String r0 = "[Battle] receive battleStatusMsg skip. waitBattleUser is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05c9
        L_0x0237:
            java.lang.String r3 = r0.f135698d
            cj1.a1 r4 = r1.f154051E
            if (r4 == 0) goto L_0x0240
            java.lang.String r4 = r4.f153388a
            goto L_0x0241
        L_0x0240:
            r4 = 0
        L_0x0241:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r3 != 0) goto L_0x026b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r0 = r0.f135698d
            r3.append(r0)
            r3.append(r10)
            cj1.a1 r0 = r1.f154051E
            if (r0 == 0) goto L_0x025e
            java.lang.String r7 = r0.f153388a
            goto L_0x025f
        L_0x025e:
            r7 = 0
        L_0x025f:
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05c9
        L_0x026b:
            cj1.a1 r3 = r1.f154051E
            if (r3 == 0) goto L_0x0273
            long r4 = r3.f153389b
            r20 = r4
        L_0x0273:
            long r4 = r0.f135699e
            int r6 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0280
            r6 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r6)
            goto L_0x05c9
        L_0x0280:
            if (r3 == 0) goto L_0x0289
            int r4 = r0.f135703i
            r5 = 3
            r3.f153392e = r5
            r3.f153391d = r4
        L_0x0289:
            if (r3 != 0) goto L_0x028c
            goto L_0x0290
        L_0x028c:
            int r4 = r0.f135701g
            r3.f153390c = r4
        L_0x0290:
            if (r3 == 0) goto L_0x029a
            java.util.LinkedList<te3.ae3> r4 = r0.f135702h
            gy3.C87412m.m108593f(r4, r8)
            r3.mo75625d(r4)
        L_0x029a:
            y50.h r3 = y50.C66521k0.f191361a
            if (r3 == 0) goto L_0x02a1
            r3.onBattleEnd()
        L_0x02a1:
            di3.d r3 = di3.C86312j.m106911c(r24)
            tf0.r1 r3 = (tf0.C64918r1) r3
            int r0 = r0.f135701g
            long r4 = (long) r0
            long r4 = r4 * r22
            cj1.a1 r0 = r1.f154051E
            if (r0 == 0) goto L_0x02b3
            java.lang.String r7 = r0.f153388a
            goto L_0x02b4
        L_0x02b3:
            r7 = 0
        L_0x02b4:
            r3.Ju0(r4, r7)
            goto L_0x05c9
        L_0x02b9:
            r6 = r25
            java.util.LinkedList<te3.ae3> r4 = r0.f135702h
            gy3.C87412m.m108593f(r4, r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x02c4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02e4
            java.lang.Object r7 = r4.next()
            r8 = r7
            te3.ae3 r8 = (te3.C48701ae3) r8
            java.lang.String r8 = r8.f130472d
            androidx.lifecycle.i0 r9 = r1.business(r2)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.String r9 = r9.f154345o
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r9)
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x02c4
            goto L_0x02e5
        L_0x02e4:
            r7 = 0
        L_0x02e5:
            te3.ae3 r7 = (te3.C48701ae3) r7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r14 = r19
            r4.append(r14)
            java.lang.String r8 = r0.f135698d
            r4.append(r8)
            r4.append(r12)
            long r8 = r0.f135699e
            r4.append(r8)
            java.lang.String r8 = "] curBattle:"
            r4.append(r8)
            cj1.a1 r8 = r1.f154051E
            r4.append(r8)
            r4.append(r5)
            if (r7 == 0) goto L_0x0310
            java.lang.String r5 = r7.f130472d
            goto L_0x0311
        L_0x0310:
            r5 = 0
        L_0x0311:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            if (r7 != 0) goto L_0x0322
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r3)
            goto L_0x05c9
        L_0x0322:
            java.lang.String r3 = r0.f135698d
            cj1.a1 r4 = r1.f154051E
            if (r4 == 0) goto L_0x032b
            java.lang.String r4 = r4.f153388a
            goto L_0x032c
        L_0x032b:
            r4 = 0
        L_0x032c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r3 != 0) goto L_0x0356
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r0 = r0.f135698d
            r3.append(r0)
            r3.append(r10)
            cj1.a1 r0 = r1.f154051E
            if (r0 == 0) goto L_0x0349
            java.lang.String r7 = r0.f153388a
            goto L_0x034a
        L_0x0349:
            r7 = 0
        L_0x034a:
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05c9
        L_0x0356:
            cj1.a1 r3 = r1.f154051E
            if (r3 == 0) goto L_0x035e
            long r4 = r3.f153389b
            r20 = r4
        L_0x035e:
            long r4 = r0.f135699e
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0369
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r6)
            goto L_0x05c9
        L_0x0369:
            if (r3 == 0) goto L_0x036e
            r4 = 2
            r3.f153392e = r4
        L_0x036e:
            if (r3 != 0) goto L_0x0371
            goto L_0x0375
        L_0x0371:
            int r0 = r0.f135701g
            r3.f153390c = r0
        L_0x0375:
            y50.h r0 = y50.C66521k0.f191361a
            if (r0 == 0) goto L_0x037c
            r0.onBattleStart()
        L_0x037c:
            di3.d r0 = di3.C86312j.m106911c(r24)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89043Pa()
            goto L_0x05c9
        L_0x0387:
            r6 = r14
            r14 = r19
            fj1.b r4 = fj1.C45795b.f123698n
            if (r4 == 0) goto L_0x05c9
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            r25 = r2
            int r2 = r0.f135700f
            r26 = r14
            java.lang.String r14 = "] curPkUser:"
            r27 = r6
            r6 = 10
            if (r2 == r6) goto L_0x04e0
            r6 = 20
            if (r2 == r6) goto L_0x03bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            int r0 = r0.f135700f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05cb
        L_0x03bc:
            java.util.LinkedList<te3.ae3> r2 = r0.f135702h
            gy3.C87412m.m108593f(r2, r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x03c5:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x03e4
            java.lang.Object r6 = r2.next()
            r7 = r6
            te3.ae3 r7 = (te3.C48701ae3) r7
            java.lang.String r7 = r7.f130472d
            r19 = r2
            java.lang.String r2 = r4.f154345o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r2)
            r7 = 1
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x03e1
            goto L_0x03e5
        L_0x03e1:
            r2 = r19
            goto L_0x03c5
        L_0x03e4:
            r6 = 0
        L_0x03e5:
            te3.ae3 r6 = (te3.C48701ae3) r6
            r2 = r18
            androidx.lifecycle.i0 r4 = r4.business(r2)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            java.lang.String r15 = r0.f135698d
            r7.append(r15)
            r7.append(r12)
            r15 = r13
            long r12 = r0.f135699e
            r7.append(r12)
            r7.append(r14)
            r7.append(r4)
            r7.append(r9)
            cj1.a1 r4 = r1.f154051E
            r7.append(r4)
            r7.append(r5)
            if (r6 == 0) goto L_0x041d
            java.lang.String r4 = r6.f130472d
            goto L_0x041e
        L_0x041d:
            r4 = 0
        L_0x041e:
            r7.append(r4)
            java.lang.String r4 = " battleInfo.time_left:"
            r7.append(r4)
            int r4 = r0.f135701g
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            if (r6 != 0) goto L_0x0439
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r3)
            goto L_0x05d5
        L_0x0439:
            java.lang.String r3 = r0.f135698d
            cj1.a1 r4 = r1.f154051E
            if (r4 == 0) goto L_0x0442
            java.lang.String r4 = r4.f153388a
            goto L_0x0443
        L_0x0442:
            r4 = 0
        L_0x0443:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            if (r3 != 0) goto L_0x046e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r15
            r3.append(r4)
            java.lang.String r0 = r0.f135698d
            r3.append(r0)
            r3.append(r10)
            cj1.a1 r0 = r1.f154051E
            if (r0 == 0) goto L_0x0461
            java.lang.String r7 = r0.f153388a
            goto L_0x0462
        L_0x0461:
            r7 = 0
        L_0x0462:
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            goto L_0x05d5
        L_0x046e:
            cj1.a1 r3 = r1.f154051E
            if (r3 == 0) goto L_0x0476
            long r4 = r3.f153389b
            r20 = r4
        L_0x0476:
            long r4 = r0.f135699e
            int r6 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0483
            r6 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r6)
            goto L_0x05d5
        L_0x0483:
            if (r3 == 0) goto L_0x0493
            int r4 = r3.f153392e
            r5 = 4
            if (r4 != r5) goto L_0x048c
            r4 = 1
            goto L_0x048d
        L_0x048c:
            r4 = 0
        L_0x048d:
            r5 = 1
            if (r4 != r5) goto L_0x0493
            r16 = 1
            goto L_0x0495
        L_0x0493:
            r16 = 0
        L_0x0495:
            if (r16 == 0) goto L_0x04a7
            java.lang.String r0 = "[Battle] receive battleStatusMsg skip. battle in start wait."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            di3.d r0 = di3.C86312j.m106911c(r24)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89064ra()
            goto L_0x05d5
        L_0x04a7:
            if (r3 == 0) goto L_0x04b0
            int r4 = r0.f135703i
            r5 = 3
            r3.f153392e = r5
            r3.f153391d = r4
        L_0x04b0:
            if (r3 != 0) goto L_0x04b3
            goto L_0x04b7
        L_0x04b3:
            int r4 = r0.f135701g
            r3.f153390c = r4
        L_0x04b7:
            if (r3 == 0) goto L_0x04c1
            java.util.LinkedList<te3.ae3> r4 = r0.f135702h
            gy3.C87412m.m108593f(r4, r8)
            r3.mo75625d(r4)
        L_0x04c1:
            y50.h r3 = y50.C66521k0.f191361a
            if (r3 == 0) goto L_0x04c8
            r3.onBattleEnd()
        L_0x04c8:
            di3.d r3 = di3.C86312j.m106911c(r24)
            tf0.r1 r3 = (tf0.C64918r1) r3
            int r0 = r0.f135701g
            long r4 = (long) r0
            long r4 = r4 * r22
            cj1.a1 r0 = r1.f154051E
            if (r0 == 0) goto L_0x04da
            java.lang.String r7 = r0.f153388a
            goto L_0x04db
        L_0x04da:
            r7 = 0
        L_0x04db:
            r3.Ju0(r4, r7)
            goto L_0x05d5
        L_0x04e0:
            r2 = r18
            r6 = r27
            java.util.LinkedList<te3.ae3> r7 = r0.f135702h
            gy3.C87412m.m108593f(r7, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x04ed:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0507
            java.lang.Object r10 = r7.next()
            r13 = r10
            te3.ae3 r13 = (te3.C48701ae3) r13
            java.lang.String r13 = r13.f130472d
            java.lang.String r15 = r4.f154345o
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r15)
            r15 = 1
            r13 = r13 ^ r15
            if (r13 == 0) goto L_0x04ed
            goto L_0x0508
        L_0x0507:
            r10 = 0
        L_0x0508:
            te3.ae3 r10 = (te3.C48701ae3) r10
            fj1.b r4 = fj1.C45795b.f123698n
            if (r4 == 0) goto L_0x0517
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            goto L_0x0518
        L_0x0517:
            r4 = 0
        L_0x0518:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r13 = r26
            r7.append(r13)
            java.lang.String r13 = r0.f135698d
            r7.append(r13)
            r7.append(r12)
            long r12 = r0.f135699e
            r7.append(r12)
            r7.append(r14)
            r7.append(r4)
            r7.append(r9)
            cj1.a1 r4 = r1.f154051E
            r7.append(r4)
            r7.append(r5)
            if (r10 == 0) goto L_0x0545
            java.lang.String r4 = r10.f130472d
            goto L_0x0546
        L_0x0545:
            r4 = 0
        L_0x0546:
            r7.append(r4)
            java.lang.String r4 = " delayMs:"
            r7.append(r4)
            long r4 = r0.f135704j
            r7.append(r4)
            java.lang.String r4 = " streamDelay:"
            r7.append(r4)
            long r4 = r1.f154049C
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            if (r10 != 0) goto L_0x056b
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r3)
            goto L_0x05d5
        L_0x056b:
            cj1.a1 r3 = r1.f154051E
            if (r3 == 0) goto L_0x0572
            long r3 = r3.f153389b
            goto L_0x0574
        L_0x0572:
            r3 = r20
        L_0x0574:
            long r9 = r0.f135699e
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x057e
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r6)
            goto L_0x05d5
        L_0x057e:
            cj1.a1 r3 = new cj1.a1
            java.lang.String r4 = r0.f135698d
            int r5 = r0.f135701g
            r31 = -1
            r32 = 4
            r33 = 0
            r34 = 32
            r35 = 0
            r26 = r3
            r27 = r4
            r28 = r9
            r30 = r5
            r26.<init>(r27, r28, r30, r31, r32, r33, r34, r35)
            java.util.LinkedList<te3.ae3> r4 = r0.f135702h
            gy3.C87412m.m108593f(r4, r8)
            r3.mo75625d(r4)
            r1.f154051E = r3
            di3.d r3 = di3.C86312j.m106911c(r24)
            tf0.r1 r3 = (tf0.C64918r1) r3
            r3.mo89064ra()
            di3.d r3 = di3.C86312j.m106911c(r24)
            tf0.r1 r3 = (tf0.C64918r1) r3
            long r4 = r1.f154049C
            int r6 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r6 >= 0) goto L_0x05ba
            r4 = r20
        L_0x05ba:
            java.lang.String r0 = r0.f135698d
            r3.mo89063oH(r4, r0)
            di3.d r0 = di3.C86312j.m106911c(r24)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89043Pa()
            goto L_0x05d5
        L_0x05c9:
            r25 = r2
        L_0x05cb:
            r2 = r18
            goto L_0x05d5
        L_0x05ce:
            r25 = r2
            r2 = r3
            r24 = r4
            r17 = r5
        L_0x05d5:
            r3 = r2
            r5 = r17
            r4 = r24
            r2 = r25
            goto L_0x0038
        L_0x05de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75923e3(java.util.LinkedList):void");
    }

    /* renamed from: f3 */
    public final void mo75924f3(LinkedList<C52013xs0> linkedList) {
        FinderContact finderContact;
        FinderContact finderContact2;
        Class cls = C64918r1.class;
        LinkedList linkedList2 = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (C110823p.m151008x(this.f154060N, ((C52013xs0) next).f144903e)) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        ArrayList<C52013xs0> arrayList2 = new ArrayList<>();
        Iterator it = linkedList2.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            C49765hx0 hx02 = ((C52013xs0) next2).f144914s;
            if (!(hx02 == null || (finderContact2 = hx02.f134919d) == null)) {
                str = finderContact2.username;
            }
            if (true ^ Util.isEqual(str, C66785b.f191882e.mo90662O5())) {
                arrayList2.add(next2);
            }
        }
        if (((C64918r1) C86312j.m106911c(cls)).mo89039GD()) {
            for (C52013xs0 xs02 : arrayList2) {
                C51295st0 st02 = new C51295st0();
                C89349b bVar = xs02.f144906h;
                byte[] f = bVar != null ? bVar.mo123703f() : null;
                if (f != null) {
                    try {
                        st02.parseFrom(f);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                String str2 = xs02.f144909n;
                if (str2 != null) {
                    this.f154082y.put(str2, 3);
                    C54130j jVar = this.f154073p;
                    if (Util.isEqual(str2, jVar != null ? jVar.f152002f : null)) {
                        ((C64918r1) C86312j.m106911c(cls)).i80();
                        long j = ((C55001u) business(C55001u.class)).f154420q.f182392d;
                        C49765hx0 hx03 = xs02.f144914s;
                        mo75916X3(new C66512f(j, (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.username, xs02.f144909n, (String) null, 0, 24, (C8480h) null));
                        ((C64918r1) C86312j.m106911c(cls)).mo89052eF();
                        this.f154078u = 0;
                        this.f154073p = null;
                        C61620c.C61622b.f175234a.mo86556d((String) null);
                        mo75928k3();
                        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk]  anchor receive close pk msg, [sdkUserId:" + st02.f141736d + ']');
                    }
                    List<C54130j> list = this.f154071n;
                    C87412m.m108593f(list, "linkMicUserList");
                    C64175a0.m75512t(list, new C54965b(xs02));
                    List<C54130j> list2 = this.f154072o;
                    C87412m.m108593f(list2, "newLinkMicUserList");
                    C64175a0.m75512t(list2, new C54966c(xs02));
                }
                Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk]  receive close pk msg, [sdkUserId:" + st02.f141736d + ", sessionId:" + xs02.f144909n + "], curLiveUser:" + this.f154073p + ", applySessionId:" + this.f154070j);
            }
        }
        C66514h hVar = C66521k0.f191361a;
        if (hVar != null) {
            hVar.onCloseLiveMicNotify();
        }
        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk]  checkLinkClosePkMsg:" + arrayList2.size() + " isAnchor:" + ((C64918r1) C86312j.m106911c(cls)).mo89039GD());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r9 = r14.f134919d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75925g3(java.util.List<? extends te3.C50034jt0> r38, java.lang.String r39) {
        /*
            r37 = this;
            r0 = r37
            java.lang.Class<tf0.r1> r1 = tf0.C64918r1.class
            r3 = 0
            if (r38 == 0) goto L_0x00f0
            java.util.Iterator r4 = r38.iterator()
            r5 = 0
        L_0x000c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00f1
            java.lang.Object r6 = r4.next()
            te3.jt0 r6 = (te3.C50034jt0) r6
            al1.j r15 = new al1.j
            java.lang.String r8 = r6.f136312f
            te3.hx0 r14 = r6.f136310d
            if (r14 == 0) goto L_0x0027
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r14.f134919d
            if (r9 == 0) goto L_0x0027
            java.lang.String r9 = r9.headUrl
            goto L_0x0028
        L_0x0027:
            r9 = 0
        L_0x0028:
            if (r14 == 0) goto L_0x0031
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r14.f134919d
            if (r10 == 0) goto L_0x0031
            java.lang.String r10 = r10.username
            goto L_0x0032
        L_0x0031:
            r10 = 0
        L_0x0032:
            if (r14 == 0) goto L_0x003b
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r14.f134919d
            if (r11 == 0) goto L_0x003b
            java.lang.String r11 = r11.nickname
            goto L_0x003c
        L_0x003b:
            r11 = 0
        L_0x003c:
            int r12 = r6.f136311e
            java.lang.String r13 = r6.f136313g
            r16 = 0
            r17 = 0
            al1.j r7 = r0.f154073p
            if (r7 == 0) goto L_0x004d
            int r7 = r7.f152005i
            r19 = r7
            goto L_0x004f
        L_0x004d:
            r19 = 0
        L_0x004f:
            if (r14 == 0) goto L_0x005a
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r14.f134919d
            if (r7 == 0) goto L_0x005a
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r7 = r7.authInfo
            r20 = r7
            goto L_0x005c
        L_0x005a:
            r20 = 0
        L_0x005c:
            r21 = 0
            r22 = 0
            r26 = 0
            r34 = 0
            if (r14 == 0) goto L_0x006b
            java.lang.String r7 = r14.f134927o
            r35 = r7
            goto L_0x006d
        L_0x006b:
            r35 = 0
        L_0x006d:
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 8240128(0x7dbc00, float:1.1546879E-38)
            r33 = 0
            r7 = r15
            r36 = r14
            r14 = r16
            r2 = r15
            r15 = r17
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r22
            r20 = r26
            r21 = r34
            r22 = r35
            r26 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.mo75917Y3(r2)
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r0.business(r7)
            cl1.o r7 = (cl1.C54991o) r7
            r7.mo76009k4(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkOtherRoomAudienceMicList: add micUser:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            tf0.r1 r2 = (tf0.C64918r1) r2
            boolean r2 = r2.mo89039GD()
            if (r2 == 0) goto L_0x00ec
            di3.d r2 = di3.C86312j.m106911c(r1)
            tf0.r1 r2 = (tf0.C64918r1) r2
            java.lang.String r6 = r6.f136312f
            if (r6 != 0) goto L_0x00d7
            java.lang.String r6 = ""
        L_0x00d7:
            al1.j r7 = r0.f154073p
            if (r7 == 0) goto L_0x00e0
            int r7 = r7.f152005i
            r8 = r39
            goto L_0x00e3
        L_0x00e0:
            r8 = r39
            r7 = 0
        L_0x00e3:
            boolean r2 = r2.Vj0(r6, r7, r3, r8)
            if (r2 == 0) goto L_0x000c
            r5 = 1
            goto L_0x000c
        L_0x00ec:
            r8 = r39
            goto L_0x000c
        L_0x00f0:
            r5 = 0
        L_0x00f1:
            if (r38 == 0) goto L_0x00fd
            boolean r2 = r38.isEmpty()
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x00fe
            r2 = 1
            goto L_0x00ff
        L_0x00fd:
            r4 = 1
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            if (r2 == 0) goto L_0x0103
            r0.f154053G = r4
        L_0x0103:
            di3.d r2 = di3.C86312j.m106911c(r1)
            tf0.r1 r2 = (tf0.C64918r1) r2
            boolean r2 = r2.mo89039GD()
            if (r2 == 0) goto L_0x0124
            if (r5 == 0) goto L_0x0124
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.r1 r1 = (tf0.C64918r1) r1
            j50.a r1 = r1.mo89057iV()
            if (r1 == 0) goto L_0x0124
            n50.d r1 = r1.mo85680X()
            r1.mo86572o(r3)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75925g3(java.util.List, java.lang.String):void");
    }

    /* renamed from: i3 */
    public final void mo75926i3(LinkedList<C52013xs0> linkedList) {
        LinkedList linkedList2;
        Iterator it;
        String str;
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        FinderContact finderContact4;
        FinderContact finderContact5;
        FinderContact finderContact6;
        FinderContact finderContact7;
        FinderContact finderContact8;
        FinderContact finderContact9;
        FinderContact finderContact10;
        Class cls = C54991o.class;
        Class<C54963d0> cls2 = C54963d0.class;
        Class cls3 = C55001u.class;
        Class cls4 = C64918r1.class;
        LinkedList linkedList3 = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (C110823p.m151008x(this.f154061P, ((C52013xs0) next).f144903e)) {
                arrayList.add(next);
            }
        }
        linkedList3.addAll(arrayList);
        Iterator it4 = linkedList3.iterator();
        while (it4.hasNext()) {
            C52013xs0 xs02 = (C52013xs0) it4.next();
            C50876pu0 pu02 = new C50876pu0();
            C89349b bVar = xs02.f144906h;
            byte[] f = bVar != null ? bVar.mo123703f() : null;
            if (f != null) {
                try {
                    pu02.parseFrom(f);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[LinkMicPk] visitor receive pkStatusMsg: [pkStatusScene:");
            sb.append(pu02.f139978d);
            sb.append(" pkStatusSeq:");
            sb.append(pu02.f139979e);
            sb.append(" pkStatusPkUser:");
            C49765hx0 hx02 = pu02.f139980f;
            sb.append((hx02 == null || (finderContact10 = hx02.f134919d) == null) ? null : finderContact10.nickname);
            sb.append(']');
            Log.m105924i("MMFinder.LiveLinkMicSlice", sb.toString());
            int i = pu02.f139978d;
            if (i != 1) {
                it = it4;
                linkedList2 = linkedList3;
                String str2 = " curMsgSeq:";
                Class<C54963d0> cls5 = cls2;
                if (i != 2) {
                    if (i == 3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("[LinkMicPk] receive close pk status msg:[session_id:");
                        sb4.append(xs02.f144909n);
                        sb4.append(", pkAnchorNickname:");
                        C49765hx0 hx03 = pu02.f139980f;
                        sb4.append((hx03 == null || (finderContact8 = hx03.f134919d) == null) ? null : finderContact8.nickname);
                        sb4.append(", userSdkId:");
                        sb4.append(pu02.f139981g);
                        sb4.append(", isAnchor:");
                        sb4.append(((C64918r1) C86312j.m106911c(cls4)).mo89039GD());
                        sb4.append(']');
                        Log.m105924i("MMFinder.LiveLinkMicSlice", sb4.toString());
                        if (!((C64918r1) C86312j.m106911c(cls4)).mo89039GD()) {
                            String str3 = xs02.f144909n;
                            if (str3 != null) {
                                this.f154082y.put(str3, 3);
                                cls2 = cls5;
                                if (((C54963d0) business(cls2)).mo75914V3()) {
                                    C54130j jVar = this.f154073p;
                                    if (jVar != null && jVar.f152004h) {
                                        if (Util.isEqual(jVar != null ? jVar.f152002f : null, xs02.f144909n)) {
                                            long j = ((C55001u) business(cls3)).f154420q.f182392d;
                                            C49765hx0 hx04 = pu02.f139980f;
                                            mo75916X3(new C66512f(j, (hx04 == null || (finderContact7 = hx04.f134919d) == null) ? null : finderContact7.username, xs02.f144909n, (String) null, 0, 24, (C8480h) null));
                                            this.f154078u = 0;
                                            List<C54130j> list = this.f154076s;
                                            C87412m.m108593f(list, "linkMicUserInfoList");
                                            C61926c.m72700y(list, new C54967d(str3));
                                        }
                                    }
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("[LinkMicPk] invalid params: [isLinking:");
                                sb5.append(((C54963d0) business(cls2)).mo75914V3());
                                sb5.append(" isPkWithAnchor:");
                                C54130j jVar2 = this.f154073p;
                                sb5.append(jVar2 != null ? Boolean.valueOf(jVar2.f152004h) : null);
                                sb5.append(" curSessionId:");
                                C54130j jVar3 = this.f154073p;
                                sb5.append(jVar3 != null ? jVar3.f152002f : null);
                                sb5.append(" msgSessionId:");
                                sb5.append(xs02.f144909n);
                                sb5.append(']');
                                Log.m105924i("MMFinder.LiveLinkMicSlice", sb5.toString());
                                C13598b0 b0Var = C13598b0.f38549a;
                            } else {
                                cls2 = cls5;
                            }
                            C13598b0 b0Var2 = C13598b0.f38549a;
                        }
                    } else if (i == 4) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("[LinkMicPk] receive CrossRoomAudienceAccept pk status msg:[session_id:");
                        sb6.append(xs02.f144909n);
                        sb6.append(", pkAnchorNickname:");
                        C49765hx0 hx05 = pu02.f139980f;
                        sb6.append((hx05 == null || (finderContact9 = hx05.f134919d) == null) ? null : finderContact9.nickname);
                        sb6.append(", userSdkId:");
                        sb6.append(pu02.f139981g);
                        sb6.append(", isAnchor:");
                        sb6.append(((C64918r1) C86312j.m106911c(cls4)).mo89039GD());
                        sb6.append(", bgUrl:");
                        C49765hx0 hx06 = pu02.f139980f;
                        sb6.append(hx06 != null ? hx06.f134927o : null);
                        sb6.append(", audience_mic_list size:");
                        LinkedList<C50034jt0> linkedList4 = pu02.f139982h;
                        sb6.append(linkedList4 != null ? Integer.valueOf(linkedList4.size()) : null);
                        sb6.append(']');
                        Log.m105924i("MMFinder.LiveLinkMicSlice", sb6.toString());
                        String str4 = xs02.f144909n;
                        if (str4 != null) {
                            Integer num = this.f154082y.get(str4);
                            if (num != null && num.intValue() == 3) {
                                Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] skip accept pk status msg, mic closed. sessionId:" + str4);
                            } else {
                                LinkedList<C50034jt0> linkedList5 = pu02.f139982h;
                                C54130j jVar4 = this.f154073p;
                                mo75925g3(linkedList5, jVar4 != null ? jVar4.f152002f : null);
                                mo75915W3(new C66505a(((C55001u) business(cls3)).f154420q.f182392d, xs02.f144909n, "", ((C54991o) business(cls)).mo76011l4(), 0, 0, "", "", 0, (byte[]) null, 2, pu02.f139979e, "", true, false, 16384, (C8480h) null));
                            }
                            C13598b0 b0Var3 = C13598b0.f38549a;
                        }
                    } else if (i != 6) {
                        C13598b0 b0Var4 = C13598b0.f38549a;
                    } else {
                        C49765hx0 hx07 = pu02.f139980f;
                        if (hx07 != null) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("[LinkMicPk] receive VoiceLiveImgMod, img:");
                            C64756up2 up22 = hx07.f134935w;
                            sb7.append(up22 != null ? C61937h.m72709h(up22) : "null");
                            Log.m105924i("MMFinder.LiveLinkMicSlice", sb7.toString());
                            C66514h hVar = C66521k0.f191361a;
                            if (hVar != null) {
                                hVar.onPkMicLiveRoomImgChanged(hx07);
                                C13598b0 b0Var5 = C13598b0.f38549a;
                            }
                        }
                    }
                    cls2 = cls5;
                } else {
                    cls2 = cls5;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("[LinkMicPk] receive accept pk status msg:[session_id:");
                    sb8.append(xs02.f144909n);
                    sb8.append(", pkAnchorNickname:");
                    C49765hx0 hx08 = pu02.f139980f;
                    sb8.append((hx08 == null || (finderContact6 = hx08.f134919d) == null) ? null : finderContact6.nickname);
                    sb8.append(", userSdkId:");
                    sb8.append(pu02.f139981g);
                    sb8.append(", isAnchor:");
                    sb8.append(((C64918r1) C86312j.m106911c(cls4)).mo89039GD());
                    sb8.append(", bgUrl:");
                    C49765hx0 hx09 = pu02.f139980f;
                    sb8.append(hx09 != null ? hx09.f134927o : null);
                    sb8.append(", audience_mic_list size:");
                    LinkedList<C50034jt0> linkedList6 = pu02.f139982h;
                    sb8.append(linkedList6 != null ? Integer.valueOf(linkedList6.size()) : null);
                    sb8.append(']');
                    Log.m105924i("MMFinder.LiveLinkMicSlice", sb8.toString());
                    String str5 = xs02.f144909n;
                    if (str5 != null) {
                        Integer num2 = this.f154082y.get(str5);
                        if (num2 != null && num2.intValue() == 3) {
                            Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] skip accept pk status msg, mic closed. sessionId:" + str5);
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("[LinkMicPk] receive accept pk status msg. sessionId:");
                            sb9.append(str5);
                            String str6 = str2;
                            sb9.append(str6);
                            sb9.append(pu02.f139979e);
                            sb9.append(" acceptSeq:");
                            sb9.append(this.f154069i);
                            Log.m105924i("MMFinder.LiveLinkMicSlice", sb9.toString());
                            if (!((C64918r1) C86312j.m106911c(cls4)).mo89039GD()) {
                                if (pu02.f139979e < this.f154069i) {
                                    if (this.f154053G) {
                                        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] RoomPk is true, accept pk status msg, ignore mic too old. sessionId:" + str5 + str6 + pu02.f139979e + " acceptSeq:" + this.f154069i);
                                    } else {
                                        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] skip accept pk status msg, mic too old. sessionId:" + str5 + str6 + pu02.f139979e + " acceptSeq:" + this.f154069i);
                                    }
                                }
                                this.f154082y.put(str5, 2);
                                this.f154069i = pu02.f139979e;
                                this.f154078u = 4;
                                String str7 = pu02.f139981g;
                                C49765hx0 hx010 = pu02.f139980f;
                                mo75917Y3(new C54130j(str7, (hx010 == null || (finderContact5 = hx010.f134919d) == null) ? null : finderContact5.headUrl, (hx010 == null || (finderContact4 = hx010.f134919d) == null) ? null : finderContact4.username, (hx010 == null || (finderContact3 = hx010.f134919d) == null) ? null : finderContact3.nickname, 2, xs02.f144909n, (C89349b) null, true, 0, (hx010 == null || (finderContact2 = hx010.f134919d) == null) ? null : finderContact2.authInfo, (String) null, 0, 0, false, hx010 != null ? hx010.f134927o : null, false, 0, hx010, false, (Boolean) null, hx010 != null ? hx010.f134935w : null, 0, 0, 7191552, (C8480h) null));
                            }
                            LinkedList<C50034jt0> linkedList7 = pu02.f139982h;
                            C54130j jVar5 = this.f154073p;
                            mo75925g3(linkedList7, jVar5 != null ? jVar5.f152002f : null);
                            mo75915W3(new C66505a(((C55001u) business(cls3)).f154420q.f182392d, xs02.f144909n, "", ((C54991o) business(cls)).mo76011l4(), 0, 0, "", "", 0, (byte[]) null, 2, pu02.f139979e, "", true, false, 16384, (C8480h) null));
                        }
                        C13598b0 b0Var6 = C13598b0.f38549a;
                    }
                }
            } else {
                linkedList2 = linkedList3;
                it = it4;
                String str8 = " curMsgSeq:";
                StringBuilder sb10 = new StringBuilder();
                sb10.append("[LinkMicPk] receive apply pk status msg:[session_id:");
                sb10.append(xs02.f144909n);
                sb10.append(", pkAnchorNickname:");
                C49765hx0 hx011 = pu02.f139980f;
                sb10.append((hx011 == null || (finderContact = hx011.f134919d) == null) ? null : finderContact.nickname);
                sb10.append(", userSdkId:");
                sb10.append(pu02.f139981g);
                sb10.append(", isAnchor:");
                sb10.append(((C64918r1) C86312j.m106911c(cls4)).mo89039GD());
                sb10.append(']');
                Log.m105924i("MMFinder.LiveLinkMicSlice", sb10.toString());
                if (!((C64918r1) C86312j.m106911c(cls4)).mo89039GD() && (str = xs02.f144909n) != null) {
                    if (this.f154082y.get(str) != null) {
                        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] skip apply pk status msg, invalid apply msg. curMicStatus:" + this.f154082y.get(str));
                    } else if (pu02.f139979e >= this.f154069i || ((C64918r1) C86312j.m106911c(cls4)).mo89039GD()) {
                        this.f154082y.put(str, 0);
                        C49765hx0 hx012 = pu02.f139980f;
                        if (hx012 != null) {
                            FinderContact finderContact11 = hx012.f134919d;
                        }
                        if (hx012 != null) {
                            FinderContact finderContact12 = hx012.f134919d;
                        }
                        if (hx012 != null) {
                            FinderContact finderContact13 = hx012.f134919d;
                        }
                    } else {
                        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] skip apply pk status msg, mic too old. sessionId:" + str + str8 + pu02.f139979e + " acceptedSeq:" + this.f154069i);
                    }
                    C13598b0 b0Var7 = C13598b0.f38549a;
                }
            }
            C13598b0 b0Var8 = C13598b0.f38549a;
            it4 = it;
            linkedList3 = linkedList2;
        }
        Log.m105924i("MMFinder.LiveLinkMicSlice", "[LinkMicPk] checkPkStatusMsg:" + linkedList3.size() + " isAnchor:" + ((C64918r1) C86312j.m106911c(cls4)).mo89039GD());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75927j3(java.util.LinkedList<te3.C52013xs0> r6) {
        /*
            r5 = this;
            java.lang.Class<tf0.r1> r0 = tf0.C64918r1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.r1 r0 = (tf0.C64918r1) r0
            boolean r0 = r0.mo89039GD()
            if (r0 == 0) goto L_0x00da
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r6.next()
            r3 = r2
            te3.xs0 r3 = (te3.C52013xs0) r3
            int[] r4 = r5.f154065T
            int r3 = r3.f144903e
            boolean r3 = sx3.C110823p.m151008x(r4, r3)
            if (r3 == 0) goto L_0x001c
            r1.add(r2)
            goto L_0x001c
        L_0x0037:
            r0.addAll(r1)
            java.lang.Object r6 = r0.peekFirst()
            te3.xs0 r6 = (te3.C52013xs0) r6
            if (r6 == 0) goto L_0x00da
            te3.nu0 r0 = new te3.nu0
            r0.<init>()
            pe3.b r1 = r6.f144906h
            r2 = 0
            if (r1 == 0) goto L_0x0051
            byte[] r1 = r1.mo123703f()
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            if (r1 != 0) goto L_0x0056
        L_0x0054:
            r0 = r2
            goto L_0x0069
        L_0x0056:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x005a }
            goto L_0x0069
        L_0x005a:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r1)
            goto L_0x0054
        L_0x0069:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[random mic] receive randomMicApplyMsg. sessionId:"
            r1.append(r3)
            java.lang.String r6 = r6.f144909n
            r1.append(r6)
            java.lang.String r6 = ", to_contact.username:"
            r1.append(r6)
            if (r0 == 0) goto L_0x008a
            te3.hx0 r6 = r0.f138776d
            if (r6 == 0) goto L_0x008a
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = r6.username
            goto L_0x008b
        L_0x008a:
            r6 = r2
        L_0x008b:
            r1.append(r6)
            java.lang.String r6 = ", to_contact.nickname:"
            r1.append(r6)
            if (r0 == 0) goto L_0x009f
            te3.hx0 r6 = r0.f138776d
            if (r6 == 0) goto L_0x009f
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x009f
            java.lang.String r2 = r6.nickname
        L_0x009f:
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            if (r0 == 0) goto L_0x00da
            te3.hx0 r6 = r0.f138776d
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = "[random mic] info.to_contact is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            return
        L_0x00b7:
            int r6 = r5.f154078u
            r2 = 5
            if (r6 == r2) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "[random mic] linkMicState check fail: "
            r6.append(r0)
            int r0 = r5.f154078u
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            return
        L_0x00d3:
            y50.h r6 = y50.C66521k0.f191361a
            if (r6 == 0) goto L_0x00da
            r6.onRandomMicApply(r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54963d0.mo75927j3(java.util.LinkedList):void");
    }

    /* renamed from: k3 */
    public final void mo75928k3() {
        Log.m105924i("MMFinder.LiveLinkMicSlice", "clearOtherRoomAudienceMicUser: before remove, size:" + this.f154074q.size() + ", audienceLinkMicUserList:" + this.f154074q);
        List<C54130j> list = this.f154074q;
        C87412m.m108593f(list, "audienceLinkMicUserList");
        C61926c.m72700y(list, C54968e.f154088d);
        Log.m105924i("MMFinder.LiveLinkMicSlice", "clearOtherRoomAudienceMicUser: after remove, size:" + this.f154074q.size() + ", audienceLinkMicUserList:" + this.f154074q);
    }

    /* renamed from: l3 */
    public final List<C54130j> mo75929l3() {
        ArrayList arrayList;
        this.f154075r.clear();
        C54130j jVar = this.f154073p;
        if (jVar != null) {
            this.f154075r.add(jVar);
        }
        List<C54130j> list = this.f154075r;
        List<C54130j> list2 = this.f154074q;
        C87412m.m108593f(list2, "audienceLinkMicUserList");
        synchronized (list2) {
            arrayList = new ArrayList();
            for (T next : list2) {
                String str = ((C54130j) next).f151997a;
                C54130j jVar2 = this.f154073p;
                if (!C87412m.m108589b(str, jVar2 != null ? jVar2.f151997a : null)) {
                    arrayList.add(next);
                }
            }
        }
        list.addAll(arrayList);
        return this.f154075r;
    }

    /* renamed from: m3 */
    public final C54130j mo75930m3() {
        return (C54130j) ((C36570n) this.f154068h).getValue();
    }

    /* renamed from: n3 */
    public final C54130j mo75931n3(String str) {
        ArrayList arrayList;
        List<C54130j> list = this.f154074q;
        C87412m.m108593f(list, "audienceLinkMicUserList");
        synchronized (list) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (Util.isEqual(((C54130j) next).f152002f, str)) {
                    arrayList.add(next);
                }
            }
        }
        return (C54130j) C110818d0.m150916N(arrayList);
    }

    /* renamed from: o3 */
    public final List<C54130j> mo75932o3() {
        return this.f154074q;
    }

    public void onCleared() {
        this.f154071n.clear();
        this.f154072o.clear();
        this.f154073p = null;
        C61620c.C61622b.f175234a.mo86556d((String) null);
        this.f154078u = 0;
        this.f154079v = -1;
        this.f154080w = false;
        this.f154081x = true;
        this.f154070j = "";
        this.f154069i = 0;
        this.f154082y.clear();
        this.f154047A.clear();
        this.f154048B = new C51887ww2();
        this.f154050D = false;
        this.f154051E = null;
        this.f154049C = 0;
        this.f154052F = 0;
        this.f154076s.clear();
        this.f154074q.clear();
        this.f154053G = false;
    }
}
