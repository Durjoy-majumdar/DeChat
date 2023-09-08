package ym2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.io4;
import te3.jo4;
import xm2.C38761u;

/* renamed from: ym2.a */
public final class C53544a {

    /* renamed from: a */
    public static final C53544a f150509a = new C53544a();

    /* renamed from: a */
    public final void mo74208a(int i, io4 io4) {
        C87412m.m108594g(io4, "userAuthApp");
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = io4.f135548d;
        objArr[2] = io4.f135549e;
        objArr[3] = String.valueOf(io4.f135550f);
        LinkedList<jo4> linkedList = io4.f135551g;
        objArr[4] = linkedList == null ? "" : C110818d0.m150921S(linkedList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C38761u.f104565d, 30, (Object) null);
        nVar.mo160131h(24370, objArr);
    }
}
