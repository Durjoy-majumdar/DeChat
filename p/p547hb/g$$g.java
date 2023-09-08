package p547hb;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.luggage.game.page.C80211b;

/* renamed from: hb.g$$g */
public final /* synthetic */ class g$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80211b f253464d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f253465e;

    /* renamed from: f */
    public final /* synthetic */ boolean f253466f;

    /* renamed from: g */
    public final /* synthetic */ boolean f253467g;

    public /* synthetic */ g$$g(C80211b bVar, Bitmap bitmap, boolean z, boolean z2) {
        this.f253464d = bVar;
        this.f253465e = bitmap;
        this.f253466f = z;
        this.f253467g = z2;
    }

    public final void run() {
        C80211b bVar = this.f253464d;
        Bitmap bitmap = this.f253465e;
        boolean z = this.f253466f;
        boolean z2 = this.f253467g;
        bVar.f234774o = bitmap;
        bVar.f234776q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bVar.mo111259h0(z, z2);
    }
}
