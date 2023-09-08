package iw1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.picker.GalleryPickerFragment;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: iw1.d */
public final class C9261d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GalleryPickerFragment f29011d;

    public C9261d(GalleryPickerFragment galleryPickerFragment) {
        this.f29011d = galleryPickerFragment;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/GalleryPickerFragment$initPreviewContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f29011d.getClass();
        C87412m.m108603p("appBarLayout");
        throw null;
    }
}
