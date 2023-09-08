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

/* renamed from: qk1.h */
public final class C63217h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63213g f179389d;

    /* renamed from: e */
    public final /* synthetic */ int f179390e;

    /* renamed from: f */
    public final /* synthetic */ C54768h6 f179391f;

    public C63217h(C63213g gVar, int i, C54768h6 h6Var) {
        this.f179389d = gVar;
        this.f179390e = i;
        this.f179391f = h6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f179389d.f179375e;
        Log.m105924i(str, "itemClickListener position:" + this.f179390e + ",descDataList.size:" + this.f179389d.f179378h.size());
        C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> qVar = this.f179389d.f179381n;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            qVar.invoke(view, Integer.valueOf(this.f179390e - this.f179389d.f179378h.size()), this.f179391f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
