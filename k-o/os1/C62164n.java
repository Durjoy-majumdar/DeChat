package os1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C36907w;
import te3.C64714sp3;
import te3.C64782vp3;

/* renamed from: os1.n */
public final class C62164n {
    /* renamed from: a */
    public static final String m73025a(C64714sp3 sp32) {
        C87412m.m108594g(sp32, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("expose_interval=");
        sb.append(sp32.f185434d);
        sb.append(" ctrl_type=");
        sb.append(sp32.f185435e);
        sb.append(" mention_count=");
        sb.append(sp32.f185437g);
        sb.append(" bypass_info=");
        C89349b bVar = sp32.f185436f;
        sb.append(bVar != null ? bVar.f257327a.length : -1);
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m73026b(C64782vp3 vp32) {
        ArrayList arrayList;
        C87412m.m108594g(vp32, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("report_scene=");
        sb.append(vp32.f185968d);
        sb.append(" contextId=");
        sb.append(vp32.f185969e);
        sb.append(" leftList(");
        sb.append(vp32.f185974j.size());
        sb.append(")=");
        LinkedList<C64714sp3> linkedList = vp32.f185974j;
        ArrayList arrayList2 = null;
        if (linkedList != null) {
            arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C64714sp3 sp32 : linkedList) {
                C87412m.m108593f(sp32, LocaleUtil.ITALIAN);
                arrayList.add(m73025a(sp32));
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        sb.append(" rightList(");
        sb.append(vp32.f185975n.size());
        sb.append(")=");
        LinkedList<C64714sp3> linkedList2 = vp32.f185975n;
        if (linkedList2 != null) {
            arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (C64714sp3 sp33 : linkedList2) {
                C87412m.m108593f(sp33, LocaleUtil.ITALIAN);
                arrayList2.add(m73025a(sp33));
            }
        }
        sb.append(arrayList2);
        sb.append(" session_interval=");
        sb.append(vp32.f185972h);
        return sb.toString();
    }
}
