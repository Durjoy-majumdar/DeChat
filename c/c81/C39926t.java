package c81;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import d81.C20448c;
import gy3.C87412m;
import kr0.C76629w0;
import v71.C52778d;

/* renamed from: c81.t */
public final class C39926t implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ int f107062a;

    /* renamed from: b */
    public final /* synthetic */ C52778d f107063b;

    public C39926t(int i, C52778d dVar) {
        this.f107062a = i;
        this.f107063b = dVar;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            C20448c cVar = C20448c.f57466a;
            int i = this.f107062a;
            String str = wxaAttributes.field_nickname;
            C87412m.m108593f(str, "appBrandInfo.field_nickname");
            String str2 = this.f107063b.field_username;
            C87412m.m108593f(str2, "info.field_username");
            cVar.mo31991a(i, 3, str, 2, 2, str2);
        }
    }
}
