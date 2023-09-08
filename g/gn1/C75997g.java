package gn1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import j20.C117292a;
import java.util.ArrayList;
import lj3.C46863b;

/* renamed from: gn1.g */
public final class C75997g implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222852d;

    public C75997g(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222852d = nearbyPersonV1UIC;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C46863b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        NearbyPersonV1UIC.C68941a aVar = this.f222852d.f198101n;
        if (!(aVar == null || aVar == null || (bVar = aVar.f198115e) == null)) {
            bVar.mo72073c(motionEvent);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
