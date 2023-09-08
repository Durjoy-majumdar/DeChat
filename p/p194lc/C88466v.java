package p194lc;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.jni.ISkylineResourceLoader;
import gy3.C87412m;
import java.io.InputStream;
import js0.C88016e;
import p284zb.C91635f;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: lc.v */
public final class C88466v implements ISkylineResourceLoader {

    /* renamed from: a */
    public final C91635f f255539a;

    /* renamed from: lc.v$a */
    public static final class C88467a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88466v f255540d;

        /* renamed from: e */
        public final /* synthetic */ String f255541e;

        /* renamed from: f */
        public final /* synthetic */ ISkylineResourceLoader.ResourceLoadCallback f255542f;

        public C88467a(C88466v vVar, String str, ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback) {
            this.f255540d = vVar;
            this.f255541e = str;
            this.f255542f = resourceLoadCallback;
        }

        public final void run() {
            byte[] loadResource = this.f255540d.loadResource(this.f255541e);
            StringBuilder sb = new StringBuilder();
            sb.append("loadResourceAsync path:");
            sb.append(this.f255541e);
            sb.append(": ");
            sb.append(loadResource != null ? Integer.valueOf(loadResource.length) : null);
            sb.append(" success");
            Log.m105918d("Luggage.SkylineResourceLoaderImpl", sb.toString());
            ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback = this.f255542f;
            if (resourceLoadCallback != null) {
                resourceLoadCallback.onResourceLoaded(loadResource);
            }
        }
    }

    public C88466v(C91635f fVar) {
        C87412m.m108594g(fVar, "service");
        this.f255539a = fVar;
        Log.m105924i("Luggage.SkylineResourceLoaderImpl", fVar.getAppId() + " init " + fVar);
    }

    public Bitmap loadBitmap(String str) {
        return null;
    }

    public void loadBitmapAsync(String str, ISkylineResourceLoader.BitmapLoadCallback bitmapLoadCallback) {
    }

    public byte[] loadResource(String str) {
        if (str == null || C112551y.m153811k(str)) {
            return new byte[0];
        }
        if (C112551y.m153819s(str, "wxlibfile://", false)) {
            ICommLibReader k = this.f255539a.mo114272k();
            if (k == null) {
                Log.m105920e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + str + ", libReader is null");
                return new byte[0];
            }
            String substring = str.substring(12);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            InputStream openRead = k.openRead(substring);
            if (openRead != null) {
                return C88016e.m109545b(openRead);
            }
            Log.m105920e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
            return new byte[0];
        }
        try {
            C81415h0 fileSystem = this.f255539a.getFileSystem();
            Integer num = null;
            InputStream readStream = fileSystem != null ? fileSystem.readStream(str) : null;
            if (readStream == null) {
                Log.m105920e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
                return new byte[0];
            }
            byte[] b = C88016e.m109545b(readStream);
            StringBuilder sb = new StringBuilder();
            sb.append("loadResource path:");
            sb.append(str);
            sb.append(": ");
            if (b != null) {
                num = Integer.valueOf(b.length);
            }
            sb.append(num);
            sb.append(" success");
            Log.m105924i("Luggage.SkylineResourceLoaderImpl", sb.toString());
            return b;
        } catch (Exception e) {
            Log.m105920e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + e + ", fileStream: " + str);
            return new byte[0];
        }
    }

    public void loadResourceAsync(String str, ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback) {
        ((C119157j) C119157j.f356862d).mo183870a(new C88467a(this, str, resourceLoadCallback));
    }
}
