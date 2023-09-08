package p1058wb;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.tcp.libmmtcp.C30800a;
import com.tencent.p014mm.tcp.libmmtcp.TcpNative;
import java.lang.ref.WeakReference;
import js0.C88023q;

/* renamed from: wb.i */
public class C90916i {

    /* renamed from: a */
    public TcpNative f260912a;

    /* renamed from: b */
    public boolean f260913b = true;

    /* renamed from: c */
    public final C90921d f260914c = new C90921d(this, new C90920c());

    /* renamed from: wb.i$a */
    public class C90917a implements TcpNative.NativeCallBackInterface {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f260915a;

        /* renamed from: wb.i$a$a */
        public class C90918a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f260917d;

            /* renamed from: e */
            public final /* synthetic */ long f260918e;

            public C90918a(String str, long j) {
                this.f260917d = str;
                this.f260918e = j;
            }

            public void run() {
                Log.m105919d("Luggage.TcpNativeInstallHelper", "mmtcp jsThreadHandler run onCallBack apiName:%s,engineId:%d", this.f260917d, Long.valueOf(this.f260918e));
                C90916i.this.f260912a.update(this.f260918e);
            }
        }

        public C90917a(WeakReference weakReference) {
            this.f260915a = weakReference;
        }

        public void onCallBack(long j, String str) {
            ((C83181q) this.f260915a.get()).post(new C90918a(str, j));
        }
    }

    /* renamed from: wb.i$b */
    public class C90919b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83165i f260920d;

        /* renamed from: e */
        public final /* synthetic */ TcpNative.NativeCallBackInterface f260921e;

        public C90919b(C83165i iVar, TcpNative.NativeCallBackInterface nativeCallBackInterface) {
            this.f260920d = iVar;
            this.f260921e = nativeCallBackInterface;
        }

        public void run() {
            Log.m105924i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ");
            if (C90916i.this.f260912a != null) {
                Log.m105924i("Luggage.TcpNativeInstallHelper", "createTcpBinding tcpNative != null");
                return;
            }
            C83187w wVar = (C83187w) this.f260920d.mo63321n0(C83187w.class);
            if (wVar == null) {
                Log.m105920e("Luggage.TcpNativeInstallHelper", "createTcpBinding v8Addon is null");
                return;
            }
            C90916i iVar = C90916i.this;
            if (iVar.f260913b) {
                iVar.f260912a = new TcpNative(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
            } else {
                iVar.f260912a = new TcpNative(wVar.mo115417m(), wVar.mo115393J0(), 0);
            }
            Log.m105925i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ret:%d", Integer.valueOf(C90916i.this.f260912a.setCallBack(this.f260921e)));
        }
    }

    /* renamed from: wb.i$c */
    public class C90920c implements Runnable {
        public C90920c() {
        }

        public void run() {
            synchronized (C90916i.this) {
                if (C90916i.this.f260912a != null) {
                    Log.m105924i("Luggage.TcpNativeInstallHelper", "DestroyTask destoryTcp");
                    C90916i.this.f260912a.destoryTcp();
                    C90916i.this.f260912a = null;
                } else {
                    Log.m105924i("Luggage.TcpNativeInstallHelper", "DestroyTask tcpNative is null");
                }
            }
        }
    }

    /* renamed from: wb.i$d */
    public class C90921d extends C88023q implements C83174m.C83175a {
        public C90921d(C90916i iVar, Runnable runnable) {
            super(runnable);
        }

        public void onDestroy() {
            run();
        }
    }

    /* renamed from: a */
    public void mo124998a(C83165i iVar, C82381f fVar) {
        Log.m105924i("Luggage.TcpNativeInstallHelper", "createTcpBinding");
        if (iVar == null) {
            Log.m105920e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsruntime is null");
            return;
        }
        C30800a.f82805a.loadLibrary("mmtcp");
        C83181q qVar = (C83181q) iVar.mo63321n0(C83181q.class);
        if (qVar == null) {
            Log.m105920e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsThreadHandler is null");
            return;
        }
        C90915h hVar = (C90915h) fVar.mo109668l(C90915h.class);
        if (hVar != null) {
            boolean Wv = hVar.mo60802Wv();
            this.f260913b = Wv;
            Log.m105925i("Luggage.TcpNativeInstallHelper", "createTcpBinding xLibUVSwitch:%b ", Boolean.valueOf(Wv));
        }
        qVar.mo115423q0(new C90919b(iVar, new C90917a(new WeakReference(qVar))));
    }

    /* renamed from: b */
    public void mo124999b(C83165i iVar) {
        Log.m105924i("Luggage.TcpNativeInstallHelper", "destroyTcpBinding");
        if (iVar == null) {
            Log.m105920e("Luggage.TcpNativeInstallHelper", "destroyTcpBinding jsruntime is null");
        } else {
            ((C83174m) iVar.mo63321n0(C83174m.class)).mo115384z0(this.f260914c);
        }
    }
}
