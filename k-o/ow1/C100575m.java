package ow1;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ow1.m */
public class C100575m implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ ImageFolderMgrView f294673d;

    /* renamed from: ow1.m$a */
    public class C100576a implements Runnable {
        public C100576a() {
        }

        public void run() {
            ImageFolderMgrView imageFolderMgrView = C100575m.this.f294673d;
            imageFolderMgrView.f271357h.mo140031a(imageFolderMgrView.f271362p, imageFolderMgrView.f271361o);
            ImageFolderMgrView imageFolderMgrView2 = C100575m.this.f294673d;
            imageFolderMgrView2.f271362p = null;
            imageFolderMgrView2.f271361o.clear();
            C100575m.this.f294673d.f271357h.notifyDataSetChanged();
        }
    }

    public C100575m(ImageFolderMgrView imageFolderMgrView) {
        this.f294673d = imageFolderMgrView;
    }

    public boolean onPreDraw() {
        Log.m105924i("MicroMsg.ImageFolderMgrView", "onPreDraw.");
        ImageFolderMgrView imageFolderMgrView = this.f294673d;
        if (imageFolderMgrView.f271362p == null && imageFolderMgrView.f271361o.size() <= 0) {
            return true;
        }
        C93958f.m118753m().mo128895c(new C100576a());
        return false;
    }
}
