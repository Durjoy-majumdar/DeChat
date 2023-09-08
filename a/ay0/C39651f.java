package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ay0.f */
public final class C39651f extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MpWebViewController f106407d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39651f(MpWebViewController mpWebViewController) {
        super(1);
        this.f106407d = mpWebViewController;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "value");
        String A1 = this.f106407d.mo63662A1();
        Log.m105924i(A1, "onPageAuthOK, jsContent evaluateJavascript cb, ret = " + str + ", view " + this.f106407d.f117553a.getRandomStr());
        return C13598b0.f38549a;
    }
}
