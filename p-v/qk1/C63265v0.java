package qk1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63252r0;
import rx3.C13598b0;

/* renamed from: qk1.v0 */
public final class C63265v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63252r0 f179544d;

    /* renamed from: e */
    public final /* synthetic */ int f179545e;

    /* renamed from: f */
    public final /* synthetic */ C63252r0.C63253a f179546f;

    public C63265v0(C63252r0 r0Var, int i, C63252r0.C63253a aVar) {
        this.f179544d = r0Var;
        this.f179545e = i;
        this.f179546f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = this.f179544d.f179490e.get(this.f179545e).f179499b;
        this.f179544d.f179490e.get(this.f179545e).f179499b = !z;
        this.f179544d.f179489d.get(this.f179545e).f179499b = this.f179544d.f179490e.get(this.f179545e).f179499b;
        this.f179546f.f179495B.setChecked(!z);
        C32224a<C13598b0> aVar = this.f179544d.f179491f;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
