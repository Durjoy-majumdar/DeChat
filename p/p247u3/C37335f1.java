package p247u3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import p247u3.C65035c1;

/* renamed from: u3.f1 */
public final class C37335f1 extends C87413o implements C32226l<WeakReference<C65035c1.C65037b>, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C65035c1.C65037b f98733d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37335f1(C65035c1.C65037b bVar) {
        super(1);
        this.f98733d = bVar;
    }

    public Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        C87412m.m108594g(weakReference, LocaleUtil.ITALIAN);
        return Boolean.valueOf(weakReference.get() == null || ((C65035c1.C65037b) weakReference.get()) == this.f98733d);
    }
}
