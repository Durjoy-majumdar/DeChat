package dz2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import gy3.C87412m;
import p158gt.C76057w;
import pz2.C47729d;

/* renamed from: dz2.l */
public final class C45509l implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ ImageView f123175a;

    /* renamed from: b */
    public final /* synthetic */ C47729d f123176b;

    public C45509l(ImageView imageView, C47729d dVar) {
        this.f123175a = imageView;
        this.f123176b = dVar;
    }

    /* renamed from: a */
    public final void mo25933a(String str, Bitmap bitmap, String str2) {
        if (C87412m.m108589b(this.f123175a.getTag(), this.f123176b)) {
            this.f123175a.setImageBitmap(bitmap);
        }
    }
}
