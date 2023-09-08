package bh3;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bh3.m */
public final class C0279m {

    /* renamed from: a */
    public static final HashMap<String, String> f840a = new HashMap<>();

    static {
        C113192w wVar = C113192w.f338695a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        JSONObject jSONObject = new JSONObject(wVar.mo165722a(context, "methodToPermissionMap.json"));
        Iterator<String> keys = jSONObject.keys();
        C87412m.m108593f(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                HashMap<String, String> hashMap = f840a;
                String obj = jSONArray.get(i).toString();
                C87412m.m108593f(next, LocaleUtil.ITALIAN);
                hashMap.put(obj, next);
            }
        }
    }
}
