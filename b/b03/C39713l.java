package b03;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import uz2.C52676d1;
import uz2.C52679e1;
import uz2.C52708q;
import uz2.C52722w;
import uz2.C52725x;
import z04.C112551y;

/* renamed from: b03.l */
public final class C39713l {
    /* renamed from: a */
    public static final boolean m42496a(C52676d1 d1Var) {
        C87412m.m108594g(d1Var, "<this>");
        Log.m105924i("TextStatusIcon", "canShowInChooseIconPage:showType:" + d1Var.f147082e + " iconId:" + d1Var.f147081d);
        return d1Var.f147082e == 0;
    }

    /* renamed from: b */
    public static final String m42497b(LinkedList<C52722w> linkedList) {
        C87412m.m108594g(linkedList, "<this>");
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        Iterator<C52722w> it = linkedList.iterator();
        String str = "";
        while (it.hasNext()) {
            C52722w next = it.next();
            if (C87412m.m108589b(next.f147270d, "en")) {
                str = next.f147271e;
                C87412m.m108593f(str, "info.text");
            }
            if (C87412m.m108589b(next.f147270d, currentLanguage)) {
                return next.f147271e;
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = m42497b((r1 = r1.f147283f));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42498c(uz2.C52676d1 r1) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r1, r0)
            uz2.x r1 = m42503h(r1)
            if (r1 == 0) goto L_0x0015
            java.util.LinkedList<uz2.w> r1 = r1.f147283f
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = m42497b(r1)
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r1 = ""
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39713l.m42498c(uz2.d1):java.lang.String");
    }

    /* renamed from: d */
    public static final C52676d1 m42499d(C52679e1 e1Var, String str) {
        C87412m.m108594g(e1Var, "<this>");
        Iterator<C52676d1> it = e1Var.f147104g.iterator();
        while (it.hasNext()) {
            C52676d1 next = it.next();
            if (C87412m.m108589b(next.f147081d, str) && m42503h(next) != null) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final C52725x m42500e(C52676d1 d1Var, boolean z) {
        C87412m.m108594g(d1Var, "<this>");
        if (z && d1Var.f147082e != 0) {
            return null;
        }
        Iterator<C52725x> it = d1Var.f147083f.iterator();
        while (it.hasNext()) {
            C52725x next = it.next();
            C87412m.m108593f(next, "action");
            int i = next.f147285h;
            if (i < 0) {
                i = 0;
            }
            int i2 = next.f147286i;
            if (((long) i2) <= 0 || i2 <= i) {
                i2 = Integer.MAX_VALUE;
            }
            if (m42506k(next, i, i2)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final C52725x m42501f(List<? extends C52725x> list) {
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(list, "<this>");
        C52725x xVar = null;
        for (C52725x xVar2 : list) {
            C87412m.m108594g(xVar2, "<this>");
            int i5 = xVar2.f147285h;
            if (i5 < 0) {
                i5 = 0;
            }
            if (m42506k(xVar2, i5, Integer.MAX_VALUE) && (xVar == null || (i = xVar.f147285h) < (i2 = xVar2.f147285h) || (i == i2 && ((i3 = xVar.f147286i) == (i4 = xVar2.f147286i) || i4 == 0 || (i3 != 0 && i3 < i4))))) {
                xVar = xVar2;
            }
        }
        return xVar;
    }

    /* renamed from: g */
    public static final C52725x m42502g(C52708q qVar) {
        C87412m.m108594g(qVar, "<this>");
        LinkedList<C52725x> linkedList = qVar.f147180e;
        C87412m.m108593f(linkedList, "iconActions");
        return m42501f(linkedList);
    }

    /* renamed from: h */
    public static final C52725x m42503h(C52676d1 d1Var) {
        C87412m.m108594g(d1Var, "<this>");
        LinkedList<C52725x> linkedList = d1Var.f147083f;
        C87412m.m108593f(linkedList, "actions");
        return m42501f(linkedList);
    }

    /* renamed from: i */
    public static final boolean m42504i(C52679e1 e1Var, String str) {
        C87412m.m108594g(e1Var, "<this>");
        Iterator<C52676d1> it = e1Var.f147104g.iterator();
        while (it.hasNext()) {
            C52676d1 next = it.next();
            if (C87412m.m108589b(next.f147081d, str) && m42503h(next) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m42505j(C52725x xVar) {
        C87412m.m108594g(xVar, "<this>");
        return (xVar.f147282e & 1) != 0;
    }

    /* renamed from: k */
    public static final boolean m42506k(C52725x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "<this>");
        int e = C31543z5.m39455e();
        if (i <= e && e <= i2) {
            String str = xVar.f147281d;
            if (!(str == null || C112551y.m153811k(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final String m42507l(C52679e1 e1Var) {
        C87412m.m108594g(e1Var, "<this>");
        return "key:" + e1Var.f147101d + " cid:" + e1Var.f147102e + " }";
    }
}
