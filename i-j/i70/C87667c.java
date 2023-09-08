package i70;

import android.content.Context;
import android.view.View;
import c30.C104289g;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.magicbrush.C30187e0;
import com.tencent.p014mm.plugin.magicbrush.C30223r0;
import com.tencent.p014mm.plugin.magicbrush.C85278l0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import d42.C86183k;
import d42.C86194y;
import d42.C86195z;
import di3.C86312j;
import e42.C86428f;
import fy3.C32227p;
import g70.C87162f;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h70.C87459d;
import i70.C87672e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C26236u;
import z04.C66713a;

/* renamed from: i70.c */
public abstract class C87667c<ViewType, T extends C86428f<ViewType>> extends C86428f<ViewType> implements C86194y, C86183k {

    /* renamed from: m */
    public static final List<String> f253915m = C26236u.m33719b("surface:frameSet:scroll");

    /* renamed from: c */
    public final C87674f f253916c;

    /* renamed from: d */
    public C86195z<T> f253917d;

    /* renamed from: e */
    public final CopyOnWriteArrayList<C87669b> f253918e;

    /* renamed from: f */
    public boolean f253919f;

    /* renamed from: g */
    public final C87672e f253920g;

    /* renamed from: h */
    public final HashMap<String, C87164i> f253921h;

    /* renamed from: i */
    public final HashMap<String, C87162f> f253922i;

    /* renamed from: j */
    public final ConcurrentHashMap<String, C87667c<ViewType, T>.a> f253923j;

    /* renamed from: k */
    public C87665a f253924k;

    /* renamed from: l */
    public final C87671d f253925l;

    /* renamed from: i70.c$a */
    public final class C87668a {

        /* renamed from: a */
        public final String f253926a;

        /* renamed from: b */
        public final String f253927b;

        /* renamed from: c */
        public final String f253928c;

        /* renamed from: d */
        public final String f253929d;

        /* renamed from: e */
        public final String f253930e;

        /* renamed from: f */
        public final HashMap<String, C87164i> f253931f = new HashMap<>();

        /* renamed from: g */
        public final /* synthetic */ C87667c<ViewType, T> f253932g;

        public C87668a(C87667c cVar, String str, String str2, String str3, String str4, String str5, WeakReference<Context> weakReference) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "appContextId");
            C87412m.m108594g(str3, "path");
            C87412m.m108594g(str4, SearchIntents.EXTRA_QUERY);
            C87412m.m108594g(str5, "id");
            C87412m.m108594g(weakReference, "wkContext");
            this.f253932g = cVar;
            this.f253926a = str;
            this.f253927b = str2;
            this.f253928c = str3;
            this.f253929d = str4;
            this.f253930e = str5;
        }

        /* renamed from: b */
        public static void m109055b(C87668a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            aVar.getClass();
            C87412m.m108594g(str, "data");
            C87412m.m108594g(str2, "frameSetName");
            C104289g gVar = new C104289g();
            gVar.put("frameSetName", str2);
            gVar.put("data", str);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …             }.toString()");
            aVar.mo122099a(gVar2, str3);
        }

        /* renamed from: a */
        public final void mo122099a(String str, String str2) {
            C87412m.m108594g(str, "data");
            C87667c<ViewType, T> cVar = this.f253932g;
            cVar.getClass();
            C87674f fVar = cVar.f253916c;
            fVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", this.f253926a);
            jSONObject.put("frameSetRootId", this.f253930e);
            jSONObject.put("data", str);
            jSONObject.put("extInfo", str2 == null ? "" : str2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   … \"\")\n        }.toString()");
            Log.m105918d("MagicSclEventHandler", "extInfo:" + str2 + " data:" + jSONObject2);
            fVar.mo122111a("surface:frameSetRoot:dataChange", jSONObject2);
        }

        /* renamed from: c */
        public final void mo122100c() {
            String p0 = this.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + this.f253930e + " destroy: " + this.f253926a);
            LinkedList<C87164i> linkedList = new LinkedList<>(this.f253931f.values());
            C87667c<ViewType, T> cVar = this.f253932g;
            for (C87164i iVar : linkedList) {
                iVar.mo121604g();
                String p05 = cVar.mo122096p0();
                Log.m105924i(p05, "frameSetWithRoot unBind " + iVar.f252786b);
            }
            LinkedList linkedList2 = new LinkedList(this.f253932g.f253921h.values());
            ArrayList<C87164i> arrayList = new ArrayList<>();
            for (Object next : linkedList2) {
                if (C87412m.m108589b(((C87164i) next).f252787c, this)) {
                    arrayList.add(next);
                }
            }
            C87667c<ViewType, T> cVar2 = this.f253932g;
            for (C87164i iVar2 : arrayList) {
                MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
                String str = iVar2.f252786b;
                synchronized (magicSclBrandReporter) {
                    C87412m.m108594g(str, "frameSetId");
                    if (MagicSclBrandReporter.f237837b.remove(str) != null) {
                        Log.m105924i("MicroMsg.MagicSclReporter", "removeFrameSetInfo " + str);
                    }
                }
                ((C87459d) C86312j.m106911c(C87459d.class)).ij0(iVar2);
                cVar2.f253921h.remove(iVar2.f252786b);
            }
            this.f253932g.mo121037u0(this);
            this.f253931f.clear();
        }

        /* renamed from: d */
        public final C13604l<C87164i, Boolean> mo122101d(String str) {
            Class cls = C87459d.class;
            C87412m.m108594g(str, "frameSetName");
            String str2 = this.f253930e + '-' + str;
            C87164i uo = ((C87459d) C86312j.m106911c(cls)).mo58574uo(str2);
            if (uo != null) {
                return new C13604l<>(uo, Boolean.FALSE);
            }
            C87164i ye02 = ((C87459d) C86312j.m106911c(cls)).ye0(new C87164i(str, str2, this, this.f253932g.mo122095o0().mo120603h(), (HashSet) null, (String) null, 0, 0, 240, (C8480h) null));
            Log.m105924i(this.f253932g.mo122096p0(), "create new frameSet: " + ye02);
            return new C13604l<>(ye02, Boolean.TRUE);
        }

        /* renamed from: e */
        public final void mo122102e() {
            String p0 = this.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + this.f253930e + " pause: " + this.f253926a);
            this.f253932g.mo121541w0(this);
        }

        /* renamed from: f */
        public final void mo122103f() {
            String p0 = this.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + this.f253930e + " reDraw: " + this.f253926a);
            Collection<C87164i> values = this.f253931f.values();
            C87412m.m108593f(values, "boundFrameSets.values");
            for (C87164i iVar : values) {
                C87412m.m108593f(iVar, "frameSet");
                mo122104g(iVar);
            }
        }

        /* renamed from: g */
        public final void mo122104g(C87164i iVar) {
            C87412m.m108594g(iVar, "frameSet");
            String p0 = this.f253932g.mo122096p0();
            Log.m105924i(p0, "redraw " + iVar);
            C87667c<ViewType, T> cVar = this.f253932g;
            cVar.getClass();
            C87674f fVar = cVar.f253916c;
            fVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("frameSetRootId", this.f253930e);
            jSONObject.put("frameSetId", iVar.f252786b);
            jSONObject.put("viewId", iVar.f252800p);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …wId)\n        }.toString()");
            fVar.mo122111a("surface:frameSet:redraw", jSONObject2);
        }

        /* renamed from: h */
        public final void mo122105h() {
            String p0 = this.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + this.f253930e + " resume: " + this.f253926a);
            this.f253932g.mo121542x0(this);
        }
    }

    /* renamed from: i70.c$b */
    public static final class C87669b {

        /* renamed from: a */
        public String f253933a;

        /* renamed from: b */
        public String f253934b;

        public C87669b(String str, String str2) {
            C87412m.m108594g(str, "event");
            C87412m.m108594g(str2, "data");
            this.f253933a = str;
            this.f253934b = str2;
        }
    }

    /* renamed from: i70.c$c */
    public static final class C87670c extends C87413o implements C32227p<String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87667c<ViewType, T> f253935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87670c(C87667c<ViewType, T> cVar) {
            super(2);
            this.f253935d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str, "event");
            C87412m.m108594g(str2, "param");
            this.f253935d.mo122098z0(str, str2);
            return C13598b0.f38549a;
        }
    }

    public C87667c(C87674f fVar, int i, C8480h hVar) {
        fVar = (i & 1) != 0 ? new C87674f() : fVar;
        C87412m.m108594g(fVar, "eventHandler");
        this.f253916c = fVar;
        this.f253918e = new CopyOnWriteArrayList<>();
        this.f253920g = new C87672e();
        this.f253921h = new HashMap<>();
        this.f253922i = new HashMap<>();
        this.f253923j = new ConcurrentHashMap<>();
        this.f253925l = new C87671d(this);
    }

    /* renamed from: A0 */
    public void mo121036A0(MBBuildConfig<T> mBBuildConfig) {
        C87412m.m108594g(mBBuildConfig, "buildConfig");
        mBBuildConfig.f248375n = this;
        mBBuildConfig.f248376o = this.f253924k;
        mBBuildConfig.f248373i = false;
        C86195z o0 = mo122095o0();
        o0.mo120607r(this);
        o0.mo120604m(mBBuildConfig);
        String p0 = mo122096p0();
        Log.m105924i(p0, "MagicBrush setup " + mo118862l0());
    }

    /* renamed from: B */
    public void mo109582B(int i, View view) {
        String str;
        C87164i n0;
        C87412m.m108594g(view, "view");
        String p0 = mo122096p0();
        Log.m105924i(p0, "onCanvasViewDestroy canvasId:" + i);
        C87672e.C87673a aVar = this.f253920g.f253937a.get(Integer.valueOf(i));
        if (aVar == null || (str = aVar.f253939b) == null) {
            str = "";
        }
        if (!C87412m.m108589b(str, "") && (n0 = mo122094n0(str)) != null) {
            MagicSclViewContainer magicSclViewContainer = n0.f252796l;
            if (magicSclViewContainer != null) {
                magicSclViewContainer.removeView(view);
            }
            String p05 = mo122096p0();
            Log.m105924i(p05, "onCanvasViewDestroy frameSetId:" + str + " remove canvasId:" + i);
        }
        C87672e.C87673a remove = this.f253920g.f253937a.remove(Integer.valueOf(i));
    }

    /* renamed from: B0 */
    public void mo121029B0() {
        Log.m105924i(mo122096p0(), IXWebBroadcastListener.STAGE_START);
        mo122095o0().start();
    }

    /* renamed from: R */
    public void mo109583R(int i, View view, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "view");
        String p0 = mo122096p0();
        Log.m105924i(p0, "onCanvasViewLayout canvasId:" + i + " left:" + i2 + ",top:" + i3 + ",width:" + i4 + ",height:" + i5);
        C87672e.C87673a a = this.f253920g.mo122106a(i);
        if (a != null) {
            a.f253940c = i2;
            a.f253941d = i3;
            a.f253942e = i4;
            a.f253943f = i5;
            a.mo122107a();
        }
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        String p0 = mo122096p0();
        Log.m105920e(p0, "onJSException envId:" + str + ", msg:" + str2);
    }

    /* renamed from: Z */
    public void mo109585Z(int i, View view) {
        C87412m.m108594g(view, "view");
        String p0 = mo122096p0();
        Log.m105924i(p0, "onCanvasViewCreated canvasId:" + i);
        C87672e.m109065b(this.f253920g, i, (String) null, view, 2, (Object) null);
        mo122090h0(i);
    }

    /* renamed from: a0 */
    public void mo109586a0() {
        Log.m105920e(mo122096p0(), "onConnException");
        AppUIForegroundOwner.INSTANCE.removeLifecycleCallback((C80403e) this.f253925l);
    }

    /* renamed from: b */
    public void mo109587b() {
        Log.m105924i(mo122096p0(), "onMainScriptInjected");
        synchronized (mo122095o0()) {
            for (C87669b bVar : this.f253918e) {
                mo122095o0().mo120601d(bVar.f253933a, bVar.f253934b);
                int i = 200;
                if (C87412m.m108589b(bVar.f253933a, "surface:frameSetRoot:dataChange")) {
                    String p0 = mo122096p0();
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendEvent pending dataChange value:");
                    String str = bVar.f253934b;
                    int length = str.length();
                    if (length <= 200) {
                        i = length;
                    }
                    String substring = str.substring(0, i);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    Log.m105918d(p0, sb.toString());
                } else if (!f253915m.contains(bVar.f253933a)) {
                    String p05 = mo122096p0();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("sendEvent pending:");
                    sb4.append(bVar.f253933a);
                    sb4.append(" value:");
                    String str2 = bVar.f253934b;
                    int length2 = str2.length();
                    if (length2 <= 200) {
                        i = length2;
                    }
                    String substring2 = str2.substring(0, i);
                    C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring2);
                    Log.m105924i(p05, sb4.toString());
                }
            }
            this.f253918e.clear();
            this.f253919f = true;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public void mo109588c(int i, boolean z) {
        C13598b0 b0Var;
        C87164i m0 = mo122093m0(i);
        C87672e.C87673a a = this.f253920g.mo122106a(i);
        String str = null;
        if (a != null) {
            a.f253949l = true;
            if (!z && a.f253950m) {
                Log.m105924i(mo122096p0(), "draw on off screen and surfaceAvailable! redraw now " + i + ' ' + m0);
                if (m0 != null) {
                    m0.mo121601e();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    a.f253948k = true;
                }
            }
        }
        String p0 = mo122096p0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCanvasViewFirstFrameRendered canvasId:");
        sb.append(i);
        sb.append(" frameSetName:");
        if (m0 != null) {
            str = m0.f252785a;
        }
        sb.append(str);
        sb.append(" surfaceReady:");
        sb.append(z);
        Log.m105924i(p0, sb.toString());
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        String p0 = mo122096p0();
        Log.m105924i(p0, "onDestroy reason:" + i);
        AppUIForegroundOwner.INSTANCE.removeLifecycleCallback((C80403e) this.f253925l);
    }

    /* renamed from: h */
    public void mo120599h(int i) {
        String p0 = mo122096p0();
        Log.m105924i(p0, "onCanvasViewSurfaceAvailable canvasId:" + i);
        C87672e.C87673a a = this.f253920g.mo122106a(i);
        C13598b0 b0Var = null;
        if (a != null) {
            a.f253950m = true;
            if (a.f253949l) {
                C87164i m0 = mo122093m0(i);
                String p05 = mo122096p0();
                Log.m105924i(p05, "firstFrame before available, redraw " + i + ' ' + m0);
                if (m0 != null) {
                    m0.mo121601e();
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    a.f253948k = true;
                }
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            String p06 = mo122096p0();
            Log.m105928w(p06, "onCanvasViewSurfaceAvailable but canvas not found? " + i);
        }
    }

    /* renamed from: h0 */
    public final void mo122090h0(int i) {
        C87672e.C87673a a;
        C87164i m0 = mo122093m0(i);
        if (m0 != null && (a = this.f253920g.mo122106a(i)) != null) {
            View view = a.f253944g;
            if (view != null) {
                if (view.getParent() == null) {
                    MagicSclViewContainer magicSclViewContainer = m0.f252796l;
                    if (magicSclViewContainer != null) {
                        magicSclViewContainer.addView(view);
                    }
                    MagicSclViewContainer magicSclViewContainer2 = m0.f252796l;
                    if (magicSclViewContainer2 != null) {
                        magicSclViewContainer2.bringChildToFront(magicSclViewContainer2 != null ? magicSclViewContainer2.getCoverViewRoot() : null);
                    }
                    String p0 = mo122096p0();
                    Log.m105924i(p0, "notifyCanvasAndFrameSet " + m0 + " addView");
                }
                a.mo122107a();
            }
            if (a.f253948k) {
                Log.m105924i(mo122096p0(), "found pendingRedraw, do it");
                m0.mo121601e();
            }
        }
    }

    /* renamed from: i0 */
    public final C87667c<ViewType, T>.a mo122091i0(Object obj, Context context, String str, String str2, String str3) {
        C87412m.m108594g(obj, "target");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, SearchIntents.EXTRA_QUERY);
        long hashCode = ((long) obj.hashCode()) & Util.MAX_32BIT_VALUE;
        C66713a.m78712a(16);
        String l = Long.toString(hashCode, 16);
        C87412m.m108593f(l, "toString(this, checkRadix(radix))");
        WeakReference weakReference = new WeakReference(context);
        C87162f fVar = this.f253922i.get(str);
        if (fVar == null) {
            fVar = new C87162f(str);
            String p0 = mo122096p0();
            Log.m105924i(p0, "create AppContext#" + fVar.f252781b + ": " + str);
            this.f253922i.put(str, fVar);
            mo121538s0(fVar);
        }
        C87668a aVar = new C87668a(this, str, fVar.f252781b, str2, str3, l, weakReference);
        String p05 = mo122096p0();
        Log.m105924i(p05, "create FrameSetRoot#" + l + ": " + str);
        mo121539t0(aVar);
        this.f253923j.put(aVar.f253930e, aVar);
        return aVar;
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        Log.m105924i(mo122096p0(), "cleanup");
        this.f253918e.clear();
        mo122095o0().destroy();
        synchronized (mo122095o0()) {
            this.f253919f = false;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        this.f253920g.f253937a.clear();
        this.f253921h.clear();
        this.f253922i.clear();
        this.f253923j.clear();
        ((C30187e0) C86312j.m106911c(C30187e0.class)).Ik0(mo122095o0().mo120603h(), C30223r0.AllEvent);
    }

    /* renamed from: k0 */
    public void mo122092k0(MBJsEventBase mBJsEventBase) {
        C87412m.m108594g(mBJsEventBase, "event");
        if (!this.f253919f) {
            Log.m105918d(mo122096p0(), "mainScript not injected dispatch MBJsEventBase");
            return;
        }
        if (!f253915m.contains(mBJsEventBase.f81581d)) {
            String p0 = mo122096p0();
            Log.m105924i(p0, "dispatch event: " + mBJsEventBase);
        }
        mo122098z0(mBJsEventBase.f81581d, mBJsEventBase.f81582e);
    }

    /* renamed from: l0 */
    public abstract String mo118862l0();

    /* renamed from: m0 */
    public final C87164i mo122093m0(int i) {
        String str;
        C87672e.C87673a aVar = this.f253920g.f253937a.get(Integer.valueOf(i));
        if (aVar == null || (str = aVar.f253939b) == null) {
            str = "";
        }
        return mo122094n0(str);
    }

    /* renamed from: n */
    public void mo109590n() {
        Log.m105924i(mo122096p0(), "onServiceReady");
    }

    /* renamed from: n0 */
    public final C87164i mo122094n0(String str) {
        C87412m.m108594g(str, "id");
        return this.f253921h.get(str);
    }

    /* renamed from: o0 */
    public final C86195z<T> mo122095o0() {
        C86195z<T> zVar = this.f253917d;
        if (zVar != null) {
            return zVar;
        }
        C87412m.m108603p("magicBrush");
        throw null;
    }

    public void onCreated() {
        Log.m105924i(mo122096p0(), "onCreated");
        AppUIForegroundOwner.INSTANCE.addLifecycleCallback((C80403e) this.f253925l);
    }

    public void onPause() {
        Log.m105924i(mo122096p0(), "onPause");
    }

    public void onResume() {
        Log.m105924i(mo122096p0(), "onResume");
    }

    /* renamed from: p0 */
    public final String mo122096p0() {
        return "MicroMsg.MagicSclBaseBiz." + mo118862l0();
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        Log.m105924i(mo122096p0(), APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C86195z<T> mI = ((C85278l0) C86312j.m106911c(C85278l0.class)).mo57202mI(mo118862l0());
        C87412m.m108594g(mI, "<set-?>");
        this.f253917d = mI;
        this.f253918e.clear();
        this.f253916c.f253951a = new C87670c(this);
    }

    /* renamed from: r0 */
    public void mo118864r0(C87667c<?, ?>.a aVar, C87164i iVar, String str) {
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        C87412m.m108594g(str, "info");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("frameSetId", iVar.f252786b);
        jSONObject2.put("viewId", iVar.f252800p);
        jSONObject2.put("frameSetName", iVar.f252785a);
        jSONObject2.put("width", iVar.f252790f);
        jSONObject2.put("height", iVar.f252791g);
        jSONObject2.put("info", str);
        jSONArray.put(jSONObject2);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("frameSets", jSONArray);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
        fVar.mo122111a("surface:frameSet:available", jSONObject3);
    }

    /* renamed from: s0 */
    public void mo121538s0(C87162f fVar) {
        C87412m.m108594g(fVar, "appContext");
        C87674f fVar2 = this.f253916c;
        fVar2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", fVar.f252780a);
        jSONObject.put("appContextId", fVar.f252781b);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   ….id)\n        }.toString()");
        fVar2.mo122111a("surface:appContext:available", jSONObject2);
    }

    /* renamed from: t0 */
    public void mo121539t0(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("appContextId", aVar.f253927b);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", aVar.f253928c);
        jSONObject2.put(SearchIntents.EXTRA_QUERY, aVar.f253929d);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("launchInfo", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
        fVar.mo122111a("surface:frameSetRoot:available", jSONObject3);
    }

    /* renamed from: u0 */
    public void mo121037u0(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   ….id)\n        }.toString()");
        fVar.mo122111a("surface:frameSetRoot:destroyed", jSONObject2);
    }

    /* renamed from: v0 */
    public void mo121540v0(C87667c<?, ?>.a aVar, C87164i iVar) {
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("frameSetId", iVar.f252786b);
        jSONObject2.put("viewId", iVar.f252800p);
        jSONObject2.put("frameSetName", iVar.f252785a);
        jSONObject2.put("width", iVar.f252790f);
        jSONObject2.put("height", iVar.f252791g);
        jSONArray.put(jSONObject2);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("frameSets", jSONArray);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
        fVar.mo122111a("surface:frameSet:init", jSONObject3);
    }

    /* renamed from: w0 */
    public void mo121541w0(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   ….id)\n        }.toString()");
        fVar.mo122111a("surface:frameSetRoot:pause", jSONObject2);
    }

    /* renamed from: x0 */
    public void mo121542x0(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        C87674f fVar = this.f253916c;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", aVar.f253926a);
        jSONObject.put("frameSetRootId", aVar.f253930e);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   ….id)\n        }.toString()");
        fVar.mo122111a("surface:frameSetRoot:resume", jSONObject2);
    }

    /* renamed from: y0 */
    public final void mo122097y0(String str) {
        C87412m.m108594g(str, "id");
        String p0 = mo122096p0();
        Log.m105924i(p0, "removeFrameSetRoot id:" + str);
        C87668a aVar = this.f253923j.get(str);
        if (aVar != null) {
            aVar.mo122100c();
        }
        this.f253923j.remove(str);
    }

    /* renamed from: z0 */
    public final void mo122098z0(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        synchronized (mo122095o0()) {
            int i = 200;
            if (this.f253919f) {
                mo122095o0().mo120601d(str, str2);
                if (!f253915m.contains(str)) {
                    String p0 = mo122096p0();
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendEvent event:");
                    sb.append(str);
                    sb.append(" value:");
                    int length = str2.length();
                    if (length <= 200) {
                        i = length;
                    }
                    String substring = str2.substring(0, i);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    Log.m105924i(p0, sb.toString());
                }
            } else {
                this.f253918e.add(new C87669b(str, str2));
                if (!f253915m.contains(str)) {
                    String p05 = mo122096p0();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("sendEvent add PendingEvent key:");
                    sb4.append(str);
                    sb4.append(" value:");
                    int length2 = str2.length();
                    if (length2 <= 200) {
                        i = length2;
                    }
                    String substring2 = str2.substring(0, i);
                    C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring2);
                    Log.m105924i(p05, sb4.toString());
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
