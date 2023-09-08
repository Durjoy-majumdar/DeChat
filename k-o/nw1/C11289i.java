package nw1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw1.i */
public final class C11289i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33225d;

    public C11289i(ImageCropUI imageCropUI) {
        this.f33225d = imageCropUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageCropUI imageCropUI = this.f33225d;
        int i = ImageCropUI.f19098D;
        imageCropUI.mo5346J7().mo150023h();
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
