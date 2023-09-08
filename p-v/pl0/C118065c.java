package pl0;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mapsdk.raster.model.Marker;
import zi0.C91755a;

/* renamed from: pl0.c */
public class C118065c implements C91755a.C91757b {

    /* renamed from: a */
    public final /* synthetic */ float f352950a;

    /* renamed from: b */
    public final /* synthetic */ float f352951b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f352952c;

    /* renamed from: d */
    public final /* synthetic */ String f352953d;

    /* renamed from: e */
    public final /* synthetic */ Marker f352954e;

    /* renamed from: f */
    public final /* synthetic */ FrameLayout f352955f;

    /* renamed from: g */
    public final /* synthetic */ boolean f352956g;

    /* renamed from: h */
    public final /* synthetic */ C118022a f352957h;

    public C118065c(C118022a aVar, float f, float f2, ImageView imageView, String str, Marker marker, FrameLayout frameLayout, boolean z) {
        this.f352957h = aVar;
        this.f352950a = f;
        this.f352951b = f2;
        this.f352952c = imageView;
        this.f352953d = str;
        this.f352954e = marker;
        this.f352955f = frameLayout;
        this.f352956g = z;
    }

    /* renamed from: a */
    public void mo125629a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f352957h.mo182792A0(this.f352950a, this.f352951b, bitmap, this.f352952c);
            this.f352957h.mo182816N0(this.f352953d, this.f352954e, this.f352955f);
            return;
        }
        this.f352957h.mo182812L0(this.f352953d, this.f352954e, this.f352952c, this.f352955f, this.f352956g);
    }
}
