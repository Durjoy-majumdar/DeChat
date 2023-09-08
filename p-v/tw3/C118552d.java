package tw3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineGroup;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.view.FlutterMain;
import vw3.C118708b;
import ww3.C118789a;
import xw3.C38867b;

/* renamed from: tw3.d */
public class C118552d {

    /* renamed from: l */
    public static final Integer f354795l = 1000;

    /* renamed from: m */
    public static C118552d f354796m;

    /* renamed from: a */
    public C118553a f354797a;

    /* renamed from: b */
    public FlutterEngineGroup f354798b;

    /* renamed from: c */
    public FlutterEngine f354799c;

    /* renamed from: d */
    public int f354800d;

    /* renamed from: e */
    public C118708b f354801e;

    /* renamed from: f */
    public HashMap<String, C118708b> f354802f = new HashMap<>();

    /* renamed from: g */
    public SparseArray<FlutterEngine> f354803g = new SparseArray<>();

    /* renamed from: h */
    public SparseArray<FlutterView> f354804h = new SparseArray<>();

    /* renamed from: i */
    public Boolean f354805i = Boolean.FALSE;

    /* renamed from: j */
    public Handler f354806j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public AtomicInteger f354807k = new AtomicInteger(f354795l.intValue());

    /* renamed from: tw3.d$a */
    public static class C118553a {

        /* renamed from: a */
        public String f354808a = FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;

        /* renamed from: b */
        public FlutterShellArgs f354809b;

        /* renamed from: c */
        public HashSet<C118548a> f354810c;

        /* renamed from: d */
        public C118789a.C118791b f354811d;

        /* renamed from: e */
        public HashSet<FlutterPlugin> f354812e;

        /* renamed from: f */
        public Context f354813f;

        /* renamed from: g */
        public List<String> f354814g;

        static {
            FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
        }

        public C118553a(Context context) {
            RenderMode renderMode = RenderMode.surface;
            this.f354809b = new FlutterShellArgs(new String[0]);
            this.f354810c = new HashSet<>();
            this.f354812e = new HashSet<>();
            this.f354813f = context;
        }
    }

    /* renamed from: g */
    public static C118552d m167207g() {
        if (f354796m == null) {
            synchronized (C118552d.class) {
                f354796m = new C118552d();
            }
        }
        return f354796m;
    }

    /* renamed from: a */
    public void mo183262a(FlutterView flutterView, int i) {
        C118789a.m167472c("WxaRouter.WxaRouter", "appIsResumed view:%d engineId:%d", Integer.valueOf(flutterView.hashCode()), Integer.valueOf(i));
        if (this.f354804h.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "please attach activity first.", new Object[0]);
        } else if (flutterView == this.f354804h.get(i)) {
            mo183267f(i).getLifecycleChannel().appIsResumed();
        }
    }

    /* renamed from: b */
    public void mo183263b(C118708b bVar, int i) {
        C118789a.m167472c("WxaRouter.WxaRouter", "attach activityId:%s engineId:%d", bVar.getFlutterViewId(), Integer.valueOf(i));
        if (this.f354803g.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "attach failed.", new Object[0]);
            return;
        }
        if (mo183267f(i) == this.f354799c) {
            C118789a.m167472c("WxaRouter.WxaRouter", "default engine attach", new Object[0]);
        }
        this.f354802f.put(bVar.getFlutterViewId(), bVar);
        this.f354801e = bVar;
    }

    /* renamed from: c */
    public void mo183264c(FlutterView flutterView, int i) {
        C118789a.m167472c("WxaRouter.WxaRouter", "attachViewToFlutterEngine view:%d engineId:%d", Integer.valueOf(flutterView.hashCode()), Integer.valueOf(i));
        if (this.f354803g.indexOfKey(i) < 0) {
            C118789a.m167471b("WxaRouter.WxaRouter", "please attach activity first.", new Object[0]);
            return;
        }
        FlutterEngine f = mo183267f(i);
        FlutterView flutterView2 = this.f354804h.get(i);
        if (flutterView2 != null) {
            if (flutterView == flutterView2) {
                C118789a.m167470a("WxaRouter.WxaRouter", "same flutter view. ignore", new Object[0]);
                return;
            }
            flutterView2.detachFromFlutterEngine();
        }
        flutterView.attachToFlutterEngine(f);
        this.f354804h.put(i, flutterView);
    }

    /* renamed from: d */
    public final void mo183265d(C118553a aVar) {
        long j;
        C38867b.C38868a aVar2 = C38867b.f104768a;
        C38867b.f104769b.put(String.valueOf(this.f354807k.toString()), Long.valueOf(System.currentTimeMillis()));
        FlutterMain.startInitialization(aVar.f354813f);
        FlutterMain.ensureInitializationComplete(aVar.f354813f, aVar.f354809b.toArray());
        DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(FlutterMain.findAppBundlePath(), this.f354797a.f354808a);
        this.f354797a.getClass();
        String format = String.format("%s-%s", new Object[]{"/", Integer.valueOf(this.f354807k.get())});
        FlutterEngine createAndRunEngine = this.f354798b.createAndRunEngine(new FlutterEngineGroup.Options(this.f354797a.f354813f).setDartEntrypoint(dartEntrypoint).setInitialRoute(format).setAutomaticallyRegisterPlugins(true).setDartEntrypointArgs(aVar.f354814g));
        int i = this.f354807k.get();
        if (createAndRunEngine != null) {
            this.f354803g.put(i, createAndRunEngine);
        } else {
            C118789a.m167474e("WxaRouter.WxaRouter", "engine is null.", new Object[0]);
        }
        if (this.f354799c == null) {
            this.f354799c = createAndRunEngine;
            this.f354800d = this.f354807k.get();
        }
        C118789a.m167472c("WxaRouter.WxaRouter", "create flutter engineId:%s", Integer.valueOf(this.f354807k.get()));
        C118789a.m167472c("WxaRouter.WxaRouter", "registerPlugins by wxa router", new Object[0]);
        HashSet<FlutterPlugin> hashSet = this.f354797a.f354812e;
        if (hashSet != null) {
            Iterator<FlutterPlugin> it = hashSet.iterator();
            while (it.hasNext()) {
                FlutterPlugin next = it.next();
                if (createAndRunEngine.getPlugins().has(next.getClass())) {
                    C118789a.m167474e("WxaRouter.GeneratedPluginRegistrant", "plugin: " + next.toString() + " has registered.", new Object[0]);
                    createAndRunEngine.getPlugins().remove((Class<? extends FlutterPlugin>) next.getClass());
                }
                createAndRunEngine.getPlugins().add(next);
            }
        }
        if (this.f354797a.f354810c != null) {
            C118554e eVar = (C118554e) createAndRunEngine.getPlugins().get(C118554e.class);
            if (eVar != null) {
                HashSet<C118548a> hashSet2 = this.f354797a.f354810c;
                if (!eVar.f354816e.contains(hashSet2)) {
                    eVar.f354816e.addAll(hashSet2);
                } else {
                    C118789a.m167472c("WxaRouter.WxaRouterPlugin", "had add method call handler %s", Integer.valueOf(hashSet2.hashCode()));
                }
            }
        } else {
            C118789a.m167472c("WxaRouter.WxaRouter", "no method call handler.", new Object[0]);
        }
        createAndRunEngine.getNavigationChannel().setInitialRoute(format);
        if (!createAndRunEngine.getDartExecutor().isExecutingDart()) {
            createAndRunEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint, aVar.f354814g);
        }
        Object[] objArr = new Object[1];
        C38867b.C38868a aVar3 = C38867b.f104768a;
        String atomicInteger = this.f354807k.toString();
        C87412m.m108594g(atomicInteger, "key");
        HashMap<String, Long> hashMap = C38867b.f104769b;
        if (hashMap.containsKey(atomicInteger)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = hashMap.get(atomicInteger);
            C87412m.m108591d(l);
            j = currentTimeMillis - l.longValue();
        } else {
            j = 0;
        }
        objArr[0] = Long.valueOf(j);
        C118789a.m167472c("WxaRouter.WxaRouter", "TimeRecord createFlutterEngine:%d", objArr);
        this.f354807k.addAndGet(1);
    }

    /* renamed from: e */
    public C118708b mo183266e(String str) {
        if (this.f354802f.containsKey(str)) {
            return this.f354802f.get(str);
        }
        return null;
    }

    /* renamed from: f */
    public FlutterEngine mo183267f(int i) {
        return this.f354803g.get(i);
    }

    /* renamed from: h */
    public void mo183268h(int i, String str, Object obj) {
        if (this.f354803g.indexOfKey(i) > -1) {
            C118554e eVar = (C118554e) mo183267f(i).getPlugins().get(C118554e.class);
            if (eVar != null) {
                eVar.f354815d.mo183359a(str, obj, (MethodChannel.Result) null);
                return;
            }
            return;
        }
        C118789a.m167474e("WxaRouter.WxaRouter", "engine is null.", new Object[0]);
    }

    /* renamed from: i */
    public void mo183269i() {
        if (this.f354799c == null || this.f354805i.booleanValue()) {
            C118553a aVar = this.f354797a;
            if (this.f354798b == null) {
                this.f354798b = new FlutterEngineGroup(aVar.f354813f);
            }
            this.f354799c = null;
            this.f354805i = Boolean.FALSE;
            mo183265d(this.f354797a);
        }
    }

    /* renamed from: j */
    public int mo183270j(Boolean bool) {
        int i = this.f354807k.get();
        C118553a aVar = this.f354797a;
        if (this.f354798b == null) {
            this.f354798b = new FlutterEngineGroup(aVar.f354813f);
        }
        if (this.f354799c == null) {
            mo183265d(this.f354797a);
            if (!bool.booleanValue()) {
                this.f354805i = Boolean.TRUE;
            }
            C118789a.m167472c("WxaRouter.WxaRouter", "provideFlutterEngine defaultFlutterEngine: %d", Integer.valueOf(i));
            return i;
        } else if (!this.f354805i.booleanValue()) {
            C118789a.m167472c("WxaRouter.WxaRouter", "provideFlutterEngine prepare defaultFlutterEngine: %d", Integer.valueOf(this.f354800d));
            if (!bool.booleanValue()) {
                this.f354805i = Boolean.TRUE;
            }
            return this.f354800d;
        } else {
            mo183265d(this.f354797a);
            C118789a.m167472c("WxaRouter.WxaRouter", "provideFlutterEngine spawnFlutterEngine:%d", Integer.valueOf(i));
            return i;
        }
    }
}
