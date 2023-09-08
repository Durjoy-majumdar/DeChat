package ao1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: ao1.v */
public final class C0186v implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ View f650d;

    /* renamed from: e */
    public final /* synthetic */ C54277t f651e;

    public C0186v(View view, C54277t tVar) {
        this.f650d = view;
        this.f651e = tVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostEditUIC$setOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (C87412m.m108589b(view, this.f650d)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ((ScrollView) ((C36570n) this.f651e.f152354v).getValue()).requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                ((ScrollView) ((C36570n) this.f651e.f152354v).getValue()).requestDisallowInterceptTouchEvent(false);
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/post/PostEditUIC$setOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
