package po0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import br0.C39836d;
import br0.C79773b;
import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import in0.C21113g;
import in0.C87759c;
import in0.C87760d;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import js0.C9514m;
import kn0.C21365k;
import kn0.C88232e;
import kn0.C88236n;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import p830xc.C91165a;
import p964fd.C86826e;
import p964fd.C86838o;
import p964fd.C86839p;
import p975hd.C87476a;
import p975hd.C87477b;
import p975hd.C87478c;
import p975hd.C87480d;
import p975hd.C87481e;
import p975hd.C87482f;
import qo0.C89727c;
import so0.C90268a;
import so0.a$$a;
import so0.a$$c;
import ym0.C91509g;
import ym0.C91515l;
import ym0.C91516n;

/* renamed from: po0.e */
public class C89415e implements C87477b {

    /* renamed from: a */
    public C79773b f257431a;

    /* renamed from: b */
    public C86826e f257432b;

    /* renamed from: c */
    public final C90268a f257433c;

    /* renamed from: d */
    public String f257434d;

    /* renamed from: e */
    public C88509c.C88512b f257435e = new C89419d();

    /* renamed from: po0.e$a */
    public class C89416a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f257436d;

        /* renamed from: e */
        public final /* synthetic */ int f257437e;

        public C89416a(C83780d1 d1Var, int i) {
            this.f257436d = d1Var;
            this.f257437e = i;
        }

        public void run() {
            C83797e3 e3Var;
            if (!this.f257436d.isRunning() || (e3Var = this.f257436d.f244558J) == null) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, invalid state");
                return;
            }
            C39836d fullscreenImpl = e3Var.getFullscreenImpl();
            View wrapperView = this.f257436d.f244558J.getWrapperView();
            if (fullscreenImpl == null || wrapperView == null) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", fullscreenImpl, wrapperView);
                return;
            }
            fullscreenImpl.mo62475c(wrapperView, this.f257437e);
            C79773b bVar = C89415e.this.f257431a;
            if (bVar != null) {
                fullscreenImpl.mo62473a(bVar);
            }
            Log.m105925i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, target orientation:%s", Integer.valueOf(this.f257437e));
        }
    }

    /* renamed from: po0.e$b */
    public class C89417b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f257439d;

        public C89417b(C89415e eVar, C83780d1 d1Var) {
            this.f257439d = d1Var;
        }

        public void run() {
            C83797e3 e3Var;
            if (!this.f257439d.isRunning() || (e3Var = this.f257439d.f244558J) == null) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, invalid state");
                return;
            }
            C39836d fullscreenImpl = e3Var.getFullscreenImpl();
            if (fullscreenImpl != null) {
                fullscreenImpl.mo62476d();
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen");
                return;
            }
            Log.m105920e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, state error");
        }
    }

    /* renamed from: po0.e$c */
    public class C89418c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f257440d;

        /* renamed from: e */
        public final /* synthetic */ float f257441e;

        public C89418c(C89415e eVar, Activity activity, float f) {
            this.f257440d = activity;
            this.f257441e = f;
        }

        public void run() {
            WindowManager.LayoutParams attributes = this.f257440d.getWindow().getAttributes();
            float f = this.f257441e;
            if (f < 0.01f) {
                f = 0.01f;
            }
            attributes.screenBrightness = f;
            this.f257440d.getWindow().setAttributes(attributes);
            Log.m105929w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "setScreenBrightness, brightness:%s", Float.valueOf(attributes.screenBrightness));
        }
    }

    /* renamed from: po0.e$d */
    public class C89419d implements C88509c.C88512b {
        public C89419d() {
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            C86826e eVar;
            if (str.equalsIgnoreCase(C89415e.this.f257434d)) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "onRunningStateChanged, state: " + bVar);
                if (bVar == C88508b.BACKGROUND) {
                    C86826e eVar2 = C89415e.this.f257432b;
                    if (eVar2 != null) {
                        eVar2.getClass();
                        eVar2.mo121276K(new C86839p(eVar2));
                    }
                } else if (bVar == C88508b.FOREGROUND && (eVar = C89415e.this.f257432b) != null) {
                    eVar.getClass();
                    eVar.mo121276K(new C86838o(eVar));
                }
            }
        }
    }

    public C89415e() {
        C89727c cVar = (C89727c) C89909e.m112436a(C89727c.class);
        if (cVar != null) {
            this.f257431a = cVar.mo116771FG();
        }
        this.f257433c = mo123084a();
    }

    /* renamed from: A */
    public C87478c mo121924A() {
        return new C89420f();
    }

    /* renamed from: B */
    public void mo121925B(C91165a aVar, C87760d dVar, String str) {
        C86826e eVar;
        C87480d dVar2;
        C87760d dVar3 = dVar;
        String str2 = str;
        Class cls = C91509g.class;
        boolean c = mo123085c(dVar3);
        long D = (!c || C89909e.m112436a(cls) == null) ? 0 : ((C91509g) C89909e.m112436a(cls)).mo123036D(str, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
        if (D < 0) {
            D = 0;
        }
        Log.m105925i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "onVideoPathChanged, videoPath:%s, cachedSize:%s, isSupportGetCachedBytes: %b", str2, Long.valueOf(D), Boolean.valueOf(c));
        if (!(!c || (eVar = this.f257432b) == null || (dVar2 = eVar.f252035i) == null)) {
            C89421g gVar = (C89421g) dVar2;
            gVar.getClass();
            try {
                JSONObject b = gVar.mo123741b();
                b.put("preloadSize", D);
                gVar.mo123740a(new g$$h((C89422h) null), b);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoPreloadedMetaData fail", e);
            }
        }
        C90268a aVar2 = this.f257433c;
        C87481e b2 = mo123735b();
        aVar2.getClass();
        if (dVar3 != null && b2 != null && !Util.isNullOrNil(str)) {
            C89424j jVar = (C89424j) b2;
            jVar.mo123753a(1234, 10, 1, false);
            if (D > 0) {
                C89424j jVar2 = jVar;
                jVar2.mo123753a(1234, 11, 1, false);
                long longValue = BigInteger.valueOf(D).divide(C90268a.f259093b).longValue();
                jVar2.mo123753a(1234, 13, longValue, false);
                Log.m105919d("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onVideoPathChanged, cachedSize:%s, cachedSizeInKB:%s", Long.valueOf(D), Long.valueOf(longValue));
            }
            a$$c a__c = aVar2.f259094a;
            a__c.getClass();
            if (!Util.isNullOrNil(str)) {
                a__c.f259096a = str.length() > 512 ? str2.substring(0, 512) : str2;
            } else {
                a__c.f259096a = "";
            }
            aVar2.f259094a.f259099d = D;
        }
    }

    /* renamed from: C */
    public void mo121926C(C91165a aVar, C87760d dVar) {
        C87760d dVar2 = dVar;
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        aVar2.getClass();
        if (dVar2 != null && b != null) {
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259106k <= 0) {
                Log.m105920e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, but has not call onMediaPlayerVideoBufferStart, why?");
                return;
            }
            if (a__c.f259107l <= 0) {
                a__c.f259107l = Util.nowMilliSecond();
                C89424j jVar = (C89424j) b;
                jVar.mo123753a(1234, 51, 1, false);
                a$$c a__c2 = aVar2.f259094a;
                long j = a__c2.f259107l - a__c2.f259106k;
                a__c2.f259105j += j;
                jVar.mo123753a(1234, 53, j, false);
                Log.m105925i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", Long.valueOf(j));
                if (C91515l.m114819c(dVar)) {
                    C89424j jVar2 = jVar;
                    jVar2.mo123753a(1234, 99, 1, false);
                    jVar2.mo123753a(1234, 101, j, false);
                } else if (aVar2.mo123087b(dVar2)) {
                    C89424j jVar3 = jVar;
                    jVar3.mo123753a(1234, 104, 1, false);
                    jVar3.mo123753a(1234, 106, j, false);
                }
            }
            a$$c a__c3 = aVar2.f259094a;
            a__c3.f259106k = 0;
            a__c3.f259107l = 0;
        }
    }

    /* renamed from: D */
    public C87481e mo121927D() {
        return new C89424j();
    }

    /* renamed from: E */
    public void mo121928E(C91165a aVar, C87760d dVar, int i, int i2, String str) {
        C87760d dVar2 = dVar;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        aVar2.getClass();
        if (dVar2 != null && b != null) {
            C89424j jVar = (C89424j) b;
            jVar.mo123753a(1234, 65, 1, false);
            Log.m105925i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoError, what:%s, extra:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str2);
            if (C91515l.m114819c(dVar)) {
                jVar.mo123753a(1234, 75, 1, false);
            } else if (aVar2.mo123087b(dVar2)) {
                jVar.mo123753a(1234, 109, 1, false);
            } else if (C91515l.m114820d(dVar)) {
                jVar.mo123753a(1234, 70, 1, false);
            }
            if (!C91515l.m114820d(dVar)) {
                C87759c a = aVar2.mo123086a(i3, i4);
                if (a != null) {
                    switch (a.ordinal()) {
                        case 0:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 125, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 116, 1, false);
                                break;
                            }
                            break;
                        case 1:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 126, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 117, 1, false);
                                break;
                            }
                            break;
                        case 2:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 127, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 118, 1, false);
                                break;
                            }
                            break;
                        case 3:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 128, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 119, 1, false);
                                break;
                            }
                            break;
                        case 4:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 129, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 120, 1, false);
                                break;
                            }
                            break;
                        case 5:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 130, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 121, 1, false);
                                break;
                            }
                            break;
                        case 6:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 131, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 122, 1, false);
                                break;
                            }
                            break;
                        case 7:
                            if (!C91515l.m114819c(dVar)) {
                                if (aVar2.mo123087b(dVar2)) {
                                    jVar.mo123753a(1234, 132, 1, false);
                                    break;
                                }
                            } else {
                                jVar.mo123753a(1234, 123, 1, false);
                                break;
                            }
                            break;
                    }
                }
            } else if (!Util.isNullOrNil(str)) {
                if (str2.equalsIgnoreCase("MEDIA_ERR_NETWORK")) {
                    jVar.mo123753a(1234, 72, 1, false);
                } else if (str2.equalsIgnoreCase("MEDIA_ERR_DECODE")) {
                    jVar.mo123753a(1234, 73, 1, false);
                } else if (str2.equalsIgnoreCase("MEDIA_ERR_SRC_NOT_SUPPORTED")) {
                    jVar.mo123753a(1234, 71, 1, false);
                } else {
                    jVar.mo123753a(1234, 74, 1, false);
                }
            }
            a$$c a__c = aVar2.f259094a;
            a__c.f259110o = i3;
            a__c.f259111p = i4;
            a__c.f259112q = str2;
        }
    }

    /* renamed from: F */
    public void mo121929F(C91165a aVar, C87760d dVar) {
        C87760d dVar2 = dVar;
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        aVar2.getClass();
        if (dVar2 != null && b != null) {
            if (4 == dVar.getPlayerType()) {
                aVar2.f259094a.f259097b = 3;
            } else if (aVar2.mo123087b(dVar2)) {
                aVar2.f259094a.f259097b = 2;
            } else if (C91515l.m114819c(dVar)) {
                aVar2.f259094a.f259097b = 1;
            } else if (C91515l.m114820d(dVar)) {
                aVar2.f259094a.f259097b = 0;
            }
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259101f <= 0) {
                a__c.f259101f = Util.nowMilliSecond();
                C89424j jVar = (C89424j) b;
                jVar.mo123753a(1234, 20, 1, false);
                if (C91515l.m114819c(dVar)) {
                    jVar.mo123753a(1234, 45, 1, false);
                } else if (aVar2.mo123087b(dVar2)) {
                    jVar.mo123753a(1234, 92, 1, false);
                } else if (C91515l.m114820d(dVar)) {
                    jVar.mo123753a(1234, 40, 1, false);
                }
            }
        }
    }

    /* renamed from: G */
    public String mo121930G(C91165a aVar, String str) {
        Class cls = C91509g.class;
        if (!(aVar instanceof C81823b)) {
            return str;
        }
        if (!Util.isNullOrNil(str) && str.startsWith("cloud://")) {
            return null;
        }
        C82381f g = aVar.mo62544g();
        if (Util.isNullOrNil(str) || g == null || g.getFileSystem() == null || !g.getFileSystem().accept(str)) {
            return (Util.isNullOrNil(str) || C89909e.m112436a(cls) == null) ? str : ((C91509g) C89909e.m112436a(cls)).f00(str);
        }
        C86009m1 absoluteFile = g.getFileSystem().getAbsoluteFile(str);
        if (absoluteFile != null) {
            str = "file://" + absoluteFile.mo119971i();
        }
        Log.m105925i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "convertVideoPath, videoPath:%s", str);
        return str;
    }

    /* renamed from: H */
    public boolean mo121931H(C91165a aVar) {
        if (!(aVar instanceof C81823b)) {
            return false;
        }
        C82381f g = ((C81823b) aVar).mo62544g();
        C83780d1 d1Var = null;
        if (g instanceof C83780d1) {
            d1Var = (C83780d1) g;
        } else if (g instanceof C81925i2) {
            d1Var = ((C81925i2) g).mo114341l0();
        }
        if (d1Var == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "exitFullscreen, page view is null");
            return false;
        }
        d1Var.mo109673t(new C89417b(this, d1Var));
        return true;
    }

    /* renamed from: I */
    public void mo121932I(C21365k.C21377b bVar) {
        C90268a aVar = this.f257433c;
        C87481e b = mo123735b();
        aVar.getClass();
        if (b != null) {
            if (bVar.f60477a) {
                ((C89424j) b).mo123753a(1234, 134, 1, false);
            }
            if (bVar.f60478b) {
                ((C89424j) b).mo123753a(1234, 135, 1, false);
            }
        }
    }

    /* renamed from: J */
    public void mo121933J(C91165a aVar) {
        if (aVar instanceof C81823b) {
            C82381f g = aVar.mo62544g();
            this.f257434d = g.getAppId();
            AppBrandRuntime appBrandRuntime = null;
            if (g instanceof C81925i2) {
                appBrandRuntime = ((C81925i2) g).getRuntime();
            } else if (g instanceof C83780d1) {
                appBrandRuntime = ((C83780d1) g).getRuntime();
            }
            if (appBrandRuntime != null && !C91516n.m114822a(appBrandRuntime.f238147j)) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "addOnRunningStateChangedListener");
                appBrandRuntime.f238113K.mo122978a(this.f257435e);
            }
        }
    }

    /* renamed from: K */
    public void mo121934K(C91165a aVar) {
        if (aVar instanceof C81823b) {
            C82381f g = aVar.mo62544g();
            AppBrandRuntime appBrandRuntime = null;
            if (g instanceof C81925i2) {
                appBrandRuntime = ((C81925i2) g).getRuntime();
            } else if (g instanceof C83780d1) {
                appBrandRuntime = ((C83780d1) g).getRuntime();
            }
            if (appBrandRuntime != null) {
                if (!C91516n.m114822a(appBrandRuntime.f238147j)) {
                    Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "removeOnRunningStateChangedListener");
                    appBrandRuntime.f238113K.mo122982e(this.f257435e);
                }
                Log.m105918d("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "markVideoPlayerRelease");
                if (this.f257432b == null) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "markVideoPlayerRelease, pluginHandler is null");
                    return;
                }
                C80123a aVar2 = (C80123a) appBrandRuntime.mo113032U(C80123a.class);
                if (aVar2 == null) {
                    Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "markVideoPlayerRelease, audioOfVideoBackgroundPlayManager is null");
                } else {
                    aVar2.mo110375x(this.f257432b);
                }
            }
        }
    }

    /* renamed from: L */
    public C89402b mo121935L(C87476a aVar, C91165a aVar2) {
        return new C89402b(aVar, aVar2);
    }

    /* renamed from: M */
    public C87480d mo121936M() {
        return new C89421g();
    }

    /* renamed from: N */
    public C87482f mo121937N() {
        return new C89425k();
    }

    /* renamed from: O */
    public boolean mo121938O(C91165a aVar) {
        int i = 0;
        if (!(aVar instanceof C81823b)) {
            return false;
        }
        JSONObject b = aVar.mo62539b();
        C82381f g = ((C81823b) aVar).mo62544g();
        C83780d1 d1Var = null;
        if (g instanceof C83780d1) {
            d1Var = (C83780d1) g;
        } else if (g instanceof C81925i2) {
            d1Var = ((C81925i2) g).mo114341l0();
        }
        if (d1Var == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, page view is null");
            return false;
        }
        if (b != null && b.has("data")) {
            JSONArray optJSONArray = b.optJSONArray("data");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "requestFullscreen, data array is null");
            } else {
                int optInt = optJSONArray.optInt(0, 90);
                if (optInt == -90) {
                    i = -90;
                } else if (optInt != 0) {
                    i = 90;
                }
                d1Var.mo109673t(new C89416a(d1Var, i));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C90268a mo123084a() {
        return new C90268a();
    }

    /* renamed from: b */
    public final C87481e mo123735b() {
        C86826e eVar = this.f257432b;
        if (eVar != null) {
            return eVar.f252044o;
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo123085c(C87760d dVar) {
        return true;
    }

    /* renamed from: d */
    public final void mo123736d(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "bitmap recycle " + bitmap.toString());
            bitmap.recycle();
        }
    }

    /* renamed from: q */
    public C87760d mo121939q(C91165a aVar, Handler handler) {
        C91165a aVar2 = aVar;
        if (!(aVar2 instanceof C81823b)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C89426l lVar = (C89426l) C89909e.m112436a(C89426l.class);
        C87760d gVar = lVar == null ? new C21113g() : lVar.mo123094q(aVar2, handler);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C90268a aVar3 = this.f257433c;
        C87481e b = mo123735b();
        aVar3.getClass();
        if (!(gVar == null || b == null)) {
            if (4 == gVar.getPlayerType()) {
                C89424j jVar = (C89424j) b;
                jVar.mo123753a(1234, 140, 1, false);
                jVar.mo123753a(1234, 141, currentTimeMillis2, false);
                aVar3.f259094a.f259097b = 3;
            } else if (aVar3.mo123087b(gVar)) {
                C89424j jVar2 = (C89424j) b;
                jVar2.mo123753a(1234, 87, 1, false);
                jVar2.mo123753a(1234, 88, currentTimeMillis2, false);
                aVar3.f259094a.f259097b = 2;
            } else if (C91515l.m114819c(gVar)) {
                C89424j jVar3 = (C89424j) b;
                jVar3.mo123753a(1234, 3, 1, false);
                jVar3.mo123753a(1234, 4, currentTimeMillis2, false);
                aVar3.f259094a.f259097b = 1;
            } else if (C91515l.m114820d(gVar)) {
                C89424j jVar4 = (C89424j) b;
                jVar4.mo123753a(1234, 0, 1, false);
                jVar4.mo123753a(1234, 1, currentTimeMillis2, false);
                aVar3.f259094a.f259097b = 0;
            }
            ((C89424j) b).mo123753a(1234, 6, 1, false);
            aVar3.f259094a.f259098c = currentTimeMillis2;
            C88236n nVar = (C88236n) gVar.mo22544o(C88236n.class);
            if (nVar != null) {
                a$$c a__c = aVar3.f259094a;
                C88236n.C88238b bVar = nVar.f255058Z;
                if (bVar == null) {
                    C88236n.C88238b bVar2 = new C88236n.C88238b(nVar.f255056X, false, false, C88232e.f255047a);
                    Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "getExtraInfo, extraInfo: " + bVar2);
                    nVar.f255058Z = bVar2;
                    bVar = bVar2;
                }
                a__c.f259113r = bVar;
                nVar.f255059a0 = new a$$a(aVar3);
            }
        }
        return gVar;
    }

    /* renamed from: r */
    public boolean mo121940r(C91165a aVar) {
        if (!(aVar instanceof C81823b)) {
            return false;
        }
        JSONObject b = aVar.mo62539b();
        C82381f g = ((C81823b) aVar).mo62544g();
        C83780d1 d1Var = null;
        if (g instanceof C83780d1) {
            d1Var = (C83780d1) g;
        } else if (g instanceof C81925i2) {
            d1Var = ((C81925i2) g).mo114341l0();
        }
        if (d1Var == null) {
            Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "setScreenBrightness, page view is null");
            return false;
        }
        if (b != null && b.has("data")) {
            JSONArray optJSONArray = b.optJSONArray("data");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.m105928w("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "setScreenBrightness, data array is null");
            } else {
                float optDouble = (float) optJSONArray.optDouble(0, -1.0d);
                if (!Float.isNaN(optDouble) && optDouble >= 0.0f && optDouble <= 1.0f && (d1Var.getContext() instanceof Activity)) {
                    MMHandlerThread.postToMainThread(new C89418c(this, (Activity) d1Var.getContext(), optDouble));
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public void mo121941s(C91165a aVar, C87760d dVar) {
        if (aVar != null && C91516n.m114822a(aVar.getAppId())) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "onMediaPlayerVideoFirstFrame, send play event");
            new AppBrandVideoPlayEvent().publish();
        }
    }

    /* renamed from: t */
    public void mo121942t(C91165a aVar, Bitmap bitmap) {
        if (aVar instanceof C81823b) {
            if (bitmap.isRecycled()) {
                Log.m105920e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, bitmap is null");
                aVar.mo62549j("fail:snapshot error");
                return;
            }
            C82381f g = aVar.mo62544g();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C9514m mVar = new C9514m();
            if (g.getFileSystem() != null) {
                C81415h0 fileSystem = g.getFileSystem();
                C86009m1 allocTempFile = fileSystem.allocTempFile("video_" + System.currentTimeMillis() + ".jpg");
                if (allocTempFile == null) {
                    Log.m105920e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, tempFile is null");
                    mo123736d(bitmap);
                    aVar.mo62549j("fail:snapshot error");
                    return;
                }
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 90, Bitmap.CompressFormat.JPEG, allocTempFile.mo119971i(), true);
                    if (g.getFileSystem().createTempFileFrom(allocTempFile, "jpg", true, mVar) != C81410b0.OK) {
                        Log.m105920e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, save snapshot failed");
                        mo123736d(bitmap);
                        aVar.mo62549j("fail:snapshot error");
                        return;
                    }
                    C86009m1 absoluteFile = g.getFileSystem().getAbsoluteFile((String) mVar.f29691a);
                    Log.m105925i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, realPath: %s, path:%s", (absoluteFile == null || !absoluteFile.mo119967g()) ? "" : C86013q1.m106448i(absoluteFile.mo119971i(), false), mVar.f29691a);
                    mo123736d(bitmap);
                    HashMap hashMap = new HashMap();
                    hashMap.put("tempImagePath", mVar.f29691a);
                    hashMap.put("width", Integer.valueOf(width));
                    hashMap.put("height", Integer.valueOf(height));
                    aVar.mo62550k("ok", hashMap);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, save bitmap exception", e);
                    mo123736d(bitmap);
                    aVar.mo62549j("fail:snapshot error");
                }
            } else {
                Log.m105920e("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "operateSnapshot, file system is null");
                mo123736d(bitmap);
                aVar.mo62549j("fail");
            }
        }
    }

    /* renamed from: u */
    public C87476a mo121943u() {
        return new C89392a();
    }

    /* renamed from: v */
    public void mo121944v(C91165a aVar, C87760d dVar) {
        C87760d dVar2 = dVar;
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        aVar2.getClass();
        if (dVar2 != null && b != null) {
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259106k <= 0) {
                a__c.f259104i++;
                a__c.f259106k = Util.nowMilliSecond();
                C89424j jVar = (C89424j) b;
                jVar.mo123753a(1234, 50, 1, false);
                if (C91515l.m114819c(dVar)) {
                    jVar.mo123753a(1234, 98, 1, false);
                } else if (aVar2.mo123087b(dVar2)) {
                    jVar.mo123753a(1234, 103, 1, false);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo121945w(C91165a aVar, C87760d dVar) {
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        if (b == null) {
            aVar2.getClass();
        } else if (!Util.isNullOrNil(aVar2.f259094a.f259096a)) {
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259101f > 0) {
                a__c.f259108m = Util.nowMilliSecond();
                aVar2.mo124489c(b, aVar, dVar, "onMediaPlayerVideoStop");
            }
        }
    }

    /* renamed from: x */
    public void mo121946x(C91165a aVar, C87760d dVar, long j) {
        C87760d dVar2 = dVar;
        long j2 = j;
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        aVar2.getClass();
        if (dVar2 != null && b != null) {
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259101f <= 0) {
                Log.m105920e("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, but has not call onMediaPlayerVideoPrepareStart, why?");
                return;
            }
            if (a__c.f259102g <= 0) {
                a__c.f259102g = Util.nowMilliSecond();
                C89424j jVar = (C89424j) b;
                jVar.mo123753a(1234, 21, 1, false);
                a$$c a__c2 = aVar2.f259094a;
                long j3 = a__c2.f259102g - a__c2.f259101f;
                a__c2.f259103h = j3;
                jVar.mo123753a(1234, 23, j3, false);
                Log.m105925i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", Long.valueOf(j3));
                if (C91515l.m114819c(dVar)) {
                    C89424j jVar2 = jVar;
                    jVar2.mo123753a(1234, 46, 1, false);
                    jVar2.mo123753a(1234, 48, j3, false);
                } else if (aVar2.mo123087b(dVar2)) {
                    C89424j jVar3 = jVar;
                    jVar3.mo123753a(1234, 93, 1, false);
                    jVar3.mo123753a(1234, 95, j3, false);
                } else if (C91515l.m114820d(dVar)) {
                    C89424j jVar4 = jVar;
                    jVar4.mo123753a(1234, 41, 1, false);
                    jVar4.mo123753a(1234, 43, j3, false);
                }
            }
            a$$c a__c3 = aVar2.f259094a;
            if (a__c3.f259100e <= 0 && j2 > 0) {
                long j4 = (long) ((((double) j2) * 1.0d) / 1000.0d);
                a__c3.f259100e = j4;
                ((C89424j) b).mo123753a(1234, 35, 1, false);
                Log.m105925i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", Long.valueOf(j4));
            }
        }
    }

    /* renamed from: y */
    public void mo121947y(C91165a aVar, C87760d dVar) {
        C90268a aVar2 = this.f257433c;
        C87481e b = mo123735b();
        if (b == null) {
            aVar2.getClass();
        } else if (!Util.isNullOrNil(aVar2.f259094a.f259096a)) {
            a$$c a__c = aVar2.f259094a;
            if (a__c.f259101f > 0) {
                a__c.f259109n = Util.nowMilliSecond();
                aVar2.mo124489c(b, aVar, dVar, "onMediaPlayerVideoEnd");
            }
        }
    }

    /* renamed from: z */
    public void mo121948z(C86826e eVar) {
        this.f257432b = eVar;
    }
}
