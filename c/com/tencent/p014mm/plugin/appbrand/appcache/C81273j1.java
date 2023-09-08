package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.Util;
import p977hj.C87526a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j1 */
public final class C81273j1 {

    /* renamed from: d */
    public static final String[] f238678d = {ModulePkgInfo.MAIN_MODULE_NAME, ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE, ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE, ModulePkgInfo.PLUGIN_CODE};

    /* renamed from: a */
    public final String f238679a;

    /* renamed from: b */
    public final String f238680b;

    /* renamed from: c */
    public volatile String f238681c;

    public C81273j1(String str, String str2) {
        this.f238679a = str;
        this.f238680b = m99631a(str2);
    }

    /* renamed from: a */
    public static String m99631a(String str) {
        return (Util.isNullOrNil(str) || C87526a.m108857b(f238678d, str)) ? str : C81412d0.m99868b(str, true);
    }

    public String toString() {
        String str;
        if (Util.isNullOrNil(this.f238681c)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f238679a);
            if (Util.isNullOrNil(this.f238680b)) {
                str = "";
            } else {
                str = '$' + this.f238680b;
            }
            sb.append(str);
            this.f238681c = sb.toString();
        }
        return this.f238681c;
    }

    public C81273j1(String str, String str2, int i) {
        if (i == 0) {
            this.f238680b = "";
        } else if (i == 6) {
            this.f238680b = ModulePkgInfo.PLUGIN_CODE;
        } else if (i == 12) {
            this.f238680b = ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
        } else if (i == 13) {
            this.f238680b = m99631a(str2) + '$' + ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
        } else if (i == 22) {
            this.f238680b = ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
        } else if (i != 23) {
            this.f238680b = m99631a(str2);
        } else {
            this.f238680b = m99631a(str2) + '$' + ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
        }
        this.f238679a = str;
    }

    public C81273j1(String str) {
        this.f238679a = str;
        this.f238680b = null;
    }
}
