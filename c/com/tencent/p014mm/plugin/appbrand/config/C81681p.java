package com.tencent.p014mm.plugin.appbrand.config;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ki0.C33916k;

/* renamed from: com.tencent.mm.plugin.appbrand.config.p */
public class C81681p {
    /* renamed from: a */
    public static boolean m100219a(WxaAttributes wxaAttributes) {
        if (Util.isNullOrNil(wxaAttributes.field_appId)) {
            Log.m105921e("MicroMsg.WxaAttrSyncUtils", "invalid appID in contact(%s)", wxaAttributes.field_username);
            return true;
        } else if (wxaAttributes.mo113942o2() == null) {
            Log.m105921e("MicroMsg.WxaAttrSyncUtils", "NULL versionInfo(%s) in contact(%s)", wxaAttributes.field_versionInfo, wxaAttributes.field_username);
            return true;
        } else if (wxaAttributes.mo113940m2() == null || TextUtils.isEmpty(wxaAttributes.mo113940m2().f239487c)) {
            Log.m105921e("MicroMsg.WxaAttrSyncUtils", "invalid appInfo(%s) in contact(%s)", wxaAttributes.field_appInfo, wxaAttributes.field_username);
            return true;
        } else if (wxaAttributes.mo113942o2().f239454f != 0 || wxaAttributes.mo113942o2().f239452d > 0) {
            return false;
        } else {
            Log.m105921e("MicroMsg.WxaAttrSyncUtils", "invalid versionInfo(%s) in contact(%s)", wxaAttributes.field_versionInfo, wxaAttributes.field_username);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m100220b(WxaAttributes wxaAttributes) {
        try {
            long a = C33916k.f91610a.mo59364a(wxaAttributes.field_username);
            if (a <= 0 || a < wxaAttributes.field_syncTimeSecond) {
                return false;
            }
            Log.m105925i("MicroMsg.WxaAttrSyncUtils", "isContactMarkedAsInvalid (%s) returns true, treated as invalid until %d, attrs lastSyncTimestamp %d", wxaAttributes.field_username, Long.valueOf(a), Long.valueOf(wxaAttributes.field_syncTimeSecond));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxaAttrSyncUtils", e, "caught crash", new Object[0]);
            return false;
        }
    }
}
