package ln3;

import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import te3.jy4;

/* renamed from: ln3.h */
public final class C76714h extends C76709a<C76714h> {

    /* renamed from: u */
    public final jy4 f224442u;

    public C76714h(jy4 jy4, C72963f4 f4Var) {
        C87412m.m108594g(jy4, "record");
        C87412m.m108594g(f4Var, "msgInfo");
        this.f224442u = jy4;
    }

    /* renamed from: c */
    public int mo75c() {
        return C76709a.f224425h;
    }

    /* renamed from: d */
    public int mo86281d() {
        return 9;
    }

    /* renamed from: f */
    public boolean mo106998f(C76709a aVar) {
        C76714h hVar = (C76714h) aVar;
        C87412m.m108594g(hVar, "other");
        return C87412m.m108589b(this.f224442u.f227709d, hVar.f224442u.f227709d);
    }

    /* renamed from: g */
    public int mo86282g(Object obj) {
        C87412m.m108594g((C76714h) obj, "other");
        return 0;
    }

    public long getItemId() {
        String str = this.f224442u.f227709d;
        C87412m.m108593f(str, "record.msg_svrId");
        return Long.parseLong(str);
    }
}
