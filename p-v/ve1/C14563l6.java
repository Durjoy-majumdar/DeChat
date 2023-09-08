package ve1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ve1.l6 */
public final class C14563l6 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f40352d;

    public C14563l6(TextView textView) {
        this.f40352d = textView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderMsgSysMsgConvert$onBindViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f40352d.setVisibility(8);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/convert/FinderMsgSysMsgConvert$onBindViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
