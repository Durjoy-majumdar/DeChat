package fo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.skia_canvas.resource_loader.IResourceLoader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import km0.C88224a;
import km0.C88226c;
import p224ra.C89909e;
import s24.C90125c;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: fo0.g */
public class C87019g implements IResourceLoader {

    /* renamed from: a */
    public C81925i2 f252527a;

    /* renamed from: b */
    public C91759b f252528b;

    /* renamed from: c */
    public C91755a f252529c;

    /* renamed from: fo0.g$a */
    public class C87020a implements C91755a.C91758c {

        /* renamed from: a */
        public final /* synthetic */ IResourceLoader.ResourceLoadCallback f252530a;

        /* renamed from: fo0.g$a$a */
        public class C87021a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ byte[] f252532d;

            public C87021a(byte[] bArr) {
                this.f252532d = bArr;
            }

            public void run() {
                IResourceLoader.ResourceLoadCallback resourceLoadCallback = C87020a.this.f252530a;
                if (resourceLoadCallback != null) {
                    resourceLoadCallback.onResourceLoaded(this.f252532d);
                }
            }
        }

        public C87020a(IResourceLoader.ResourceLoadCallback resourceLoadCallback) {
            this.f252530a = resourceLoadCallback;
        }

        /* renamed from: a */
        public void mo121428a(InputStream inputStream) {
            if (inputStream == null) {
                try {
                    Log.m105920e("MicroMsg.WxaNativeImageLoader", "inputStream is null, error");
                    IResourceLoader.ResourceLoadCallback resourceLoadCallback = this.f252530a;
                    if (resourceLoadCallback != null) {
                        resourceLoadCallback.onResourceLoaded((byte[]) null);
                    }
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.WxaNativeImageLoader", "loadResource Async fail: %s", e.getMessage());
                    IResourceLoader.ResourceLoadCallback resourceLoadCallback2 = this.f252530a;
                    if (resourceLoadCallback2 != null) {
                        resourceLoadCallback2.onResourceLoaded((byte[]) null);
                    }
                }
            } else {
                byte[] c = C90125c.m112776c(inputStream);
                Log.m105925i("MicroMsg.WxaNativeImageLoader", "loadResourceAsync bytes:%b", true);
                if (C87019g.this.f252527a.getJsRuntime() == null) {
                    Log.m105920e("MicroMsg.WxaNativeImageLoader", "js runtime is null, error");
                    IResourceLoader.ResourceLoadCallback resourceLoadCallback3 = this.f252530a;
                    if (resourceLoadCallback3 != null) {
                        resourceLoadCallback3.onResourceLoaded((byte[]) null);
                        return;
                    }
                    return;
                }
                C83181q qVar = (C83181q) C87019g.this.f252527a.getJsRuntime().mo63321n0(C83181q.class);
                if (qVar != null) {
                    qVar.post(new C87021a(c));
                }
            }
        }
    }

    /* renamed from: fo0.g$b */
    public class C87022b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f252534d;

        /* renamed from: e */
        public final /* synthetic */ IResourceLoader.ResourceLoadCallback f252535e;

        public C87022b(String str, IResourceLoader.ResourceLoadCallback resourceLoadCallback) {
            this.f252534d = str;
            this.f252535e = resourceLoadCallback;
        }

        public void run() {
            try {
                byte[] c = C90125c.m112776c(C87019g.this.f252527a.getFileSystem().readStream(this.f252534d));
                Log.m105925i("MicroMsg.WxaNativeImageLoader", "loadResource bytes:%b", true);
                IResourceLoader.ResourceLoadCallback resourceLoadCallback = this.f252535e;
                if (resourceLoadCallback != null) {
                    resourceLoadCallback.onResourceLoaded(c);
                }
            } catch (IOException | NullPointerException e) {
                Log.m105921e("MicroMsg.WxaNativeImageLoader", "loadResource sync fail: %s", e.getMessage());
                IResourceLoader.ResourceLoadCallback resourceLoadCallback2 = this.f252535e;
                if (resourceLoadCallback2 != null) {
                    resourceLoadCallback2.onResourceLoaded((byte[]) null);
                }
            }
        }
    }

    public C87019g(C91759b bVar, C91755a aVar, C81925i2 i2Var) {
        this.f252528b = bVar;
        this.f252529c = aVar;
        this.f252527a = i2Var;
    }

    public byte[] loadResource(String str, String str2) {
        C81925i2 i2Var;
        if (this.f252529c == null || this.f252528b == null || (i2Var = this.f252527a) == null) {
            Log.m105920e("MicroMsg.WxaNativeImageLoader", "mImageLoader or mUrlBuilder is null, return");
            return null;
        }
        try {
            byte[] c = C90125c.m112776c(i2Var.getFileSystem().readStream(str));
            Log.m105925i("MicroMsg.WxaNativeImageLoader", "loadResource bytes:%b", true);
            return c;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.WxaNativeImageLoader", "loadResource sync fail: %s", e.getMessage());
            return null;
        }
    }

    public void loadResourceAsync(String str, String str2, IResourceLoader.ResourceLoadCallback resourceLoadCallback) {
        Map map = null;
        if (this.f252529c == null || this.f252528b == null || this.f252527a == null || Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.WxaNativeImageLoader", "mImageLoader or mUrlBuilder or path:%s is null, return", str);
            resourceLoadCallback.onResourceLoaded((byte[]) null);
        } else if (str.startsWith("http") || str.startsWith(C113600ck.f339986i)) {
            String nO = this.f252528b.mo115838nO(this.f252527a, str);
            Log.m105925i("MicroMsg.WxaNativeImageLoader", "finalUrl : %s", nO);
            C91755a aVar = this.f252529c;
            C88224a aVar2 = (C88224a) C89909e.m112436a(C88224a.class);
            if (aVar2 == null) {
                Log.m105928w("MicroMsg.WxaNativeImageLoader", "buildHeaders, referrerHelper is null");
            } else if (str2 == null) {
                Log.m105928w("MicroMsg.WxaNativeImageLoader", "buildHeaders, referrerPolicyStr is null");
            } else {
                C88226c kn = aVar2.mo117494kn(str2);
                if (kn == null) {
                    C81925i2 i2Var = this.f252527a;
                    if (i2Var != null) {
                        kn = aVar2.mo117492eV(i2Var);
                    } else {
                        Log.m105928w("MicroMsg.WxaNativeImageLoader", "buildHeaders, mAppBrandService is null");
                    }
                }
                if (kn == null) {
                    kn = aVar2.mo117491e4();
                }
                if (C88226c.NO_REFERRER != kn) {
                    C81925i2 i2Var2 = this.f252527a;
                    if (i2Var2 == null) {
                        Log.m105928w("MicroMsg.WxaNativeImageLoader", "buildHeaders, mAppBrandService is null");
                    } else {
                        String A4 = aVar2.mo117489A4(i2Var2);
                        Log.m105924i("MicroMsg.WxaNativeImageLoader", "buildHeaders, referrer: " + A4);
                        if (A4 != null) {
                            map = Collections.singletonMap("Referer", A4);
                        }
                    }
                }
            }
            aVar.mo124757N0(nO, map, new C87020a(resourceLoadCallback));
        } else if (this.f252527a.getJsRuntime() == null) {
            Log.m105920e("MicroMsg.WxaNativeImageLoader", "js runtime is null, error");
            if (resourceLoadCallback != null) {
                resourceLoadCallback.onResourceLoaded((byte[]) null);
            }
        } else {
            C83181q qVar = (C83181q) this.f252527a.getJsRuntime().mo63321n0(C83181q.class);
            if (qVar != null) {
                qVar.post(new C87022b(str, resourceLoadCallback));
            }
        }
    }
}
