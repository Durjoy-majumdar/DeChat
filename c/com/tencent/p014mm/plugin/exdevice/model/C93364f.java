package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1081gi.C98124g;
import te3.C101766ct2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.exdevice.model.f */
public final class C93364f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93356d f269421d;

    /* renamed from: e */
    public final /* synthetic */ String f269422e;

    /* renamed from: f */
    public final /* synthetic */ int f269423f;

    public C93364f(C93356d dVar, String str, int i) {
        this.f269421d = dVar;
        this.f269422e = str;
        this.f269423f = i;
    }

    public final void run() {
        boolean z = true;
        Log.m105925i("ExDeviceSendIotLogic", "send msgid %d", Long.valueOf(this.f269421d.f269400a));
        C93366l1 l1Var = new C93366l1();
        l1Var.f269424d = this.f269422e;
        l1Var.f269432o = this.f269423f;
        l1Var.f269431n = true;
        C101766ct2 ct22 = new C101766ct2();
        if (C93365i.m117885b(ct22, (C98124g) null, this.f269421d.f269400a)) {
            C93356d dVar = this.f269421d;
            dVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("type: ");
            sb.append(ct22.f298049d);
            sb.append(' ');
            sb.append(ct22.f298055j != null);
            Log.m105924i("ExDeviceSendIotLogic", sb.toString());
            int i = ct22.f298049d;
            if ((i != 3 || ct22.f298052g == null) && ((i != 4 || ct22.f298053h == null) && (i != 6 || ct22.f298055j == null))) {
                z = false;
            } else {
                Log.m105924i("ExDeviceSendIotLogic", "directUpload type: " + ct22.f298049d);
                ((C119157j) C119157j.f356862d).mo183876g(new C93363e(dVar, l1Var), "ExDeviceSendIotLogic");
            }
            if (!z) {
                C93356d dVar2 = this.f269421d;
                dVar2.mo128147a(ct22, l1Var, dVar2.f269410k);
                return;
            }
            return;
        }
        Log.m105924i("ExDeviceSendIotLogic", "genMsg failed");
    }
}
