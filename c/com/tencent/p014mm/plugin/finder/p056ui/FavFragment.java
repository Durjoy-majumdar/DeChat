package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gg1.C32444a;
import gy3.C87412m;
import hm1.C32946a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import oe1.C35152b;
import pe1.C35464c;
import sx3.C110818d0;
import sx3.C110821n;
import sx3.C36907w;
import sx3.C64187h0;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FavFragment;", "Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FavFragment */
public final class FavFragment extends SettingFragment {
    public FavFragment() {
        super("    收藏   ", 2);
    }

    /* renamed from: V */
    public ArrayList<C35464c<?>> mo57071V() {
        Object obj;
        Set<String> stringSet = MultiProcessMMKV.getSingleMMKV("finder_debug_settings_fav").getStringSet("fav_1", C64187h0.f181908d);
        C87412m.m108591d(stringSet);
        HashSet hashSet = new HashSet(stringSet);
        Field[] declaredFields = C37521f.f99374d.getClass().getDeclaredFields();
        C87412m.m108593f(declaredFields, "FinderConfig.javaClass.declaredFields");
        C32444a aVar = C32444a.f86121a;
        Field[] declaredFields2 = C32444a.class.getDeclaredFields();
        C87412m.m108593f(declaredFields2, "FinderLiveConfig.javaClass.declaredFields");
        Object[] s = C110821n.m150972s(declaredFields, declaredFields2);
        C32946a aVar2 = C32946a.f89535a;
        Field[] declaredFields3 = C32946a.class.getDeclaredFields();
        C87412m.m108593f(declaredFields3, "NearbyLiveConfig.javaClass.declaredFields");
        Object[] s2 = C110821n.m150972s(s, declaredFields3);
        C35464c<Integer> cVar = C35152b.f94273a;
        Field[] declaredFields4 = C35152b.class.getDeclaredFields();
        C87412m.m108593f(declaredFields4, "FinderNearbyConfig.javaClass.declaredFields");
        Object[] s3 = C110821n.m150972s(s2, declaredFields4);
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Object obj2 : s3) {
            Field field = (Field) obj2;
            field.setAccessible(true);
            if (field.get((Object) null) instanceof C35464c) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (Field field2 : arrayList) {
            field2.setAccessible(true);
            Object obj3 = field2.get((Object) null);
            C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.config.base.FinderFakeConfig<*>");
            arrayList2.add((C35464c) obj3);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            ((C35464c) next).getClass();
            arrayList3.add(next);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        ArrayList<C35464c<?>> arrayList5 = new ArrayList<>();
        for (String str : C110818d0.m150942n0(hashSet)) {
            Iterator it = arrayList4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C87412m.m108589b(((C35464c) obj).f94903d, str)) {
                    break;
                }
            }
            C35464c cVar2 = (C35464c) obj;
            if (cVar2 != null) {
                arrayList5.add(cVar2);
            }
        }
        return arrayList5;
    }
}
