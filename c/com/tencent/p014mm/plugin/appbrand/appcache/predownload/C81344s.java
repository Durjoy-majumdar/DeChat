package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import js0.C88021l;
import lp3.C88631d;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64186f0;
import sx3.C64187h0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.s */
public final class C81344s {

    /* renamed from: a */
    public static final C81344s f238811a = new C81344s();

    /* renamed from: b */
    public static final C81652f.C81653a[] f238812b = {C81652f.C81653a.WALLET_MALL_INDEX, C81652f.C81653a.CHATTING, C81652f.C81653a.QRCODE, C81652f.C81653a.QRCODE_PRE, C81652f.C81653a.MP_PRELOAD, C81652f.C81653a.WX_OPEN_SDK_PRE_FETCH};

    /* renamed from: c */
    public static final C32224a<C13598b0> f238813c = C29282a.f79979d;

    /* renamed from: d */
    public static final C88021l<String, C32224a<C13598b0>> f238814d = new C88021l<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, Long> f238815e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final long f238816f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.s$a */
    public static final class C29282a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C29282a f79979d = new C29282a();

        public C29282a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.s$c */
    public static final class C29283c<T> implements C88631d.C88632b {

        /* renamed from: a */
        public static final C29283c<T> f79980a = new C29283c<>();

        /* renamed from: a */
        public void mo1772a(Object obj) {
            List list = (List) obj;
            if (!(list == null || list.isEmpty())) {
                C61926c.m72656A((String) null, new C29291u(list));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.s$b */
    public static final class C81345b implements C81662k.C81675k {

        /* renamed from: a */
        public final /* synthetic */ List<String> f238817a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f238818b;

        public C81345b(List<String> list, C32224a<C13598b0> aVar) {
            this.f238817a = list;
            this.f238818b = aVar;
        }

        /* renamed from: a */
        public void mo109935a() {
            C81344s sVar = C81344s.f238811a;
            for (String g : this.f238817a) {
                Set<C32224a<C13598b0>> g2 = C81344s.f238814d.mo122466g(g);
                if (g2 == null) {
                    g2 = C64187h0.f181908d;
                }
                for (C32224a invoke : g2) {
                    invoke.invoke();
                }
            }
            this.f238818b.invoke();
        }

        /* renamed from: b */
        public void mo113620b(List<String> list) {
            if (list == null) {
                list = C64186f0.f181907d;
            }
            new LinkedList(list);
            for (String e : this.f238817a) {
                C81344s.f238814d.mo122464e(e, C81344s.f238813c);
            }
        }
    }

    /* renamed from: a */
    public final void mo113619a(List<String> list, C81652f.C81653a aVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(list, "usernameList");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(aVar2, "onSuccess");
        C81662k.m100184c(list, aVar, new C81345b(list, aVar2)).mo114038a(C29283c.f79980a);
    }
}
