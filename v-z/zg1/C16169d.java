package zg1;

import cj1.C0581o5;
import cj1.C0631w1;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kl1.C10300b;
import sx3.C36907w;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.d */
public final class C16169d extends C16006g {

    /* renamed from: c */
    public final String f43359c = "LiveAppMsgBulletInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16169d(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C0702z0.class;
        C87412m.m108594g(linkedList, "msgList");
        if (BuildInfo.DEBUG) {
            C10300b bVar = C10300b.f31392a;
            String str = this.f43359c;
            C87412m.m108594g(str, "prefix");
            int size = linkedList.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                C52013xs0 xs02 = linkedList.get(i);
                sb.append("seq:" + xs02.f144913r + ",id:" + xs02.f144904f + ", msgType:" + xs02.f144903e + "},{msgHashCode:" + xs02.hashCode() + '!');
            }
            Log.m105924i("BulletCommentHelper", str + ' ' + sb);
        }
        List<C0581o5> list = ((C0702z0) this.f43066a.mo71262a(cls)).f1673g;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C52013xs0 w1Var : linkedList) {
            arrayList.add(new C0631w1(w1Var));
        }
        list.addAll(arrayList);
        if (C58739j4.f168176a.mo83692U() && ((C0702z0) this.f43066a.mo71262a(cls)).f1673g.size() > 0) {
            String str2 = this.f43359c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("handleBulletMsg size:");
            sb4.append(((C0702z0) this.f43066a.mo71262a(cls)).f1673g.size());
            sb4.append(',');
            List<C0581o5> list2 = ((C0702z0) this.f43066a.mo71262a(cls)).f1673g;
            C87412m.m108593f(list2, "liveContext.business(\n  …ss.java).bulletCommetList");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
            for (C0581o5 f : list2) {
                arrayList2.add(f.mo572f());
            }
            sb4.append(arrayList2);
            Log.m105924i(str2, sb4.toString());
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20047};
    }
}
