package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import te3.C64848y91;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$initView$4 */
final class FinderLiveSubTagConstract$ViewCallback$initView$4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSubTagConstract.ViewCallback f160356d;

    public FinderLiveSubTagConstract$ViewCallback$initView$4(FinderLiveSubTagConstract.ViewCallback viewCallback) {
        this.f160356d = viewCallback;
    }

    public final void onClick(View view) {
        C64848y91 y912;
        C64848y91 y913;
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("select live tag finish. lastTag:[");
        C45795b bVar = this.f160356d.f160348e.f160343h;
        if (bVar != null) {
            C64848y91 y914 = ((C54991o) bVar.mo71262a(cls)).f154326i2;
            sb.append(y914 != null ? y914.f186454e : null);
            sb.append('-');
            C45795b bVar2 = this.f160356d.f160348e.f160343h;
            if (bVar2 != null) {
                C64848y91 y915 = ((C54991o) bVar2.mo71262a(cls)).f154326i2;
                sb.append((y915 == null || (y913 = y915.f186456g) == null) ? null : y913.f186454e);
                sb.append("] selectedTag:[");
                C64848y91 y916 = this.f160356d.f160348e.f160344i;
                sb.append(y916 != null ? y916.f186454e : null);
                sb.append('-');
                C64848y91 y917 = this.f160356d.f160348e.f160344i;
                sb.append((y917 == null || (y912 = y917.f186456g) == null) ? null : y912.f186454e);
                sb.append(']');
                Log.m105924i("FinderLiveSubTagConstract.ViewCallback", sb.toString());
                C45795b bVar3 = this.f160356d.f160348e.f160343h;
                if (bVar3 != null) {
                    FinderLiveSubTagConstract.ViewCallback viewCallback = this.f160356d;
                    ((C54991o) bVar3.mo71262a(cls)).f154326i2 = viewCallback.f160348e.f160344i;
                    viewCallback.f160347d.setResult(-1);
                    this.f160356d.f160347d.finish();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("liveData");
                throw null;
            }
            C87412m.m108603p("liveData");
            throw null;
        }
        C87412m.m108603p("liveData");
        throw null;
    }
}
