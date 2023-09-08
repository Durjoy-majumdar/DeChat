package p670qx;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.ReportNewInstallAppEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35710f;
import zt3.C119157j;

/* renamed from: qx.b0 */
public class C36138b0 extends IStaticListener<ReportNewInstallAppEvent> {
    public boolean callback(IEvent iEvent) {
        Intent intent = ((ReportNewInstallAppEvent) iEvent).f78925d.f78926a;
        ((C119157j) C119157j.f356862d).mo183876g(new C35710f(intent), "SIRWorker");
        return false;
    }
}
