package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.remittance.model.w0 */
public class C5061w0 {
    /* renamed from: a */
    public static void m5169a(String str) {
        String[] split;
        if (!Util.isNullOrNil(str)) {
            String b = m5170b();
            Log.m105918d("Micromsg.RemittanceLogic", "cur friendsListStr=" + b);
            StringBuilder sb = new StringBuilder();
            if (!Util.isNullOrNil(b) && (split = b.split(",")) != null) {
                int i = 0;
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!str.equals(split[i2])) {
                        sb.append(split[i2]);
                        sb.append(",");
                        i++;
                        if (i >= 4) {
                            break;
                        }
                    }
                }
            }
            sb.insert(0, ",");
            sb.insert(0, str);
            sb.deleteCharAt(sb.length() - 1);
            Log.m105918d("Micromsg.RemittanceLogic", "new friendsListStr=" + sb.toString());
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(327733, sb.toString());
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    /* renamed from: b */
    public static String m5170b() {
        C86709a0.m107528h();
        return Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(327733, (Object) null));
    }
}
