package j42;

import a70.C112760b;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.view.Surface;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.Platform;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.eclipsesource.mmv8.V8ScriptFileDescriptor;
import com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.biz.MBBizManager;
import com.tencent.magicbrush.handler.JsTouchEventHandler;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.appbrand.commonjni.AppBrandJsBridgeBinding;
import com.tencent.p014mm.appbrand.commonjni.buffer.BufferURLManager;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.libwxaudio.WxAudioNative;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83139a;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d42.C86179f;
import d42.C86186n;
import di0.C7331m;
import di0.C86293g;
import di3.C86312j;
import e42.C7593d;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import e42.C86431j;
import e42.C86432k;
import e42.C86434m;
import e42.C86436p;
import e42.C86437q;
import f42.C31903a;
import f42.C7981b;
import f42.C7982d;
import fy3.C32224a;
import fy3.C32226l;
import g42.C87136a;
import gy3.C87412m;
import gy3.C87413o;
import h42.C87430a;
import h42.C87433d;
import j52.C87879c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import js0.C88016e;
import js0.C9514m;
import k42.C88097c;
import kj2.C117407d;
import lg3.C88494d;
import ny3.C89104m;
import org.json.JSONException;
import org.json.JSONObject;
import p1017od.C89166m;
import p1017od.C89167n;
import p1059wd.C90954a;
import p156gj.C87203t;
import p235sm.C90233i0;
import p248ug.C90658d0;
import p248ug.C90659e0;
import p416qd.C89590b;
import p416qd.C89597g;
import p416qd.C89598h;
import p419td.C26302f;
import p419td.C26307i;
import p429c.C26821d;
import p673r6.C89876b;
import p762yg.C91447a;
import q52.C62583q;
import q52.C89466e;
import q52.C89476n;
import q52.C89477p;
import q52.C89478s;
import q52.C89481v;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import z04.C91602g0;
import zt3.C119157j;

/* renamed from: j42.a */
public class C87830a extends C7597n implements C87433d, C91447a, C80301a.C80305d {

    /* renamed from: A */
    public final String f254270A;

    /* renamed from: B */
    public final C13601g f254271B;

    /* renamed from: C */
    public final Map<String, C86431j<C7597n>> f254272C;

    /* renamed from: D */
    public final C13601g f254273D;

    /* renamed from: E */
    public final String f254274E;

    /* renamed from: a */
    public final Context f254275a;

    /* renamed from: b */
    public final String f254276b;

    /* renamed from: c */
    public final MBBizManager f254277c;

    /* renamed from: d */
    public final C87430a f254278d;

    /* renamed from: e */
    public final C7982d f254279e;

    /* renamed from: f */
    public MBBuildConfig<?> f254280f;

    /* renamed from: g */
    public C86179f f254281g;

    /* renamed from: h */
    public final C13601g f254282h = C36568h.m40985a(new C87842j(this));

    /* renamed from: i */
    public C83139a f254283i;

    /* renamed from: j */
    public C86186n f254284j;

    /* renamed from: k */
    public AppBrandJsBridgeBinding f254285k;

    /* renamed from: l */
    public C80301a f254286l;

    /* renamed from: m */
    public final HashMap<Integer, C87136a> f254287m = new HashMap<>();

    /* renamed from: n */
    public final AppBrandCommonBindingJni f254288n = new AppBrandCommonBindingJni(this);

    /* renamed from: o */
    public final BufferURLManager f254289o = new BufferURLManager();

    /* renamed from: p */
    public WxAudioNative f254290p;

    /* renamed from: q */
    public final JsTouchEventHandler f254291q = new JsTouchEventHandler();

    /* renamed from: r */
    public List<? extends C86434m> f254292r;

    /* renamed from: s */
    public C32226l<? super List<? extends C86434m>, C13598b0> f254293s;

    /* renamed from: t */
    public final C13601g f254294t = C36568h.m40985a(C87840h.f254312d);

    /* renamed from: u */
    public final C13601g f254295u = C36568h.m40985a(C87841i.f254313d);

    /* renamed from: v */
    public int f254296v = 1;

    /* renamed from: w */
    public final C13601g f254297w = C36568h.m40985a(new C87833b(this));

    /* renamed from: x */
    public final C13601g f254298x = C36568h.m40985a(new C87837e(this));

    /* renamed from: y */
    public final C13601g f254299y = C36568h.m40985a(new C87838f(this));

    /* renamed from: z */
    public boolean f254300z;

    /* renamed from: j42.a$a */
    public static final class C87831a extends C87413o implements C32224a<String[]> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87831a(C87830a aVar) {
            super(0);
            this.f254301d = aVar;
        }

        public Object invoke() {
            C86179f fVar = this.f254301d.f254281g;
            if (fVar != null) {
                Collection<String> g = fVar.mo118365g();
                MBBuildConfig<?> mBBuildConfig = this.f254301d.f254280f;
                if (mBBuildConfig != null) {
                    HashSet<C13604l<String, Boolean>> hashSet = mBBuildConfig.f248368d;
                    ArrayList arrayList = new ArrayList();
                    for (T next : hashSet) {
                        if (!((Boolean) ((C13604l) next).f38556e).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) ((C13604l) it.next()).f38555d);
                    }
                    List<T> e0 = C110818d0.m150933e0(g, arrayList2);
                    Map<String, C86431j<C7597n>> map = this.f254301d.f254272C;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        if (!((C86431j) entry.getValue()).mo120839f()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry key : linkedHashMap.entrySet()) {
                        arrayList3.add((String) key.getKey());
                    }
                    Object[] array = ((ArrayList) C110818d0.m150933e0(e0, arrayList3)).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return (String[]) array;
                }
                C87412m.m108603p("config");
                throw null;
            }
            C87412m.m108603p("mbAdaptor");
            throw null;
        }
    }

    /* renamed from: j42.a$a0 */
    public static final class C87832a0 extends C87413o implements C32226l<List<? extends C86434m>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87832a0(C87830a aVar) {
            super(1);
            this.f254302d = aVar;
        }

        public Object invoke(Object obj) {
            List<C86434m> list = (List) obj;
            C87412m.m108594g(list, "descriptors");
            String str = this.f254302d.f254274E;
            StringBuilder sb = new StringBuilder();
            sb.append("mainScriptProvided with descriptors: ");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C86434m obj2 : list) {
                arrayList.add(obj2.toString());
            }
            sb.append(arrayList);
            Log.m105924i(str, sb.toString());
            if (!((Boolean) ((C36570n) this.f254302d.f254294t).getValue()).booleanValue()) {
                C31903a aVar = (C31903a) ((C36570n) this.f254302d.f254282h).getValue();
                C87830a aVar2 = this.f254302d;
                String str2 = aVar2.f254274E;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("not parallel mode. manually trigger load config ");
                MBBuildConfig<?> mBBuildConfig = aVar2.f254280f;
                if (mBBuildConfig != null) {
                    sb4.append(mBBuildConfig.f248370f);
                    Log.m105924i(str2, sb4.toString());
                } else {
                    C87412m.m108603p("config");
                    throw null;
                }
            }
            this.f254302d.mo122298n0();
            this.f254302d.mo122293k0().mo115419p(new C87872o(this.f254302d, list), false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j42.a$b */
    public static final class C87833b extends C87413o implements C32224a<C87868k> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87833b(C87830a aVar) {
            super(0);
            this.f254303d = aVar;
        }

        public Object invoke() {
            return new C87868k(this.f254303d);
        }
    }

    /* renamed from: j42.a$b0 */
    public static final class C87834b0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C87834b0 f254304d = new C87834b0();

        public C87834b0() {
            super(0);
        }

        public Object invoke() {
            return ((C90233i0) C86312j.m106911c(C90233i0.class)).Zf0();
        }
    }

    /* renamed from: j42.a$c */
    public static final class C87835c implements C83174m.C83175a {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254305d;

        /* renamed from: e */
        public final /* synthetic */ int f254306e;

        public C87835c(C87830a aVar, int i) {
            this.f254305d = aVar;
            this.f254306e = i;
        }

        public final void onDestroy() {
            this.f254305d.mo122290d0(this.f254306e);
            C86186n nVar = this.f254305d.f254284j;
            if (nVar != null) {
                nVar.release();
                this.f254305d.f254277c.mo111590c();
                AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254305d.f254285k;
                if (appBrandJsBridgeBinding != null) {
                    appBrandJsBridgeBinding.destroyRuntime();
                    this.f254305d.f254289o.mo112428b();
                    C80301a aVar = this.f254305d.f254286l;
                    if (aVar != null) {
                        aVar.mo111578p();
                    }
                    this.f254305d.f254288n.notifyDestroy();
                    WxAudioNative wxAudioNative = this.f254305d.f254290p;
                    if (wxAudioNative != null) {
                        wxAudioNative.destroyWebAudioContext();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("jsBridge");
                throw null;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        }
    }

    /* renamed from: j42.a$d */
    public static final class C87836d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254307d;

        public C87836d(C87830a aVar) {
            this.f254307d = aVar;
        }

        public final void run() {
            C87830a aVar = this.f254307d;
            aVar.f254300z = true;
            aVar.mo122293k0().destroy();
        }
    }

    /* renamed from: j42.a$e */
    public static final class C87837e extends C87413o implements C32224a<C89481v> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87837e(C87830a aVar) {
            super(0);
            this.f254308d = aVar;
        }

        public Object invoke() {
            return new C89481v((C90658d0) ((C36570n) this.f254308d.f254297w).getValue());
        }
    }

    /* renamed from: j42.a$f */
    public static final class C87838f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87838f(C87830a aVar) {
            super(0);
            this.f254309d = aVar;
        }

        public Object invoke() {
            boolean z;
            if (BuildInfo.ext.getBoolean("ENABLE_DEVTOOLS")) {
                MBBuildConfig<?> mBBuildConfig = this.f254309d.f254280f;
                if (mBBuildConfig == null) {
                    C87412m.m108603p("config");
                    throw null;
                } else if (mBBuildConfig.f248372h) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: j42.a$g */
    public static final class C87839g<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C87830a f254310a;

        /* renamed from: b */
        public final /* synthetic */ int f254311b;

        public C87839g(C87830a aVar, int i) {
            this.f254310a = aVar;
            this.f254311b = i;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            C87430a aVar = this.f254310a.f254278d;
            int i = this.f254311b;
            C87412m.m108593f(str, "res");
            aVar.mo121849e(i, str);
        }
    }

    /* renamed from: j42.a$h */
    public static final class C87840h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C87840h f254312d = new C87840h();

        public C87840h() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C26821d.f74611a.mo53792a(C26821d.C26823b.f74615d));
        }
    }

    /* renamed from: j42.a$i */
    public static final class C87841i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C87841i f254313d = new C87841i();

        public C87841i() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C26821d.f74611a.mo53792a(C26821d.C26824c.f74616d));
        }
    }

    /* renamed from: j42.a$j */
    public static final class C87842j extends C87413o implements C32224a<C31903a> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87842j(C87830a aVar) {
            super(0);
            this.f254314d = aVar;
        }

        public Object invoke() {
            C31903a aVar;
            Iterator<String> keys;
            C86186n nVar = this.f254314d.f254284j;
            ByteBuffer byteBuffer = null;
            if (nVar != null) {
                C9514m mVar = new C9514m();
                C81410b0 readFile = nVar.mo109577a().readFile("magicbrush.json", mVar);
                C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
                if (readFile == C81410b0.OK) {
                    byteBuffer = (ByteBuffer) mVar.f29691a;
                }
                if (byteBuffer != null) {
                    String charBuffer = StandardCharsets.UTF_8.decode(byteBuffer).toString();
                    C87412m.m108593f(charBuffer, "UTF_8.decode(buffer).toString()");
                    C31903a aVar2 = C31903a.f84987c;
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(charBuffer);
                        JSONObject optJSONObject = jSONObject.optJSONObject("plugins");
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            if (keys2 != null) {
                                while (keys2.hasNext()) {
                                    String next = keys2.next();
                                    JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                                    C87412m.m108593f(next, "pluginName");
                                    C87412m.m108593f(jSONObject2, "pluginInfo");
                                    JSONObject jSONObject3 = optJSONObject;
                                    String string = jSONObject2.getString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                                    C87412m.m108593f(string, "obj.getString(\"version\")");
                                    String string2 = jSONObject2.getString("provider");
                                    C87412m.m108593f(string2, "obj.getString(\"provider\")");
                                    hashMap.put(next, new C7981b(string, C112551y.m153814n(string2, "wx2f3fb5db9f226462", MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, false)));
                                    optJSONObject = jSONObject3;
                                    keys2 = keys2;
                                }
                            }
                        }
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("publicservices");
                        if (!(optJSONObject2 == null || (keys = optJSONObject2.keys()) == null)) {
                            while (keys.hasNext()) {
                                String next2 = keys.next();
                                JSONObject jSONObject4 = optJSONObject2.getJSONObject(next2);
                                C87412m.m108593f(next2, "publicServiceName");
                                C87412m.m108593f(jSONObject4, "publicServiceInfo");
                                String string3 = jSONObject4.getString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                                C87412m.m108593f(string3, "obj.getString(\"version\")");
                                String string4 = jSONObject4.getString("provider");
                                C87412m.m108593f(string4, "obj.getString(\"provider\")");
                                hashMap2.put(next2, new C7981b(string3, C112551y.m153814n(string4, "wx2f3fb5db9f226462", MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, false)));
                                optJSONObject2 = optJSONObject2;
                            }
                        }
                        aVar = new C31903a(hashMap, hashMap2);
                    } catch (JSONException unused) {
                        Log.m105924i("MBBizConfigInfo", "generate biz config failed, src = " + charBuffer);
                        aVar = C31903a.f84987c;
                    }
                    if (aVar != null) {
                        return aVar;
                    }
                }
                C31903a aVar3 = C31903a.f84987c;
                String str = this.f254314d.f254274E;
                Log.m105924i(str, "Read MB config = " + aVar3);
                return aVar3;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        }
    }

    /* renamed from: j42.a$k */
    public static final class C87843k extends C87413o implements C32226l<C7596h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254315d;

        /* renamed from: e */
        public final /* synthetic */ int f254316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87843k(C87830a aVar, int i) {
            super(1);
            this.f254315d = aVar;
            this.f254316e = i;
        }

        public Object invoke(Object obj) {
            C7596h hVar = (C7596h) obj;
            C87412m.m108594g(hVar, "res");
            AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254315d.f254285k;
            if (appBrandJsBridgeBinding != null) {
                appBrandJsBridgeBinding.invokeCallbackHandler(this.f254316e, hVar.mo8721a());
                return C13598b0.f38549a;
            }
            C87412m.m108603p("jsBridge");
            throw null;
        }
    }

    /* renamed from: j42.a$l */
    public static final class C87844l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Exception f254317d;

        public C87844l(Exception exc) {
            this.f254317d = exc;
        }

        public final void run() {
            throw this.f254317d;
        }
    }

    /* renamed from: j42.a$m */
    public static final class C87845m<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C87830a f254318a;

        public C87845m(C87830a aVar) {
            this.f254318a = aVar;
        }

        public void onReceiveValue(Object obj) {
            C13604l lVar = (C13604l) obj;
            C87830a aVar = this.f254318a;
            A a = lVar.f38555d;
            C87412m.m108593f(a, "it.first");
            B b = lVar.f38556e;
            C87412m.m108593f(b, "it.second");
            aVar.mo121869O((String) a, (String) b, "JSBridge");
        }
    }

    /* renamed from: j42.a$n */
    public static final class C87846n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<ByteBuffer, C13598b0> f254319d;

        /* renamed from: e */
        public final /* synthetic */ C87830a f254320e;

        /* renamed from: f */
        public final /* synthetic */ String f254321f;

        public C87846n(C32226l<? super ByteBuffer, C13598b0> lVar, C87830a aVar, String str) {
            this.f254319d = lVar;
            this.f254320e = aVar;
            this.f254321f = str;
        }

        public final void run() {
            C32226l<ByteBuffer, C13598b0> lVar = this.f254319d;
            C86186n nVar = this.f254320e.f254284j;
            ByteBuffer byteBuffer = null;
            if (nVar != null) {
                String str = this.f254321f;
                C87412m.m108594g(str, "path");
                C9514m mVar = new C9514m();
                C81410b0 readFile = nVar.mo109577a().readFile(str, mVar);
                C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
                if (readFile == C81410b0.OK) {
                    byteBuffer = (ByteBuffer) mVar.f29691a;
                }
                lVar.invoke(byteBuffer);
                return;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        }
    }

    /* renamed from: j42.a$o */
    public static final class C87847o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254322d;

        /* renamed from: e */
        public final /* synthetic */ String f254323e;

        /* renamed from: f */
        public final /* synthetic */ String f254324f;

        public C87847o(C87830a aVar, String str, String str2) {
            this.f254322d = aVar;
            this.f254323e = str;
            this.f254324f = str2;
        }

        public final void run() {
            this.f254322d.f254277c.mo111594g(this.f254323e, this.f254324f);
        }
    }

    /* renamed from: j42.a$p */
    public static final class C87848p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254325d;

        public C87848p(C87830a aVar) {
            this.f254325d = aVar;
        }

        public final void run() {
            this.f254325d.f254288n.notifyPause();
        }
    }

    /* renamed from: j42.a$q */
    public static final class C87849q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254326d;

        /* renamed from: e */
        public final /* synthetic */ int f254327e;

        /* renamed from: f */
        public final /* synthetic */ int f254328f;

        /* renamed from: g */
        public final /* synthetic */ long f254329g;

        /* renamed from: h */
        public final /* synthetic */ List<JsTouchEventHandler.C80308b> f254330h;

        /* renamed from: i */
        public final /* synthetic */ int f254331i;

        public C87849q(C87830a aVar, int i, int i2, long j, List<? extends JsTouchEventHandler.C80308b> list, int i3) {
            this.f254326d = aVar;
            this.f254327e = i;
            this.f254328f = i2;
            this.f254329g = j;
            this.f254330h = list;
            this.f254331i = i3;
        }

        public final void run() {
            C13598b0 b0Var;
            C87830a aVar = this.f254326d;
            C80301a aVar2 = aVar.f254286l;
            if (aVar2 != null) {
                aVar2.mo111508e(this.f254331i, aVar.f254291q.mo111607c(this.f254327e, this.f254328f, this.f254329g, this.f254330h, aVar2.f235053b.device_pixel_ratio_), aVar.f254291q.f235110c);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e(this.f254326d.f254274E, "post canvas touch event without magicbrush??");
            }
        }
    }

    /* renamed from: j42.a$r */
    public static final class C87850r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254332d;

        /* renamed from: e */
        public final /* synthetic */ int f254333e;

        /* renamed from: f */
        public final /* synthetic */ Surface f254334f;

        /* renamed from: g */
        public final /* synthetic */ int f254335g;

        /* renamed from: h */
        public final /* synthetic */ int f254336h;

        public C87850r(C87830a aVar, int i, Surface surface, int i2, int i3) {
            this.f254332d = aVar;
            this.f254333e = i;
            this.f254334f = surface;
            this.f254335g = i2;
            this.f254336h = i3;
        }

        public final void run() {
            C87136a aVar = this.f254332d.f254287m.get(Integer.valueOf(this.f254333e));
            if (aVar != null) {
                Surface surface = this.f254334f;
                int i = this.f254335g;
                int i2 = this.f254336h;
                C87412m.m108594g(surface, "surface");
                aVar.f252726e = surface;
                MagicBrushView.C80321c cVar = aVar.f252725d;
                if (cVar != null) {
                    MagicBrushView.C80321c.C80322a.m97791a(cVar, surface, i, i2, false, false, 16, (Object) null);
                }
            }
        }
    }

    /* renamed from: j42.a$s */
    public static final class C87851s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254337d;

        /* renamed from: e */
        public final /* synthetic */ int f254338e;

        public C87851s(C87830a aVar, int i) {
            this.f254337d = aVar;
            this.f254338e = i;
        }

        public final void run() {
            C87136a aVar = this.f254337d.f254287m.get(Integer.valueOf(this.f254338e));
            if (aVar != null) {
                Surface surface = aVar.f252726e;
                if (surface == null) {
                    Log.m105928w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
                    return;
                }
                aVar.f252726e = null;
                MagicBrushView.C80321c cVar = aVar.f252725d;
                if (cVar != null) {
                    cVar.mo55505e(surface, false);
                }
            }
        }
    }

    /* renamed from: j42.a$t */
    public static final class C87852t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254339d;

        /* renamed from: e */
        public final /* synthetic */ int f254340e;

        /* renamed from: f */
        public final /* synthetic */ int f254341f;

        /* renamed from: g */
        public final /* synthetic */ int f254342g;

        public C87852t(C87830a aVar, int i, int i2, int i3) {
            this.f254339d = aVar;
            this.f254340e = i;
            this.f254341f = i2;
            this.f254342g = i3;
        }

        public final void run() {
            C87136a aVar = this.f254339d.f254287m.get(Integer.valueOf(this.f254340e));
            if (aVar != null) {
                int i = this.f254341f;
                int i2 = this.f254342g;
                Surface surface = aVar.f252726e;
                if (surface == null) {
                    Log.m105928w("MicroMsg.MBRendererView", "updateSurfaceSize: surface is empty");
                    return;
                }
                MagicBrushView.C80321c cVar = aVar.f252725d;
                if (cVar != null) {
                    cVar.mo55504b(surface, i, i2);
                }
            }
        }
    }

    /* renamed from: j42.a$u */
    public static final class C87853u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254343d;

        public C87853u(C87830a aVar) {
            this.f254343d = aVar;
        }

        public final void run() {
            WxAudioNative wxAudioNative = this.f254343d.f254290p;
            if (wxAudioNative != null) {
                wxAudioNative.forceResumeAllPlayer();
            }
        }
    }

    /* renamed from: j42.a$v */
    public static final class C87854v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254344d;

        public C87854v(C87830a aVar) {
            this.f254344d = aVar;
        }

        public final void run() {
            this.f254344d.f254288n.notifyResume();
        }
    }

    /* renamed from: j42.a$w */
    public static final class C87855w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f254345d;

        public C87855w(C32224a aVar) {
            this.f254345d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f254345d.invoke();
        }
    }

    /* renamed from: j42.a$x */
    public static final class C87856x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254346d;

        /* renamed from: e */
        public final /* synthetic */ boolean f254347e;

        public C87856x(C87830a aVar, boolean z) {
            this.f254346d = aVar;
            this.f254347e = z;
        }

        public final void run() {
            WxAudioNative wxAudioNative = this.f254346d.f254290p;
            if (wxAudioNative != null) {
                wxAudioNative.setMute(this.f254347e);
            }
        }
    }

    /* renamed from: j42.a$y */
    public static final class C87857y extends C87413o implements C32226l<List<? extends C86434m>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87830a f254348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87857y(C87830a aVar) {
            super(1);
            this.f254348d = aVar;
        }

        public Object invoke(Object obj) {
            List<? extends C86434m> list = (List) obj;
            C87412m.m108594g(list, "mainScripts");
            Log.m105924i(this.f254348d.f254274E, "hy: on main scripts provided from parallel setup!");
            C31903a aVar = (C31903a) ((C36570n) this.f254348d.f254282h).getValue();
            C87830a aVar2 = this.f254348d;
            if (((Boolean) ((C36570n) aVar2.f254295u).getValue()).booleanValue()) {
                for (String str : aVar.f84989b.keySet()) {
                    String str2 = aVar2.f254274E;
                    Log.m105924i(str2, "hy: preloading public service " + str);
                    MBBizManager mBBizManager = aVar2.f254277c;
                    mBBizManager.getClass();
                    C87412m.m108594g(str, "serviceName");
                    mBBizManager.f235101a.mo121584a(str, mBBizManager.f235102b, true);
                }
            } else {
                Log.m105924i(aVar2.f254274E, "hy: not preload public service, just load");
            }
            C87830a aVar3 = this.f254348d;
            synchronized (aVar3) {
                C32226l<? super List<? extends C86434m>, C13598b0> lVar = aVar3.f254293s;
                if (lVar != null) {
                    lVar.invoke(list);
                } else {
                    aVar3.f254292r = list;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j42.a$z */
    public static final class C87858z<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C87830a f254349a;

        public C87858z(C87830a aVar) {
            this.f254349a = aVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            this.f254349a.onCreated();
        }
    }

    static {
        ((C90233i0) C86312j.m106911c(C90233i0.class)).mo124328SS();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MBServerUtil", "start load so");
        C89590b.m112029c(new C89477p());
        C89590b.m112027a();
        C89590b.m112028b("wxa-runtime-binding");
        C89590b.m112028b("gamelog_delegate");
        Log.m105924i("MBServerUtil", "load so done");
        IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, "", "magicbrush", IMagicBrushMonitor.TimeCostScene.LOAD_SO, System.currentTimeMillis() - currentTimeMillis, (String) null, 16, (Object) null);
        C89476n nVar = new C89476n();
        C89598h.f257791a = nVar;
        C89876b.f258326a = new C89597g(nVar);
    }

    public C87830a(Context context, String str, MBBizManager mBBizManager, C87430a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(mBBizManager, "bizManager");
        C87412m.m108594g(aVar, "client");
        this.f254275a = context;
        this.f254276b = str;
        this.f254277c = mBBizManager;
        this.f254278d = aVar;
        this.f254279e = new C7982d(str);
        String g0 = C112550d0.m153797g0(str, "-", str);
        this.f254270A = g0;
        this.f254271B = C36568h.m40985a(C87834b0.f254304d);
        List<C86431j<C7597n>> wj02 = ((C30183d0) C86312j.m106911c(C30183d0.class)).wj0(g0);
        int a = C90363p0.m113142a(C36907w.m41090l(wj02, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        for (T next : wj02) {
            linkedHashMap.put(((C86431j) next).mo16e(), next);
        }
        this.f254272C = linkedHashMap;
        this.f254273D = C36568h.m40985a(new C87831a(this));
        StringBuilder sb = new StringBuilder();
        sb.append("MBBizServer_");
        String str2 = this.f254276b;
        C87412m.m108594g(str2, "instanceName");
        String d0 = C112550d0.m153794d0(str2, "-", "");
        sb.append(C112550d0.m153797g0(str2, "-", str2) + C91602g0.m114948p0(d0, 5));
        this.f254274E = sb.toString();
    }

    /* renamed from: A */
    public void mo121864A(String str, String str2, C32226l<? super ByteBuffer, C13598b0> lVar) {
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(lVar, "cb");
        ((C119157j) C119157j.f356862d).mo183884o(new C87846n(lVar, this, str2));
    }

    /* renamed from: C */
    public String mo121816C(String str, String str2, String str3, int i, boolean z) {
        T t;
        C87412m.m108594g(str, ProviderConstants.API_PATH);
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(str3, "privateData");
        Log.m105918d(this.f254274E, "jsapi " + str + " come in");
        if (this.f254296v == 1) {
            Log.m105920e(this.f254274E, "invoke jsapi " + str + " after destroy with data: " + str2);
            AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254285k;
            if (appBrandJsBridgeBinding != null) {
                appBrandJsBridgeBinding.invokeCallbackHandler(i, "{\"errMsg\":\"Not handled\", \"errCode\": -1}");
                return "";
            }
            C87412m.m108603p("jsBridge");
            throw null;
        }
        try {
            C86431j jVar = (C86431j) ((LinkedHashMap) this.f254272C).get(str);
            if (jVar == null) {
                MBBuildConfig<?> mBBuildConfig = this.f254280f;
                if (mBBuildConfig != null) {
                    Iterator<T> it = mBBuildConfig.f248368d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b(((C13604l) t).f38555d, str)) {
                            break;
                        }
                    }
                    C13604l lVar = (C13604l) t;
                    if (lVar == null) {
                        C86179f fVar = this.f254281g;
                        if (fVar != null) {
                            return fVar.mo118366i(str, str2, str3, i);
                        }
                        C87412m.m108603p("mbAdaptor");
                        throw null;
                    } else if (((Boolean) lVar.f38556e).booleanValue()) {
                        AppBrandJsBridgeBinding appBrandJsBridgeBinding2 = this.f254285k;
                        if (appBrandJsBridgeBinding2 != null) {
                            appBrandJsBridgeBinding2.invokeCallbackHandler(i, this.f254278d.mo121859u(str, str2));
                            return "";
                        }
                        C87412m.m108603p("jsBridge");
                        throw null;
                    } else {
                        this.f254278d.mo121855p(str, str2, i);
                        return "";
                    }
                } else {
                    C87412m.m108603p("config");
                    throw null;
                }
            } else if (jVar instanceof C86430i) {
                C86430i o = ((C86430i) jVar).mo71237o();
                o.f251227a = this;
                o.mo120847m(this.f254279e);
                o.f251226c = new C87843k(this, i);
                o.mo18q(new C7596h(str2));
                return "";
            } else if (jVar instanceof C86432k) {
                jVar.f251227a = this;
                jVar.mo120847m(this.f254279e);
                String a = ((C86432k) jVar).mo62167o(new C7596h(str2)).mo8721a();
                jVar.f251227a = null;
                AppBrandJsBridgeBinding appBrandJsBridgeBinding3 = this.f254285k;
                if (appBrandJsBridgeBinding3 != null) {
                    appBrandJsBridgeBinding3.invokeCallbackHandler(i, a);
                    return "";
                }
                C87412m.m108603p("jsBridge");
                throw null;
            } else {
                throw new IllegalAccessError("Illegal jsapi");
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f254274E, e, "Catch jsapi exception " + str + ", data = " + str2, new Object[0]);
            ((C119157j) C119157j.f356862d).mo183895z(new C87844l(e));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    /* renamed from: D */
    public void mo121865D(int i, int i2, int i3, long j, List<? extends JsTouchEventHandler.C80308b> list) {
        List<? extends JsTouchEventHandler.C80308b> list2 = list;
        C87412m.m108594g(list2, "touches");
        mo122293k0().mo115419p(new C87849q(this, i2, i3, j, list2, i), false);
    }

    /* renamed from: F */
    public void mo122288F(int i, int i2, int i3) {
        try {
            C117407d.INSTANCE.mo182089r((long) i, (long) i2, (long) i3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: I */
    public void mo121866I(String str, String str2) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        if (this.f254296v < 2) {
            String str3 = this.f254274E;
            Log.m105920e(str3, "event " + str + " discard, data = " + C91602g0.m114947o0(str2, 100));
            return;
        }
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254285k;
        if (appBrandJsBridgeBinding != null) {
            appBrandJsBridgeBinding.subscribeHandler(str, str2, 0, "{\"nativeTime\": " + System.currentTimeMillis() + '}');
            return;
        }
        C87412m.m108603p("jsBridge");
        throw null;
    }

    /* renamed from: J */
    public ByteBuffer mo122289J(String str) {
        C87412m.m108594g(str, "path");
        return null;
    }

    /* renamed from: K */
    public C31903a mo121867K() {
        return (C31903a) ((C36570n) this.f254282h).getValue();
    }

    /* renamed from: L */
    public void mo121868L(int i) {
        String str = this.f254274E;
        Log.m105924i(str, "destroy with " + i + " localStatus:" + this.f254296v);
        mo121876b0();
        if (mo122292j0()) {
            ((C90659e0) C86312j.m106911c(C90659e0.class)).mo124802AE((C90658d0) ((C36570n) this.f254297w).getValue());
        }
        if (this.f254296v >= 2) {
            mo122293k0().mo115384z0(new C87835c(this, i));
            mo122293k0().mo115419p(new C87836d(this), false);
        }
    }

    /* renamed from: M */
    public void mo111584M(MagicBrushView magicBrushView, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(magicBrushView, "view");
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
        String str = this.f254274E;
        Log.m105924i(str, "onSetTouchableRectList: count = " + fArr.length);
        this.f254278d.mo121852n(magicBrushView.getVirtualElementId(), fArr, fArr2, fArr3, fArr4);
    }

    /* renamed from: O */
    public void mo121869O(String str, String str2, String str3) {
        C87412m.m108594g(str, "msg");
        C87412m.m108594g(str2, "stack");
        C87412m.m108594g(str3, FirebaseAnalytics.C113379b.SOURCE);
        String str4 = this.f254274E;
        Log.m105920e(str4, str3 + ": " + str + 10 + str2);
        String str5 = str2.length() == 0 ? str : str2;
        if (!this.f254300z || !C112550d0.m153801u(str5, "illegal access", false)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, str3);
            jSONObject.put(StateEvent.Name.MESSAGE, str);
            jSONObject.put("stack", str2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …ack)\n        }.toString()");
            mo121866I("onJsError", jSONObject2);
            this.f254278d.mo121850i("", str5);
            C87879c.f254379e.R80(this.f254270A, "js-exception", str5, str3);
        }
    }

    /* renamed from: P */
    public void mo111585P(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(magicBrushView, "view");
        this.f254278d.mo121858t(magicBrushView.getVirtualElementId(), i, i2, i3, i4, i5);
    }

    /* renamed from: Q */
    public void mo121870Q(String str, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "script");
        if (this.f254296v < 2) {
            String str2 = this.f254274E;
            Log.m105920e(str2, "evaluate discard, script is " + C91602g0.m114947o0(str, 100));
            return;
        }
        mo122293k0().evaluateJavascript(str, valueCallback);
    }

    /* renamed from: S */
    public void mo121871S() {
        if (!C89478s.m111868a(this.f254296v, 4)) {
            mo122293k0().mo115428t(10);
            mo122293k0().pause();
            mo122293k0().mo115419p(new C87870m(this), true);
            mo122293k0().mo115419p(new C87848p(this), false);
            C80301a aVar = this.f254286l;
            if (aVar != null) {
                aVar.mo111504c();
            }
            this.f254296v = 8;
        }
    }

    /* renamed from: U */
    public String mo121872U() {
        MBBuildConfig<?> mBBuildConfig = this.f254280f;
        if (mBBuildConfig != null) {
            return mBBuildConfig.f248371g;
        }
        C87412m.m108603p("config");
        throw null;
    }

    /* renamed from: V */
    public void mo121873V(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        mo122293k0().mo115419p(new C87855w(aVar), false);
    }

    /* renamed from: W */
    public void mo111586W(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(magicBrushView, "view");
        this.f254278d.mo121857s(magicBrushView.getVirtualElementId(), i, i2, i3, i4, i5);
    }

    /* renamed from: X */
    public void mo121874X() {
        C13598b0 b0Var;
        Log.m105924i(this.f254274E, IXWebBroadcastListener.STAGE_START);
        C87832a0 a0Var = new C87832a0(this);
        if (((Boolean) ((C36570n) this.f254294t).getValue()).booleanValue()) {
            synchronized (this) {
                List<? extends C86434m> list = this.f254292r;
                if (list != null) {
                    a0Var.invoke(list);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Log.m105924i(this.f254274E, "hy: parallel reading not ready. pending wait");
                    this.f254293s = a0Var;
                }
                this.f254292r = null;
            }
            return;
        }
        C86186n nVar = this.f254284j;
        if (nVar != null) {
            nVar.mo109580d(a0Var);
        } else {
            C87412m.m108603p("pkgManagement");
            throw null;
        }
    }

    /* renamed from: Y */
    public void mo121875Y(C86434m mVar) {
        C87412m.m108594g(mVar, "descriptor");
        mo122293k0().mo115395O(C64197v.m75534c(mo122295l0(mVar)), (String) ((C36570n) this.f254271B).getValue(), (C80669j.C80675f) null);
    }

    /* renamed from: a */
    public void mo121817a() {
        mo122293k0().mo115405a();
    }

    /* renamed from: b0 */
    public void mo121876b0() {
        if (!C89478s.m111868a(this.f254296v, 8)) {
            mo122298n0();
            mo122293k0().mo115419p(new C87854v(this), false);
            C80301a aVar = this.f254286l;
            if (aVar != null) {
                aVar.mo111506d();
            }
            this.f254296v = 4;
        }
    }

    /* renamed from: c0 */
    public void mo111587c0(MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        C87136a remove = this.f254287m.remove(Integer.valueOf(magicBrushView.getVirtualElementId()));
        if (remove != null) {
            Log.m105924i("MicroMsg.MBRendererView", "destroy");
            Surface surface = remove.f252726e;
            if (surface == null) {
                Log.m105928w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
            } else {
                remove.f252726e = null;
                MagicBrushView.C80321c cVar = remove.f252725d;
                if (cVar != null) {
                    cVar.mo55505e(surface, false);
                }
            }
            remove.f252725d = null;
        }
        this.f254278d.mo121856q(magicBrushView.getVirtualElementId());
    }

    /* renamed from: d */
    public boolean mo121818d() {
        return mo122293k0().mo115408d();
    }

    /* renamed from: d0 */
    public void mo122290d0(int i) {
        Log.m105924i(this.f254274E, "onDestroy");
        this.f254296v = 1;
        if (i != 2) {
            this.f254278d.onDestroy();
        }
    }

    /* renamed from: e */
    public void mo122291e(String str) {
        C87412m.m108594g(str, "msg");
        if (mo122292j0()) {
            ((C90659e0) C86312j.m106911c(C90659e0.class)).mo124804t6((C90658d0) ((C36570n) this.f254297w).getValue(), str);
        }
    }

    /* renamed from: f */
    public void mo121877f(int i) {
        mo122293k0().mo115419p(new C87851s(this, i), false);
    }

    /* renamed from: f0 */
    public void mo8722f0(MBJsEventBase mBJsEventBase) {
        C87412m.m108594g(mBJsEventBase, "event");
        mo121866I(mBJsEventBase.f81581d, mBJsEventBase.f81582e);
    }

    /* renamed from: g */
    public void mo121878g(int i, int i2, int i3) {
        mo122293k0().mo115419p(new C87852t(this, i, i2, i3), false);
    }

    /* renamed from: g0 */
    public int mo8723g0() {
        return this.f254296v;
    }

    /* renamed from: h0 */
    public void mo8724h0(String str) {
        C87412m.m108594g(str, "log");
        this.f254278d.mo121846a(C91602g0.m114947o0(str, 131072));
    }

    /* renamed from: i0 */
    public void mo8725i0(boolean z) {
        this.f254278d.mo121851k(z);
    }

    /* renamed from: j */
    public void mo121879j(int i, Surface surface, int i2, int i3) {
        C87412m.m108594g(surface, "surface");
        mo122293k0().mo115419p(new C87850r(this, i, surface, i2, i3), false);
    }

    /* renamed from: j0 */
    public final boolean mo122292j0() {
        return ((Boolean) ((C36570n) this.f254299y).getValue()).booleanValue();
    }

    /* renamed from: k0 */
    public final C83139a mo122293k0() {
        C83139a aVar = this.f254283i;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("jsRuntime");
        throw null;
    }

    /* renamed from: l */
    public boolean mo122294l(String str, String str2) {
        C87412m.m108594g(str, "moduleName");
        C87412m.m108594g(str2, "paramsJson");
        String str3 = this.f254274E;
        Log.m105924i(str3, "lazy load module " + str);
        if (!C87412m.m108589b(str, "WXAUDIO")) {
            return false;
        }
        synchronized (C62583q.f177736a) {
            if (!C62583q.f177737b) {
                Log.m105924i("MBServerUtil", "start load web audio so");
                C89590b.m112028b("c++_shared");
                C89590b.m112028b("xffmpeg");
                C89590b.m112028b("wxWtf");
                C89590b.m112028b("wxaudio");
                Log.m105924i("MBServerUtil", "load web audio so done");
                WxAudioNative.initAndroidAssetMgr(MMApplicationContext.getContext().getAssets());
                C62583q.f177737b = true;
            }
        }
        WxAudioNative wxAudioNative = new WxAudioNative(mo122293k0().mo115417m(), mo122293k0().mo115393J0(), mo122293k0().mo115414j());
        wxAudioNative.InitCallBack(new C87869l(this));
        this.f254290p = wxAudioNative;
        return false;
    }

    /* renamed from: l0 */
    public final V8ScriptEvaluateRequest mo122295l0(C86434m mVar) {
        String str;
        if (mVar instanceof C86436p) {
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest.scriptType = 3;
            v8ScriptEvaluateRequest.scriptText = ((C86436p) mVar).f251231a;
            return v8ScriptEvaluateRequest;
        }
        boolean z = true;
        if (mVar instanceof C7593d) {
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest2 = new V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest2.scriptType = 1;
            v8ScriptEvaluateRequest2.scriptFd = new V8ScriptFileDescriptor();
            ((C7593d) mVar).getClass();
            throw null;
        } else if (mVar instanceof C86437q) {
            V8ScriptEvaluateRequest v8ScriptEvaluateRequest3 = new V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest3.scriptType = 2;
            V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new V8ScriptWxaFileDescriptor();
            v8ScriptEvaluateRequest3.scriptWxaFd = v8ScriptWxaFileDescriptor;
            C86437q qVar = (C86437q) mVar;
            v8ScriptWxaFileDescriptor.wxaPkgPath = qVar.f251232a;
            String str2 = qVar.f251233b;
            v8ScriptWxaFileDescriptor.wxaFileName = str2;
            C87412m.m108594g(str2, "str");
            if (C112551y.m153819s(str2, "/", false)) {
                str2 = str2.substring(1);
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
            }
            v8ScriptEvaluateRequest3.scriptName = "https://mm.tencent.com/" + str2;
            C86186n nVar = this.f254284j;
            if (nVar != null) {
                String b = nVar.mo109578b();
                if (b.length() <= 0) {
                    z = false;
                }
                if (z) {
                    str = b + '_' + str2;
                } else {
                    str = "";
                }
                v8ScriptEvaluateRequest3.cacheKey = str;
                v8ScriptEvaluateRequest3.cacheCategory = this.f254270A;
                v8ScriptEvaluateRequest3.cacheType = 0;
                return v8ScriptEvaluateRequest3;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: m */
    public void mo122296m(String str) {
        C87412m.m108594g(str, "msg");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        CrashReportFactory.reportRawMessage(Base64.encodeToString(bytes, 2), "appbrand_commonbinding");
    }

    /* renamed from: m0 */
    public void mo122297m0() {
        Log.m105924i(this.f254274E, "onStarted");
        this.f254296v = 4;
        this.f254288n.notifyResume();
        C80301a aVar = this.f254286l;
        if (aVar != null) {
            aVar.mo111506d();
        }
        this.f254278d.mo121847b();
        if (mo122292j0()) {
            ((C90659e0) C86312j.m106911c(C90659e0.class)).Ap0((C90658d0) ((C36570n) this.f254297w).getValue());
        }
    }

    /* renamed from: n0 */
    public final void mo122298n0() {
        mo122293k0().mo115419p(new C87853u(this), true);
        mo122293k0().mo115428t(-8);
        mo122293k0().resume();
    }

    /* renamed from: o */
    public void mo121880o(int i, String str) {
        C87412m.m108594g(str, "result");
        String str2 = this.f254274E;
        Log.m105918d(str2, "async jsapi callback " + i + " with result " + str);
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254285k;
        if (appBrandJsBridgeBinding != null) {
            appBrandJsBridgeBinding.invokeCallbackHandler(i, str);
        } else {
            C87412m.m108603p("jsBridge");
            throw null;
        }
    }

    /* renamed from: o0 */
    public void mo122299o0(MBBuildConfig<?> mBBuildConfig) {
        C13598b0 b0Var;
        MBBuildConfig<?> mBBuildConfig2 = mBBuildConfig;
        C87412m.m108594g(mBBuildConfig2, "config");
        Log.m105924i(this.f254274E, "setupConfig");
        this.f254280f = mBBuildConfig2;
        this.f254284j = ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57230Zl(this.f254276b);
        if (((Boolean) ((C36570n) this.f254294t).getValue()).booleanValue()) {
            Log.m105924i(this.f254274E, "hy: parallel load main script");
            C86186n nVar = this.f254284j;
            if (nVar != null) {
                nVar.mo109580d(new C87857y(this));
            } else {
                C87412m.m108603p("pkgManagement");
                throw null;
            }
        }
        IJSRuntime.Config config = new IJSRuntime.Config();
        config.f235973a = ((C90233i0) C86312j.m106911c(C90233i0.class)).mo124325Eg();
        config.f235978f = "1";
        config.f235979g = true;
        config.f235981i = true;
        config.f235982j = false;
        config.f235983k = "RuntimeMB";
        C7331m Im = ((C86293g) C86312j.m106911c(C86293g.class)).mo117568Im();
        if (Im != null) {
            Log.m105924i(this.f254274E, "hy: has node snapshot " + Im);
            config.f235975c = true;
            config.f235974b = Im.f25445a;
            config.f235977e = Im.f25446b;
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i(this.f254274E, "hy: abtest use node snapshot 1");
            config.f235975c = false;
            config.f235976d = null;
        }
        config.f235989q = new C87866i(this, config);
        C83188y yVar = new C83188y(config);
        yVar.setJsExceptionHandler(new C87867j(this));
        this.f254283i = yVar;
        IJSRuntime iJSRuntime = mo122293k0().f242938f;
        C87412m.m108593f(iJSRuntime, "jsRuntime.jsRuntime");
        this.f254285k = new C88097c(iJSRuntime);
        C30172a0 a0Var = (C30172a0) C86312j.m106911c(C30172a0.class);
        Object[] objArr = new Object[6];
        objArr[0] = this.f254275a;
        objArr[1] = this.f254276b;
        objArr[2] = mo122293k0();
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254285k;
        if (appBrandJsBridgeBinding != null) {
            objArr[3] = appBrandJsBridgeBinding;
            C86186n nVar2 = this.f254284j;
            if (nVar2 != null) {
                objArr[4] = nVar2;
                objArr[5] = mBBuildConfig2.f248369e;
                this.f254281g = a0Var.Uk0(objArr);
                mo122293k0().mo115419p(new C87859b(this), false);
                if (mBBuildConfig2.f248373i) {
                    C89166m mVar = new C89166m();
                    String str = "MB.GLThread." + this.f254276b;
                    C87412m.m108594g(str, "<set-?>");
                    C89167n.C89168a aVar = mVar.f256965I;
                    C89104m<Object>[] mVarArr = C89167n.f256956L;
                    aVar.mo125228b(mVar, mVarArr[28], str);
                    mVar.mo123517e(C90954a.C90956b.NativeLocker);
                    mVar.mo123522j(false);
                    mVar.mo123518f(this.f254288n.getNativeHandle());
                    C89167n.C89168a aVar2 = mVar.f256963G;
                    C89104m<Object> mVar2 = mVarArr[26];
                    Boolean bool = Boolean.TRUE;
                    aVar2.mo125228b(mVar, mVar2, bool);
                    mVar.mo123519g(C88494d.m110348d().density);
                    C89167n.C89168a aVar3 = mVar.f256986s;
                    C89104m<Object> mVar3 = mVarArr[13];
                    Boolean bool2 = Boolean.FALSE;
                    aVar3.mo125228b(mVar, mVar3, bool2);
                    mVar.mo123520h(true);
                    mVar.f256983p.mo125228b(mVar, mVarArr[9], bool2);
                    mVar.f256959C.mo125228b(mVar, mVarArr[22], bool);
                    mVar.f256982o.mo125228b(mVar, mVarArr[8], bool);
                    mVar.f256968a = this.f254275a;
                    mVar.f256970c = new C87864g(this);
                    String C = C112760b.m154195C();
                    C87412m.m108593f(C, "DATAROOT_SDCARD_PATH()");
                    mVar.mo123521i(C);
                    mVar.f256969b = new C89466e(mo122293k0());
                    mVar.f256978k = this;
                    mVar.f256974g.mo125228b(mVar, mVarArr[3], new C87865h(this));
                    C80301a k = mVar.mo123512k();
                    C87412m.m108591d(k);
                    k.f235094j.mo125229a(new C87860c(this));
                    k.f235055d.setMaxDecodeDimension(8192, 8192);
                    k.f235055d.addImageStreamFetcher(new C87861d(this), true);
                    k.f235095k.mo125229a(new C87862e(this));
                    IMBFontHandler iMBFontHandler = k.f235056e;
                    C87412m.m108592e(iMBFontHandler, "null cannot be cast to non-null type com.tencent.magicbrush.handler.glfont.MBFontHandlerImpl");
                    C26307i iVar = (C26307i) iMBFontHandler;
                    C87863f fVar = new C87863f(this);
                    iVar.f73288e = fVar;
                    C26302f fVar2 = iVar.f73285b;
                    if (fVar2 != null) {
                        fVar2.f73266c = fVar;
                    }
                    this.f254286l = k;
                }
                mo122293k0().mo115419p(new C87871n(this), false);
                String e = C88016e.m109548e("magic_emoji/magic_brush_common_lib.js");
                HashMap e2 = C90364q0.m113146e(new C13604l("platform", Platform.ANDROID), new C13604l("system", Build.VERSION.RELEASE), new C13604l("model", C87203t.m108275k()), new C13604l("brand", Build.BRAND), new C13604l(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getCurrentLanguage(this.f254275a)), new C13604l("pixelRatio", Float.valueOf(C88494d.m110348d().density)), new C13604l(ProviderConstants.API_COLNAME_FEATURE_VERSION, ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT)), new C13604l(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, Integer.valueOf(BuildInfo.CLIENT_VERSION_INT)), new C13604l("isDarkMode", Boolean.valueOf(C85875k4.m106211z())), new C13604l("isDebugEnv", Boolean.valueOf(WeChatEnvironment.hasDebugger())), new C13604l("bizName", this.f254270A), new C13604l("USER_DATA_PATH", "wxfile://usr"));
                String str2 = ";mb.env = " + new JSONObject(e2) + ';';
                Log.m105924i(this.f254274E, "mbEnv:" + str2);
                mo122293k0().evaluateJavascript(e + str2, new C87858z(this));
                return;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        }
        C87412m.m108603p("jsBridge");
        throw null;
    }

    public void onCreated() {
        Log.m105924i(this.f254274E, "onCreated");
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f254285k;
        if (appBrandJsBridgeBinding != null) {
            appBrandJsBridgeBinding.createRuntime(mo122293k0().mo115417m(), mo122293k0().mo115393J0(), "JSBridge", true);
            AppBrandJsBridgeBinding appBrandJsBridgeBinding2 = this.f254285k;
            if (appBrandJsBridgeBinding2 != null) {
                appBrandJsBridgeBinding2.setJsExceptionCallback(new C87845m(this));
                this.f254296v = 2;
                mo122293k0().evaluateJavascript("\n        JSBridge.on(\"onJsError\", function(res) {\n            if (res.stack == '') {\n                console.error(res.message);\n            } else {\n                console.error(res.stack);\n            }\n        });\n        JSBridge.on('devtools:receive', function(msg) {\n            const devtools = global.DevtoolsMessage;\n            if (devtools && devtools.onreceive) {\n                devtools.onreceive.call(devtools, msg);\n            }\n        });\n    ", (ValueCallback<String>) null);
                if (mo122292j0()) {
                    ((C83172l) mo122293k0().mo63321n0(C83172l.class)).mo115399T0("_console");
                    mo122293k0().addJavascriptInterface((C89481v) ((C36570n) this.f254298x).getValue(), "DevtoolsMessage");
                }
                mo122293k0().pause();
                this.f254278d.onCreated();
                return;
            }
            C87412m.m108603p("jsBridge");
            throw null;
        }
        C87412m.m108603p("jsBridge");
        throw null;
    }

    /* renamed from: p */
    public String[] mo122301p() {
        return (String[]) ((C36570n) this.f254273D).getValue();
    }

    /* renamed from: q */
    public MagicBrushView mo111588q() {
        Context context = this.f254275a;
        C80301a aVar = this.f254286l;
        C87412m.m108591d(aVar);
        C87136a aVar2 = new C87136a(context, aVar);
        this.f254287m.put(Integer.valueOf(aVar2.f252727f.getVirtualElementId()), aVar2);
        return aVar2.f252727f;
    }

    /* renamed from: r */
    public void mo121881r(String str, int i) {
        C87412m.m108594g(str, "script");
        if (this.f254296v < 2) {
            String str2 = this.f254274E;
            Log.m105920e(str2, "evaluate discard, script is " + C91602g0.m114947o0(str, 100));
        } else if (i > 0) {
            mo122293k0().evaluateJavascript(str, new C87839g(this, i));
        } else {
            mo122293k0().evaluateJavascript(str, (ValueCallback<String>) null);
        }
    }

    public void setMute(boolean z) {
        mo122293k0().mo115419p(new C87856x(this, z), true);
    }

    /* renamed from: v */
    public ByteBuffer mo122302v(String str) {
        C87412m.m108594g(str, "path");
        C86186n nVar = this.f254284j;
        if (nVar != null) {
            C9514m mVar = new C9514m();
            C81410b0 readFile = nVar.mo109577a().readFile(str, mVar);
            C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
            if (readFile == C81410b0.OK) {
                return (ByteBuffer) mVar.f29691a;
            }
            return null;
        }
        C87412m.m108603p("pkgManagement");
        throw null;
    }

    /* renamed from: x */
    public void mo121883x(String str, String str2) {
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(str2, "msg");
        mo122293k0().mo115419p(new C87847o(this, str, str2), false);
    }

    /* renamed from: z */
    public void mo122303z(int i, String str) {
        C87412m.m108594g(str, "value");
        try {
            C117407d.INSTANCE.kvStat(i, str);
        } catch (Exception unused) {
        }
    }
}
