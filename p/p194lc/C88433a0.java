package p194lc;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: lc.a0 */
public final class C88433a0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f255439d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88433a0(LinkedList<String> linkedList) {
        super(1);
        this.f255439d = linkedList;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        this.f255439d.add(LaunchParcel.m102355a(C81412d0.m99875i(str)));
        return C13598b0.f38549a;
    }
}
