package ve1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0727e0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.y2 */
public final class C14698y2 extends C60896i<C0727e0> {

    /* renamed from: e */
    public final int f40646e;

    /* renamed from: f */
    public final String f40647f = "FinderFeedLiveListItemConvert";

    public C14698y2(int i) {
        this.f40646e = i;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ab5;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0727e0 e0Var = (C0727e0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(e0Var, "item");
        String str = this.f40647f;
        Log.m105924i(str, "[updateLiveList]onBindViewHolder holder:" + oVar + " tabType:" + this.f40646e + ",position:" + i + ",type:" + i2 + ',' + e0Var);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
