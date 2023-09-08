package com.tencent.p014mm.cache;

import a70.C112760b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import cp3.C45142d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p1093bh.C104084a;
import p520fi.C107544a;
import p520fi.C107545b;
import p520fi.C107546c;
import p520fi.C107547d;
import p520fi.C107548f;
import p520fi.C107549g;
import p520fi.C107551k;

/* renamed from: com.tencent.mm.cache.ArtistCacheManager */
public class ArtistCacheManager extends BroadcastReceiver {

    /* renamed from: b */
    public static ArtistCacheManager f310567b;

    /* renamed from: c */
    public static HashMap<String, C104604c> f310568c = new HashMap<>();

    /* renamed from: d */
    public static HashSet<C104084a> f310569d = new HashSet<>();

    /* renamed from: a */
    public String f310570a;

    /* renamed from: com.tencent.mm.cache.ArtistCacheManager$a */
    public class C104602a implements Runnable {
        public C104602a(ArtistCacheManager artistCacheManager) {
        }

        public void run() {
            C45142d.m49970a(C112760b.m154239k());
        }
    }

    /* renamed from: com.tencent.mm.cache.ArtistCacheManager$b */
    public class C104603b implements Runnable {
        public C104603b(ArtistCacheManager artistCacheManager) {
        }

        public void run() {
            C45142d.m49970a(C112760b.m154239k());
        }
    }

    /* renamed from: com.tencent.mm.cache.ArtistCacheManager$c */
    public class C104604c {

        /* renamed from: a */
        public HashMap<C104084a, C107549g> f310571a = new HashMap<>();

        public C104604c(ArtistCacheManager artistCacheManager) {
        }

        /* renamed from: a */
        public void mo148167a() {
            for (Map.Entry<C104084a, C107549g> value : this.f310571a.entrySet()) {
                ((C107549g) value.getValue()).onDestroy();
            }
        }

        /* renamed from: b */
        public C107549g mo148168b(C104084a aVar) {
            if (!this.f310571a.containsKey(aVar)) {
                int ordinal = aVar.ordinal();
                C107549g fVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 6 ? null : new C107548f() : new C107544a() : new C107547d() : new C107551k() : new C107545b();
                if (fVar != null) {
                    fVar.onCreate();
                }
                if (fVar != null && !this.f310571a.containsKey(aVar)) {
                    this.f310571a.put(aVar, fVar);
                }
            }
            return this.f310571a.get(aVar);
        }
    }

    /* renamed from: a */
    public static ArtistCacheManager m140185a() {
        if (f310567b == null) {
            f310567b = new ArtistCacheManager();
        }
        return f310567b;
    }

    /* renamed from: b */
    public void mo148159b() {
        Log.m105924i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
        for (Map.Entry<String, C104604c> value : f310568c.entrySet()) {
            ((C104604c) value.getValue()).mo148167a();
        }
        f310569d.clear();
        f310567b = null;
        ThreadPool.post(new C104603b(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
        C107546c.f321771c.f321772a.clear();
    }

    /* renamed from: c */
    public <T extends C107549g> T mo148160c(C104084a aVar) {
        if (f310568c.containsKey(this.f310570a)) {
            return f310568c.get(this.f310570a).mo148168b(aVar);
        }
        Log.m105921e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", this.f310570a);
        return null;
    }

    /* renamed from: d */
    public boolean mo148161d(C104084a aVar) {
        return f310568c.containsKey(this.f310570a) && f310568c.get(this.f310570a).f310571a.containsKey(aVar);
    }

    /* renamed from: e */
    public void mo148162e(String str) {
        this.f310570a = str;
        if (!f310568c.containsKey(str)) {
            f310568c.put(str, new C104604c(this));
        }
    }

    /* renamed from: f */
    public void mo148163f(String str) {
        this.f310570a = null;
        if (f310568c.containsKey(str)) {
            f310568c.get(str).mo148167a();
            f310568c.remove(str);
        }
        ThreadPool.post(new C104602a(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }

    @Deprecated
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.ArtistCacheManager", "[onReceive]");
        if (intent != null && intent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")) {
            mo148159b();
        }
    }
}
