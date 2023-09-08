package hy1;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import q20.C89449a;

@C89449a
/* renamed from: hy1.c */
public class C8834c implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Set<String> keySet;
        Bundle bundle = (Bundle) obj;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : keySet) {
                    jSONObject.put(next, bundle.get(next));
                }
                GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
                GameCommOperationEvent.C1072a aVar = gameCommOperationEvent.f9268d;
                aVar.f9270a = 4;
                aVar.f9271b = jSONObject.toString();
                gameCommOperationEvent.publish();
            } catch (JSONException unused) {
            }
        }
    }
}
