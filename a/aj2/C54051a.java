package aj2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import bp3.C104160f;
import bp3.C79758p;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d14.C45252f;
import d14.C58057l;
import fj2.C59106c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import sx3.C64197v;
import te3.C64563mr3;
import z04.C112550d0;

/* renamed from: aj2.a */
public final class C54051a extends C53996a<C59106c> {

    /* renamed from: g */
    public static final C54052a f151339g = new C54052a((C8480h) null);

    /* renamed from: d */
    public final C64563mr3 f151340d;

    /* renamed from: e */
    public final boolean f151341e;

    /* renamed from: f */
    public final LinkedList<C59106c> f151342f = new LinkedList<>();

    /* renamed from: aj2.a$a */
    public static final class C54052a {
        public C54052a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo74708a(C64563mr3 mr32) {
            C87412m.m108594g(mr32, "repairerItem");
            if (mr32.f184382f != 3) {
                return "";
            }
            String str = mr32.f184380d;
            C87412m.m108593f(str, "repairerItem.key");
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            String str2 = (String) U.get(U.size() - 1);
            switch (str2.hashCode()) {
                case -1808118735:
                    if (!str2.equals("String")) {
                        return "";
                    }
                    C79758p pVar = C79758p.f233760a;
                    String str3 = mr32.f184380d;
                    C87412m.m108593f(str3, "repairerItem.key");
                    String str4 = mr32.f184388o;
                    C87412m.m108593f(str4, "repairerItem.defaultValue");
                    return pVar.mo109879b(str3, str4).toString();
                case 73679:
                    if (!str2.equals("Int")) {
                        return "";
                    }
                    int i = Util.getInt(mr32.f184388o, 0);
                    C79758p pVar2 = C79758p.f233760a;
                    String str5 = mr32.f184380d;
                    C87412m.m108593f(str5, "repairerItem.key");
                    return pVar2.mo109879b(str5, Integer.valueOf(i)).toString();
                case 2374300:
                    if (!str2.equals("Long")) {
                        return "";
                    }
                    long j = Util.getLong(mr32.f184388o, 0);
                    C79758p pVar3 = C79758p.f233760a;
                    String str6 = mr32.f184380d;
                    C87412m.m108593f(str6, "repairerItem.key");
                    return pVar3.mo109879b(str6, Long.valueOf(j)).toString();
                case 67973692:
                    if (!str2.equals("Float")) {
                        return "";
                    }
                    float f = Util.getFloat(mr32.f184388o, 0.0f);
                    C79758p pVar4 = C79758p.f233760a;
                    String str7 = mr32.f184380d;
                    C87412m.m108593f(str7, "repairerItem.key");
                    return pVar4.mo109879b(str7, Float.valueOf(f)).toString();
                default:
                    return "";
            }
        }
    }

    public C54051a(C64563mr3 mr32, boolean z) {
        C87412m.m108594g(mr32, "initItem");
        this.f151340d = mr32;
        this.f151341e = z;
    }

    /* renamed from: b */
    public C45252f<C39534d<C59106c>> mo70650e(LifecycleScope lifecycleScope, C53998c<C59106c> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C54637q qVar = new C54637q();
        C39534d dVar = new C39534d(cVar);
        dVar.f106151b.addAll(this.f151342f);
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: c */
    public final C64563mr3 mo74707c(String str, C64563mr3 mr32) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(mr32, "item");
        if (C87412m.m108589b(mr32.f184380d, str)) {
            return mr32;
        }
        if (mr32.f184382f != 1) {
            return null;
        }
        LinkedList<C64563mr3> linkedList = mr32.f184385i;
        C87412m.m108593f(linkedList, "item.subItemList");
        for (C64563mr3 mr33 : linkedList) {
            C87412m.m108593f(mr33, LocaleUtil.ITALIAN);
            C64563mr3 c = mo74707c(str, mr33);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public void onCreate() {
        this.f151342f.clear();
        int i = 0;
        if (this.f151341e) {
            String g = C79758p.f233760a.mo109884g(C104160f.RepairerConfig_Inner_TopKey_String, "");
            Log.m105924i("MicroMsg.Repairer.RepairerDataSource", "favKeyString: " + g);
            int i2 = 0;
            for (Object next : C112550d0.m153785U(g, new String[]{","}, false, 0, 6, (Object) null)) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C64563mr3 c = mo74707c((String) next, this.f151340d);
                    if (c != null) {
                        this.f151342f.add(new C59106c(i2, 0, c, f151339g.mo74708a(c)));
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        LinkedList<C64563mr3> linkedList = this.f151340d.f184385i;
        C87412m.m108593f(linkedList, "initItem.subItemList");
        for (T next2 : linkedList) {
            int i4 = i + 1;
            if (i >= 0) {
                C64563mr3 mr32 = (C64563mr3) next2;
                LinkedList<C59106c> linkedList2 = this.f151342f;
                C87412m.m108593f(mr32, "item");
                linkedList2.add(new C59106c(i, 1, mr32, f151339g.mo74708a(mr32)));
                i = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
