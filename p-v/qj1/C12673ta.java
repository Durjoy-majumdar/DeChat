package qj1;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C50542nh0;
import te3.C64707sc1;

/* renamed from: qj1.ta */
public final class C12673ta extends C87413o implements C32227p<C64707sc1, C50542nh0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12673ta(C12389fa faVar) {
        super(2);
        this.f36304d = faVar;
    }

    public Object invoke(Object obj, Object obj2) {
        FinderContact finderContact;
        C50542nh0 nh02 = (C50542nh0) obj2;
        C87412m.m108594g((C64707sc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            String str = null;
            C58124b.C7172a.m7372a(this.f36304d.f35690p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            C76912y0.makeText(this.f36304d.mo14484z0().getContext(), (CharSequence) this.f36304d.f35665B.getString(C0966R.string.e3x), 0).show();
            String str2 = this.f36304d.f35692q;
            StringBuilder sb = new StringBuilder();
            sb.append("kicked member succ");
            C49765hx0 hx02 = this.f36304d.f35686W;
            if (!(hx02 == null || (finderContact = hx02.f134919d) == null)) {
                str = finderContact.username;
            }
            sb.append(str);
            Log.m105924i(str2, sb.toString());
        } else {
            C76912y0.makeText(this.f36304d.mo14484z0().getContext(), (CharSequence) this.f36304d.f35665B.getString(C0966R.string.e3y), 0).show();
            String str3 = this.f36304d.f35692q;
            Log.m105924i(str3, "kicked member failed:" + nh02.f138603e);
        }
        return C13598b0.f38549a;
    }
}
