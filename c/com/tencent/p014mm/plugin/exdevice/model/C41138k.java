package com.tencent.p014mm.plugin.exdevice.model;

import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.plugin.exdevice.service.C41191f;
import com.tencent.p014mm.sdk.platformtools.Log;
import y71.C53501k;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.model.k */
public class C41138k extends C41178a.C41179a {

    /* renamed from: b */
    public final /* synthetic */ long f110822b;

    /* renamed from: c */
    public final /* synthetic */ C41191f f110823c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41138k(C41140m mVar, int i, long j, C41191f fVar) {
        super(i);
        this.f110822b = j;
        this.f110823c = fVar;
    }

    /* renamed from: a */
    public void mo64202a() {
        C53501k kVar = C53502m.m60039c().f110806a;
        long j = this.f110822b;
        C41191f fVar = this.f110823c;
        C53503o oVar = (C53503o) kVar;
        oVar.getClass();
        boolean z = false;
        try {
            z = oVar.f150455a.Pr0(j, 0, fVar);
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
        }
    }
}
