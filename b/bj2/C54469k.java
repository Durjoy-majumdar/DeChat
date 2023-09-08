package bj2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import zb2.C66778l;

/* renamed from: bj2.k */
public final class C54469k extends C53996a<C0294m> {

    /* renamed from: d */
    public final List<Integer> f152733d;

    /* renamed from: bj2.k$a */
    public static final class C0293a extends C87413o implements C32226l<Integer, C0294m> {

        /* renamed from: d */
        public final /* synthetic */ C54469k f859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0293a(C54469k kVar) {
            super(1);
            this.f859d = kVar;
        }

        public Object invoke(Object obj) {
            int intValue = this.f859d.f152733d.get(((Number) obj).intValue()).intValue();
            return new C0294m(intValue, FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue);
        }
    }

    public C54469k(List<Integer> list) {
        C87412m.m108594g(list, "dataList");
        this.f152733d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C0294m>> mo70650e(LifecycleScope lifecycleScope, C53998c<C0294m> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f152733d.size(), cVar, new C0293a(this)));
    }
}
