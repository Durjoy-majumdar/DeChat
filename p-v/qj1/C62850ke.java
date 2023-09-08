package qj1;

import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import bp1.C54519d;
import cj1.C54789l6;
import cj1.C54795n5;
import cj1.C54820t;
import cj1.C54847z3;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import d60.C58124b;
import dh1.C7329b;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import ky2.C10432i;
import nk1.C11207i;
import np1.C61866i0;
import np1.C61881v;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import p185kq.C10383h;
import pe3.C47465a;
import pe3.C89349b;
import qj1.C62966ri;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;
import sk1.C63956k;
import sk1.C63965x;
import sp1.C64075c0;
import sp1.C64097k0;
import t91.C64208c;
import te3.C48714ah2;
import te3.C49494g01;
import te3.C49712hj1;
import te3.C50703om1;
import te3.C50849pm1;
import te3.C51559uk1;
import te3.C51752vx0;
import te3.C51995xm1;
import te3.C52137ym1;
import te3.C64370fp1;
import te3.C64513l40;
import te3.C64617p00;
import te3.C64688rq1;
import te3.C64822x51;
import te3.w44;
import te3.z44;
import wi0.C66117m;
import wx3.C15601d;
import wx3.C66212f;
import zp3.C23564m;

/* renamed from: qj1.ke */
public final class C62850ke extends C62660c implements C62966ri {

    /* renamed from: p */
    public final ViewGroup f178361p;

    /* renamed from: q */
    public final C58124b f178362q;

    /* renamed from: r */
    public C32226l<? super C63956k, C13598b0> f178363r;

    /* renamed from: s */
    public C63956k f178364s;

    /* renamed from: t */
    public final String f178365t = "Finder.LiveShoppingBubblePlugin";

    /* renamed from: u */
    public C0740i2 f178366u;

    /* renamed from: v */
    public final C13601g f178367v;

    /* renamed from: qj1.ke$a */
    public /* synthetic */ class C62851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178368a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[86] = 1;
            f178368a = iArr;
        }
    }

    /* renamed from: qj1.ke$b */
    public static final class C62852b extends C54847z3.C54849b<C50849pm1> {

        /* renamed from: b */
        public final /* synthetic */ C62850ke f178369b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62852b(C62850ke keVar, Class<C50849pm1> cls) {
            super(cls);
            this.f178369b = keVar;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C50849pm1 pm12 = (C50849pm1) aVar;
            C87412m.m108594g(pm12, "result");
            C0740i2 i2Var = ((C54979h1) this.f178369b.mo87684A0().mo71262a(C54979h1.class)).f154147v;
            C51559uk1 uk12 = pm12.f139834d;
            if ((i2Var instanceof C13696v) && uk12 != null) {
                C13696v vVar = (C13696v) i2Var;
                if (C87412m.m108589b(uk12.f142894e, vVar.f38763u)) {
                    vVar.f38761s = uk12;
                    this.f178369b.mo87811f1(vVar);
                }
            }
        }
    }

    /* renamed from: qj1.ke$c */
    public static final class C62853c extends C54847z3.C54849b<C52137ym1> {

        /* renamed from: b */
        public final /* synthetic */ C51995xm1 f178370b;

        /* renamed from: c */
        public final /* synthetic */ C62850ke f178371c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62853c(C51995xm1 xm12, C62850ke keVar, Class<C52137ym1> cls) {
            super(cls);
            this.f178370b = xm12;
            this.f178371c = keVar;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C52137ym1 ym12 = (C52137ym1) aVar;
            C87412m.m108594g(ym12, "result");
            String str = ym12.f145401e;
            if (str != null) {
                C62850ke keVar = this.f178371c;
                if (str.length() > 0) {
                    String str2 = keVar.f178365t;
                    Log.m105924i(str2, "update request id: " + str);
                    ((C54991o) keVar.mo87684A0().mo71262a(C54991o.class)).mo75961G4(str);
                }
            }
            C51995xm1 xm12 = this.f178370b;
            if (xm12.f144750f == 1) {
                xm12.f144750f = 0;
                FinderLiveService.f159376d.getClass();
                FinderLiveService.f159383n.mo75802h(2, this.f178370b);
            }
            C0740i2 i2Var = ((C54979h1) this.f178371c.mo87684A0().mo71262a(C54979h1.class)).f154147v;
            C64370fp1 fp12 = ym12.f145400d;
            if ((i2Var instanceof C63965x) && fp12 != null) {
                C63965x xVar = (C63965x) i2Var;
                if (fp12.f183176d == xVar.f181347t) {
                    xVar.f181346s = fp12;
                    C62850ke keVar2 = this.f178371c;
                    String str3 = keVar2.f178365t;
                    Log.m105924i(str3, "[updateCouponBubble] " + xVar);
                    C58124b bVar = keVar2.f178362q;
                    C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
                    Bundle bundle = new Bundle();
                    C64822x51 z1 = C62042e.f176370a.mo87132z1(xVar);
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", z1 != null ? z1.toByteArray() : null);
                    C13598b0 b0Var = C13598b0.f38549a;
                    bVar.statusChange(bVar2, bundle);
                    return;
                }
            }
            String str4 = this.f178371c.f178365t;
            StringBuilder sb = new StringBuilder();
            sb.append("update fail,resp:");
            Object obj = fp12;
            if (fp12 == null) {
                obj = "";
            }
            sb.append(C61937h.m72703b(obj));
            Log.m105924i(str4, sb.toString());
        }
    }

    /* renamed from: qj1.ke$d */
    public static final class C62854d extends C87413o implements C32227p<Boolean, C86299o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62850ke f178372d;

        /* renamed from: e */
        public final /* synthetic */ C64370fp1 f178373e;

        /* renamed from: f */
        public final /* synthetic */ boolean f178374f;

        /* renamed from: g */
        public final /* synthetic */ C63965x f178375g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62854d(C62850ke keVar, C64370fp1 fp12, boolean z, C63965x xVar) {
            super(2);
            this.f178372d = keVar;
            this.f178373e = fp12;
            this.f178374f = z;
            this.f178375g = xVar;
        }

        public Object invoke(Object obj, Object obj2) {
            T t;
            C64688rq1 rq12;
            C89349b bVar;
            boolean z;
            JSONObject jSONObject;
            String str;
            w44 w44;
            C48714ah2 ah22;
            ((Boolean) obj).booleanValue();
            C86299o oVar = (C86299o) obj2;
            Class cls = C54519d.class;
            Class cls2 = C54116w.class;
            if (oVar != null) {
                C63965x xVar = this.f178375g;
                C64370fp1 fp12 = this.f178373e;
                C62850ke keVar = this.f178372d;
                boolean z2 = this.f178374f;
                LinkedList<C64617p00> linkedList = xVar.f181346s.f183195z;
                if (linkedList == null || linkedList.isEmpty()) {
                    C62850ke.m73956Z0(keVar, xVar, z2, oVar, fp12);
                } else {
                    C62042e eVar = C62042e.f176370a;
                    Context context = keVar.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    eVar.mo87047U1(context, true);
                    FinderLiveService.f159376d.getClass();
                    C54795n5 n5Var = FinderLiveService.f159396y;
                    if (n5Var != null) {
                        Context context2 = keVar.f166287d.getContext();
                        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((C54820t) n5Var).mo75721Y((MMActivity) context2, xVar, new C62872le(keVar, oVar, fp12, xVar, z2));
                    }
                }
            }
            String str2 = null;
            if (this.f178372d.f178362q.getLiveRole() == 0) {
                if (this.f178372d.mo87808c1().f181670q.mo78792f()) {
                    C61866i0 i0Var = C61866i0.f175909a;
                    C51752vx0 vx02 = ((C54979h1) this.f178372d.mo87696x0(C54979h1.class)).f154126S;
                    if (vx02 == null || (w44 = vx02.f143755d) == null || (ah22 = w44.f143855d) == null || (str = ah22.f130531g) == null) {
                        str = "";
                    }
                    jSONObject = i0Var.mo86793d(str, this.f178373e);
                } else {
                    jSONObject = C61866i0.f175909a.mo86794e(this.f178373e);
                }
                jSONObject.put("click_type", this.f178374f ? 1 : 0);
                if (this.f178374f) {
                    jSONObject.put("buy_btn_word", this.f178372d.mo87808c1().getActionBtn().getText().toString());
                }
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionBubbleTipClick;
                if (oVar != null) {
                    str2 = oVar.f250940l;
                }
                C54116w.Rx0(wVar, r0Var, str2, String.valueOf(this.f178373e.f183176d), (String) null, (String) null, (String) null, 0, 0, jSONObject, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            } else if (this.f178372d.f178362q.getLiveRole() == 2) {
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar2 = (C54116w) c2;
                JSONObject jSONObject2 = new JSONObject();
                C62850ke keVar2 = this.f178372d;
                C64370fp1 fp13 = this.f178373e;
                jSONObject2.put("type", 1010);
                jSONObject2.put("sessionid", ((C54519d) keVar2.mo87696x0(cls)).mo75374g3().f152864a);
                jSONObject2.put("productid", ((C54519d) keVar2.mo87696x0(cls)).mo75374g3().f152865b);
                jSONObject2.put("seckill", C61866i0.f175909a.mo86803p(fp13) ? 1 : 0);
                LinkedList<z44> linkedList2 = fp13.f183165J;
                C87412m.m108593f(linkedList2, "this.show_box_items");
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((z44) t).f186625d == 4) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                z44 z44 = (z44) t;
                if (z44 == null || (bVar = z44.f186626e) == null) {
                    rq12 = null;
                } else {
                    rq12 = new C64688rq1();
                    rq12.parseFrom(bVar.mo123703f());
                }
                if (rq12 != null) {
                    jSONObject2.put("buyer", rq12.f185233e);
                }
                wVar2.Ux0(jSONObject2, (JSONObject) null, this.f178373e.f183193x);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.ke$e */
    public static final class C62855e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62850ke f178376d;

        /* renamed from: e */
        public final /* synthetic */ Object f178377e;

        /* renamed from: f */
        public final /* synthetic */ long f178378f;

        public C62855e(C62850ke keVar, Object obj, long j) {
            this.f178376d = keVar;
            this.f178377e = obj;
            this.f178378f = j;
        }

        public final void run() {
            if (!this.f178376d.mo87688G0()) {
                C62850ke keVar = this.f178376d;
                Object obj = this.f178377e;
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                keVar.mo87810e1(bool != null ? bool.booleanValue() : false);
                return;
            }
            String str = this.f178376d.f178365t;
            Log.m105924i(str, "onShoppingBubbleClickImpl delayMs:" + this.f178378f + ",isFinished!");
        }
    }

    /* renamed from: qj1.ke$f */
    public static final class C62856f<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C0740i2 f178379a;

        /* renamed from: b */
        public final /* synthetic */ C62850ke f178380b;

        /* renamed from: c */
        public final /* synthetic */ boolean f178381c;

        public C62856f(C0740i2 i2Var, C62850ke keVar, boolean z) {
            this.f178379a = i2Var;
            this.f178380b = keVar;
            this.f178381c = z;
        }

        public Object call(Object obj) {
            C89349b bVar;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C54991o.class;
            Class cls2 = C54979h1.class;
            C8479f0 f0Var = new C8479f0();
            C0740i2 i2Var = this.f178379a;
            f0Var.f27484d = ((C63965x) i2Var).f181346s;
            C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
            C63965x xVar = (C63965x) i2Var;
            String str = this.f178380b.f178365t;
            StringBuilder sb = new StringBuilder();
            sb.append("fxxkshopreport requestId bubbleClick, ");
            String str2 = ((C63965x) this.f178379a).f181346s.f183193x;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            C54991o oVar = (C54991o) this.f178380b.mo87696x0(cls);
            String str3 = ((C63965x) this.f178379a).f181346s.f183193x;
            if (str3 == null) {
                str3 = "";
            }
            oVar.mo75961G4(str3);
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (bVar = ((C49494g01) cVar.f256796d).f133757d) != null) {
                C62850ke keVar = this.f178380b;
                T fp12 = new C64370fp1();
                boolean z = false;
                try {
                    fp12.parseFrom(bVar.mo123703f());
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
                String str4 = fp12.f183193x;
                if (str4 != null) {
                    if (str4.length() > 0) {
                        z = true;
                    }
                    if (!z) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        String str5 = keVar.f178365t;
                        Log.m105924i(str5, "fxxkshopreport requestId bubbleClick cgiback, " + str4);
                        ((C54991o) keVar.mo87696x0(cls)).mo75961G4(str4);
                    }
                }
                f0Var.f27484d = fp12;
                xVar.f181346s = fp12;
                xVar.f181347t = fp12.f183176d;
                xVar.f181348u = fp12.f183177e;
                xVar.f181349v = fp12.f183178f;
                xVar.f181350w = fp12.f183179g;
                xVar.f181351x = fp12.f183180h;
                xVar.f181352y = fp12.f183181i;
                xVar.f181353z = fp12.f183182j;
                xVar.f181333A = fp12.f183183n;
                xVar.f181334B = fp12.f183184o;
                xVar.f181335C = fp12.f183185p;
                xVar.f181336D = fp12.f183186q;
                xVar.f181337E = fp12.f183187r;
                xVar.f181338F = fp12.f183188s;
                xVar.f181339G = fp12.f183189t;
                xVar.f181340H = fp12.f183191v;
                xVar.f181341I = -1;
                xVar.f181342J = fp12.f183156A;
                xVar.f181343K = fp12.f183169N;
                xVar.f181344L = fp12.f183171Q;
                xVar.f181345M = fp12.f183172R;
                if (((C54979h1) keVar.mo87696x0(cls2)).f154147v instanceof C63965x) {
                    C0740i2 i2Var2 = ((C54979h1) keVar.mo87696x0(cls2)).f154147v;
                    C87412m.m108592e(i2Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
                    if (((C63965x) i2Var2).f181347t == ((C64370fp1) f0Var.f27484d).f183176d) {
                        ((C54979h1) keVar.mo87696x0(cls2)).mo75948o3(xVar);
                    }
                }
            }
            this.f178380b.mo87809d1(xVar, this.f178381c);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.ke$g */
    public static final class C62857g extends C87413o implements C32224a<C64075c0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178382d;

        /* renamed from: e */
        public final /* synthetic */ C62850ke f178383e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62857g(ViewGroup viewGroup, C62850ke keVar) {
            super(0);
            this.f178382d = viewGroup;
            this.f178383e = keVar;
        }

        public Object invoke() {
            Context context = this.f178382d.getContext();
            C87412m.m108593f(context, "entranceRoot.context");
            ViewGroup viewGroup = this.f178382d;
            C62850ke keVar = this.f178383e;
            ViewGroup viewGroup2 = keVar.f178361p;
            C58124b bVar = keVar.f178362q;
            C56032b z0 = keVar.mo14484z0();
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z0 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z0 : null;
            C64075c0 c0Var = new C64075c0(context, viewGroup, viewGroup2, bVar, finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null, this.f178383e);
            c0Var.setUserActionClick(new C62895ne(this.f178383e));
            c0Var.setOnClickListener(new C62916oe(this.f178383e));
            return c0Var;
        }
    }

    /* renamed from: qj1.ke$h */
    public static final class C62858h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f178384d;

        /* renamed from: e */
        public final /* synthetic */ C62850ke f178385e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62858h(Object obj, C62850ke keVar) {
            super(0);
            this.f178384d = obj;
            this.f178385e = keVar;
        }

        public Object invoke() {
            Object obj = this.f178384d;
            if (obj instanceof C13696v) {
                String str = this.f178385e.f178365t;
                Log.m105924i(str, "update coupon " + this.f178384d);
                this.f178385e.mo87808c1().mo88823d((C13696v) this.f178384d, true);
            } else if (obj instanceof C63965x) {
                String str2 = this.f178385e.f178365t;
                Log.m105924i(str2, "update goods  " + this.f178384d);
                C64075c0.m75422e(this.f178385e.mo87808c1(), ((C63965x) this.f178384d).f181346s, true, false, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62850ke(ViewGroup viewGroup, ViewGroup viewGroup2, C58124b bVar, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        super(viewGroup2, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(viewGroup2, "shoppingWidgetRoot");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178361p = viewGroup2;
        this.f178362q = bVar;
        this.f178363r = lVar;
        this.f178364s = kVar;
        this.f178367v = C36568h.m40985a(new C62857g(viewGroup, this));
    }

    /* renamed from: Z0 */
    public static final void m73956Z0(C62850ke keVar, C63965x xVar, boolean z, C86299o oVar, C64370fp1 fp12) {
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        JSONObject jSONObject = new JSONObject();
        String str = fp12.f183163H;
        if (str == null) {
            str = "";
        }
        jSONObject.put("cookies", str);
        appBrandLaunchReferrer.f239396d = 1;
        appBrandLaunchReferrer.f239399g = jSONObject.toString();
        oVar.f250947s = appBrandLaunchReferrer;
        C64513l40 j = C58739j4.f168176a.mo83715j(oVar);
        HalfScreenConfig.C55452b f = oVar.f250912A.mo76935f();
        C61881v vVar = C61881v.f175961a;
        f.f158008t = vVar.mo86810b(keVar.mo87684A0(), xVar, j);
        oVar.f250912A = f.mo76967a();
        vVar.mo86813e(oVar);
        C11207i.m11072h(keVar, (C66212f) null, (C53934p0) null, new C62885me(z, keVar, xVar, oVar, fp12, (C15601d<? super C62885me>) null), 3, (Object) null);
    }

    /* renamed from: a1 */
    public static final void m73957a1(C62850ke keVar, boolean z) {
        C32226l<? super C63956k, C13598b0> lVar;
        boolean g0 = keVar.mo82893g0();
        String str = keVar.f178365t;
        Log.m105924i(str, "onShoppingBubbleClick btnClick:" + z + " isLandscape:" + g0);
        C0740i2 i2Var = ((C54979h1) keVar.mo87696x0(C54979h1.class)).f154147v;
        C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
        if (!(kVar == null || (lVar = keVar.f178363r) == null)) {
            lVar.invoke(kVar);
        }
        if (g0) {
            C62660c.m73644Y0(keVar, "PORTRAIT_ACTION_BUBBLE_CLICK", Boolean.valueOf(z), 0, 4, (Object) null);
        } else {
            keVar.mo87810e1(z);
        }
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        C64075c0 c1 = mo87808c1();
        C45795b A0 = mo87684A0();
        c1.getClass();
        c1.f181659I = A0;
        if (obj instanceof C63965x) {
            C53973z1 z1Var = c1.f181657G;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            String str = c1.f181664h;
            StringBuilder sb = new StringBuilder();
            sb.append("update shopping bubble, productId:");
            C63965x xVar = (C63965x) obj;
            sb.append(xVar.f181347t);
            sb.append(", promoting:");
            sb.append(xVar.f181336D);
            sb.append(", platformName:");
            sb.append(xVar.f181333A);
            sb.append(",platformId:");
            sb.append(xVar.f181337E);
            sb.append(",seq:");
            sb.append(xVar.f181338F);
            sb.append('!');
            Log.m105924i(str, sb.toString());
            C54991o oVar = (C54991o) c1.f181663g.mo87696x0(C54991o.class);
            String str2 = xVar.f181346s.f183193x;
            if (str2 == null) {
                str2 = "";
            }
            oVar.mo75961G4(str2);
            if (A0 != null) {
                C7329b.m7474c(C7329b.f25441a, A0, 1, 5, (String) null, 0, (String) null, 0, 120, (Object) null);
            }
            C64075c0.m75422e(c1, xVar.f181346s, false, false, 6, (Object) null);
            C23564m.m28138h(c1.f181665i, new C64097k0(c1, obj));
        } else if (obj instanceof C13696v) {
            String str3 = c1.f181664h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("update shopping bubble,");
            C13696v vVar = (C13696v) obj;
            sb4.append(vVar.f38763u);
            sb4.append(", productId:");
            sb4.append(vVar.f38767y);
            sb4.append(", sending:");
            sb4.append(vVar.f38758E);
            Log.m105924i(str3, sb4.toString());
            if (A0 != null) {
                C7329b.m7474c(C7329b.f25441a, A0, 1, 6, (String) null, 0, (String) null, 0, 120, (Object) null);
            }
            c1.mo88823d(vVar, false);
            if (c1.f181661e.getLiveRole() == 0 && c1.f181660d.getVisibility() == 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                ((C54116w) c).Tx0(C54067f0.C54081r0.CommerceActionCouponBubbleShow, vVar, (String) null);
            }
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f178364s;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        FinderLiveShoppingCouponView couponView = mo87808c1().getCouponView();
        boolean z = true;
        if (couponView == null || !couponView.isShown()) {
            z = false;
        }
        return z ? C0966R.C0970id.bev : C0966R.C0970id.be4;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        FinderLiveShoppingCouponView couponView = mo87808c1().getCouponView();
        boolean z = true;
        if (couponView == null || !couponView.isShown()) {
            z = false;
        }
        return z ? C0966R.C0970id.bum : C0966R.C0970id.fad;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87807b1(boolean z) {
        C0740i2 i2Var = ((C54979h1) mo87684A0().mo71262a(C54979h1.class)).f154147v;
        if (!z) {
            String str = this.f178365t;
            Log.m105924i(str, "stop syncCouponOrGoods " + this.f178366u);
            C0740i2 i2Var2 = this.f178366u;
            if (i2Var2 instanceof C63965x) {
                FinderLiveService.f159376d.getClass();
                FinderLiveService.f159383n.mo75800f(2);
            } else if (i2Var2 instanceof C13696v) {
                FinderLiveService.f159376d.getClass();
                FinderLiveService.f159383n.mo75800f(1);
            }
            this.f178366u = null;
        } else if ((i2Var instanceof C13696v) && !C87412m.m108589b(i2Var, this.f178366u)) {
            if (this.f178366u instanceof C63965x) {
                FinderLiveService.f159376d.getClass();
                FinderLiveService.f159383n.mo75800f(2);
            }
            this.f178366u = i2Var;
            String str2 = this.f178365t;
            Log.m105924i(str2, "start SyncCoupon " + this.f178366u);
            C50703om1 om12 = new C50703om1();
            om12.f139258d = ((C13696v) i2Var).f38763u;
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75799e(1, om12, new C62852b(this, C50849pm1.class), false);
        } else if ((i2Var instanceof C63965x) && !C87412m.m108589b(i2Var, this.f178366u)) {
            if (this.f178366u instanceof C13696v) {
                FinderLiveService.f159376d.getClass();
                FinderLiveService.f159383n.mo75800f(1);
            }
            this.f178366u = i2Var;
            C51995xm1 xm12 = new C51995xm1();
            xm12.f144748d = ((C63965x) i2Var).f181347t;
            xm12.f144749e = ((C54991o) mo87696x0(C54991o.class)).f154318g2;
            xm12.f144750f = 1;
            String str3 = this.f178365t;
            Log.m105924i(str3, "start SyncGoods " + this.f178366u);
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75799e(2, xm12, new C62853c(xm12, this, C52137ym1.class), false);
        }
    }

    /* renamed from: c1 */
    public final C64075c0 mo87808c1() {
        return (C64075c0) ((C36570n) this.f178367v).getValue();
    }

    /* renamed from: d1 */
    public final void mo87809d1(C63965x xVar, boolean z) {
        C64513l40 l402;
        Class<C54979h1> cls;
        Class cls2;
        String str;
        C64513l40 l403;
        C64513l40 l404;
        String str2;
        String str3;
        String str4;
        String str5;
        C64513l40 l405;
        Boolean bool;
        C86299o oVar;
        C64513l40 l406;
        C64513l40 l407;
        String str6;
        String str7;
        String str8;
        String str9;
        C63965x xVar2 = xVar;
        boolean z2 = z;
        Class cls3 = C54991o.class;
        C64370fp1 fp12 = xVar2.f181346s;
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87027N0() || ((C54991o) mo87696x0(cls3)).f154190D) {
            Bundle bundle = new Bundle();
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", fp12.f183176d);
            this.f178362q.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, bundle);
            return;
        }
        String str10 = this.f178365t;
        StringBuilder sb = new StringBuilder();
        sb.append("shopping bubble click, btnClick:");
        sb.append(z2);
        sb.append(", productId:");
        sb.append(fp12.f183176d);
        sb.append(",buy appId:");
        C64513l40 l408 = fp12.f183184o;
        sb.append(l408 != null ? l408.f184031d : null);
        sb.append(",buy path:");
        C64513l40 l409 = fp12.f183184o;
        sb.append(l409 != null ? l409.f184032e : null);
        sb.append(",detail appId:");
        C64513l40 l4010 = fp12.f183185p;
        sb.append(l4010 != null ? l4010.f184031d : null);
        sb.append(" detail path:");
        C64513l40 l4011 = fp12.f183185p;
        sb.append(l4011 != null ? l4011.f184032e : null);
        sb.append(", detail stockId: ");
        sb.append(fp12.f183190u);
        sb.append(", detail disCountPrice: ");
        sb.append(fp12.f183194y);
        Log.m105924i(str10, sb.toString());
        C61881v vVar = C61881v.f175961a;
        C45795b A0 = mo87684A0();
        boolean z3 = !z2;
        C62854d dVar = new C62854d(this, fp12, z2, xVar2);
        Class cls4 = C54108o.class;
        Class cls5 = C55001u.class;
        HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.POPUP;
        HalfScreenConfig.C55453c cVar = HalfScreenConfig.C55453c.HIDE;
        HalfScreenConfig.C55453c cVar2 = HalfScreenConfig.C55453c.SINGLE_CLOSE;
        HalfScreenConfig.C55456f fVar = HalfScreenConfig.C55456f.NORMAL;
        Class cls6 = C10383h.class;
        C87412m.m108594g(A0, "liveData");
        int i = xVar2.f181337E;
        eVar.getClass();
        boolean z4 = i > 0;
        byte[] uuidRandom = Util.getUuidRandom();
        StringBuilder sb4 = new StringBuilder();
        HalfScreenConfig.C55453c cVar3 = cVar;
        sb4.append("[getPayloadForVisitorBubbleClick] gotoDetail:");
        sb4.append(z3);
        sb4.append(", appId:");
        C64513l40 l4012 = xVar2.f181335C;
        sb4.append(l4012 != null ? l4012.f184031d : null);
        sb4.append(",purchase appId:");
        C64513l40 l4013 = xVar2.f181334B;
        sb4.append(l4013 != null ? l4013.f184031d : null);
        sb4.append(", isThirdParty:");
        sb4.append(z4);
        sb4.append(",locClickId:");
        sb4.append(uuidRandom);
        sb4.append('!');
        Log.m105924i("FinderLive.MiniProgramPayloadHelper", sb4.toString());
        HalfScreenConfig.C55453c cVar4 = cVar2;
        String str11 = "FinderLive.MiniProgramPayloadHelper";
        C62854d dVar2 = dVar;
        if (z4) {
            Boolean bool2 = Boolean.TRUE;
            C87412m.m108593f(uuidRandom, "locClickId");
            C86299o oVar2 = new C86299o();
            oVar2.f250939k = 1177;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("live_bubble:");
            Class cls7 = cls5;
            String str12 = "";
            sb5.append(((C55001u) A0.mo71262a(cls5)).f154420q.f182392d);
            sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb5.append(((C54991o) A0.mo71262a(cls3)).f154345o);
            sb5.append("::");
            sb5.append(((C54991o) A0.mo71262a(cls3)).f154325i1);
            sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb5.append(uuidRandom);
            sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb5.append(((C54991o) A0.mo71262a(cls3)).f154318g2);
            sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb5.append(((C54991o) A0.mo71262a(cls3)).f154203G1);
            oVar2.f250940l = sb5.toString();
            ((C54108o) C86312j.m106911c(cls4)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            String str13 = oVar2.f250940l;
            C87412m.m108593f(str13, "sceneNote");
            f0Var.getClass();
            f0Var.f151475s = str13;
            if (z3) {
                l405 = xVar2.f181335C;
                if (l405 == null || (str8 = l405.f184031d) == null) {
                    str8 = str12;
                }
                oVar2.f250930b = str8;
                if (l405 == null || (str9 = l405.f184032e) == null) {
                    str9 = str12;
                }
                oVar2.f250934f = str9;
            } else {
                l405 = xVar2.f181334B;
                if (l405 == null || (str6 = l405.f184031d) == null) {
                    str6 = str12;
                }
                oVar2.f250930b = str6;
                if (l405 == null || (str7 = l405.f184032e) == null) {
                    str7 = str12;
                }
                oVar2.f250934f = str7;
            }
            boolean z5 = !z3 ? !((l406 = xVar2.f181334B) == null || l406.f184036i != 1) : !((l407 = xVar2.f181335C) == null || l407.f184036i != 1);
            HalfScreenConfig.CustomSubjectInfo i2 = C58739j4.f168176a.mo83713i(l405);
            if (z3) {
                bool = bool2;
                oVar = oVar2;
                HalfScreenConfig halfScreenConfig = new HalfScreenConfig(true, vVar.mo86812d(), aVar, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z5 ? cVar4 : cVar3, false, z5, (WeAppHalfScreenStatusChangeListener) null, fVar, !z5, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, i2, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), false, false, 0, false, false, false, -100670088, 1, (C8480h) null);
                oVar.f250912A = halfScreenConfig;
                HalfScreenConfig.C55452b f = halfScreenConfig.mo76935f();
                f.f158008t = vVar.mo86810b(A0, xVar2, l405);
                oVar.f250912A = f.mo76967a();
            } else {
                oVar = oVar2;
                bool = bool2;
                oVar.f250912A = new HalfScreenConfig(true, vVar.mo86812d(), aVar, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z5 ? cVar4 : cVar3, false, z5, (WeAppHalfScreenStatusChangeListener) null, fVar, !z5, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, i2, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), false, false, 0, false, false, false, -100670088, 1, (C8480h) null);
            }
            C54789l6 l6Var = new C54789l6();
            String str14 = xVar2.f181339G;
            if (str14 == null) {
                str14 = str12;
            }
            l6Var.f153583d = str14;
            l6Var.f153584e = xVar2.f181347t;
            l6Var.f153587h = str12;
            l6Var.f153591o = 3;
            l6Var.f153592p = uuidRandom;
            C64208c.f181951a.mo89033h(uuidRandom.toString(), oVar.f250930b, ((C10383h) C86312j.m106911c(cls6)).mo10700XQ(((C55001u) A0.mo71262a(cls7)).f154420q.f182392d), "", ((C10383h) C86312j.m106911c(cls6)).mo10700XQ(((C54991o) A0.mo71262a(cls3)).f154325i1));
            oVar.f250937i = l6Var;
            dVar2.invoke(bool, oVar);
        } else {
            Class cls8 = cls5;
            String str15 = "";
            C62854d dVar3 = dVar2;
            Boolean bool3 = Boolean.TRUE;
            C87412m.m108593f(uuidRandom, "locClickId");
            Boolean bool4 = bool3;
            C86299o oVar3 = new C86299o();
            Class<C54979h1> cls9 = C54979h1.class;
            oVar3.f250939k = 1177;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("live_bubble:");
            HalfScreenConfig.C55451a aVar2 = aVar;
            Class cls10 = cls8;
            sb6.append(((C55001u) A0.mo71262a(cls8)).f154420q.f182392d);
            sb6.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb6.append(((C54991o) A0.mo71262a(cls3)).f154345o);
            sb6.append("::");
            sb6.append(((C54991o) A0.mo71262a(cls3)).f154325i1);
            sb6.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb6.append(uuidRandom);
            sb6.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb6.append(((C54991o) A0.mo71262a(cls3)).f154318g2);
            sb6.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb6.append(((C54991o) A0.mo71262a(cls3)).f154203G1);
            oVar3.f250940l = sb6.toString();
            ((C54108o) C86312j.m106911c(cls4)).getClass();
            C54067f0 f0Var2 = C54108o.f151869h;
            String str16 = oVar3.f250940l;
            C87412m.m108593f(str16, "sceneNote");
            f0Var2.getClass();
            f0Var2.f151475s = str16;
            if (z3) {
                l402 = xVar2.f181335C;
                if (l402 == null || (str4 = l402.f184031d) == null) {
                    str4 = str15;
                }
                oVar3.f250930b = str4;
                if (l402 == null || (str5 = l402.f184032e) == null) {
                    str5 = str15;
                }
                oVar3.f250934f = str5;
            } else {
                l402 = xVar2.f181334B;
                if (l402 == null || (str2 = l402.f184031d) == null) {
                    str2 = str15;
                }
                oVar3.f250930b = str2;
                if (l402 == null || (str3 = l402.f184032e) == null) {
                    str3 = str15;
                }
                oVar3.f250934f = str3;
            }
            boolean z6 = !z3 ? !((l403 = xVar2.f181334B) == null || l403.f184036i != 1) : !((l404 = xVar2.f181335C) == null || l404.f184036i != 1);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("showNavigationBar = ");
            sb7.append(z6);
            sb7.append(", show drag bar = ");
            sb7.append(l402 != null && l402.f184037j == 1);
            Log.m105918d(str11, sb7.toString());
            HalfScreenConfig.CustomSubjectInfo i3 = C58739j4.f168176a.mo83713i(l402);
            if (z3) {
                boolean z7 = !z6;
                HalfScreenConfig halfScreenConfig2 = r11;
                cls2 = cls10;
                cls = cls9;
                HalfScreenConfig halfScreenConfig3 = new HalfScreenConfig(true, vVar.mo86812d(), aVar2, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z6 ? cVar4 : cVar3, false, z6, (WeAppHalfScreenStatusChangeListener) null, fVar, z7, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, i3, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), l402 != null && l402.f184037j == 1, true, 0, false, z7, false, 1644160376, 1, (C8480h) null);
                HalfScreenConfig halfScreenConfig4 = halfScreenConfig2;
                oVar3.f250912A = halfScreenConfig4;
                HalfScreenConfig.C55452b f2 = halfScreenConfig4.mo76935f();
                f2.f158008t = vVar.mo86810b(A0, xVar2, l402);
                oVar3.f250912A = f2.mo76967a();
            } else {
                cls = cls9;
                cls2 = cls10;
                oVar3.f250912A = new HalfScreenConfig(true, vVar.mo86812d(), aVar2, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z6 ? cVar4 : cVar3, false, z6, (WeAppHalfScreenStatusChangeListener) null, fVar, !z6, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, i3, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), true, false, 0, false, false, false, -234887816, 1, (C8480h) null);
            }
            if (!(l402 == null || (str = l402.f184031d) == null)) {
                Class<C54979h1> cls11 = cls;
                HashMap<String, String> hashMap = ((C54979h1) A0.mo71262a(cls11)).f154124Q;
                String str17 = l402.f184033f;
                if (str17 == null) {
                    str17 = str15;
                }
                hashMap.put(str, str17);
                HashMap<String, String> hashMap2 = ((C54979h1) A0.mo71262a(cls11)).f154125R;
                String str18 = l402.f184034g;
                if (str18 == null) {
                    str18 = str15;
                }
                hashMap2.put(str, str18);
            }
            C54789l6 l6Var2 = new C54789l6();
            String str19 = xVar2.f181339G;
            if (str19 == null) {
                str19 = str15;
            }
            l6Var2.f153583d = str19;
            l6Var2.f153584e = xVar2.f181347t;
            l6Var2.f153587h = str15;
            l6Var2.f153591o = 3;
            l6Var2.f153592p = uuidRandom;
            boolean z8 = true;
            l6Var2.f153595s = !z3;
            if (l402 == null || l402.f184037j != 1) {
                z8 = false;
            }
            l6Var2.f153590n = z8;
            C64208c.f181951a.mo89033h(uuidRandom.toString(), oVar3.f250930b, ((C10383h) C86312j.m106911c(cls6)).mo10700XQ(((C55001u) A0.mo71262a(cls2)).f154420q.f182392d), "", ((C10383h) C86312j.m106911c(cls6)).mo10700XQ(((C54991o) A0.mo71262a(cls3)).f154325i1));
            oVar3.f250937i = l6Var2;
            dVar3.invoke(bool4, oVar3);
        }
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_BUBBLE_CLICK")) {
            C62855e eVar = new C62855e(this, obj, j);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(eVar, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0093, code lost:
        r8 = ((cl1.C54991o) r8.mo71262a(r3)).f154203G1;
     */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87810e1(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r4)
            cl1.h1 r4 = (cl1.C54979h1) r4
            cm1.i2 r4 = r4.f154147v
            d60.b r5 = r0.f178362q
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout"
            gy3.C87412m.m108592e(r5, r6)
            com.tencent.mm.plugin.finder.live.view.b r5 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r5
            boolean r6 = r4 instanceof sk1.C63965x
            if (r6 == 0) goto L_0x0101
            dh1.b r7 = dh1.C7329b.f25441a
            fj1.b r8 = r20.mo87684A0()
            r9 = 5
            r10 = 5
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 120(0x78, float:1.68E-43)
            r16 = 0
            dh1.C7329b.m7474c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r6 = r0.f178365t
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[onShoppingBubbleClickImpl] btnClick:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = ", needJump:"
            r7.append(r8)
            r8 = r4
            sk1.x r8 = (sk1.C63965x) r8
            boolean r9 = r8.f181294g
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            boolean r6 = r8.f181294g
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x00cf
            fj1.b r5 = r5.getBuContext()
            androidx.lifecycle.i0 r5 = r5.mo71262a(r2)
            cl1.u r5 = (cl1.C55001u) r5
            qg1.o r6 = new qg1.o
            long r10 = r5.f154416j
            te3.c21 r5 = r5.f154420q
            long r12 = r5.f182392d
            java.lang.String r15 = r8.f181293f
            pe3.b r5 = new pe3.b
            te3.fp1 r8 = r8.f181346s
            byte[] r8 = r8.toByteArray()
            r5.<init>(r8)
            ok1.e r8 = ok1.C62042e.f176370a
            fj1.b r9 = r20.mo87684A0()
            r14 = 0
            java.lang.String r17 = r8.mo87000E0(r9, r14)
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
            cl1.u r2 = (cl1.C55001u) r2
            java.lang.String r2 = r2.f154424u
            fj1.b$a r8 = fj1.C45795b.f123697j
            fj1.b r8 = fj1.C45795b.f123698n
            if (r8 == 0) goto L_0x00a1
            androidx.lifecycle.i0 r8 = r8.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154203G1
            if (r8 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r19 = r8
            goto L_0x00a3
        L_0x00a1:
            r19 = r7
        L_0x00a3:
            r9 = r6
            r7 = r14
            r8 = 5
            r14 = r8
            r16 = r5
            r18 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19)
            nr3.e r2 = r6.mo9225i()
            qj1.ke$f r5 = new qj1.ke$f
            r5.<init>(r4, r0, r1)
            r2.mo123420E(r5)
            android.view.ViewGroup r1 = r0.f166287d
            android.content.Context r1 = r1.getContext()
            boolean r4 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x00c8
            r14 = r1
            com.tencent.mm.ui.MMActivity r14 = (com.tencent.p014mm.p136ui.MMActivity) r14
            goto L_0x00c9
        L_0x00c8:
            r14 = r7
        L_0x00c9:
            if (r14 == 0) goto L_0x0125
            r2.mo11397F(r14)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r2 = r0.f178365t
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fxxkshopreport requestId bubbleClick, "
            r4.append(r5)
            te3.fp1 r5 = r8.f181346s
            java.lang.String r5 = r5.f183193x
            if (r5 != 0) goto L_0x00e2
            r5 = r7
        L_0x00e2:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r3)
            cl1.o r2 = (cl1.C54991o) r2
            te3.fp1 r4 = r8.f181346s
            java.lang.String r4 = r4.f183193x
            if (r4 != 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r7 = r4
        L_0x00fa:
            r2.mo75961G4(r7)
            r0.mo87809d1(r8, r1)
            goto L_0x0125
        L_0x0101:
            boolean r1 = r4 instanceof sk1.C13696v
            if (r1 == 0) goto L_0x0125
            sk1.v r4 = (sk1.C13696v) r4
            boolean r1 = r4.f38759F
            if (r1 == 0) goto L_0x0125
            d60.b r1 = r0.f178362q
            int r1 = r1.getLiveRole()
            if (r1 != 0) goto L_0x0125
            sp1.c0 r1 = r20.mo87808c1()
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            java.lang.String r5 = "root.context"
            gy3.C87412m.m108593f(r2, r5)
            r1.mo88821b(r2, r4)
        L_0x0125:
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r3)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75990Y3()
            if (r1 == 0) goto L_0x0147
            java.lang.Class<hq1.d> r1 = hq1.C60085d.class
            qj1.c r1 = r0.mo87687E0(r1)
            hq1.d r1 = (hq1.C60085d) r1
            if (r1 == 0) goto L_0x0147
            hq1.e r1 = r1.f171450r
            if (r1 == 0) goto L_0x0147
            r1.mo84955a()
            r2 = 2015(0x7df, float:2.824E-42)
            r1.mo84957c(r2)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62850ke.mo87810e1(boolean):void");
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    /* renamed from: f1 */
    public final void mo87811f1(C13696v vVar) {
        C87412m.m108594g(vVar, "newCouponItem");
        String str = this.f178365t;
        Log.m105924i(str, "[updateCouponBubble] " + vVar);
        C58124b bVar = this.f178362q;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
        Bundle bundle = new Bundle();
        C64822x51 z1 = C62042e.f176370a.mo87132z1(vVar);
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", z1 != null ? z1.toByteArray() : null);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w(this.f178365t, "setVisible return for isTeenMode");
        } else if (((C54991o) mo87696x0(C54991o.class)).mo75999e4() || i != 0) {
            super.mo10792g(i);
        } else {
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                D0.mo75716T(this.f178361p, i);
            }
        }
    }

    public View getView() {
        return this.f178361p;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        C61926c.m72668M(new C62858h(obj, this));
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C62851a.f178368a[bVar.ordinal()] == 1) {
            C0740i2 i2Var = ((C54979h1) mo87684A0().mo71262a(C54979h1.class)).f154147v;
            if (i2Var instanceof C13696v) {
                mo87811f1((C13696v) i2Var);
            }
        }
    }

    /* renamed from: w */
    public void mo12190w() {
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            bVar.unregisterPlugin(C62850ke.class);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
    }
}
