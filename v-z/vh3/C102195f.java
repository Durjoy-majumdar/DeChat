package vh3;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C101814mn2;

/* renamed from: vh3.f */
public final class C102195f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f300891d;

    /* renamed from: e */
    public final /* synthetic */ String f300892e;

    /* renamed from: f */
    public final /* synthetic */ C102196g f300893f;

    public C102195f(Bundle bundle, String str, C102196g gVar) {
        this.f300891d = bundle;
        this.f300892e = str;
        this.f300893f = gVar;
    }

    public final void run() {
        Bundle bundle = this.f300891d;
        int i = bundle != null ? bundle.getInt("err_type") : 0;
        Log.m105924i("MicroMsg.GetLensInfoTask", "IPCInvoker: " + this.f300892e + ", " + i);
        Bundle bundle2 = this.f300891d;
        byte[] byteArray = bundle2 != null ? bundle2.getByteArray("result") : null;
        if (byteArray == null) {
            C102191c cVar = this.f300893f.f300894d;
            if (cVar != null) {
                cVar.mo125818a(i, (C101814mn2) null);
                return;
            }
            return;
        }
        C101814mn2 mn22 = new C101814mn2();
        mn22.parseFrom(byteArray);
        C102191c cVar2 = this.f300893f.f300894d;
        if (cVar2 != null) {
            cVar2.mo125818a(i, mn22);
        }
    }
}
