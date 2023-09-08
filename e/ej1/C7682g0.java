package ej1;

import android.text.TextUtils;
import cj1.C0581o5;
import gy3.C87412m;
import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90363p0;
import te3.C52021xu0;

/* renamed from: ej1.g0 */
public final class C7682g0 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C0581o5 f26047a;

    public C7682g0(C0581o5 o5Var) {
        this.f26047a = o5Var;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Object q = this.f26047a.mo563q();
        C87412m.m108592e(q, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgSendRedPacketInfo");
        return C90363p0.m113143b(new C13604l("cur_red_packet_source", Integer.valueOf(TextUtils.isEmpty(((C52021xu0) q).f144972g) ? 1 : 2)));
    }
}
