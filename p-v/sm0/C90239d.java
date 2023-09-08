package sm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p284zb.C91635f;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: sm0.d */
public final class C90239d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90240e f259047d;

    /* renamed from: e */
    public final /* synthetic */ C91635f f259048e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f259049f;

    /* renamed from: g */
    public final /* synthetic */ int f259050g;

    public C90239d(C90240e eVar, C91635f fVar, JSONObject jSONObject, int i) {
        this.f259047d = eVar;
        this.f259048e = fVar;
        this.f259049f = jSONObject;
        this.f259050g = i;
    }

    public final void run() {
        C90246m mVar;
        C13601g gVar = C90243k.f259053a;
        C90247p w = this.f259047d.mo124472w();
        C91635f fVar = this.f259048e;
        JSONObject jSONObject = this.f259049f;
        C87412m.m108594g(w, "category");
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, data: " + jSONObject);
        try {
            String string = jSONObject.getString("type");
            Object obj = ((Map) ((C36570n) C90243k.f259053a).getValue()).get(w);
            C87412m.m108591d(obj);
            C90237a aVar = (C90237a) ((Map) obj).get(string);
            if (aVar == null) {
                mVar = new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            } else {
                mVar = aVar.mo53095a(new C90245l(fVar, jSONObject));
                Log.m105924i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, result: " + mVar);
            }
        } catch (JSONException unused) {
            mVar = new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
        }
        this.f259048e.mo109647a(this.f259050g, this.f259047d.mo115110k((String) null, mVar.f259057a, mVar.f259058b));
    }
}
