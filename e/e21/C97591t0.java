package e21;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ScanMaterialCodeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import f21.C45741c;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import vl2.j$$w;

/* renamed from: e21.t0 */
public class C97591t0 extends IStaticListener<ScanMaterialCodeEvent> {

    /* renamed from: d */
    public Dialog f286325d;

    public boolean callback(IEvent iEvent) {
        ScanMaterialCodeEvent scanMaterialCodeEvent = (ScanMaterialCodeEvent) iEvent;
        Log.m105925i("MicroMsg.ScanMaterialCodeListener", "scan material code type: %s", Integer.valueOf(scanMaterialCodeEvent.f265075d.f265079c));
        WeakReference weakReference = scanMaterialCodeEvent.f265075d.f265080d;
        if (weakReference == null || weakReference.get() == null) {
            Log.m105924i("MicroMsg.ScanMaterialCodeListener", "context has destroyed");
            ((j$$w) scanMaterialCodeEvent.f265075d.f265081e).run();
        } else {
            Context context = (Context) scanMaterialCodeEvent.f265075d.f265080d.get();
            int i = scanMaterialCodeEvent.f265075d.f265079c;
            if (i == 0) {
                this.f286325d = C75197d0.m90164e(context, false, (DialogInterface.OnCancelListener) null);
                ScanMaterialCodeEvent.C92557a aVar = scanMaterialCodeEvent.f265075d;
                C45535g0 g0Var = new C45535g0(aVar.f265077a, aVar.f265078b);
                C86709a0.m107524d().mo123455a(1800, new C97589r0(this, scanMaterialCodeEvent, context));
                C86709a0.m107524d().mo123460f(g0Var);
            } else if (i == 1) {
                this.f286325d = C75197d0.m90164e(context, false, (DialogInterface.OnCancelListener) null);
                ScanMaterialCodeEvent.C92557a aVar2 = scanMaterialCodeEvent.f265075d;
                C45741c cVar = new C45741c(aVar2.f265077a, aVar2.f265078b);
                C86709a0.m107524d().mo123455a(2811, new C97590s0(this, scanMaterialCodeEvent, context));
                C86709a0.m107524d().mo123460f(cVar);
            } else {
                Log.m105929w("MicroMsg.ScanMaterialCodeListener", "unknown type: %d", Integer.valueOf(i));
            }
        }
        return false;
    }
}
