package f70;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k10.C88053e;
import k10.C88057f;
import k10.C88059h;
import k10.C88066i;
import k10.h$d$$a;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;
import rx3.C13598b0;

/* renamed from: f70.g */
public final class C86776g implements C88053e.C88054a, C88059h.C88063d, FlutterPlugin {

    /* renamed from: d */
    public final Map<String, C86763a> f251885d;

    /* renamed from: e */
    public final HashMap<String, String> f251886e = new HashMap<>();

    /* renamed from: f70.g$a */
    public static final class C86777a extends C87413o implements C32226l<Double, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C88053e.C88056c<Double>> f251887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86777a(WeakReference<C88053e.C88056c<Double>> weakReference) {
            super(1);
            this.f251887d = weakReference;
        }

        public Object invoke(Object obj) {
            Double d = (Double) obj;
            if (d != null) {
                C88053e.C88056c cVar = this.f251887d.get();
                if (cVar != null) {
                    cVar.success(d);
                }
            } else {
                C88053e.C88056c cVar2 = this.f251887d.get();
                if (cVar2 != null) {
                    cVar2.success(Double.valueOf(0.0d));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C86776g(Map<String, ? extends C86763a> map) {
        C87412m.m108594g(map, "providers");
        this.f251885d = map;
    }

    /* renamed from: a */
    public void mo121200a(String str, String str2) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121168a(str, str2);
        }
    }

    /* renamed from: b */
    public void mo121201b(String str) {
        C87412m.m108594g(str, "rootId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121169b(str);
        }
    }

    /* renamed from: c */
    public void mo121202c(String str, String str2, Double d, Double d2) {
        double doubleValue = d.doubleValue();
        double doubleValue2 = d2.doubleValue();
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121183u(str, str2, doubleValue, doubleValue2);
        }
    }

    /* renamed from: d */
    public void mo121203d(String str) {
        C87412m.m108594g(str, "rootId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121170d(str);
        }
    }

    /* renamed from: e */
    public void mo121204e(String str) {
        C86763a aVar;
        C87412m.m108594g(str, "rootId");
        Log.m105924i("MagicSclFlutterPlugin", "destroyFrameSetRoot, in root: " + str);
        String remove = this.f251886e.remove(str);
        if (remove != null && (aVar = this.f251885d.get(remove)) != null) {
            aVar.mo121171e(str);
        }
    }

    /* renamed from: f */
    public void mo121205f(String str, String str2, String str3) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(str3, "extInfo");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121172f(str, str2, str3);
        }
    }

    /* renamed from: g */
    public void mo121206g(String str, String str2) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121173g(str, str2);
        }
        Log.m105924i("MagicSclFlutterPlugin", "destroyFrameSet in root: " + str + ", id: " + str2);
    }

    /* renamed from: h */
    public void mo121207h(String str, String str2, String str3, String str4, C88053e.C88056c<Double> cVar) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "name");
        C87412m.m108594g(str3, "data");
        C87412m.m108594g(str4, "extInfo");
        Log.m105924i("MagicSclFlutterPlugin", "preLayout from flutter " + str + " frameSet:" + str2 + " data:" + str3.length() + " ext:" + str4);
        WeakReference weakReference = new WeakReference(cVar);
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121181s(str, str2, str3, MagicSclBrandReporter.PreloadScene.InBox, str4, new C86777a(weakReference));
        } else if (cVar != null) {
            cVar.success(Double.valueOf(0.0d));
        }
    }

    /* renamed from: i */
    public void mo121208i(String str, String str2) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121174i(str, str2);
        }
    }

    /* renamed from: j */
    public void mo121209j(String str, String str2) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121176j(str, str2);
        }
    }

    /* renamed from: k */
    public void mo121210k(String str) {
        C87412m.m108594g(str, "rootId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121177k(str);
        }
    }

    /* renamed from: l */
    public String mo121211l(String str, String str2, Long l) {
        String str3;
        long longValue = l.longValue();
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "name");
        C86763a p = mo121215p(str);
        if (p == null || (str3 = p.mo121179q(str, str2, (int) longValue)) == null) {
            str3 = "";
        }
        Log.m105924i("MagicSclFlutterPlugin", "createFrameSet in root: " + str + ", name: " + str2 + ", id: " + str3 + " viewId: " + longValue);
        return str3;
    }

    /* renamed from: m */
    public String mo121212m(String str, String str2, String str3) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, SearchIntents.EXTRA_QUERY);
        if (BuildInfo.DEBUG) {
            this.f251885d.containsKey(str);
        }
        C86763a aVar = this.f251885d.get(str);
        if (aVar != null) {
            if (!aVar.isValid()) {
                Log.m105928w("MagicSclFlutterPlugin", "invalid provider for " + str);
            } else {
                String p = aVar.mo121178p(str2, str3);
                this.f251886e.put(p, str);
                Log.m105924i("MagicSclFlutterPlugin", "createFrameSetRoot " + p);
                return p;
            }
        }
        Log.m105920e("MagicSclFlutterPlugin", "createFrameSetRoot for biz " + str + " failed...");
        return "";
    }

    /* renamed from: n */
    public void mo121213n(String str, String str2, byte[] bArr, C88059h.C88065f<C88059h.C88060a> fVar) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "apiName");
        C87412m.m108594g(fVar, "result");
        C86763a aVar = this.f251885d.get(str);
        if (aVar != null) {
            aVar.mo121180r(str2, bArr, fVar);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C88066i iVar = (C88066i) fVar;
            iVar.f254717a.put("error", C88059h.m109638a(new IllegalAccessException("BizName " + str + " not found")));
            iVar.f254718b.reply(iVar.f254717a);
        }
    }

    /* renamed from: o */
    public void mo121214o(String str, String str2, Double d, Double d2) {
        double doubleValue = d.doubleValue();
        double doubleValue2 = d2.doubleValue();
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C86763a p = mo121215p(str);
        if (p != null) {
            p.mo121182t(str, str2, C60641c.m70920a(doubleValue), C60641c.m70920a(doubleValue2));
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C88057f.m109637a(flutterPluginBinding.getBinaryMessenger(), this);
        new BasicMessageChannel(flutterPluginBinding.getBinaryMessenger(), "dev.flutter.pigeon.MagicSclBizHostApi.invoke", C88059h.C88064e.f254714a).setMessageHandler(new h$d$$a(this));
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C88057f.m109637a(flutterPluginBinding.getBinaryMessenger(), (C88053e.C88054a) null);
        new BasicMessageChannel(flutterPluginBinding.getBinaryMessenger(), "dev.flutter.pigeon.MagicSclBizHostApi.invoke", C88059h.C88064e.f254714a).setMessageHandler((BasicMessageChannel.MessageHandler) null);
    }

    /* renamed from: p */
    public final C86763a mo121215p(String str) {
        C86763a aVar;
        String str2 = this.f251886e.get(str);
        if (str2 == null || (aVar = this.f251885d.get(str2)) == null) {
            return null;
        }
        if (aVar.isValid()) {
            return aVar;
        }
        Log.m105928w("MagicSclFlutterPlugin", "invalid provider for " + str + ' ' + str2);
        return null;
    }
}
