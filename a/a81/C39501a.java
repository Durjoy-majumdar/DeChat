package a81;

import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41200j;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import n71.C47172c;
import s71.C48245e;
import x71.C53294a;
import y71.C53501k;
import y71.C53502m;
import y71.C53503o;

/* renamed from: a81.a */
public class C39501a implements C39503c {

    /* renamed from: a */
    public C47172c f106066a;

    /* renamed from: b */
    public C39504d f106067b;

    /* renamed from: c */
    public C39515m f106068c = null;

    public C39501a(C47172c cVar, C39504d dVar) {
        this.f106066a = cVar;
        this.f106067b = dVar;
    }

    /* renamed from: b */
    public boolean mo62110b(C53501k kVar) {
        long j;
        if (kVar == null) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "dispatcher is null");
            return false;
        } else if (this.f106068c != null) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "Prev task is still working!!!");
            return false;
        } else {
            Log.m105925i("MicroMsg.exdevice.ExDeviceTask", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", Short.valueOf(this.f106066a.mo72251b()), Short.valueOf(this.f106066a.f126720b), Long.valueOf(this.f106066a.f126719a));
            C39515m mVar = new C39515m(this.f106066a, this);
            try {
                j = ((C53503o) kVar).f150455a.mo23559pR(mVar);
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startTask failed!!! %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                j = -1;
            }
            if (-1 == j) {
                Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "dispatcher.startTask Failed!!!");
                return false;
            }
            this.f106068c = mVar;
            C39512l e2 = mVar.mo62119e();
            e2.f106086f = false;
            C86709a0.m107525e().getWorkerHandler().postDelayed(e2.f106087g, 15000);
            return true;
        }
    }

    /* renamed from: c */
    public void mo62111c(long j, int i, int i2, String str, C41200j jVar) {
        boolean z = false;
        Log.m105925i("MicroMsg.exdevice.ExDeviceTask", "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(this.f106066a.f126719a), Short.valueOf(this.f106066a.mo72251b()), Short.valueOf(this.f106066a.f126720b));
        C53294a.m59722a(this.f106066a.f126719a, i == 0 ? 1 : 0);
        if (jVar == null || jVar == this.f106068c) {
            if (-1 == i && -2 == i2) {
                Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "Time Out in local!!!");
            }
            C48245e eVar = this.f106066a.f126721c;
            int i3 = eVar != null ? eVar.f129247d : 0;
            if (-5 == i3 || -3 == i3 || -4 == i3) {
                Log.m105929w("MicroMsg.exdevice.ExDeviceTask", "ErrorCode = %d, destroy channel(deviceId = %d)", Integer.valueOf(eVar.f129247d), Long.valueOf(this.f106066a.f126719a));
                if (C53502m.m60039c().f110806a != null) {
                    if (((C53503o) C53502m.m60039c().f110806a).mo74187e(this.f106066a.f126719a)) {
                        z = true;
                    }
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "stopChannel Failed!!!");
                }
            }
            C39504d dVar = this.f106067b;
            if (dVar != null) {
                dVar.mo62112a(j, i, i2, str);
            }
            this.f106068c = null;
            return;
        }
        Log.m105920e("MicroMsg.exdevice.ExDeviceTask", "netCmd != mRemoteTask");
    }
}
