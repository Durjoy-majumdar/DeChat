package oo1;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;
import oo1.C11614d0;
import te3.C49098d51;

/* renamed from: oo1.o0 */
public final class C11673o0 extends C87413o implements C32226l<C49098d51, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C11614d0.C11618c f34209d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11673o0(C11614d0.C11618c cVar) {
        super(1);
        this.f34209d = cVar;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(Util.isEqual(((C49098d51) obj).f132122h, this.f34209d.f34065a.f132122h));
    }
}
