package bt1;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58408t0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import p707tz.C65000f;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: bt1.v */
public final class C54589v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153075d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54589v(C54585t tVar) {
        super(0);
        this.f153075d = tVar;
    }

    public Object invoke() {
        String str;
        ArrayList<String> arrayList = this.f153075d.f153057m;
        if (!(arrayList == null || (str = (String) C110818d0.m150916N(arrayList)) == null)) {
            String i3 = ((C65000f) C86312j.m106911c(C65000f.class)).mo89193i3(str);
            Log.m105924i("Finder.FinderPostReportLogic", "setColorSpace " + i3);
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.originColorSpace = i3;
            }
        }
        return C13598b0.f38549a;
    }
}
