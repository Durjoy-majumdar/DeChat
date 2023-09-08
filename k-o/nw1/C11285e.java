package nw1;

import android.view.View;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;

/* renamed from: nw1.e */
public final class C11285e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f33220d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f33221e;

    public C11285e(View view, ImageCropUI imageCropUI) {
        this.f33220d = view;
        this.f33221e = imageCropUI;
    }

    public final void run() {
        this.f33220d.setPadding(0, 0, 0, C75044y4.m89991c(this.f33221e.getContext()));
    }
}
