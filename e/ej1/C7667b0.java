package ej1;

import android.text.TextUtils;
import cj1.C0581o5;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90363p0;
import te3.C51447tu0;
import te3.C51790w61;

/* renamed from: ej1.b0 */
public final class C7667b0 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C7675d0 f26024a;

    /* renamed from: b */
    public final /* synthetic */ C0581o5 f26025b;

    public C7667b0(C7675d0 d0Var, C0581o5 o5Var) {
        this.f26024a = d0Var;
        this.f26025b = o5Var;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        String str2;
        T t;
        List<C51790w61> list = ((C54991o) this.f26024a.f15089i.mo71262a(C54991o.class)).f154385x2;
        C87412m.m108593f(list, "liveContext.business(Liv…lass.java).luckyMoneyList");
        C0581o5 o5Var = this.f26025b;
        Iterator<T> it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String str3 = ((C51790w61) t).f143878d;
            Object q = o5Var.mo563q();
            C87412m.m108592e(q, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgRecvRedPacketInfo");
            if (Util.isEqual(str3, ((C51447tu0) q).f142412d)) {
                break;
            }
        }
        C51790w61 w612 = (C51790w61) t;
        if (w612 != null) {
            str2 = w612.f143882h;
        }
        return C90363p0.m113143b(new C13604l("cur_red_packet_source", Integer.valueOf(TextUtils.isEmpty(str2) ? 1 : 2)));
    }
}
