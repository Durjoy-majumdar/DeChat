package t83;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: t83.k */
public final class C13857k {

    /* renamed from: a */
    public final HashMap<Integer, C13858a> f39005a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<Integer, Integer> f39006b = new HashMap<>();

    /* renamed from: t83.k$a */
    public static final class C13858a {

        /* renamed from: a */
        public long f39007a;

        /* renamed from: b */
        public int f39008b;

        public C13858a(long j, int i) {
            this.f39007a = j;
            this.f39008b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13858a)) {
                return false;
            }
            C13858a aVar = (C13858a) obj;
            return this.f39007a == aVar.f39007a && this.f39008b == aVar.f39008b;
        }

        public int hashCode() {
            long j = this.f39007a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f39008b;
        }

        public String toString() {
            return "JsApiCallInfo(time=" + this.f39007a + ", count=" + this.f39008b + ')';
        }
    }

    public C13857k() {
        try {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_webview_jsapi_call_limit, "{\"list\":[{\"limit\":10,\"pos\":14},{\"limit\":10,\"pos\":15}]}");
            JSONArray optJSONArray = new JSONObject(Y60).optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = optJSONArray.get(i);
                    C87412m.m108592e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    this.f39006b.put(Integer.valueOf(jSONObject.optInt("pos")), Integer.valueOf(jSONObject.optInt("limit")));
                }
            }
            Log.m105924i("MicroMsg.JsApiFrequentHelper", "size=" + this.f39006b.size() + ", config=" + Y60);
        } catch (Throwable th) {
            Log.m105928w("MicroMsg.JsApiFrequentHelper", "parse fail: ex=" + th.getMessage());
        }
    }

    /* renamed from: a */
    public final boolean mo13186a(int i) {
        if (this.f39006b.containsKey(Integer.valueOf(i))) {
            Integer num = this.f39006b.get(Integer.valueOf(i));
            C87412m.m108591d(num);
            int intValue = num.intValue();
            if (intValue <= 0) {
                return false;
            }
            C13858a aVar = this.f39005a.get(Integer.valueOf(i));
            long currentTimeMillis = System.currentTimeMillis() / ((long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            if (aVar == null) {
                aVar = new C13858a(currentTimeMillis, 1);
            } else if (aVar.f39007a == currentTimeMillis) {
                aVar.f39008b++;
            } else {
                aVar.f39007a = currentTimeMillis;
                aVar.f39008b = 1;
            }
            this.f39005a.put(Integer.valueOf(i), aVar);
            if (aVar.f39008b >= intValue) {
                return true;
            }
            Log.m105924i("MicroMsg.JsApiFrequentHelper", "isTooFrequent controlByte:" + i + ", count:" + aVar.f39008b);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo13187b(int i, String str, String str2) {
        C13858a aVar;
        C87412m.m108594g(str, "funcName");
        C87412m.m108594g(str2, "url");
        if (this.f39006b.containsKey(Integer.valueOf(i))) {
            Integer num = this.f39006b.get(Integer.valueOf(i));
            C87412m.m108591d(num);
            int intValue = num.intValue();
            if (intValue > 0 && (aVar = this.f39005a.get(Integer.valueOf(i))) != null && aVar.f39008b == intValue) {
                C115669n nVar = C115669n.INSTANCE;
                QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
                nVar.mo160131h(18188, str, WebViewUtilities.doUrlEncode(str2));
            }
        }
    }
}
