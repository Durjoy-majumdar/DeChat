package ow1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ow1.y */
public class C11776y implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f34467d;

    public C11776y(SmartGalleryUI smartGalleryUI) {
        this.f34467d = smartGalleryUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SmartGalleryUI smartGalleryUI = this.f34467d;
        if (!smartGalleryUI.f271490t) {
            smartGalleryUI.f271490t = true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
