package nw1;

import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import qo3.C89779i0;

/* renamed from: nw1.o */
public final class C11295o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f33234d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f33235e;

    public C11295o(ImageView imageView, ImageCropUI imageCropUI) {
        this.f33234d = imageView;
        this.f33235e = imageCropUI;
    }

    public final void run() {
        if (this.f33234d.getWidth() == 0 || this.f33234d.getHeight() == 0) {
            C74783i3.C6978a a = C74783i3.m89537a((Context) null);
            ImageCropUI.m4582I7(this.f33235e, a.f24704a, a.f24705b);
        } else {
            ImageCropUI.m4582I7(this.f33235e, this.f33234d.getWidth(), this.f33234d.getHeight());
        }
        this.f33234d.setVisibility(0);
        ImageCropUI imageCropUI = this.f33235e;
        imageCropUI.f19121z = true;
        C89779i0 i0Var = imageCropUI.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
