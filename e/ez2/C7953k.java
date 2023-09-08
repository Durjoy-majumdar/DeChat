package ez2;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ez2.k */
public final class C7953k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C7954m f26639d;

    public C7953k(C7954m mVar) {
        this.f26639d = mVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean onTouchEvent = view instanceof RecyclerView ? this.f26639d.onTouchEvent(motionEvent) : false;
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
