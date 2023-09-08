package nw1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nw1.k */
public final class C11291k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33227d;

    public C11291k(ImageCropUI imageCropUI) {
        this.f33227d = imageCropUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("ImageCropReport", "inc: " + 9);
        C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
        this.f33227d.finish();
        return true;
    }
}
