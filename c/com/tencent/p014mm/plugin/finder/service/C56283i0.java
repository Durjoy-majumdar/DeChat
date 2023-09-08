package com.tencent.p014mm.plugin.finder.service;

import cm1.C55018j0;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86301e;
import di3.C86312j;
import e03.C58469b;
import ei3.C86522b;
import ft3.C116895f;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60214y3;
import ht1.C8770h2;
import it1.C9246a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46547x1;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50141kk1;
import te3.C52002xp0;
import te3.C64689rq2;
import up1.C65426w0;
import vp1.C65834e;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.i0 */
public final class C56283i0 extends C86301e implements C8770h2 {

    /* renamed from: d */
    public final ConcurrentHashMap<String, FinderObject> f160851d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public final C56284a f160852e = new C56284a();

    /* renamed from: com.tencent.mm.plugin.finder.service.i0$a */
    public static final class C56284a implements C60214y3 {

        /* renamed from: a */
        public final C13601g f160853a = C36568h.m40985a(new C56285a(this));

        /* renamed from: b */
        public C60214y3.C60215a f160854b;

        /* renamed from: c */
        public final ConcurrentHashMap<Long, String> f160855c = new ConcurrentHashMap<>();

        /* renamed from: com.tencent.mm.plugin.finder.service.i0$a$a */
        public static final class C56285a extends C87413o implements C32224a<C56280g0> {

            /* renamed from: d */
            public final /* synthetic */ C56284a f160856d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56285a(C56284a aVar) {
                super(0);
                this.f160856d = aVar;
            }

            public Object invoke() {
                C56280g0 g0Var = new C56280g0(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0());
                g0Var.f167880i.add(new C56282h0(this.f160856d));
                return g0Var;
            }
        }

        /* renamed from: a */
        public void mo78734a(C60214y3.C60215a aVar) {
            C87412m.m108594g(aVar, "callback");
            this.f160854b = aVar;
        }

        /* renamed from: b */
        public void mo78735b(long j) {
            C116895f.m164891c("FinderFeedDetailService", "[cancelFeed]... " + C61926c.m72691p(j));
            String str = this.f160855c.get(Long.valueOf(j));
            if (str != null) {
                C56280g0 g0Var = (C56280g0) ((C36570n) this.f160853a).getValue();
                g0Var.getClass();
                g0Var.mo83520a(str, true, "cancel");
                g0Var.mo83525g();
            }
        }

        /* renamed from: c */
        public void mo78736c(int i, List<? extends FinderObject> list, int i2) {
            String str;
            List<? extends FinderObject> list2 = list;
            C87412m.m108594g(list2, "feeds");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
            for (FinderObject a : list) {
                FinderItem a2 = FinderItem.Companion.mo79056a(a, 0);
                C55018j0 j0Var = new C55018j0(a2);
                ConcurrentHashMap<Long, String> concurrentHashMap = this.f160855c;
                Long valueOf = Long.valueOf(j0Var.getItemId());
                C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(a2.getMediaList());
                if (rq22 == null || (str = rq22.f185275p) == null) {
                    str = "";
                }
                concurrentHashMap.put(valueOf, str);
                arrayList.add(new C13604l(j0Var, j0Var.mo3513o().getMediaList()));
            }
            C13604l lVar = (C13604l) C110818d0.m150916N(arrayList);
            if (lVar != null) {
                C58469b bVar = r5;
                C58469b bVar2 = new C58469b(1, -1, i, 4, 0, (String) null, i2, 48, (C8480h) null);
                ((C56280g0) ((C36570n) this.f160853a).getValue()).mo83526h(bVar, FeedData.Companion.mo78883a((BaseFinderFeed) lVar.f38555d), C110818d0.m150900B0(arrayList), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.i0$b */
    public static final class C56286b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C56283i0 f160857a;

        /* renamed from: b */
        public final /* synthetic */ String f160858b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<String, FinderObject, C13598b0> f160859c;

        public C56286b(C56283i0 i0Var, String str, C32227p<? super String, ? super FinderObject, C13598b0> pVar) {
            this.f160857a = i0Var;
            this.f160858b = str;
            this.f160859c = pVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            long j = finderObject != null ? finderObject.f164794id : 0;
            if (cVar.f256794b == 0 && cVar.f256793a == 0 && j != 0) {
                C87412m.m108591d(finderObject);
                this.f160857a.f160851d.put(this.f160858b, finderObject);
                C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(finderObject, 0), C65834e.C65836b.f189330j);
            }
            this.f160859c.invoke(this.f160858b, ((C50008jm0) cVar.f256796d).f136184e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: Gq */
    public C60214y3 mo9592Gq() {
        return this.f160852e;
    }

    /* renamed from: Yf */
    public C60214y3 mo9593Yf() {
        return new C56284a();
    }

    /* renamed from: ii */
    public C89132b<C52002xp0> mo9594ii(String str, int i, Long l, C89349b bVar, C50141kk1 kk12, C49712hj1 hj12) {
        C87412m.m108594g(str, "topic");
        return new C9246a(str, i, l, bVar, kk12, hj12);
    }

    /* renamed from: zM */
    public void mo9595zM(int i, String str, boolean z, String str2, C32227p<? super String, ? super FinderObject, C13598b0> pVar) {
        String str3 = str;
        C32227p<? super String, ? super FinderObject, C13598b0> pVar2 = pVar;
        C87412m.m108594g(str3, "encryptedObjectId");
        C87412m.m108594g(pVar2, "call");
        FinderObject finderObject = z ? this.f160851d.get(str3) : null;
        if (finderObject == null) {
            C49712hj1 hj12 = r1;
            C49712hj1 hj13 = new C49712hj1();
            hj13.f134675i = i;
            hj13.f134681r = str2;
            C13598b0 b0Var = C13598b0.f38549a;
            C32227p<? super String, ? super FinderObject, C13598b0> pVar3 = pVar2;
            new C46547x1(0, "", 0, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str, hj12, 0, (C49946j51) null, false, 118720, (C8480h) null).mo9225i().mo123419C(new C56286b(this, str, pVar));
            return;
        }
        pVar2.invoke(str3, finderObject);
    }
}
