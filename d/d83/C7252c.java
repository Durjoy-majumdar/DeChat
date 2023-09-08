package d83;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d83.c */
public final class C7252c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C97448g f25316d;

    public C7252c(C97448g gVar) {
        this.f25316d = gVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f25316d.dismiss();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
