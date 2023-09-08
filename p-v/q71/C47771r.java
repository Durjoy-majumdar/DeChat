package q71;

import android.content.Context;
import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41122b1;
import com.tencent.p014mm.plugin.exdevice.model.C41131g1;
import com.tencent.p014mm.plugin.exdevice.model.C41154p0;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41174v1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import n71.C47180k;
import y71.C53498h;
import z71.C53753b;

/* renamed from: q71.r */
public class C47771r extends IStaticListener<WearHardDeviceEvent> {
    public boolean callback(IEvent iEvent) {
        WearHardDeviceEvent wearHardDeviceEvent = (WearHardDeviceEvent) iEvent;
        if (wearHardDeviceEvent instanceof WearHardDeviceEvent) {
            WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
            int i = aVar.f107827a;
            boolean z = true;
            if (i == 1) {
                Log.m105925i("WearHardDeviceListener", "receive register deviceId=%s", aVar.f107829c);
                C41154p0.INSTANCE.mo64217e(MMApplicationContext.getContext(), new C47770q(this, wearHardDeviceEvent));
                return false;
            } else if (i == 7) {
                C86709a0.m107529k().f251779b.mo123455a(541, C41174v1.f110933d);
                WearHardDeviceEvent.C40185a aVar2 = wearHardDeviceEvent.f107826d;
                C86709a0.m107529k().f251779b.mo123460f(new C41122b1("AndroidWear", aVar2.f107830d, aVar2.f107829c, 1, new byte[0]));
            } else if (i == 11) {
                Context context = MMApplicationContext.getContext();
                if (!Util.isProcessRunning(context, MMApplicationContext.getPackageName() + ":exdevice")) {
                    C53498h.m60027a(MMApplicationContext.getContext());
                }
            } else if (i == 3) {
                C53753b bD = C41166r1.Bx0().mo74334bD(wearHardDeviceEvent.f107826d.f107829c);
                WearHardDeviceEvent.C40185a aVar3 = wearHardDeviceEvent.f107826d;
                if (bD == null) {
                    z = false;
                }
                aVar3.f107828b = z;
            } else if (i == 4) {
                Log.m105925i("WearHardDeviceListener", "receive send deviceId=%s", aVar.f107829c);
                C86709a0.m107529k().f251779b.mo123455a(538, C41174v1.f110933d);
                WearHardDeviceEvent.C40185a aVar4 = wearHardDeviceEvent.f107826d;
                C86709a0.m107529k().f251779b.mo123460f(new C41131g1(0, aVar4.f107830d, aVar4.f107829c, C47180k.C11140g.m11026a(), Util.nowMilliSecond(), wearHardDeviceEvent.f107826d.f107831e, 1));
            }
        }
        return false;
    }
}
