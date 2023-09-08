package q71;

import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41154p0;
import com.tencent.p014mm.plugin.exdevice.model.C41174v1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q71.q */
public class C47770q implements C41154p0.C41156b {

    /* renamed from: a */
    public final /* synthetic */ WearHardDeviceEvent f128289a;

    public C47770q(C47771r rVar, WearHardDeviceEvent wearHardDeviceEvent) {
        this.f128289a = wearHardDeviceEvent;
    }

    /* renamed from: a */
    public void mo64221a(boolean z) {
        if (!z) {
            WearHardDeviceEvent.C40185a aVar = this.f128289a.f107826d;
            Log.m105921e("WearHardDeviceListener", "GetBoundDeviceLogic Fail, deviceId=%s|deviceType=%s", aVar.f107829c, aVar.f107830d);
            C41174v1.m44613b(this.f128289a.f107826d.f107829c, false);
            return;
        }
        C41174v1.m44613b(this.f128289a.f107826d.f107829c, true);
    }
}
