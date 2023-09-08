package kf1;

import ak1.C0073g0;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: kf1.k5 */
public final class C9826k5 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ FinderItem f30376a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f30377b;

    public C9826k5(FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar) {
        this.f30376a = finderItem;
        this.f30377b = lVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_SHARE;
        Class cls = C8777j5.class;
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "";
        if (i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            C7888v2.C7889a aVar = C7888v2.f26513a;
            aVar.getClass();
            Log.m105924i(C7888v2.C7889a.f26515b, "share finderObject " + this.f30376a.getId() + " to " + arrayList);
            aVar.mo9003E(arrayList);
            if (!arrayList.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    str = str + it.next() + ';';
                }
                if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                    str = str.substring(0, str.length() - 1);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONObject.put("1", str);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                C7888v2.f26513a.mo9021u(this.f30376a);
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("3", str);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, jSONObject2.toString(), (String) null, 4, (Object) null);
        }
        C32226l<List<String>, C13598b0> lVar = this.f30377b;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}
