package lb0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lb0.C88426h;
import lu3.C88656g;
import p210o.C11323a;
import p823sg.C101611g;
import p823sg.C101614i;
import p823sg.C90193h;
import s24.C90125c;
import zt3.C119157j;

/* renamed from: lb0.b */
public final class C88394b {

    /* renamed from: g */
    public static String f255384g;

    /* renamed from: h */
    public static C88406i f255385h = C88406i.f255411a;

    /* renamed from: a */
    public final Map<C88411m, String> f255386a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<String, C88411m> f255387b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<Integer, String> f255388c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C88403g f255389d = new C88403g(new MMHandler("AppBrandSimpleImageLoaderDiskIOHandlerThread"), (C88395a) null);

    /* renamed from: e */
    public final C88412n f255390e = new C88401f();

    /* renamed from: f */
    public final C88409k f255391f = new C88398d((C88395a) null);

    /* renamed from: lb0.b$c */
    public class C61265c extends C61266o {

        /* renamed from: i */
        public final /* synthetic */ Drawable f174365i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61265c(C88394b bVar, ImageView imageView, C88394b bVar2, String str, C61267r rVar, Drawable drawable) {
            super(imageView, bVar2, str, rVar, (C88395a) null);
            this.f174365i = drawable;
        }

        /* renamed from: d */
        public void mo1908d() {
            if (this.f174366d.get() != null && this.f174365i != null) {
                this.f174366d.get().setImageDrawable(this.f174365i);
            }
        }
    }

    /* renamed from: lb0.b$o */
    public static class C61266o implements C88411m {

        /* renamed from: d */
        public final WeakReference<ImageView> f174366d;

        /* renamed from: e */
        public final C88394b f174367e;

        /* renamed from: f */
        public final String f174368f;

        /* renamed from: g */
        public final String f174369g;

        /* renamed from: h */
        public boolean f174370h = false;

        public C61266o(ImageView imageView, C88394b bVar, String str, C61267r rVar, C88395a aVar) {
            this.f174366d = new WeakReference<>(imageView);
            this.f174367e = bVar;
            this.f174368f = "ImageView";
            this.f174369g = str;
        }

        /* renamed from: b */
        public void mo1907b() {
            ImageView imageView = this.f174366d.get();
            if (imageView != null) {
                ((ConcurrentHashMap) this.f174367e.f255388c).remove(Integer.valueOf(imageView.hashCode()));
            }
        }

        public String key() {
            return this.f174368f;
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            ImageView imageView = this.f174366d.get();
            if (imageView != null) {
                ((ConcurrentHashMap) this.f174367e.f255388c).remove(Integer.valueOf(imageView.hashCode()));
            }
            ImageView imageView2 = this.f174366d.get();
            this.f174370h = true;
            if (imageView2 != null) {
                if (!MMHandlerThread.isMainThread()) {
                    Log.printDebugStack("Luggage.AppBrandSimpleImageLoader", "onBitmapLoaded invoke in non-main thread!!!", new Object[0]);
                }
                imageView2.setImageDrawable(new C61268j(imageView2.getResources(), bitmap));
            }
        }
    }

    /* renamed from: lb0.b$r */
    public interface C61267r {
        /* renamed from: a */
        boolean mo86257a(ImageView imageView, String str, Bitmap bitmap);
    }

    /* renamed from: lb0.b$a */
    public class C88395a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f255392d;

        /* renamed from: e */
        public final /* synthetic */ C88411m f255393e;

        /* renamed from: f */
        public final /* synthetic */ String f255394f;

        /* renamed from: g */
        public final /* synthetic */ C88413p f255395g;

        public C88395a(String str, C88411m mVar, String str2, C88413p pVar) {
            this.f255392d = str;
            this.f255393e = mVar;
            this.f255394f = str2;
            this.f255395g = pVar;
        }

        public void run() {
            Bitmap b = ((C88401f) C88394b.this.f255390e).mo122810b(this.f255392d);
            if (b == null || b.isRecycled()) {
                b = null;
            }
            if (b != null) {
                this.f255393e.onBitmapLoaded(b);
                Log.m105919d("Luggage.AppBrandSimpleImageLoader", "load already cached, url %s, bitmap %s", this.f255394f, b);
                return;
            }
            C88413p pVar = this.f255395g;
            String str = pVar.f255419n + pVar.mo122822e();
            ((ConcurrentHashMap) C88394b.this.f255386a).put(this.f255393e, str);
            ((ConcurrentHashMap) C88394b.this.f255387b).put(str, this.f255393e);
            this.f255393e.mo1908d();
            C88413p pVar2 = this.f255395g;
            pVar2.f255415g.f255389d.f255408a.post(new C88423e(pVar2));
        }
    }

    /* renamed from: lb0.b$b */
    public final class C88396b implements C88403g.C88404a, Runnable {

        /* renamed from: d */
        public boolean f255397d = false;

        /* renamed from: e */
        public final /* synthetic */ C88394b f255398e;

        /* renamed from: f */
        public final /* synthetic */ C88419s f255399f;

        /* renamed from: g */
        public final /* synthetic */ C11323a f255400g;

        /* renamed from: h */
        public final /* synthetic */ String f255401h;

        /* renamed from: i */
        public final /* synthetic */ Map f255402i;

        /* renamed from: lb0.b$b$a */
        public class C88397a implements C88656g {
            public C88397a() {
            }

            public String getKey() {
                return "AppBrandSimpleImageLoaderDownloadThread";
            }

            public void run() {
                C88396b bVar = C88396b.this;
                C88413p.m110275d(bVar.f255399f, bVar.f255402i, bVar.f255398e.f255391f);
                C88396b bVar2 = C88396b.this;
                C11323a aVar = bVar2.f255400g;
                if (aVar != null) {
                    try {
                        aVar.apply(((C88398d) bVar2.f255398e.f255391f).mo122806b(bVar2.f255399f.f255429b));
                    } catch (Throwable unused) {
                    }
                }
                C88396b bVar3 = C88396b.this;
                C88403g gVar = bVar3.f255398e.f255389d;
                gVar.f255408a.post(new C88420c(bVar3));
            }
        }

        public C88396b(C88394b bVar, C88394b bVar2, C88419s sVar, C11323a aVar, String str, Map map) {
            this.f255398e = bVar2;
            this.f255399f = sVar;
            this.f255400g = aVar;
            this.f255401h = str;
            this.f255402i = map;
        }

        /* renamed from: a */
        public void mo122801a() {
            if (!this.f255397d) {
                try {
                    InputStream b = ((C88398d) this.f255398e.f255391f).mo122806b(this.f255399f.f255429b);
                    if (b != null) {
                        C11323a aVar = this.f255400g;
                        if (aVar != null) {
                            aVar.apply(b);
                        }
                        C88403g gVar = this.f255398e.f255389d;
                        gVar.f255408a.post(new C88420c(this));
                        return;
                    }
                    ((C119157j) C119157j.f356862d).mo183875f(new C88397a());
                } catch (Throwable th) {
                    Log.m105921e("Luggage.AppBrandSimpleImageLoader", "loadIntoDiskCache diskCache.openRead failed, url=%s, e=%s", this.f255401h, th);
                    C11323a aVar2 = this.f255400g;
                    if (aVar2 != null) {
                        aVar2.apply(null);
                    }
                    C88403g gVar2 = this.f255398e.f255389d;
                    gVar2.f255408a.post(new C88420c(this));
                }
            }
        }

        /* renamed from: b */
        public void mo122802b() {
            this.f255397d = true;
        }

        public void run() {
            if (this.f255398e.f255389d.mo122819d(this.f255399f.f255429b)) {
                this.f255398e.f255389d.mo122816a(this.f255399f.f255429b, this);
                return;
            }
            C88403g gVar = this.f255398e.f255389d;
            String str = this.f255399f.f255429b;
            gVar.getClass();
            if (!Util.isNullOrNil(str)) {
                ((HashMap) gVar.f255410c).put(str, Boolean.TRUE);
            }
            mo122801a();
        }
    }

    /* renamed from: lb0.b$d */
    public static final class C88398d implements C88409k {

        /* renamed from: lb0.b$d$a */
        public class C88399a extends BufferedOutputStream {

            /* renamed from: d */
            public final /* synthetic */ String f255404d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C88399a(C88398d dVar, OutputStream outputStream, String str) {
                super(outputStream);
                this.f255404d = str;
            }

            public synchronized void flush() {
                super.flush();
                C86013q1.m106447h(this.f255404d);
            }
        }

        public C88398d(C88395a aVar) {
        }

        /* renamed from: a */
        public boolean mo122805a(String str) {
            if (!Util.isNullOrNil(str)) {
                if (C86013q1.m106447h(C88394b.f255384g + str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public InputStream mo122806b(String str) {
            String str2 = C88394b.f255384g + str;
            if (C86013q1.m106450k(str2 + ".wlock")) {
                return null;
            }
            try {
                return C86013q1.m106423E(str2);
            } catch (IOException e) {
                Log.m105919d("MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache", "openRead fileName %s, e %s", str, e);
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x005e }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo122807c(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.String r0 = "MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache"
                r1 = 0
                r2 = 0
                r3 = 1
                java.lang.String r4 = lb0.C88394b.f255384g     // Catch:{ all -> 0x005e }
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106461v(r4)     // Catch:{ all -> 0x005e }
                if (r4 != 0) goto L_0x0069
                java.lang.String r4 = lb0.C88394b.f255384g     // Catch:{ all -> 0x005e }
                android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ all -> 0x005e }
                java.lang.String r5 = r4.getPath()     // Catch:{ all -> 0x005e }
                if (r5 == 0) goto L_0x0033
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r2, r2)     // Catch:{ all -> 0x005e }
                java.lang.String r6 = r4.getPath()     // Catch:{ all -> 0x005e }
                boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x005e }
                if (r6 != 0) goto L_0x0033
                android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ all -> 0x005e }
                android.net.Uri$Builder r4 = r4.path(r5)     // Catch:{ all -> 0x005e }
                android.net.Uri r4 = r4.build()     // Catch:{ all -> 0x005e }
            L_0x0033:
                com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x005e }
                com.tencent.mm.vfs.f0$h r4 = r5.mo177799l(r4, r1)     // Catch:{ all -> 0x005e }
                boolean r5 = r4.mo177810a()     // Catch:{ all -> 0x005e }
                if (r5 != 0) goto L_0x0040
                goto L_0x0050
            L_0x0040:
                com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a     // Catch:{ all -> 0x005e }
                java.lang.String r4 = r4.f348992b     // Catch:{ all -> 0x005e }
                com.tencent.mm.vfs.b0 r4 = r5.mo119945q(r4)     // Catch:{ all -> 0x005e }
                if (r4 == 0) goto L_0x0050
                boolean r4 = r4.f250476f     // Catch:{ all -> 0x005e }
                if (r4 == 0) goto L_0x0050
                r4 = 1
                goto L_0x0051
            L_0x0050:
                r4 = 0
            L_0x0051:
                if (r4 != 0) goto L_0x0069
                java.lang.String r4 = lb0.C88394b.f255384g     // Catch:{ all -> 0x005e }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ all -> 0x005e }
                java.lang.String r4 = lb0.C88394b.f255384g     // Catch:{ all -> 0x005e }
                com.tencent.p014mm.vfs.C86013q1.m106461v(r4)     // Catch:{ all -> 0x005e }
                goto L_0x0069
            L_0x005e:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r2] = r4
                java.lang.String r4 = "openWrite mkdirs e=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)
            L_0x0069:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = lb0.C88394b.f255384g
                r4.append(r5)
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r6 = ".wlock"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
                com.tencent.p014mm.vfs.C86013q1.m106446g(r5, r3)
                byte[] r6 = new byte[r3]
                com.tencent.p014mm.vfs.C86013q1.m106438T(r5, r6, r2, r3)
                com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ IOException -> 0x00a6 }
                com.tencent.p014mm.vfs.C86013q1.m106446g(r4, r3)     // Catch:{ IOException -> 0x00a6 }
                lb0.b$d$a r6 = new lb0.b$d$a     // Catch:{ IOException -> 0x00a6 }
                java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r2)     // Catch:{ IOException -> 0x00a6 }
                r6.<init>(r7, r4, r5)     // Catch:{ IOException -> 0x00a6 }
                return r6
            L_0x00a6:
                r4 = move-exception
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r8
                java.lang.String r8 = lb0.C88394b.f255384g
                boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r5[r3] = r8
                java.lang.String r8 = "openWrite fileName %s, parent exists[%b]"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r8, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lb0.C88394b.C88398d.mo122807c(java.lang.String):java.io.OutputStream");
        }
    }

    /* renamed from: lb0.b$e */
    public static class C88400e implements C88411m {
        /* renamed from: b */
        public void mo1907b() {
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "DefaultLoadTarget";
        }

        public void onBitmapLoaded(Bitmap bitmap) {
        }
    }

    /* renamed from: lb0.b$f */
    public static final class C88401f implements C88412n {

        /* renamed from: a */
        public final C101611g<String, Reference<Bitmap>> f255405a = new C88402a(31457280);

        /* renamed from: lb0.b$f$a */
        public class C88402a extends C101614i<String, Reference<Bitmap>> {

            /* renamed from: c */
            public final Map<Reference<Bitmap>, Integer> f255406c = new ConcurrentHashMap();

            public C88402a(int i) {
                super(i);
            }

            /* renamed from: a */
            public void mo122812a(C101611g.C48378a<String, Reference<Bitmap>> aVar) {
                Log.m105918d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear(OnClearListener)");
                clear();
                ((ConcurrentHashMap) this.f255406c).clear();
            }

            public void clear() {
                Log.m105918d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear");
                try {
                    super.clear();
                } catch (IllegalStateException e) {
                    Log.printErrStackTrace("LRUMap", e, "clear", new Object[0]);
                }
                ((ConcurrentHashMap) this.f255406c).clear();
            }

            public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                Reference reference = (Reference) obj2;
                Reference reference2 = (Reference) obj3;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(C88401f.this.f255405a.size() / 10);
                objArr[1] = Integer.valueOf(C88401f.this.f255405a.maxSize() / 10);
                Object obj4 = "null-ref";
                objArr[2] = reference == null ? obj4 : reference.get();
                if (reference2 != null) {
                    obj4 = reference2.get();
                }
                objArr[3] = obj4;
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "entryRemoved, curSize %d KB, maxSize %d KB, oldBmp %s, newBmp %s", objArr);
                super.entryRemoved(z, str, reference, reference2);
                Bitmap bitmap = null;
                Bitmap bitmap2 = reference == null ? null : (Bitmap) reference.get();
                if (reference2 != null) {
                    bitmap = (Bitmap) reference2.get();
                }
                if (bitmap2 != bitmap) {
                    C88401f.this.getClass();
                    Log.m105919d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "release, bmp %s", bitmap2);
                    if (bitmap2 != null) {
                        bitmap2.isRecycled();
                    }
                }
                ((ConcurrentHashMap) this.f255406c).remove(reference);
            }

            public int sizeOf(Object obj, Object obj2) {
                String str = (String) obj;
                Reference reference = (Reference) obj2;
                int i = 0;
                if (reference == null) {
                    return 0;
                }
                Integer num = (Integer) ((ConcurrentHashMap) this.f255406c).get(reference);
                if (num != null && num.intValue() >= 0) {
                    return num.intValue();
                }
                Bitmap bitmap = (Bitmap) reference.get();
                if (bitmap != null && !bitmap.isRecycled()) {
                    i = bitmap.getAllocationByteCount();
                }
                ((ConcurrentHashMap) this.f255406c).put(reference, Integer.valueOf(i));
                return i;
            }
        }

        /* renamed from: a */
        public void mo122809a() {
            Log.m105918d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear");
            synchronized (this.f255405a) {
                ((C88402a) this.f255405a).clear();
            }
        }

        /* renamed from: b */
        public Bitmap mo122810b(String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            synchronized (this.f255405a) {
                Reference reference = this.f255405a.get(str);
                if (reference == null) {
                    return null;
                }
                Bitmap bitmap = (Bitmap) reference.get();
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        return bitmap;
                    }
                }
                this.f255405a.remove(str);
                return null;
            }
        }

        /* renamed from: c */
        public void mo122811c(String str, Bitmap bitmap) {
            if (!Util.isNullOrNil(str) && bitmap != null) {
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "put, key %s, bmp %s", str, bitmap);
                try {
                    synchronized (this.f255405a) {
                        this.f255405a.put(str, new SoftReference(bitmap));
                    }
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    /* renamed from: lb0.b$g */
    public static final class C88403g {

        /* renamed from: a */
        public final MMHandler f255408a;

        /* renamed from: b */
        public final Map<String, List<C88404a>> f255409b = new HashMap();

        /* renamed from: c */
        public final Map<String, Boolean> f255410c = new HashMap();

        /* renamed from: lb0.b$g$a */
        public interface C88404a {
            /* renamed from: a */
            void mo122801a();

            /* renamed from: b */
            void mo122802b();
        }

        public C88403g(MMHandler mMHandler, C88395a aVar) {
            this.f255408a = mMHandler;
        }

        /* renamed from: a */
        public void mo122816a(String str, C88404a aVar) {
            if (!Util.isNullOrNil(str) && aVar != null) {
                List list = (List) ((HashMap) this.f255409b).get(str);
                if (list == null) {
                    list = new LinkedList();
                    ((HashMap) this.f255409b).put(str, list);
                }
                list.add(aVar);
            }
        }

        /* renamed from: b */
        public void mo122817b(String str) {
            if (!Util.isNullOrNil(str)) {
                List<C88404a> list = (List) ((HashMap) this.f255409b).remove(str);
                if (!Util.isNullOrNil((List) list)) {
                    for (C88404a b : list) {
                        b.mo122802b();
                    }
                    list.clear();
                }
            }
        }

        /* renamed from: c */
        public void mo122818c(String str) {
            if (!Util.isNullOrNil(str)) {
                List<C88404a> list = (List) ((HashMap) this.f255409b).remove(str);
                if (!Util.isNullOrNil((List) list)) {
                    for (C88404a a : list) {
                        a.mo122801a();
                    }
                }
            }
        }

        /* renamed from: d */
        public boolean mo122819d(String str) {
            if (Util.isNullOrNil(str)) {
                return false;
            }
            return ((HashMap) this.f255410c).containsKey(str);
        }

        /* renamed from: e */
        public void mo122820e(String str) {
            if (!Util.isNullOrNil(str)) {
                ((HashMap) this.f255410c).remove(str);
            }
        }
    }

    /* renamed from: lb0.b$h */
    public interface C88405h extends C88425g {
        /* renamed from: a */
        Bitmap mo94301a(InputStream inputStream);
    }

    /* renamed from: lb0.b$i */
    public interface C88406i {

        /* renamed from: a */
        public static final C88406i f255411a = new C88407a();

        /* renamed from: lb0.b$i$a */
        public class C88407a implements C88406i {
            /* renamed from: O0 */
            public Bitmap mo113345O0(InputStream inputStream) {
                return BitmapFactory.decodeStream(inputStream);
            }
        }

        /* renamed from: O0 */
        Bitmap mo113345O0(InputStream inputStream);
    }

    /* renamed from: lb0.b$j */
    public interface C88408j extends C88425g {
        /* renamed from: c */
        Bitmap mo5830c(Bitmap bitmap);
    }

    /* renamed from: lb0.b$k */
    public interface C88409k {
    }

    /* renamed from: lb0.b$l */
    public interface C88410l {
        /* renamed from: a */
        void mo117344a(byte[] bArr);
    }

    /* renamed from: lb0.b$m */
    public interface C88411m extends C88425g {
        /* renamed from: b */
        void mo1907b();

        /* renamed from: d */
        void mo1908d();

        String key();

        void onBitmapLoaded(Bitmap bitmap);
    }

    /* renamed from: lb0.b$n */
    public interface C88412n {
    }

    /* renamed from: lb0.b$p */
    public static final class C88413p implements C88403g.C88404a {

        /* renamed from: d */
        public final C88419s f255412d;

        /* renamed from: e */
        public final Map<String, String> f255413e;

        /* renamed from: f */
        public final C88408j f255414f;

        /* renamed from: g */
        public final C88394b f255415g;

        /* renamed from: h */
        public final C88412n f255416h;

        /* renamed from: i */
        public final C88409k f255417i;

        /* renamed from: j */
        public final C88405h f255418j;

        /* renamed from: n */
        public final String f255419n;

        /* renamed from: o */
        public boolean f255420o = true;

        /* renamed from: lb0.b$p$a */
        public class C88414a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f255421d;

            public C88414a(Bitmap bitmap) {
                this.f255421d = bitmap;
            }

            public void run() {
                C88413p.this.mo122824g(this.f255421d);
            }
        }

        /* renamed from: lb0.b$p$b */
        public class C88415b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f255423d;

            public C88415b(Bitmap bitmap) {
                this.f255423d = bitmap;
            }

            public void run() {
                C88413p pVar = C88413p.this;
                ((C88401f) pVar.f255416h).mo122811c(pVar.mo122822e(), this.f255423d);
                C88413p pVar2 = C88413p.this;
                Bitmap bitmap = this.f255423d;
                pVar2.getClass();
                if (bitmap == null || bitmap.isRecycled()) {
                    Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onLoadFailed bmp %s", bitmap);
                    Map<String, C88411m> map = pVar2.f255415g.f255387b;
                    String str = pVar2.f255419n;
                    String e = pVar2.mo122822e();
                    C88411m mVar = (C88411m) ((ConcurrentHashMap) map).remove(str + e);
                    if (mVar != null) {
                        mVar.mo1907b();
                        ((ConcurrentHashMap) pVar2.f255415g.f255386a).remove(mVar);
                        return;
                    }
                    return;
                }
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onBitmapLoaded bmp %s", bitmap);
                pVar2.mo122824g(bitmap);
            }
        }

        /* renamed from: lb0.b$p$c */
        public class C88416c implements C88656g {

            /* renamed from: lb0.b$p$c$a */
            public class C88417a implements Runnable {
                public C88417a() {
                }

                public void run() {
                    C88413p pVar = C88413p.this;
                    pVar.f255420o = false;
                    pVar.mo122821c();
                }
            }

            public C88416c() {
            }

            public String getKey() {
                return "AppBrandSimpleImageLoaderDownloadThread";
            }

            public void run() {
                C88413p pVar = C88413p.this;
                C88413p.m110275d(pVar.f255412d, pVar.f255413e, pVar.f255417i);
                C88403g gVar = C88413p.this.f255415g.f255389d;
                gVar.f255408a.post(new C88417a());
            }
        }

        public C88413p(String str, Map<String, String> map, C88408j jVar, C88394b bVar, C88412n nVar, C88409k kVar, C88405h hVar, String str2) {
            this.f255412d = new C88419s(str, (C88395a) null);
            this.f255413e = map;
            this.f255414f = jVar;
            this.f255415g = bVar;
            this.f255416h = nVar;
            this.f255417i = kVar;
            this.f255418j = hVar;
            this.f255419n = str2;
        }

        /* renamed from: d */
        public static void m110275d(C88419s sVar, Map<String, String> map, C88409k kVar) {
            OutputStream c;
            try {
                InputStream a = C88419s.m110283a(sVar, map);
                if (a != null) {
                    try {
                        c = ((C88398d) kVar).mo122807c(sVar.f255429b);
                        if (c != null) {
                            int i = C90125c.f258817a;
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int read = a.read(bArr);
                                if (-1 == read) {
                                    break;
                                }
                                c.write(bArr, 0, read);
                            }
                            c.flush();
                            Log.m105925i("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload, imageURL: %s, downloaded", sVar);
                        } else {
                            Log.m105921e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openWrite, get NULL output, url=%s", sVar);
                        }
                        if (c != null) {
                            c.close();
                        }
                    } catch (Throwable th) {
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                } else {
                    Log.m105921e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openRead, get NULL input, url=%s", sVar);
                }
                if (a != null) {
                    a.close();
                    return;
                }
                return;
                throw th;
            } catch (IOException e) {
                Log.m105921e("Luggage.AppBrandSimpleImageLoader.LoadTask", "doNetworkDownload URL.openRead failed, url=%s, e=%s", sVar, e);
                ((C88398d) kVar).mo122805a(sVar.f255429b);
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }

        /* renamed from: a */
        public void mo122801a() {
            Bitmap b = ((C88401f) this.f255416h).mo122810b(mo122822e());
            if (b != null && !b.isRecycled()) {
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "before actually doIOJob, same keyForMemory bitmap already exists, key %s", mo122822e());
                MMHandlerThread.postToMainThread(new C88414a(b));
            } else if (this.f255415g.f255389d.mo122819d(this.f255412d.f255429b)) {
                this.f255415g.f255389d.mo122816a(this.f255412d.f255429b, this);
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "already has job processing, make this job pending, key %s", this.f255412d.f255429b);
            } else {
                C88403g gVar = this.f255415g.f255389d;
                String str = this.f255412d.f255429b;
                gVar.getClass();
                if (!Util.isNullOrNil(str)) {
                    ((HashMap) gVar.f255410c).put(str, Boolean.TRUE);
                }
                mo122821c();
            }
        }

        /* renamed from: b */
        public void mo122802b() {
            Map<String, C88411m> map = this.f255415g.f255387b;
            String str = this.f255419n;
            String e = mo122822e();
            C88411m mVar = (C88411m) ((ConcurrentHashMap) map).remove(str + e);
            if (mVar != null) {
                ((ConcurrentHashMap) this.f255415g.f255386a).remove(mVar);
            }
        }

        /* renamed from: c */
        public final void mo122821c() {
            List list;
            List list2;
            try {
                Bitmap f = mo122823f();
                if (f != null && !f.isRecycled()) {
                    this.f255415g.f255389d.mo122820e(this.f255412d.f255429b);
                    C88403g gVar = this.f255415g.f255389d;
                    String str = this.f255412d.f255429b;
                    gVar.getClass();
                    if (!Util.isNullOrNil(str) && (list2 = (List) ((HashMap) gVar.f255409b).get(str)) != null) {
                        list2.remove(this);
                    }
                    mo122825h(f);
                    this.f255415g.f255389d.mo122818c(this.f255412d.f255429b);
                }
            } catch (C88426h e) {
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", " doIOJobImpl, exp %s", e);
                this.f255415g.f255389d.mo122820e(this.f255412d.f255429b);
                this.f255415g.f255389d.mo122817b(this.f255412d.f255429b);
                mo122825h((Bitmap) null);
                if (e instanceof C88426h.C88427a) {
                    ((C88398d) this.f255415g.f255391f).mo122805a(this.f255412d.f255429b);
                }
            } catch (IOException e2) {
                Log.printErrStackTrace("Luggage.AppBrandSimpleImageLoader.LoadTask", e2, " doIOJobImpl, io exp ", new Object[0]);
                this.f255415g.f255389d.mo122820e(this.f255412d.f255429b);
                C88403g gVar2 = this.f255415g.f255389d;
                String str2 = this.f255412d.f255429b;
                gVar2.getClass();
                if (!Util.isNullOrNil(str2) && (list = (List) ((HashMap) gVar2.f255409b).get(str2)) != null) {
                    list.remove(this);
                }
                this.f255415g.f255389d.mo122818c(this.f255412d.f255429b);
                if (e2 instanceof FileNotFoundException) {
                    mo122825h((Bitmap) null);
                }
            }
        }

        /* renamed from: e */
        public final String mo122822e() {
            return C88394b.m110231i(this.f255412d.f255428a, this.f255414f, this.f255418j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0113  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap mo122823f() {
            /*
                r7 = this;
                lb0.b r0 = r7.f255415g
                r0.getClass()
                java.lang.String r0 = lb0.C88394b.f255384g
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 0
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x0011
                goto L_0x004d
            L_0x0011:
                java.lang.String r0 = lb0.C88394b.f255384g
                android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
                java.lang.String r4 = r0.getPath()
                if (r4 == 0) goto L_0x0037
                java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r1, r1)
                java.lang.String r5 = r0.getPath()
                boolean r5 = r5.equals(r4)
                if (r5 != 0) goto L_0x0037
                android.net.Uri$Builder r0 = r0.buildUpon()
                android.net.Uri$Builder r0 = r0.path(r4)
                android.net.Uri r0 = r0.build()
            L_0x0037:
                com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r0 = r4.mo177799l(r0, r2)
                boolean r4 = r0.mo177810a()
                if (r4 != 0) goto L_0x0044
                goto L_0x004d
            L_0x0044:
                com.tencent.mm.vfs.FileSystem$c r4 = r0.f348991a
                int r5 = r4.mo119936f()
                r5 = r5 & r3
                if (r5 != 0) goto L_0x004f
            L_0x004d:
                r0 = 0
                goto L_0x0067
            L_0x004f:
                java.lang.String r5 = r0.f348992b
                java.lang.String r5 = r4.mo119947w(r5, r3)
                if (r5 == 0) goto L_0x0061
                java.io.File r0 = new java.io.File
                r0.<init>(r5)
                boolean r0 = r0.canWrite()
                goto L_0x0067
            L_0x0061:
                java.lang.String r0 = r0.f348992b
                boolean r0 = r4.mo119948x(r0)
            L_0x0067:
                java.lang.String r4 = "Luggage.AppBrandSimpleImageLoader.LoadTask"
                if (r0 == 0) goto L_0x0113
                lb0.b$k r0 = r7.f255417i
                lb0.b$s r5 = r7.f255412d
                java.lang.String r5 = r5.f255429b
                lb0.b$d r0 = (lb0.C88394b.C88398d) r0
                java.io.InputStream r0 = r0.mo122806b(r5)
                if (r0 != 0) goto L_0x00b5
                java.lang.Object[] r5 = new java.lang.Object[r3]
                boolean r6 = r7.f255420o
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r5[r1] = r6
                java.lang.String r6 = "loadFromDiskOrTriggerDownload, null from disk, tryDownload %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r5)
                boolean r5 = r7.f255420o
                if (r5 == 0) goto L_0x0099
                zt3.t r5 = zt3.C119157j.f356862d
                lb0.b$p$c r6 = new lb0.b$p$c
                r6.<init>()
                zt3.j r5 = (zt3.C119157j) r5
                r5.mo183875f(r6)
                goto L_0x00b5
            L_0x0099:
                lb0.b r0 = r7.f255415g
                lb0.b$g r0 = r0.f255389d
                lb0.b$s r1 = r7.f255412d
                java.lang.String r1 = r1.f255429b
                r0.mo122817b(r1)
                lb0.b r0 = r7.f255415g
                lb0.b$g r0 = r0.f255389d
                lb0.b$s r1 = r7.f255412d
                java.lang.String r1 = r1.f255429b
                r0.mo122820e(r1)
                lb0.h$b r0 = new lb0.h$b
                r0.<init>()
                throw r0
            L_0x00b5:
                if (r0 == 0) goto L_0x0112
                lb0.b$h r5 = r7.f255418j     // Catch:{ all -> 0x00d2 }
                if (r5 == 0) goto L_0x00c0
                android.graphics.Bitmap r5 = r5.mo94301a(r0)     // Catch:{ all -> 0x00d2 }
                goto L_0x00ca
            L_0x00c0:
                lb0.b r5 = lb0.C88394b.C88418q.f255427a     // Catch:{ all -> 0x00d2 }
                monitor-enter(r5)     // Catch:{ all -> 0x00d2 }
                lb0.b$i r6 = lb0.C88394b.f255385h     // Catch:{ all -> 0x00cf }
                monitor-exit(r5)     // Catch:{ all -> 0x00cf }
                android.graphics.Bitmap r5 = r6.mo113345O0(r0)     // Catch:{ all -> 0x00d2 }
            L_0x00ca:
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)     // Catch:{ Exception -> 0x00d7 }
                r2 = r5
                goto L_0x00df
            L_0x00cf:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00cf }
                throw r6     // Catch:{ all -> 0x00d2 }
            L_0x00d2:
                r5 = move-exception
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)     // Catch:{ Exception -> 0x00d7 }
                throw r5     // Catch:{ Exception -> 0x00d7 }
            L_0x00d7:
                r0 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r6 = " decode "
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r5)
            L_0x00df:
                if (r2 == 0) goto L_0x0103
                boolean r0 = r2.isRecycled()
                if (r0 != 0) goto L_0x0103
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r1] = r2
                int r1 = r2.getAllocationByteCount()
                int r1 = r1 / 1024
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r3] = r1
                r1 = 2
                lb0.b$s r3 = r7.f255412d
                r0[r1] = r3
                java.lang.String r1 = "loadFromDiskOrTriggerDownload, decoded bmp %s, size %d KB, url %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
                return r2
            L_0x0103:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r1] = r2
                java.lang.String r1 = "loadFromDiskOrTriggerDownload, decode failed, bmp %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
                lb0.h$a r0 = new lb0.h$a
                r0.<init>()
                throw r0
            L_0x0112:
                return r2
            L_0x0113:
                java.lang.String r0 = "loadFromDiskOrTriggerDownload, sdcard unavailable"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
                lb0.h$c r0 = new lb0.h$c
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lb0.C88394b.C88413p.mo122823f():android.graphics.Bitmap");
        }

        /* renamed from: g */
        public final void mo122824g(Bitmap bitmap) {
            Map<String, C88411m> map = this.f255415g.f255387b;
            String str = this.f255419n;
            String e = mo122822e();
            C88411m mVar = (C88411m) ((ConcurrentHashMap) map).remove(str + e);
            if (mVar != null) {
                mVar.onBitmapLoaded(bitmap);
                ((ConcurrentHashMap) this.f255415g.f255386a).remove(mVar);
            }
        }

        /* renamed from: h */
        public final void mo122825h(Bitmap bitmap) {
            Object[] objArr = new Object[1];
            boolean z = false;
            objArr[0] = Boolean.valueOf(bitmap != null && !bitmap.isRecycled());
            Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread bitmap ok %b", objArr);
            if (!(this.f255414f == null || bitmap == null || bitmap.isRecycled())) {
                Bitmap c = this.f255414f.mo5830c(bitmap);
                Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread, transform bmp, origin %s, transformed %s", bitmap, c);
                if (c != bitmap) {
                    ((C88401f) this.f255416h).getClass();
                    Log.m105919d("Luggage.AppBrandSimpleImageLoader.DefaultMemoryCache", "release, bmp %s", bitmap);
                    bitmap.isRecycled();
                }
                bitmap = c;
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                z = true;
            }
            objArr2[1] = Boolean.valueOf(z);
            Log.m105919d("Luggage.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread before post to main thread, bitmap %s, ok %b", objArr2);
            MMHandlerThread.postToMainThread(new C88415b(bitmap));
        }
    }

    /* renamed from: lb0.b$q */
    public static final class C88418q {

        /* renamed from: a */
        public static final C88394b f255427a = new C88394b((C88395a) null);
    }

    /* renamed from: lb0.b$s */
    public static final class C88419s {

        /* renamed from: a */
        public final String f255428a;

        /* renamed from: b */
        public final String f255429b;

        public C88419s(String str, C88395a aVar) {
            if (!TextUtils.isEmpty(str)) {
                this.f255428a = str;
                this.f255429b = C88394b.m110232k(str);
                return;
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARNING: type inference failed for: r0v10, types: [java.net.URLConnection] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0100 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.io.InputStream m110283a(lb0.C88394b.C88419s r8, java.util.Map r9) {
            /*
                r8.getClass()
                java.lang.Class<com.tencent.mm.plugin.appbrand.c3> r0 = com.tencent.p014mm.plugin.appbrand.C1523c3.class
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "openRead, imageURL: "
                r1.append(r2)
                java.lang.String r2 = r8.f255428a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "Luggage.AppBrandSimpleImageLoader"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                java.lang.String r1 = r8.f255428a
                java.lang.String r3 = "file://"
                boolean r1 = r1.startsWith(r3)
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x0123
                java.lang.String r1 = r8.f255428a
                java.lang.String r5 = "wcf://"
                boolean r1 = r1.startsWith(r5)
                if (r1 == 0) goto L_0x0037
                goto L_0x0123
            L_0x0037:
                java.net.URL r1 = new java.net.URL
                java.lang.String r5 = r8.f255428a
                r1.<init>(r5)
                java.net.URLConnection r1 = r1.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                r8.mo122830b(r1, r9)
                boolean r5 = di3.C86312j.m106916h(r0)
                if (r5 == 0) goto L_0x0056
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.appbrand.c3 r0 = (com.tencent.p014mm.plugin.appbrand.C1523c3) r0
                r0.waitFor()
            L_0x0056:
                java.lang.String r0 = lb0.C88394b.f255384g
                boolean r0 = r1 instanceof javax.net.ssl.HttpsURLConnection
                java.lang.String r5 = "openRead, fixSuccess: "
                if (r0 == 0) goto L_0x007a
                vp0.a r0 = vp0.C90854a.f260826a
                r6 = r1
                javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6
                boolean r0 = r0.mo124951a(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x007a:
                int r0 = r1.getResponseCode()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r6 = 301(0x12d, float:4.22E-43)
                if (r0 == r6) goto L_0x008a
                int r0 = r1.getResponseCode()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r6 = 302(0x12e, float:4.23E-43)
                if (r0 != r6) goto L_0x00e5
            L_0x008a:
                java.lang.String r0 = "openRead, imageURL: %s, connected, need redirect"
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r7 = r8.f255428a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r6[r4] = r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r0 = "Location"
                java.lang.String r0 = r1.getHeaderField(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x00a6 }
                r6.close()     // Catch:{ all -> 0x00a6 }
                r1.disconnect()     // Catch:{ all -> 0x00a6 }
            L_0x00a6:
                boolean r1 = android.webkit.URLUtil.isAboutUrl(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                if (r1 != 0) goto L_0x0100
                boolean r1 = android.webkit.URLUtil.isNetworkUrl(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                if (r1 == 0) goto L_0x0100
                java.net.URL r1 = new java.net.URL     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r1.<init>(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r1 = r0
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r1.setInstanceFollowRedirects(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r8.mo122830b(r1, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r9 = lb0.C88394b.f255384g     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                boolean r9 = r1 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                if (r9 == 0) goto L_0x00e5
                vp0.a r9 = vp0.C90854a.f260826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r0 = r1
                javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                boolean r9 = r9.mo124951a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r0.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r0.append(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r0.append(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r9 = r0.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
            L_0x00e5:
                js0.m r9 = new js0.m     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r9.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                lb0.f r0 = new lb0.f     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r0.<init>(r8, r1, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r9 = "openRead, imageURL: %s, connected"
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r8 = r8.f255428a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r1[r4] = r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                goto L_0x0129
            L_0x0100:
                java.net.MalformedURLException r9 = new java.net.MalformedURLException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r1 = "Origin %s, Location %s"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r8 = r8.f255428a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r2[r4] = r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r2[r3] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                java.lang.String r8 = java.lang.String.format(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                r9.<init>(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
                throw r9     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011c, Exception -> 0x0115 }
            L_0x0115:
                r8 = move-exception
                java.io.IOException r9 = new java.io.IOException
                r9.<init>(r8)
                throw r9
            L_0x011c:
                r8 = move-exception
                java.io.IOException r9 = new java.io.IOException
                r9.<init>(r8)
                throw r9
            L_0x0123:
                java.lang.String r9 = r8.f255428a     // Catch:{ FileNotFoundException -> 0x012a }
                java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r9)     // Catch:{ FileNotFoundException -> 0x012a }
            L_0x0129:
                return r0
            L_0x012a:
                r9 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r8 = r8.f255428a
                r0[r4] = r8
                java.lang.String r8 = "load from local file %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r8, r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: lb0.C88394b.C88419s.m110283a(lb0.b$s, java.util.Map):java.io.InputStream");
        }

        /* renamed from: b */
        public final void mo122830b(HttpURLConnection httpURLConnection, Map<String, String> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    Log.m105925i("Luggage.AppBrandSimpleImageLoader", "setHeaders, header: %s: %s", next.getKey(), next.getValue());
                    httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                }
            }
        }

        public String toString() {
            return this.f255428a;
        }
    }

    static {
        C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
        if (c == null) {
            c = C86009m1.m106378c(MMApplicationContext.getContext().getCacheDir());
        }
        if (c != null) {
            m110234s(c.mo119971i());
        }
    }

    public C88394b(C88395a aVar) {
    }

    /* renamed from: i */
    public static String m110231i(String str, C88408j jVar, C88405h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (jVar != null) {
            sb.append("|transformation:");
            sb.append(jVar.key());
        }
        if (hVar != null) {
            sb.append("|decoder:");
            sb.append(hVar.key());
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static String m110232k(String str) {
        if (!Util.isNullOrNil(str)) {
            return C90193h.m112878f(str.getBytes());
        }
        return null;
    }

    /* renamed from: l */
    public static C88394b m110233l() {
        return C88418q.f255427a;
    }

    /* renamed from: s */
    public static void m110234s(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        String str2 = str + "wxacache/";
        f255384g = str2;
        C86013q1.m106461v(str2);
    }

    /* renamed from: a */
    public String mo122785a(ImageView imageView, String str, int i, C88408j jVar) {
        if (imageView == null) {
            return null;
        }
        return mo122786b(imageView, str, imageView.getContext().getResources().getDrawable(i), jVar);
    }

    /* renamed from: b */
    public String mo122786b(ImageView imageView, String str, Drawable drawable, C88408j jVar) {
        return mo122788d(imageView, str, drawable, jVar, (C88405h) null, (C61267r) null);
    }

    /* renamed from: c */
    public String mo122787c(ImageView imageView, String str, Drawable drawable, C88408j jVar, C88405h hVar) {
        return mo122788d(imageView, str, drawable, jVar, hVar, (C61267r) null);
    }

    /* renamed from: d */
    public String mo122788d(ImageView imageView, String str, Drawable drawable, C88408j jVar, C88405h hVar, C61267r rVar) {
        if (imageView == null) {
            return null;
        }
        String str2 = (String) ((ConcurrentHashMap) this.f255388c).remove(Integer.valueOf(imageView.hashCode()));
        if (str2 != null) {
            mo122789e((C88411m) ((ConcurrentHashMap) this.f255387b).get(str2));
        }
        if (Util.isNullOrNil(str)) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            return null;
        }
        C61265c cVar = new C61265c(this, imageView, this, str, rVar, drawable);
        String p = mo122797p(cVar, str, jVar, hVar);
        if (!cVar.f174370h) {
            Map<Integer, String> map = this.f255388c;
            Integer valueOf = Integer.valueOf(imageView.hashCode());
            String j = mo122793j(cVar);
            ((ConcurrentHashMap) map).put(valueOf, j + p);
        }
        return p;
    }

    /* renamed from: e */
    public void mo122789e(C88411m mVar) {
        if (mVar != null) {
            String str = (String) ((ConcurrentHashMap) this.f255386a).remove(mVar);
            if (!Util.isNullOrNil(str)) {
                ((ConcurrentHashMap) this.f255387b).remove(str);
            }
        }
    }

    /* renamed from: f */
    public Bitmap mo122790f(String str) {
        return mo122791g(str, (C88405h) null);
    }

    /* renamed from: g */
    public Bitmap mo122791g(String str, C88405h hVar) {
        Exception e;
        InputStream inputStream;
        Bitmap bitmap;
        C88406i iVar;
        InputStream inputStream2 = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String i = m110231i(str, (C88408j) null, hVar);
        Bitmap b = ((C88401f) this.f255390e).mo122810b(i);
        if (b != null) {
            return b;
        }
        try {
            if (str.startsWith("file://")) {
                try {
                    inputStream = C86013q1.m106423E(str);
                } catch (FileNotFoundException unused) {
                    Log.m105920e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found ");
                    Util.qualityClose((Closeable) null);
                    return null;
                }
            } else {
                inputStream = ((C88398d) this.f255391f).mo122806b(m110232k(str));
            }
            if (inputStream == null) {
                Util.qualityClose(inputStream);
                return null;
            }
            if (hVar != null) {
                try {
                    bitmap = hVar.mo94301a(inputStream);
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                synchronized (C88418q.f255427a) {
                    iVar = f255385h;
                }
                bitmap = iVar.mo113345O0(inputStream);
            }
            if (bitmap != null) {
                ((C88401f) this.f255390e).mo122811c(i, bitmap);
            }
            Util.qualityClose(inputStream);
            return bitmap;
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            try {
                Log.printErrStackTrace("Luggage.AppBrandSimpleImageLoader", e, "findCachedLocal", new Object[0]);
                Util.qualityClose(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                Util.qualityClose(inputStream2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            Util.qualityClose(inputStream2);
            throw th;
        }
    }

    /* renamed from: h */
    public final byte[] mo122792h(String str) {
        InputStream b;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            C88409k kVar = this.f255391f;
            if (!TextUtils.isEmpty(str)) {
                b = ((C88398d) kVar).mo122806b(m110232k(str));
                if (b == null) {
                    if (b != null) {
                        b.close();
                    }
                    return null;
                }
                byte[] c = C90125c.m112776c(b);
                if (b != null) {
                    b.close();
                }
                return c;
            }
            throw new IllegalArgumentException();
        } catch (IOException unused) {
            Log.m105921e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found, url=%s", str);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: j */
    public final String mo122793j(C88411m mVar) {
        return mVar.key() + "@" + mVar.hashCode();
    }

    /* renamed from: m */
    public String mo122794m(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return mo122797p(new C88400e(), str, (C88408j) null, (C88405h) null);
    }

    /* renamed from: n */
    public String mo122795n(C88411m mVar, String str, Map<String, String> map, C88408j jVar, C88405h hVar) {
        if (mVar == null) {
            return null;
        }
        if (Util.isNullOrNil(str)) {
            mVar.mo1907b();
            return null;
        }
        try {
            if ("null".equals(Uri.parse(str).getHost())) {
                mVar.mo1907b();
                return null;
            }
        } catch (Exception unused) {
        }
        Log.m105919d("Luggage.AppBrandSimpleImageLoader", "load before start LoadTask url %s", str);
        String str2 = str;
        Map<String, String> map2 = map;
        C88408j jVar2 = jVar;
        C88413p pVar = new C88413p(str2, map2, jVar2, this, this.f255390e, this.f255391f, hVar, mo122793j(mVar));
        String e = pVar.mo122822e();
        C88395a aVar = new C88395a(e, mVar, str, pVar);
        if (MMHandlerThread.isMainThread()) {
            aVar.run();
        } else {
            MMHandlerThread.postToMainThread(aVar);
        }
        return e;
    }

    /* renamed from: o */
    public String mo122796o(C88411m mVar, String str, C88408j jVar) {
        return mo122797p(mVar, str, jVar, (C88405h) null);
    }

    /* renamed from: p */
    public String mo122797p(C88411m mVar, String str, C88408j jVar, C88405h hVar) {
        return mo122795n(mVar, str, (Map<String, String>) null, jVar, hVar);
    }

    /* renamed from: q */
    public void mo122798q(String str, C88410l lVar) {
        byte[] h = mo122792h(str);
        if (h == null || h.length == 0) {
            mo122795n(new C88421d(this, str, lVar), str, (Map<String, String>) null, (C88408j) null, (C88405h) null);
        } else if (lVar != null) {
            lVar.mo117344a(h);
        }
    }

    /* renamed from: r */
    public String mo122799r(String str, Map<String, String> map, C11323a<InputStream, Void> aVar) {
        if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.apply(null);
            }
            return null;
        }
        C88419s sVar = new C88419s(str, (C88395a) null);
        this.f255389d.f255408a.post(new C88396b(this, this, sVar, aVar, str, map));
        return sVar.f255429b;
    }
}
