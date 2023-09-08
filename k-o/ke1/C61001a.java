package ke1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60187m5;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46523h2;
import je1.C60812w1;
import ob0.C47350c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49966ja;
import te3.C50405mi0;
import te3.C50564nm0;
import te3.C51163rv3;
import te3.C64423hi0;
import te3.C64558mm0;
import up1.C65413c0;
import up1.C65414d0;
import zc1.C66785b;

/* renamed from: ke1.a */
public final class C61001a {

    /* renamed from: a */
    public final ConcurrentHashMap<String, Object> f173724a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final C13601g f173725b = C36568h.m40985a(C61008g.f173746d);

    /* renamed from: c */
    public final C13601g f173726c = C36568h.m40985a(C61002a.f173727d);

    /* renamed from: ke1.a$a */
    public static final class C61002a extends C87413o implements C32224a<C65413c0> {

        /* renamed from: d */
        public static final C61002a f173727d = new C61002a();

        public C61002a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Jx0();
        }
    }

    /* renamed from: ke1.a$b */
    public static final class C61003b extends C87413o implements C32226l<List<? extends C60187m5>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61001a f173728d;

        /* renamed from: e */
        public final /* synthetic */ String f173729e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C60187m5, C13598b0> f173730f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61003b(C61001a aVar, String str, C32226l<? super C60187m5, C13598b0> lVar) {
            super(1);
            this.f173728d = aVar;
            this.f173729e = str;
            this.f173730f = lVar;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "resultList");
            this.f173728d.f173724a.remove(this.f173729e);
            this.f173730f.invoke(C110818d0.m150914L(list));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ke1.a$c */
    public static final class C61004c extends C87413o implements C32226l<List<? extends C60187m5>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61001a f173731d;

        /* renamed from: e */
        public final /* synthetic */ String f173732e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C60187m5, C13598b0> f173733f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61004c(C61001a aVar, String str, C32226l<? super C60187m5, C13598b0> lVar) {
            super(1);
            this.f173731d = aVar;
            this.f173732e = str;
            this.f173733f = lVar;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "resultList");
            ConcurrentHashMap<String, Object> concurrentHashMap = this.f173731d.f173724a;
            C24564k0.m30739c(concurrentHashMap).remove(this.f173732e);
            C32226l<C60187m5, C13598b0> lVar = this.f173733f;
            Object obj2 = (C60187m5) C110818d0.m150916N(list);
            if (obj2 == null) {
                obj2 = new C58969q();
            }
            lVar.invoke(obj2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ke1.a$d */
    public static final class C61005d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C61001a f173734a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<C60187m5> f173735b;

        /* renamed from: c */
        public final /* synthetic */ List<String> f173736c;

        /* renamed from: d */
        public final /* synthetic */ int f173737d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<List<? extends C60187m5>, C13598b0> f173738e;

        public C61005d(C61001a aVar, LinkedList<C60187m5> linkedList, List<String> list, int i, C32226l<? super List<? extends C60187m5>, C13598b0> lVar) {
            this.f173734a = aVar;
            this.f173735b = linkedList;
            this.f173736c = list;
            this.f173737d = i;
            this.f173738e = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C61001a aVar = this.f173734a;
            C87412m.m108593f(cVar, "back");
            C61001a.m71515a(aVar, cVar, this.f173735b, this.f173736c, this.f173737d, this.f173738e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ke1.a$e */
    public static final class C61006e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C61001a f173739a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<C60187m5> f173740b;

        /* renamed from: c */
        public final /* synthetic */ List<String> f173741c;

        /* renamed from: d */
        public final /* synthetic */ C32226l<List<? extends C60187m5>, C13598b0> f173742d;

        public C61006e(C61001a aVar, LinkedList<C60187m5> linkedList, List<String> list, C32226l<? super List<? extends C60187m5>, C13598b0> lVar) {
            this.f173739a = aVar;
            this.f173740b = linkedList;
            this.f173741c = list;
            this.f173742d = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C61001a aVar = this.f173739a;
            C87412m.m108593f(cVar, "back");
            C61001a.m71515a(aVar, cVar, this.f173740b, this.f173741c, 4, this.f173742d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ke1.a$f */
    public static final class C61007f extends C87413o implements C32226l<List<? extends C60187m5>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61001a f173743d;

        /* renamed from: e */
        public final /* synthetic */ String f173744e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C60187m5, C13598b0> f173745f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61007f(C61001a aVar, String str, C32226l<? super C60187m5, C13598b0> lVar) {
            super(1);
            this.f173743d = aVar;
            this.f173744e = str;
            this.f173745f = lVar;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "resultList");
            this.f173743d.f173724a.remove(this.f173744e);
            C32226l<C60187m5, C13598b0> lVar = this.f173745f;
            Object obj2 = (C60187m5) C110818d0.m150916N(list);
            if (obj2 == null) {
                obj2 = new C58969q();
            }
            lVar.invoke(obj2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ke1.a$g */
    public static final class C61008g extends C87413o implements C32224a<C65414d0> {

        /* renamed from: d */
        public static final C61008g f173746d = new C61008g();

        public C61008g() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Kx0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x015b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71515a(ke1.C61001a r14, ob0.C89132b.C89134c r15, java.util.LinkedList r16, java.util.List r17, int r18, fy3.C32226l r19) {
        /*
            r0 = r15
            r1 = r16
            r2 = r18
            r14.getClass()
            int r3 = r0.f256793a
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0013
            int r3 = r0.f256794b
            if (r3 == 0) goto L_0x0047
        L_0x0013:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 20492(0x500c, float:2.8715E-41)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r9 = 5
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r5] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r0.f256793a
            r9.append(r10)
            r10 = 44
            r9.append(r10)
            int r10 = r0.f256794b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8[r6] = r9
            r7.mo160131h(r3, r8)
            r8 = 1473(0x5c1, double:7.28E-321)
            r10 = 5
            r12 = 1
            r7.mo175913w(r8, r10, r12)
        L_0x0047:
            int r3 = r0.f256793a
            r7 = 0
            if (r3 != 0) goto L_0x012f
            int r3 = r0.f256794b
            if (r3 != 0) goto L_0x012f
            T r3 = r0.f256796d
            te3.nm0 r3 = (te3.C50564nm0) r3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r3 = r3.f138660d
            java.lang.String r8 = "back.resp.contactList"
            gy3.C87412m.m108593f(r3, r8)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x012f
            T r3 = r0.f256796d
            te3.nm0 r3 = (te3.C50564nm0) r3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r3 = r3.f138660d
            gy3.C87412m.m108593f(r3, r8)
            java.util.Iterator r3 = r3.iterator()
        L_0x006f:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0118
            java.lang.Object r8 = r3.next()
            com.tencent.mm.protocal.protobuf.FinderContact r8 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r8
            java.lang.String r9 = r8.username
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r10 = "Finder.ContactFetcher"
            if (r9 == 0) goto L_0x0096
            te3.mi0 r9 = r8.msgInfo
            if (r9 == 0) goto L_0x008d
            java.lang.String r9 = r9.f138041d
            if (r9 != 0) goto L_0x008f
        L_0x008d:
            java.lang.String r9 = ""
        L_0x008f:
            r8.username = r9
            java.lang.String r9 = "[fetchContactList] server error."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r9)
        L_0x0096:
            r9 = 3
            fe1.q r8 = fe1.C58960c.m68834f(r8, r7, r5, r9, r7)
            fe1.C58960c.m68832d(r8)
            r8.f168731T1 = r6
            r8.field_source = r2
            java.lang.String r9 = r8.getAvatarUrl()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00ae
            r9 = 1
            goto L_0x00af
        L_0x00ae:
            r9 = 0
        L_0x00af:
            if (r9 == 0) goto L_0x00da
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "avatarUrl is null, nickname="
            r9.append(r11)
            java.lang.String r11 = r8.getNickname()
            r9.append(r11)
            java.lang.String r11 = " username="
            r9.append(r11)
            java.lang.String r11 = r8.getUsername()
            r9.append(r11)
            r11 = 32
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r9)
        L_0x00da:
            java.lang.String r9 = r8.getNickname()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00e6
            r9 = 1
            goto L_0x00e7
        L_0x00e6:
            r9 = 0
        L_0x00e7:
            if (r9 == 0) goto L_0x0111
            int r9 = r8.field_retryCount
            int r9 = r9 + r6
            r8.field_retryCount = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "[fetchContactList] nickname is null. username="
            r9.append(r11)
            java.lang.String r11 = r8.getUsername()
            r9.append(r11)
            java.lang.String r11 = " retryCount="
            r9.append(r11)
            int r11 = r8.field_retryCount
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r9)
            goto L_0x0113
        L_0x0111:
            r8.field_retryCount = r5
        L_0x0113:
            r1.add(r8)
            goto L_0x006f
        L_0x0118:
            T r0 = r0.f256796d
            te3.nm0 r0 = (te3.C50564nm0) r0
            int r0 = r0.f138661e
            if (r0 <= 0) goto L_0x0151
            r3 = 4
            if (r2 != r3) goto L_0x0151
            int r2 = fe1.C58957a.f168667a
            java.lang.String r2 = "Finder.FinderAdContactLogic"
            java.lang.String r3 = "not setNextRetryInterval"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            fe1.C58957a.f168667a = r0
            goto L_0x0151
        L_0x012f:
            java.util.Iterator r0 = r17.iterator()
        L_0x0133:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            fe1.q r8 = new fe1.q
            r8.<init>(r3)
            r8.field_source = r2
            r8.f168731T1 = r5
            int r3 = r8.field_retryCount
            int r3 = r3 + r6
            r8.field_retryCount = r3
            r1.add(r8)
            goto L_0x0133
        L_0x0151:
            java.util.Iterator r0 = r16.iterator()
        L_0x0155:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ef
            java.lang.Object r2 = r0.next()
            ht1.m5 r2 = (ht1.C60187m5) r2
            boolean r3 = r2 instanceof fe1.C58969q
            if (r3 == 0) goto L_0x0155
            fe1.q r2 = (fe1.C58969q) r2
            java.lang.String r3 = r2.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85823W4(r3)
            if (r3 == 0) goto L_0x0179
            up1.d0 r3 = r14.mo85977g()
            ht1.C60198s3.C60199a.m70259a(r3, r2, r5, r4, r7)
            goto L_0x0155
        L_0x0179:
            java.lang.String r3 = r2.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85817T4(r3)
            if (r3 == 0) goto L_0x01dc
            int r3 = fe1.C58957a.f168667a
            java.lang.String r3 = r2.getUsername()
            fe1.a$a r6 = fe1.C58957a.f168669c
            r6.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "set key: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " contact:"
            r8.append(r9)
            java.lang.String r9 = r2.getUsername()
            r8.append(r9)
            java.lang.String r9 = " feedCount: "
            r8.append(r9)
            int r9 = r2.field_feedCount
            r8.append(r9)
            java.lang.String r9 = " getFollowersCount:"
            r8.append(r9)
            int r9 = r2.field_friendFollowCount
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Finder.AdContactCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            long r8 = eb0.C31543z5.m39453c()
            r2.field_updateTime = r8
            java.util.Map<java.lang.String, fe1.q> r6 = r6.f168670a
            java.lang.String r8 = "cacheItems"
            gy3.C87412m.m108593f(r6, r8)
            r6.put(r3, r2)
            fe1.d$b r3 = fe1.C58961d.f168673a
            r3.mo84163k(r2)
            goto L_0x0155
        L_0x01dc:
            java.lang.String r3 = r2.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85821V4(r3)
            if (r3 == 0) goto L_0x0155
            up1.c0 r3 = r14.mo85976f()
            ht1.C60195q3.C60196a.m70255a(r3, r2, r5, r4, r7)
            goto L_0x0155
        L_0x01ef:
            r2 = r19
            r2.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.C61001a.m71515a(ke1.a, ob0.b$c, java.util.LinkedList, java.util.List, int, fy3.l):void");
    }

    /* renamed from: b */
    public final void mo85972b(String str, C32226l<? super C60187m5, C13598b0> lVar, int i, String str2, C64423hi0 hi02) {
        C87412m.m108594g(str, "req");
        C87412m.m108594g(lVar, "call");
        C87412m.m108594g(str2, "wxUsername");
        if (!this.f173724a.containsKey(str)) {
            this.f173724a.put(str, this);
            mo85974d(C26236u.m33719b(str), new C61003b(this, str, lVar), i, str2, hi02);
            return;
        }
        Log.m105928w("Finder.ContactFetcher", "fetchContact[req] is loading. just return");
    }

    /* renamed from: c */
    public final void mo85973c(C50405mi0 mi02, C32226l<? super C60187m5, C13598b0> lVar) {
        C87412m.m108594g(mi02, "req");
        C87412m.m108594g(lVar, "call");
        String str = mi02.f138041d;
        if (!this.f173724a.containsKey(str)) {
            this.f173724a.put(str == null ? "" : str, this);
            List b = C26236u.m33719b(mi02);
            C60812w1.f173199i.mo85732a(b).mo9225i().mo123419C(new C61012e(b, new LinkedList(), new C61004c(this, str, lVar), this));
            return;
        }
        Log.m105928w("Finder.ContactFetcher", "fetchContact2[req] is loading. just return");
    }

    /* renamed from: d */
    public final void mo85974d(List<String> list, C32226l<? super List<? extends C60187m5>, C13598b0> lVar, int i, String str, C64423hi0 hi02) {
        C87412m.m108594g(list, "reqList");
        C87412m.m108594g(lVar, "call");
        C87412m.m108594g(str, "wxUsername");
        LinkedList linkedList = new LinkedList();
        if (i != 0) {
            if (i == 4) {
                C60812w1 w1Var = new C60812w1();
                C47350c.C47352b bVar = new C47350c.C47352b();
                C64558mm0 mm02 = new C64558mm0();
                mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
                mm02.f184343e.addAll(list);
                mm02.f184344f = 4;
                mm02.f184345g = C66785b.f191882e.mo90662O5();
                mm02.f184353r = "";
                mm02.f184354s = null;
                bVar.f127066a = mm02;
                C50564nm0 nm02 = new C50564nm0();
                nm02.setBaseResponse(new C49966ja());
                nm02.getBaseResponse().f135956e = new C51163rv3();
                bVar.f127067b = nm02;
                bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
                bVar.f127069d = 3953;
                w1Var.mo123453j(bVar.mo72403a());
                Log.m105924i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] username=" + list);
                w1Var.mo9225i().mo123419C(new C61006e(this, linkedList, list, lVar));
                return;
            } else if (i != 8) {
                return;
            }
        }
        C60812w1 w1Var2 = new C60812w1();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C64558mm0 mm03 = new C64558mm0();
        mm03.f184342d = C46523h2.f125330a.mo71859a(3953);
        mm03.f184343e.addAll(list);
        mm03.f184344f = i;
        mm03.f184345g = C66785b.f191882e.mo90662O5();
        mm03.f184353r = str;
        mm03.f184354s = hi02;
        bVar2.f127066a = mm03;
        C50564nm0 nm03 = new C50564nm0();
        nm03.setBaseResponse(new C49966ja());
        nm03.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = nm03;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
        bVar2.f127069d = 3953;
        w1Var2.mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] username=" + list);
        w1Var2.mo9225i().mo123419C(new C61005d(this, linkedList, list, i, lVar));
    }

    /* renamed from: e */
    public final void mo85975e(C32226l<? super C60187m5, C13598b0> lVar) {
        C87412m.m108594g(lVar, "call");
        String l = C75592q0.m90782l();
        if (!this.f173724a.containsKey(l)) {
            this.f173724a.put(l == null ? "" : l, this);
            C61007f fVar = new C61007f(this, l, lVar);
            LinkedList linkedList = new LinkedList();
            C60812w1 w1Var = new C60812w1();
            C47350c.C47352b bVar = new C47350c.C47352b();
            C64558mm0 mm02 = new C64558mm0();
            mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
            mm02.f184344f = 5;
            mm02.f184345g = C66785b.f191882e.mo90662O5();
            bVar.f127066a = mm02;
            C50564nm0 nm02 = new C50564nm0();
            nm02.setBaseResponse(new C49966ja());
            nm02.getBaseResponse().f135956e = new C51163rv3();
            bVar.f127067b = nm02;
            bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
            bVar.f127069d = 3953;
            w1Var.mo123453j(bVar.mo72403a());
            Log.m105924i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] ");
            w1Var.mo9225i().mo123419C(new C61016i(linkedList, fVar, this));
            return;
        }
        Log.m105928w("Finder.ContactFetcher", "fetchAliasContact[req] is loading. just return");
    }

    /* renamed from: f */
    public final C65413c0 mo85976f() {
        return (C65413c0) ((C36570n) this.f173726c).getValue();
    }

    /* renamed from: g */
    public final C65414d0 mo85977g() {
        return (C65414d0) ((C36570n) this.f173725b).getValue();
    }
}
