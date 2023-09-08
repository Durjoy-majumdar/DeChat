package cl1;

import al1.C54130j;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: cl1.r0 */
public final class C54998r0 extends C87413o implements C32226l<C54130j, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f154408d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54998r0(String str) {
        super(1);
        this.f154408d = str;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(Util.isEqual(((C54130j) obj).f152002f, this.f154408d));
    }
}
