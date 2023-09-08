package p490dl;

import android.graphics.Bitmap;
import com.tencent.p014mm.jni.emojihelper.EmojiRgbaCacheManagerJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import o90.C100301b;
import p206nj.C88957l;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: dl.n */
public final class C97487n {

    /* renamed from: a */
    public EmojiRgbaCacheManagerJni f286124a = EmojiRgbaCacheManagerJni.C92693b.f266764a;

    /* renamed from: b */
    public final C101611g<String, Bitmap> f286125b;

    /* renamed from: c */
    public final C101611g<String, Bitmap> f286126c;

    /* renamed from: dl.n$a */
    public static final class C97488a {

        /* renamed from: a */
        public static final C97487n f286127a = new C97487n((C8480h) null);
    }

    public C97487n(C8480h hVar) {
        Class<C97487n> cls = C97487n.class;
        this.f286125b = new C100301b(200, cls);
        this.f286126c = new C100301b(150, cls);
        C88957l.m111078n("voipComm");
        C88957l.m111078n("voipChannel");
        C88957l.m111078n("voipCodec");
        C88957l.m111078n("emojihelper");
    }

    /* renamed from: a */
    public final boolean mo136756a(boolean z) {
        if (this.f286124a == null) {
            Log.m105924i("MicroMsg.EmojiRgbaCacheManager", "clearCache, cacheManager null");
        }
        if (z) {
            ((C101062d) this.f286126c).clear();
        } else {
            ((C101062d) this.f286125b).clear();
        }
        EmojiRgbaCacheManagerJni emojiRgbaCacheManagerJni = this.f286124a;
        if (emojiRgbaCacheManagerJni != null) {
            return emojiRgbaCacheManagerJni.mo126784a(z);
        }
        return false;
    }

    /* renamed from: b */
    public final int mo136757b(boolean z) {
        EmojiRgbaCacheManagerJni emojiRgbaCacheManagerJni = this.f286124a;
        if (emojiRgbaCacheManagerJni == null) {
            Log.m105924i("MicroMsg.EmojiRgbaCacheManager", "getEmojiRgbaCacheCurrentSize, cacheManager null");
            return -1;
        } else if (emojiRgbaCacheManagerJni != null) {
            return emojiRgbaCacheManagerJni.mo126785b(z);
        } else {
            return -1;
        }
    }

    /* renamed from: c */
    public final Bitmap mo136758c(String str) {
        if (str != null && !C87412m.m108589b(str, "")) {
            return (Bitmap) ((C100301b) this.f286126c).get(str);
        }
        Log.m105924i("MicroMsg.EmojiRgbaCacheManager", "getQQNewEmojiCacheBitmap failed, cacheKey error");
        return null;
    }

    /* renamed from: d */
    public final void mo136759d(String str, boolean z, Bitmap bitmap) {
        if (bitmap == null || str == null) {
            Log.m105924i("MicroMsg.EmojiRgbaCacheManager", "putEmojiRgbaCacheFrame failed, bitmap null");
        } else if (z) {
            ((C100301b) this.f286126c).put(str, bitmap);
        } else {
            ((C100301b) this.f286125b).put(str, bitmap);
        }
    }
}
