package nj3;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nj3.h1 */
public class C47266h1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WxImageView f126890d;

    public C47266h1(WxImageView wxImageView) {
        this.f126890d = wxImageView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/WxImageView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
            Log.m105925i("MicroMsg.WxImageView", "alvinluo WxImageView get touchCoordinate touch x: %s, y: %s", Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            WxImageView wxImageView = this.f126890d;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int i = WxImageView.f348324x0;
            wxImageView.getClass();
            PointF h = wxImageView.mo26070h(new PointF(rawX, rawY));
            if (h != null) {
                c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(h.x));
                c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(h.y));
            } else {
                Log.m105920e("MicroMsg.WxImageView", "alvinluo get touchCoordinate is invalid");
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/base/WxImageView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
