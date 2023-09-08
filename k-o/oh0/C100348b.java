package oh0;

import android.graphics.Bitmap;
import com.tencent.p014mm.loader.cache.memory.C92699b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import o90.C100301b;
import p1028re.C89928a;
import p1028re.C89931d;
import p753xp.C102704b;
import p867wp.C102479b;
import rx3.C13604l;
import s60.C101535a;
import w60.C65941g;
import x60.C102564a;
import zt3.C119157j;

/* renamed from: oh0.b */
public final class C100348b extends C92699b<C100353d, Bitmap> {

    /* renamed from: a */
    public final C100301b<C13604l<Bitmap, String>> f293921a = new C100301b<>(200, C100348b.class);

    /* renamed from: oh0.b$a */
    public static final class C100349a implements C89928a {

        /* renamed from: d */
        public final /* synthetic */ C100348b f293922d;

        public C100349a(C100348b bVar) {
            this.f293922d = bVar;
        }

        /* renamed from: a */
        public void mo391a(int i) {
            Log.m105924i("MicroMsg.Loader.AlbumBitmapMemoryCache", "systemTrim: " + this.f293922d.f293921a.size());
            this.f293922d.mo139628f();
        }

        /* renamed from: b */
        public void mo392b() {
            Log.m105924i("MicroMsg.Loader.AlbumBitmapMemoryCache", "backgroundTrim: " + this.f293922d.f293921a.size());
            this.f293922d.mo139628f();
        }
    }

    /* renamed from: oh0.b$b */
    public static final class C100350b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f293923d;

        /* renamed from: e */
        public final /* synthetic */ String f293924e;

        public C100350b(String str, String str2) {
            this.f293923d = str;
            this.f293924e = str2;
        }

        public final void run() {
            long d = C86013q1.m106443d(this.f293923d, this.f293924e, true);
            C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(this.f293924e, 9999, (String) null, (byte[]) null);
            Log.m105925i("MicroMsg.Loader.AlbumBitmapMemoryCache", "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s, copyResult: " + d, this.f293924e, Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.FALSE, Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
        }
    }

    public C100348b() {
        C89931d.f258426c.mo124253c(new C100349a(this));
    }

    /* renamed from: a */
    public C65941g<Bitmap> mo126884a(C102564a<C100353d> aVar, C101535a<Bitmap> aVar2) {
        C87412m.m108594g(aVar, "url");
        C13604l l = this.f293921a.get(mo126887b(aVar, aVar2));
        Bitmap bitmap = l != null ? (Bitmap) l.f38555d : null;
        if (bitmap != null) {
            return new C65941g<>(bitmap);
        }
        return null;
    }

    /* renamed from: c */
    public void mo126885c(C102564a aVar, C101535a aVar2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(bitmap, "value");
        this.f293921a.put(mo126887b(aVar, aVar2), new C13604l(bitmap, ((C100353d) aVar.f301995a).f293936g));
    }

    /* renamed from: d */
    public void mo126886d(C102564a<C100353d> aVar, C101535a<Bitmap> aVar2) {
        C87412m.m108594g(aVar, "url");
        this.f293921a.remove(mo126887b(aVar, aVar2));
    }

    /* renamed from: e */
    public void mo126888e(C65941g<Bitmap> gVar, C102564a<C100353d> aVar, C101535a<Bitmap> aVar2) {
        C100353d dVar;
        String b = mo126887b(aVar, aVar2);
        String str = null;
        Bitmap bitmap = gVar != null ? (Bitmap) gVar.f189590a : null;
        if (gVar != null && bitmap != null) {
            C13604l l = this.f293921a.get(b);
            String str2 = l != null ? (String) l.f38556e : null;
            if (!(aVar == null || (dVar = (C100353d) aVar.f301995a) == null)) {
                str = dVar.f293936g;
            }
            if (C86013q1.m106450k(str2) && !C86013q1.m106450k(str)) {
                ((C119157j) C119157j.f356862d).mo183885p(new C100350b(str2, str), "MicroMsg.Loader.AlbumBitmapMemoryCache_saveCacheToLocal");
            }
        }
    }

    /* renamed from: f */
    public void mo139628f() {
        Log.m105924i("MicroMsg.Loader.AlbumBitmapMemoryCache", "[clear] size=" + this.f293921a.size());
        this.f293921a.clear();
    }
}
