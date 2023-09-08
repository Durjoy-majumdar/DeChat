package dz2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import gy3.C87412m;
import p158gt.C76057w;
import pz2.C47727b;

/* renamed from: dz2.e */
public final class C45504e implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ ImageView f123166a;

    /* renamed from: b */
    public final /* synthetic */ C47727b f123167b;

    public C45504e(ImageView imageView, C47727b bVar) {
        this.f123166a = imageView;
        this.f123167b = bVar;
    }

    /* renamed from: a */
    public final void mo25933a(String str, Bitmap bitmap, String str2) {
        if (C87412m.m108589b(this.f123166a.getTag(), this.f123167b)) {
            this.f123166a.setImageBitmap(bitmap);
        }
    }
}
