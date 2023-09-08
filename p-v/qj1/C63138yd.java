package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import c30.C104289g;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import ob0.C89132b;
import ok1.C62042e;
import p185kq.C10383h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import qg1.C62615o;
import qj1.C62966ri;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63963s;
import t91.C64208c;
import te3.C49494g01;
import te3.C50626o21;
import te3.C64822x51;
import up1.C27696y;

/* renamed from: qj1.yd */
public final class C63138yd implements C62966ri {

    /* renamed from: d */
    public final Context f179162d;

    /* renamed from: e */
    public final C45795b f179163e;

    /* renamed from: f */
    public final C58124b f179164f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f179165g;

    /* renamed from: h */
    public C63956k f179166h;

    /* renamed from: i */
    public final String f179167i = "FinderLiveRetentionBubble";

    /* renamed from: j */
    public ViewGroup f179168j;

    /* renamed from: qj1.yd$a */
    public static final class C63139a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63138yd f179169d;

        /* renamed from: e */
        public final /* synthetic */ C63963s f179170e;

        public C63139a(C63138yd ydVar, C63963s sVar) {
            this.f179169d = ydVar;
            this.f179170e = sVar;
        }

        public final void onClick(View view) {
            NativeInfo nativeInfo;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f179169d.f179167i, "bubble click jump kefu");
            C63963s sVar = this.f179170e;
            FinderJumpInfo finderJumpInfo = sVar.f181315s.f138912d;
            if (finderJumpInfo == null || (nativeInfo = finderJumpInfo.native_info) == null) {
                ViewGroup viewGroup = this.f179169d.f179168j;
                if (viewGroup != null) {
                    viewGroup.performClick();
                } else {
                    C87412m.m108603p("root");
                    throw null;
                }
            } else {
                C63138yd ydVar = this.f179169d;
                ((C54979h1) ydVar.f179163e.mo71262a(C54979h1.class)).mo75941g3(ydVar.f179162d, nativeInfo);
                C63138yd.m74473a(ydVar, sVar, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.yd$b */
    public static final class C63140b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63138yd f179171d;

        /* renamed from: e */
        public final /* synthetic */ C63963s f179172e;

        public C63140b(C63138yd ydVar, C63963s sVar) {
            this.f179171d = ydVar;
            this.f179172e = sVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f179171d.f179167i, "close promote");
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63963s sVar = this.f179172e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = sVar.f181291d;
                x512.f186254d = 12;
                x512.f186256f = new C89349b(sVar.f181315s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.yd$c */
    public static final class C63141c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63138yd f179173d;

        /* renamed from: e */
        public final /* synthetic */ C63963s f179174e;

        /* renamed from: qj1.yd$c$a */
        public static final class C63142a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C63963s f179175a;

            /* renamed from: b */
            public final /* synthetic */ C63138yd f179176b;

            public C63142a(C63963s sVar, C63138yd ydVar) {
                this.f179175a = sVar;
                this.f179176b = ydVar;
            }

            public Object call(Object obj) {
                C89349b bVar;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class cls = C54979h1.class;
                C8479f0 f0Var = new C8479f0();
                C63963s sVar = this.f179175a;
                f0Var.f27484d = sVar.f181315s;
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (bVar = ((C49494g01) cVar.f256796d).f133757d) != null) {
                    C63138yd ydVar = this.f179176b;
                    T o212 = new C50626o21();
                    o212.parseFrom(bVar.mo123703f());
                    f0Var.f27484d = o212;
                    sVar.f181315s = o212;
                    if (((C54979h1) ydVar.f179163e.mo71262a(cls)).f154147v instanceof C63963s) {
                        ((C54979h1) ydVar.f179163e.mo71262a(cls)).mo75948o3(sVar);
                    }
                }
                C63138yd ydVar2 = this.f179176b;
                FinderJumpInfo finderJumpInfo = sVar.f181315s.f138912d;
                ydVar2.getClass();
                if (finderJumpInfo != null) {
                    finderJumpInfo.business_type = 36;
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(ydVar2.f179162d, finderJumpInfo, 0);
                }
                return C13598b0.f38549a;
            }
        }

        public C63141c(C63138yd ydVar, C63963s sVar) {
            this.f179173d = ydVar;
            this.f179174e = sVar;
        }

        public final void onClick(View view) {
            Class cls = C55001u.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63138yd.m74473a(this.f179173d, this.f179174e, 0);
            C32226l<? super C63956k, C13598b0> lVar = this.f179173d.f179165g;
            if (lVar != null) {
                lVar.invoke(this.f179174e);
            }
            C63963s sVar = this.f179174e;
            String str = this.f179173d.f179167i;
            Log.m105924i(str, "needJump:" + this.f179174e.f181294g);
            if (this.f179174e.f181294g) {
                C55001u uVar = (C55001u) this.f179173d.f179163e.mo71262a(cls);
                C63138yd ydVar = this.f179173d;
                new C62615o(uVar.f154416j, uVar.f154420q.f182392d, 12, sVar.f181293f, new C89349b(sVar.f181315s.toByteArray()), C62042e.f176370a.mo87000E0(ydVar.f179163e, (Long) null), ((C55001u) ydVar.f179163e.mo71262a(cls)).f154424u, (String) null, 128, (C8480h) null).mo9225i().mo123420E(new C63142a(sVar, ydVar));
            } else {
                C63138yd ydVar2 = this.f179173d;
                FinderJumpInfo finderJumpInfo = sVar.f181315s.f138912d;
                ydVar2.getClass();
                if (finderJumpInfo != null) {
                    finderJumpInfo.business_type = 36;
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(ydVar2.f179162d, finderJumpInfo, 0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C63138yd(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f179162d = context;
        this.f179163e = bVar;
        this.f179164f = bVar2;
        this.f179165g = lVar;
        this.f179166h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359750cz1, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f179168j = (ViewGroup) inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        r1 = (r1 = r1.mini_app_info).app_id;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74473a(qj1.C63138yd r17, sk1.C63963s r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r17.getClass()
            java.lang.Class<kq.h> r2 = p185kq.C10383h.class
            java.lang.String r3 = r1.f181320x
            c30.g r14 = new c30.g
            r14.<init>()
            java.lang.String r4 = "liuzi_component_id"
            r14.put(r4, r3)
            java.lang.String r3 = "click_type"
            r4 = r19
            r14.mo145953n(r3, r4)
            te3.o21 r3 = r1.f181315s
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f138912d
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = r3.click_button_name
            if (r3 != 0) goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            java.lang.String r5 = "btn_word"
            r14.put(r5, r3)
            ok1.e r3 = ok1.C62042e.f176370a
            boolean r3 = r3.mo87027N0()
            if (r3 == 0) goto L_0x0059
            r0 = 16
            java.lang.String r1 = "type"
            r14.mo145953n(r1, r0)
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r2 = r0
            ht1.j5 r2 = (ht1.C8777j5) r2
            ak1.g0 r3 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
            java.lang.String r4 = r14.toString()
            r5 = 0
            r6 = 4
            r7 = 0
            ht1.C8777j5.C8778a.m8605f(r2, r3, r4, r5, r6, r7)
            goto L_0x00c8
        L_0x0059:
            t91.c$a r8 = t91.C64208c.f181951a
            byte[] r3 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            java.lang.String r9 = r3.toString()
            te3.o21 r1 = r1.f181315s
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f138912d
            if (r1 == 0) goto L_0x0074
            com.tencent.mm.protocal.protobuf.MiniAppInfo r1 = r1.mini_app_info
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r1.app_id
            if (r1 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r10 = r1
            goto L_0x0075
        L_0x0074:
            r10 = r4
        L_0x0075:
            di3.d r1 = di3.C86312j.m106911c(r2)
            kq.h r1 = (p185kq.C10383h) r1
            fj1.b r3 = r0.f179163e
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            java.lang.String r11 = r1.mo10700XQ(r3)
            di3.d r1 = di3.C86312j.m106911c(r2)
            kq.h r1 = (p185kq.C10383h) r1
            fj1.b r0 = r0.f179163e
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            long r2 = r0.f154325i1
            java.lang.String r13 = r1.mo10700XQ(r2)
            java.lang.String r12 = ""
            r8.mo89033h(r9, r10, r11, r12, r13)
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r4 = r0
            ak1.w r4 = (ak1.C54116w) r4
            ak1.f0$r0 r5 = ak1.C54067f0.C54081r0.CommerceActionRetentionBubbleClick
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 248(0xf8, float:3.48E-43)
            r16 = 0
            java.lang.String r7 = ""
            ak1.C54116w.Rx0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63138yd.m74473a(qj1.yd, sk1.s, int):void");
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        String str;
        MiniAppInfo miniAppInfo;
        Object obj2 = obj;
        C87412m.m108594g(obj2, "data");
        if (obj2 instanceof C63963s) {
            C63963s sVar = (C63963s) obj2;
            mo88066b(sVar);
            Class cls = C10383h.class;
            String str2 = sVar.f181320x;
            C104289g gVar = new C104289g();
            gVar.put("liuzi_component_id", str2);
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87027N0()) {
                gVar.mo145953n("type", 15);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, gVar.toString(), (String) null, 4, (Object) null);
            } else {
                C64208c.C64209a aVar = C64208c.f181951a;
                String obj3 = Util.getUuidRandom().toString();
                FinderJumpInfo finderJumpInfo = sVar.f181315s.f138912d;
                if (finderJumpInfo == null || (miniAppInfo = finderJumpInfo.mini_app_info) == null || (str = miniAppInfo.app_id) == null) {
                    str = "";
                }
                aVar.mo89033h(obj3, str, ((C10383h) C86312j.m106911c(cls)).mo10700XQ(((C55001u) this.f179163e.mo71262a(C55001u.class)).f154420q.f182392d), "", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(((C54991o) this.f179163e.mo71262a(C54991o.class)).f154325i1));
                C7335d c2 = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Rx0((C54116w) c2, C54067f0.C54081r0.CommerceActionRetentionBubbleExposure, (String) null, "", (String) null, (String) null, (String) null, 0, 0, gVar, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            }
            eVar.mo87122v(sVar.f181315s);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f179166h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.be4;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: b */
    public final void mo88066b(C63963s sVar) {
        C13598b0 b0Var;
        String str;
        C63963s sVar2 = sVar;
        ViewGroup viewGroup = this.f179168j;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.o3b);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            String str2 = sVar2.f181316t;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            textView.setText(str2);
            ViewGroup viewGroup2 = this.f179168j;
            if (viewGroup2 != null) {
                TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.o3c);
                String str4 = sVar2.f181317u;
                if (!(!(str4 == null || str4.length() == 0))) {
                    str4 = null;
                }
                if (str4 != null) {
                    textView.setMaxLines(1);
                    textView2.setVisibility(0);
                    textView2.setText(str4);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    textView.setMaxLines(2);
                    textView2.setVisibility(8);
                }
                ViewGroup viewGroup3 = this.f179168j;
                if (viewGroup3 != null) {
                    TextView textView3 = (TextView) viewGroup3.findViewById(C0966R.C0970id.f358967i42);
                    String str5 = sVar2.f181319w;
                    if (str5 == null || str5.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(sVar2.f181319w);
                        textView3.setVisibility(0);
                    }
                    ViewGroup viewGroup4 = this.f179168j;
                    if (viewGroup4 != null) {
                        View findViewById = viewGroup4.findViewById(C0966R.C0970id.be4);
                        ViewGroup viewGroup5 = this.f179168j;
                        if (viewGroup5 != null) {
                            TextView textView4 = (TextView) viewGroup5.findViewById(C0966R.C0970id.o38);
                            FinderJumpInfo finderJumpInfo = sVar2.f181315s.f138912d;
                            if (!(finderJumpInfo == null || (str = finderJumpInfo.click_button_name) == null)) {
                                if (!(str.length() > 0)) {
                                    str = null;
                                }
                                if (str != null) {
                                    textView4.setText(str);
                                }
                            }
                            ViewGroup viewGroup6 = this.f179168j;
                            if (viewGroup6 != null) {
                                FinderLiveShopPromoteContainer finderLiveShopPromoteContainer = (FinderLiveShopPromoteContainer) viewGroup6.findViewById(C0966R.C0970id.i8b);
                                C62042e eVar = C62042e.f176370a;
                                boolean P0 = eVar.mo87032P0(this.f179163e);
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.f179167i);
                                sb.append(" title:");
                                String str6 = sVar2.f181316t;
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                sb.append(str3);
                                finderLiveShopPromoteContainer.mo78796j(true, P0, sb.toString(), false);
                                C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(sVar2.f181318v, C27696y.THUMB_IMAGE));
                                ViewGroup viewGroup7 = this.f179168j;
                                if (viewGroup7 != null) {
                                    View findViewById2 = viewGroup7.findViewById(C0966R.C0970id.o3_);
                                    C87412m.m108593f(findViewById2, "root.findViewById<ImageView>(R.id.retention_img)");
                                    ((C99342a) a).mo85954d((ImageView) findViewById2);
                                    if (eVar.mo87032P0(this.f179163e)) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(4);
                                        View view = findViewById;
                                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRetentionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRetentionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        textView4.setVisibility(8);
                                    } else {
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                        aVar2.mo10233c(0);
                                        View view2 = findViewById;
                                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRetentionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRetentionBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRetentionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        textView4.setVisibility(0);
                                        textView4.setOnClickListener(new C63139a(this, sVar2));
                                        findViewById.setOnClickListener(new C63140b(this, sVar2));
                                    }
                                    ViewGroup viewGroup8 = this.f179168j;
                                    if (viewGroup8 != null) {
                                        viewGroup8.setOnClickListener(new C63141c(this, sVar2));
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
        ViewGroup viewGroup = this.f179168j;
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
        if (obj instanceof C63963s) {
            mo88066b((C63963s) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
