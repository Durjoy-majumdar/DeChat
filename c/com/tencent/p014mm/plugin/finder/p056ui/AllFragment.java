package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.fragment.app.FragmentActivity;
import gg1.C32444a;
import gy3.C87412m;
import hm1.C32946a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import oe1.C35151a;
import oe1.C35152b;
import pe1.C35463b;
import pe1.C35464c;
import sx3.C110821n;
import sx3.C36907w;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/AllFragment;", "Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.AllFragment */
public final class AllFragment extends SettingFragment {
    public AllFragment() {
        super("    所有    ", 1);
    }

    /* renamed from: V */
    public ArrayList<C35464c<?>> mo57071V() {
        ArrayList<C35464c<?>> arrayList = new ArrayList<>();
        HashMap hashMap = new HashMap();
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
        int i = C35151a.f94272a;
        Field[] declaredFields5 = C35151a.class.getDeclaredFields();
        C87412m.m108593f(declaredFields5, "FinderAccountConfig.javaClass.declaredFields");
        Object[] s4 = C110821n.m150972s(s3, declaredFields5);
        ArrayList<Field> arrayList2 = new ArrayList<>();
        for (Object obj : s4) {
            Field field = (Field) obj;
            field.setAccessible(true);
            if (field.get((Object) null) instanceof C35464c) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (Field field2 : arrayList2) {
            field2.setAccessible(true);
            Object obj2 = field2.get((Object) null);
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.config.base.FinderFakeConfig<*>");
            arrayList3.add((C35464c) obj2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next : arrayList3) {
            ((C35464c) next).getClass();
            arrayList4.add(next);
        }
        ArrayList<C35464c> arrayList5 = new ArrayList<>(arrayList4);
        LinkedList linkedList = new LinkedList();
        for (C35464c cVar2 : arrayList5) {
            C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.config.base.FinderFakeConfig<*>");
            if (cVar2.f94897p.length() > 0) {
                if (!hashMap.containsKey(cVar2.f94897p)) {
                    hashMap.put(cVar2.f94897p, new LinkedList());
                }
                LinkedList linkedList2 = (LinkedList) hashMap.get(cVar2.f94897p);
                if (linkedList2 != null) {
                    linkedList2.add(cVar2);
                }
            } else {
                linkedList.add(cVar2);
            }
        }
        LinkedList linkedList3 = new LinkedList();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            LinkedList linkedList4 = (LinkedList) entry.getValue();
            if (!C87412m.m108589b(str, "常用")) {
                arrayList.add(new C35463b(str));
                arrayList.addAll(linkedList4);
            } else {
                linkedList3.add(new C35463b(str));
                linkedList3.addAll(linkedList4);
            }
        }
        arrayList.addAll(0, linkedList3);
        arrayList.add(new C35463b("其它"));
        arrayList.addAll(linkedList);
        for (C35464c cVar3 : arrayList) {
            FragmentActivity requireActivity = requireActivity();
            cVar3.getClass();
            if (requireActivity != null) {
                cVar3.f94905f = new WeakReference<>(requireActivity);
            }
        }
        arrayList.add(0, new C35463b("共 " + arrayList.size() + " 个配置"));
        return arrayList;
    }
}
