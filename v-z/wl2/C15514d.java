package wl2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: wl2.d */
public final class C15514d implements C15520i<C15513c> {

    /* renamed from: a */
    public final C13601g f42057a = C36568h.m40985a(C15515a.f42058d);

    /* renamed from: wl2.d$a */
    public static final class C15515a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C15515a f42058d = new C15515a();

        public C15515a() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            int i = 1166400;
            int Qe = hVar != null ? hVar.mo58779Qe(C32735h.C32737c.clicfg_scan_code_image_max_size, 1166400) : 1166400;
            if (Qe <= 2332800 && Qe >= 518400) {
                i = Qe;
            }
            Log.m105924i("MicroMsg.ScanCodeImageCompressStrategy", "scanCodeMaxImageSize: " + i);
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public int mo12981a(Object obj, int i, int i2) {
        C87412m.m108594g((C15513c) obj, "request");
        float intValue = ((float) (i * i2)) / ((float) ((Number) ((C36570n) this.f42057a).getValue()).intValue());
        if (intValue > 1.0f) {
            return (int) ((float) Math.ceil((double) ((float) Math.sqrt((double) intValue))));
        }
        return 1;
    }

    /* renamed from: b */
    public Bitmap mo12982b(Object obj, Bitmap bitmap) {
        C15513c cVar = (C15513c) obj;
        C87412m.m108594g(cVar, "request");
        if (bitmap == null || bitmap.isRecycled() || !cVar.f42056c) {
            return bitmap;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(cVar.f42059a);
        if (exifOrientation != 90 && exifOrientation != 270) {
            return bitmap;
        }
        Log.m105925i("MicroMsg.ScanCodeImageCompressStrategy", "onTransform needRotate: %d", Integer.valueOf(exifOrientation));
        return BitmapUtil.rotate(bitmap, (float) exifOrientation);
    }

    /* renamed from: c */
    public boolean mo12983c(int i, int i2) {
        if (i >= 4 && i2 >= 4) {
            return true;
        }
        Log.m105928w("MicroMsg.ScanCodeImageCompressStrategy", "isSizeValid invalid width: " + i + ", height: " + i2);
        return false;
    }

    public String name() {
        return "MicroMsg.ScanCodeImageCompressStrategy";
    }
}
