package a02;

import a02.C112700b;
import android.content.Intent;
import android.os.RemoteException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import org.json.JSONException;

/* renamed from: a02.d */
public class C112706d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f337433d;

    /* renamed from: e */
    public final /* synthetic */ MMHandler f337434e;

    /* renamed from: f */
    public final /* synthetic */ C112700b.C112703c f337435f;

    /* renamed from: g */
    public final /* synthetic */ C112700b f337436g;

    /* renamed from: a02.d$a */
    public class C112707a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112708e f337437d;

        /* renamed from: e */
        public final /* synthetic */ Intent f337438e;

        public C112707a(C112708e eVar, Intent intent) {
            this.f337437d = eVar;
            this.f337438e = intent;
        }

        public void run() {
            C112706d.this.f337435f.mo164438a(this.f337437d, this.f337438e);
        }
    }

    public C112706d(C112700b bVar, String str, MMHandler mMHandler, C112700b.C112703c cVar) {
        this.f337436g = bVar;
        this.f337433d = str;
        this.f337434e = mMHandler;
        this.f337435f = cVar;
    }

    public void run() {
        C112708e eVar = new C112708e(0, "Inventory refresh successful.");
        Intent intent = new Intent();
        try {
            int b = C112700b.m154102b(this.f337436g, intent, this.f337433d);
            if (b != 0) {
                eVar = new C112708e(b, "Error refreshing inventory (querying owned items).");
            }
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.IabHelper", e, "", new Object[0]);
            eVar = new C112708e(-1001, "Remote exception while refreshing inventory.");
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.IabHelper", e2, "", new Object[0]);
            eVar = new C112708e(-1002, "Error parsing JSON response while refreshing inventory.");
        }
        intent.putExtra("RESPONSE_CODE", eVar.mo164443a());
        this.f337434e.post(new C112707a(eVar, intent));
    }
}
