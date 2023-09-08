package p165hr;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Result;
import ob0.C89132b;
import p165hr.C60106t;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50397mg0;
import te3.C51533ue1;
import te3.C64273c21;
import wx3.C15601d;

/* renamed from: hr.b0 */
public final class C8711b0 extends C87413o implements C32226l<C89132b.C89134c<C50397mg0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f27941d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C60106t.C8714a> f27942e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8711b0(String str, C15601d<? super C60106t.C8714a> dVar) {
        super(1);
        this.f27941d = str;
        this.f27942e = dVar;
    }

    public Object invoke(Object obj) {
        LinkedList<C51533ue1> linkedList;
        C51533ue1 ue12;
        C64273c21 c212;
        LinkedList<Integer> linkedList2;
        Integer num;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("#requestAndRefreshActivityIcon errType:");
        Integer num2 = null;
        sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
        sb.append(" errCode:");
        if (cVar != null) {
            num2 = Integer.valueOf(cVar.f256794b);
        }
        sb.append(num2);
        sb.append(" feedId:");
        sb.append(this.f27941d);
        Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
        int i = 0;
        if (cVar != null && cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50397mg0 mg02 = (C50397mg0) cVar.f256796d;
            int intValue = (mg02 == null || (linkedList = mg02.f138011d) == null || (ue12 = (C51533ue1) C110818d0.m150917O(linkedList, 0)) == null || (c212 = ue12.f142798e) == null || (linkedList2 = c212.f182368N) == null || (num = (Integer) C110818d0.m150917O(linkedList2, 0)) == null) ? 0 : num.intValue();
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "#requestAndRefreshActivityIcon actType=" + intValue);
            C15601d<C60106t.C8714a> dVar = this.f27942e;
            C50397mg0 mg03 = (C50397mg0) cVar.f256796d;
            if (mg03 != null) {
                i = mg03.f138013f;
            }
            dVar.resumeWith(Result.m168114constructorimpl(new C60106t.C8714a(i, intValue)));
        } else {
            this.f27942e.resumeWith(Result.m168114constructorimpl(new C60106t.C8714a(0, 0)));
        }
        return C13598b0.f38549a;
    }
}
