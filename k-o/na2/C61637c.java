package na2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import gy3.C87412m;
import java.util.LinkedList;
import p529fv.C59327o;
import rx3.C13598b0;
import te3.C64821x13;
import te3.C64871z13;

/* renamed from: na2.c */
public final class C61637c {

    /* renamed from: a */
    public static final C61637c f175276a = new C61637c();

    /* renamed from: b */
    public static final LruCache<String, String> f175277b = new LruCache<>(20);

    /* renamed from: c */
    public static final LruCache<String, Long> f175278c = new LruCache<>(20);

    /* renamed from: d */
    public static final LruCache<String, Integer> f175279d = new LruCache<>(20);

    /* renamed from: e */
    public static final LruCache<String, Boolean> f175280e = new LruCache<>(20);

    /* renamed from: f */
    public static C59327o.C59328a f175281f;

    /* renamed from: a */
    public final void mo86584a(LinkedList<C64871z13> linkedList) {
        C13598b0 b0Var;
        if (linkedList != null) {
            Log.m105924i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveMid2urlMap, map size:" + linkedList.size());
            for (C64871z13 z132 : linkedList) {
                if (z132.f186618d == 0) {
                    C64821x13 x132 = z132.f186620f;
                    if (x132 != null) {
                        String str = x132.f186252e;
                        C87412m.m108593f(str, "linkInfo.info.mid");
                        String str2 = z132.f186621g;
                        C87412m.m108593f(str2, "linkInfo.url");
                        int i = z132.f186622h;
                        boolean z = z132.f186623i;
                        Log.m105924i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveTempPlayUrl, mid:" + str + ", url:" + str2);
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            f175277b.put(str, str2);
                            f175279d.put(str, Integer.valueOf(i));
                            f175280e.put(str, Boolean.valueOf(z));
                            f175278c.put(str, Long.valueOf(System.currentTimeMillis()));
                            C59327o.C59328a aVar = f175281f;
                            if (aVar != null) {
                                aVar.mo84434a();
                            }
                        }
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        Log.m105920e("MicroMsg.Music.MusicLiveLinkCacheHelper", "linkInfo.info is null");
                    }
                } else {
                    Log.m105920e("MicroMsg.Music.MusicLiveLinkCacheHelper", "errCode:" + z132.f186618d + ", errMsg:" + z132.f186619e);
                }
            }
        }
    }
}
