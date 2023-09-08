package gk0;

import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import fy3.C32229r;
import gk0.C87237e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import lp3.C46888b;
import op3.C117882j;
import rx3.C13598b0;
import zq0.C91919w;

/* renamed from: gk0.q */
public final class C87253q extends C87413o implements C32229r<Boolean, String, List<? extends PhoneItem>, C87237e.C87238a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46888b f252963d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87253q(C46888b bVar) {
        super(4);
        this.f252963d = bVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        List list = (List) obj3;
        C87237e.C87238a aVar = (C87237e.C87238a) obj4;
        C87412m.m108594g(str, "errMsg");
        boolean z = false;
        if (!booleanValue) {
            C46888b bVar = this.f252963d;
            if (str.length() == 0) {
                z = true;
            }
            if (z) {
                str = "network request fail";
            }
            bVar.mo72091a(str);
        } else {
            this.f252963d.mo72093c(C117882j.m166284c(C91919w.f263170a.mo125748c(list, (List<PhoneItem>) null), aVar));
        }
        return C13598b0.f38549a;
    }
}
