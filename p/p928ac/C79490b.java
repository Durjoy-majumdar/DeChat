package p928ac;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.libwxaudio.C28962a;
import com.tencent.p014mm.libwxaudio.WxAudioNative;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import ea2.C20561h;
import ea2.C86468a;
import gy3.C87412m;
import hp0.C8648d;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import js0.C88023q;
import k20.C9556a;
import kj2.C117407d;
import p1058wb.C90915h;
import p206nj.C88957l;
import p224ra.C12964b;

/* renamed from: ac.b */
public class C79490b {

    /* renamed from: j */
    public static Vector<String> f233049j = new Vector<>();

    /* renamed from: a */
    public WxAudioNative f233050a;

    /* renamed from: b */
    public boolean f233051b = true;

    /* renamed from: c */
    public boolean f233052c = false;

    /* renamed from: d */
    public boolean f233053d = false;

    /* renamed from: e */
    public boolean f233054e = false;

    /* renamed from: f */
    public C86468a f233055f = null;

    /* renamed from: g */
    public final C79499h f233056g = new C79499h(this, new C79496e());

    /* renamed from: h */
    public C86468a.C86469a f233057h = new C86468a.C86469a(3, "wx_webaudio_mix_audio_buffer");

    /* renamed from: i */
    public WxAudioNative.NativeAudioPcmCallback f233058i = new C79498g();

    /* renamed from: ac.b$a */
    public class C79491a implements C28962a.C28964b {
        public C79491a() {
        }

        public void loadLibrary(String str) {
            try {
                Log.m105925i("Luggage.WxAudioNativeInstallHelper", "loadLibrary libName:%s", str);
                C88957l.m111079o(str, C79490b.class.getClassLoader());
                C79490b.this.f233053d = true;
            } catch (UnsatisfiedLinkError e) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            } catch (SecurityException e2) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e2, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            } catch (Throwable th) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", th, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            }
        }
    }

    /* renamed from: ac.b$b */
    public class C79492b implements C28962a.C28964b {
        public C79492b() {
        }

        public void loadLibrary(String str) {
            try {
                Log.m105925i("Luggage.WxAudioNativeInstallHelper", "loadLibrary libName:%s", str);
                C88957l.m111079o(str, C79490b.class.getClassLoader());
                C79490b.this.f233053d = true;
            } catch (UnsatisfiedLinkError e) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            } catch (SecurityException e2) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e2, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            } catch (Throwable th) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", th, "load so %s error!!", str);
                C79490b.this.f233053d = false;
            }
        }
    }

    /* renamed from: ac.b$c */
    public class C79493c implements WxAudioNative.NativeCallBackInterface {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f233061a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f233062b;

        /* renamed from: ac.b$c$a */
        public class C79494a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f233064d;

            /* renamed from: e */
            public final /* synthetic */ long f233065e;

            public C79494a(String str, long j) {
                this.f233064d = str;
                this.f233065e = j;
            }

            public void run() {
                Log.m105919d("Luggage.WxAudioNativeInstallHelper", "wxAudio jsThreadHandler run onCallBack apiName:%s,engineId:%d", this.f233064d, Long.valueOf(this.f233065e));
                C79490b.this.f233050a.update(this.f233065e);
            }
        }

        public C79493c(WeakReference weakReference, C82381f fVar) {
            this.f233061a = weakReference;
            this.f233062b = fVar;
        }

        public String getFilePath(String str) {
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "getFilePath src:%s", str);
            if (str.startsWith("file://")) {
                String substring = str.substring(7);
                Log.m105925i("Luggage.WxAudioNativeInstallHelper", "filePath:%s", substring);
                return substring;
            } else if (str.contains("base64") && str.startsWith("data:audio")) {
                String b = C8648d.m8496b(str.substring(str.indexOf("base64,") + 7).trim());
                Log.m105925i("Luggage.WxAudioNativeInstallHelper", "base64 decode filePath:%s", b);
                return b;
            } else if (!str.startsWith("wxblob://")) {
                return (str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) ? str : C8648d.m8495a(this.f233062b, str);
            } else {
                C86009m1 privateAbsoluteFile = this.f233062b.getFileSystem().getPrivateAbsoluteFile(str);
                if (privateAbsoluteFile != null && privateAbsoluteFile.mo119967g()) {
                    return privateAbsoluteFile.mo119971i();
                }
                Log.m105920e("Luggage.WxAudioNativeInstallHelper", "wxblob localFile is null");
                return str;
            }
        }

        public void onCallBack(long j, String str) {
            ((C83181q) this.f233061a.get()).post(new C79494a(str, j));
        }
    }

    /* renamed from: ac.b$d */
    public class C79495d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83165i f233067d;

        /* renamed from: e */
        public final /* synthetic */ WxAudioNative.NativeCallBackInterface f233068e;

        public C79495d(C83165i iVar, WxAudioNative.NativeCallBackInterface nativeCallBackInterface) {
            this.f233067d = iVar;
            this.f233068e = nativeCallBackInterface;
        }

        public void run() {
            Log.m105924i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ");
            if (C79490b.this.f233050a != null) {
                Log.m105924i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding  udpNative != null");
                return;
            }
            C83187w wVar = (C83187w) this.f233067d.mo63321n0(C83187w.class);
            if (wVar == null) {
                Log.m105920e("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding v8Addon is null");
                return;
            }
            C79490b bVar = C79490b.this;
            if (bVar.f233051b) {
                bVar.f233050a = new WxAudioNative(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
            } else {
                bVar.f233050a = new WxAudioNative(wVar.mo115417m(), wVar.mo115393J0(), 0);
            }
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ret:%d", Integer.valueOf(C79490b.this.f233050a.InitCallBack(this.f233068e)));
        }
    }

    /* renamed from: ac.b$e */
    public class C79496e implements Runnable {
        public C79496e() {
        }

        public void run() {
            synchronized (C79490b.this) {
                if (C79490b.this.f233050a != null) {
                    Log.m105924i("Luggage.WxAudioNativeInstallHelper", "DestroyTask destroy wxAudioNative");
                    C79490b.this.f233050a.destroyWebAudioContext();
                    C79490b.this.f233050a = null;
                } else {
                    Log.m105924i("Luggage.WxAudioNativeInstallHelper", "DestroyTask wxAudioNative is null");
                }
            }
        }
    }

    /* renamed from: ac.b$f */
    public class C79497f extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ String f233071d;

        public C79497f(String str) {
            this.f233071d = str;
        }

        /* renamed from: b */
        public void mo109496b() {
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "onCreate, appId:%s", this.f233071d);
            C20561h.m22332s().mo32165f();
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "onDestroy, appId:%s", this.f233071d);
            C79490b.f233049j.remove(this.f233071d);
            C20561h.m22332s().mo32162a();
            C79490b.this.mo109492e();
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "onPause, appId:%s", this.f233071d);
            WxAudioNative wxAudioNative = C79490b.this.f233050a;
            if (wxAudioNative != null) {
                wxAudioNative.forcePauseAllPlayer();
            }
            C20561h.m22332s().mo32162a();
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "onResume, appId:%s", this.f233071d);
            WxAudioNative wxAudioNative = C79490b.this.f233050a;
            C20561h.m22332s().mo32165f();
        }
    }

    /* renamed from: ac.b$g */
    public class C79498g implements WxAudioNative.NativeAudioPcmCallback {
        public C79498g() {
        }

        public void onPcmCallback(byte[] bArr, int i, int i2, int i3, int i4) {
            C79490b bVar = C79490b.this;
            C86468a aVar = bVar.f233055f;
            if (aVar != null) {
                if (!bVar.f233054e) {
                    aVar.mo120892c(bVar.f233057h);
                    C79490b.this.f233054e = true;
                }
                C79490b bVar2 = C79490b.this;
                bVar2.f233055f.mo120890a(bVar2.f233057h, 1, i2, i3, bArr);
            }
        }
    }

    /* renamed from: ac.b$h */
    public class C79499h extends C88023q implements C83174m.C83175a {
        public C79499h(C79490b bVar, Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: ac.b$i */
    public interface C79500i extends C12964b {
    }

    /* renamed from: d */
    public static void m96455d(ArrayList<IDKey> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append("idkeyGroupStat:  id:1702");
        Iterator<IDKey> it = arrayList.iterator();
        while (it.hasNext()) {
            IDKey next = it.next();
            sb.append(", key:" + next.GetKey() + " value:" + next.GetValue());
        }
        Log.m105918d("Luggage.WxAudioNativeInstallHelper", sb.toString());
    }

    /* renamed from: a */
    public void mo109489a(C83165i iVar, C82381f fVar) {
        C83165i iVar2 = iVar;
        C82381f fVar2 = fVar;
        Log.m105924i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding");
        if (iVar2 == null) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding jsruntime is null");
            return;
        }
        Log.m105924i("Luggage.WxAudioNativeInstallHelper", "support WebAudio");
        this.f233052c = true;
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(1702);
        iDKey.SetKey(0);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(1702);
        iDKey2.SetValue(1);
        arrayList.add(iDKey2);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(1702);
        iDKey3.SetValue(1);
        C79500i iVar3 = (C79500i) fVar2.mo109668l(C79500i.class);
        if (BuildInfo.DEBUG) {
            Log.m105924i("Luggage.WxAudioNativeInstallHelper", "run debug mode");
            C79491a aVar = new C79491a();
            C28962a.f79434a = aVar;
            aVar.loadLibrary("wxWtf");
            C28962a.f79434a.loadLibrary("wxaudio");
            iDKey2.SetKey(3);
            if (!this.f233053d) {
                iDKey3.SetKey(6);
            }
        } else {
            Log.m105924i("Luggage.WxAudioNativeInstallHelper", "run release mode");
            try {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c("c++_shared");
                Object obj = new Object();
                C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/luggage/sdk/jsapi/component/webaudio/WxAudioNativeInstallHelper", "createWxAudioBinding", "(Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar2.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/luggage/sdk/jsapi/component/webaudio/WxAudioNativeInstallHelper", "createWxAudioBinding", "(Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c("xffmpeg");
                Object obj2 = new Object();
                C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/luggage/sdk/jsapi/component/webaudio/WxAudioNativeInstallHelper", "createWxAudioBinding", "(Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar3.mo10231a(0));
                C117292a.m165359e(obj2, "com/tencent/luggage/sdk/jsapi/component/webaudio/WxAudioNativeInstallHelper", "createWxAudioBinding", "(Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            } catch (UnsatisfiedLinkError e) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e, "load so %s error!!", "c++_shared");
            } catch (SecurityException e2) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e2, "load so %s error!!", "c++_shared");
            } catch (Throwable th) {
                Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", th, "load so %s error!!", "c++_shared");
            }
            Log.m105924i("Luggage.WxAudioNativeInstallHelper", "load so from apk");
            C79492b bVar = new C79492b();
            C28962a.f79434a = bVar;
            bVar.loadLibrary("wxWtf");
            C28962a.f79434a.loadLibrary("wxaudio");
            iDKey2.SetKey(1);
            if (!this.f233053d) {
                iDKey3.SetKey(4);
            }
        }
        if (!this.f233053d) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "load so fail!!!, don't init webaudio");
            arrayList.add(iDKey3);
            C117407d.INSTANCE.mo160124a(arrayList, true);
            m96455d(arrayList);
            return;
        }
        C117407d.INSTANCE.mo160124a(arrayList, true);
        m96455d(arrayList);
        try {
            Log.m105924i("Luggage.WxAudioNativeInstallHelper", "call jni initAndroidAssetMgr");
            WxAudioNative.initAndroidAssetMgr(fVar.getContext().getAssets());
        } catch (UnsatisfiedLinkError e3) {
            Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e3, "initAndroidAssetMgr error!!", new Object[0]);
            this.f233053d = false;
        } catch (SecurityException e4) {
            Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e4, "initAndroidAssetMgr error!!", new Object[0]);
            this.f233053d = false;
        } catch (Throwable th4) {
            Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", th4, "initAndroidAssetMgr error!!", new Object[0]);
            this.f233053d = false;
        }
        if (!this.f233053d) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "call jni initAndroidAssetMgr fail, load so fail!!!, don't init webaudio");
            return;
        }
        C83181q qVar = (C83181q) iVar2.mo63321n0(C83181q.class);
        if (qVar == null) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding jsThreadHandler is null");
            return;
        }
        C90915h hVar = (C90915h) fVar2.mo109668l(C90915h.class);
        if (hVar != null) {
            boolean Wv = hVar.mo60802Wv();
            this.f233051b = Wv;
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding xLibUVSwitch:%b ", Boolean.valueOf(Wv));
        }
        C79493c cVar = new C79493c(new WeakReference(qVar), fVar2);
        C83174m mVar = (C83174m) iVar2.mo63321n0(C83174m.class);
        C87412m.m108594g(mVar, "lifecycleOwner");
        qVar.mo115423q0(new C79495d(iVar2, new C79488a(cVar, mVar)));
    }

    /* renamed from: b */
    public void mo109490b(C83165i iVar) {
        Log.m105924i("Luggage.WxAudioNativeInstallHelper", "destroyWxAudioBinding");
        if (iVar == null) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "destroyWxAudioBinding jsruntime is null");
        } else {
            ((C83174m) iVar.mo63321n0(C83174m.class)).mo115384z0(this.f233056g);
        }
    }

    /* renamed from: c */
    public void mo109491c(C82381f fVar) {
        if (!this.f233052c) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle now is not support webaudio");
        } else if (!this.f233053d) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle so load fail ");
        } else {
            String appId = fVar.getAppId();
            C79497f fVar2 = new C79497f(appId);
            Log.m105925i("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle appId:%s", appId);
            if (!f233049j.contains(appId)) {
                C83231l.m102140a(appId, fVar2);
                f233049j.add(appId);
            }
        }
    }

    /* renamed from: e */
    public void mo109492e() {
        this.f233055f = null;
        if (!this.f233052c) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle now is not support webaudio");
        } else if (!this.f233053d) {
            Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle so load fail ");
        } else {
            WxAudioNative wxAudioNative = this.f233050a;
            if (wxAudioNative != null) {
                wxAudioNative.unregisterAudioPcmCallback();
            }
        }
    }
}
