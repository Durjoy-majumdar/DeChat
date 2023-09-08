package cc0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import cc0.C92411b;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import oa1.C117731d;
import p206nj.C76862i;
import p757xv.C118903j;
import p757xv.C118904l;
import p981ie.C117159b;
import sf0.C90188n0;

/* renamed from: cc0.d */
public class C113267d implements C92411b {

    /* renamed from: A */
    public static String f338880A = null;

    /* renamed from: w */
    public static C113267d f338881w = null;

    /* renamed from: x */
    public static boolean f338882x = false;

    /* renamed from: y */
    public static int f338883y = 0;

    /* renamed from: z */
    public static long f338884z = -1;

    /* renamed from: a */
    public boolean f338885a = false;

    /* renamed from: b */
    public C113278i f338886b;

    /* renamed from: c */
    public Context f338887c;

    /* renamed from: d */
    public List<WeakReference<C92411b.C92412a>> f338888d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public ReentrantLock f338889e = new ReentrantLock();

    /* renamed from: f */
    public long f338890f = 0;

    /* renamed from: g */
    public long f338891g = 0;

    /* renamed from: h */
    public boolean f338892h = false;

    /* renamed from: i */
    public boolean f338893i = false;

    /* renamed from: j */
    public double f338894j = 23.0d;

    /* renamed from: k */
    public double f338895k = 100.0d;

    /* renamed from: l */
    public int f338896l = 0;

    /* renamed from: m */
    public double f338897m = 0.0d;

    /* renamed from: n */
    public double f338898n = 0.0d;

    /* renamed from: o */
    public double f338899o = 0.0d;

    /* renamed from: p */
    public String f338900p;

    /* renamed from: q */
    public String f338901q;

    /* renamed from: r */
    public int f338902r;

    /* renamed from: s */
    public boolean f338903s = false;

    /* renamed from: t */
    public boolean f338904t = false;

    /* renamed from: u */
    public C113276g f338905u;

    /* renamed from: v */
    public C113277h f338906v;

    /* renamed from: cc0.d$a */
    public class C113268a implements C80617t0.C80620c {
        /* renamed from: J0 */
        public void mo31867J0(String str) {
            C113267d.f338884z = SystemClock.uptimeMillis();
        }

        /* renamed from: h2 */
        public void mo31871h2(String str) {
            if (C113267d.f338883y > 0 && C113267d.f338884z > 0) {
                ((C118904l) C86312j.m106911c(C118904l.class)).mo174296XK(C113267d.f338883y, C113267d.f338880A, SystemClock.uptimeMillis() - C113267d.f338884z);
            }
            C113267d.f338883y = 0;
            C113267d.f338884z = -1;
        }
    }

    /* renamed from: cc0.d$b */
    public class C113269b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92411b.C92412a f338907d;

        public C113269b(C113267d dVar, C92411b.C92412a aVar) {
            this.f338907d = aVar;
        }

        public void run() {
            this.f338907d.onGetLocation(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
        }
    }

    /* renamed from: cc0.d$c */
    public class C113270c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92411b.C92412a f338908d;

        public C113270c(C113267d dVar, C92411b.C92412a aVar) {
            this.f338908d = aVar;
        }

        public void run() {
            this.f338908d.onGetLocation(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
        }
    }

    /* renamed from: cc0.d$d */
    public class C113271d extends C113276g {

        /* renamed from: cc0.d$d$a */
        public class C113272a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f338910d;

            /* renamed from: e */
            public final /* synthetic */ double f338911e;

            /* renamed from: f */
            public final /* synthetic */ double f338912f;

            /* renamed from: g */
            public final /* synthetic */ int f338913g;

            /* renamed from: h */
            public final /* synthetic */ double f338914h;

            /* renamed from: i */
            public final /* synthetic */ double f338915i;

            /* renamed from: j */
            public final /* synthetic */ double f338916j;

            public C113272a(boolean z, double d, double d2, int i, double d3, double d4, double d5) {
                this.f338910d = z;
                this.f338911e = d;
                this.f338912f = d2;
                this.f338913g = i;
                this.f338914h = d3;
                this.f338915i = d4;
                this.f338916j = d5;
            }

            public void run() {
                Bundle bundle = new Bundle();
                bundle.putString("indoor_building_floor", C113267d.this.f338901q);
                bundle.putString("indoor_building_id", C113267d.this.f338900p);
                bundle.putInt("indoor_building_type", C113267d.this.f338902r);
                C113267d.m155071j(C113267d.this, this.f338910d, this.f338911e, this.f338912f, this.f338913g, this.f338914h, this.f338915i, this.f338916j, bundle);
            }
        }

        public C113271d() {
        }

        /* renamed from: a */
        public void mo165816a(boolean z, double d, double d2, int i, double d3, double d4, double d5, String str, String str2, int i2) {
            char c;
            C113267d.m155069h(C113267d.this, z, d, d2, d5, d4, true);
            if (z) {
                C113267d dVar = C113267d.this;
                dVar.f338894j = d;
                dVar.f338895k = d2;
                dVar.f338896l = i;
                dVar.f338897m = d3;
                dVar.f338898n = d4;
                dVar.f338899o = d5;
                dVar.f338900p = str;
                dVar.f338901q = str2;
                dVar.f338902r = i2;
                dVar.f338891g = System.currentTimeMillis();
                C113267d dVar2 = C113267d.this;
                dVar2.f338892h = true;
                c = 0;
                dVar2.f338893i = false;
                C113267d.m155070i(dVar2, 67592);
            } else {
                double d6 = d;
                double d7 = d2;
                int i3 = i;
                double d8 = d3;
                double d9 = d4;
                double d15 = d5;
                c = 0;
            }
            Object[] objArr = new Object[4];
            objArr[c] = Double.valueOf(d2);
            objArr[1] = Double.valueOf(d);
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Double.valueOf(d3);
            Log.m105925i("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", objArr);
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper());
            C113272a aVar = r0;
            C113272a aVar2 = new C113272a(z, d, d2, i, d3, d4, d5);
            mMHandler.post(aVar);
        }

        public void onStatusUpdate(String str, int i, String str2) {
            Log.m105925i("MicroMsg.LocationGeo", "onStatusUpdate name %s, status %d", str, Integer.valueOf(i));
        }
    }

    /* renamed from: cc0.d$e */
    public class C113273e extends C113277h {

        /* renamed from: cc0.d$e$a */
        public class C113274a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f338919d;

            /* renamed from: e */
            public final /* synthetic */ double f338920e;

            /* renamed from: f */
            public final /* synthetic */ double f338921f;

            /* renamed from: g */
            public final /* synthetic */ int f338922g;

            /* renamed from: h */
            public final /* synthetic */ double f338923h;

            /* renamed from: i */
            public final /* synthetic */ double f338924i;

            /* renamed from: j */
            public final /* synthetic */ double f338925j;

            public C113274a(boolean z, double d, double d2, int i, double d3, double d4, double d5) {
                this.f338919d = z;
                this.f338920e = d;
                this.f338921f = d2;
                this.f338922g = i;
                this.f338923h = d3;
                this.f338924i = d4;
                this.f338925j = d5;
            }

            public void run() {
                Bundle bundle = new Bundle();
                bundle.putString("indoor_building_floor", C113267d.this.f338901q);
                bundle.putString("indoor_building_id", C113267d.this.f338900p);
                bundle.putInt("indoor_building_type", C113267d.this.f338902r);
                C113267d.m155071j(C113267d.this, this.f338919d, this.f338920e, this.f338921f, this.f338922g, this.f338923h, this.f338924i, this.f338925j, bundle);
            }
        }

        public C113273e() {
        }

        /* renamed from: a */
        public void mo165819a(boolean z, double d, double d2, int i, double d3, double d4, double d5, String str, String str2, int i2) {
            C113267d.m155069h(C113267d.this, z, d, d2, d5, d4, false);
            if (z) {
                C113267d dVar = C113267d.this;
                dVar.f338894j = d;
                dVar.f338895k = d2;
                dVar.f338896l = i;
                dVar.f338897m = d3;
                dVar.f338898n = d4;
                dVar.f338899o = d5;
                dVar.f338900p = str;
                dVar.f338901q = str2;
                dVar.f338902r = i2;
                dVar.f338893i = true;
                dVar.f338892h = false;
                dVar.f338891g = System.currentTimeMillis();
                C113267d.m155070i(C113267d.this, 67591);
            } else {
                double d6 = d;
                double d7 = d2;
                int i3 = i;
                double d8 = d3;
                double d9 = d4;
                double d15 = d5;
            }
            Log.m105925i("MicroMsg.LocationGeo", "onGetLocationWgs84 fLongitude: %f fLatitude:%f locType:%d %f:spped", Double.valueOf(d2), Double.valueOf(d), Integer.valueOf(i), Double.valueOf(d3));
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper());
            C113274a aVar = r0;
            C113274a aVar2 = new C113274a(z, d, d2, i, d3, d4, d5);
            mMHandler.postDelayed(aVar, 200);
        }
    }

    /* renamed from: cc0.d$f */
    public class C113275f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92411b.C92412a f338927d;

        public C113275f(C92411b.C92412a aVar) {
            this.f338927d = aVar;
        }

        public void run() {
            C113278i iVar;
            ArrayList arrayList = new ArrayList();
            C113267d.this.f338889e.lock();
            Iterator it = ((CopyOnWriteArrayList) C113267d.this.f338888d).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference == null || weakReference.get() == null || ((C92411b.C92412a) weakReference.get()).equals(this.f338927d)) {
                    arrayList.add(weakReference);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((CopyOnWriteArrayList) C113267d.this.f338888d).remove((WeakReference) it4.next());
            }
            Log.m105925i("MicroMsg.LocationGeo", "stop listeners size %d", Integer.valueOf(((CopyOnWriteArrayList) C113267d.this.f338888d).size()));
            if (((CopyOnWriteArrayList) C113267d.this.f338888d).size() == 0 && (iVar = C113267d.this.f338886b) != null) {
                iVar.f338934a.post(new C113281j(iVar));
            }
            C113267d.this.f338889e.unlock();
        }
    }

    static {
        boolean equals = C117731d.m166007c().mo182444f("clicfg_battery_location_tms_enable", "1", false, true).equals("1");
        f338882x = equals;
        if (equals) {
            C80617t0.m98255d().mo112357c(new C113268a());
        }
    }

    public C113267d(Context context) {
        new MMHandler(Looper.getMainLooper());
        this.f338905u = new C113271d();
        this.f338906v = new C113273e();
        this.f338887c = context;
    }

    /* renamed from: h */
    public static void m155069h(C113267d dVar, boolean z, double d, double d2, double d3, double d4, boolean z2) {
        C113267d dVar2 = dVar;
        double d5 = d4;
        if (!z || !dVar2.f338903s) {
            if (z) {
                dVar.getClass();
            } else if (dVar2.f338904t) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - dVar2.f338890f;
            int i = 10;
            if (j > 500) {
                if (j <= 1000) {
                    i = 12;
                } else if (j <= 2000) {
                    i = 14;
                } else if (j <= 4000) {
                    i = 16;
                } else if (j <= 8000) {
                    i = 18;
                }
            }
            if (!z) {
                i++;
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(584, (long) i, 1, true);
            int i2 = 1;
            if (z) {
                nVar.idkeyStat(584, 30, 1, true);
                nVar.idkeyStat(584, 31, currentTimeMillis - dVar2.f338890f, true);
                dVar2.f338903s = true;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf((int) (d * 1000000.0d));
                objArr[1] = Integer.valueOf((int) (d2 * 1000000.0d));
                objArr[2] = Integer.valueOf((int) (1000000.0d * d5));
                objArr[3] = Integer.valueOf((int) d5);
                if (!z2) {
                    i2 = 2;
                }
                objArr[4] = Integer.valueOf(i2);
                nVar.mo160131h(15391, objArr);
                return;
            }
            dVar2.f338904t = true;
        }
    }

    /* renamed from: i */
    public static void m155070i(C113267d dVar, int i) {
        dVar.getClass();
        if (C86709a0.m107523b().mo121114l()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((int) dVar.f338898n);
            stringBuffer.append(",");
            stringBuffer.append(dVar.f338896l);
            stringBuffer.append(",");
            stringBuffer.append((int) (dVar.f338894j * 1000000.0d));
            stringBuffer.append(",");
            stringBuffer.append((int) (dVar.f338895k * 1000000.0d));
            C86709a0.m107535s().mo121142i().mo119676J(i, stringBuffer.toString());
            Log.m105919d("MicroMsg.LocationGeo", "Save Location Success id=%d|content=%s", Integer.valueOf(i), stringBuffer.toString());
        }
    }

    /* renamed from: j */
    public static void m155071j(C113267d dVar, boolean z, double d, double d2, int i, double d3, double d4, double d5, Bundle bundle) {
        C113267d dVar2 = dVar;
        double d6 = d;
        double d7 = d2;
        double d8 = d3;
        dVar.getClass();
        LinkedList<C92411b.C92412a> linkedList = new LinkedList<>();
        dVar2.f338889e.lock();
        Iterator it = ((CopyOnWriteArrayList) dVar2.f338888d).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (!(weakReference == null || weakReference.get() == null)) {
                linkedList.add((C92411b.C92412a) weakReference.get());
            }
        }
        Log.m105919d("MicroMsg.LocationGeo", "onCallbackLocation listeners: %s, changeList: %s", Integer.valueOf(((CopyOnWriteArrayList) dVar2.f338888d).size()), Integer.valueOf(linkedList.size()));
        if (linkedList.isEmpty()) {
            Log.m105928w("MicroMsg.LocationGeo", "no location listener weakrefers, may have leak, stop location");
            ((CopyOnWriteArrayList) dVar2.f338888d).clear();
            C113278i iVar = dVar2.f338886b;
            if (iVar != null) {
                iVar.f338934a.post(new C113281j(iVar));
            }
        }
        dVar2.f338889e.unlock();
        for (C92411b.C92412a aVar : linkedList) {
            if (!C90188n0.f258934b || !CrashReportFactory.hasDebuger()) {
                C92411b.C92412a aVar2 = aVar;
                boolean z2 = z;
                aVar2.onGetLocation(z2, (float) d7, (float) d6, i, (double) ((float) d8), d4, d5);
            } else {
                aVar.onGetLocation(z, (float) C90188n0.f258907A, (float) C90188n0.f258958z, i, (double) ((float) d8), d4, d5);
            }
            if (aVar instanceof C92411b.C0447b) {
                ((C92411b.C0447b) aVar).mo489u7(z, (float) d7, (float) d6, i, (double) ((float) d8), d4, d5, bundle);
            }
        }
    }

    /* renamed from: k */
    public static C113267d m155072k() {
        if (f338881w == null) {
            f338881w = new C113267d(MMApplicationContext.getContext());
        }
        if (f338881w.f338886b == null && C76862i.m92661a("xmap")) {
            C113267d dVar = f338881w;
            Context context = MMApplicationContext.getContext();
            if (C113278i.f338931b == null) {
                C113278i.f338931b = new C113278i();
            }
            C113278i.f338932c = context;
            dVar.f338886b = C113278i.f338931b;
        }
        return f338881w;
    }

    /* renamed from: l */
    public static void m155073l() {
        if (f338882x && !C80617t0.m98255d().f235847a) {
            f338883y++;
            if (((C118903j) C86312j.m106911c(C118903j.class)).mo174294Jj()) {
                f338880A = C117159b.m165222w(new Throwable().getStackTrace(), true);
            }
            Log.m105928w("MicroMsg.LocationGeo", "onBgLocateRequest, count = " + f338883y + ", stack = \n" + f338880A);
        }
    }

    /* renamed from: a */
    public void mo126407a(C92411b.C92412a aVar, boolean z) {
        mo126409c(aVar, z, true);
    }

    /* renamed from: b */
    public void mo126408b(C92411b.C92412a aVar) {
        new MMHandler().post(new C113275f(aVar));
    }

    /* renamed from: c */
    public void mo126409c(C92411b.C92412a aVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        C92411b.C92412a aVar2 = aVar;
        Log.m105925i("MicroMsg.LocationGeo", "startWgs84 %s userCache %s continuous %b", aVar2, Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.f338886b == null) {
            Log.m105928w("MicroMsg.LocationGeo", "fail, location service not yet ready");
            new MMHandler(Looper.getMainLooper()).post(new C113269b(this, aVar2));
            return;
        }
        m155073l();
        this.f338889e.lock();
        if (this.f338885a && ((CopyOnWriteArrayList) this.f338888d).size() > 0) {
            this.f338890f = System.currentTimeMillis();
            this.f338903s = false;
            this.f338904t = false;
            C113278i iVar = this.f338886b;
            iVar.f338934a.post(new C113281j(iVar));
            this.f338886b.mo165823a(this.f338906v, this.f338887c, 0, Looper.getMainLooper());
        }
        this.f338885a = false;
        Iterator it = ((CopyOnWriteArrayList) this.f338888d).iterator();
        while (true) {
            if (!it.hasNext()) {
                z3 = true;
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((C92411b.C92412a) weakReference.get()).equals(aVar2)) {
                z3 = false;
                break;
            }
        }
        if (z3) {
            ((CopyOnWriteArrayList) this.f338888d).add(new WeakReference(aVar2));
        }
        Log.m105925i("MicroMsg.LocationGeo", "add listeners size %d", Integer.valueOf(((CopyOnWriteArrayList) this.f338888d).size()));
        if (!z || !this.f338893i || System.currentTimeMillis() - this.f338891g >= 600000) {
            z4 = z3;
        } else {
            C113277h hVar = this.f338906v;
            double d = this.f338894j;
            double d2 = this.f338895k;
            int i = this.f338896l;
            double d3 = this.f338897m;
            String str = "MicroMsg.LocationGeo";
            double d4 = this.f338898n;
            z4 = z3;
            double d5 = this.f338899o;
            String str2 = this.f338900p;
            hVar.mo165819a(true, d, d2, i, d3, d4, d5, str2, this.f338901q, this.f338902r);
            if (!z2) {
                Log.m105924i(str, "once location, and can use cache");
                this.f338889e.unlock();
                return;
            }
        }
        if (((CopyOnWriteArrayList) this.f338888d).size() == 1 && z4) {
            this.f338890f = System.currentTimeMillis();
            this.f338903s = false;
            this.f338904t = false;
            this.f338886b.mo165823a(this.f338906v, this.f338887c, 0, Looper.getMainLooper());
        }
        this.f338889e.unlock();
    }

    /* renamed from: d */
    public boolean mo126410d() {
        return this.f338885a;
    }

    /* renamed from: e */
    public void mo126411e(C92411b.C92412a aVar) {
        Log.m105925i("MicroMsg.LocationGeo", "getWgs84FromCache wgs84Cache: %s, cacheTime: %s", Boolean.valueOf(this.f338893i), Long.valueOf(this.f338891g));
        if (!this.f338893i || System.currentTimeMillis() - this.f338891g >= 600000) {
            aVar.onGetLocation(false, 0.0f, 0.0f, 0, 0.0d, 0.0d, 0.0d);
            return;
        }
        aVar.onGetLocation(true, (float) this.f338895k, (float) this.f338894j, this.f338896l, (double) ((float) this.f338897m), this.f338898n, this.f338899o);
    }

    /* renamed from: f */
    public void mo126412f(C92411b.C92412a aVar, boolean z) {
        boolean z2;
        C92411b.C92412a aVar2 = aVar;
        Log.m105925i("MicroMsg.LocationGeo", "startGcj02 %s useCache %s ", aVar2, Boolean.valueOf(z));
        if (this.f338886b == null) {
            Log.m105928w("MicroMsg.LocationGeo", "fail, location service not yet ready");
            new MMHandler(Looper.getMainLooper()).post(new C113270c(this, aVar2));
            return;
        }
        m155073l();
        this.f338889e.lock();
        if (!this.f338885a && ((CopyOnWriteArrayList) this.f338888d).size() > 0) {
            this.f338890f = System.currentTimeMillis();
            this.f338903s = false;
            this.f338904t = false;
            C113278i iVar = this.f338886b;
            iVar.f338934a.post(new C113281j(iVar));
            this.f338886b.mo165823a(this.f338905u, this.f338887c, 1, Looper.getMainLooper());
        }
        this.f338885a = true;
        Iterator it = ((CopyOnWriteArrayList) this.f338888d).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((C92411b.C92412a) weakReference.get()).equals(aVar2)) {
                z2 = false;
                break;
            }
        }
        if (z2) {
            ((CopyOnWriteArrayList) this.f338888d).add(new WeakReference(aVar2));
        }
        Log.m105925i("MicroMsg.LocationGeo", "add listeners size %d", Integer.valueOf(((CopyOnWriteArrayList) this.f338888d).size()));
        if (((CopyOnWriteArrayList) this.f338888d).size() == 1 && z2) {
            this.f338890f = System.currentTimeMillis();
            this.f338903s = false;
            this.f338904t = false;
            this.f338886b.mo165823a(this.f338905u, this.f338887c, 1, Looper.getMainLooper());
        }
        if (z && this.f338892h && System.currentTimeMillis() - this.f338891g < 600000) {
            C113276g gVar = this.f338905u;
            double d = this.f338894j;
            double d2 = this.f338895k;
            int i = this.f338896l;
            double d3 = this.f338897m;
            double d4 = this.f338898n;
            double d5 = this.f338899o;
            String str = this.f338900p;
            String str2 = this.f338901q;
            gVar.mo165816a(true, d, d2, i, d3, d4, d5, str, str2, this.f338902r);
        }
        this.f338889e.unlock();
    }

    /* renamed from: g */
    public boolean mo126413g() {
        return this.f338891g > 0 && this.f338893i && System.currentTimeMillis() - this.f338891g < 600000;
    }
}
