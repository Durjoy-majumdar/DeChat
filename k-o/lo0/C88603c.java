package lo0;

import android.graphics.Bitmap;
import android.os.Bundle;
import co0.C80127b;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fl0.C86920e;
import fl0.C86921f;
import io0.C87779d;
import java.io.IOException;
import java.util.HashMap;
import js0.C9514m;
import p1066yc.C91399c0;
import p301cd.C80005q;
import p830xc.C91165a;
import p954dd.C86224a;
import qq0.C89790a;
import qq0.C89816t;

/* renamed from: lo0.c */
public class C88603c implements C86224a {

    /* renamed from: a */
    public boolean f255880a = true;

    /* renamed from: b */
    public boolean f255881b = false;

    /* renamed from: c */
    public volatile boolean f255882c = false;

    /* renamed from: d */
    public AppBrandRuntime f255883d = null;

    /* renamed from: e */
    public C89816t.C89818b f255884e = null;

    /* renamed from: f */
    public C91399c0 f255885f = null;

    /* renamed from: g */
    public int f255886g = -1;

    /* renamed from: h */
    public boolean f255887h = false;

    /* renamed from: lo0.c$a */
    public class C88604a implements C87779d.C87780a {

        /* renamed from: a */
        public final /* synthetic */ C86224a.C86225a f255888a;

        /* renamed from: b */
        public final /* synthetic */ C91165a f255889b;

        /* renamed from: c */
        public final /* synthetic */ String f255890c;

        public C88604a(C88603c cVar, C86224a.C86225a aVar, C91165a aVar2, String str) {
            this.f255888a = aVar;
            this.f255889b = aVar2;
            this.f255890c = str;
        }

        /* renamed from: a */
        public void mo122230a(String str) {
            C86224a.C86225a aVar = this.f255888a;
            if (aVar == null) {
                return;
            }
            if (str == null) {
                this.f255889b.mo62551l(C86921f.f252339m);
                this.f255888a.mo110255b(this.f255890c);
                return;
            }
            aVar.mo110249a(this.f255890c, C86013q1.m106448i(str, false));
        }
    }

    /* renamed from: a */
    public final void mo123044a() {
        Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBarOrDismiss");
        if (!this.f255882c || !this.f255880a) {
            if (this.f255884e != null) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "dismissBlink");
                this.f255884e.dismiss();
                this.f255884e = null;
            }
        } else if (this.f255884e != null) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar, already blink");
        } else if (this.f255883d != null) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "blinkCapsuleBar");
            this.f255884e = C89790a.C89791a.m112271a(this.f255883d).mo124076f(C89790a.C89793b.VOICE);
        }
    }

    /* renamed from: b */
    public String mo123045b(C91165a aVar, Bundle bundle) {
        C88615f fVar;
        boolean z = this.f255881b;
        boolean z2 = bundle.getBoolean(V2TXJSAdapterConstants.IS_VOIP, z);
        Log.m105925i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, oldIsVoip: %b, newIsVoip: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.f255881b = z2;
        if (!z2 || z) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, can for not voip mode");
            return null;
        }
        AppBrandRuntime a = C80127b.m97435a(aVar);
        if (a == null || (fVar = (C88615f) a.mo113032U(C88615f.class)) == null) {
            return null;
        }
        String W = fVar.mo117459W(a.f238147j, a.f238149o.f239365g);
        Log.m105925i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "checkCanInsertLivePusher, can not insert live pusher, message:%s", W);
        return W;
    }

    /* renamed from: c */
    public void mo123046c(C91165a aVar, String str, String str2, boolean z, C86224a.C86225a aVar2) {
        if (!(aVar instanceof C81823b)) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, invokeContext is not AppBrandInvokeContext");
            if (aVar != null) {
                aVar.mo62551l(C86920e.f252314d);
            }
            if (aVar2 != null) {
                aVar2.mo110255b(str);
            }
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, resourcePath is null");
            aVar.mo62552m("fail:resource path is empty", C86920e.f252317g);
            if (aVar2 != null) {
                aVar2.mo110255b(str);
            }
        } else {
            C82381f g = aVar.mo62544g();
            if (g == null) {
                Log.m105928w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "convertResourcePathToLocalPath, component is null");
                aVar.mo62551l(C86920e.f252314d);
                if (aVar2 != null) {
                    aVar2.mo110255b(str);
                    return;
                }
                return;
            }
            C87779d.m109218e(g, str, z, str2, new C88604a(this, aVar2, aVar, str));
        }
    }

    /* renamed from: d */
    public final C83127a mo123047d(C91165a aVar) {
        AppBrandRuntime a = C80127b.m97435a(aVar);
        if (a != null) {
            return (C83127a) a.mo113032U(C83127a.class);
        }
        return null;
    }

    /* renamed from: e */
    public void mo123048e(C91165a aVar, Bitmap bitmap) {
        if (aVar instanceof C81823b) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105920e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, bitmap is null");
                aVar.mo62551l(C86921f.f252332f);
                return;
            }
            C82381f g = aVar.mo62544g();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C9514m mVar = new C9514m();
            if (g.getFileSystem() != null) {
                C81415h0 fileSystem = g.getFileSystem();
                C86009m1 allocTempFile = fileSystem.allocTempFile("liveplayer_" + System.currentTimeMillis() + ".jpg");
                if (allocTempFile == null) {
                    Log.m105920e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, tempFile is null");
                    mo123051h(bitmap);
                    aVar.mo62551l(C86921f.f252333g);
                    return;
                }
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 90, Bitmap.CompressFormat.JPEG, allocTempFile.mo119971i(), true);
                    if (g.getFileSystem().createTempFileFrom(allocTempFile, "jpg", true, mVar) != C81410b0.OK) {
                        Log.m105920e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save snapshot failed");
                        mo123051h(bitmap);
                        aVar.mo62551l(C86921f.f252333g);
                        return;
                    }
                    C86009m1 absoluteFile = g.getFileSystem().getAbsoluteFile((String) mVar.f29691a);
                    Log.m105925i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, realPath: %s, path:%s", (absoluteFile == null || !absoluteFile.mo119967g()) ? "" : C86013q1.m106448i(absoluteFile.mo119971i(), false), mVar.f29691a);
                    mo123051h(bitmap);
                    HashMap hashMap = new HashMap();
                    hashMap.put("tempImagePath", mVar.f29691a);
                    hashMap.put("width", Integer.valueOf(width));
                    hashMap.put("height", Integer.valueOf(height));
                    aVar.mo62547h(C86920e.f252311a, hashMap);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, save bitmap exception", e);
                    mo123051h(bitmap);
                    aVar.mo62551l(C86921f.f252333g);
                }
            } else {
                Log.m105920e("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operateSnapshot, file system is null");
                mo123051h(bitmap);
                aVar.mo62551l(C86920e.f252314d);
            }
        }
    }

    /* renamed from: f */
    public void mo123049f(C80005q qVar, C91165a aVar) {
        this.f255882c = false;
        mo123044a();
        C83127a d = mo123047d(aVar);
        if (d != null) {
            AppBrandRuntime a = C80127b.m97435a(aVar);
            if (a != null) {
                Log.m105925i(d.f242924d, "onPushEnd, runtime:%s, LivePusher:%s", a.f238147j, qVar.mo109508b());
                d.mo115366e(a, 2);
                synchronized (a.f238110H) {
                    a.f238110H.remove(d);
                }
            }
        } else {
            Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushEnd, no state manager");
        }
        C91399c0 c0Var = this.f255885f;
        if (c0Var != null) {
            c0Var.onStop();
        } else {
            this.f255886g = 6;
        }
    }

    /* renamed from: g */
    public void mo123050g(C80005q qVar, C91165a aVar, Bundle bundle) {
        boolean z;
        this.f255880a = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, this.f255880a);
        mo123044a();
        if (bundle.getBoolean(V2TXJSAdapterConstants.IS_VOIP, false)) {
            C83127a d = mo123047d(aVar);
            AppBrandRuntime a = C80127b.m97435a(aVar);
            if (d == null) {
                Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed, no state manager, create one");
                d = new C83127a(a);
                a.mo113059i(d);
                z = true;
            } else {
                z = false;
            }
            if (qVar != null) {
                d.f242929i = qVar;
                Log.m105925i(d.f242924d, "registerLivePusher:%s", qVar.mo109508b());
            }
            d.mo115365d(C80127b.m97435a(aVar), this.f255880a);
            if (z && this.f255882c) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed, is pushing");
                AppBrandRuntime a2 = C80127b.m97435a(aVar);
                Log.m105925i(d.f242924d, "onPushBegin, runtime:%s, LivePusher:%s", a2.f238147j, qVar.mo109508b());
                d.mo115366e(a2, 1);
                return;
            }
            return;
        }
        Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "registerForBackgroundVOIPIfNeed, not voip");
    }

    /* renamed from: h */
    public final void mo123051h(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "bitmap recycle " + bitmap.toString());
            bitmap.recycle();
        }
    }
}
