package ay0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: ay0.c */
public final class C39648c extends C87413o implements C32228q<String, String, List<? extends C13604l<? extends String, ? extends String>>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MpWebViewController f106404d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39648c(MpWebViewController mpWebViewController) {
        super(3);
        this.f106404d = mpWebViewController;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj2;
        List list = (List) obj3;
        C87412m.m108594g(str, "titles");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(list, "performance");
        MpWebViewController mpWebViewController = this.f106404d;
        mpWebViewController.f117543Q.mo71121c(str, str2, mpWebViewController.f117553a, list);
        return C13598b0.f38549a;
    }
}
