package ve1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.f */
public final class C14509f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14533h f40227d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40228e;

    /* renamed from: f */
    public final /* synthetic */ long f40229f;

    public C14509f(C14533h hVar, C60905o oVar, long j) {
        this.f40227d = hVar;
        this.f40228e = oVar;
        this.f40229f = j;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14533h.m13852j(this.f40227d, this.f40228e, false, this.f40229f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
