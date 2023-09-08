package com.tencent.p014mm.plugin.gallery.p473ui;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.gallery.ui.l */
public class C94069l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageFolderMgrView f271607d;

    public C94069l(ImageFolderMgrView imageFolderMgrView) {
        this.f271607d = imageFolderMgrView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageFolderMgrView.C94004c cVar = this.f271607d.f271364r;
        if (cVar != null) {
            C94056d dVar = (C94056d) cVar;
            ImageFolderMgrView imageFolderMgrView = dVar.f271571a.f271303p;
            if (imageFolderMgrView != null && imageFolderMgrView.f271358i) {
                imageFolderMgrView.mo128973b();
                dVar.f271571a.playActionBarOperationAreaAnim();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
