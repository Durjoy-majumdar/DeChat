package jy1;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.GameWeakNetEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.network.C40377j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import sx3.C110823p;
import z83.C16123a;

/* renamed from: jy1.e */
public final class C46587e {

    /* renamed from: a */
    public static final C46587e f125495a = new C46587e();

    /* renamed from: b */
    public static final C46589b f125496b = new C46589b();

    /* renamed from: c */
    public static final C46588a f125497c = new C46588a();

    /* renamed from: d */
    public static volatile boolean f125498d;

    /* renamed from: e */
    public static volatile int f125499e = 4;

    /* renamed from: jy1.e$a */
    public static final class C46588a extends C29060q.C29061a {
        public void onNetworkChange(int i) {
            Log.m105924i("MicroMsg.GameWeakNetReceiver.MMReceiver", "mmNetEventReceiver.onNetworkChange(status:" + i + ')');
            C46587e eVar = C46587e.f125495a;
            C46587e.f125499e = i;
            C46587e.m51908a(C46587e.f125495a);
        }
    }

    /* renamed from: jy1.e$b */
    public static final class C46589b extends C40377j.C40378a {
        /* renamed from: q2 */
        public void mo59883q2(boolean z, int i) {
            Log.m105924i("MicroMsg.GameWeakNetReceiver.MMReceiver", "mmNetReceiver.onReceiveWeakNet(weak:" + z + ", rtt:" + i + ')');
            C46587e eVar = C46587e.f125495a;
            C46587e.f125498d = z;
            C46587e.m51908a(C46587e.f125495a);
        }
    }

    /* renamed from: a */
    public static final void m51908a(C46587e eVar) {
        eVar.getClass();
        int b = m51909b();
        boolean z = b != 4;
        GameWeakNetEvent gameWeakNetEvent = new GameWeakNetEvent();
        GameWeakNetEvent.C40112a aVar = gameWeakNetEvent.f107570d;
        aVar.f107571a = z;
        aVar.f107572b = b;
        gameWeakNetEvent.publish();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isUnderWeakNet", z);
            jSONObject.put("weakNetDetailFlags", b);
            Bundle bundle = new Bundle();
            bundle.putString("name", "onNetworkChange");
            bundle.putString("data", jSONObject.toString());
            ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C16123a.class, (C1256g) null);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public static final int m51909b() {
        int i = f125498d ? 2 : 4;
        if (!C110823p.m151009y(new Integer[]{4, 6}, Integer.valueOf(f125499e))) {
            return 1;
        }
        return i;
    }
}
