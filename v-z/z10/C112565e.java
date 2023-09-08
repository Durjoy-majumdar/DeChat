package z10;

import android.graphics.Bitmap;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import q00.C110264g;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: z10.e */
public final class C112565e {

    /* renamed from: a */
    public MMHandler f337012a;

    /* renamed from: b */
    public HandlerThread f337013b;

    /* renamed from: c */
    public Handler f337014c;

    /* renamed from: d */
    public HandlerThread f337015d;

    /* renamed from: e */
    public ImageReader f337016e;

    /* renamed from: f */
    public C111742d.C65942b f337017f;

    /* renamed from: g */
    public Bitmap f337018g;

    /* renamed from: h */
    public int f337019h;

    /* renamed from: i */
    public int f337020i;

    /* renamed from: j */
    public C110264g f337021j;

    /* renamed from: k */
    public int f337022k;

    /* renamed from: l */
    public int f337023l;

    /* renamed from: m */
    public final List<C32226l<Bitmap, C13598b0>> f337024m = new ArrayList();

    public C112565e() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("FilterRenderHandlerThread", 5);
        this.f337013b = a;
        a.start();
        this.f337012a = new MMHandler(this.f337013b.getLooper());
    }

    /* renamed from: a */
    public final Bitmap mo164298a() {
        Bitmap bitmap = this.f337018g;
        if (bitmap != null) {
            return bitmap;
        }
        C87412m.m108603p("inputBitmap");
        throw null;
    }
}
