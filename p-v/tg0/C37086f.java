package tg0;

import android.os.Build;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p156gj.C87203t;

/* renamed from: tg0.f */
public class C37086f extends IStaticListener<GetSafeDeviceTypeEvent> {
    public boolean callback(IEvent iEvent) {
        GetSafeDeviceTypeEvent.C28759a aVar = ((GetSafeDeviceTypeEvent) iEvent).f78827d;
        aVar.f78828a = Build.MANUFACTURER + "-" + C87203t.m108275k();
        return false;
    }
}
