package com.tencent.p014mm.plugin.expansions;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C21152b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p206nj.C76862i;
import p722v8.C37695a;

/* renamed from: com.tencent.mm.plugin.expansions.s */
public class C85182s {

    /* renamed from: a */
    public static final Map<String, List<Pair<String, String>>> f248176a = new HashMap();

    /* renamed from: b */
    public static final C21152b f248177b = new C85183a();

    /* renamed from: com.tencent.mm.plugin.expansions.s$a */
    public class C85183a implements C21152b {

        /* renamed from: a */
        public final String f248178a = C37695a.class.getName().replaceAll("\\.", "/");

        /* renamed from: b */
        public final String f248179b = Delivery.class.getName().replaceAll("\\.", "/");

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (!mo118214c(str2, str)) {
                String str6 = null;
                if (objArr != null && objArr.length > 0) {
                    String str7 = objArr[0];
                    if (str7 instanceof String) {
                        str6 = str7;
                    }
                }
                Log.m105924i("MicroMsg.exp.asm", "on System.loadLibrary invoke, caller method = " + str2 + ", caller class = " + str + ", caller obj = " + obj + ", libName = " + str6);
                if ((!TextUtils.isEmpty(str6) && Delivery.isInstalled()) ? C76862i.f224685a.mo107118a(str6) : false) {
                    Log.m105924i("MicroMsg.exp.asm", "try loadLibrary with Delivery");
                    Delivery.tryLoadLibrary(str6, false);
                }
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            if (!mo118214c(str2, str)) {
                Log.m105924i("MicroMsg.exp.asm", "on System.loadLibrary invoke done, caller method = " + str2 + ", caller class = " + str + ", caller obj = " + obj);
            }
        }

        /* renamed from: c */
        public final boolean mo118214c(String str, String str2) {
            if (this.f248178a.equals(str2) || "com/google/android/play/core/splitinstall/SplitInstallHelper".equals(str2) || this.f248179b.equals(str2) || "com/tencent/mm/plugin/expansions/Delivery".equals(str2)) {
                return true;
            }
            return "loadLibraryFlattWithinDelivery".equals(str);
        }
    }
}
