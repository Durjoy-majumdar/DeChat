package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qg1.C62615o;
import qj1.C62966ri;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63964u;
import te3.C49494g01;
import te3.C64620p2;
import te3.C64704s81;
import te3.C64822x51;
import up1.C27696y;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: qj1.d */
public final class C62690d implements C62966ri {

    /* renamed from: d */
    public final Context f178003d;

    /* renamed from: e */
    public final C45795b f178004e;

    /* renamed from: f */
    public final C58124b f178005f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f178006g;

    /* renamed from: h */
    public C63956k f178007h;

    /* renamed from: i */
    public final String f178008i = "FinderLiveAdBubble";

    /* renamed from: j */
    public ViewGroup f178009j;

    /* renamed from: qj1.d$a */
    public static final class C62691a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ Object f178010a;

        public C62691a(Object obj) {
            this.f178010a = obj;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            String str;
            C87412m.m108594g(view, "view");
            if (z) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionBubbleTipShow;
                String p = C61926c.m72691p(((C63964u) this.f178010a).f181326t);
                Object obj = this.f178010a;
                C64620p2 p2Var = ((C63964u) obj).f181327u;
                if (p2Var == null || (str = p2Var.f184738g) == null) {
                    str = "";
                }
                String p2 = C61926c.m72691p(((C63964u) obj).f181326t);
                Object obj2 = this.f178010a;
                String str2 = ((C63964u) obj2).f181322B;
                if (str2 == null) {
                    str2 = "";
                }
                C54116w.Rx0(wVar, r0Var, (String) null, p, str, p2, str2, ((C63964u) obj2).f181323C, ((C63964u) obj2).f181324D, (JSONObject) null, 256, (Object) null);
            }
        }
    }

    /* renamed from: qj1.d$b */
    public static final class C62692b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62690d f178011d;

        /* renamed from: e */
        public final /* synthetic */ C63964u f178012e;

        public C62692b(C62690d dVar, C63964u uVar) {
            this.f178011d = dVar;
            this.f178012e = uVar;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str2 = this.f178011d.f178008i;
            Log.m105924i(str2, "close promote, id:" + this.f178012e.f181325s.f185374d);
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f178011d.f178004e;
            C87412m.m108591d(bVar2);
            C7329b.m7474c(bVar, bVar2, 2, 4, C61926c.m72691p(this.f178012e.f181326t), this.f178012e.f181323C, (String) null, 0, 96, (Object) null);
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w wVar = (C54116w) c;
            C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionBubbleTipClose;
            String p = C61926c.m72691p(this.f178012e.f181326t);
            C63964u uVar = this.f178012e;
            C64620p2 p2Var = uVar.f181327u;
            if (p2Var == null || (str = p2Var.f184738g) == null) {
                str = "";
            }
            String p2 = C61926c.m72691p(uVar.f181326t);
            C63964u uVar2 = this.f178012e;
            String str3 = uVar2.f181322B;
            if (str3 == null) {
                str3 = "";
            }
            C54116w.Rx0(wVar, r0Var, (String) null, p, str, p2, str3, uVar2.f181323C, uVar2.f181324D, (JSONObject) null, 256, (Object) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar3 = FinderLiveService.f159379g;
            if (bVar3 != null) {
                C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63964u uVar3 = this.f178012e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = uVar3.f181291d;
                x512.f186254d = 4;
                x512.f186256f = new C89349b(uVar3.f181325s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar3.statusChange(bVar4, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.d$c */
    public static final class C62693c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62690d f178013d;

        /* renamed from: e */
        public final /* synthetic */ C63964u f178014e;

        /* renamed from: qj1.d$c$a */
        public static final class C62694a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C63964u f178015a;

            /* renamed from: b */
            public final /* synthetic */ C62690d f178016b;

            public C62694a(C63964u uVar, C62690d dVar) {
                this.f178015a = uVar;
                this.f178016b = dVar;
            }

            public Object call(Object obj) {
                C89349b bVar;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class cls = C54979h1.class;
                C8479f0 f0Var = new C8479f0();
                C63964u uVar = this.f178015a;
                f0Var.f27484d = uVar.f181325s;
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (bVar = ((C49494g01) cVar.f256796d).f133757d) != null) {
                    C62690d dVar = this.f178016b;
                    T s812 = new C64704s81();
                    s812.parseFrom(bVar.mo123703f());
                    f0Var.f27484d = s812;
                    String str = dVar.f178008i;
                    Log.m105924i(str, "getJumpInfo uxinfo = " + ((C64704s81) f0Var.f27484d).f185382o);
                    C64704s81 s813 = (C64704s81) f0Var.f27484d;
                    C87412m.m108594g(s813, "newData");
                    uVar.f181325s = s813;
                    uVar.f181326t = s813.f185374d;
                    uVar.f181327u = s813.f185375e;
                    uVar.f181328v = s813.f185376f;
                    uVar.f181329w = s813.f185377g;
                    uVar.f181330x = s813.f185378h;
                    uVar.f181331y = s813.f185379i;
                    uVar.f181332z = s813.f185380j;
                    uVar.f181321A = s813.f185381n;
                    String str2 = s813.f185382o;
                    if (str2 == null) {
                        str2 = "";
                    }
                    uVar.f181322B = str2;
                    uVar.f181323C = s813.f185384q;
                    uVar.f181324D = s813.f185385r;
                    if (((C54979h1) dVar.f178004e.mo71262a(cls)).f154147v instanceof C63964u) {
                        C0740i2 i2Var = ((C54979h1) dVar.f178004e.mo71262a(cls)).f154147v;
                        C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowAdItem");
                        if (((C63964u) i2Var).f181326t == uVar.f181326t) {
                            ((C54979h1) dVar.f178004e.mo71262a(cls)).mo75948o3(uVar);
                        }
                    }
                }
                C62690d.m73699a(this.f178016b, uVar);
                return C13598b0.f38549a;
            }
        }

        public C62693c(C62690d dVar, C63964u uVar) {
            this.f178013d = dVar;
            this.f178014e = uVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            Class cls = C55001u.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super C63956k, C13598b0> lVar = this.f178013d.f178006g;
            if (lVar != null) {
                lVar.invoke(this.f178014e);
            }
            C7329b.m7474c(C7329b.f25441a, this.f178013d.f178004e, 5, 4, C61926c.m72691p(this.f178014e.f181326t), this.f178014e.f181323C, (String) null, 0, 96, (Object) null);
            if (((C54991o) this.f178013d.f178004e.mo71262a(C54991o.class)).mo75990Y3()) {
                C58124b bVar = this.f178013d.f178005f;
                C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
                if (!(bVar2 == null || (dVar = (C60085d) bVar2.getPlugin(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                    eVar.mo84956b();
                }
            }
            C63964u uVar = this.f178014e;
            String str = this.f178013d.f178008i;
            Log.m105924i(str, "needJump:" + this.f178014e.f181294g);
            if (this.f178014e.f181294g) {
                C55001u uVar2 = (C55001u) this.f178013d.f178004e.mo71262a(cls);
                C62690d dVar2 = this.f178013d;
                new C62615o(uVar2.f154416j, uVar2.f154420q.f182392d, 4, uVar.f181293f, new C89349b(uVar.f181325s.toByteArray()), C62042e.f176370a.mo87000E0(dVar2.f178004e, Long.valueOf(uVar.f181326t)), ((C55001u) dVar2.f178004e.mo71262a(cls)).f154424u, (String) null, 128, (C8480h) null).mo9225i().mo123420E(new C62694a(uVar, dVar2));
            } else {
                C62690d.m73699a(this.f178013d, uVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C62690d(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f178003d = context;
        this.f178004e = bVar;
        this.f178005f = bVar2;
        this.f178006g = lVar;
        this.f178007h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.adm, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f178009j = (ViewGroup) inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73699a(qj1.C62690d r22, sk1.C63964u r23) {
        /*
            r0 = r22
            r1 = r23
            r22.getClass()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            te3.p2 r3 = r1.f181327u
            if (r3 == 0) goto L_0x01b5
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            re1.a r4 = up1.C37521f.f99548w5
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto L_0x0038
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            r4.f154357q3 = r5
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            r4.clear()
        L_0x0038:
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154357q3
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0053
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x004e
            r4 = 1
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 != r7) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = r0.f178008i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get uxInfo from outsize:"
            r6.append(r7)
            fj1.b r7 = r0.f178004e
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154357q3
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r2 = r4.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154357q3
            goto L_0x0135
        L_0x0084:
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            long r9 = r1.f181326t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r4 = r4.containsKey(r9)
            java.lang.String r9 = ",uxinfo:"
            if (r4 == 0) goto L_0x010d
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            long r10 = r1.f181326t
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00c0
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00bc
            r4 = 1
            goto L_0x00bd
        L_0x00bc:
            r4 = 0
        L_0x00bd:
            if (r4 != r7) goto L_0x00c0
            r6 = 1
        L_0x00c0:
            if (r6 == 0) goto L_0x010d
            java.lang.String r4 = r0.f178008i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get uxInfo from cgi-getShowShopSelf,adid:"
            r6.append(r7)
            long r10 = r1.f181326t
            r6.append(r10)
            r6.append(r9)
            fj1.b r7 = r0.f178004e
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            java.util.HashMap<java.lang.Long, java.lang.String> r7 = r7.f154361r3
            long r9 = r1.f181326t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            fj1.b r4 = r0.f178004e
            androidx.lifecycle.i0 r2 = r4.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.HashMap<java.lang.Long, java.lang.String> r2 = r2.f154361r3
            long r6 = r1.f181326t
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0135
        L_0x010d:
            java.lang.String r2 = r0.f178008i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "get uxInfo from promotingProduct,adid:"
            r4.append(r6)
            long r6 = r1.f181326t
            r4.append(r6)
            r4.append(r9)
            java.lang.String r6 = r1.f181322B
            if (r6 != 0) goto L_0x0126
            r6 = r8
        L_0x0126:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.String r2 = r1.f181322B
            if (r2 != 0) goto L_0x0135
            r2 = r8
        L_0x0135:
            java.lang.String r4 = r0.f178008i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "jumpAd,using uxinfo = "
            r6.append(r7)
            if (r2 != 0) goto L_0x0145
            r7 = r8
            goto L_0x0146
        L_0x0145:
            r7 = r2
        L_0x0146:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            ok1.e r4 = ok1.C62042e.f176370a
            android.view.ViewGroup r6 = r0.f178009j
            if (r6 == 0) goto L_0x01af
            android.content.Context r5 = r6.getContext()
            java.lang.String r6 = "root.context"
            gy3.C87412m.m108593f(r5, r6)
            if (r2 != 0) goto L_0x0162
            r2 = r8
        L_0x0162:
            r4.mo87104o1(r5, r3, r2)
            d60.b r0 = r0.f178005f
            int r0 = r0.getLiveRole()
            if (r0 != 0) goto L_0x01b5
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r9 = r0
            ak1.w r9 = (ak1.C54116w) r9
            ak1.f0$r0 r10 = ak1.C54067f0.C54081r0.CommerceActionBubbleTipClick
            r11 = 0
            long r2 = r1.f181326t
            java.lang.String r12 = java.lang.String.valueOf(r2)
            te3.p2 r0 = r1.f181327u
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = r0.f184738g
            if (r0 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r13 = r0
            goto L_0x0190
        L_0x018f:
            r13 = r8
        L_0x0190:
            long r2 = r1.f181326t
            java.lang.String r14 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r1.f181322B
            if (r0 != 0) goto L_0x019c
            r15 = r8
            goto L_0x019d
        L_0x019c:
            r15 = r0
        L_0x019d:
            int r0 = r1.f181323C
            long r1 = r1.f181324D
            r19 = 0
            r20 = 256(0x100, float:3.59E-43)
            r21 = 0
            r16 = r0
            r17 = r1
            ak1.C54116w.Rx0(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            goto L_0x01b5
        L_0x01af:
            java.lang.String r0 = "root"
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62690d.m73699a(qj1.d, sk1.u):void");
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63964u) {
            C63964u uVar = (C63964u) obj;
            mo87707b(uVar);
            C7329b.m7474c(C7329b.f25441a, this.f178004e, 1, 4, C61926c.m72691p(uVar.f181326t), uVar.f181323C, (String) null, 0, 96, (Object) null);
            ViewGroup viewGroup = this.f178009j;
            if (viewGroup != null) {
                C23564m.m28138h(viewGroup, new C62691a(obj));
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f178007h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.dad;
    }

    /* renamed from: b */
    public final void mo87707b(C63964u uVar) {
        C63964u uVar2 = uVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (uVar2.f181326t == 0 || Util.isNullOrNil(uVar2.f181329w)) {
            String str = this.f178008i;
            Log.m105924i(str, "showShoppingBubble ad_id:" + uVar2.f181326t + ", imgUrl:" + uVar2.f181329w);
            return;
        }
        String str2 = this.f178008i;
        Log.m105924i(str2, "showShoppingBubble ad_id:" + uVar2.f181326t + ", imgUrl:" + uVar2.f181329w);
        ViewGroup viewGroup = this.f178009j;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dah);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            String str3 = uVar2.f181328v;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            textView.setText(str3);
            ViewGroup viewGroup2 = this.f178009j;
            if (viewGroup2 != null) {
                TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.dae);
                String str5 = uVar2.f181330x;
                if (str5 != null) {
                    str4 = str5;
                }
                textView2.setText(str4);
                ViewGroup viewGroup3 = this.f178009j;
                if (viewGroup3 != null) {
                    TextView textView3 = (TextView) viewGroup3.findViewById(C0966R.C0970id.daf);
                    String str6 = uVar2.f181332z;
                    if (str6 == null || str6.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(uVar2.f181332z);
                        textView3.setVisibility(0);
                    }
                    ViewGroup viewGroup4 = this.f178009j;
                    if (viewGroup4 != null) {
                        View findViewById = viewGroup4.findViewById(C0966R.C0970id.f358111dh0);
                        C60979d<C100810g0> K1 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                        C62345f fVar = new C62345f(uVar2.f181329w, (C27696y) null, 2, (C8480h) null);
                        ViewGroup viewGroup5 = this.f178009j;
                        if (viewGroup5 != null) {
                            View findViewById2 = viewGroup5.findViewById(C0966R.C0970id.dag);
                            C87412m.m108593f(findViewById2, "root.findViewById<ImageV….id.finder_live_ad_thumb)");
                            K1.mo85957c(fVar, (ImageView) findViewById2, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LIVE_SHOPPING_DEFAULT));
                            if (C62042e.f176370a.mo87032P0(this.f178004e)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowAdItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowAdItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                View view2 = findViewById;
                                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowAdItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowAdItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setOnClickListener(new C62692b(this, uVar2));
                            }
                            ViewGroup viewGroup6 = this.f178009j;
                            if (viewGroup6 != null) {
                                viewGroup6.findViewById(C0966R.C0970id.dad).setOnClickListener(new C62693c(this, uVar2));
                            } else {
                                C87412m.m108603p("root");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("root");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("root");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("root");
                    throw null;
                }
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        } else {
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f178009j;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63964u) {
            mo87707b((C63964u) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
