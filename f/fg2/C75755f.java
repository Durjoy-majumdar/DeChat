package fg2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fg2.f */
public final class C75755f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222357d;

    public C75755f(RadarMemberView radarMemberView) {
        this.f222357d = radarMemberView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (view != this.f222357d.getConfirmBtn() && motionEvent.getAction() == 1) {
            if (this.f222357d.getVisibility() == 0) {
                this.f222357d.mo96921c();
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
