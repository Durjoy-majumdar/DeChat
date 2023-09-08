package p1010nc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83147c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: nc.i */
public final class C88926i implements C83147c0 {

    /* renamed from: a */
    public C88916a f256470a;

    /* renamed from: nc.i$a */
    public static final class C88927a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88926i f256471d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f256472e;

        public C88927a(C88926i iVar, JSONObject jSONObject) {
            this.f256471d = iVar;
            this.f256472e = jSONObject;
        }

        public final void run() {
            C88916a aVar = this.f256471d.f256470a;
            if (aVar != null) {
                String jSONObject = this.f256472e.toString();
                if (aVar.f256458h) {
                    aVar.mo123303b(jSONObject);
                    return;
                }
                if (aVar.f256457g == null) {
                    aVar.f256457g = new LinkedList<>();
                }
                aVar.f256457g.add(jSONObject);
                return;
            }
            C87412m.m108603p("consoleView");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo115388a(String str) {
        if (str == null) {
            str = "";
        }
        mo123309c(3, str);
    }

    /* renamed from: b */
    public void mo115390b(int i, String str) {
        Log.m105924i("SkylineInspector", "onConsoleOutput, level:" + i + ", message:" + str);
        int i2 = 0;
        if (i != 3) {
            if (i == 4) {
                i2 = 1;
            } else if (i == 5) {
                i2 = 2;
            }
        }
        if (str == null) {
            str = "";
        }
        try {
            mo123309c(i2, str);
        } catch (Exception e) {
            Log.m105920e("SkylineInspector", "send get exception:" + e);
        }
    }

    /* renamed from: c */
    public final void mo123309c(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.C113379b.LEVEL, i);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("logs", jSONArray);
        ((C119157j) C119157j.f356862d).mo183895z(new C88927a(this, jSONObject));
    }
}
