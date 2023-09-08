package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60187m5;
import ht1.C60195q3;
import ht1.C60208v1;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46523h2;
import je1.C60812w1;
import ke1.C61001a;
import ke1.C61009b;
import ke1.C61010c;
import ke1.C61011d;
import ke1.C61013f;
import ke1.C61014g;
import ke1.C61015h;
import ob0.C47350c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50405mi0;
import te3.C50564nm0;
import te3.C51163rv3;
import te3.C64284cg;
import te3.C64366fi0;
import te3.C64397gi0;
import te3.C64414h71;
import te3.C64423hi0;
import te3.C64471ji0;
import te3.C64558mm0;
import up1.C52599l0;
import up1.C65413c0;
import up1.C65414d0;
import vq1.C65861r;
import zc1.C66785b;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService */
public final class FinderContactService extends C86301e implements C60208v1 {

    /* renamed from: d */
    public final C13601g f160823d = C36568h.m40985a(C29973n.f81144d);

    /* renamed from: e */
    public final C13601g f160824e = C36568h.m40985a(C56276o.f160846d);

    /* renamed from: f */
    public final C13601g f160825f = C36568h.m40985a(C56263a.f160829d);

    /* renamed from: g */
    public final C13601g f160826g = C36568h.m40985a(C56268f.f160838d);

    /* renamed from: h */
    public final Map<String, C58969q> f160827h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public final ConcurrentHashMap<String, Object> f160828i = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$n */
    public static final class C29973n extends C87413o implements C32224a<C52599l0> {

        /* renamed from: d */
        public static final C29973n f81144d = new C29973n();

        public C29973n() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$a */
    public static final class C56263a extends C87413o implements C32224a<C65413c0> {

        /* renamed from: d */
        public static final C56263a f160829d = new C56263a();

        public C56263a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Jx0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$b */
    public static final class C56264b extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderContactService f160830d;

        /* renamed from: e */
        public final /* synthetic */ String f160831e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56264b(FinderContactService finderContactService, String str) {
            super(1);
            this.f160830d = finderContactService;
            this.f160831e = str;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            this.f160830d.f160828i.remove(this.f160831e);
            Log.m105924i("Finder.ContactService", "[checkContactExpired#result] talker=" + this.f160831e + " nick=" + m5Var.getNickname());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$c */
    public static final class C56265c extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f160832d;

        /* renamed from: e */
        public final /* synthetic */ FinderContactService f160833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56265c(String str, FinderContactService finderContactService) {
            super(1);
            this.f160832d = str;
            this.f160833e = finderContactService;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[checkContactExpired#result] talker=" + this.f160832d + " nick=" + m5Var.getNickname());
            this.f160833e.f160828i.remove(this.f160832d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$d */
    public static final class C56266d extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f160834d;

        /* renamed from: e */
        public final /* synthetic */ FinderContactService f160835e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56266d(String str, FinderContactService finderContactService) {
            super(1);
            this.f160834d = str;
            this.f160835e = finderContactService;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[checkContactExpired#result] talker=" + this.f160834d + " nick=" + m5Var.getNickname());
            this.f160835e.f160828i.remove(this.f160834d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$e */
    public static final class C56267e extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f160836d;

        /* renamed from: e */
        public final /* synthetic */ FinderContactService f160837e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56267e(String str, FinderContactService finderContactService) {
            super(1);
            this.f160836d = str;
            this.f160837e = finderContactService;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[checkContactExpired#result] talker=" + this.f160836d + " nick=" + m5Var.getNickname());
            this.f160837e.f160828i.remove(this.f160836d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$f */
    public static final class C56268f extends C87413o implements C32224a<C61001a> {

        /* renamed from: d */
        public static final C56268f f160838d = new C56268f();

        public C56268f() {
            super(0);
        }

        public Object invoke() {
            return new C61001a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$g */
    public static final class C56269g extends C87413o implements C32226l<List<? extends C60187m5>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60210b f160839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56269g(C60208v1.C60210b bVar) {
            super(1);
            this.f160839d = bVar;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            this.f160839d.onDone(list);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$h */
    public static final class C56270h extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60210b f160840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56270h(C60208v1.C60210b bVar) {
            super(1);
            this.f160840d = bVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            this.f160840d.onDone(C26236u.m33719b(m5Var));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$i */
    public static final class C56271i extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60209a f160841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56271i(C60208v1.C60209a aVar) {
            super(1);
            this.f160841d = aVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[getFinderMsgAliasContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
            C60208v1.C60209a aVar = this.f160841d;
            if (aVar != null) {
                aVar.mo78737a(m5Var);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$j */
    public static final class C56272j extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60209a f160842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56272j(C60208v1.C60209a aVar) {
            super(1);
            this.f160842d = aVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[getFinderMsgFansContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
            C60208v1.C60209a aVar = this.f160842d;
            if (aVar != null) {
                aVar.mo78737a(m5Var);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$k */
    public static final class C56273k extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60209a f160843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56273k(C60208v1.C60209a aVar) {
            super(1);
            this.f160843d = aVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[getWxMsgContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
            C60208v1.C60209a aVar = this.f160843d;
            if (aVar != null) {
                aVar.mo78737a(m5Var);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$l */
    public static final class C56274l extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60209a f160844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56274l(C60208v1.C60209a aVar) {
            super(1);
            this.f160844d = aVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[getFinderMsgFansContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
            C60208v1.C60209a aVar = this.f160844d;
            if (aVar != null) {
                aVar.mo78737a(m5Var);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$m */
    public static final class C56275m extends C87413o implements C32226l<C60187m5, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60208v1.C60209a f160845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56275m(C60208v1.C60209a aVar) {
            super(1);
            this.f160845d = aVar;
        }

        public Object invoke(Object obj) {
            C60187m5 m5Var = (C60187m5) obj;
            C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.ContactService", "[getFinderMsgStrangerContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
            C60208v1.C60209a aVar = this.f160845d;
            if (aVar != null) {
                aVar.mo78737a(m5Var);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.FinderContactService$o */
    public static final class C56276o extends C87413o implements C32224a<C65414d0> {

        /* renamed from: d */
        public static final C56276o f160846d = new C56276o();

        public C56276o() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Kx0();
        }
    }

    public static boolean zx0(FinderContactService finderContactService, C60187m5 m5Var, boolean z, long j, int i, Object obj) {
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = -1;
        }
        finderContactService.getClass();
        long updateTime = m5Var != null ? m5Var.getUpdateTime() : 0;
        long currentTimeMillis = System.currentTimeMillis() - updateTime;
        if (j == -1) {
            j = !z ? 86400000 : 120000;
        }
        if (currentTimeMillis >= j) {
            z2 = true;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("[isContactExpired] current=");
            long j2 = (long) 1000;
            sb.append(Util.formatUnixTime(System.currentTimeMillis() / j2));
            sb.append(" time=");
            sb.append(Util.formatUnixTime(updateTime / j2));
            Log.m105924i("Finder.ContactService", sb.toString());
        }
        return z2;
    }

    public void Aw0(String str, C60208v1.C60209a aVar, int i) {
        C87412m.m108594g(aVar, "callback");
        if (str != null) {
            xx0(C110818d0.m150900B0(C26236u.m33719b(str)), new FinderContactService$getFinderContact$3$1(aVar), i, -1);
        }
    }

    public final boolean Ax0(C60187m5 m5Var) {
        return (m5Var != null ? m5Var.getRetryCount() : 0) >= 3;
    }

    public void Do0(C60187m5 m5Var) {
        C87412m.m108594g(m5Var, "contact");
        String username = m5Var.getUsername();
        if (username != null) {
            if (!(username.length() > 0)) {
                username = null;
            }
            if (username != null) {
                if (!(m5Var instanceof C58969q)) {
                    m5Var = null;
                }
                if (m5Var != null) {
                    C58969q qVar = (C58969q) m5Var;
                    if (C72996z1.m85817T4(username)) {
                        C58961d.f168673a.mo84163k(qVar);
                    } else if (C72996z1.m85823W4(username)) {
                        yx0().mo89499S1(qVar, true);
                    } else if (C72996z1.m85821V4(username)) {
                        C60195q3.C60196a.m70255a((C65413c0) ((C36570n) this.f160825f).getValue(), qVar, false, 2, (Object) null);
                    } else {
                        Log.m105924i("Finder.ContactService", "[insertOrUpdateContact] illegel contact");
                    }
                }
            }
        }
    }

    /* renamed from: Ff */
    public C60187m5 mo78700Ff(String str) {
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (C72996z1.m85817T4(str)) {
            return x40(str);
        }
        if (C72996z1.m85823W4(str)) {
            return mo78709aq(str);
        }
        if (C72996z1.m85821V4(str)) {
            return mo78716qg(str);
        }
        return null;
    }

    /* renamed from: G6 */
    public void mo78701G6(String str, long j, long j2, long j3, C60208v1.C60209a aVar) {
        String str2 = str;
        long j4 = j;
        long j5 = j2;
        C60208v1.C60209a aVar2 = aVar;
        boolean z = false;
        if (str2 == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else if (j4 == 0) {
            Log.m105920e("Finder.ContactService", "feedId is 0.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else if (j5 == 0) {
            Log.m105920e("Finder.ContactService", "commentId is 0.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else {
            C58969q jo = yx0().mo89501jo(str2);
            if (jo != null) {
                if (jo.getNickname().length() == 0) {
                    z = true;
                }
                if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                    Log.m105924i("Finder.ContactService", "[getFinderMsgFansContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                    if (aVar2 != null) {
                        aVar2.mo78737a(jo);
                    }
                    return;
                }
            }
            if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
                C64397gi0 gi02 = new C64397gi0();
                gi02.f183333d = j4;
                gi02.f183334e = j5;
                gi02.f183335f = j3;
                gi02.f183336g = str2;
                C61001a wx02 = wx0();
                C56272j jVar = new C56272j(aVar2);
                wx02.getClass();
                String str3 = gi02.f183336g;
                if (!wx02.f173724a.containsKey(str3)) {
                    wx02.f173724a.put(str3 == null ? "" : str3, wx02);
                    List b = C26236u.m33719b(gi02);
                    C61011d dVar = new C61011d(wx02, str3, jVar);
                    LinkedList linkedList = new LinkedList();
                    C60812w1 w1Var = new C60812w1();
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    C64558mm0 mm02 = new C64558mm0();
                    mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
                    mm02.f184344f = 6;
                    mm02.f184345g = C66785b.f191882e.mo90662O5();
                    mm02.f184349n.addAll(b);
                    bVar.f127066a = mm02;
                    C50564nm0 nm02 = new C50564nm0();
                    nm02.setBaseResponse(new C49966ja());
                    nm02.getBaseResponse().f135956e = new C51163rv3();
                    bVar.f127067b = nm02;
                    bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
                    bVar.f127069d = 3953;
                    w1Var.mo123453j(bVar.mo72403a());
                    w1Var.mo9225i().mo123419C(new C61015h(b, linkedList, dVar, wx02));
                    return;
                }
                Log.m105928w("Finder.ContactFetcher", "[fetchContact7] req is loading. just return");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[getFinderContact] isContactRetryLimited contact=");
            sb.append(jo != null ? jo.getUsername() : null);
            Log.m105920e("Finder.ContactService", sb.toString());
            if (aVar2 != null) {
                if (jo == null) {
                    jo = new C58969q(str2);
                }
                aVar2.mo78737a(jo);
            }
        }
    }

    public void He0(String str, String str2, C60208v1.C60209a aVar) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar != null) {
                aVar.mo78737a(new C58969q());
                return;
            }
            return;
        }
        if (str2 == null || str2.length() == 0) {
            Log.m105920e("Finder.ContactService", "sessionId is null.");
            if (aVar != null) {
                aVar.mo78737a(new C58969q());
                return;
            }
            return;
        }
        C58969q jo = yx0().mo89501jo(str);
        if (jo != null) {
            if (jo.getNickname().length() == 0) {
                z = true;
            }
            if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                Log.m105924i("Finder.ContactService", "[getFinderMsgStrangerContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                if (aVar != null) {
                    aVar.mo78737a(jo);
                    return;
                }
                return;
            }
        }
        if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
            C61001a wx02 = wx0();
            C50405mi0 mi02 = new C50405mi0();
            mi02.f138041d = str;
            mi02.f138042e = str2;
            wx02.mo85973c(mi02, new C56275m(aVar));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getFinderContact] isContactRetryLimited contact=");
        sb.append(jo != null ? jo.getUsername() : null);
        Log.m105920e("Finder.ContactService", sb.toString());
        if (aVar != null) {
            if (jo == null) {
                jo = new C58969q(str);
            }
            aVar.mo78737a(jo);
        }
    }

    /* renamed from: Kv */
    public void mo78703Kv(String str, String str2, C60208v1.C60209a aVar) {
        C87412m.m108594g(str2, "fansId");
        boolean z = false;
        if (str == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar != null) {
                aVar.mo78737a(new C58969q());
                return;
            }
            return;
        }
        C58969q jo = yx0().mo89501jo(str);
        if (jo != null) {
            if (jo.getNickname().length() == 0) {
                z = true;
            }
            if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                Log.m105924i("Finder.ContactService", "[getFinderMsgFansContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                if (aVar != null) {
                    aVar.mo78737a(jo);
                    return;
                }
                return;
            }
        }
        if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
            C64471ji0 ji02 = new C64471ji0();
            ji02.f183800d = str2;
            ji02.f183801e = str;
            C61001a wx02 = wx0();
            C56274l lVar = new C56274l(aVar);
            wx02.getClass();
            String str3 = ji02.f183801e;
            if (!wx02.f173724a.containsKey(str3)) {
                wx02.f173724a.put(str3 == null ? "" : str3, wx02);
                List b = C26236u.m33719b(ji02);
                C61010c cVar = new C61010c(wx02, str3, lVar);
                LinkedList linkedList = new LinkedList();
                C60812w1 w1Var = new C60812w1();
                C47350c.C47352b bVar = new C47350c.C47352b();
                C64558mm0 mm02 = new C64558mm0();
                mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
                mm02.f184344f = 2;
                mm02.f184345g = C66785b.f191882e.mo90662O5();
                mm02.f184347i.addAll(b);
                bVar.f127066a = mm02;
                C50564nm0 nm02 = new C50564nm0();
                nm02.setBaseResponse(new C49966ja());
                nm02.getBaseResponse().f135956e = new C51163rv3();
                bVar.f127067b = nm02;
                bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
                bVar.f127069d = 3953;
                w1Var.mo123453j(bVar.mo72403a());
                w1Var.mo9225i().mo123419C(new C61014g(b, linkedList, cVar, wx02));
                return;
            }
            Log.m105928w("Finder.ContactFetcher", "[fetchContact6] req is loading. just return");
            lVar.invoke(new C58969q());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getFinderContact] isContactRetryLimited contact=");
        sb.append(jo != null ? jo.getUsername() : null);
        Log.m105920e("Finder.ContactService", sb.toString());
        if (aVar != null) {
            if (jo == null) {
                jo = new C58969q(str);
            }
            aVar.mo78737a(jo);
        }
    }

    /* renamed from: O1 */
    public boolean mo78704O1(String str) {
        return ((C52599l0) ((C36570n) this.f160823d).getValue()).mo71553G2(str).field_rejectMsg == 1;
    }

    public C64284cg O40(C60187m5 m5Var) {
        C58969q qVar = m5Var instanceof C58969q ? (C58969q) m5Var : null;
        if (qVar != null) {
            return C58960c.m68830b(qVar, false);
        }
        return null;
    }

    /* renamed from: TU */
    public void mo78706TU() {
        Log.m105924i("Finder.ContactService", "[clearFollowStateCache]");
        this.f160827h.clear();
    }

    /* renamed from: VB */
    public /* bridge */ /* synthetic */ void mo78707VB(String str, Boolean bool) {
        vx0(str, bool.booleanValue());
    }

    /* renamed from: Wd */
    public void mo78708Wd(String str, C60208v1.C60209a aVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "callback");
        xx0(C110818d0.m150900B0(C26236u.m33719b(str)), new FinderContactService$getFinderContact$2(aVar), 0, -1);
    }

    /* renamed from: aq */
    public C60187m5 mo78709aq(String str) {
        C13598b0 b0Var = null;
        if (str == null) {
            return null;
        }
        C58969q jo = yx0().mo89501jo(str);
        if (jo != null) {
            Log.m105924i("Finder.ContactService", "[getLocalFinderStrangerContact] " + jo.getUsername() + '=' + jo.getNickname());
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("Finder.ContactService", "[getLocalFinderStrangerContact] get contact return null. " + str);
        }
        return jo;
    }

    /* renamed from: cT */
    public void mo78710cT(String str, Long l, Long l2, C60208v1.C60209a aVar) {
        String str2 = str;
        C60208v1.C60209a aVar2 = aVar;
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        boolean z = true;
        if (str2 == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else if (longValue == 0) {
            Log.m105920e("Finder.ContactService", "commentId is null.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else if (longValue2 == 0) {
            Log.m105920e("Finder.ContactService", "objectId is null.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
            }
        } else {
            C58969q jo = yx0().mo89501jo(str2);
            if (jo != null) {
                if (jo.getNickname().length() != 0) {
                    z = false;
                }
                if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                    Log.m105924i("Finder.ContactService", "[getFinderMsgStrangerContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                    if (aVar2 != null) {
                        aVar2.mo78737a(jo);
                    }
                }
            }
            if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
                C61001a wx02 = wx0();
                C64366fi0 fi02 = new C64366fi0();
                fi02.f183140f = str2;
                fi02.f183139e = longValue;
                fi02.f183138d = longValue2;
                C56302y yVar = new C56302y(aVar2);
                wx02.getClass();
                String str3 = fi02.f183140f;
                if (!wx02.f173724a.containsKey(str3)) {
                    wx02.f173724a.put(str3 == null ? "" : str3, wx02);
                    List b = C26236u.m33719b(fi02);
                    C61009b bVar = new C61009b(wx02, str3, yVar);
                    LinkedList linkedList = new LinkedList();
                    C60812w1 w1Var = new C60812w1();
                    C47350c.C47352b bVar2 = new C47350c.C47352b();
                    C64558mm0 mm02 = new C64558mm0();
                    mm02.f184342d = C46523h2.f125330a.mo71859a(3953);
                    mm02.f184344f = 3;
                    mm02.f184345g = C66785b.f191882e.mo90662O5();
                    mm02.f184348j.addAll(b);
                    bVar2.f127066a = mm02;
                    C50564nm0 nm02 = new C50564nm0();
                    nm02.setBaseResponse(new C49966ja());
                    nm02.getBaseResponse().f135956e = new C51163rv3();
                    bVar2.f127067b = nm02;
                    bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetcontactlist";
                    bVar2.f127069d = 3953;
                    w1Var.mo123453j(bVar2.mo72403a());
                    w1Var.mo9225i().mo123419C(new C61013f(b, linkedList, bVar, wx02));
                    return;
                }
                Log.m105928w("Finder.ContactFetcher", "[fetchContact3] req is loading. just return");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[getFinderContact] isContactRetryLimited contact=");
            sb.append(jo != null ? jo.getUsername() : null);
            Log.m105920e("Finder.ContactService", sb.toString());
            if (aVar2 != null) {
                if (jo == null) {
                    jo = new C58969q(str2);
                }
                aVar2.mo78737a(jo);
                return;
            }
            return;
        }
    }

    /* renamed from: g */
    public void mo78711g(MStorage.IOnStorageChange iOnStorageChange) {
        Class cls = FinderCommonFeatureService.class;
        if (iOnStorageChange != null) {
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76850gW().remove(iOnStorageChange);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Kx0().remove(iOnStorageChange);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Jx0().remove(iOnStorageChange);
        }
    }

    /* renamed from: i */
    public void mo78712i(MStorage.IOnStorageChange iOnStorageChange) {
        Class cls = FinderCommonFeatureService.class;
        if (iOnStorageChange != null) {
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76850gW().add(iOnStorageChange);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Kx0().add(iOnStorageChange);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Jx0().add(iOnStorageChange);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        throw r2;
     */
    /* renamed from: iR */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo78713iR() {
        /*
            r10 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.i r0 = r0.mo76850gW()
            r1 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f188263d     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = "PRAGMA table_info(FinderContact)"
            r3 = 2
            android.database.Cursor r0 = r0.rawQuery(r2, r1, r3)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0022
        L_0x0017:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.FinderContactStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = r1
        L_0x0022:
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00a8
            int r3 = r0.getColumnCount()     // Catch:{ all -> 0x00a1 }
            r4 = r2
        L_0x002b:
            boolean r5 = r0.moveToNext()     // Catch:{ all -> 0x00a1 }
            if (r5 == 0) goto L_0x009a
            java.lang.String r5 = "name"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ all -> 0x00a1 }
            r6 = 0
            r7 = 1
            if (r5 < 0) goto L_0x003f
            if (r5 >= r3) goto L_0x003f
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            java.lang.String r9 = "it.getString(index)"
            if (r8 == 0) goto L_0x0060
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x00a1 }
            gy3.C87412m.m108593f(r5, r9)     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r8.<init>()     // Catch:{ all -> 0x00a1 }
            r8.append(r2)     // Catch:{ all -> 0x00a1 }
            r8.append(r5)     // Catch:{ all -> 0x00a1 }
            r5 = 58
            r8.append(r5)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x00a1 }
            goto L_0x0061
        L_0x0060:
            r5 = r2
        L_0x0061:
            java.lang.String r8 = "type"
            int r8 = r0.getColumnIndex(r8)     // Catch:{ all -> 0x00a1 }
            if (r8 < 0) goto L_0x006d
            if (r8 >= r3) goto L_0x006d
            r6 = 1
        L_0x006d:
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = r0.getString(r8)     // Catch:{ all -> 0x00a1 }
            gy3.C87412m.m108593f(r6, r9)     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r7.<init>()     // Catch:{ all -> 0x00a1 }
            r7.append(r5)     // Catch:{ all -> 0x00a1 }
            r7.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x00a1 }
        L_0x0085:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r6.<init>()     // Catch:{ all -> 0x00a1 }
            r6.append(r4)     // Catch:{ all -> 0x00a1 }
            r6.append(r5)     // Catch:{ all -> 0x00a1 }
            r4 = 59
            r6.append(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00a1 }
            goto L_0x002b
        L_0x009a:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a1 }
            cy3.C58003b.m67160a(r0, r1)
            r2 = r4
            goto L_0x00a8
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        L_0x00a8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.FinderContactService.mo78713iR():java.lang.String");
    }

    public void lf0(String str, C60208v1.C60209a aVar, long j, String str2, long j2) {
        String str3 = str;
        C60208v1.C60209a aVar2 = aVar;
        String str4 = str2;
        C87412m.m108594g(str4, "favId");
        boolean z = false;
        if (str3 == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar2 != null) {
                aVar2.mo78737a(new C58969q());
                return;
            }
            return;
        }
        C58969q jo = yx0().mo89501jo(str);
        if (jo != null) {
            if (jo.getNickname().length() == 0) {
                z = true;
            }
            if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                Log.m105924i("Finder.ContactService", "[getWxMsgContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                if (aVar2 != null) {
                    aVar2.mo78737a(jo);
                }
                return;
            }
        }
        if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
            C61001a wx02 = wx0();
            C56273k kVar = new C56273k(aVar2);
            C64423hi0 hi02 = new C64423hi0();
            hi02.f183493d = j;
            hi02.f183497h = str4;
            hi02.f183494e = j2;
            wx02.mo85972b("", kVar, 8, str, hi02);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getWxMsgContact] isContactRetryLimited contact=");
        sb.append(jo != null ? jo.getUsername() : null);
        Log.m105920e("Finder.ContactService", sb.toString());
        if (aVar2 != null) {
            if (jo == null) {
                jo = new C58969q(str);
            }
            aVar2.mo78737a(jo);
        }
    }

    /* renamed from: m8 */
    public void mo78715m8(String str, String str2, C60208v1.C60209a aVar) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            Log.m105920e("Finder.ContactService", "username is null.");
            if (aVar != null) {
                aVar.mo78737a(new C58969q());
                return;
            }
            return;
        }
        if (str2 == null || str2.length() == 0) {
            Log.m105920e("Finder.ContactService", "sessionId is null.");
            if (aVar != null) {
                aVar.mo78737a(new C58969q());
                return;
            }
            return;
        }
        C58969q jo = ((C65413c0) ((C36570n) this.f160825f).getValue()).mo89497jo(str);
        if (jo != null) {
            if (jo.getNickname().length() != 0) {
                z = false;
            }
            if (!z && !zx0(this, jo, false, 0, 6, (Object) null)) {
                Log.m105924i("Finder.ContactService", "[getFinderMsgAliasContact] local completed! result=" + jo.getUsername() + '=' + jo.getNickname());
                if (aVar != null) {
                    aVar.mo78737a(jo);
                    return;
                }
                return;
            }
        }
        if (!Ax0(jo) || zx0(this, jo, false, 0, 6, (Object) null)) {
            wx0().mo85975e(new C56271i(aVar));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getFinderMsgAliasContact] isContactRetryLimited contact=");
        sb.append(jo != null ? jo.getUsername() : null);
        Log.m105920e("Finder.ContactService", sb.toString());
        if (aVar != null) {
            if (jo == null) {
                jo = new C58969q(str);
            }
            aVar.mo78737a(jo);
        }
    }

    /* renamed from: qg */
    public C60187m5 mo78716qg(String str) {
        C13598b0 b0Var = null;
        if (str == null) {
            return null;
        }
        C58969q jo = ((C65413c0) ((C36570n) this.f160825f).getValue()).mo89497jo(str);
        if (jo != null) {
            Log.m105924i("Finder.ContactService", "[getLocalFinderMsgAliasContact] " + jo.getUsername() + '=' + jo.getNickname());
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("Finder.ContactService", "[getLocalFinderMsgAliasContact] get contact return null. " + str);
        }
        return jo;
    }

    /* renamed from: rl */
    public void mo78717rl(String str, int i, Long l, boolean z, int i2) {
        long longValue = l.longValue();
        if (str != null) {
            C65861r rVar = C65861r.f189395e;
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134677n = i2;
            C13598b0 b0Var = C13598b0.f38549a;
            rVar.mo89898a(str, i, longValue, hj12, z, 0, "", (C64414h71) null, 0);
        }
    }

    /* renamed from: s9 */
    public C60187m5 mo78718s9(FinderContact finderContact) {
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        if ((r1 == null || r1.length() == 0) == false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void vx0(java.lang.String r22, boolean r23) {
        /*
            r21 = this;
            r8 = r21
            java.lang.Class<ht1.k4> r0 = ht1.C60179k4.class
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85825X4(r22)
            if (r1 == 0) goto L_0x0018
            di3.d r1 = di3.C86312j.m106911c(r0)
            ht1.k4 r1 = (ht1.C60179k4) r1
            r2 = r22
            java.lang.String r1 = r1.mo78770n(r2)
            r9 = r1
            goto L_0x001b
        L_0x0018:
            r2 = r22
            r9 = r2
        L_0x001b:
            r10 = 1
            r11 = 0
            if (r9 == 0) goto L_0x0028
            int r1 = r9.length()
            if (r1 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 0
            goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            return
        L_0x002c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f160828i
            boolean r1 = r1.containsKey(r9)
            if (r1 == 0) goto L_0x0035
            return
        L_0x0035:
            er1.w3 r1 = er1.C58784w3.f168295a
            r1.getClass()
            java.lang.String r1 = "talker"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            up1.l0 r1 = r1.mo76736Au()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select rowid from FinderSessionInfo  where talker = '"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "' limit 1"
            r2.append(r3)
            java.lang.String r12 = r2.toString()
            long r2 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f146902d
            r7 = 0
            android.database.Cursor r1 = r1.rawQuery(r12, r7)
            r19 = 0
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0226 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0226 }
            java.lang.String r5 = "currentThread().name"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x0226 }
            java.lang.String r5 = "sql"
            gy3.C87412m.m108594g(r12, r5)     // Catch:{ all -> 0x0226 }
            r13 = 44
            r14 = 59
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r15 = z04.C112551y.m153815o(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0226 }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0226 }
            long r16 = r5 - r2
            java.lang.String r14 = "FinderSessionInfoStorage.getSessionInfoByTalker"
            ue1.e r2 = new ue1.e     // Catch:{ all -> 0x0226 }
            r13 = r2
            r18 = r4
            r13.<init>(r14, r15, r16, r18, r19)     // Catch:{ all -> 0x0226 }
            r2.mo89421a()     // Catch:{ all -> 0x0226 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x0226 }
            if (r2 <= 0) goto L_0x00aa
            r2 = 1
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0226 }
            cy3.C58003b.m67160a(r1, r7)
            if (r2 != 0) goto L_0x00b3
            return
        L_0x00b3:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85817T4(r9)
            if (r1 == 0) goto L_0x00be
            ht1.m5 r1 = r8.x40(r9)
            goto L_0x00e1
        L_0x00be:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85823W4(r9)
            if (r1 == 0) goto L_0x00cd
            up1.d0 r1 = r21.yx0()
            fe1.q r1 = r1.mo89501jo(r9)
            goto L_0x00e1
        L_0x00cd:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85821V4(r9)
            if (r1 == 0) goto L_0x00e3
            rx3.g r1 = r8.f160825f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            up1.c0 r1 = (up1.C65413c0) r1
            fe1.q r1 = r1.mo89497jo(r9)
        L_0x00e1:
            r12 = r1
            goto L_0x00e4
        L_0x00e3:
            r12 = r7
        L_0x00e4:
            if (r12 == 0) goto L_0x0122
            r1 = r12
            fe1.q r1 = (fe1.C58969q) r1
            java.lang.String r2 = r1.getNickname()
            if (r2 == 0) goto L_0x00f8
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r2 = 0
            goto L_0x00f9
        L_0x00f8:
            r2 = 1
        L_0x00f9:
            if (r2 != 0) goto L_0x0122
            if (r23 == 0) goto L_0x010f
            java.lang.String r1 = r1.getAvatarUrl()
            if (r1 == 0) goto L_0x010c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r1 = 0
            goto L_0x010d
        L_0x010c:
            r1 = 1
        L_0x010d:
            if (r1 != 0) goto L_0x0122
        L_0x010f:
            r3 = 0
            r4 = 0
            r6 = 6
            r13 = 0
            r1 = r21
            r2 = r12
            r14 = r7
            r7 = r13
            boolean r1 = zx0(r1, r2, r3, r4, r6, r7)
            if (r1 == 0) goto L_0x0120
            goto L_0x0123
        L_0x0120:
            r1 = 0
            goto L_0x017e
        L_0x0122:
            r14 = r7
        L_0x0123:
            boolean r1 = r8.Ax0(r12)
            if (r1 == 0) goto L_0x013a
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r1 = r21
            r2 = r12
            boolean r1 = zx0(r1, r2, r3, r4, r6, r7)
            if (r1 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r1 = 0
            goto L_0x013b
        L_0x013a:
            r1 = 1
        L_0x013b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[checkContactExpired] isNeedGetContact="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " talker="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " nickname="
            r2.append(r3)
            if (r12 == 0) goto L_0x015f
            r3 = r12
            fe1.q r3 = (fe1.C58969q) r3
            java.lang.String r7 = r3.getNickname()
            goto L_0x0160
        L_0x015f:
            r7 = r14
        L_0x0160:
            r2.append(r7)
            java.lang.String r3 = " avatar="
            r2.append(r3)
            if (r12 == 0) goto L_0x0171
            fe1.q r12 = (fe1.C58969q) r12
            java.lang.String r7 = r12.getAvatarUrl()
            goto L_0x0172
        L_0x0171:
            r7 = r14
        L_0x0172:
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.ContactService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
        L_0x017e:
            if (r1 == 0) goto L_0x0225
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f160828i
            r1.put(r9, r8)
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85817T4(r9)
            if (r1 == 0) goto L_0x019e
            ke1.a r2 = r21.wx0()
            com.tencent.mm.plugin.finder.service.FinderContactService$b r4 = new com.tencent.mm.plugin.finder.service.FinderContactService$b
            r4.<init>(r8, r9)
            r5 = 0
            r7 = 0
            java.lang.String r6 = ""
            r3 = r9
            r2.mo85972b(r3, r4, r5, r6, r7)
            goto L_0x0225
        L_0x019e:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85823W4(r9)
            r2 = 3
            if (r1 == 0) goto L_0x01d7
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.k4 r0 = (ht1.C60179k4) r0
            java.lang.String r0 = r0.ds0(r9, r2)
            if (r0 == 0) goto L_0x01b9
            int r1 = r0.length()
            if (r1 != 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r10 = 0
        L_0x01b9:
            if (r10 == 0) goto L_0x01c1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r8.f160828i
            r0.remove(r9)
            return
        L_0x01c1:
            ke1.a r1 = r21.wx0()
            te3.mi0 r2 = new te3.mi0
            r2.<init>()
            r2.f138041d = r9
            r2.f138042e = r0
            com.tencent.mm.plugin.finder.service.FinderContactService$c r0 = new com.tencent.mm.plugin.finder.service.FinderContactService$c
            r0.<init>(r9, r8)
            r1.mo85973c(r2, r0)
            goto L_0x0225
        L_0x01d7:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85821V4(r9)
            if (r1 == 0) goto L_0x0225
            java.lang.String r1 = eb0.C75592q0.m90782l()
            boolean r1 = gy3.C87412m.m108589b(r9, r1)
            if (r1 == 0) goto L_0x01f4
            ke1.a r0 = r21.wx0()
            com.tencent.mm.plugin.finder.service.FinderContactService$d r1 = new com.tencent.mm.plugin.finder.service.FinderContactService$d
            r1.<init>(r9, r8)
            r0.mo85975e(r1)
            goto L_0x0225
        L_0x01f4:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.k4 r0 = (ht1.C60179k4) r0
            java.lang.String r0 = r0.ds0(r9, r2)
            if (r0 == 0) goto L_0x0208
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0207
            goto L_0x0208
        L_0x0207:
            r10 = 0
        L_0x0208:
            if (r10 == 0) goto L_0x0210
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r8.f160828i
            r0.remove(r9)
            return
        L_0x0210:
            ke1.a r1 = r21.wx0()
            te3.mi0 r2 = new te3.mi0
            r2.<init>()
            r2.f138041d = r9
            r2.f138042e = r0
            com.tencent.mm.plugin.finder.service.FinderContactService$e r0 = new com.tencent.mm.plugin.finder.service.FinderContactService$e
            r0.<init>(r9, r8)
            r1.mo85973c(r2, r0)
        L_0x0225:
            return
        L_0x0226:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.FinderContactService.vx0(java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053 A[Catch:{ all -> 0x004e }, LOOP:0: B:1:0x0043->B:11:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[EDGE_INSN: B:22:0x0065->B:15:0x0065 ?: BREAK  , SYNTHETIC] */
    /* renamed from: wU */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.storage.C72996z1> mo78720wU() {
        /*
            r5 = this;
            fe1.d$b r0 = fe1.C58961d.f168673a
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM FinderContact WHERE follow_Flag = "
            r1.append(r2)
            int r2 = fe1.C58969q.f168707c2
            r1.append(r2)
            java.lang.String r2 = " AND user_flag = "
            r1.append(r2)
            r2 = 0
            r1.append(r2)
            java.lang.String r3 = " ORDER BY followTime DESC LIMIT "
            r1.append(r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Class<tf0.p1> r3 = tf0.C64916p1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.p1 r3 = (tf0.C64916p1) r3
            up1.i r3 = r3.mo76697gW()
            java.lang.String[] r4 = new java.lang.String[r2]
            android.database.Cursor r1 = r3.rawQuery(r1, r4)
        L_0x0043:
            r3 = 1
            if (r1 == 0) goto L_0x0050
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x004e }
            if (r4 != r3) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x004e:
            r0 = move-exception
            goto L_0x005f
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0065
            fe1.q r3 = new fe1.q     // Catch:{ all -> 0x004e }
            r3.<init>()     // Catch:{ all -> 0x004e }
            r3.convertFrom(r1)     // Catch:{ all -> 0x004e }
            r0.add(r3)     // Catch:{ all -> 0x004e }
            goto L_0x0043
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            throw r0
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()
        L_0x006a:
            java.lang.String r1 = fe1.C58961d.f168674b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "selectFollowedContact result: "
            r2.append(r4)
            int r4 = r0.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0093:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a8
            java.lang.Object r2 = r0.next()
            fe1.q r2 = (fe1.C58969q) r2
            r4 = 0
            com.tencent.mm.storage.z1 r2 = fe1.C58969q.m68863s2(r2, r4, r3, r4)
            r1.add(r2)
            goto L_0x0093
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.FinderContactService.mo78720wU():java.util.List");
    }

    public final C61001a wx0() {
        return (C61001a) ((C36570n) this.f160826g).getValue();
    }

    public C60187m5 x40(String str) {
        if (str != null) {
            return C58961d.f168673a.mo84155b(str);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void xx0(java.util.List<java.lang.String> r22, ht1.C60208v1.C60210b r23, int r24, long r25) {
        /*
            r21 = this;
            r1 = r22
            r3 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[getContact] begin... usernameList="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.ContactService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContactImpl$wrapCallback$1 r0 = new com.tencent.mm.plugin.finder.service.FinderContactService$getFinderContactImpl$wrapCallback$1
            r4 = r23
            r0.<init>(r1, r4)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r6 = r22.iterator()
        L_0x002f:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = "Finder.FinderAdContactLogic"
            r9 = 4
            r10 = 0
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L_0x016d
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            int r13 = r7.length()
            if (r13 != 0) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r13 == 0) goto L_0x005b
            java.lang.String r7 = "username is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
            fe1.q r7 = new fe1.q
            r7.<init>()
            r4.add(r7)
            goto L_0x002f
        L_0x005b:
            if (r3 != r9) goto L_0x00de
            int r9 = fe1.C58957a.f168667a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 == 0) goto L_0x0066
            goto L_0x0090
        L_0x0066:
            fe1.a$a r9 = fe1.C58957a.f168669c
            r9.getClass()
            java.util.Map<java.lang.String, fe1.q> r9 = r9.f168670a
            java.lang.Object r9 = r9.get(r7)
            fe1.q r9 = (fe1.C58969q) r9
            if (r9 == 0) goto L_0x007a
            fe1.q r9 = r9.mo84187l2()
            goto L_0x007b
        L_0x007a:
            r9 = r10
        L_0x007b:
            if (r9 == 0) goto L_0x0090
            java.lang.String r9 = r9.field_username
            if (r9 == 0) goto L_0x008a
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r9 = 0
            goto L_0x008b
        L_0x008a:
            r9 = 1
        L_0x008b:
            if (r9 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r9 = 1
            goto L_0x0091
        L_0x0090:
            r9 = 0
        L_0x0091:
            if (r9 == 0) goto L_0x00dc
            fe1.d$b r9 = fe1.C58961d.f168673a
            fe1.q r9 = r9.mo84155b(r7)
            fe1.a$a r13 = fe1.C58957a.f168669c
            r13.getClass()
            java.util.Map<java.lang.String, fe1.q> r13 = r13.f168670a
            java.lang.Object r13 = r13.get(r7)
            fe1.q r13 = (fe1.C58969q) r13
            if (r13 == 0) goto L_0x00ad
            fe1.q r13 = r13.mo84187l2()
            goto L_0x00ae
        L_0x00ad:
            r13 = r10
        L_0x00ae:
            if (r13 == 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00cb
            int r9 = r9.field_follow_Flag
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "update cache field_follow_Flag "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r14)
            r13.field_follow_Flag = r9
        L_0x00cb:
            java.lang.Class<tf0.p1> r8 = tf0.C64916p1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            tf0.p1 r8 = (tf0.C64916p1) r8
            int r8 = r8.mo76717qx(r7)
            if (r8 <= 0) goto L_0x00e4
            r13.field_friendFollowCount = r8
            goto L_0x00e4
        L_0x00dc:
            r13 = r10
            goto L_0x00e4
        L_0x00de:
            fe1.d$b r8 = fe1.C58961d.f168673a
            fe1.q r13 = r8.mo84155b(r7)
        L_0x00e4:
            if (r13 == 0) goto L_0x010c
            java.lang.String r8 = r13.getNickname()
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00f2
            r8 = 1
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            if (r8 != 0) goto L_0x010c
            r16 = 0
            r19 = 2
            r20 = 0
            r14 = r21
            r15 = r13
            r17 = r25
            boolean r8 = zx0(r14, r15, r16, r17, r19, r20)
            if (r8 == 0) goto L_0x0107
            goto L_0x010c
        L_0x0107:
            r4.add(r13)
            goto L_0x002f
        L_0x010c:
            r8 = r21
            boolean r9 = r8.Ax0(r13)
            if (r9 == 0) goto L_0x0149
            r16 = 0
            r19 = 2
            r20 = 0
            r14 = r21
            r15 = r13
            r17 = r25
            boolean r9 = zx0(r14, r15, r16, r17, r19, r20)
            if (r9 != 0) goto L_0x0149
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "[getFinderContact] isContactRetryLimited contact="
            r9.append(r11)
            if (r13 == 0) goto L_0x0135
            java.lang.String r10 = r13.getUsername()
        L_0x0135:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            fe1.q r9 = new fe1.q
            r9.<init>(r7)
            r4.add(r9)
            goto L_0x002f
        L_0x0149:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "contact is null["
            r9.append(r10)
            if (r13 != 0) goto L_0x0156
            r11 = 1
        L_0x0156:
            r9.append(r11)
            java.lang.String r10 = "]. username="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            r5.add(r7)
            goto L_0x002f
        L_0x016d:
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x01e6
            if (r3 != r9) goto L_0x01a8
            long r6 = fe1.C58957a.f168668b
            r13 = 0
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0197
            int r2 = fe1.C58957a.f168667a
            if (r2 <= 0) goto L_0x0197
            long r6 = eb0.C31543z5.m39453c()
            long r13 = fe1.C58957a.f168668b
            long r6 = r6 - r13
            int r2 = fe1.C58957a.f168667a
            long r13 = (long) r2
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0197
            java.lang.String r2 = "interceptRequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            r11 = 1
            goto L_0x01a2
        L_0x0197:
            java.lang.String r2 = "not interceptRequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            long r6 = eb0.C31543z5.m39453c()
            fe1.C58957a.f168668b = r6
        L_0x01a2:
            if (r11 == 0) goto L_0x01a8
            r0.onDone(r10)
            return
        L_0x01a8:
            int r2 = r5.size()
            if (r2 <= r12) goto L_0x01c5
            ke1.a r2 = r21.wx0()
            com.tencent.mm.plugin.finder.service.FinderContactService$g r4 = new com.tencent.mm.plugin.finder.service.FinderContactService$g
            r4.<init>(r0)
            r5 = 0
            java.lang.String r6 = ""
            r0 = r2
            r1 = r22
            r2 = r4
            r3 = r24
            r4 = r6
            r0.mo85974d(r1, r2, r3, r4, r5)
            goto L_0x01e9
        L_0x01c5:
            ke1.a r1 = r21.wx0()
            java.lang.Object r2 = r5.getFirst()
            java.lang.String r4 = "reqList.first"
            gy3.C87412m.m108593f(r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.mm.plugin.finder.service.FinderContactService$h r4 = new com.tencent.mm.plugin.finder.service.FinderContactService$h
            r4.<init>(r0)
            r5 = 0
            java.lang.String r6 = ""
            r0 = r1
            r1 = r2
            r2 = r4
            r3 = r24
            r4 = r6
            r0.mo85972b(r1, r2, r3, r4, r5)
            goto L_0x01e9
        L_0x01e6:
            r0.onDone(r4)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.FinderContactService.xx0(java.util.List, ht1.v1$b, int, long):void");
    }

    public final C65414d0 yx0() {
        return (C65414d0) ((C36570n) this.f160824e).getValue();
    }

    public void z00(List<String> list, long j, C60208v1.C60210b bVar) {
        C87412m.m108594g(list, "usernameList");
        if (bVar == null) {
            bVar = FinderContactService$getFinderContact$1.INSTANCE;
        }
        xx0(list, bVar, 0, j);
    }
}
