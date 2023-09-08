package kf1;

import al1.C54130j;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;

/* renamed from: kf1.r4 */
public final class C61061r4 extends C87413o implements C32226l<String, C54130j> {

    /* renamed from: d */
    public final /* synthetic */ HashMap<String, C54130j> f173899d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61061r4(HashMap<String, C54130j> hashMap) {
        super(1);
        this.f173899d = hashMap;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return this.f173899d.get(str);
    }
}
