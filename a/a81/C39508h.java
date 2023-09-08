package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import n71.C47175f;
import y71.C53501k;

/* renamed from: a81.h */
public class C39508h extends C41171u1 {

    /* renamed from: d */
    public C47175f f106078d;

    public C39508h(C47175f fVar) {
        this.f106078d = fVar;
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        boolean b = new C39501a(this.f106078d, dVar).mo62110b(kVar);
        Log.m105925i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", Boolean.valueOf(b));
        return b;
    }
}
