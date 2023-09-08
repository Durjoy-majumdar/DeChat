package pj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: pj2.g */
public final class C62326g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62327i f177161d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f177162e;

    /* renamed from: f */
    public final /* synthetic */ C62324e f177163f;

    public C62326g(C62327i iVar, C60905o oVar, C62324e eVar) {
        this.f177161d = iVar;
        this.f177162e = oVar;
        this.f177163f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f177161d.f177165f.invoke(Integer.valueOf(this.f177162e.mo17363j()), this.f177163f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
