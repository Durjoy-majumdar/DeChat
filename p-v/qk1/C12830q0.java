package qk1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C7170j;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C12825p0;
import rx3.C13598b0;

/* renamed from: qk1.q0 */
public final class C12830q0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12825p0.C12826a f36719d;

    /* renamed from: e */
    public final /* synthetic */ C12825p0 f36720e;

    public C12830q0(C12825p0.C12826a aVar, C12825p0 p0Var) {
        this.f36719d = aVar;
        this.f36720e = p0Var;
    }

    public final void onClick(View view) {
        C32226l<? super C7170j, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderLiveDefinitionAdapter", "item click:" + this.f36719d);
        C12825p0.C12826a aVar = this.f36719d;
        if (!aVar.f36713b && (lVar = this.f36720e.f36711e) != null) {
            lVar.invoke(aVar.f36712a);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
