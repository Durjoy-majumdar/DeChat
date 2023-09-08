package km1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: km1.a */
public final class C61110a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173984d;

    public C61110a(C61117j jVar) {
        this.f173984d = jVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "attachFloatView onTouch");
        C61117j.m71671a(this.f173984d);
        RelativeLayout relativeLayout = this.f173984d.f173998h;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener((View.OnTouchListener) null);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
