package p1089xk;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import o90.C100301b;

/* renamed from: xk.b */
public final class C102688b {

    /* renamed from: a */
    public static final C102688b f303300a = new C102688b();

    /* renamed from: b */
    public static final C100301b<Bitmap> f303301b = new C100301b<>(500, C102688b.class);

    /* renamed from: a */
    public final Bitmap mo142498a(String str) {
        Bitmap l;
        Log.m105918d("MicroMsg.CoverMemoryCache", "get: " + str);
        if (str == null || (l = f303301b.get(str)) == null || l.isRecycled()) {
            return null;
        }
        return l;
    }

    /* renamed from: b */
    public final void mo142499b(String str, Bitmap bitmap) {
        Log.m105918d("MicroMsg.CoverMemoryCache", "put: " + str + ", " + bitmap);
        if (str == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            f303301b.remove(str);
        } else {
            f303301b.put(str, bitmap);
        }
    }
}
