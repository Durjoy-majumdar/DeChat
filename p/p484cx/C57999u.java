package p484cx;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import nj2.C61768p;
import p145dx.C75462x;

@C86522b
/* renamed from: cx.u */
public final class C57999u extends C86301e implements C75462x {
    /* renamed from: CS */
    public boolean mo82797CS() {
        return !((ArrayList) C61768p.m72479g()).isEmpty();
    }

    /* renamed from: MX */
    public boolean mo82798MX() {
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        return C61768p.m72477d(s) != null;
    }

    public boolean gs0() {
        C61768p pVar = C61768p.f175586a;
        C61768p.m72487o();
        MultiProcessMMKV multiProcessMMKV = C61768p.f175590e;
        C87412m.m108593f(multiProcessMMKV, "keyParamsMMKv");
        return multiProcessMMKV.getBoolean("show_enable_caller_listen_my_ringback", false);
    }
}
