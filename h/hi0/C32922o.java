package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ii0.C87732a;
import ki0.C33914i;
import ki0.C33915j;
import te3.e75;
import te3.r75;

/* renamed from: hi0.o */
public final class C32922o extends C87491a<Boolean, r75> {
    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        boolean z;
        r75 r75 = (r75) obj;
        C33915j jVar = (C33915j) C81161g2.Bx0(C33915j.class);
        int i = r75.f140752e;
        int i2 = r75.f140751d.f132768f;
        int i3 = r75.f140753f;
        jVar.getClass();
        if (Util.isNullOrNil(str)) {
            z = false;
        } else {
            C33914i iVar = new C33914i();
            iVar.field_username = str;
            boolean z2 = jVar.get(iVar, new String[0]);
            iVar.field_appVersion = i;
            iVar.field_reportId = i2;
            iVar.field_launchFallbackDirectlyMinVersion = i3;
            z = z2 ? jVar.update(iVar, new String[0]) : jVar.insert(iVar);
        }
        Log.m105925i("MicroMsg.AppBrand.Predownload.CmdUpdateVersion", "call, username %s, version %d, reportId %d, update %b", str, Integer.valueOf(r75.f140752e), Integer.valueOf(r75.f140751d.f132768f), Boolean.valueOf(z));
        C87732a.INSTANCE.mo122144a(r75.f140751d.f132768f, z ? 155 : 156);
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((r75) obj).f140751d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdUpdateVersion";
    }
}
