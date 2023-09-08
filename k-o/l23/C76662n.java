package l23;

import android.view.View;
import c23.C67333e;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: l23.n */
public final class C76662n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76663o f224349d;

    /* renamed from: e */
    public final /* synthetic */ int f224350e;

    /* renamed from: f */
    public final /* synthetic */ C67333e f224351f;

    public C76662n(C76663o oVar, int i, C67333e eVar) {
        this.f224349d = oVar;
        this.f224350e = i;
        this.f224351f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MagicPanelAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p<? super Integer, ? super C67333e, C13598b0> pVar = this.f224349d.f224353e;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(this.f224350e), this.f224351f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicPanelAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
