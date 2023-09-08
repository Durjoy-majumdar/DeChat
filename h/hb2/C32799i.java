package hb2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: hb2.i */
public final class C32799i {

    /* renamed from: a */
    public static final C32799i f89226a = new C32799i();

    /* renamed from: b */
    public static boolean f89227b = true;

    /* renamed from: c */
    public static final HashMap<C8505d, C32798c> f89228c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<C8506l, C32800k> f89229d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<C8507n, C32801m> f89230e = new HashMap<>();

    /* renamed from: a */
    public final void mo58806a(long j) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("evictTimeoutCache, timestamp:");
            sb.append(j);
            sb.append(", finderFeedDetailCache.size:");
            HashMap<C8505d, C32798c> hashMap = f89228c;
            sb.append(hashMap.size());
            sb.append(", mvRecommendListCache.size:");
            sb.append(f89229d.size());
            Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", sb.toString());
            ArrayList<C8505d> arrayList = new ArrayList<>();
            synchronized (hashMap) {
                for (Map.Entry next : hashMap.entrySet()) {
                    if (j - ((C32798c) next.getValue()).f89225b > ApkDownloadManager.INTERVAL) {
                        arrayList.add(next.getKey());
                    }
                }
            }
            for (C8505d remove : arrayList) {
                f89228c.remove(remove);
            }
            ArrayList<C8506l> arrayList2 = new ArrayList<>();
            HashMap<C8506l, C32800k> hashMap2 = f89229d;
            synchronized (hashMap2) {
                for (Map.Entry next2 : hashMap2.entrySet()) {
                    if (j - ((C32800k) next2.getValue()).f89232b > ApkDownloadManager.INTERVAL) {
                        arrayList2.add(next2.getKey());
                    }
                }
            }
            for (C8506l remove2 : arrayList2) {
                f89229d.remove(remove2);
            }
            Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "finished evictTimeoutCache, finderFeedDetailCache.size:" + f89228c.size() + ", mvRecommendListCache.size:" + f89229d.size());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public final void mo58807b(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "lyric");
        if (f89227b) {
            long currentTicks = Util.currentTicks();
            Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "putLyricsCache, key:" + str + ", timestamp:" + currentTicks);
            f89230e.put(new C8507n(str), new C32801m(str2, currentTicks));
            mo58806a(currentTicks);
        }
    }

    /* renamed from: c */
    public final C50008jm0 mo58808c(long j, String str) {
        C50008jm0 jm02;
        C87412m.m108594g(str, "nonceId");
        if (!f89227b) {
            return null;
        }
        Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "tryGetCacheFinderFeedDetail, feedId:" + j + ", nonceId:" + str);
        long currentTicks = Util.currentTicks();
        C32798c cVar = f89228c.get(new C8505d(j, str));
        if (cVar != null) {
            if (currentTicks - cVar.f89225b <= ApkDownloadManager.INTERVAL) {
                Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "tryGetCacheFinderFeedDetail success from cache");
                jm02 = cVar.f89224a;
            } else {
                Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "tryGetCacheFinderFeedDetail failed timeout");
                f89226a.mo58806a(currentTicks);
                jm02 = null;
            }
            if (jm02 != null) {
                return jm02;
            }
        }
        Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "tryGetCacheFinderFeedDetail not found");
        return null;
    }
}
