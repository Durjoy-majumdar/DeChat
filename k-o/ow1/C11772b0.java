package ow1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.p473ui.SmartGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ow1.b0 */
public class C11772b0 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ SmartGalleryUI f34461d;

    public C11772b0(SmartGalleryUI smartGalleryUI) {
        this.f34461d = smartGalleryUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        Log.m105919d("MicroMsg.SmartGalleryUI", "onScrollStateChanged, newState: %d, mIsNeedReset: %s.", Integer.valueOf(i), Boolean.valueOf(this.f34461d.f271490t));
        if (1 == i) {
            SmartGalleryUI smartGalleryUI = this.f34461d;
            if (smartGalleryUI.f271490t) {
                smartGalleryUI.f271490t = false;
                smartGalleryUI.hideVKB();
                this.f34461d.f271478e.clearFocus();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
