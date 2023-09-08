package p1058wb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.udp.libmmudp.C30803a;
import com.tencent.p014mm.udp.libmmudp.UdpNative;
import java.lang.ref.WeakReference;
import js0.C88023q;

/* renamed from: wb.j */
public class C90922j {

    /* renamed from: a */
    public UdpNative f260924a;

    /* renamed from: b */
    public boolean f260925b = true;

    /* renamed from: c */
    public final C90927d f260926c = new C90927d(this, new C90926c());

    /* renamed from: wb.j$a */
    public class C90923a implements UdpNative.NativeCallBackInterface {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f260927a;

        /* renamed from: wb.j$a$a */
        public class C90924a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f260929d;

            /* renamed from: e */
            public final /* synthetic */ long f260930e;

            public C90924a(String str, long j) {
                this.f260929d = str;
                this.f260930e = j;
            }

            public void run() {
                Log.m105919d("Luggage.UdpNativeInstallHelper", "mmudp jsThreadHandler run onCallBack apiName:%s,engineId:%d", this.f260929d, Long.valueOf(this.f260930e));
                C90922j.this.f260924a.update(this.f260930e);
            }
        }

        public C90923a(WeakReference weakReference) {
            this.f260927a = weakReference;
        }

        public void onCallBack(long j, String str) {
            ((C83181q) this.f260927a.get()).post(new C90924a(str, j));
        }
    }

    /* renamed from: wb.j$b */
    public class C90925b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83165i f260932d;

        /* renamed from: e */
        public final /* synthetic */ UdpNative.NativeCallBackInterface f260933e;

        public C90925b(C83165i iVar, UdpNative.NativeCallBackInterface nativeCallBackInterface) {
            this.f260932d = iVar;
            this.f260933e = nativeCallBackInterface;
        }

        public void run() {
            Log.m105924i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ");
            if (C90922j.this.f260924a != null) {
                Log.m105924i("Luggage.UdpNativeInstallHelper", "createUdpBinding udpNative != null");
                return;
            }
            C83187w wVar = (C83187w) this.f260932d.mo63321n0(C83187w.class);
            if (wVar == null) {
                Log.m105920e("Luggage.UdpNativeInstallHelper", "createUdpBinding v8Addon is null");
                return;
            }
            C90922j jVar = C90922j.this;
            if (jVar.f260925b) {
                jVar.f260924a = new UdpNative(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
            } else {
                jVar.f260924a = new UdpNative(wVar.mo115417m(), wVar.mo115393J0(), 0);
            }
            Log.m105925i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ret:%d", Integer.valueOf(C90922j.this.f260924a.setCallBack(this.f260933e)));
        }
    }

    /* renamed from: wb.j$c */
    public class C90926c implements Runnable {
        public C90926c() {
        }

        public void run() {
            synchronized (C90922j.this) {
                if (C90922j.this.f260924a != null) {
                    Log.m105924i("Luggage.UdpNativeInstallHelper", "DestroyTask destoryUdp");
                    C90922j.this.f260924a.destoryUdp();
                    C90922j.this.f260924a = null;
                } else {
                    Log.m105924i("Luggage.UdpNativeInstallHelper", "DestroyTask udpNative is null");
                }
            }
        }
    }

    /* renamed from: wb.j$d */
    public class C90927d extends C88023q implements C83174m.C83175a {
        public C90927d(C90922j jVar, Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: a */
    public void mo125003a(C83165i iVar, C82381f fVar) {
        Log.m105924i("Luggage.UdpNativeInstallHelper", "createUdpBinding");
        if (iVar == null) {
            Log.m105920e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsruntime is null");
            return;
        }
        C30803a.f82806a.loadLibrary("mmudp");
        C83181q qVar = (C83181q) iVar.mo63321n0(C83181q.class);
        if (qVar == null) {
            Log.m105920e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsThreadHandler is null");
            return;
        }
        C90915h hVar = (C90915h) fVar.mo109668l(C90915h.class);
        if (hVar != null) {
            boolean Wv = hVar.mo60802Wv();
            this.f260925b = Wv;
            Log.m105925i("Luggage.UdpNativeInstallHelper", "createUdpBinding xLibUVSwitch:%b ", Boolean.valueOf(Wv));
        }
        qVar.mo115423q0(new C90925b(iVar, new C90923a(new WeakReference(qVar))));
    }

    /* renamed from: b */
    public void mo125004b(C83165i iVar) {
        Log.m105924i("Luggage.UdpNativeInstallHelper", "destroyUdpBinding");
        if (iVar == null) {
            Log.m105920e("Luggage.UdpNativeInstallHelper", "destroyUdpBinding jsruntime is null");
        } else {
            ((C83174m) iVar.mo63321n0(C83174m.class)).mo115384z0(this.f260926c);
        }
    }
}
