package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import n71.C47172c;
import n71.C47177h;
import s71.C48254n;
import y71.C53502m;
import y71.C53503o;
import z71.C53752a;
import z71.C53753b;
import z71.C53754c;

/* renamed from: a81.b */
public class C39502b extends C39501a implements C39504d {

    /* renamed from: d */
    public final C39504d f106069d;

    public C39502b(C47172c cVar, C39504d dVar) {
        super(cVar, dVar);
        this.f106067b = this;
        this.f106069d = dVar;
    }

    /* renamed from: a */
    public void mo62112a(long j, int i, int i2, String str) {
        int i3;
        Log.m105925i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str);
        C48254n nVar = (C48254n) ((C47177h) this.f106066a).f126722d;
        if (nVar == null) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "null = pushReq");
            i3 = -1;
        } else {
            i3 = nVar.f129274e;
        }
        if (2 == i3) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Switch view push has been sended to device, now try to check close strategy");
            C53754c Bx0 = C41166r1.Bx0();
            C53753b SE = Bx0.mo74331SE(this.f106066a.f126719a + "");
            if (SE == null) {
                Log.m105921e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "get hdinfo by mac failed!!!, Mac = %d", Long.valueOf(this.f106066a.f126719a));
                C39504d dVar = this.f106069d;
                if (dVar != null) {
                    dVar.mo62112a(j, i, i2, str);
                    return;
                }
                return;
            }
            int i4 = SE.field_closeStrategy;
            if (i4 == 1) {
                Log.m105925i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, stop channel(device id = %d)", Integer.valueOf(i4), Long.valueOf(this.f106066a.f126719a));
                if (C53502m.m60039c().f110806a != null) {
                    ((C53503o) C53502m.m60039c().f110806a).mo74187e(this.f106066a.f126719a);
                }
            } else if (i4 != 2) {
                Log.m105921e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Error close strategy(%d)", Integer.valueOf(i4));
            } else {
                Log.m105925i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, Record it(%d) in the shut down device list", Integer.valueOf(i4), Long.valueOf(this.f106066a.f126719a));
                if (!C53752a.m60247a("shut_down_device", this.f106066a.f126719a)) {
                    Log.m105920e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
                }
            }
        }
        C39504d dVar2 = this.f106069d;
        if (dVar2 != null) {
            dVar2.mo62112a(j, i, i2, str);
        }
    }
}
