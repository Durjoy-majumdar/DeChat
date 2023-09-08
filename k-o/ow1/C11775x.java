package ow1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ow1.x */
public class C11775x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f34466d;

    public C11775x(SmartGalleryUI smartGalleryUI) {
        this.f34466d = smartGalleryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (Util.isNullOrNil((CharSequence) this.f34466d.f271478e.getText())) {
            SmartGalleryUI smartGalleryUI = this.f34466d;
            smartGalleryUI.setResult(-2, smartGalleryUI.getIntent().putExtra("send_raw_img", this.f34466d.f271492v));
            this.f34466d.finish();
        } else {
            this.f34466d.f271478e.setText("");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
