package rf2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rf2.c */
public final class C12994c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f37052d;

    public C12994c(WeImageView weImageView) {
        this.f37052d = weImageView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f37052d.setIconColor(MMApplicationContext.getColor(C0966R.color.f3613qu));
        } else if (action == 1 || action == 3) {
            this.f37052d.setIconColor(MMApplicationContext.getColor(C0966R.color.f3611qs));
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
