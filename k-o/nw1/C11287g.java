package nw1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw1.g */
public final class C11287g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33223d;

    public C11287g(ImageCropUI imageCropUI) {
        this.f33223d = imageCropUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageCropUI.m4581H7(this.f33223d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
