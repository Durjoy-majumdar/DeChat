package ve1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.d */
public final class C14487d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14533h f40166d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40167e;

    /* renamed from: f */
    public final /* synthetic */ long f40168f;

    public C14487d(C14533h hVar, C60905o oVar, long j) {
        this.f40166d = hVar;
        this.f40167e = oVar;
        this.f40168f = j;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14533h.m13852j(this.f40166d, this.f40167e, true, this.f40168f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
