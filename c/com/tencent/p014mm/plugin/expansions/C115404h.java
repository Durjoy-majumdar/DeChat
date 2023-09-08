package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.sdk.platformtools.Log;
import p564iq.C87790d;
import ui3.C90664c;

/* renamed from: com.tencent.mm.plugin.expansions.h */
public class C115404h implements C87790d.C33382a {

    /* renamed from: a */
    public final /* synthetic */ C115405i f345911a;

    public C115404h(C115405i iVar) {
        this.f345911a = iVar;
    }

    /* renamed from: a */
    public void mo55610a(C90664c cVar) {
        Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "#onSuccess, expansions is ready");
        this.f345911a.f345912d.apply(Boolean.TRUE);
    }
}
