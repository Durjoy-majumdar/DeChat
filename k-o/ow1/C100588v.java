package ow1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ow1.v */
public class C100588v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f294724d;

    /* renamed from: e */
    public final /* synthetic */ ImagePreviewUI f294725e;

    public C100588v(ImagePreviewUI imagePreviewUI, int i) {
        this.f294725e = imagePreviewUI;
        this.f294724d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f294725e.f271411f;
        int i = this.f294724d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$26", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$26", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
