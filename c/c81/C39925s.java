package c81;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C20448c;
import gy3.C87412m;
import kr0.C76629w0;

/* renamed from: c81.s */
public final class C39925s implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ int f107060a;

    /* renamed from: b */
    public final /* synthetic */ String f107061b;

    public C39925s(int i, String str) {
        this.f107060a = i;
        this.f107061b = str;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            C20448c cVar = C20448c.f57466a;
            int i = this.f107060a;
            String str = wxaAttributes.field_nickname;
            C87412m.m108593f(str, "appBrandInfo.field_nickname");
            cVar.mo31991a(i, 3, str, 2, 2, this.f107061b);
        }
    }
}
