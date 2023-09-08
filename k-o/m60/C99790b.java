package m60;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C58003b;
import gy3.C87412m;
import java.io.OutputStream;
import k60.C99102f;
import n60.C100075f;
import rx3.C13598b0;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;

/* renamed from: m60.b */
public final class C99790b extends C99792d<String, Bitmap> {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070 A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y60.C102802a mo137107b(x60.C102564a<java.lang.String> r6, n60.C100075f r7, k60.C99102f<?, android.graphics.Bitmap> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "opts"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "reaper"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 0
            x60.b r1 = r6.f301996b     // Catch:{ Exception -> 0x0060 }
            x60.b r2 = x60.C102565b.ASSET_DATA     // Catch:{ Exception -> 0x0060 }
            if (r1 != r2) goto L_0x0047
            T r1 = r6.f301995a     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0060 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0060 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x0060 }
            java.io.InputStream r2 = r2.open(r1)     // Catch:{ Exception -> 0x0060 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0060 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0060 }
            java.io.InputStream r1 = r3.open(r1)     // Catch:{ Exception -> 0x0060 }
            y60.a r3 = new y60.a     // Catch:{ Exception -> 0x0060 }
            y60.a$e r4 = new y60.a$e     // Catch:{ Exception -> 0x0060 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0060 }
            y60.a$c r2 = new y60.a$c     // Catch:{ Exception -> 0x0060 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0060 }
            r3.<init>(r4, r2, r0)     // Catch:{ Exception -> 0x0060 }
            return r3
        L_0x0047:
            x60.b r2 = x60.C102565b.LOCAL_PATH     // Catch:{ Exception -> 0x0060 }
            if (r1 != r2) goto L_0x0060
            T r1 = r6.f301995a     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0060 }
            T r2 = r6.f301995a     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0060 }
            op3.a r2 = op3.C117882j.m166283b(r2)     // Catch:{ Exception -> 0x0060 }
            y60.a r6 = y60.C102802a.m135853b(r1, r2)     // Catch:{ Exception -> 0x0060 }
            return r6
        L_0x0060:
            java.lang.String r6 = r5.mo137106a(r6, r7, r8)     // Catch:{ FileNotFoundException -> 0x008a }
            int r7 = r6.length()     // Catch:{ FileNotFoundException -> 0x008a }
            if (r7 != 0) goto L_0x006c
            r7 = 1
            goto L_0x006d
        L_0x006c:
            r7 = 0
        L_0x006d:
            if (r7 == 0) goto L_0x0070
            goto L_0x008a
        L_0x0070:
            com.tencent.mm.vfs.p1 r7 = new com.tencent.mm.vfs.p1     // Catch:{ FileNotFoundException -> 0x008a }
            r7.<init>((java.lang.String) r6)     // Catch:{ FileNotFoundException -> 0x008a }
            com.tencent.mm.vfs.p1 r8 = new com.tencent.mm.vfs.p1     // Catch:{ FileNotFoundException -> 0x008a }
            r8.<init>((java.lang.String) r6)     // Catch:{ FileNotFoundException -> 0x008a }
            y60.a r6 = new y60.a     // Catch:{ FileNotFoundException -> 0x008a }
            y60.a$e r1 = new y60.a$e     // Catch:{ FileNotFoundException -> 0x008a }
            r1.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008a }
            y60.a$c r7 = new y60.a$c     // Catch:{ FileNotFoundException -> 0x008a }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x008a }
            r6.<init>(r1, r7, r0)     // Catch:{ FileNotFoundException -> 0x008a }
            r0 = r6
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.C99790b.mo137107b(x60.a, n60.f, k60.f):y60.a");
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<String> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<String> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: e */
    public boolean mo137112e(C102564a<String> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C65941g<Bitmap> gVar2, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        Throwable th;
        C102564a<String> aVar2 = aVar;
        C102355h<?> hVar2 = hVar;
        C65941g<Bitmap> gVar3 = gVar2;
        C100075f fVar3 = fVar;
        C99102f<?, Bitmap> fVar4 = fVar2;
        C87412m.m108594g(aVar2, "url");
        C87412m.m108594g(hVar2, "httpResponse");
        C65941g<Bitmap> gVar4 = gVar;
        C87412m.m108594g(gVar4, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(fVar3, "opts");
        C87412m.m108594g(fVar4, "reaper");
        mo137109d(aVar, hVar, gVar2, fVar, fVar2);
        String a = mo137106a(aVar2, fVar3, fVar4);
        Log.m105924i("MicroMsg.Loader.imageloader.DefaultImageDiskCache", "save " + aVar2 + " filePath " + a);
        C99791c cVar = C99791c.f292469a;
        OutputStream b = cVar.mo139149b(a);
        if (b != null) {
            boolean z = false;
            if (gVar3 != null) {
                try {
                    T t = gVar3.f189590a;
                    C87412m.m108593f(t, "it.value()");
                    C99791c.m130249a(cVar, (Bitmap) t, (Bitmap.CompressFormat) null, 0, b, 6, (Object) null);
                    z = true;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(b, th);
                    throw th5;
                }
            } else {
                gVar3 = gVar4;
            }
            if (!z) {
                hVar2.mo141919b(b);
                z = true;
            }
            if (z) {
                mo137108c(aVar2, gVar3, fVar3, fVar4);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            C58003b.m67160a(b, (Throwable) null);
        }
        return true;
    }
}
