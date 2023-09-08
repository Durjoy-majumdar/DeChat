package gf1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C87412m;
import ig1.C33320g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C11386s;
import ob0.C35133k;
import p165hr.C60106t;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C50080k43;
import te3.C50144kl0;
import te3.C50694ok;
import ux3.C65486b;

/* renamed from: gf1.d */
public final class C32434d implements C11386s {

    /* renamed from: d */
    public static final C32434d f86010d = new C32434d();

    /* renamed from: e */
    public static String f86011e;

    /* renamed from: f */
    public static String f86012f;

    /* renamed from: g */
    public static String f86013g;

    /* renamed from: h */
    public static volatile int f86014h;

    /* renamed from: gf1.d$a */
    public static final class C32435a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C50080k43) t2).f136550g), Long.valueOf(((C50080k43) t).f136550g));
        }
    }

    /* renamed from: d */
    public void mo12406d(C50694ok okVar) {
        if (C86709a0.m107522a() && f86014h > 0) {
            int i = 0;
            for (C33320g gVar : ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59083qq()) {
                if (gVar.field_exposureStatus == 0 && gVar.field_liveStatus == 0) {
                    i++;
                }
            }
            if (f86014h > i) {
                C115669n.INSTANCE.mo175913w(1552, 89, 1);
            }
        }
    }

    /* renamed from: q */
    public void mo12407q(int i, C35133k.C35134b bVar) {
        if (C86709a0.m107522a()) {
            C50694ok okVar = bVar != null ? bVar.f94240a : null;
            if (okVar != null) {
                C50144kl0 kl02 = new C50144kl0();
                kl02.f136875e = 0;
                kl02.f136874d = C46523h2.f125330a.mo71859a(i);
                f86014h = 0;
                if (bVar != null) {
                    if (C87412m.m108589b(f86011e, bVar.f94241b)) {
                        kl02.f136876f = f86013g;
                        kl02.f136875e = 1;
                        f86010d.getClass();
                        f86013g = "";
                        f86011e = "";
                    }
                    if (C87412m.m108589b(f86012f, bVar.f94241b)) {
                        kl02.f136875e = 2;
                        f86012f = "";
                    }
                }
                Log.m105924i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams scene[" + kl02.f136875e + ']');
                ArrayList<C33320g> qq = ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59083qq();
                LinkedList<C50080k43> linkedList = new LinkedList<>();
                for (C33320g gVar : qq) {
                    if (gVar.field_exposureStatus == 0 && gVar.field_liveStatus == 0) {
                        f86014h++;
                    }
                    C50080k43 k432 = new C50080k43();
                    k432.f136550g = gVar.field_insertTime;
                    k432.f136549f = gVar.field_tipsId;
                    k432.f136552i = gVar.field_exposureStatus;
                    k432.f136553j = gVar.field_liveStatus;
                    k432.f136547d = Util.safeParseLong(gVar.field_liveId);
                    k432.f136551h = gVar.field_ctrlInfoType;
                    k432.f136554n = gVar.field_bypInfo;
                    k432.f136548e = Util.safeParseLong(gVar.field_feedId);
                    linkedList.add(k432);
                }
                kl02.f136878h = linkedList;
                LinkedList<C50080k43> linkedList2 = kl02.f136878h;
                C87412m.m108593f(linkedList2, "this.list");
                kl02.f136878h = new LinkedList<>(C110818d0.m150943o0(linkedList2, new C32435a()));
                C32444a aVar = C32444a.f86121a;
                int intValue = C32444a.f86148g2.mo60266n().intValue();
                Log.m105924i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams limit = " + intValue);
                if (kl02.f136878h.size() > intValue) {
                    LinkedList<C50080k43> linkedList3 = kl02.f136878h;
                    C87412m.m108593f(linkedList3, "this.list");
                    kl02.f136878h = new LinkedList<>(C110818d0.m150947s0(linkedList3, intValue));
                }
                StringBuilder sb = new StringBuilder();
                LinkedList<C50080k43> linkedList4 = kl02.f136878h;
                C87412m.m108593f(linkedList4, "this.list");
                ArrayList<String> arrayList = new ArrayList<>(C36907w.m41090l(linkedList4, 10));
                for (C50080k43 k433 : linkedList4) {
                    arrayList.add(k433.f136549f);
                }
                for (String append : arrayList) {
                    sb.append(append);
                    sb.append(",");
                }
                Log.m105924i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams list = [" + sb + ']');
                okVar.f139227e = new C89349b(kl02.toByteArray());
            }
        }
    }
}
