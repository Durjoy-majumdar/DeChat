package com.tencent.p014mm.plugin.fts;

import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.fts.j */
public class C93838j extends C99664b {

    /* renamed from: j */
    public String f270833j = "";

    /* renamed from: n */
    public final /* synthetic */ PluginFTS.C938176 f270834n;

    public C93838j(PluginFTS.C938176 r1) {
        this.f270834n = r1;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        this.f270833j = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        PluginFTS.this.f270759e.mo128800q(-3, (long) this.f270833j.hashCode());
        return true;
    }

    public String toString() {
        return "LanguageUpdate(\"" + this.f270833j + "\")";
    }
}
