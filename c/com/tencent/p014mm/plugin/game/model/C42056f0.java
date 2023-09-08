package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import py1.C47548b0;
import py1.C47589h;
import py1.C47679t5;

/* renamed from: com.tencent.mm.plugin.game.model.f0 */
public class C42056f0 {
    /* renamed from: a */
    public static C42039b m45762a(C47589h hVar) {
        C47679t5 t5Var;
        if (hVar == null) {
            Log.m105920e("MicroMsg.GamePBData", "Invalid pb object");
            return null;
        } else if (Util.isNullOrNil(hVar.f127726d)) {
            Log.m105920e("MicroMsg.GamePBData", "No AppID field, abort");
            return null;
        } else {
            Log.m105925i("MicroMsg.GamePBData", "Parsing AppID: %s", hVar.f127726d);
            C42039b bVar = new C42039b();
            bVar.field_appId = hVar.f127726d;
            bVar.field_appName = hVar.f127728f;
            bVar.field_appIconUrl = hVar.f127727e;
            bVar.field_appType = ",1,";
            bVar.field_packageName = hVar.f127732j;
            bVar.field_appVersion = hVar.f127741v;
            bVar.field_appInfoFlag = hVar.f127736q;
            C47548b0 b0Var = hVar.f127734o;
            if (b0Var != null) {
                bVar.mo73948q2(b0Var.f127584d);
                bVar.mo73947p2(hVar.f127734o.f127585e);
                bVar.mo73946o2(hVar.f127734o.f127588h);
                bVar.mo73949r2(hVar.f127734o.f127586f);
                C47548b0 b0Var2 = hVar.f127734o;
                bVar.f113265R1 = b0Var2.f127590j;
                bVar.f113266S1 = (long) b0Var2.f127589i;
                bVar.f113267T1 = b0Var2.f127591n;
            }
            C47548b0 b0Var3 = hVar.f127734o;
            if (!(b0Var3 == null || (t5Var = b0Var3.f127587g) == null)) {
                bVar.f149255V = t5Var.f128035d;
                bVar.f149233A = true;
                bVar.f149256W = t5Var.f128036e;
                bVar.f149233A = true;
                bVar.f149253T = t5Var.f128037f;
                bVar.f149233A = true;
                bVar.f149254U = t5Var.f128038g;
                bVar.f149233A = true;
                bVar.f149258Y = t5Var.f128040i;
                bVar.f149233A = true;
            }
            bVar.f113249B1 = hVar.f127729g;
            bVar.f113248A1 = hVar.f127730h;
            bVar.f113270y1 = hVar.f127735p;
            bVar.f113250C1 = hVar.f127731i;
            bVar.f113257J1 = hVar.f127733n;
            bVar.f113252E1 = hVar.f127737r;
            bVar.f113253F1 = hVar.f127738s;
            bVar.f113260M1 = hVar.f127744y;
            bVar.f113268U1 = hVar.f127723A;
            bVar.f113269V1 = hVar.f127724B;
            return bVar;
        }
    }
}
