package pj2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: pj2.f */
public final class C62325f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62327i f177158d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f177159e;

    /* renamed from: f */
    public final /* synthetic */ C62324e f177160f;

    public C62325f(C62327i iVar, C60905o oVar, C62324e eVar) {
        this.f177158d = iVar;
        this.f177159e = oVar;
        this.f177160f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f177158d.f177166g.invoke(Integer.valueOf(this.f177159e.mo17363j()), this.f177160f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/data/RingtoneConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
