package vi1;

import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C64707sc1;
import wi1.C53177i;

/* renamed from: vi1.m */
public final class C52930m extends C87413o implements C32227p<C64707sc1, C50542nh0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52931n f147779d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f147780e;

    /* renamed from: f */
    public final /* synthetic */ C53177i f147781f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52930m(C52931n nVar, ViewGroup viewGroup, C53177i iVar) {
        super(2);
        this.f147779d = nVar;
        this.f147780e = viewGroup;
        this.f147781f = iVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C50542nh0 nh02 = (C50542nh0) obj2;
        C87412m.m108594g((C64707sc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            C58124b.C7172a.m7372a(this.f147779d.f147782p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            C76912y0.makeText(this.f147780e.getContext(), (CharSequence) this.f147780e.getContext().getResources().getString(C0966R.string.e3x), 0).show();
            Log.m105924i("MicIntercomPlugin", "kicked member succ" + this.f147781f.f148359a.f106359c);
        } else {
            C76912y0.makeText(this.f147780e.getContext(), (CharSequence) this.f147780e.getContext().getResources().getString(C0966R.string.e3y), 0).show();
            Log.m105924i("MicIntercomPlugin", "kicked member failed:" + nh02.f138603e);
        }
        return C13598b0.f38549a;
    }
}
