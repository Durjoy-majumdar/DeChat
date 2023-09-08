package gk0;

import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gk0.C87237e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import lp3.C46888b;
import op3.C117882j;
import rx3.C13598b0;
import zq0.C91919w;

/* renamed from: gk0.f */
public final class C87240f extends C87413o implements C32229r<Boolean, String, List<? extends PhoneItem>, C87237e.C87238a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46888b f252931d;

    /* renamed from: e */
    public final /* synthetic */ List<PhoneItem> f252932e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87240f(C46888b bVar, List<PhoneItem> list) {
        super(4);
        this.f252931d = bVar;
        this.f252932e = list;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        List list = (List) obj3;
        C87237e.C87238a aVar = (C87237e.C87238a) obj4;
        C87412m.m108594g(str, "errMsg");
        StringBuilder sb = new StringBuilder();
        sb.append("getPhoneNumber isSuccess:");
        sb.append(booleanValue);
        sb.append(", errMsg:");
        sb.append(str);
        sb.append(", phoneItems:");
        boolean z = false;
        sb.append(list != null ? list.size() : 0);
        Log.m105924i("MicroMsg.JsApiGetPhoneNumberNew", sb.toString());
        if (!booleanValue) {
            C46888b bVar = this.f252931d;
            if (str.length() == 0) {
                z = true;
            }
            if (z) {
                str = "network request fail";
            }
            bVar.mo72091a(str);
        } else {
            this.f252931d.mo72093c(C117882j.m166284c(C91919w.f263170a.mo125748c(list, this.f252932e), aVar));
        }
        return C13598b0.f38549a;
    }
}
