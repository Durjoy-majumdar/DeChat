package p1015o6;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.github.henryye.nativeiv.LegacyBitmap;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p1015o6.C89122c;
import p1024q6.C89483b;
import p1024q6.C89484c;

/* renamed from: o6.b */
public class C89118b {

    /* renamed from: a */
    public Map<BitmapType, C89483b> f256777a = new HashMap(3);

    /* renamed from: b */
    public SparseArray<Map<BitmapType, C89483b>> f256778b = new SparseArray<>();

    /* renamed from: o6.b$a */
    public class C89119a implements C89483b {
        public C89119a(C89118b bVar) {
        }

        /* renamed from: a */
        public boolean mo111042a(InputStream inputStream, Bitmap.Config config, C89484c cVar) {
            return false;
        }

        /* renamed from: b */
        public IBitmap mo111043b() {
            return new C89122c.C89124b();
        }

        public void destroy() {
        }
    }

    /* renamed from: o6.b$b */
    public class C89120b implements C89483b<Bitmap> {
        public C89120b(C89118b bVar) {
        }

        /* renamed from: a */
        public boolean mo111042a(InputStream inputStream, Bitmap.Config config, C89484c cVar) {
            return true;
        }

        /* renamed from: b */
        public IBitmap<Bitmap> mo111043b() {
            return new LegacyBitmap();
        }

        public void destroy() {
        }
    }

    /* renamed from: o6.b$c */
    public class C89121c implements C89483b {
        public C89121c(C89118b bVar) {
        }

        /* renamed from: a */
        public boolean mo111042a(InputStream inputStream, Bitmap.Config config, C89484c cVar) {
            return true;
        }

        /* renamed from: b */
        public IBitmap mo111043b() {
            return new C89122c.C89123a();
        }

        public void destroy() {
        }
    }

    public C89118b() {
        this.f256777a.put(BitmapType.Native, new C89119a(this));
        this.f256777a.put(BitmapType.Legacy, new C89120b(this));
        this.f256777a.put(BitmapType.Undefined, new C89121c(this));
    }

    /* renamed from: a */
    public final IBitmap mo123448a(InputStream inputStream, Bitmap.Config config, C89484c cVar, Map<BitmapType, C89483b> map) {
        BitmapType bitmapType = BitmapType.Native;
        if (map.get(bitmapType).mo111042a(inputStream, config, cVar)) {
            return map.get(bitmapType).mo111043b();
        }
        BitmapType bitmapType2 = BitmapType.Legacy;
        return map.get(bitmapType2).mo111042a(inputStream, config, cVar) ? map.get(bitmapType2).mo111043b() : map.get(BitmapType.Undefined).mo111043b();
    }
}
