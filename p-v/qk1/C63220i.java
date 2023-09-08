package qk1;

import android.view.View;
import cj1.C54768h6;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qk1.i */
public final class C63220i implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63213g f179397d;

    /* renamed from: e */
    public final /* synthetic */ int f179398e;

    /* renamed from: f */
    public final /* synthetic */ C54768h6 f179399f;

    public C63220i(C63213g gVar, int i, C54768h6 h6Var) {
        this.f179397d = gVar;
        this.f179398e = i;
        this.f179399f = h6Var;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        String str = this.f179397d.f179375e;
        Log.m105924i(str, "onLongClickListener position:" + this.f179398e + ",descDataList.size:" + this.f179397d.f179378h.size());
        C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> qVar = this.f179397d.f179382o;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            qVar.invoke(view, Integer.valueOf(this.f179398e - this.f179397d.f179378h.size()), this.f179399f);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
