package ce1;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C51270sn1;

/* renamed from: ce1.k */
public final class C0474k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0465g f1160d;

    /* renamed from: e */
    public final /* synthetic */ FinderContact f1161e;

    public C0474k(C0465g gVar, FinderContact finderContact) {
        this.f1160d = gVar;
        this.f1161e = finderContact;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0465g gVar = this.f1160d;
        String str = this.f1161e.username;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, 2);
        C13598b0 b0Var = C13598b0.f38549a;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply { put(\"source\", 2) }.toString()");
        C51270sn1 sn12 = (C51270sn1) this.f1160d.f33564d;
        gVar.mo516l3(str2, jSONObject2, sn12 != null ? sn12.f141633w : null, "link_editnote_avatar_profile", 1, 2, 131);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
