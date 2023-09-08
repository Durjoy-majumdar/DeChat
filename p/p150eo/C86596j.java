package p150eo;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import c30.C104289g;
import c30.C26827e;
import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23844i2;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import d42.C86174d;
import d42.C86177e;
import d42.C86195z;
import di3.C86312j;
import e42.C31415g;
import e70.C86457d;
import e70.C86458e;
import e70.C86459f;
import e70.C86460g;
import f70.C86775f;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import i70.C87674f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l10.C24931h;
import o40.C61926c;
import org.json.JSONObject;
import p467co.C80112c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C36907w;
import ux3.C37608c;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: eo.j */
public abstract class C86596j extends C87667c<C86457d, C86596j> {

    /* renamed from: J */
    public boolean f251533J;

    /* renamed from: n */
    public final C80112c f251534n;

    /* renamed from: o */
    public final CopyOnWriteArrayList<String> f251535o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public WeakReference<Activity> f251536p;

    /* renamed from: q */
    public C87667c<?, ?>.a f251537q;

    /* renamed from: r */
    public C32224a<C13598b0> f251538r;

    /* renamed from: s */
    public boolean f251539s;

    /* renamed from: eo.j$d */
    public static final class C7770d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Activity f26265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7770d(Activity activity) {
            super(0);
            this.f26265d = activity;
        }

        public Object invoke() {
            Toast.makeText(this.f26265d, "SCL PROCESS DEAD! RECREATION START! (Only show in debug env)", 1).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.j$a */
    public static final class C86597a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86596j f251540d;

        public C86597a(C86596j jVar) {
            this.f251540d = jVar;
        }

        public final void run() {
            this.f251540d.f251539s = Util.isProcessRunning(MMApplicationContext.getContext(), WeChatProcess.PROCESS_APPBRAND1);
            Log.m105918d("MicroMsg.MagicBrandBaseBiz", "processExist:" + this.f251540d.f251539s);
        }
    }

    /* renamed from: eo.j$b */
    public static final class C86598b {

        /* renamed from: a */
        public final int f251541a;

        /* renamed from: b */
        public final int f251542b;

        /* renamed from: c */
        public final int f251543c;

        /* renamed from: d */
        public final int f251544d;

        /* renamed from: e */
        public final int f251545e;

        public C86598b(int i, int i2, int i3, int i4, int i5) {
            this.f251541a = i;
            this.f251542b = i2;
            this.f251543c = i3;
            this.f251544d = i4;
            this.f251545e = i5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C86598b)) {
                return false;
            }
            C86598b bVar = (C86598b) obj;
            return this.f251541a == bVar.f251541a && this.f251542b == bVar.f251542b && this.f251543c == bVar.f251543c && this.f251544d == bVar.f251544d && this.f251545e == bVar.f251545e;
        }

        public int hashCode() {
            return (((((((this.f251541a * 31) + this.f251542b) * 31) + this.f251543c) * 31) + this.f251544d) * 31) + this.f251545e;
        }

        public String toString() {
            return "BrandCoverViewAttribute(left=" + this.f251541a + ", top=" + this.f251542b + ", width=" + this.f251543c + ", height=" + this.f251544d + ", hide=" + this.f251545e + ')';
        }
    }

    /* renamed from: eo.j$c */
    public static final class C86599c implements C86177e<C86457d, C86598b> {

        /* renamed from: a */
        public final /* synthetic */ C86596j f251546a;

        public C86599c(C86596j jVar) {
            this.f251546a = jVar;
        }

        /* renamed from: a */
        public void mo120575a(Object obj, Object obj2, C86174d dVar) {
            C86457d dVar2 = (C86457d) obj;
            C86598b bVar = (C86598b) obj2;
            C87412m.m108594g(dVar2, "view");
            C87412m.m108594g(bVar, "viewAttribute");
            C87412m.m108594g(dVar, "callback");
            if (mo121042f(dVar2)) {
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = "";
                C24931h.C24944e.C24946b c = C24931h.C24944e.f71088i.toBuilder();
                Object obj3 = dVar2.f251252a;
                if (obj3 instanceof C24931h.C24932a.C24934b) {
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                    int i = ((C24931h.C24932a.C24934b) obj3).f71057e;
                    boolean z = true;
                    c.f71095d |= 1;
                    c.f71096e = i;
                    c.onChanged();
                    C24931h.C24947f.C24949b c2 = C24931h.C24947f.f71100j.toBuilder();
                    int b = C37608c.m41451b(bVar.f251541a, new int[0]);
                    c2.f71108d |= 1;
                    c2.f71109e = b;
                    c2.onChanged();
                    int b2 = C37608c.m41451b(bVar.f251542b, new int[0]);
                    c2.f71108d |= 2;
                    c2.f71110f = b2;
                    c2.onChanged();
                    int b3 = C37608c.m41451b(bVar.f251543c, new int[0]);
                    c2.f71108d |= 4;
                    c2.f71111g = b3;
                    c2.onChanged();
                    int b4 = C37608c.m41451b(bVar.f251544d, new int[0]);
                    c2.f71108d |= 8;
                    c2.f71112h = b4;
                    c2.onChanged();
                    C24931h.C24947f a = c2.build();
                    C23844i2<C24931h.C24947f, C24931h.C24947f.C24949b, Object> i2Var = c.f71099h;
                    if (i2Var == null) {
                        c.f71098g = a;
                        c.onChanged();
                    } else {
                        i2Var.mo37710i(a);
                    }
                    int i2 = c.f71095d | 4;
                    c.f71095d = i2;
                    if (bVar.f251545e <= 0) {
                        z = false;
                    }
                    c.f71095d = i2 | 2;
                    c.f71097f = z;
                    c.onChanged();
                    Log.m105924i("MicroMsg.MagicBrandBaseBiz", ((String) f0Var.f27484d) + " viewId:" + c.f71096e + ",left:" + c2.f71109e + "top:" + c2.f71110f + "height:" + c2.f71112h + "width:" + c2.f71111g);
                    f0Var.f27484d = "updateFrameSet";
                } else {
                    Log.m105920e("MicroMsg.MagicBrandBaseBiz", "view.message is not a MagicbrushBrand.MBApiInsertFrameSet.Builder");
                }
                C80112c cVar = this.f251546a.f251534n;
                String str = (String) f0Var.f27484d;
                C24931h.C24944e a2 = c.buildPartial();
                if (a2.isInitialized()) {
                    cVar.mo121193A(str, a2.toByteArray(), new C86603m(dVar, this, f0Var));
                    return;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a2);
            }
        }

        /* renamed from: b */
        public void mo120576b(Object obj, C86174d dVar) {
            C86457d dVar2 = (C86457d) obj;
            C87412m.m108594g(dVar2, "view");
            C87412m.m108594g(dVar, "callback");
            if (mo121042f(dVar2)) {
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = "";
                C24931h.C24935b.C24937b a = C24931h.C24935b.f71063h.toBuilder();
                Object obj2 = dVar2.f251252a;
                if (obj2 instanceof C24931h.C24932a.C24934b) {
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                    int i = ((C24931h.C24932a.C24934b) obj2).f71057e;
                    a.f71069d |= 2;
                    a.f71071f = i;
                    a.onChanged();
                    f0Var.f27484d = "removeFrameSet";
                }
                C80112c cVar = this.f251546a.f251534n;
                String str = (String) f0Var.f27484d;
                C24931h.C24935b a2 = a.buildPartial();
                if (a2.isInitialized()) {
                    cVar.mo121193A(str, a2.toByteArray(), new C86602l(dVar, this, f0Var));
                    return;
                }
                throw C23803a.C23804a.newUninitializedMessageException(a2);
            }
        }

        /* renamed from: c */
        public void mo120577c(Object obj, Object obj2, C86174d dVar) {
            C86457d dVar2 = (C86457d) obj;
            C86598b bVar = (C86598b) obj2;
            C87412m.m108594g(dVar2, "view");
            C87412m.m108594g(bVar, "viewAttribute");
            C87412m.m108594g(dVar, "callback");
            if (mo121042f(dVar2)) {
                dVar2.f251253b = new WeakReference<>(this.f251546a.f251534n);
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = "";
                if (dVar2.f251252a instanceof C24931h.C24932a.C24934b) {
                    C24931h.C24947f.C24949b c = C24931h.C24947f.f71100j.toBuilder();
                    int i = bVar.f251541a;
                    boolean z = true;
                    c.f71108d |= 1;
                    c.f71109e = i;
                    c.onChanged();
                    int i2 = bVar.f251542b;
                    c.f71108d |= 2;
                    c.f71110f = i2;
                    c.onChanged();
                    int i3 = bVar.f251543c;
                    c.f71108d |= 4;
                    c.f71111g = i3;
                    c.onChanged();
                    int i4 = bVar.f251544d;
                    c.f71108d |= 8;
                    c.f71112h = i4;
                    c.onChanged();
                    Object obj3 = dVar2.f251252a;
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                    C24931h.C24932a.C24934b bVar2 = (C24931h.C24932a.C24934b) obj3;
                    C24931h.C24947f a = c.build();
                    C23844i2<C24931h.C24947f, C24931h.C24947f.C24949b, Object> i2Var = bVar2.f71061i;
                    if (i2Var == null) {
                        bVar2.f71060h = a;
                        bVar2.onChanged();
                    } else {
                        i2Var.mo37710i(a);
                    }
                    bVar2.f71056d |= 8;
                    Object obj4 = dVar2.f251252a;
                    C87412m.m108592e(obj4, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                    C24931h.C24932a.C24934b bVar3 = (C24931h.C24932a.C24934b) obj4;
                    if (bVar.f251545e <= 0) {
                        z = false;
                    }
                    bVar3.f71056d |= 16;
                    bVar3.f71062j = z;
                    bVar3.onChanged();
                    Object obj5 = dVar2.f251252a;
                    C87412m.m108592e(obj5, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                    C24931h.C24932a a2 = ((C24931h.C24932a.C24934b) obj5).buildPartial();
                    if (a2.isInitialized()) {
                        f0Var.f27484d = "insertFrameSet";
                        StringBuilder sb = new StringBuilder();
                        sb.append((String) f0Var.f27484d);
                        sb.append(" viewId:");
                        Object obj6 = dVar2.f251252a;
                        C87412m.m108592e(obj6, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                        sb.append(((C24931h.C24932a.C24934b) obj6).f71057e);
                        sb.append(",left:");
                        Object obj7 = dVar2.f251252a;
                        C87412m.m108592e(obj7, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                        sb.append(((C24931h.C24932a.C24934b) obj7).mo51951d().f71103e);
                        sb.append("top:");
                        Object obj8 = dVar2.f251252a;
                        C87412m.m108592e(obj8, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                        sb.append(((C24931h.C24932a.C24934b) obj8).mo51951d().f71104f);
                        sb.append("height:");
                        Object obj9 = dVar2.f251252a;
                        C87412m.m108592e(obj9, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                        sb.append(((C24931h.C24932a.C24934b) obj9).mo51951d().f71106h);
                        sb.append("width:");
                        Object obj10 = dVar2.f251252a;
                        C87412m.m108592e(obj10, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
                        sb.append(((C24931h.C24932a.C24934b) obj10).mo51951d().f71105g);
                        Log.m105924i("MicroMsg.MagicBrandBaseBiz", sb.toString());
                        this.f251546a.f251534n.mo121193A((String) f0Var.f27484d, a2.toByteArray(), new C86601k(dVar, this, f0Var));
                        return;
                    }
                    throw C23803a.C23804a.newUninitializedMessageException(a2);
                }
                Log.m105920e("MicroMsg.MagicBrandBaseBiz", "apiName invalid");
            }
        }

        /* renamed from: d */
        public C86177e.C86178a mo120578d(Object obj) {
            C87412m.m108594g((C86457d) obj, "view");
            return new C86604n();
        }

        /* renamed from: e */
        public Object mo120579e(JSONObject jSONObject) {
            C87412m.m108594g(jSONObject, "data");
            JSONObject optJSONObject = jSONObject.optJSONObject("position");
            return new C86598b(optJSONObject != null ? optJSONObject.optInt("left", -1) : -1, optJSONObject != null ? optJSONObject.optInt("top", -1) : -1, optJSONObject != null ? optJSONObject.optInt("width", -1) : -1, optJSONObject != null ? optJSONObject.optInt("height", -1) : -1, jSONObject.optInt("hide"));
        }

        /* renamed from: f */
        public final boolean mo121042f(C86457d dVar) {
            String str;
            C87412m.m108594g(dVar, "view");
            Object obj = dVar.f251252a;
            if (!(obj instanceof C24931h.C24932a.C24934b)) {
                Log.m105924i("MicroMsg.MagicBrandBaseBiz", "is not MBApiInsertFrameSet,no need to transfer flutter");
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.flutter.plugin.proto.MagicbrushBrand.MBApiInsertFrameSet.Builder");
            C24931h.C24932a.C24934b bVar = (C24931h.C24932a.C24934b) obj;
            Object obj2 = bVar.f71059g;
            if (!(obj2 instanceof String)) {
                C16994k kVar = (C16994k) obj2;
                str = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    bVar.f71059g = str;
                }
            } else {
                str = (String) obj2;
            }
            if (C87412m.m108589b(str, "popup")) {
                return true;
            }
            Log.m105918d("MicroMsg.MagicBrandBaseBiz", "is not a popup, no need to transfer flutter");
            return false;
        }

        /* renamed from: g */
        public final C31415g mo121043g(int i, String str) {
            C87412m.m108594g(str, "errMsg");
            C31415g gVar = C31415g.C7595b.f25862a;
            if (i == 0) {
                return gVar;
            }
            return new C31415g(4, "fail:internal error" + "flutterErrCode: " + i + ", flutterErrCode:" + str);
        }
    }

    /* renamed from: eo.j$e */
    public static final class C86600e extends C80403e {

        /* renamed from: b */
        public final /* synthetic */ C86596j f251547b;

        public C86600e(C86596j jVar) {
            this.f251547b = jVar;
        }

        /* renamed from: a */
        public void mo56329a() {
            Log.m105924i("MicroMsg.MagicBrandBaseBiz", "run pending exceptionListener");
            C32224a<C13598b0> aVar = this.f251547b.f251538r;
            if (aVar != null) {
                aVar.invoke();
            }
            AppUIForegroundOwner.INSTANCE.removeLifecycleCallback((C80403e) this);
        }

        /* renamed from: b */
        public void mo56330b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86596j(C80112c cVar) {
        super((C87674f) null, 1, (C8480h) null);
        C87412m.m108594g(cVar, "flutterPlugin");
        this.f251534n = cVar;
        cVar.f234604j = this;
        ((C119157j) C119157j.f356862d).mo183884o(new C86597a(this));
    }

    /* renamed from: A0 */
    public void mo121036A0(MBBuildConfig<C86596j> mBBuildConfig) {
        C87412m.m108594g(mBBuildConfig, "buildConfig");
        mBBuildConfig.mo118367a(C110826x0.m151014b(new C86460g(), new C86458e(), new C86459f()));
        super.mo121036A0(mBBuildConfig);
    }

    /* renamed from: B0 */
    public void mo121029B0() {
        super.mo121029B0();
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C87667c<ViewType, T>.a i0 = mo122091i0(this, context, mo118862l0(), "frames", "");
        C80112c cVar = this.f251534n;
        cVar.getClass();
        cVar.f251873e.put(i0.f253930e, i0);
        this.f251537q = i0;
    }

    /* renamed from: a0 */
    public void mo109586a0() {
        WeakReference<Activity> weakReference;
        Activity activity;
        AppUIForegroundOwner appUIForegroundOwner = AppUIForegroundOwner.INSTANCE;
        boolean isForeground = appUIForegroundOwner.isForeground();
        Log.m105924i("MicroMsg.MagicBrandBaseBiz", "onConnException foreground: " + isForeground);
        super.mo109586a0();
        if (!(!WeChatEnvironment.hasDebugger() || (weakReference = this.f251536p) == null || (activity = weakReference.get()) == null)) {
            C61926c.m72668M(new C7770d(activity));
        }
        if (isForeground) {
            C32224a<C13598b0> aVar = this.f251538r;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        appUIForegroundOwner.addLifecycleCallback((C80403e) new C86600e(this));
    }

    /* renamed from: b */
    public void mo109587b() {
        if (WeChatEnvironment.hasDebugger()) {
            synchronized (mo122095o0()) {
                for (String str : this.f251535o) {
                    C86195z o0 = mo122095o0();
                    C87412m.m108593f(str, LocaleUtil.ITALIAN);
                    C86195z.C86196a.m106752a(o0, str, (C32226l) null, 2, (Object) null);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        super.mo109587b();
    }

    /* renamed from: e0 */
    public Activity mo8720e0() {
        WeakReference<Activity> weakReference = this.f251536p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g0 */
    public C86177e<C86457d, C86598b> mo118860g0(String str) {
        C87412m.m108594g(str, "containerTag");
        return new C86599c(this);
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        Log.m105924i("MicroMsg.MagicBrandBaseBiz", "destroy");
        C80112c cVar = this.f251534n;
        cVar.getClass();
        CommonKt.uiThread(new C86775f(cVar));
        C87667c<?, ?>.a aVar = this.f251537q;
        if (aVar != null) {
            this.f251534n.mo121171e(aVar.f253930e);
        }
        super.mo118861j0();
        if (WeChatEnvironment.hasDebugger()) {
            this.f251535o.clear();
        }
    }

    public void onCreated() {
        super.onCreated();
    }

    /* renamed from: u0 */
    public void mo121037u0(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        super.mo121037u0(aVar);
        if (!this.f253918e.isEmpty()) {
            CopyOnWriteArrayList<C87667c.C87669b> copyOnWriteArrayList = this.f253918e;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(copyOnWriteArrayList, 10));
            for (C87667c.C87669b bVar : copyOnWriteArrayList) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.f253933a);
                sb.append('|');
                String str = bVar.f253934b;
                int length = str.length();
                if (length > 50) {
                    length = 50;
                }
                String substring = str.substring(0, length);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                arrayList.add(sb.toString());
            }
            List<String> y0 = C110818d0.m150953y0(arrayList);
            MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
            String l0 = mo118862l0();
            C87412m.m108594g(l0, "bizName");
            C26827e eVar = new C26827e();
            for (String q : y0) {
                eVar.mo53846q(q);
            }
            C104289g gVar = new C104289g();
            gVar.put("bizName", l0);
            gVar.put("event", y0);
            String name = IMagicBrushMonitor.Key.MagicBrandNotSendPendingEvents.name();
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "json.toString()");
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(name, 0, C112551y.m153815o(gVar2, ',', ';', false, 4, (Object) null));
        }
    }
}
