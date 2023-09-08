package f70;

import android.content.Context;
import android.view.View;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e42.C86428f;
import e70.C86457d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import g70.C87163h;
import g70.C87164i;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87665a;
import i70.C87667c;
import i70.C87672e;
import i70.C87674f;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k10.C88051c;
import k10.C88059h;
import k10.C88066i;
import k10.h$b$$a;
import k10.h$b$$b;
import l10.C24931h;
import n70.C47167a;
import ny3.C25237g;
import o40.C61926c;
import org.json.JSONObject;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.BasicMessageChannel;
import r52.C89872c;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C48096k;
import sx3.C90363p0;

/* renamed from: f70.d */
public abstract class C86770d<T extends C86428f<C86457d>, BizType extends C87667c<C86457d, T>> implements FlutterPlugin, C86763a, C87665a, ActivityAware {

    /* renamed from: d */
    public final C86764b f251872d;

    /* renamed from: e */
    public final HashMap<String, C87667c<?, ?>.a> f251873e = new HashMap<>();

    /* renamed from: f */
    public C88059h.C88061b f251874f;

    /* renamed from: g */
    public boolean f251875g;

    /* renamed from: h */
    public final LinkedList<Runnable> f251876h = new LinkedList<>();

    /* renamed from: i */
    public final Map<String, C25237g<C13598b0>> f251877i = C90363p0.m113143b(new C13604l("testOk", new C86771a(this)));

    /* renamed from: f70.d$a */
    public /* synthetic */ class C86771a extends C24565l implements C32228q<String, byte[], C32226l<? super C88059h.C88060a, ? extends C13598b0>, C13598b0> {
        public C86771a(Object obj) {
            super(3, obj, C86770d.class, "handleTest", "handleTest(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            byte[] bArr = (byte[]) obj2;
            C87412m.m108594g((String) obj, "p0");
            C87412m.m108594g((C32226l) obj3, "p2");
            ((C86770d) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f70.d$b */
    public static final class C86772b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87164i f251878d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Double, C13598b0> f251879e;

        /* renamed from: f */
        public final /* synthetic */ C86770d<T, BizType> f251880f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86772b(C87164i iVar, C32226l<? super Double, C13598b0> lVar, C86770d<T, BizType> dVar) {
            super(0);
            this.f251878d = iVar;
            this.f251879e = lVar;
            this.f251880f = dVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "preLayout finish " + this.f251878d);
            this.f251879e.invoke(Double.valueOf((double) C47167a.m52445b(Integer.valueOf(this.f251878d.f252791g))));
            C87164i iVar = this.f251878d;
            if (!iVar.f252797m) {
                this.f251880f.mo110351F(iVar.f252786b, iVar.f252795k);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f70.d$c */
    public static final class C86773c<T> implements h$b$$b {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C88059h.C88060a, C13598b0> f251881a;

        /* renamed from: b */
        public final /* synthetic */ C86770d<T, BizType> f251882b;

        public C86773c(C32226l<? super C88059h.C88060a, C13598b0> lVar, C86770d<T, BizType> dVar) {
            this.f251881a = lVar;
            this.f251882b = dVar;
        }

        public void reply(Object obj) {
            C88059h.C88060a aVar = (C88059h.C88060a) obj;
            if (aVar != null) {
                C32226l<C88059h.C88060a, C13598b0> lVar = this.f251881a;
                if (lVar != null) {
                    lVar.invoke(aVar);
                    return;
                }
                return;
            }
            C32226l<C88059h.C88060a, C13598b0> lVar2 = this.f251881a;
            if (lVar2 != null) {
                lVar2.invoke(this.f251882b.mo121194B(4096, (String) null));
            }
        }
    }

    /* renamed from: f70.d$d */
    public static final class C86774d extends C87413o implements C32226l<C88059h.C88060a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88059h.C88065f<C88059h.C88060a> f251883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86774d(C88059h.C88065f<C88059h.C88060a> fVar) {
            super(1);
            this.f251883d = fVar;
        }

        public Object invoke(Object obj) {
            C88059h.C88060a aVar = (C88059h.C88060a) obj;
            C87412m.m108594g(aVar, "resp");
            C88066i iVar = (C88066i) this.f251883d;
            iVar.getClass();
            iVar.f254717a.put("result", aVar);
            iVar.f254718b.reply(iVar.f254717a);
            return C13598b0.f38549a;
        }
    }

    public C86770d(C86764b bVar) {
        C87412m.m108594g(bVar, "mbPlugin");
        this.f251872d = bVar;
    }

    /* renamed from: A */
    public final void mo121193A(String str, byte[] bArr, C32226l<? super C88059h.C88060a, C13598b0> lVar) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "apiName");
        C87667c E = mo110354E();
        if (E != null) {
            C88059h.C88061b bVar = this.f251874f;
            if (bVar != null) {
                String l0 = E.mo118862l0();
                C86773c cVar = new C86773c(lVar, this);
                new BasicMessageChannel(bVar.f254712a, "dev.flutter.pigeon.MagicSclBizFlutterApi.invoke", C88059h.C88062c.f254713a).send(new ArrayList(Arrays.asList(new Serializable[]{l0, str, bArr})), new h$b$$a(cVar));
                b0Var = C13598b0.f38549a;
            } else {
                Log.m105928w("MicroMsg.MagicSclBizFlutterPluginBase", "invoke " + str + " failed because no flutter Api");
                if (lVar != null) {
                    lVar.invoke(mo121194B(4097, "no flutter Api"));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
            }
            if (b0Var != null) {
                return;
            }
        }
        Log.m105928w("MicroMsg.MagicSclBizFlutterPluginBase", "invoke " + str + " failed because no biz");
        if (lVar != null) {
            lVar.invoke(mo121194B(4098, "no biz"));
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: B */
    public final C88059h.C88060a mo121194B(int i, String str) {
        Long valueOf = Long.valueOf((long) i);
        if (str == null) {
            str = "";
        }
        C88059h.C88060a aVar = new C88059h.C88060a();
        aVar.mo122499b(valueOf);
        aVar.mo122500c(str);
        aVar.f254711c = null;
        return aVar;
    }

    /* renamed from: C */
    public final C88059h.C88060a mo121195C(byte[] bArr) {
        C88059h.C88060a aVar = new C88059h.C88060a();
        aVar.mo122499b(0L);
        aVar.mo122500c("");
        aVar.f254711c = bArr;
        return aVar;
    }

    /* renamed from: D */
    public void mo110353D(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
    }

    /* renamed from: E */
    public abstract BizType mo110354E();

    /* renamed from: F */
    public void mo110351F(String str, MagicSclBrandReporter.PreloadScene preloadScene) {
        C87412m.m108594g(str, "frameSetId");
        C87412m.m108594g(preloadScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
    }

    /* renamed from: G */
    public void mo110352G(String str, MagicSclBrandReporter.PreloadScene preloadScene) {
        C87412m.m108594g(str, "frameSetId");
        C87412m.m108594g(preloadScene, "preloadScene");
    }

    /* renamed from: a */
    public void mo121168a(String str, String str2) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
    }

    /* renamed from: b */
    public void mo121169b(String str) {
        C87412m.m108594g(str, "rootId");
        C87667c.C87668a aVar = this.f251873e.get(str);
        if (aVar != null) {
            aVar.mo122102e();
        }
    }

    /* renamed from: c */
    public void mo120584c(int i, boolean z) {
        C87672e eVar;
        C87672e.C87673a a;
        MagicSclBrandReporter.PreloadScene preloadScene;
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasViewFirstFrameRendered id[" + i + "] " + z);
        C87667c E = mo110354E();
        C13598b0 b0Var = null;
        C87164i m0 = E != null ? E.mo122093m0(i) : null;
        C87667c E2 = mo110354E();
        if (E2 != null && (eVar = E2.f253920g) != null && (a = eVar.mo122106a(i)) != null) {
            a.f253949l = true;
            if (!z && a.f253950m) {
                Log.m105928w("MicroMsg.MagicSclBizFlutterPluginBase", "draw on off screen and surfaceAvailable! redraw now " + i + ' ' + m0);
                if (m0 != null) {
                    m0.mo121601e();
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    a.f253948k = true;
                }
            }
            if (a.f253939b.length() > 0) {
                this.f251872d.mo121185b(a.f253939b + '-' + i);
                String str = a.f253939b;
                if (m0 == null || (preloadScene = m0.f252795k) == null) {
                    preloadScene = MagicSclBrandReporter.PreloadScene.NoPreload;
                }
                mo110352G(str, preloadScene);
                return;
            }
            a.f253946i = true;
        }
    }

    /* renamed from: d */
    public void mo121170d(String str) {
        C87412m.m108594g(str, "rootId");
        C87667c.C87668a aVar = this.f251873e.get(str);
        if (aVar != null) {
            aVar.mo122105h();
        }
    }

    /* renamed from: e */
    public void mo121171e(String str) {
        C87412m.m108594g(str, "rootId");
        this.f251873e.remove(str);
        C87667c E = mo110354E();
        if (E != null) {
            E.mo122097y0(str);
        }
    }

    /* renamed from: f */
    public void mo121172f(String str, String str2, String str3) {
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(str3, "extInfo");
        C87667c.C87668a aVar = this.f251873e.get(str);
        if (aVar != null) {
            aVar.mo122099a(str2, str3);
        }
    }

    /* renamed from: g */
    public void mo121173g(String str, String str2) {
        C87164i n0;
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C87667c E = mo110354E();
        if (E != null && (n0 = E.mo122094n0(str2)) != null) {
            n0.mo121604g();
        }
    }

    /* renamed from: h */
    public void mo120588h(int i) {
        C87672e eVar;
        C87672e.C87673a a;
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasViewSurfaceAvailable id[" + i + ']');
        C87667c E = mo110354E();
        C13598b0 b0Var = null;
        if (!(E == null || (eVar = E.f253920g) == null || (a = eVar.mo122106a(i)) == null)) {
            a.f253950m = true;
            if (a.f253949l) {
                C87667c E2 = mo110354E();
                C87164i m0 = E2 != null ? E2.mo122093m0(i) : null;
                Log.m105928w("MicroMsg.MagicSclBizFlutterPluginBase", "firstFrame before available, redraw " + i + ' ' + m0);
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
            Log.m105920e("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasViewSurfaceAvailable but canvas not found? " + i);
            if (BuildInfo.DEBUG) {
                throw new IllegalStateException("onCanvasViewSurfaceAvailable but canvas not found? " + i);
            }
        }
    }

    /* renamed from: i */
    public void mo121174i(String str, String str2) {
        C87164i n0;
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C87667c E = mo110354E();
        if (E != null && (n0 = E.mo122094n0(str2)) != null) {
            n0.mo121599c();
        }
    }

    public boolean isValid() {
        return mo110354E() != null;
    }

    /* renamed from: j */
    public void mo121176j(String str, String str2) {
        C87164i n0;
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C87667c E = mo110354E();
        if (E != null && (n0 = E.mo122094n0(str2)) != null) {
            MagicSclBrandReporter.f237836a.mo112791b(n0.f252786b, true);
            n0.mo121597a();
        }
    }

    /* renamed from: k */
    public void mo121177k(String str) {
        C87412m.m108594g(str, "rootId");
        C87667c.C87668a aVar = this.f251873e.get(str);
        if (aVar != null) {
            aVar.mo122103f();
        }
    }

    /* renamed from: l */
    public void mo121196l(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
        C86764b bVar = this.f251872d;
        String str = iVar.f252786b;
        long b = (long) C47167a.m52445b(Integer.valueOf(iVar.f252790f));
        long b2 = (long) C47167a.m52445b(Integer.valueOf(iVar.f252791g));
        bVar.getClass();
        C87412m.m108594g(str, "viewGroupId");
        C88051c cVar = bVar.f251858e;
        if (cVar != null) {
            cVar.mo122497a(str, (Long) null, (Long) null, Long.valueOf(b), Long.valueOf(b2), C86769c.f251871a);
        }
    }

    /* renamed from: m */
    public void mo121197m(int i, C87164i iVar) {
        C87672e eVar;
        C87672e.C87673a a;
        C89872c cVar;
        MagicSclBrandReporter.PreloadScene preloadScene;
        C87164i n0;
        C87412m.m108594g(iVar, "frameSet");
        C87667c E = mo110354E();
        if (E != null && (eVar = E.f253920g) != null && (a = eVar.mo122106a(i)) != null && (cVar = a.f253945h) != null) {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasIdAndFrameSetIdBind " + i + ' ' + iVar);
            StringBuilder sb = new StringBuilder();
            sb.append(iVar.f252786b);
            sb.append('-');
            sb.append(i);
            String sb4 = sb.toString();
            this.f251872d.mo121186c(a.f253939b, sb4, cVar);
            if (a.f253947j) {
                this.f251872d.mo121188e(sb4, (long) a.f253940c, (long) a.f253941d, (long) a.f253942e, (long) a.f253943f);
            }
            if (a.f253946i) {
                String str = a.f253939b;
                C87667c E2 = mo110354E();
                if (E2 == null || (n0 = E2.mo122094n0(a.f253939b)) == null || (preloadScene = n0.f252795k) == null) {
                    preloadScene = MagicSclBrandReporter.PreloadScene.NoPreload;
                }
                mo110352G(str, preloadScene);
                this.f251872d.mo121185b(sb4);
            }
            a.f253945h = null;
            a.f253947j = false;
            a.f253946i = false;
        }
    }

    /* renamed from: n */
    public void mo120585n(int i, C89872c cVar, int i2, int i3, int i4, int i5) {
        C87672e eVar;
        C87672e.C87673a a;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i15 = i5;
        C87412m.m108594g(cVar, "view");
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasViewLayout id[" + i6 + "] " + i7 + ' ' + i8 + ' ' + i9 + ' ' + i15);
        C87667c E = mo110354E();
        if (!(E == null || (eVar = E.f253920g) == null || (a = eVar.mo122106a(i6)) == null)) {
            a.f253940c = i7;
            a.f253941d = i8;
            a.f253942e = i9;
            a.f253943f = i15;
            a.mo122107a();
            if (a.f253939b.length() > 0) {
                this.f251872d.mo121188e(a.f253939b + '-' + i6, (long) i7, (long) i8, (long) i9, (long) i15);
                return;
            }
        }
    }

    /* renamed from: o */
    public boolean mo120586o(int i, C89872c cVar) {
        C87672e eVar;
        C87672e eVar2;
        C87672e.C87673a a;
        C87412m.m108594g(cVar, "view");
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasViewDestroy id[" + i + ']');
        C87667c E = mo110354E();
        if (!(E == null || (eVar2 = E.f253920g) == null || (a = eVar2.mo122106a(i)) == null)) {
            if (a.f253939b.length() > 0) {
                this.f251872d.mo121187d(a.f253939b + '-' + i);
            }
        }
        C87667c E2 = mo110354E();
        if (!(E2 == null || (eVar = E2.f253920g) == null)) {
            C87672e.C87673a remove = eVar.f253937a.remove(Integer.valueOf(i));
        }
        return false;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "p0");
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f251874f = new C88059h.C88061b(flutterPluginBinding.getBinaryMessenger());
        synchronized (this) {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onAttachedToEngine " + this.f251876h.size());
            this.f251875g = true;
            for (Runnable run : this.f251876h) {
                run.run();
            }
            this.f251876h.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f251874f = null;
        synchronized (this) {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onDetachedFromEngine");
            this.f251875g = false;
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "p0");
    }

    /* renamed from: p */
    public String mo121178p(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C87667c<?, ?>.a x = mo110356x(str, str2);
        C87412m.m108594g(x, "root");
        this.f251873e.put(x.f253930e, x);
        return x.f253930e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        r8 = r8.f252786b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo121179q(java.lang.String r8, java.lang.String r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "rootId"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r9, r0)
            java.util.HashMap<java.lang.String, i70.c<?, ?>$a> r0 = r7.f251873e
            java.lang.Object r0 = r0.get(r8)
            i70.c$a r0 = (i70.C87667c.C87668a) r0
            if (r0 != 0) goto L_0x0036
            java.lang.String r10 = "MicroMsg.MagicSclBizFlutterPluginBase"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "frameSetRoot for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " not found! create: "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r8)
            java.lang.String r8 = ""
            return r8
        L_0x0036:
            java.lang.String r0 = "MicroMsg.MagicSclBizFlutterPluginBase"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createFrameSet "
            r1.append(r2)
            r1.append(r8)
            r2 = 32
            r1.append(r2)
            r1.append(r9)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            g70.i r8 = r7.mo121198z(r8, r9, r10)
            if (r8 == 0) goto L_0x00ba
            boolean r9 = r8.f252797m
            if (r9 != 0) goto L_0x00bb
            com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter r9 = com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter.f237836a
            java.lang.String r10 = r8.f252786b
            monitor-enter(r9)
            java.lang.String r0 = "frameSetId"
            gy3.C87412m.m108594g(r10, r0)     // Catch:{ all -> 0x00b7 }
            com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$a r0 = r9.mo112790a(r10)     // Catch:{ all -> 0x00b7 }
            java.lang.Class<h70.d> r1 = h70.C87459d.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x00b7 }
            h70.d r1 = (h70.C87459d) r1     // Catch:{ all -> 0x00b7 }
            java.lang.Integer r1 = r1.mo58573nm(r10)     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0087
            int r1 = r1.intValue()     // Catch:{ all -> 0x00b7 }
            r9.mo112792c(r10, r1)     // Catch:{ all -> 0x00b7 }
        L_0x0087:
            long r3 = r0.f237840b     // Catch:{ all -> 0x00b7 }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0091
            monitor-exit(r9)
            goto L_0x00bb
        L_0x0091:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b7 }
            r0.f237840b = r3     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "MicroMsg.MagicSclReporter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r3.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = "markRenderStartTime "
            r3.append(r4)     // Catch:{ all -> 0x00b7 }
            r3.append(r10)     // Catch:{ all -> 0x00b7 }
            r3.append(r2)     // Catch:{ all -> 0x00b7 }
            long r4 = r0.f237840b     // Catch:{ all -> 0x00b7 }
            r3.append(r4)     // Catch:{ all -> 0x00b7 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r9)
            goto L_0x00bb
        L_0x00b7:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            if (r8 == 0) goto L_0x00c3
            r7.mo110355w(r8)
            r8.mo121598b()
        L_0x00c3:
            if (r8 == 0) goto L_0x00c9
            java.lang.String r8 = r8.f252786b
            if (r8 != 0) goto L_0x00cb
        L_0x00c9:
            java.lang.String r8 = ""
        L_0x00cb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C86770d.mo121179q(java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* renamed from: r */
    public final void mo121180r(String str, byte[] bArr, C88059h.C88065f<C88059h.C88060a> fVar) {
        C87412m.m108594g(str, "apiName");
        C87412m.m108594g(fVar, "result");
        C25237g gVar = mo110357y().get(str);
        if (gVar != null) {
            ((C32228q) gVar).invoke(str, bArr, new C86774d(fVar));
            return;
        }
        C88066i iVar = (C88066i) fVar;
        iVar.f254717a.put("error", C88059h.m109638a(new C48096k(str + " is not implemented in host")));
        iVar.f254718b.reply(iVar.f254717a);
    }

    /* renamed from: s */
    public void mo121181s(String str, String str2, String str3, MagicSclBrandReporter.PreloadScene preloadScene, String str4, C32226l<? super Double, C13598b0> lVar) {
        C13598b0 b0Var;
        C13598b0 b0Var2;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        MagicSclBrandReporter.PreloadScene preloadScene2 = preloadScene;
        C32226l<? super Double, C13598b0> lVar2 = lVar;
        C87412m.m108594g(str5, "rootId");
        C87412m.m108594g(str6, "name");
        C87412m.m108594g(str7, "data");
        C87412m.m108594g(preloadScene2, "preloadScene");
        C87412m.m108594g(lVar2, "callback");
        C87667c.C87668a aVar = this.f251873e.get(str5);
        if (aVar != null) {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "initFrameSet " + str5 + ' ' + str6 + ' ' + preloadScene2);
            C87164i z = mo121198z(str5, str6, 0);
            if (z == null) {
                b0Var2 = null;
            } else if (z.f252798n || z.f252797m) {
                Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "preLayout existed " + z);
                lVar2.invoke(Double.valueOf((double) C47167a.m52445b(Integer.valueOf(z.f252791g))));
                return;
            } else {
                Log.m105924i("MicroMsg.MagicSclFrameSet", "preloadScene from " + z.f252795k + " to " + preloadScene2 + ", " + z);
                z.f252795k = preloadScene2;
                MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
                String str8 = z.f252786b;
                synchronized (magicSclBrandReporter) {
                    C87412m.m108594g(str8, "frameSetId");
                    MagicSclBrandReporter.C80979a a = magicSclBrandReporter.mo112790a(str8);
                    if (a.f237839a <= 0) {
                        a.f237839a = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.MagicSclReporter", "markInitTime " + str8 + ' ' + a.f237839a);
                    }
                }
                z.f252792h = new C86772b(z, lVar2, this);
                aVar.mo122099a(str7, str4);
                z.mo121600d();
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                lVar2.invoke(null);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("MicroMsg.MagicSclBizFlutterPluginBase", "frameSetRoot for " + str5 + " not found! " + str6);
            lVar2.invoke(null);
        }
    }

    /* renamed from: t */
    public void mo121182t(String str, String str2, int i, int i2) {
        C87164i n0;
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C87667c E = mo110354E();
        if (E != null && (n0 = E.mo122094n0(str2)) != null) {
            C61926c.m72668M(new C87163h(n0, i, i2));
        }
    }

    /* renamed from: u */
    public void mo121183u(String str, String str2, double d, double d2) {
        C87164i n0;
        C87667c<?, ?>.a aVar;
        C87412m.m108594g(str, "rootId");
        C87412m.m108594g(str2, "frameSetId");
        C87667c E = mo110354E();
        if (E != null && (n0 = E.mo122094n0(str2)) != null && (aVar = n0.f252787c) != null) {
            C87667c<ViewType, T> cVar = aVar.f253932g;
            cVar.getClass();
            C87674f fVar = cVar.f253916c;
            fVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("frameSetRootId", aVar.f253930e);
            jSONObject.put("frameSetId", n0.f252786b);
            jSONObject.put("frameSetName", n0.f252785a);
            jSONObject.put("offsetHeight", d);
            jSONObject.put("offsetTop", d2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …Top)\n        }.toString()");
            fVar.mo122111a("surface:frameSet:scroll", jSONObject2);
        }
    }

    /* renamed from: v */
    public void mo120587v(int i, C89872c cVar) {
        C87672e eVar;
        C87412m.m108594g(cVar, "view");
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onCanvasCreated id[" + i + ']');
        C87667c E = mo110354E();
        if (E != null && (eVar = E.f253920g) != null) {
            C87672e.C87673a b = C87672e.m109065b(eVar, i, (String) null, (View) null, 6, (Object) null);
            if (b.f253939b.length() > 0) {
                this.f251872d.mo121186c(b.f253939b, b.f253939b + '-' + i, cVar);
                return;
            }
            b.f253945h = cVar;
        }
    }

    /* renamed from: w */
    public void mo110355w(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
    }

    /* renamed from: x */
    public C87667c<?, ?>.a mo110356x(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C87667c E = mo110354E();
        if (E != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return E.mo122091i0(this, context, E.mo118862l0(), str, str2);
        }
        throw new IllegalStateException("createFrameSetRootInstance but not biz set");
    }

    /* renamed from: y */
    public Map<String, C25237g<C13598b0>> mo110357y() {
        return this.f251877i;
    }

    /* renamed from: z */
    public final C87164i mo121198z(String str, String str2, int i) {
        C87667c.C87668a aVar = this.f251873e.get(str);
        Integer num = null;
        if (aVar == null) {
            return null;
        }
        C13604l<C87164i, Boolean> d = aVar.mo122101d(str2);
        C87164i iVar = (C87164i) d.f38555d;
        if (((Boolean) d.f38556e).booleanValue() && i != 0) {
            iVar.f252800p = i;
        }
        if (iVar.f252800p == 0) {
            C24931h.C24932a.C24934b f = C24931h.C24932a.f71047n.toBuilder();
            C87667c E = mo110354E();
            if (E != null) {
                num = Integer.valueOf(E.mo120836f0(new C86457d(f, new WeakReference(this))));
            }
            int i2 = 0;
            int intValue = num != null ? num.intValue() : 0;
            f.f71056d |= 1;
            f.f71057e = intValue;
            f.onChanged();
            if (num != null) {
                i2 = num.intValue();
            }
            iVar.f252800p = i2;
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "this.viewId is changed to " + num + ", name:" + str2);
        } else {
            Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "this.viewId is " + iVar.f252800p + ",so no addCustomView, name:" + str2);
        }
        iVar.f252790f = C47167a.m52444a(Integer.valueOf(C75044y4.m89990b(MMApplicationContext.getContext()).x));
        if (((Boolean) d.f38556e).booleanValue()) {
            mo110353D(iVar);
        }
        return iVar;
    }
}
