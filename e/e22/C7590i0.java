package e22;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.i0 */
public class C7590i0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f25859d;

    public C7590i0(ContactLabelUI contactLabelUI) {
        this.f25859d = contactLabelUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 2) {
            this.f25859d.hideVKB();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
