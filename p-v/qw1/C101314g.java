package qw1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.HashMap;
import kg3.C76577a;
import org.json.JSONObject;
import qo3.C77426q;

/* renamed from: qw1.g */
public final class C101314g {

    /* renamed from: a */
    public static final C101314g f296814a = new C101314g();

    /* renamed from: a */
    public final void mo140781a(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        if (i < 200) {
            C77426q qVar = new C77426q(context);
            qVar.mo107606r(C76577a.m92166q(context, C0966R.string.f5w));
            qVar.mo107602n(C76577a.m92166q(context, C0966R.string.f5b));
            qVar.mo107600l(C101310c.f296810a);
            qVar.mo107603o();
        } else if (i == 201) {
            HashMap<Integer, JSONObject> hashMap = C63339b.f179707b;
            JSONObject jSONObject = hashMap.get(Integer.valueOf(i2));
            JSONObject jSONObject2 = hashMap.get(-1);
            int optInt = (jSONObject == null || !jSONObject.has("min-duration-ms")) ? (jSONObject2 == null || !jSONObject2.has("min-duration-ms")) ? 1000 : jSONObject2.optInt("min-duration-ms", 1000) : jSONObject.optInt("min-duration-ms", 1000);
            C77426q qVar2 = new C77426q(context);
            String string = context.getString(C0966R.string.f65, new Object[]{Integer.valueOf(optInt / 1000)});
            C87412m.m108593f(string, "context.getString(R.stri…sc_custom, timeMS / 1000)");
            qVar2.mo107606r(string);
            qVar2.mo107602n(C76577a.m92166q(context, C0966R.string.f5b));
            qVar2.mo107600l(C101313f.f296813a);
            qVar2.mo107603o();
        } else if (i < 300) {
            HashMap<Integer, JSONObject> hashMap2 = C63339b.f179707b;
            JSONObject jSONObject3 = hashMap2.get(Integer.valueOf(i2));
            JSONObject jSONObject4 = hashMap2.get(-1);
            int i3 = 300000;
            if (jSONObject3 != null && jSONObject3.has("max-duration-ms")) {
                i3 = jSONObject3.optInt("max-duration-ms", 300000);
            } else if (jSONObject4 != null && jSONObject4.has("max-duration-ms")) {
                i3 = jSONObject4.optInt("max-duration-ms", 300000);
            }
            C77426q qVar3 = new C77426q(context);
            String string2 = context.getString(C0966R.string.f360834f61, new Object[]{Integer.valueOf((i3 / 1000) / 60)});
            C87412m.m108593f(string2, "context.getString(R.stri…, durationMs / 1000 / 60)");
            qVar3.mo107606r(string2);
            qVar3.mo107602n(C76577a.m92166q(context, C0966R.string.f5b));
            qVar3.mo107600l(C101312e.f296812a);
            qVar3.mo107603o();
        } else if (i < 400) {
            C77426q qVar4 = new C77426q(context);
            qVar4.mo107606r(C76577a.m92166q(context, C0966R.string.f5y));
            qVar4.mo107602n(C76577a.m92166q(context, C0966R.string.f5b));
            qVar4.mo107600l(C101311d.f296811a);
            qVar4.mo107603o();
        }
    }
}
