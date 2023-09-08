package lh1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: lh1.n */
public final class C10526n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f31793d;

    public C10526n(C32224a<C13598b0> aVar) {
        this.f31793d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$render$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f31793d.invoke();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 3);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…\n            }.toString()");
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$render$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
