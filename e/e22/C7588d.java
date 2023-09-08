package e22;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.d */
public final class C7588d implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f25857d;

    public C7588d(ContactEditLabel contactEditLabel) {
        this.f25857d = contactEditLabel;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f25857d.hideVKB();
            this.f25857d.f198448B = (int) motionEvent.getRawX();
            this.f25857d.f198449C = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
