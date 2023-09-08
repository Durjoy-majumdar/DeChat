package p1015o6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p1019p6.C89314a;
import p1024q6.C89483b;
import p1024q6.C89484c;
import p1024q6.C89485d;
import p1037t6.C90376b;
import p1037t6.C90377c;
import p673r6.C89876b;

/* renamed from: o6.c */
public class C89122c {

    /* renamed from: f */
    public static final Object f256779f = new Object();

    /* renamed from: a */
    public BitmapType f256780a = null;

    /* renamed from: b */
    public IBitmap f256781b = new C89123a();

    /* renamed from: c */
    public IImageDecodeService.C80188b f256782c;

    /* renamed from: d */
    public C89314a f256783d;

    /* renamed from: e */
    public C89118b f256784e;

    /* renamed from: o6.c$a */
    public static class C89123a implements IBitmap<Object> {
        public void decodeInputStream(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
            throw new IOException("Stub");
        }

        public long getDecodeTime() {
            return 0;
        }

        public BitmapType getType() {
            return BitmapType.Undefined;
        }

        public Object provide() {
            return null;
        }

        public void recycle() {
        }
    }

    /* renamed from: o6.c$b */
    public static class C89124b implements IBitmap<NativeBitmapStruct> {
        public void decodeInputStream(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar) {
            if (inputStream == null) {
                throw new IOException("Null input stream");
            }
        }

        public long getDecodeTime() {
            return 0;
        }

        public BitmapType getType() {
            return BitmapType.Native;
        }

        public /* bridge */ /* synthetic */ Object provide() {
            return null;
        }

        public void recycle() {
        }
    }

    public C89122c(C89118b bVar, C89314a aVar) {
        this.f256784e = bVar;
        this.f256783d = aVar;
    }

    /* renamed from: a */
    public C89485d mo123449a(InputStream inputStream) {
        Map<String, C89484c> map = C90377c.f259389a;
        C89484c cVar = C89484c.UNKNOWN;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!inputStream.markSupported()) {
            inputStream = inputStream instanceof FileInputStream ? new C90376b((FileInputStream) inputStream) : new BufferedInputStream(inputStream);
        }
        inputStream.mark(8388608);
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        C89484c cVar2 = (C89484c) ((HashMap) C90377c.f259389a).get(options.outMimeType);
        if (cVar2 == null) {
            cVar2 = cVar;
        }
        try {
            inputStream.reset();
            cVar = cVar2;
        } catch (IOException e) {
            C89876b.m112386c("Ni.FormatUtil", e, "hy: the given stream is markable, but still reset error. should not forward", new Object[0]);
        }
        C89485d dVar = new C89485d();
        dVar.f257554a = cVar;
        dVar.f257556c = (long) options.outHeight;
        dVar.f257555b = (long) options.outWidth;
        return dVar;
    }

    /* renamed from: b */
    public void mo123450b(C89483b<Bitmap> bVar) {
        IBitmap iBitmap;
        BitmapType bitmapType = BitmapType.Legacy;
        synchronized (f256779f) {
            if (this.f256781b.getType() == bitmapType && (iBitmap = this.f256781b) != null) {
                iBitmap.recycle();
            }
            C89118b bVar2 = this.f256784e;
            int hashCode = hashCode();
            Map map = bVar2.f256778b.get(hashCode);
            if (map == null) {
                map = new HashMap(2);
            }
            map.put(bitmapType, bVar);
            bVar2.f256778b.append(hashCode, map);
        }
    }
}
