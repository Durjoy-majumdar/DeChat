package a53;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.autogen.events.WCPayStartBalanceFetchEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import t43.C77855b;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: a53.b */
public class C67005b extends IStaticListener<WCPayStartBalanceFetchEvent> {

    /* renamed from: d */
    public C79148e.C79149a f192480d = new C67006a(this);

    /* renamed from: a53.b$a */
    public class C67006a implements C79148e.C79149a {
        public C67006a(C67005b bVar) {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105924i("PayStartBalanceFetchEvent", "balance fetch process end");
            JsapiResultEvent.C67720a aVar = new JsapiResultEvent().f193694d;
            aVar.f193695a = 17;
            aVar.f193696b = -1;
            return null;
        }
    }

    public boolean callback(IEvent iEvent) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_balance_fetch_scene", 1);
        C79143a.m95771j((Activity) ((WCPayStartBalanceFetchEvent) iEvent).f194030d.f194031a, C77855b.class, bundle, this.f192480d);
        return false;
    }
}
