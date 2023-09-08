package xo3;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xo3.e */
public class C78965e implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C78950d f231902d;

    public C78965e(C78950d dVar) {
        this.f231902d = dVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C85975v4.m106304a("SelectableTextHelper", "interceptor onTouch.", new Object[0]);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0 && (x < 0 || x >= this.f231902d.f231839a.getWidth() || y < 0 || y >= this.f231902d.f231839a.getHeight())) {
            C85975v4.m106304a("SelectableTextHelper", "interceptor onTouch, down, outside.", new Object[0]);
            C78950d dVar = this.f231902d;
            dVar.f231844f.postDelayed(dVar.f231835J, 100);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        } else if (motionEvent.getAction() == 4) {
            C85975v4.m106304a("SelectableTextHelper", "interceptor onTouch, outside.", new Object[0]);
            C78950d dVar2 = this.f231902d;
            dVar2.f231844f.postDelayed(dVar2.f231835J, 100);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        } else {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }
}
