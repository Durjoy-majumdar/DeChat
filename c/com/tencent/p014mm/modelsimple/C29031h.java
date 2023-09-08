package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import e62.C75554c;
import eb0.C97625j3;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr0.C34016t0;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.modelsimple.h */
public class C29031h extends C86301e implements C34016t0 {
    public boolean Ld0() {
        return C97625j3.m125812b().mo105884J();
    }

    /* renamed from: UW */
    public String mo56396UW() {
        return (C75554c.m90588k1() == null || C75554c.m90588k1().f221967u == null) ? "" : C75554c.m90588k1().f221967u;
    }

    public int Wu0() {
        return C75554c.f221957o;
    }

    public int getIconType() {
        return C75554c.f221954i;
    }

    /* renamed from: v7 */
    public List<Integer> mo56399v7() {
        ArrayList arrayList = new ArrayList();
        int i = C75554c.f221954i;
        if (i == 9) {
            Iterator<C75554c.C75555b> it = C75554c.m90589l1().iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().f182221n));
            }
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
