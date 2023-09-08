package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.plugin.expansions.ExpansionsGlobal$CP;
import com.tencent.p014mm.sdk.platformtools.Log;
import p564iq.C87790d;
import ui3.C90664c;

/* renamed from: com.tencent.mm.plugin.expansions.d */
public class C115400d implements C87790d.C33382a {

    /* renamed from: a */
    public final /* synthetic */ ExpansionsGlobal$CP.C115398c f345906a;

    public C115400d(ExpansionsGlobal$CP.C115398c cVar) {
        this.f345906a = cVar;
    }

    /* renamed from: a */
    public void mo55610a(C90664c cVar) {
        Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "#onSuccess, expansions is ready");
        this.f345906a.f345903d.apply(1);
    }
}
