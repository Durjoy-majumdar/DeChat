package jo0;

import android.graphics.Bitmap;
import android.os.Bundle;
import co0.C80123a;
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
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fl0.C86920e;
import fl0.C86921f;
import java.io.IOException;
import java.util.HashMap;
import js0.C9514m;
import li0.C88508b;
import li0.C88509c;
import p1066yc.C91412i;
import p292ad.C79502b;
import p292ad.b$$a;
import p292ad.b$$g;
import p830xc.C91165a;
import p932bd.C79687a;

/* renamed from: jo0.c */
public class C87995c implements C79687a {

    /* renamed from: a */
    public C79502b f254602a;

    /* renamed from: b */
    public C81823b f254603b;

    /* renamed from: c */
    public String f254604c;

    /* renamed from: d */
    public boolean f254605d = false;

    /* renamed from: e */
    public volatile boolean f254606e = false;

    /* renamed from: f */
    public C88509c.C88512b f254607f = new C87996a();

    /* renamed from: jo0.c$a */
    public class C87996a implements C88509c.C88512b {
        public C87996a() {
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            C79502b bVar2;
            if (!str.equalsIgnoreCase(C87995c.this.f254604c)) {
                return;
            }
            if (bVar == C88508b.BACKGROUND) {
                C79502b bVar3 = C87995c.this.f254602a;
                if (bVar3 != null) {
                    int b = C80127b.m97436b(str);
                    bVar3.getClass();
                    bVar3.mo109503D(new b$$a(bVar3, b));
                }
            } else if (bVar == C88508b.FOREGROUND && (bVar2 = C87995c.this.f254602a) != null) {
                bVar2.getClass();
                bVar2.mo109503D(new b$$g(bVar2));
            }
        }
    }

    /* renamed from: a */
    public void mo122446a(C91165a aVar, Bundle bundle) {
        AppBrandRuntime a = C80127b.m97435a(aVar);
        if (a != null) {
            this.f254604c = a.f238147j;
            a.f238113K.mo122978a(this.f254607f);
            if (bundle.getBoolean(V2TXJSAdapterConstants.IS_VOIP, false)) {
                this.f254605d = true;
                C83127a aVar2 = (C83127a) a.mo113032U(C83127a.class);
                if (aVar2 == null) {
                    Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "registerForBackgroundVOIPIfNeed, no state manager, create one");
                    C83127a aVar3 = new C83127a(a);
                    a.mo113059i(aVar3);
                    C79502b bVar = this.f254602a;
                    aVar3.f242930j.add(bVar);
                    Log.m105925i(aVar3.f242924d, "registerLivePlayer:%s", bVar.mo109508b());
                    return;
                }
                C79502b bVar2 = this.f254602a;
                aVar2.f242930j.add(bVar2);
                Log.m105925i(aVar2.f242924d, "registerLivePlayer:%s", bVar2.mo109508b());
                return;
            }
            this.f254605d = false;
            Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "registerForBackgroundVOIPIfNeed, not voip mode");
        }
    }

    /* renamed from: b */
    public void mo122447b(int i, int i2, Bundle bundle) {
        C81823b bVar;
        C81823b bVar2;
        Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "onXWebLivePlayerEvent, errCode: " + i2);
        if (this.f254606e) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "onXWebLivePlayerEvent, released");
            return;
        }
        if (i2 != -2301) {
            if (i2 == 2004) {
                Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart");
                if (this.f254605d) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, is voip mode");
                    return;
                } else if (this.f254602a == null || (bVar2 = this.f254603b) == null) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
                    return;
                } else {
                    C80123a a = C91412i.m114704a(bVar2);
                    if (a == null) {
                        Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
                        return;
                    } else {
                        a.mo110374w(this.f254602a);
                        return;
                    }
                }
            } else if (i2 != 2006) {
                return;
            }
        }
        Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop");
        if (this.f254605d) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, is voip mode");
        } else if (this.f254602a == null || (bVar = this.f254603b) == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
        } else {
            C80123a a2 = C91412i.m114704a(bVar);
            if (a2 == null) {
                Log.m105928w("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
            } else {
                a2.mo110373u(this.f254602a);
            }
        }
    }

    /* renamed from: c */
    public void mo122448c(C91165a aVar, Bitmap bitmap) {
        if (aVar instanceof C81823b) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105920e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, bitmap is null");
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
                    Log.m105920e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, tempFile is null");
                    mo122449d(bitmap);
                    aVar.mo62551l(C86921f.f252333g);
                    return;
                }
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 90, Bitmap.CompressFormat.JPEG, allocTempFile.mo119971i(), true);
                    if (g.getFileSystem().createTempFileFrom(allocTempFile, "jpg", true, mVar) != C81410b0.OK) {
                        Log.m105920e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save snapshot failed");
                        mo122449d(bitmap);
                        aVar.mo62551l(C86921f.f252333g);
                        return;
                    }
                    C86009m1 absoluteFile = g.getFileSystem().getAbsoluteFile((String) mVar.f29691a);
                    Log.m105925i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, realPath: %s, path:%s", (absoluteFile == null || !absoluteFile.mo119967g()) ? "" : C86013q1.m106448i(absoluteFile.mo119971i(), false), mVar.f29691a);
                    mo122449d(bitmap);
                    HashMap hashMap = new HashMap();
                    hashMap.put("tempImagePath", mVar.f29691a);
                    hashMap.put("width", Integer.valueOf(width));
                    hashMap.put("height", Integer.valueOf(height));
                    aVar.mo62547h(C86920e.f252311a, hashMap);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, save bitmap exception", e);
                    mo122449d(bitmap);
                    aVar.mo62551l(C86921f.f252333g);
                }
            } else {
                Log.m105920e("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "operateSnapshot, file system is null");
                mo122449d(bitmap);
                aVar.mo62551l(C86920e.f252314d);
            }
        }
    }

    /* renamed from: d */
    public final void mo122449d(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "bitmap recycle " + bitmap.toString());
            bitmap.recycle();
        }
    }

    /* renamed from: e */
    public boolean mo122450e(C79502b bVar, C91165a aVar, int i) {
        AppBrandRuntime a = C80127b.m97435a(aVar);
        C83127a aVar2 = a != null ? (C83127a) a.mo113032U(C83127a.class) : null;
        if (aVar2 != null) {
            return aVar2.mo115367k(bVar, i);
        }
        Log.m105918d("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "shouldInterceptEnterBackground, no state manager");
        return false;
    }
}
