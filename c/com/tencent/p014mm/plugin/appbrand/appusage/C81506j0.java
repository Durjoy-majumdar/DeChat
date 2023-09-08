package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.concurrent.TimeUnit;
import ob0.C47350c;
import te3.C50385md2;
import te3.C64521ld2;
import te3.e55;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.j0 */
public enum C81506j0 {
    ;
    

    /* renamed from: d */
    public static Integer f239106d;

    /* access modifiers changed from: public */
    static {
        TimeUnit.DAYS.toSeconds(1);
    }

    /* renamed from: a */
    public static int m99996a() {
        Integer num = f239106d;
        return num != null ? num.intValue() : AppBrandGlobalSystemConfig.m100099b().f239317u;
    }

    /* renamed from: b */
    public static void m99997b(int i, int i2, int i3, String str, C47350c cVar, Long l) {
        Class cls = C81500i0.class;
        if (cVar == null) {
            Log.m105920e("MicroMsg.AppBrandStarListLogic[collection]", "onResp, NULL CommReqResp");
        } else if ((((C64521ld2) cVar.f127055a.f127080a).f184077e & 2) != 0) {
            C50385md2 md22 = (C50385md2) cVar.f127056b.f127083a;
            boolean z = false;
            Log.m105925i("MicroMsg.AppBrandStarListLogic[collection]", "onResp, errType %d, errCode %d, errMsg %s, ticket %s", Integer.valueOf(i2), Integer.valueOf(i3), str, l);
            if (i2 == 0 && i3 == 0 && md22 != null) {
                if (C81161g2.Bx0(cls) != null) {
                    ((C81500i0) C81161g2.Bx0(cls)).mo113790Lo(e55.class, md22.f137957e, l);
                    C81507k0.m99998a(i, (Bundle) null, md22.f137957e, (C81662k.C81674j) null);
                }
                C85801v1 i4 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN;
                if ((md22.f137959g & 1) > 0) {
                    z = true;
                }
                i4.mo119677K(aVar, Boolean.valueOf(z));
            }
        }
    }
}
