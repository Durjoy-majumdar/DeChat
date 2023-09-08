package p247u3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import p247u3.C65035c1;

/* renamed from: u3.e1 */
public final class C14112e1 extends C87413o implements C32226l<WeakReference<C65035c1.C65037b>, Boolean> {

    /* renamed from: d */
    public static final C14112e1 f39511d = new C14112e1();

    public C14112e1() {
        super(1);
    }

    public Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        C87412m.m108594g(weakReference, LocaleUtil.ITALIAN);
        return Boolean.valueOf(weakReference.get() == null);
    }
}
