package o73;

import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: o73.c */
public abstract class C47335c extends C47336d {
    /* renamed from: a */
    public void mo67620a() {
        if (C43457b.xx0().mo176383d()) {
            WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
            wearHardDeviceEvent.f107826d.f107827a = 11;
            wearHardDeviceEvent.publish();
            mo67622c();
            return;
        }
        Log.m105924i("MicroMsg.WearBaseSendTask", "can not send message to wear");
    }

    /* renamed from: c */
    public abstract void mo67622c();
}
