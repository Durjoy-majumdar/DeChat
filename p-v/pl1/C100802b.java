package pl1;

import android.graphics.Bitmap;
import com.tencent.p014mm.loader.cache.memory.C92699b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import o90.C100301b;
import p1028re.C89928a;
import p1028re.C89931d;
import p823sg.C101611g;
import p90.C100687b;
import q90.C101060a;
import s60.C101535a;
import x60.C102564a;

/* renamed from: pl1.b */
public class C100802b<T> extends C92699b<T, Bitmap> {

    /* renamed from: c */
    public static final C101060a f295278c;

    /* renamed from: a */
    public final C101611g.C101612b<String, Bitmap> f295279a;

    /* renamed from: b */
    public final C100301b<Bitmap> f295280b;

    /* renamed from: pl1.b$a */
    public static final class C100803a implements C89928a {

        /* renamed from: d */
        public final /* synthetic */ int f295281d;

        /* renamed from: e */
        public final /* synthetic */ C100802b<T> f295282e;

        public C100803a(int i, C100802b<T> bVar) {
            this.f295281d = i;
            this.f295282e = bVar;
        }

        /* renamed from: a */
        public void mo391a(int i) {
            Log.m105924i("Finder.DefaultBitmapMemoryCache", "[systemTrim] level(" + i + ") trim to " + this.f295281d);
            this.f295282e.f295280b.clear();
        }

        /* renamed from: b */
        public void mo392b() {
            Log.m105924i("Finder.DefaultBitmapMemoryCache", "[backgroundTrim] trim to " + this.f295281d);
            this.f295282e.f295280b.clear();
        }
    }

    /* renamed from: pl1.b$b */
    public static final class C100804b<K, O> implements C101611g.C101612b {

        /* renamed from: a */
        public static final C100804b<K, O> f295283a = new C100804b<>();

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            Log.m105924i("Finder.DefaultBitmapMemoryCache", "[preRemoveCallback] key=" + ((String) obj));
        }
    }

    static {
        C101060a aVar = new C101060a();
        aVar.f295870b = "FinderBitmapMemoryGlobalCache";
        aVar.f295869a = Math.max(83886080, aVar.f295869a * 3);
        C100687b b = C100687b.m131711b();
        C100687b.C100688a aVar2 = new C100687b.C100688a(aVar);
        b.f295008b.put(aVar.f295870b, aVar2);
        if (aVar.equals(C100687b.f295006d)) {
            b.f295007a = aVar2;
        }
        Log.m105924i("Finder.DefaultBitmapMemoryCache", "cacheConfigure maxSize=" + Util.getSizeKB((long) aVar.f295869a));
        f295278c = aVar;
    }

    public C100802b(int i) {
        C100804b<K, O> bVar = C100804b.f295283a;
        this.f295279a = bVar;
        this.f295280b = new C100301b<>(i, bVar, f295278c, getClass());
        C89931d.f258426c.mo124253c(new C100803a(i, this));
    }

    /* renamed from: c */
    public void mo126885c(C102564a aVar, C101535a aVar2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C87412m.m108594g(aVar, "key");
        C87412m.m108594g(bitmap, "value");
        this.f295280b.put(mo126887b(aVar, aVar2), bitmap);
    }

    /* renamed from: d */
    public void mo126886d(C102564a<T> aVar, C101535a<Bitmap> aVar2) {
        C87412m.m108594g(aVar, "key");
        this.f295280b.remove(mo126887b(aVar, aVar2));
    }
}
