package kf1;

import al1.C54130j;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;

/* renamed from: kf1.q4 */
public final class C61057q4 extends C87413o implements C32226l<String, C54130j> {

    /* renamed from: d */
    public final /* synthetic */ HashMap<String, C54130j> f173891d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61057q4(HashMap<String, C54130j> hashMap) {
        super(1);
        this.f173891d = hashMap;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return this.f173891d.get(str);
    }
}
