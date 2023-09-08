package p669qw;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.recordvideo.p095ui.FakeVideoViewLayer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.Set;
import p232rw.C48089i;
import wh2.C102445a;
import zg2.C53784a;
import zg2.C53789d;

@C86522b
/* renamed from: qw.a */
public final class C47886a extends C86301e implements C48089i {
    /* renamed from: UA */
    public void mo72633UA(int i, C53789d dVar) {
        C87412m.m108594g(dVar, "callback");
        C53784a aVar = C53784a.f150949a;
        SparseArray<Set<C53789d>> sparseArray = C53784a.f150950b;
        Set set = sparseArray.get(i);
        if (set == null) {
            set = new LinkedHashSet();
            sparseArray.put(i, set);
        }
        set.add(dVar);
    }

    /* renamed from: n7 */
    public C102445a mo72634n7(Context context) {
        C53784a aVar = C53784a.f150949a;
        if (context != null) {
            return new FakeVideoViewLayer(context);
        }
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108593f(context2, "getContext()");
        return new FakeVideoViewLayer(context2);
    }
}
