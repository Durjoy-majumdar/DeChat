package ow1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ow1.w */
public class C100589w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f294726d;

    /* renamed from: e */
    public final /* synthetic */ ImagePreviewUI f294727e;

    public C100589w(ImagePreviewUI imagePreviewUI, int i) {
        this.f294727e = imagePreviewUI;
        this.f294726d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f294727e.f271411f;
        int i = this.f294726d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$27", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$27", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
