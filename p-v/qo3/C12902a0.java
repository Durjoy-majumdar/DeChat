package qo3;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.a0 */
public class C12902a0 implements View.OnTouchListener {

    /* renamed from: d */
    public boolean f36885d = false;

    /* renamed from: e */
    public final /* synthetic */ ViewParent f36886e;

    /* renamed from: f */
    public final /* synthetic */ C12925w f36887f;

    public C12902a0(C12925w wVar, ViewParent viewParent) {
        this.f36887f = wVar;
        this.f36886e = viewParent;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f36886e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f36885d = true;
        } else if (action == 1) {
            if (this.f36885d) {
                this.f36887f.mo5085n();
            }
            this.f36885d = false;
        } else if (action == 3) {
            this.f36885d = false;
        }
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
