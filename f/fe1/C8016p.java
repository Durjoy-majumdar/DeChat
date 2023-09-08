package fe1;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import java.util.Set;
import nt1.C11274c;
import org.json.JSONException;
import org.json.JSONObject;
import pe3.C47465a;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: fe1.p */
public final class C8016p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ContentValues f26702d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8016p(ContentValues contentValues) {
        super(0);
        this.f26702d = contentValues;
    }

    public Object invoke() {
        Set<Map.Entry<String, Class<?>>> entrySet = C58969q.f168704X2.entrySet();
        ContentValues contentValues = this.f26702d;
        String str = "";
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : entrySet) {
            byte[] asByteArray = contentValues.getAsByteArray((String) entry.getKey());
            if (asByteArray != null) {
                if (!(asByteArray.length == 0)) {
                    Object newInstance = ((Class) entry.getValue()).newInstance();
                    i++;
                    try {
                        C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        ((C47465a) newInstance).parseFrom(asByteArray);
                    } catch (Exception unused) {
                        i2++;
                        str = str + newInstance.getClass().getSimpleName() + '#';
                    }
                }
            }
        }
        if (i > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("parse_count", i);
                jSONObject.put("error_count", i2);
                jSONObject.put("error", str);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "json.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                Log.m105924i("LocalFinderContact", n);
                C11274c.m11126a(C11274c.f33202a, 0, "KeyContactParseError", n, 1, (Object) null);
            } catch (JSONException unused2) {
            }
        }
        return C13598b0.f38549a;
    }
}
