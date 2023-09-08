package ow1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ow1.a0 */
public class C11771a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f34460d;

    public C11771a0(SmartGalleryUI smartGalleryUI) {
        this.f34460d = smartGalleryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SmartGalleryUI smartGalleryUI = this.f34460d;
        int i = SmartGalleryUI.f271476w;
        smartGalleryUI.setResult(1);
        this.f34460d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
