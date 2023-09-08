package n73;

import com.tencent.p014mm.autogen.events.WearVoipControllerEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n73.p */
public class C47200p extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11028);
        arrayList.add(11027);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        if (i == 11027) {
            WearVoipControllerEvent wearVoipControllerEvent = new WearVoipControllerEvent();
            wearVoipControllerEvent.f107832d.f107833a = 1;
            wearVoipControllerEvent.publish();
            return null;
        } else if (i != 11028) {
            return null;
        } else {
            WearVoipControllerEvent wearVoipControllerEvent2 = new WearVoipControllerEvent();
            wearVoipControllerEvent2.f107832d.f107833a = 2;
            wearVoipControllerEvent2.publish();
            return null;
        }
    }
}
