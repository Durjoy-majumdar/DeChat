package wg1;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wg1.w3 */
public final class C15365w3 implements View.OnTouchListener {

    /* renamed from: d */
    public static final C15365w3 f41719d = new C15365w3();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
