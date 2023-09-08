package fy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64406gy;
import te3.C64554mg;

/* renamed from: fy0.a */
public final class C59335a {

    /* renamed from: a */
    public static final C59335a f169630a = new C59335a();

    /* renamed from: a */
    public static final LinkedList<C64554mg> m69245a(C19623o0 o0Var, C18412m3.C18415c<String, C18412m3.C18414b> cVar, int i, boolean z) {
        C87412m.m108594g(o0Var, "bizTimeLineInfo");
        C87412m.m108594g(cVar, "sessionItemCache");
        LinkedList<C64554mg> linkedList = new LinkedList<>();
        if (o0Var.field_isRead != 1) {
            return linkedList;
        }
        int i2 = 0;
        while (true) {
            C18412m3.C18414b bVar = cVar.get(o0Var.mo25768r2() + '_' + i2);
            if (bVar != null) {
                linkedList.add(f169630a.mo84439b(bVar, i, i2, z));
                if (i2 == 10) {
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public final C64554mg mo84439b(C18412m3.C18414b bVar, int i, int i2, boolean z) {
        C87412m.m108594g(bVar, "item");
        C64554mg mgVar = new C64554mg();
        boolean z2 = false;
        mgVar.f184316e = z && i == i2;
        C64406gy gyVar = new C64406gy();
        mgVar.f184315d = gyVar;
        gyVar.f183366d = bVar.f51093h1;
        gyVar.f183367e = (int) bVar.f63861e;
        LinkedList<Integer> linkedList = bVar.f63864g;
        if (!(linkedList == null || linkedList.isEmpty())) {
            C64406gy gyVar2 = mgVar.f184315d;
            Integer num = bVar.f63864g.get(0);
            C87412m.m108593f(num, "item.idx_list[0]");
            gyVar2.f183368f = num.intValue();
        }
        C64406gy gyVar3 = mgVar.f184315d;
        gyVar3.f183371i = bVar.f63829I;
        gyVar3.f183375p = bVar.f63852Y;
        gyVar3.f183373n = bVar.f63826F == 1;
        if (bVar.f63828H == 1) {
            z2 = true;
        }
        gyVar3.f183374o = z2;
        gyVar3.f183376q = bVar.f63839R0;
        gyVar3.f183369g = bVar.f63876u;
        gyVar3.f183372j = bVar.f63863f;
        gyVar3.f183377r = bVar.f63835P;
        return mgVar;
    }
}
