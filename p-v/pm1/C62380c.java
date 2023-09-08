package pm1;

import android.view.MotionEvent;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pm1.c */
public final class C62380c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C62381d f177281d;

    public C62380c(C62381d dVar) {
        this.f177281d = dVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C62399p pVar = this.f177281d.f177302r;
        if (pVar != null) {
            C87412m.m108593f(motionEvent, "p1");
            if (motionEvent.getAction() == 0 && pVar.f177359h) {
                pVar.f177360i = true;
                pVar.f177361j = motionEvent;
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
