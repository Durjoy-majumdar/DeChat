package p1089xk;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import java.lang.ref.WeakReference;
import p1028re.C89928a;
import p1028re.C89931d;

/* renamed from: xk.a */
public final class C102686a {

    /* renamed from: a */
    public static final LruCache<String, WeakReference<Drawable>> f303299a = new LruCache<>(10);

    /* renamed from: xk.a$a */
    public static final class C102687a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            LruCache<String, WeakReference<Drawable>> lruCache = C102686a.f303299a;
            Log.m105924i("MicroMsg.EmojiLoader.AnimateCache", "clear: ");
            C102686a.f303299a.evictAll();
        }

        /* renamed from: b */
        public void mo392b() {
            LruCache<String, WeakReference<Drawable>> lruCache = C102686a.f303299a;
            Log.m105924i("MicroMsg.EmojiLoader.AnimateCache", "clear: ");
            C102686a.f303299a.evictAll();
        }
    }

    static {
        C89931d.f258426c.mo124253c(new C102687a());
    }
}
