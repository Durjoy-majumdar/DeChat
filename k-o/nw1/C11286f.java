package nw1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw1.f */
public final class C11286f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33222d;

    public C11286f(ImageCropUI imageCropUI) {
        this.f33222d = imageCropUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("ImageCropReport", "inc: " + 9);
        C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
        this.f33222d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/picker/view/ImageCropUI$initMMView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
