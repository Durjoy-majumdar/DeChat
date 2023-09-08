package rw3;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dl0.C86342c;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import wl2.C15517f;
import wl2.C15520i;

/* renamed from: rw3.a */
public final class C13588a implements C15520i<C15517f> {

    /* renamed from: a */
    public static int f38533a = 11;

    /* renamed from: rw3.a$a */
    public static final class C13589a {
        public C13589a(C8480h hVar) {
        }
    }

    static {
        new C13589a((C8480h) null);
    }

    public C13588a() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_scan_image_word_detect_rate_limit, 0);
        if (10 <= Qe && Qe < 16) {
            f38533a = Qe;
        }
        Log.m105925i("MicroMsg.WordDetectImageCompressStrategy", "alvinluo initWordDetectImageCompressStrategy ratioLimit: %s, config: %s", Integer.valueOf(f38533a), Integer.valueOf(Qe));
    }

    /* renamed from: a */
    public int mo12981a(Object obj, int i, int i2) {
        float f;
        C87412m.m108594g((C15517f) obj, "request");
        int i3 = i < i2 ? i : i2;
        int i4 = i > i2 ? i : i2;
        if (i4 <= i3 * 3) {
            float f2 = (float) i3;
            float f3 = (float) 384;
            f = ((((float) i) * 1.0f) / f2) * f3 * ((((float) i2) * 1.0f) / f2) * f3;
        } else {
            float f4 = (float) i4;
            float f5 = (float) C86342c.CTRL_INDEX;
            f = ((((float) i) * 1.0f) / f4) * f5 * ((((float) i2) * 1.0f) / f4) * f5;
        }
        float f6 = ((float) (i * i2)) / f;
        if (f6 > 1.0f) {
            return (int) ((float) Math.ceil((double) ((float) Math.sqrt((double) f6))));
        }
        return 1;
    }

    /* renamed from: b */
    public Bitmap mo12982b(Object obj, Bitmap bitmap) {
        C87412m.m108594g((C15517f) obj, "request");
        return bitmap;
    }

    /* renamed from: c */
    public boolean mo12983c(int i, int i2) {
        boolean z;
        float f = (((float) i2) * 1.0f) / ((float) i);
        float f2 = (float) f38533a;
        if (f > f2 || f < 1.0f / f2) {
            Log.m105928w("MicroMsg.WordDetectImageCompressStrategy", "isOverRatioLimit ratio invalid " + f);
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public String name() {
        return "MicroMsg.WordDetectImageCompressStrategy";
    }
}
