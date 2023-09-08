package fl1;

import al1.C54130j;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: fl1.m2 */
public final class C8117m2 extends C87413o implements C32226l<C54130j, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f26977d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8117m2(String str) {
        super(1);
        this.f26977d = str;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(Util.isEqual(((C54130j) obj).f151997a, this.f26977d));
    }
}
