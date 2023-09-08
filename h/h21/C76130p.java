package h21;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: h21.p */
public class C76130p implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223045d;

    public C76130p(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223045d = collectCreateQRCodeNewUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectCreateQRCodeNewUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f223045d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/collect/ui/CollectCreateQRCodeNewUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
