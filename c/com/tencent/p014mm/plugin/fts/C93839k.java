package com.tencent.p014mm.plugin.fts;

import com.tencent.p014mm.autogen.events.UpdateLanguageEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.fts.k */
public class C93839k extends C99664b {

    /* renamed from: j */
    public String f270835j = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());

    /* renamed from: n */
    public boolean f270836n = false;

    /* renamed from: o */
    public final /* synthetic */ PluginFTS f270837o;

    public C93839k(PluginFTS pluginFTS) {
        this.f270837o = pluginFTS;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        boolean z = ((int) this.f270837o.f270759e.mo128794k(-3, 0)) != this.f270835j.hashCode();
        this.f270836n = z;
        if (z) {
            new UpdateLanguageEvent().publish();
        }
        return true;
    }

    /* renamed from: c */
    public String mo94944c() {
        return String.format("{changed: %b}", new Object[]{Boolean.valueOf(this.f270836n)});
    }

    public String getName() {
        return "CheckLanguageUpdate";
    }
}
