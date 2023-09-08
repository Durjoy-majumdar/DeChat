package rf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import jq3.C60905o;
import pf1.C11920q;
import rx3.C13598b0;

/* renamed from: rf1.d */
public interface C12992d {

    /* renamed from: rf1.d$a */
    public static final class C12993a {
        /* renamed from: a */
        public static /* synthetic */ void m12458a(C12992d dVar, C60905o oVar, View view, C11920q qVar, boolean z, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    aVar = null;
                }
                dVar.mo12507a(oVar, view, qVar, z, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRealHide");
        }

        /* renamed from: b */
        public static /* synthetic */ void m12459b(C12992d dVar, C60905o oVar, View view, C11920q qVar, boolean z, C32224a aVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    aVar = null;
                }
                dVar.mo11081c(oVar, view, qVar, z, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRealShow");
        }
    }

    /* renamed from: a */
    void mo12507a(C60905o oVar, View view, C11920q qVar, boolean z, C32224a<C13598b0> aVar);

    /* renamed from: b */
    void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str);

    /* renamed from: c */
    void mo11081c(C60905o oVar, View view, C11920q qVar, boolean z, C32224a<C13598b0> aVar);
}
