package p858ng;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ng.p */
public final class C61717p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AlbumGalleryUIC f175420d;

    /* renamed from: e */
    public final /* synthetic */ long f175421e;

    /* renamed from: f */
    public final /* synthetic */ long f175422f;

    /* renamed from: g */
    public final /* synthetic */ boolean f175423g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61717p(AlbumGalleryUIC albumGalleryUIC, long j, long j2, boolean z) {
        super(0);
        this.f175420d = albumGalleryUIC;
        this.f175421e = j;
        this.f175422f = j2;
        this.f175423g = z;
    }

    public Object invoke() {
        this.f175420d.mo76192j3().mo90689b().setVisibility(8);
        int i = 0;
        this.f175420d.mo76192j3().mo90690c().setVisibility(0);
        long j = this.f175421e;
        int i2 = 100;
        if (j != 0) {
            i = (int) ((((float) this.f175422f) / ((float) j)) * ((float) 100));
        }
        if (i < 0 || i <= 100) {
            i2 = i;
        }
        Button c = this.f175420d.mo76192j3().mo90690c();
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append('%');
        c.setText(sb.toString());
        if (!this.f175423g) {
            this.f175420d.mo76192j3().mo90690c().setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        return C13598b0.f38549a;
    }
}
