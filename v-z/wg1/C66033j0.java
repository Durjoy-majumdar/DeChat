package wg1;

import ak1.C0073g0;
import ak1.C54108o;
import cj1.C54785k6;
import cl1.C54994o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import org.json.JSONObject;
import qk1.C63205e0;
import rx3.C13598b0;

/* renamed from: wg1.j0 */
public final class C66033j0 extends C87413o implements C32227p<Integer, C54785k6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66010g0 f189842d;

    /* renamed from: e */
    public final /* synthetic */ C63205e0 f189843e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66033j0(C66010g0 g0Var, C63205e0 e0Var) {
        super(2);
        this.f189842d = g0Var;
        this.f189843e = e0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C54785k6 k6Var = (C54785k6) obj2;
        C87412m.m108594g(k6Var, "musicItem");
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "7");
        jSONObject.put("music_name", k6Var.f153566a);
        jSONObject.put("clear_hot_value", k6Var.f153567b);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
        Integer value = ((C54994o1) this.f189842d.f189771e.mo71262a(C54994o1.class)).f154399f.f153478a.getValue();
        if (value == null) {
            value = -1;
        }
        int intValue2 = value.intValue();
        String str = this.f189843e.f179338f;
        Log.m105924i(str, "itemClickListener curPlayPos:" + intValue2 + " newPos:" + intValue + " singSongName:" + k6Var.f153566a);
        this.f189842d.mo90053n(k6Var, intValue, true);
        this.f189843e.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
