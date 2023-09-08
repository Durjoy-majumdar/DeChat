package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.j2 */
public class C81973j2 implements C80669j.C80675f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f240376a;

    public C81973j2(C81925i2 i2Var) {
        this.f240376a = i2Var;
    }

    /* renamed from: a */
    public void mo112506a(String str, C80669j.C80676g gVar) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (parseBoolean) {
            C81925i2.C81929d dVar = this.f240376a.f240288G;
            dVar.f240301b = gVar.f236058a;
            dVar.f240302c = gVar.f236059b;
            dVar.f240303d = gVar;
        }
        C81925i2.C81929d dVar2 = this.f240376a.f240288G;
        Log.m105925i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by AddonV8, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", Boolean.valueOf(parseBoolean), Integer.valueOf(this.f240376a.hashCode()), Long.valueOf(dVar2.f240302c - dVar2.f240301b));
        C81925i2 i2Var = this.f240376a;
        C81925i2.C81929d dVar3 = i2Var.f240288G;
        i2Var.mo114326B0(dVar3.f240300a, dVar3.f240301b, dVar3.f240302c, dVar3.f240303d);
    }
}
