package com.tencent.p014mm.p136ui.conversation;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.ui.conversation.a */
public class C30847a {

    /* renamed from: a */
    public static final String[] f82867a = {"M3X", "M5s", "M5", "MX6", "U10", "U20", "M2 E", "M A5", "DIG-AL00", "DIG-TL10", "NCE-AL00", "NCE-TL10", "MYA-TL10", "MYA-AL10", "NEM-AL10"};

    /* renamed from: a */
    public static boolean m39239a() {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            Log.m105925i("CompatSupportV27", "for weird native crash, %s", C87203t.m108275k());
            return true;
        }
        if (i == 23 && C87203t.m108275k() != null) {
            String[] strArr = f82867a;
            for (int i2 = 0; i2 < 15; i2++) {
                if (strArr[i2].equalsIgnoreCase(C87203t.m108275k())) {
                    Log.m105925i("CompatSupportV27", "for weird crash, %s", C87203t.m108275k());
                    return true;
                }
            }
        }
        return false;
    }
}
