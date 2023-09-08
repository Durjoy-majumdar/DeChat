package hi0;

import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import ii0.C87732a;
import lp3.C46888b;

/* renamed from: hi0.d */
public class C87493d implements C81662k.C81671h<WxaAttributes> {

    /* renamed from: a */
    public final /* synthetic */ String f253491a;

    /* renamed from: b */
    public final /* synthetic */ C46888b f253492b;

    /* renamed from: c */
    public final /* synthetic */ int f253493c;

    public C87493d(C87495f fVar, String str, C46888b bVar, int i) {
        this.f253491a = str;
        this.f253492b = bVar;
        this.f253493c = i;
    }

    /* renamed from: a */
    public void mo113997a(C81662k.C81671h.C81672a aVar, Object obj) {
        WxaAttributes wxaAttributes = (WxaAttributes) obj;
        Log.m105925i("MicroMsg.AppBrand.Predownload.CmdGetContact", "onGetContact with username[%s] result[%s]", this.f253491a, aVar);
        this.f253492b.mo72093c(Boolean.FALSE);
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C87732a.INSTANCE.mo122144a(this.f253493c, 25);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    C87732a.INSTANCE.mo122144a(this.f253493c, 26);
                    return;
                }
                return;
            }
        }
        C87732a.INSTANCE.mo122144a(this.f253493c, 27);
    }
}
