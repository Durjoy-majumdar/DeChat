package ya2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: ya2.k */
public final class C15944k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ GestureDetector f42830d;

    public C15944k(GestureDetector gestureDetector) {
        this.f42830d = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z = false;
        if (view instanceof WxRecyclerView) {
            GestureDetector gestureDetector = this.f42830d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, z, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
