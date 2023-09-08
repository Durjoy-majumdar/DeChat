package y71;

import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.service.C41182c;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.plugin.exdevice.service.C41191f;
import com.tencent.p014mm.plugin.exdevice.service.C41203k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: y71.o */
public class C53503o implements C53501k {

    /* renamed from: a */
    public C41182c f150455a;

    public C53503o(C41182c cVar) {
        this.f150455a = cVar;
    }

    /* renamed from: a */
    public boolean mo74183a(String str, boolean z, C41203k kVar) {
        Log.m105925i("MicroMsg.exdevice.RDeviceTaskDispatcher", "ranging, uuid = %s, op = %s", str, String.valueOf(z));
        try {
            return this.f150455a.mo23546Qk(str, z, kVar);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.ranging failed!!!(%s)", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo74184b(int i, C41188e eVar) {
        try {
            return this.f150455a.J90(i, eVar);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "scan failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public void mo74185c(long j, byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.RDeviceTaskDispatcher", "------setChannelSessionKey------ deviceId = %d", Long.valueOf(j));
        try {
            this.f150455a.mo23540Ds(j, bArr);
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
        }
    }

    /* renamed from: d */
    public boolean mo74186d(long j, int i, C41191f fVar) {
        C53502m.m60037a().mo74174a(j);
        try {
            return this.f150455a.vc0(j, i, fVar);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startChannel failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo74187e(long j) {
        C53502m.m60037a().mo74174a(j);
        try {
            return this.f150455a.wl0(j);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopChannel failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
            return false;
        }
    }
}
