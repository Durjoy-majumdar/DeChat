package yd2;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yd2.h */
public final class C15964h implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C79076g f42860d;

    public C15964h(C79076g gVar) {
        this.f42860d = gVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f42860d.cancel();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
