package nb2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import sb2.C63756e;

/* renamed from: nb2.z */
public final class C61674z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175367d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f175368e;

    /* renamed from: f */
    public final /* synthetic */ C63756e f175369f;

    public C61674z(C61647e eVar, C60905o oVar, C63756e eVar2) {
        this.f175367d = eVar;
        this.f175368e = oVar;
        this.f175369f = eVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f175367d.mo86588k(this.f175368e, this.f175369f, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
