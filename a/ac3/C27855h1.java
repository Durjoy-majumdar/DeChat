package ac3;

import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionModelResStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import qr3.C110470e;
import sk2.C101643c;
import sx3.C110818d0;
import te3.b05;

/* renamed from: ac3.h1 */
public final class C27855h1 {

    /* renamed from: a */
    public static final C27855h1 f76992a = new C27855h1();

    /* renamed from: a */
    public final WeVisionModelResStruct mo55642a() {
        WeVisionModelResStruct weVisionModelResStruct = new WeVisionModelResStruct();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        weVisionModelResStruct.f79225d = C110470e.f330363a;
        weVisionModelResStruct.f79233l = ((C101643c) C86312j.m106911c(C101643c.class)).mo140873UJ();
        return weVisionModelResStruct;
    }

    /* renamed from: b */
    public final void mo55643b(int i, int i2, int i3) {
        WeVisionModelResStruct a = mo55642a();
        a.f79231j = i;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append('.');
        sb.append(i3);
        a.f79228g = a.mo86045b("ModelList", sb.toString(), true);
        Log.m105924i("MicroMsg.WeVisionModelReporter", "reportAction: " + a.mo1006q());
        a.mo86054n();
    }

    /* renamed from: c */
    public final void mo55644c() {
        boolean z;
        WeVisionModelResStruct a = mo55642a();
        a.f79231j = 1;
        LinkedList<b05> linkedList = C27862u0.f77005d.f130188d;
        C87412m.m108593f(linkedList, "localModelInfo.NewConfigList");
        a.f79228g = a.mo86045b("ModelList", C110818d0.m150921S(linkedList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27877z0.f77024d, 30, (Object) null), true);
        LinkedList<Integer> linkedList2 = C27862u0.f77007f;
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList2) {
            int intValue = ((Number) next).intValue();
            LinkedList<b05> linkedList3 = C27862u0.f77005d.f130188d;
            C87412m.m108593f(linkedList3, "localModelInfo.NewConfigList");
            boolean z2 = false;
            if (!linkedList3.isEmpty()) {
                Iterator<T> it = linkedList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((b05) it.next()).f130875d == intValue) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                arrayList.add(next);
            }
        }
        a.f79229h = a.mo86045b("InvalidModelList", C110818d0.m150921S(C110818d0.m150905E(arrayList), ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0032w0.f37d, 30, (Object) null), true);
        LinkedList<b05> linkedList4 = C27862u0.f77006e.f130188d;
        C87412m.m108593f(linkedList4, "targetModelInfo.NewConfigList");
        a.f79232k = a.mo86045b("CgiModelList", C110818d0.m150921S(linkedList4, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27868v0.f77013d, 30, (Object) null), true);
        Log.m105924i("MicroMsg.WeVisionModelReporter", "reportModelInfo: " + a.mo1006q());
        a.mo86054n();
    }
}
