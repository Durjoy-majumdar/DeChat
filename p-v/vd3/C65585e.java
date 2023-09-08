package vd3;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.e */
public class C65585e implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ImageView f188719d;

    public C65585e(ImageView imageView) {
        this.f188719d = imageView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        Log.m105919d("MicroMsg.AvatarDrawable", "touch view %s, event %s", view, Integer.valueOf(actionMasked));
        if (actionMasked == 0) {
            if (this.f188719d.getDrawable() != null && (this.f188719d.getDrawable() instanceof C78391d)) {
                ((C78391d) this.f188719d.getDrawable()).f229710s = true;
                this.f188719d.invalidate();
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f188719d.getDrawable() != null && (this.f188719d.getDrawable() instanceof C78391d)) {
            ((C78391d) this.f188719d.getDrawable()).f229710s = false;
            this.f188719d.invalidate();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
