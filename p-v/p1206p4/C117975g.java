package p1206p4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p1014o4.C100281w;
import p1014o4.C117686e;
import p1014o4.C117693m;
import p1014o4.C117696p;
import p1014o4.C117704t;

/* renamed from: p4.g */
public class C117975g extends C117704t {

    /* renamed from: j */
    public static final String f352588j = C117693m.m165967e("WorkContinuationImpl");

    /* renamed from: a */
    public final C117979k f352589a;

    /* renamed from: b */
    public final String f352590b = null;

    /* renamed from: c */
    public final C117686e f352591c;

    /* renamed from: d */
    public final List<? extends C100281w> f352592d;

    /* renamed from: e */
    public final List<String> f352593e;

    /* renamed from: f */
    public final List<String> f352594f;

    /* renamed from: g */
    public final List<C117975g> f352595g;

    /* renamed from: h */
    public boolean f352596h;

    /* renamed from: i */
    public C117696p f352597i;

    public C117975g(C117979k kVar, List<? extends C100281w> list) {
        C117686e eVar = C117686e.KEEP;
        this.f352589a = kVar;
        this.f352591c = eVar;
        this.f352592d = list;
        this.f352595g = null;
        this.f352593e = new ArrayList(list.size());
        this.f352594f = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((C100281w) list.get(i)).f293786a.toString();
            ((ArrayList) this.f352593e).add(uuid);
            ((ArrayList) this.f352594f).add(uuid);
        }
    }

    /* renamed from: a */
    public static boolean m166381a(C117975g gVar, Set<String> set) {
        set.addAll(gVar.f352593e);
        Set<String> b = m166382b(gVar);
        for (String contains : set) {
            if (((HashSet) b).contains(contains)) {
                return true;
            }
        }
        List<C117975g> list = gVar.f352595g;
        if (list != null && !list.isEmpty()) {
            for (C117975g a : list) {
                if (m166381a(a, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f352593e);
        return false;
    }

    /* renamed from: b */
    public static Set<String> m166382b(C117975g gVar) {
        HashSet hashSet = new HashSet();
        List<C117975g> list = gVar.f352595g;
        if (list != null && !list.isEmpty()) {
            for (C117975g gVar2 : list) {
                hashSet.addAll(gVar2.f352593e);
            }
        }
        return hashSet;
    }
}
