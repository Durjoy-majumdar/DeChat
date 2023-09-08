package pj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: pj2.o */
public final class C62333o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62338s f177170d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f177171e;

    /* renamed from: f */
    public final /* synthetic */ C62324e f177172f;

    public C62333o(C62338s sVar, C60905o oVar, C62324e eVar) {
        this.f177170d = sVar;
        this.f177171e = oVar;
        this.f177172f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f177170d.f177184f.invoke(Integer.valueOf(this.f177171e.mo17363j()), this.f177172f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
