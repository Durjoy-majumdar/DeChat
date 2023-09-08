package androidx.compose.p002ui.platform;

import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p246u1.C111075k;
import p246u1.C111087s;

/* renamed from: androidx.compose.ui.platform.m$$g */
public final class m$$g {

    /* renamed from: a */
    public final C111075k f306187a;

    /* renamed from: b */
    public final Set<Integer> f306188b = new LinkedHashSet();

    public m$$g(C111087s sVar, Map<Integer, C103703v1> map) {
        C87412m.m108594g(sVar, "semanticsNode");
        C87412m.m108594g(map, "currentSemanticsNodes");
        this.f306187a = sVar.f332640e;
        List<C111087s> h = sVar.mo162839h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            C111087s sVar2 = h.get(i);
            if (map.containsKey(Integer.valueOf(sVar2.f332641f))) {
                this.f306188b.add(Integer.valueOf(sVar2.f332641f));
            }
        }
    }
}
