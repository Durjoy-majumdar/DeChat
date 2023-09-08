package p738wg;

import com.tencent.p014mm.autogen.events.ExtRecordEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p375qh.C77340l;

/* renamed from: wg.g */
public class C78593g extends IStaticListener<ExtRecordEvent> {

    /* renamed from: d */
    public C77340l f230223d;

    /* renamed from: e */
    public String f230224e = "";

    public boolean callback(IEvent iEvent) {
        C77340l lVar;
        ExtRecordEvent extRecordEvent = (ExtRecordEvent) iEvent;
        int i = extRecordEvent.f193555d.f193557a;
        if (i == 1) {
            if (this.f230223d == null) {
                this.f230223d = new C77340l(MMApplicationContext.getContext(), false);
            }
            extRecordEvent.f193556e.f193559a = this.f230223d.mo107322g(extRecordEvent.f193555d.f193558b);
            this.f230224e = this.f230223d.mo107315a();
            Log.m105919d("MicroMsg.ExtRecordEventListener", "data.op = [%s], ret = [%s]", Integer.valueOf(extRecordEvent.f193555d.f193557a), Boolean.valueOf(extRecordEvent.f193556e.f193559a));
        } else if (i == 2 && (lVar = this.f230223d) != null) {
            ExtRecordEvent.C67683b bVar = extRecordEvent.f193556e;
            bVar.f193560b = this.f230224e;
            bVar.f193559a = lVar.stop();
            Log.m105919d("MicroMsg.ExtRecordEventListener", "data.op = [%s], fileName = [%s], ret = [%s]", Integer.valueOf(extRecordEvent.f193555d.f193557a), this.f230224e, Boolean.valueOf(extRecordEvent.f193556e.f193559a));
            this.f230224e = "";
        }
        return true;
    }
}
