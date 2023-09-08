package nb2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: nb2.s */
public final class C61665s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175342d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f175343e;

    /* renamed from: f */
    public final /* synthetic */ C61646d f175344f;

    public C61665s(C61647e eVar, C60905o oVar, C61646d dVar) {
        this.f175342d = eVar;
        this.f175343e = oVar;
        this.f175344f = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61647e.m72365j(this.f175342d, this.f175343e, this.f175344f, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
