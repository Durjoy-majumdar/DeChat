package pp3;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C75056b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.c0 */
public final class C77134c0 extends C87413o implements C32226l<C75056b, C13598b0> {

    /* renamed from: d */
    public static final C77134c0 f225243d = new C77134c0();

    public C77134c0() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75056b bVar = (C75056b) obj;
        C87412m.m108594g(bVar, "$this$category");
        MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
        bVar.mo104645a("finder", new int[]{1, 0, 4}, new C77227q(singleDefault));
        bVar.mo104645a("finder_page", new int[]{1, 0, 4}, new C77241s(singleDefault));
        bVar.mo104645a(WeChatBrands.Business.GROUP_LIVE, new int[]{1, 0, 4}, new C77252u(singleDefault));
        bVar.mo104645a("live_replay", new int[]{1, 0, 4}, new C77264w(singleDefault));
        bVar.mo104645a("finderposting", new int[]{1, 0}, C77270x.f225382d);
        bVar.mo104645a("MaasPersist", new int[]{0}, C77276y.f225388d);
        bVar.mo104645a("MaasCache", new int[]{0}, C77282z.f225394d);
        bVar.mo104645a("MaasWarmUpRes", new int[]{0}, C77120a0.f225229d);
        bVar.mo104645a("maas_music_demo_resource", new int[0], C77127b0.f225236d);
        return C13598b0.f38549a;
    }
}
