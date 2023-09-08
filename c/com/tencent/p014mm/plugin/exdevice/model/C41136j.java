package com.tencent.p014mm.plugin.exdevice.model;

import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.sdk.platformtools.Log;
import y71.C53501k;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.model.j */
public class C41136j extends C41178a.C41179a {

    /* renamed from: b */
    public final /* synthetic */ C41188e f110816b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41136j(C41140m mVar, int i, C41188e eVar) {
        super(i);
        this.f110816b = eVar;
    }

    /* renamed from: a */
    public void mo64202a() {
        C53501k kVar = C53502m.m60039c().f110806a;
        C41188e eVar = this.f110816b;
        C53503o oVar = (C53503o) kVar;
        oVar.getClass();
        boolean z = false;
        try {
            z = oVar.f150455a.Ks0(0, eVar);
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
        }
    }
}
