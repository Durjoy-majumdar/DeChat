package com.tencent.p014mm.p136ui.tools;

import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.tools.j0 */
public class C116154j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348606d;

    public C116154j0(CropImageNewUI cropImageNewUI) {
        this.f348606d = cropImageNewUI;
    }

    public void run() {
        if (this.f348606d.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
            this.f348606d.finish();
            return;
        }
        this.f348606d.f348466f.setVisibility(8);
        this.f348606d.f348467g.setVisibility(0);
        ImageView imageView = this.f348606d.f348469i;
        imageView.setVisibility(((Integer) imageView.getTag()).intValue());
        this.f348606d.f348468h.setVisibility(0);
    }
}
