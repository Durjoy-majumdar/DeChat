package bx0;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bx0.a */
public class C0388a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C39845c f990d;

    public C0388a(C39845c cVar) {
        this.f990d = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/box/ui/BoxDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f990d.dismiss();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/box/ui/BoxDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
