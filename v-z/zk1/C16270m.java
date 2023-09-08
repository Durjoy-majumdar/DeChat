package zk1;

import android.webkit.ValueCallback;
import android.widget.TextView;
import c30.C104289g;
import c30.C26827e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rx3.C36570n;
import zk1.C16229h;

/* renamed from: zk1.m */
public final class C16270m<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C16229h f43560a;

    public C16270m(C16229h hVar) {
        this.f43560a = hVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        String str2 = this.f43560a.f43483d;
        Log.m105924i(str2, "#goMiniApp callback=" + str);
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            String str3 = null;
            this.f43560a.f43466H = null;
            C26827e l = new C104289g(str).optJSONArray(FirebaseAnalytics.C113379b.COUPON);
            if (l != null) {
                C104289g p = l.optJSONObject(0);
                C16229h hVar = this.f43560a;
                String optString = p.optString("stockId");
                C87412m.m108593f(optString, "targetCoupon.optString(\"stockId\")");
                if (optString.length() <= 0) {
                    z = false;
                }
                if (z) {
                    C16229h.C16230a aVar = new C16229h.C16230a(hVar);
                    String optString2 = p.optString("stockId");
                    C87412m.m108593f(optString2, "targetCoupon.optString(\"stockId\")");
                    aVar.f43503a = optString2;
                    String optString3 = p.optString("stockName");
                    C87412m.m108593f(optString3, "targetCoupon.optString(\"stockName\")");
                    aVar.f43504b = optString3;
                    hVar.f43466H = aVar;
                }
            }
            C16229h hVar2 = this.f43560a;
            if (hVar2.f43466H == null) {
                ((TextView) ((C36570n) hVar2.f43500x).getValue()).setText(hVar2.getActivity().getResources().getString(C0966R.string.mg4));
                return;
            }
            TextView textView = (TextView) ((C36570n) hVar2.f43500x).getValue();
            C16229h.C16230a aVar2 = hVar2.f43466H;
            if (aVar2 != null) {
                str3 = aVar2.f43504b;
            }
            textView.setText(str3);
        }
    }
}
