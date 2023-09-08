package iw1;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.picker.GalleryPickerFragment;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: iw1.b */
public final class C9260b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GalleryPickerFragment f29010d;

    public C9260b(GalleryPickerFragment galleryPickerFragment) {
        this.f29010d = galleryPickerFragment;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/picker/GalleryPickerFragment$initGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GalleryPickerFragment galleryPickerFragment = this.f29010d;
        galleryPickerFragment.f162774g = !galleryPickerFragment.f162774g;
        throw null;
    }
}
