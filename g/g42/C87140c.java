package g42;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.tencent.p014mm.plugin.magicbrush.C30180c0;
import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.plugin.magicbrush.C85282s0;
import com.tencent.p014mm.plugin.magicbrush.core.MagicBrushServiceContextBase;
import com.tencent.p014mm.plugin.magicbrush.core.MagicBrushServiceContextMainProcess;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import d42.C86173b0;
import d42.C86195z;
import di3.C86312j;
import e42.C7594e;
import eu3.C58834h;
import eu3.C97749e;
import f42.C31904c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87411a;
import gy3.C87412m;
import gy3.C87413o;
import i42.C87608b;
import i42.C87609c;
import i42.C87647j;
import j52.C87879c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k42.C88100d;
import p429c.C26821d;
import rx3.C13598b0;
import sx3.C36907w;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: g42.c */
public final class C87140c extends C85244b0.C85245a implements C86173b0 {

    /* renamed from: e */
    public final Context f252731e;

    /* renamed from: f */
    public final ConcurrentHashMap<String, C87609c<?>> f252732f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public final List<String> f252733g;

    /* renamed from: h */
    public long f252734h;

    /* renamed from: i */
    public C85270j0 f252735i;

    /* renamed from: j */
    public Boolean f252736j;

    /* renamed from: n */
    public final C87145e f252737n;

    /* renamed from: g42.c$a */
    public static final class C87141a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Exception f252738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87141a(Exception exc) {
            super(0);
            this.f252738d = exc;
        }

        public Object invoke() {
            throw this.f252738d;
        }
    }

    /* renamed from: g42.c$b */
    public static final class C87142b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Exception f252739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87142b(Exception exc) {
            super(0);
            this.f252739d = exc;
        }

        public Object invoke() {
            throw this.f252739d;
        }
    }

    /* renamed from: g42.c$c */
    public /* synthetic */ class C87143c extends C87411a implements C32224a<C13598b0> {
        public C87143c(Object obj) {
            super(0, obj, C87140c.class, "bindServiceIfNeeded", "bindServiceIfNeeded()Lcom/tencent/threadpool/runnable/FutureEx;", 8);
        }

        public Object invoke() {
            C87140c cVar = (C87140c) this.f253295d;
            cVar.getClass();
            C119179t tVar = C119157j.f356862d;
            C87137b bVar = new C87137b(cVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(bVar, 0, "MBClientBindService");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.c$d */
    public /* synthetic */ class C87144d extends C24565l implements C32226l<String, C13598b0> {
        public C87144d(Object obj) {
            super(1, obj, C87140c.class, "removeBiz", "removeBiz(Ljava/lang/String;)V", 0);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "p0");
            C87140c cVar = (C87140c) this.receiver;
            cVar.getClass();
            Log.m105924i("MagicBrushClientMgr", "removeBiz " + str + ", bizCount = " + cVar.f252732f.size());
            cVar.f252732f.remove(str);
            CommonKt.uiThread(new C87147e(cVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.c$e */
    public static final class C87145e implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ C87140c f252740d;

        public C87145e(C87140c cVar) {
            this.f252740d = cVar;
        }

        public void onBindingDied(ComponentName componentName) {
            C87412m.m108594g(componentName, "name");
            Log.m105924i("MagicBrushClientMgr", "onBindingDied " + componentName);
            IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", "onBindingDied", "", (String) null, 8, (Object) null);
            C87140c.m108161c(this.f252740d, true);
        }

        public void onNullBinding(ComponentName componentName) {
            C87412m.m108594g(componentName, "name");
            Log.m105924i("MagicBrushClientMgr", "onNullBinding " + componentName);
            IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", "onNullBinding", "", (String) null, 8, (Object) null);
            C87140c.m108161c(this.f252740d, true);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C87412m.m108594g(componentName, "name");
            C87412m.m108594g(iBinder, "binder");
            Log.m105924i("MagicBrushClientMgr", "onServiceConnected " + componentName);
            int i = C85270j0.C85271a.f248429d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
            C85270j0 aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C85270j0)) ? new C85270j0.C85271a.C85272a(iBinder) : (C85270j0) queryLocalInterface;
            C87140c cVar = this.f252740d;
            cVar.getClass();
            Log.m105924i("MagicBrushClientMgr", "onServerMgrReady");
            C87879c.f254379e.mo51764Io("", "magicbrush", IMagicBrushMonitor.TimeCostScene.BIND_SERVICE, System.currentTimeMillis() - cVar.f252734h, C87412m.m108589b(cVar.f252736j, Boolean.TRUE) ? "1" : C87412m.m108589b(cVar.f252736j, Boolean.FALSE) ? "2" : "0");
            cVar.f252734h = 0;
            C85282s0.f248438c = true;
            C88100d dVar = new C88100d(aVar, C87146d.f252741d);
            String processName = MMApplicationContext.getProcessName();
            C87412m.m108593f(processName, "getProcessName()");
            dVar.mo118443kG(processName, cVar);
            Collection<C87609c<?>> values = cVar.f252732f.values();
            C87412m.m108593f(values, "bizMap.values");
            for (C87609c cVar2 : values) {
                cVar2.getClass();
                cVar2.mo122065z(new C87647j(cVar2, dVar));
            }
            cVar.f252735i = dVar;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C87412m.m108594g(componentName, "name");
            Log.m105924i("MagicBrushClientMgr", "onServiceDisconnected " + componentName);
            IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", "onServiceDisconnected", "", (String) null, 8, (Object) null);
            C87140c.m108161c(this.f252740d, true);
        }
    }

    public C87140c(Context context) {
        C87412m.m108594g(context, "context");
        this.f252731e = context;
        Set<C31904c> np = ((C30180c0) C86312j.m106911c(C30180c0.class)).mo57208np();
        ArrayList<C31904c> arrayList = new ArrayList<>();
        for (T next : np) {
            if (!((C31904c) next).f84991b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C31904c cVar : arrayList) {
            arrayList2.add(cVar.f84990a);
        }
        this.f252733g = arrayList2;
        this.f252737n = new C87145e(this);
    }

    /* renamed from: a */
    public static final void m108160a(C87140c cVar) {
        cVar.getClass();
        Log.m105924i("MagicBrushClientMgr", "start bind service");
        if (cVar.f252734h == 0) {
            cVar.f252734h = System.currentTimeMillis();
        }
        cVar.f252731e.bindService(new Intent(cVar.f252731e, !C26821d.f74611a.mo53792a(C26821d.C26825d.f74617d) ? MagicBrushServiceContextBase.class : MagicBrushServiceContextMainProcess.class), cVar.f252737n, 65);
    }

    /* renamed from: c */
    public static final void m108161c(C87140c cVar, boolean z) {
        cVar.getClass();
        Log.m105924i("MagicBrushClientMgr", "onServerMgrLost " + z);
        if (z || cVar.f252735i != null) {
            cVar.f252735i = null;
            cVar.f252736j = null;
            C85282s0.f248438c = false;
            if (z) {
                cVar.f252734h = 0;
                Collection<C87609c<?>> values = cVar.f252732f.values();
                C87412m.m108593f(values, "bizMap.values");
                for (C87609c cVar2 : values) {
                    cVar2.getClass();
                    cVar2.mo122065z(new C87608b(cVar2));
                }
            }
            try {
                cVar.f252731e.unbindService(cVar.f252737n);
            } catch (IllegalArgumentException e) {
                Log.m105920e("MagicBrushClientMgr", "unbind error: " + e);
            }
        }
    }

    /* renamed from: LL */
    public void mo118379LL(String str, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "logStr");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121846a(str2);
        }
    }

    /* renamed from: O */
    public void mo118380O(String str, String str2, String str3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "envId");
        C87412m.m108594g(str3, "msg");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121850i(str2, str3);
        }
    }

    /* renamed from: O3 */
    public void mo118381O3(String str) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.onDestroy();
        }
    }

    /* renamed from: TY */
    public void mo118382TY(String str) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.onCreated();
        }
    }

    public void Tn0(String str, int i, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "msg");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121849e(i, str2);
        }
    }

    /* renamed from: WI */
    public void mo118384WI(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121857s(i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: Ym */
    public void mo118385Ym(String str, int i, boolean z) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121848c(i, z);
        }
    }

    public String fr0(String str, String str2, String str3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        try {
            C87609c cVar = this.f252732f.get(str);
            if (cVar != null) {
                return cVar.mo121859u(str2, str3);
            }
            return null;
        } catch (Exception e) {
            String g0 = C112550d0.m153797g0(str, "-", str);
            C87879c cVar2 = C87879c.f254379e;
            String stackTraceString = android.util.Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(e)");
            cVar2.R80(g0, "jsapi-exception", stackTraceString, str2 + XVFSFile.PATH_SEPARATOR_CHAR + str3);
            Log.printErrStackTrace("MagicBrushClientMgr", e, g0 + ": catch jsapi exception " + str2 + ", data = " + str3, new Object[0]);
            CommonKt.uiThread(new C87142b(e));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    /* renamed from: gq */
    public void mo118387gq(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121856q(i);
        }
    }

    /* renamed from: hq */
    public void mo118388hq(String str, boolean z) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121851k(z);
        }
    }

    /* renamed from: mI */
    public <T extends C7594e> C86195z<T> mo57202mI(String str) {
        C87412m.m108594g(str, "bizName");
        if (BuildInfo.DEBUG && !C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("getBiz should be call on main thread");
        } else if (((ArrayList) this.f252733g).contains(str)) {
            String str2 = str + '-' + System.currentTimeMillis();
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("MagicBrush_" + str2, 5);
            a.start();
            Log.m105924i("MagicBrushClientMgr", "createBiz " + str2);
            C87609c cVar = new C87609c(this.f252731e, str2, a, new C87143c(this), new C87144d(this));
            this.f252732f.put(str2, cVar);
            C85270j0 j0Var = this.f252735i;
            if (j0Var != null) {
                cVar.mo122065z(new C87647j(cVar, j0Var));
            }
            return cVar;
        } else {
            throw new IllegalArgumentException("create Biz with invalid name " + str);
        }
    }

    public void p00(String str, String str2, String str3, int i) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        try {
            C87609c cVar = this.f252732f.get(str);
            if (cVar != null) {
                cVar.mo121855p(str2, str3, i);
            }
        } catch (Exception e) {
            String g0 = C112550d0.m153797g0(str, "-", str);
            C87879c cVar2 = C87879c.f254379e;
            String stackTraceString = android.util.Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(e)");
            cVar2.R80(g0, "jsapi-exception", stackTraceString, str2 + XVFSFile.PATH_SEPARATOR_CHAR + str3);
            Log.printErrStackTrace("MagicBrushClientMgr", e, g0 + ": catch jsapi exception " + str2 + ", data = " + str3, new Object[0]);
            CommonKt.uiThread(new C87141a(e));
        }
    }

    public void q80(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121858t(i, i2, i3, i4, i5, i6);
        }
    }

    public void x90(String str, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121852n(i, fArr, fArr2, fArr3, fArr4);
        }
    }

    /* renamed from: yu */
    public void mo118392yu(String str) {
        C87412m.m108594g(str, "instanceName");
        C87609c cVar = this.f252732f.get(str);
        if (cVar != null) {
            cVar.mo121847b();
        }
    }
}
