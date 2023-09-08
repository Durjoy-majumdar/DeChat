package p467co;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.jsapi.popup.MbJsApiEventOnPopupWindowDismiss;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f70.C86764b;
import f70.C86770d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import g70.C87164i;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import java.lang.ref.WeakReference;
import java.util.Map;
import k10.C88059h;
import l10.C24924g;
import l10.C24931h;
import ny3.C25237g;
import org.json.JSONObject;
import p150eo.C86596j;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p227rn.C13089q;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: co.c */
public abstract class C80112c extends C86770d<C86596j, C86596j> {

    /* renamed from: j */
    public C86596j f234604j;

    /* renamed from: co.c$a */
    public /* synthetic */ class C80113a extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80113a(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$b */
    public /* synthetic */ class C80114b extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80114b(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$c */
    public /* synthetic */ class C80115c extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80115c(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$d */
    public /* synthetic */ class C80116d extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80116d(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$e */
    public /* synthetic */ class C80117e extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80117e(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$f */
    public /* synthetic */ class C80118f extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80118f(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$g */
    public /* synthetic */ class C80119g extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C80119g(Object obj) {
            super(3, obj, C80112c.class, "handleBrandApi", "handleBrandApi(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(lVar, "p2");
            C80112c.m97406H((C80112c) this.receiver, str, (byte[]) obj2, lVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: co.c$h */
    public static final class C80120h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87164i f234605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80120h(C87164i iVar) {
            super(0);
            this.f234605d = iVar;
        }

        public Object invoke() {
            if (this.f234605d.f252791g > 0) {
                Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", "saveCardHeight " + this.f234605d);
                C87164i iVar = this.f234605d;
                ((C13089q) C86312j.m106911c(C13089q.class)).mo12589cz(iVar.f252785a, iVar.f252791g);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80112c(C86764b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "mbPlugin");
    }

    /* renamed from: H */
    public static final void m97406H(C80112c cVar, String str, byte[] bArr, C32226l lVar) {
        String data;
        cVar.getClass();
        switch (str.hashCode()) {
            case -1760177256:
                if (str.equals("onFrameSetExpose") && (data = C24924g.C24928b.f71028h.parseFrom(bArr).getData()) != null) {
                    MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
                    synchronized (magicSclBrandReporter) {
                        MagicSclBrandReporter.C80979a a = magicSclBrandReporter.mo112790a(data);
                        if (a.f237841c <= 0) {
                            a.f237841c = System.currentTimeMillis();
                            Log.m105924i("MicroMsg.MagicSclReporter", "markExposeTime " + data + ' ' + a.f237841c);
                            return;
                        }
                        return;
                    }
                }
                return;
            case -1371776827:
                if (!str.equals("onScreenShot")) {
                    return;
                }
                break;
            case -1085405331:
                if (str.equals("onPopupWindowDismiss")) {
                    C24931h.C24935b parseFrom = C24931h.C24935b.f71064i.parseFrom(bArr);
                    C87412m.m108593f(parseFrom, "eventData");
                    int i = parseFrom.f71066e;
                    Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", "onPopupWindowDismiss reason:" + i);
                    MbJsApiEventOnPopupWindowDismiss mbJsApiEventOnPopupWindowDismiss = new MbJsApiEventOnPopupWindowDismiss();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_REASON, i);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                    mbJsApiEventOnPopupWindowDismiss.f81582e = jSONObject2;
                    C86596j jVar = cVar.f234604j;
                    if (jVar != null) {
                        jVar.mo122092k0(mbJsApiEventOnPopupWindowDismiss);
                    }
                    lVar.invoke(cVar.mo121195C((byte[]) null));
                    return;
                }
                return;
            case -907680051:
                if (str.equals("scroll")) {
                    C24924g.C24925a parseFrom2 = C24924g.C24925a.f71019i.parseFrom(bArr);
                    C87412m.m108593f(parseFrom2, "eventData");
                    C87412m.m108594g(lVar, "callback");
                    Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", "handleScroll " + parseFrom2.f71022f + ' ' + parseFrom2.f71021e);
                    lVar.invoke(cVar.mo121195C((byte[]) null));
                    return;
                }
                return;
            case 704897452:
                if (!str.equals("brandServiceBoxQuit")) {
                    return;
                }
                break;
            default:
                return;
        }
        Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", "onBrandServiceEvent eventName:" + str);
        OnBrandServiceEvent onBrandServiceEvent = new OnBrandServiceEvent();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("eventName", str);
        String jSONObject4 = jSONObject3.toString();
        C87412m.m108593f(jSONObject4, "JSONObject().apply {\n   …\n            }.toString()");
        onBrandServiceEvent.f81582e = jSONObject4;
        C86596j jVar2 = cVar.f234604j;
        if (jVar2 != null) {
            jVar2.mo122092k0(onBrandServiceEvent);
        }
        lVar.invoke(cVar.mo121195C((byte[]) null));
    }

    /* renamed from: D */
    public void mo110353D(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
        iVar.f252793i = new C80120h(iVar);
    }

    /* renamed from: E */
    public C87667c mo110354E() {
        return this.f234604j;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        C86596j jVar = this.f234604j;
        if (jVar != null) {
            jVar.f251536p = new WeakReference<>(activityPluginBinding.getActivity());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        StringBuilder sb = new StringBuilder();
        sb.append("onAttachedToEngine ");
        C86596j jVar = this.f234604j;
        sb.append(jVar != null ? jVar.mo118862l0() : null);
        Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", sb.toString());
        C86596j jVar2 = this.f234604j;
        if (jVar2 != null) {
            jVar2.f251533J = true;
        }
        super.onAttachedToEngine(flutterPluginBinding);
    }

    public void onDetachedFromActivity() {
        C86596j jVar = this.f234604j;
        if (jVar != null) {
            jVar.f251536p = new WeakReference<>((Object) null);
        }
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromEngine ");
        C86596j jVar = this.f234604j;
        sb.append(jVar != null ? jVar.mo118862l0() : null);
        Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", sb.toString());
        C86596j jVar2 = this.f234604j;
        if (jVar2 != null) {
            jVar2.f251533J = false;
        }
        super.onDetachedFromEngine(flutterPluginBinding);
    }

    /* renamed from: w */
    public void mo110355w(C87164i iVar) {
        int lN;
        C87412m.m108594g(iVar, "frameSet");
        if (iVar.f252791g <= 0 && (lN = ((C13089q) C86312j.m106911c(C13089q.class)).mo12590lN(iVar.f252785a)) > 0) {
            iVar.f252791g = lN;
            Log.m105924i("MicroMsg.MagicSclBrandFlutterPluginBase", "beforeFrameSetBind set cached height: " + iVar);
        }
    }

    /* renamed from: x */
    public C87667c<?, ?>.a mo110356x(String str, String str2) {
        C87667c<?, ?>.a aVar;
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C86596j jVar = this.f234604j;
        if (jVar != null && (aVar = jVar.f251537q) != null) {
            return aVar;
        }
        throw new IllegalStateException("request frameSetRoot but biz not start yet");
    }

    /* renamed from: y */
    public Map<String, C25237g<C13598b0>> mo110357y() {
        return C90364q0.m113149h(this.f251877i, C90364q0.m113147f(new C13604l("scroll", new C80113a(this)), new C13604l("onPopupWindowDismiss", new C80114b(this)), new C13604l("resume", new C80115c(this)), new C13604l("pause", new C80116d(this)), new C13604l("onScreenShot", new C80117e(this)), new C13604l("onFrameSetExpose", new C80118f(this)), new C13604l("brandServiceBoxQuit", new C80119g(this))));
    }
}
