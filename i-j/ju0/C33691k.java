package ju0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import my3.C61594j;
import sx3.C110818d0;
import z04.C112550d0;
import z04.C66731x;

/* renamed from: ju0.k */
public final class C33691k implements C86016v1 {

    /* renamed from: a */
    public final /* synthetic */ C61594j f91144a;

    public C33691k(C61594j jVar) {
        this.f91144a = jVar;
    }

    public final boolean accept(C86009m1 m1Var, String str) {
        C87412m.m108594g(str, "name");
        List T = C112550d0.m153784T(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (2 > T.size() || !C87412m.m108589b("png", C110818d0.m150923U(T))) {
            Log.m105928w("MicroMsg.AppBrand.StickerApplyAdapterCoreLogic", "copyStickerItemResourcesIfNeed, invalid res: " + str);
            return false;
        }
        List T2 = C112550d0.m153784T((CharSequence) T.get(0), new char[]{'_'}, false, 0, 6, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("copyStickerItemResourcesIfNeed, nameList2: ");
        Object[] array = T2.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String arrays = Arrays.toString(array);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        Log.m105918d("MicroMsg.AppBrand.StickerApplyAdapterCoreLogic", sb.toString());
        if (2 > T2.size()) {
            Log.m105928w("MicroMsg.AppBrand.StickerApplyAdapterCoreLogic", "copyStickerItemResourcesIfNeed, invalid res: " + str);
            return false;
        }
        C61594j jVar = this.f91144a;
        Integer e = C66731x.m78731e((String) C110818d0.m150923U(T2));
        return e != null && jVar.mo86532k(e.intValue());
    }
}
