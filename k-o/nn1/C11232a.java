package nn1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58391n;
import gy3.C87412m;
import org.json.JSONObject;
import qt1.C12932c;

/* renamed from: nn1.a */
public final class C11232a extends C12932c {

    /* renamed from: e */
    public int f33099e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11232a(String str) {
        super(str);
        C87412m.m108594g(str, "traceName");
    }

    /* renamed from: b */
    public void mo11310b(String str) {
        C87412m.m108594g(str, "node");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.mo11310b(str);
        C58391n nVar = C58391n.f167292a;
        nVar.mo83229e(this.f33099e);
        int i = this.f33099e;
        JSONObject d = mo12483d();
        nVar.getClass();
        C58391n.C58392a c = nVar.mo83227c(i, false);
        if (c != null) {
            c.f167301g = d;
        }
        Log.m105924i("NearbyHomeTimeConsumingTrace", "time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
