package il1;

import ak1.C54116w;
import ak1.C54117x;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p185kq.C10383h;
import rx3.C13598b0;
import z04.C112551y;
import zk1.C66880s0;

/* renamed from: il1.g2 */
public final class C8989g2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8968f2 f28407d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8989g2(C8968f2 f2Var) {
        super(0);
        this.f28407d = f2Var;
    }

    public Object invoke() {
        View view = this.f28407d.f28348a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$hide$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$hide$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f28407d.f28358k == 5) {
            long currentTimeMillis = System.currentTimeMillis() - this.f28407d.f28361n;
            ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
            FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
            String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
            if (E == null) {
                E = "";
            }
            finderBroadcastPageOutStruct.mo1025t(E);
            finderBroadcastPageOutStruct.mo1026u("174");
            finderBroadcastPageOutStruct.mo1024s("174");
            JSONObject jSONObject = new JSONObject();
            C66880s0 a = C54117x.m60830a();
            int i = 1;
            if (a == null || !a.f192141n) {
                i = 0;
            }
            jSONObject.put("is_scan", i);
            jSONObject.put("stayTime", String.valueOf(currentTimeMillis));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …g())\n        }.toString()");
            finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(jSONObject2, ",", ";", false));
            finderBroadcastPageOutStruct.mo86054n();
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + finderBroadcastPageOutStruct.f9773i + ", page_id = " + finderBroadcastPageOutStruct.f9769e + ", commentScene = " + finderBroadcastPageOutStruct.f9777m + ", pg_udf_kv = " + finderBroadcastPageOutStruct.f9776l);
        }
        return C13598b0.f38549a;
    }
}
