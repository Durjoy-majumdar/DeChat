package ac3;

import ac3.C103355g1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import p206nj.C88957l;
import p564iq.C87790d;
import qr3.C36070f;
import rx3.C13598b0;

/* renamed from: ac3.k1 */
public final class C103364k1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public static final C103364k1 f304831d = new C103364k1();

    public C103364k1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Class cls = C87790d.class;
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C103367l1.m137008a();
        Log.m105924i("MicroMsg.XLabEffectUtil", "start load " + str);
        C103355g1.C103357b bVar = C103355g1.f304769J;
        if (((C87790d) C86312j.m106911c(cls)).isInstalled("xlab")) {
            boolean R0 = ((C87790d) C86312j.m106911c(cls)).mo122034R0(str);
            if (!R0) {
                try {
                    Log.m105928w("MicroMsg.XLabEffectUtil", "IExpansionsService load " + str + " failed");
                    C88957l.m111078n(str);
                    R0 = true;
                } catch (Error unused) {
                    boolean z = C103367l1.f304841a;
                    Log.m105928w("MicroMsg.XLabEffectUtil", "LoadLibrary " + str + " fail");
                }
            }
            if (R0) {
                C103367l1.f304842b.remove(str);
            } else {
                C103367l1.f304842b.add(str);
            }
            boolean z2 = C36070f.f96151a;
            HashSet<String> hashSet = C103367l1.f304842b;
            C36070f.f96151a = hashSet.isEmpty();
            Log.m105924i("MicroMsg.XLabEffectUtil", "end load " + str + ", success " + R0 + ", list: " + hashSet);
        } else {
            C36070f.f96151a = false;
            Log.m105924i("MicroMsg.XLabEffectUtil", "load error " + str);
        }
        return C13598b0.f38549a;
    }
}
