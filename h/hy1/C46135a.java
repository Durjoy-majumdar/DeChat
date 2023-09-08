package hy1;

import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: hy1.a */
public final class C46135a {

    /* renamed from: a */
    public static final C46135a f124316a = new C46135a();

    /* renamed from: b */
    public static final HashMap<Integer, ArrayList<C46137b>> f124317b = new HashMap<>();

    /* renamed from: c */
    public static final C114668z.C104589a f124318c = new C46136a();

    /* renamed from: hy1.a$a */
    public static final class C46136a extends C114668z.C104589a {
        public void onAppBackground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Set<Map.Entry<Integer, ArrayList<C46137b>>> entrySet = C46135a.f124317b.entrySet();
            C87412m.m108593f(entrySet, "pageFeedReportMap.entries");
            for (Map.Entry value : entrySet) {
                Object value2 = value.getValue();
                C87412m.m108593f(value2, "it.value");
                for (C46137b bVar : (Iterable) value2) {
                    if (bVar.f124328j != 0) {
                        if (bVar.f124327i) {
                            bVar.f124326h += Util.currentTicks() - bVar.f124328j;
                        } else {
                            bVar.f124326h += (Util.currentTicks() - bVar.f124328j) / 1000;
                        }
                    }
                }
            }
        }

        public void onAppForeground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Set<Map.Entry<Integer, ArrayList<C46137b>>> entrySet = C46135a.f124317b.entrySet();
            C87412m.m108593f(entrySet, "pageFeedReportMap.entries");
            for (Map.Entry value : entrySet) {
                Object value2 = value.getValue();
                C87412m.m108593f(value2, "it.value");
                for (C46137b bVar : (Iterable) value2) {
                    if (bVar.f124328j != 0) {
                        bVar.f124328j = Util.currentTicks();
                    }
                }
            }
        }
    }
}
