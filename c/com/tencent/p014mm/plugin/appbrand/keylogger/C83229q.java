package com.tencent.p014mm.plugin.appbrand.keylogger;

import b34.C79664a;
import b34.C79665b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uo0.C78250j;
import uo0.C90709a;
import uo0.C90716l;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.q */
public final class C83229q {

    /* renamed from: a */
    public static Map<String, String> f243077a = new HashMap();

    /* renamed from: b */
    public static Map<String, List<C90716l>> f243078b = new HashMap();

    /* renamed from: c */
    public static Map<String, C78250j> f243079c = new HashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.q$a */
    public class C83230a implements C78250j.C78252b {

        /* renamed from: a */
        public final /* synthetic */ List f243080a;

        public C83230a(List list) {
            this.f243080a = list;
        }

        /* renamed from: a */
        public void mo94303a(C78250j jVar) {
            C90709a b = jVar.mo108265b();
            if (b != null) {
                this.f243080a.add(new C90716l(b, jVar.f229221c));
            }
        }
    }

    /* renamed from: a */
    public static List<C90716l> m102136a(Class cls, String str) {
        String str2 = cls.getName() + "_" + str;
        if (((HashMap) f243078b).containsKey(str2)) {
            return (List) ((HashMap) f243078b).get(str2);
        }
        ArrayList arrayList = new ArrayList();
        C78250j.m94539e(m102138c(cls, str), new C83230a(arrayList));
        ((HashMap) f243078b).put(str2, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static String m102137b(Class cls) {
        String name = cls.getName();
        if (((HashMap) f243077a).containsKey(name)) {
            return (String) ((HashMap) f243077a).get(name);
        }
        try {
            String str = (String) cls.getDeclaredField("NAME").get((Object) null);
            ((HashMap) f243077a).put(name, str);
            return str;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C78250j m102138c(Class cls, String str) {
        String str2 = cls.getName() + "—" + str;
        if (((HashMap) f243079c).containsKey(str2)) {
            return (C78250j) ((HashMap) f243079c).get(str2);
        }
        try {
            List list = (List) new C79664a(cls, cls).mo109794f("sStepNodes");
            if (list == null) {
                return null;
            }
            C78250j c = C78250j.m94537c(list, str);
            ((HashMap) f243079c).put(str2, c);
            return c;
        } catch (C79665b unused) {
            return null;
        }
    }
}
