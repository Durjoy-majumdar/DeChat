package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31064a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.c */
public final class C30190c {

    /* renamed from: a */
    public static final C30190c f81604a = new C30190c();

    /* renamed from: b */
    public static final HashMap<String, C31064a0> f81605b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, C31064a0> f81606c = new HashMap<>();

    static {
        Log.m105924i("MicroMsg.MagicBrushFileSystemFactory", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: a */
    public final C31064a0 mo57216a(String str, String str2, C81415h0 h0Var) {
        C31064a0 a0Var;
        C87412m.m108594g(str, "instanceName");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        HashMap<String, C31064a0> hashMap = f81605b;
        if (hashMap.containsKey(lowerCase)) {
            a0Var = hashMap.get(lowerCase);
            if (a0Var == null) {
                synchronized (this) {
                    hashMap.remove(lowerCase);
                }
                a0Var = new C85259a(lowerCase, str2, "wxfile://", h0Var);
                synchronized (this) {
                    hashMap.put(lowerCase, a0Var);
                }
            } else {
                a0Var.mo57959ks(lowerCase, str2, h0Var);
            }
        } else {
            a0Var = new C85259a(lowerCase, str2, "wxfile://", h0Var);
            synchronized (this) {
                hashMap.put(lowerCase, a0Var);
            }
        }
        return a0Var;
    }
}
