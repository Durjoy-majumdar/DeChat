package com.tencent.p014mm.plugin.finder.live.widget;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58777u0;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8777j5;
import i70.C87667c;
import il1.C46274z;
import il1.C60339a0;
import il1.C60552y;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import nr3.C89059e;
import ok1.C62042e;
import pe3.C89349b;
import qg1.C47832n;
import qg1.C62616r;
import qj1.C62660c;
import rx3.C13598b0;
import sk1.C48415h;
import sk1.C63951e;
import sk1.C63952f;
import sk1.C63953g;
import sx3.C64197v;
import te3.C48899bs1;
import te3.C49188dt1;
import te3.C50169kr1;
import te3.C51560uk2;
import te3.C51613uy0;
import te3.C64374fs1;
import te3.C64403gs1;
import te3.C64789vy0;
import te3.ih4;
import xk1.C66355w;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget */
public final class FinderLiveAnchorGameTogetherWidget {

    /* renamed from: a */
    public final ViewGroup f160036a;

    /* renamed from: b */
    public final C58124b f160037b;

    /* renamed from: c */
    public final C62660c f160038c;

    /* renamed from: d */
    public final String f160039d = "Finder.FinderLiveAnchorGameWidget";

    /* renamed from: e */
    public TextView f160040e;

    /* renamed from: f */
    public TextView f160041f;

    /* renamed from: g */
    public FrameLayout f160042g;

    /* renamed from: h */
    public WxRecyclerAdapter<C63953g> f160043h;

    /* renamed from: i */
    public final ArrayList<C63953g> f160044i;

    /* renamed from: j */
    public C64789vy0 f160045j;

    /* renamed from: k */
    public FrameLayout f160046k;

    /* renamed from: l */
    public View f160047l;

    /* renamed from: m */
    public LiveBottomSheetPanel f160048m;

    /* renamed from: n */
    public RecyclerView f160049n;

    /* renamed from: o */
    public C87667c<?, ?>.a f160050o;

    /* renamed from: p */
    public View f160051p;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$a */
    public static final class C56125a implements View.OnClickListener {

        /* renamed from: d */
        public static final C56125a f160052d = new C56125a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$b */
    public static final class C56126b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160053d;

        public C56126b(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
            this.f160053d = finderLiveAnchorGameTogetherWidget;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f160053d.f160037b, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$c */
    public static final class C56127c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160054d;

        public C56127c(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
            this.f160054d = finderLiveAnchorGameTogetherWidget;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f160054d.f160037b, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$d */
    public static final class C56128d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160055d;

        /* renamed from: e */
        public final /* synthetic */ Context f160056e;

        public C56128d(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, Context context) {
            this.f160055d = finderLiveAnchorGameTogetherWidget;
            this.f160056e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
            r0 = r0.f186013e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
                r17 = this;
                r6 = r17
                java.lang.Class<cl1.o> r7 = cl1.C54991o.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r0 = r6.f160055d
                te3.vy0 r0 = r0.f160045j
                r1 = 0
                if (r0 == 0) goto L_0x0030
                te3.ih4 r0 = r0.f186013e
                if (r0 == 0) goto L_0x0030
                java.lang.String r0 = r0.f183695d
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                r2 = 0
                if (r0 == 0) goto L_0x003d
                int r0 = r0.length()
                if (r0 != 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r0 = 0
                goto L_0x003e
            L_0x003d:
                r0 = 1
            L_0x003e:
                if (r0 != 0) goto L_0x0063
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r3 = r6.f160055d
                te3.vy0 r3 = r3.f160045j
                if (r3 == 0) goto L_0x0052
                te3.ih4 r3 = r3.f186013e
                if (r3 == 0) goto L_0x0052
                java.lang.String r3 = r3.f183695d
                goto L_0x0053
            L_0x0052:
                r3 = r1
            L_0x0053:
                java.lang.String r4 = "rawUrl"
                r0.putExtra(r4, r3)
                android.content.Context r3 = r6.f160056e
                java.lang.String r4 = "webview"
                java.lang.String r5 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r3, r4, r5, r0, r1)
                goto L_0x009a
            L_0x0063:
                di0.o r11 = new di0.o
                r11.<init>()
                wi0.z r0 = wi0.C91003z.POPUP
                r11.f250923L = r0
                r11.f250924M = r0
                java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
                gy3.C87412m.m108593f(r0, r3)
                r8 = r0
                tf0.p1 r8 = (tf0.C64916p1) r8
                android.content.Context r9 = r6.f160056e
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r0 = r6.f160055d
                te3.vy0 r0 = r0.f160045j
                if (r0 == 0) goto L_0x008c
                te3.ih4 r0 = r0.f186013e
                if (r0 == 0) goto L_0x008c
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f183697f
                if (r0 != 0) goto L_0x0091
            L_0x008c:
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
                r0.<init>()
            L_0x0091:
                r10 = r0
                r12 = 0
                r13 = 0
                r14 = 24
                r15 = 0
                tf0.C64916p1.C64917a.m76438e(r8, r9, r10, r11, r12, r13, r14, r15)
            L_0x009a:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r0 = r6.f160055d
                boolean r0 = r0.mo78218c()
                java.lang.String r3 = "game_type"
                java.lang.String r4 = "appid"
                r5 = 3
                java.lang.String r8 = "result"
                if (r0 != 0) goto L_0x00dd
                bl3.r r0 = bl3.C39818r.f106831a
                android.content.Context r7 = r6.f160056e
                bl3.r$a r0 = r0.mo62443b(r7)
                java.lang.Class<xk1.w> r7 = xk1.C66355w.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
                xk1.w r0 = (xk1.C66355w) r0
                te3.kr1 r0 = r0.f191042x
                er1.u0 r7 = er1.C58777u0.f168283a
                r9 = 22
                c30.g r10 = new c30.g
                r10.<init>()
                r10.mo145953n(r8, r5)
                if (r0 == 0) goto L_0x00cb
                java.lang.String r1 = r0.f137001d
            L_0x00cb:
                r10.put(r4, r1)
                if (r0 == 0) goto L_0x00d2
                int r2 = r0.f137014t
            L_0x00d2:
                int r0 = 2 - r2
                r10.mo145953n(r3, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                r7.mo83834c(r9, r10)
                goto L_0x0132
            L_0x00dd:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r0 = r6.f160055d
                qj1.c r0 = r0.f160038c
                fj1.b r0 = r0.mo87684A0()
                androidx.lifecycle.i0 r0 = r0.mo71262a(r7)
                cl1.o r0 = (cl1.C54991o) r0
                te3.uy0 r0 = r0.f154363s1
                java.lang.Class<ak1.o> r9 = ak1.C54108o.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                java.lang.String r10 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r9, r10)
                r11 = r9
                ht1.j5 r11 = (ht1.C8777j5) r11
                ak1.g0 r12 = ak1.C0073g0.ANCHOR_GAME_TOGETHER
                c30.g r9 = new c30.g
                r9.<init>()
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r10 = r6.f160055d
                r9.mo145953n(r8, r5)
                if (r0 == 0) goto L_0x010b
                java.lang.String r1 = r0.f143182f
            L_0x010b:
                r9.put(r4, r1)
                ok1.e r0 = ok1.C62042e.f176370a
                qj1.c r1 = r10.f160038c
                androidx.lifecycle.i0 r1 = r1.mo87696x0(r7)
                cl1.o r1 = (cl1.C54991o) r1
                te3.dt1 r1 = r1.f154298b4
                if (r1 == 0) goto L_0x011e
                int r2 = r1.f132523f
            L_0x011e:
                int r0 = r0.mo87052W1(r2)
                r9.mo145953n(r3, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r13 = r9.toString()
                r14 = 0
                r15 = 4
                r16 = 0
                ht1.C8777j5.C8778a.m8605f(r11, r12, r13, r14, r15, r16)
            L_0x0132:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget.C56128d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$e */
    public static final class C56129e implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160057d;

        /* renamed from: e */
        public final /* synthetic */ Context f160058e;

        public C56129e(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, Context context) {
            this.f160057d = finderLiveAnchorGameTogetherWidget;
            this.f160058e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0064, code lost:
            r10 = r5.f137012r;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r19, android.view.View r20, int r21, androidx.recyclerview.widget.RecyclerView.C16631z r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r22
                jq3.o r1 = (jq3.C60905o) r1
                java.lang.Class<xk1.w> r2 = xk1.C66355w.class
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                java.lang.String r4 = "adapter"
                r5 = r19
                gy3.C87412m.m108594g(r5, r4)
                java.lang.String r4 = "view"
                r5 = r20
                gy3.C87412m.m108594g(r5, r4)
                java.lang.String r4 = "holder"
                gy3.C87412m.m108594g(r1, r4)
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160057d
                java.util.ArrayList<sk1.g> r1 = r1.f160044i
                r4 = r21
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r4 = "dataList[position]"
                gy3.C87412m.m108593f(r1, r4)
                sk1.g r1 = (sk1.C63953g) r1
                int r1 = r1.f181279d
                r4 = 2
                if (r1 != r4) goto L_0x0195
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160057d
                d60.b r5 = r1.f160037b
                d60.b$b r6 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_HIDE_HALF
                r7 = 0
                d60.C58124b.C7172a.m7372a(r5, r6, r7, r4, r7)
                boolean r5 = r1.mo78218c()
                java.lang.String r6 = "root.context.getString(R…ive_team_condition_title)"
                r8 = 2131826740(0x7f111834, float:1.9286373E38)
                java.lang.String r9 = "root.context"
                if (r5 != 0) goto L_0x009b
                bl3.r r5 = bl3.C39818r.f106831a
                android.view.ViewGroup r10 = r1.f160036a
                android.content.Context r10 = r10.getContext()
                gy3.C87412m.m108593f(r10, r9)
                bl3.r$a r5 = r5.mo62443b(r10)
                androidx.lifecycle.i0 r5 = r5.mo75002a(r2)
                xk1.w r5 = (xk1.C66355w) r5
                te3.kr1 r5 = r5.f191042x
                if (r5 == 0) goto L_0x006b
                te3.bs1 r10 = r5.f137012r
                if (r10 == 0) goto L_0x006b
                java.util.LinkedList<te3.uk2> r10 = r10.f131284d
                goto L_0x006c
            L_0x006b:
                r10 = r7
            L_0x006c:
                com.tencent.mm.plugin.finder.view.k6 r11 = new com.tencent.mm.plugin.finder.view.k6
                il1.c0 r12 = new il1.c0
                r12.<init>(r1, r5)
                r11.<init>(r12)
                if (r10 == 0) goto L_0x008e
                android.view.ViewGroup r12 = r1.f160036a
                android.content.Context r12 = r12.getContext()
                java.lang.String r8 = r12.getString(r8)
                gy3.C87412m.m108593f(r8, r6)
                int r5 = r5.f137013s
                int r5 = r1.mo78217b(r5, r10)
                r11.mo5089d(r8, r10, r5)
            L_0x008e:
                android.view.ViewGroup r1 = r1.f160036a
                android.content.Context r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r9)
                r11.mo5091f(r1)
                goto L_0x00e1
            L_0x009b:
                qj1.c r5 = r1.f160038c
                fj1.b r5 = r5.mo87684A0()
                androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
                cl1.o r5 = (cl1.C54991o) r5
                te3.uy0 r5 = r5.f154363s1
                if (r5 == 0) goto L_0x00b2
                te3.bs1 r10 = r5.f143180d
                if (r10 == 0) goto L_0x00b2
                java.util.LinkedList<te3.uk2> r10 = r10.f131284d
                goto L_0x00b3
            L_0x00b2:
                r10 = r7
            L_0x00b3:
                com.tencent.mm.plugin.finder.view.k6 r11 = new com.tencent.mm.plugin.finder.view.k6
                il1.e0 r12 = new il1.e0
                r12.<init>(r1, r5)
                r11.<init>(r12)
                if (r10 == 0) goto L_0x00d5
                android.view.ViewGroup r12 = r1.f160036a
                android.content.Context r12 = r12.getContext()
                java.lang.String r8 = r12.getString(r8)
                gy3.C87412m.m108593f(r8, r6)
                int r5 = r5.f143181e
                int r5 = r1.mo78217b(r5, r10)
                r11.mo5089d(r8, r10, r5)
            L_0x00d5:
                android.view.ViewGroup r1 = r1.f160036a
                android.content.Context r1 = r1.getContext()
                gy3.C87412m.m108593f(r1, r9)
                r11.mo5091f(r1)
            L_0x00e1:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160057d
                boolean r1 = r1.mo78218c()
                java.lang.String r5 = "team_type"
                r6 = 0
                java.lang.String r8 = "game_type"
                java.lang.String r9 = "appid"
                r10 = 6
                java.lang.String r11 = "result"
                if (r1 != 0) goto L_0x0132
                bl3.r r1 = bl3.C39818r.f106831a
                android.content.Context r3 = r0.f160058e
                bl3.r$a r1 = r1.mo62443b(r3)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                xk1.w r1 = (xk1.C66355w) r1
                te3.kr1 r1 = r1.f191042x
                er1.u0 r2 = er1.C58777u0.f168283a
                r3 = 22
                c30.g r12 = new c30.g
                r12.<init>()
                r12.mo145953n(r11, r10)
                if (r1 == 0) goto L_0x0115
                java.lang.String r10 = r1.f137001d
                goto L_0x0116
            L_0x0115:
                r10 = r7
            L_0x0116:
                r12.put(r9, r10)
                if (r1 == 0) goto L_0x011d
                int r6 = r1.f137014t
            L_0x011d:
                int r4 = r4 - r6
                r12.mo145953n(r8, r4)
                if (r1 == 0) goto L_0x0129
                int r1 = r1.f137013s
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            L_0x0129:
                r12.put(r5, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r2.mo83834c(r3, r12)
                goto L_0x0195
            L_0x0132:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160057d
                qj1.c r1 = r1.f160038c
                fj1.b r1 = r1.mo87684A0()
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                te3.uy0 r1 = r1.f154363s1
                java.lang.Class<ak1.o> r2 = ak1.C54108o.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                java.lang.String r4 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r2, r4)
                r12 = r2
                ht1.j5 r12 = (ht1.C8777j5) r12
                ak1.g0 r13 = ak1.C0073g0.ANCHOR_GAME_TOGETHER
                c30.g r2 = new c30.g
                r2.<init>()
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r4 = r0.f160057d
                r2.mo145953n(r11, r10)
                if (r1 == 0) goto L_0x0161
                java.lang.String r10 = r1.f143182f
                goto L_0x0162
            L_0x0161:
                r10 = r7
            L_0x0162:
                r2.put(r9, r10)
                ok1.e r9 = ok1.C62042e.f176370a
                qj1.c r4 = r4.f160038c
                androidx.lifecycle.i0 r3 = r4.mo87696x0(r3)
                cl1.o r3 = (cl1.C54991o) r3
                te3.dt1 r3 = r3.f154298b4
                if (r3 == 0) goto L_0x0175
                int r6 = r3.f132523f
            L_0x0175:
                int r3 = r9.mo87052W1(r6)
                r2.mo145953n(r8, r3)
                if (r1 == 0) goto L_0x0184
                int r1 = r1.f143181e
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            L_0x0184:
                r2.put(r5, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r14 = r2.toString()
                r15 = 0
                r16 = 4
                r17 = 0
                ht1.C8777j5.C8778a.m8605f(r12, r13, r14, r15, r16, r17)
            L_0x0195:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget.C56129e.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$f */
    public static final class C56130f<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160059a;

        /* renamed from: b */
        public final /* synthetic */ boolean f160060b;

        public C56130f(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, boolean z) {
            this.f160059a = finderLiveAnchorGameTogetherWidget;
            this.f160060b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:243:0x039b, code lost:
            if (((r7 == null || (r7 = r7.f131284d) == null) ? 0 : r7.size()) > 0) goto L_0x03e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            r1 = r1.f140527i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x016c, code lost:
            if (((r7 == null || (r7 = r7.f131284d) == null) ? 0 : r7.size()) > 0) goto L_0x01be;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                int r2 = r1.f256793a
                if (r2 != 0) goto L_0x0453
                int r2 = r1.f256794b
                if (r2 != 0) goto L_0x0453
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r2 = r0.f160059a
                T r1 = r1.f256796d
                te3.m11 r1 = (te3.C50336m11) r1
                java.util.LinkedList<te3.qs1> r1 = r1.f137744d
                java.lang.String r3 = "cgiBack.resp.game_user_info_list"
                gy3.C87412m.m108593f(r1, r3)
                java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
                te3.qs1 r1 = (te3.C51006qs1) r1
                r3 = 0
                if (r1 == 0) goto L_0x002b
                te3.ct1 r1 = r1.f140527i
                if (r1 == 0) goto L_0x002b
                te3.vy0 r1 = r1.f131953u
                goto L_0x002c
            L_0x002b:
                r1 = r3
            L_0x002c:
                r2.f160045j = r1
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160059a
                qj1.c r1 = r1.f160038c
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
                cl1.o r1 = (cl1.C54991o) r1
                androidx.lifecycle.z<java.lang.String> r1 = r1.f154302c4
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r2 = 1
                r4 = 0
                if (r1 == 0) goto L_0x004f
                int r5 = r1.length()
                if (r5 != 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r5 = 0
                goto L_0x0050
            L_0x004f:
                r5 = 1
            L_0x0050:
                if (r5 != 0) goto L_0x009a
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r5 = r0.f160059a
                te3.vy0 r5 = r5.f160045j
                if (r5 == 0) goto L_0x005b
                te3.uy0 r6 = r5.f186014f
                goto L_0x005c
            L_0x005b:
                r6 = r3
            L_0x005c:
                if (r6 != 0) goto L_0x005f
                goto L_0x009a
            L_0x005f:
                if (r5 == 0) goto L_0x0093
                te3.uy0 r5 = r5.f186014f
                if (r5 == 0) goto L_0x0093
                te3.bs1 r5 = r5.f143180d
                if (r5 == 0) goto L_0x0093
                java.util.LinkedList<te3.uk2> r5 = r5.f131284d
                if (r5 == 0) goto L_0x0093
                java.util.Iterator r5 = r5.iterator()
            L_0x0071:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x0087
                java.lang.Object r7 = r5.next()
                r8 = r7
                te3.uk2 r8 = (te3.C51560uk2) r8
                java.lang.String r8 = r8.f142913d
                boolean r8 = gy3.C87412m.m108589b(r8, r1)
                if (r8 == 0) goto L_0x0071
                goto L_0x0088
            L_0x0087:
                r7 = r3
            L_0x0088:
                te3.uk2 r7 = (te3.C51560uk2) r7
                if (r7 == 0) goto L_0x0093
                int r1 = r7.f142914e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0094
            L_0x0093:
                r1 = r3
            L_0x0094:
                int r1 = r1.intValue()
                r6.f143181e = r1
            L_0x009a:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r1 = r0.f160059a
                boolean r5 = r0.f160060b
                java.lang.String r6 = r1.f160039d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "refreshGameWidget isResume: "
                r7.append(r8)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                java.lang.String r6 = "wording: "
                java.lang.String r7 = " teamInfo is null : "
                java.lang.String r8 = "gameDynamicCardFrameSetRoot"
                java.lang.String r9 = ", size: "
                java.lang.String r10 = "before gameInfo is null: "
                r11 = 10
                java.lang.String r12 = "playTogeInfo is null"
                if (r5 == 0) goto L_0x02e2
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x02cc
                r1.mo78219d()
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x0111
                te3.gs1 r5 = r5.f186012d
                if (r5 == 0) goto L_0x0111
                java.util.LinkedList<te3.fs1> r5 = r5.f183356d
                if (r5 == 0) goto L_0x0111
                java.util.ArrayList r12 = new java.util.ArrayList
                int r11 = sx3.C36907w.m41090l(r5, r11)
                r12.<init>(r11)
                java.util.Iterator r5 = r5.iterator()
            L_0x00e5:
                boolean r11 = r5.hasNext()
                if (r11 == 0) goto L_0x0112
                java.lang.Object r11 = r5.next()
                r15 = r11
                te3.fs1 r15 = (te3.C64374fs1) r15
                sk1.g r11 = new sk1.g
                r14 = 1
                i70.c<?, ?>$a r13 = r1.f160050o
                if (r13 == 0) goto L_0x010d
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 56
                r21 = 0
                r16 = r13
                r13 = r11
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r12.add(r11)
                goto L_0x00e5
            L_0x010d:
                gy3.C87412m.m108603p(r8)
                throw r3
            L_0x0111:
                r12 = r3
            L_0x0112:
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x0119
                te3.uy0 r5 = r5.f186014f
                goto L_0x011a
            L_0x0119:
                r5 = r3
            L_0x011a:
                java.lang.String r8 = r1.f160039d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                if (r12 != 0) goto L_0x0128
                r10 = 1
                goto L_0x0129
            L_0x0128:
                r10 = 0
            L_0x0129:
                r11.append(r10)
                r11.append(r9)
                if (r12 == 0) goto L_0x0136
                int r9 = r12.size()
                goto L_0x0137
            L_0x0136:
                r9 = 0
            L_0x0137:
                r11.append(r9)
                r11.append(r7)
                if (r5 != 0) goto L_0x0141
                r7 = 1
                goto L_0x0142
            L_0x0141:
                r7 = 0
            L_0x0142:
                r11.append(r7)
                java.lang.String r7 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
                if (r12 == 0) goto L_0x0153
                int r7 = r12.size()
                goto L_0x0154
            L_0x0153:
                r7 = 0
            L_0x0154:
                if (r7 > 0) goto L_0x01be
                if (r5 == 0) goto L_0x015b
                te3.bs1 r7 = r5.f143180d
                goto L_0x015c
            L_0x015b:
                r7 = r3
            L_0x015c:
                if (r7 == 0) goto L_0x016f
                te3.bs1 r7 = r5.f143180d
                if (r7 == 0) goto L_0x016b
                java.util.LinkedList<te3.uk2> r7 = r7.f131284d
                if (r7 == 0) goto L_0x016b
                int r7 = r7.size()
                goto L_0x016c
            L_0x016b:
                r7 = 0
            L_0x016c:
                if (r7 <= 0) goto L_0x016f
                goto L_0x01be
            L_0x016f:
                java.lang.String r5 = r1.f160039d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                te3.vy0 r6 = r1.f160045j
                if (r6 == 0) goto L_0x0180
                java.lang.String r6 = r6.f186015g
                goto L_0x0181
            L_0x0180:
                r6 = r3
            L_0x0181:
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x0192
                java.lang.String r5 = r5.f186015g
                goto L_0x0193
            L_0x0192:
                r5 = r3
            L_0x0193:
                if (r5 == 0) goto L_0x019d
                int r5 = r5.length()
                if (r5 != 0) goto L_0x019c
                goto L_0x019d
            L_0x019c:
                r2 = 0
            L_0x019d:
                if (r2 != 0) goto L_0x01ad
                android.widget.TextView r2 = r1.f160041f
                if (r2 != 0) goto L_0x01a4
                goto L_0x01ad
            L_0x01a4:
                te3.vy0 r4 = r1.f160045j
                if (r4 == 0) goto L_0x01aa
                java.lang.String r3 = r4.f186015g
            L_0x01aa:
                r2.setText(r3)
            L_0x01ad:
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                r2.clear()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r1.f160043h
                if (r2 == 0) goto L_0x01b9
                r2.notifyDataSetChanged()
            L_0x01b9:
                r1.mo78220e()
                goto L_0x0453
            L_0x01be:
                java.util.ArrayList<sk1.g> r6 = r1.f160044i
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x01c9:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x01e3
                java.lang.Object r8 = r6.next()
                r9 = r8
                sk1.g r9 = (sk1.C63953g) r9
                int r9 = r9.f181279d
                if (r9 != r2) goto L_0x01dc
                r9 = 1
                goto L_0x01dd
            L_0x01dc:
                r9 = 0
            L_0x01dd:
                if (r9 == 0) goto L_0x01c9
                r7.add(r8)
                goto L_0x01c9
            L_0x01e3:
                int r2 = r7.size()
                if (r12 == 0) goto L_0x01ee
                int r6 = r12.size()
                goto L_0x01ef
            L_0x01ee:
                r6 = 0
            L_0x01ef:
                java.lang.String r7 = "checkDataChange"
                if (r6 <= r2) goto L_0x0212
                java.util.ArrayList<sk1.g> r8 = r1.f160044i
                r8.clear()
                if (r12 == 0) goto L_0x01ff
                java.util.ArrayList<sk1.g> r8 = r1.f160044i
                r8.addAll(r12)
            L_0x01ff:
                if (r2 <= 0) goto L_0x0208
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r8 = r1.f160043h
                if (r8 == 0) goto L_0x0208
                r8.notifyItemRangeChanged(r4, r2, r7)
            L_0x0208:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r7 = r1.f160043h
                if (r7 == 0) goto L_0x0260
                int r8 = r6 - r2
                r7.notifyItemRangeInserted(r2, r8)
                goto L_0x0260
            L_0x0212:
                if (r6 >= r2) goto L_0x0233
                java.util.ArrayList<sk1.g> r8 = r1.f160044i
                r8.clear()
                if (r12 == 0) goto L_0x0220
                java.util.ArrayList<sk1.g> r8 = r1.f160044i
                r8.addAll(r12)
            L_0x0220:
                if (r6 <= 0) goto L_0x0229
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r8 = r1.f160043h
                if (r8 == 0) goto L_0x0229
                r8.notifyItemRangeChanged(r4, r6, r7)
            L_0x0229:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r7 = r1.f160043h
                if (r7 == 0) goto L_0x0260
                int r8 = r2 - r6
                r7.notifyItemRangeRemoved(r6, r8)
                goto L_0x0260
            L_0x0233:
                if (r12 == 0) goto L_0x0257
                java.util.Iterator r8 = r12.iterator()
                r9 = 0
            L_0x023a:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0257
                java.lang.Object r10 = r8.next()
                int r11 = r9 + 1
                if (r9 < 0) goto L_0x0253
                sk1.g r10 = (sk1.C63953g) r10
                if (r9 >= r6) goto L_0x0251
                java.util.ArrayList<sk1.g> r12 = r1.f160044i
                r12.set(r9, r10)
            L_0x0251:
                r9 = r11
                goto L_0x023a
            L_0x0253:
                sx3.C64197v.m75542k()
                throw r3
            L_0x0257:
                if (r2 <= 0) goto L_0x0260
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r8 = r1.f160043h
                if (r8 == 0) goto L_0x0260
                r8.notifyItemRangeChanged(r4, r2, r7)
            L_0x0260:
                if (r5 == 0) goto L_0x0265
                te3.bs1 r7 = r5.f143180d
                goto L_0x0266
            L_0x0265:
                r7 = r3
            L_0x0266:
                if (r7 == 0) goto L_0x029e
                te3.bs1 r7 = r5.f143180d
                if (r7 == 0) goto L_0x0274
                java.util.LinkedList<te3.uk2> r7 = r7.f131284d
                if (r7 == 0) goto L_0x0274
                int r4 = r7.size()
            L_0x0274:
                if (r4 <= 0) goto L_0x029e
                if (r2 == r6) goto L_0x029e
                java.util.ArrayList<sk1.g> r4 = r1.f160044i
                sk1.g r7 = new sk1.g
                r14 = 2
                r15 = 0
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 54
                r21 = 0
                r13 = r7
                r17 = r5
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r4.add(r7)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r4 = r1.f160043h
                if (r4 == 0) goto L_0x029e
                java.util.ArrayList<sk1.g> r5 = r1.f160044i
                int r5 = r5.size()
                r4.notifyItemInserted(r5)
            L_0x029e:
                if (r2 == r6) goto L_0x02c7
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                sk1.g r13 = new sk1.g
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                te3.vy0 r4 = r1.f160045j
                if (r4 == 0) goto L_0x02af
                java.lang.String r3 = r4.f186015g
            L_0x02af:
                r10 = r3
                r11 = 30
                r12 = 0
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r2.add(r13)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r1.f160043h
                if (r2 == 0) goto L_0x02c7
                java.util.ArrayList<sk1.g> r3 = r1.f160044i
                int r3 = r3.size()
                r2.notifyItemInserted(r3)
            L_0x02c7:
                r1.mo78221f()
                goto L_0x0453
            L_0x02cc:
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                r2.clear()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r1.f160043h
                if (r2 == 0) goto L_0x02d8
                r2.notifyDataSetChanged()
            L_0x02d8:
                java.lang.String r2 = r1.f160039d
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
                r1.mo78220e()
                goto L_0x0453
            L_0x02e2:
                java.util.ArrayList<sk1.g> r5 = r1.f160044i
                int r5 = r5.size()
                java.util.ArrayList<sk1.g> r13 = r1.f160044i
                r13.clear()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r13 = r1.f160043h
                if (r13 == 0) goto L_0x02f4
                r13.notifyItemRangeRemoved(r4, r5)
            L_0x02f4:
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x044b
                r1.mo78219d()
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x0340
                te3.gs1 r5 = r5.f186012d
                if (r5 == 0) goto L_0x0340
                java.util.LinkedList<te3.fs1> r5 = r5.f183356d
                if (r5 == 0) goto L_0x0340
                java.util.ArrayList r12 = new java.util.ArrayList
                int r11 = sx3.C36907w.m41090l(r5, r11)
                r12.<init>(r11)
                java.util.Iterator r5 = r5.iterator()
            L_0x0314:
                boolean r11 = r5.hasNext()
                if (r11 == 0) goto L_0x0341
                java.lang.Object r11 = r5.next()
                r15 = r11
                te3.fs1 r15 = (te3.C64374fs1) r15
                sk1.g r11 = new sk1.g
                r14 = 1
                i70.c<?, ?>$a r13 = r1.f160050o
                if (r13 == 0) goto L_0x033c
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 56
                r21 = 0
                r16 = r13
                r13 = r11
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r12.add(r11)
                goto L_0x0314
            L_0x033c:
                gy3.C87412m.m108603p(r8)
                throw r3
            L_0x0340:
                r12 = r3
            L_0x0341:
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x0348
                te3.uy0 r5 = r5.f186014f
                goto L_0x0349
            L_0x0348:
                r5 = r3
            L_0x0349:
                java.lang.String r8 = r1.f160039d
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                if (r12 != 0) goto L_0x0357
                r10 = 1
                goto L_0x0358
            L_0x0357:
                r10 = 0
            L_0x0358:
                r11.append(r10)
                r11.append(r9)
                if (r12 == 0) goto L_0x0365
                int r9 = r12.size()
                goto L_0x0366
            L_0x0365:
                r9 = 0
            L_0x0366:
                r11.append(r9)
                r11.append(r7)
                if (r5 != 0) goto L_0x0370
                r7 = 1
                goto L_0x0371
            L_0x0370:
                r7 = 0
            L_0x0371:
                r11.append(r7)
                java.lang.String r7 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
                if (r12 == 0) goto L_0x0382
                int r7 = r12.size()
                goto L_0x0383
            L_0x0382:
                r7 = 0
            L_0x0383:
                if (r7 > 0) goto L_0x03e1
                if (r5 == 0) goto L_0x038a
                te3.bs1 r7 = r5.f143180d
                goto L_0x038b
            L_0x038a:
                r7 = r3
            L_0x038b:
                if (r7 == 0) goto L_0x039e
                te3.bs1 r7 = r5.f143180d
                if (r7 == 0) goto L_0x039a
                java.util.LinkedList<te3.uk2> r7 = r7.f131284d
                if (r7 == 0) goto L_0x039a
                int r7 = r7.size()
                goto L_0x039b
            L_0x039a:
                r7 = 0
            L_0x039b:
                if (r7 <= 0) goto L_0x039e
                goto L_0x03e1
            L_0x039e:
                java.lang.String r5 = r1.f160039d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                te3.vy0 r6 = r1.f160045j
                if (r6 == 0) goto L_0x03af
                java.lang.String r6 = r6.f186015g
                goto L_0x03b0
            L_0x03af:
                r6 = r3
            L_0x03b0:
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                te3.vy0 r5 = r1.f160045j
                if (r5 == 0) goto L_0x03c1
                java.lang.String r5 = r5.f186015g
                goto L_0x03c2
            L_0x03c1:
                r5 = r3
            L_0x03c2:
                if (r5 == 0) goto L_0x03cc
                int r5 = r5.length()
                if (r5 != 0) goto L_0x03cb
                goto L_0x03cc
            L_0x03cb:
                r2 = 0
            L_0x03cc:
                if (r2 != 0) goto L_0x03dc
                android.widget.TextView r2 = r1.f160041f
                if (r2 != 0) goto L_0x03d3
                goto L_0x03dc
            L_0x03d3:
                te3.vy0 r4 = r1.f160045j
                if (r4 == 0) goto L_0x03d9
                java.lang.String r3 = r4.f186015g
            L_0x03d9:
                r2.setText(r3)
            L_0x03dc:
                r1.mo78220e()
                goto L_0x0453
            L_0x03e1:
                if (r12 == 0) goto L_0x03e8
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                r2.addAll(r12)
            L_0x03e8:
                if (r5 == 0) goto L_0x03ed
                te3.bs1 r2 = r5.f143180d
                goto L_0x03ee
            L_0x03ed:
                r2 = r3
            L_0x03ee:
                if (r2 == 0) goto L_0x0419
                te3.bs1 r2 = r5.f143180d
                if (r2 == 0) goto L_0x03fd
                java.util.LinkedList<te3.uk2> r2 = r2.f131284d
                if (r2 == 0) goto L_0x03fd
                int r2 = r2.size()
                goto L_0x03fe
            L_0x03fd:
                r2 = 0
            L_0x03fe:
                if (r2 <= 0) goto L_0x0419
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                sk1.g r6 = new sk1.g
                r14 = 2
                r15 = 0
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 54
                r21 = 0
                r13 = r6
                r17 = r5
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r2.add(r6)
            L_0x0419:
                java.util.ArrayList<sk1.g> r2 = r1.f160044i
                sk1.g r5 = new sk1.g
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                te3.vy0 r6 = r1.f160045j
                if (r6 == 0) goto L_0x042b
                java.lang.String r3 = r6.f186015g
            L_0x042b:
                r19 = r3
                r20 = 30
                r21 = 0
                r13 = r5
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r2.add(r5)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r1.f160043h
                if (r2 == 0) goto L_0x043f
                r2.notifyDataSetChanged()
            L_0x043f:
                if (r12 == 0) goto L_0x0445
                int r4 = r12.size()
            L_0x0445:
                if (r4 != 0) goto L_0x0453
                r1.mo78221f()
                goto L_0x0453
            L_0x044b:
                java.lang.String r2 = r1.f160039d
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
                r1.mo78220e()
            L_0x0453:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget.C56130f.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget$g */
    public static final class C56131g<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f160061a;

        /* renamed from: b */
        public final /* synthetic */ boolean f160062b;

        public C56131g(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, boolean z) {
            this.f160061a = finderLiveAnchorGameTogetherWidget;
            this.f160062b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:194:0x031b, code lost:
            if (r1.f143181e != 0) goto L_0x0327;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00eb, code lost:
            if (r1.f143181e != 0) goto L_0x00f7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                int r2 = r1.f256793a
                if (r2 != 0) goto L_0x03dd
                int r2 = r1.f256794b
                if (r2 != 0) goto L_0x03dd
                com.tencent.mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget r2 = r0.f160061a
                T r1 = r1.f256796d
                te3.c01 r1 = (te3.C48933c01) r1
                te3.vy0 r1 = r1.f131420e
                r2.f160045j = r1
                boolean r1 = r0.f160062b
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                java.lang.String r4 = r2.f160039d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "refreshLivingWidget isResume: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.lang.String r4 = "playTogeInfo is null"
                java.lang.String r5 = "wording: "
                java.lang.String r6 = "gameDynamicCardFrameSetRoot"
                java.lang.String r7 = " teamInfo is null : "
                java.lang.String r8 = ", size: "
                r9 = 10
                java.lang.String r10 = "living gameInfo is null: "
                r11 = 0
                r12 = 1
                r13 = 0
                if (r1 == 0) goto L_0x0262
                qj1.c r1 = r2.f160038c
                fj1.b r1 = r1.mo87684A0()
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                te3.uy0 r1 = r1.f154363s1
                te3.vy0 r3 = r2.f160045j
                if (r3 == 0) goto L_0x009b
                te3.gs1 r3 = r3.f186012d
                if (r3 == 0) goto L_0x009b
                java.util.LinkedList<te3.fs1> r3 = r3.f183356d
                if (r3 == 0) goto L_0x009b
                java.util.ArrayList r14 = new java.util.ArrayList
                int r9 = sx3.C36907w.m41090l(r3, r9)
                r14.<init>(r9)
                java.util.Iterator r3 = r3.iterator()
            L_0x006d:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x009c
                java.lang.Object r9 = r3.next()
                r17 = r9
                te3.fs1 r17 = (te3.C64374fs1) r17
                sk1.g r9 = new sk1.g
                r16 = 1
                i70.c<?, ?>$a r15 = r2.f160050o
                if (r15 == 0) goto L_0x0097
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 56
                r23 = 0
                r18 = r15
                r15 = r9
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
                r14.add(r9)
                goto L_0x006d
            L_0x0097:
                gy3.C87412m.m108603p(r6)
                throw r11
            L_0x009b:
                r14 = r11
            L_0x009c:
                r2.mo78219d()
                java.lang.String r3 = r2.f160039d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r10)
                if (r14 != 0) goto L_0x00ad
                r9 = 1
                goto L_0x00ae
            L_0x00ad:
                r9 = 0
            L_0x00ae:
                r6.append(r9)
                r6.append(r8)
                if (r14 == 0) goto L_0x00bb
                int r8 = r14.size()
                goto L_0x00bc
            L_0x00bb:
                r8 = 0
            L_0x00bc:
                r6.append(r8)
                r6.append(r7)
                if (r1 != 0) goto L_0x00c6
                r7 = 1
                goto L_0x00c7
            L_0x00c6:
                r7 = 0
            L_0x00c7:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                if (r1 == 0) goto L_0x00d6
                te3.bs1 r3 = r1.f143180d
                goto L_0x00d7
            L_0x00d6:
                r3 = r11
            L_0x00d7:
                if (r3 == 0) goto L_0x00ed
                te3.bs1 r3 = r1.f143180d
                if (r3 == 0) goto L_0x00e6
                java.util.LinkedList<te3.uk2> r3 = r3.f131284d
                if (r3 == 0) goto L_0x00e6
                int r3 = r3.size()
                goto L_0x00e7
            L_0x00e6:
                r3 = 0
            L_0x00e7:
                if (r3 <= 0) goto L_0x00ed
                int r3 = r1.f143181e
                if (r3 != 0) goto L_0x00f7
            L_0x00ed:
                if (r14 == 0) goto L_0x00f4
                int r3 = r14.size()
                goto L_0x00f5
            L_0x00f4:
                r3 = 0
            L_0x00f5:
                if (r3 <= 0) goto L_0x020e
            L_0x00f7:
                java.util.ArrayList<sk1.g> r3 = r2.f160044i
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x0102:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x011c
                java.lang.Object r5 = r3.next()
                r6 = r5
                sk1.g r6 = (sk1.C63953g) r6
                int r6 = r6.f181279d
                if (r6 != r12) goto L_0x0115
                r6 = 1
                goto L_0x0116
            L_0x0115:
                r6 = 0
            L_0x0116:
                if (r6 == 0) goto L_0x0102
                r4.add(r5)
                goto L_0x0102
            L_0x011c:
                int r3 = r4.size()
                if (r14 == 0) goto L_0x0127
                int r4 = r14.size()
                goto L_0x0128
            L_0x0127:
                r4 = 0
            L_0x0128:
                java.lang.String r5 = "checkDataChange"
                if (r4 <= r3) goto L_0x014b
                java.util.ArrayList<sk1.g> r6 = r2.f160044i
                r6.clear()
                if (r14 == 0) goto L_0x0138
                java.util.ArrayList<sk1.g> r6 = r2.f160044i
                r6.addAll(r14)
            L_0x0138:
                if (r3 <= 0) goto L_0x0141
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r6 = r2.f160043h
                if (r6 == 0) goto L_0x0141
                r6.notifyItemRangeChanged(r13, r3, r5)
            L_0x0141:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r5 = r2.f160043h
                if (r5 == 0) goto L_0x0199
                int r6 = r4 - r3
                r5.notifyItemRangeInserted(r3, r6)
                goto L_0x0199
            L_0x014b:
                if (r4 >= r3) goto L_0x016c
                java.util.ArrayList<sk1.g> r6 = r2.f160044i
                r6.clear()
                if (r14 == 0) goto L_0x0159
                java.util.ArrayList<sk1.g> r6 = r2.f160044i
                r6.addAll(r14)
            L_0x0159:
                if (r4 <= 0) goto L_0x0162
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r6 = r2.f160043h
                if (r6 == 0) goto L_0x0162
                r6.notifyItemRangeChanged(r13, r4, r5)
            L_0x0162:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r5 = r2.f160043h
                if (r5 == 0) goto L_0x0199
                int r6 = r3 - r4
                r5.notifyItemRangeRemoved(r4, r6)
                goto L_0x0199
            L_0x016c:
                if (r14 == 0) goto L_0x0190
                java.util.Iterator r6 = r14.iterator()
                r7 = 0
            L_0x0173:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x0190
                java.lang.Object r8 = r6.next()
                int r9 = r7 + 1
                if (r7 < 0) goto L_0x018c
                sk1.g r8 = (sk1.C63953g) r8
                if (r7 >= r4) goto L_0x018a
                java.util.ArrayList<sk1.g> r10 = r2.f160044i
                r10.set(r7, r8)
            L_0x018a:
                r7 = r9
                goto L_0x0173
            L_0x018c:
                sx3.C64197v.m75542k()
                throw r11
            L_0x0190:
                if (r3 <= 0) goto L_0x0199
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r6 = r2.f160043h
                if (r6 == 0) goto L_0x0199
                r6.notifyItemRangeChanged(r13, r3, r5)
            L_0x0199:
                if (r1 == 0) goto L_0x019e
                te3.bs1 r5 = r1.f143180d
                goto L_0x019f
            L_0x019e:
                r5 = r11
            L_0x019f:
                if (r5 == 0) goto L_0x01dc
                te3.bs1 r5 = r1.f143180d
                if (r5 == 0) goto L_0x01ad
                java.util.LinkedList<te3.uk2> r5 = r5.f131284d
                if (r5 == 0) goto L_0x01ad
                int r13 = r5.size()
            L_0x01ad:
                if (r13 <= 0) goto L_0x01dc
                int r5 = r1.f143181e
                if (r5 == 0) goto L_0x01dc
                if (r3 == r4) goto L_0x01dc
                java.util.ArrayList<sk1.g> r5 = r2.f160044i
                sk1.g r6 = new sk1.g
                r15 = 2
                r16 = 0
                r17 = 0
                r19 = 0
                r20 = 0
                r21 = 54
                r22 = 0
                r14 = r6
                r18 = r1
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
                r5.add(r6)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r2.f160043h
                if (r1 == 0) goto L_0x01dc
                java.util.ArrayList<sk1.g> r5 = r2.f160044i
                int r5 = r5.size()
                r1.notifyItemInserted(r5)
            L_0x01dc:
                if (r3 == r4) goto L_0x0209
                java.util.ArrayList<sk1.g> r1 = r2.f160044i
                sk1.g r3 = new sk1.g
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                te3.vy0 r4 = r2.f160045j
                if (r4 == 0) goto L_0x01ef
                java.lang.String r11 = r4.f186015g
            L_0x01ef:
                r18 = r11
                r19 = 30
                r20 = 0
                r12 = r3
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
                r1.add(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r2.f160043h
                if (r1 == 0) goto L_0x0209
                java.util.ArrayList<sk1.g> r3 = r2.f160044i
                int r3 = r3.size()
                r1.notifyItemInserted(r3)
            L_0x0209:
                r2.mo78221f()
                goto L_0x03dd
            L_0x020e:
                java.lang.String r1 = r2.f160039d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                te3.vy0 r5 = r2.f160045j
                if (r5 == 0) goto L_0x021f
                java.lang.String r5 = r5.f186015g
                goto L_0x0220
            L_0x021f:
                r5 = r11
            L_0x0220:
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                te3.vy0 r1 = r2.f160045j
                if (r1 == 0) goto L_0x0231
                java.lang.String r1 = r1.f186015g
                goto L_0x0232
            L_0x0231:
                r1 = r11
            L_0x0232:
                if (r1 == 0) goto L_0x023c
                int r1 = r1.length()
                if (r1 != 0) goto L_0x023b
                goto L_0x023c
            L_0x023b:
                r12 = 0
            L_0x023c:
                if (r12 != 0) goto L_0x024c
                android.widget.TextView r1 = r2.f160041f
                if (r1 != 0) goto L_0x0243
                goto L_0x024c
            L_0x0243:
                te3.vy0 r3 = r2.f160045j
                if (r3 == 0) goto L_0x0249
                java.lang.String r11 = r3.f186015g
            L_0x0249:
                r1.setText(r11)
            L_0x024c:
                java.util.ArrayList<sk1.g> r1 = r2.f160044i
                r1.clear()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r2.f160043h
                if (r1 == 0) goto L_0x0258
                r1.notifyDataSetChanged()
            L_0x0258:
                r2.mo78220e()
                java.lang.String r1 = r2.f160039d
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
                goto L_0x03dd
            L_0x0262:
                java.util.ArrayList<sk1.g> r1 = r2.f160044i
                int r1 = r1.size()
                java.util.ArrayList<sk1.g> r14 = r2.f160044i
                r14.clear()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r14 = r2.f160043h
                if (r14 == 0) goto L_0x0274
                r14.notifyItemRangeRemoved(r13, r1)
            L_0x0274:
                qj1.c r1 = r2.f160038c
                fj1.b r1 = r1.mo87684A0()
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                te3.uy0 r1 = r1.f154363s1
                te3.vy0 r3 = r2.f160045j
                if (r3 == 0) goto L_0x02cb
                te3.gs1 r3 = r3.f186012d
                if (r3 == 0) goto L_0x02cb
                java.util.LinkedList<te3.fs1> r3 = r3.f183356d
                if (r3 == 0) goto L_0x02cb
                java.util.ArrayList r14 = new java.util.ArrayList
                int r9 = sx3.C36907w.m41090l(r3, r9)
                r14.<init>(r9)
                java.util.Iterator r3 = r3.iterator()
            L_0x029b:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x02c9
                java.lang.Object r9 = r3.next()
                r17 = r9
                te3.fs1 r17 = (te3.C64374fs1) r17
                sk1.g r9 = new sk1.g
                r16 = 1
                i70.c<?, ?>$a r15 = r2.f160050o
                if (r15 == 0) goto L_0x02c5
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 56
                r23 = 0
                r18 = r15
                r15 = r9
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
                r14.add(r9)
                goto L_0x029b
            L_0x02c5:
                gy3.C87412m.m108603p(r6)
                throw r11
            L_0x02c9:
                r3 = r14
                goto L_0x02cc
            L_0x02cb:
                r3 = r11
            L_0x02cc:
                r2.mo78219d()
                java.lang.String r6 = r2.f160039d
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                if (r3 != 0) goto L_0x02dd
                r10 = 1
                goto L_0x02de
            L_0x02dd:
                r10 = 0
            L_0x02de:
                r9.append(r10)
                r9.append(r8)
                if (r3 == 0) goto L_0x02eb
                int r8 = r3.size()
                goto L_0x02ec
            L_0x02eb:
                r8 = 0
            L_0x02ec:
                r9.append(r8)
                r9.append(r7)
                if (r1 != 0) goto L_0x02f6
                r7 = 1
                goto L_0x02f7
            L_0x02f6:
                r7 = 0
            L_0x02f7:
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                if (r1 == 0) goto L_0x0306
                te3.bs1 r6 = r1.f143180d
                goto L_0x0307
            L_0x0306:
                r6 = r11
            L_0x0307:
                if (r6 == 0) goto L_0x031d
                te3.bs1 r6 = r1.f143180d
                if (r6 == 0) goto L_0x0316
                java.util.LinkedList<te3.uk2> r6 = r6.f131284d
                if (r6 == 0) goto L_0x0316
                int r6 = r6.size()
                goto L_0x0317
            L_0x0316:
                r6 = 0
            L_0x0317:
                if (r6 <= 0) goto L_0x031d
                int r6 = r1.f143181e
                if (r6 != 0) goto L_0x0327
            L_0x031d:
                if (r3 == 0) goto L_0x0324
                int r6 = r3.size()
                goto L_0x0325
            L_0x0324:
                r6 = 0
            L_0x0325:
                if (r6 <= 0) goto L_0x0397
            L_0x0327:
                if (r3 == 0) goto L_0x032e
                java.util.ArrayList<sk1.g> r4 = r2.f160044i
                r4.addAll(r3)
            L_0x032e:
                if (r1 == 0) goto L_0x0333
                te3.bs1 r4 = r1.f143180d
                goto L_0x0334
            L_0x0333:
                r4 = r11
            L_0x0334:
                if (r4 == 0) goto L_0x0364
                te3.bs1 r4 = r1.f143180d
                if (r4 == 0) goto L_0x0343
                java.util.LinkedList<te3.uk2> r4 = r4.f131284d
                if (r4 == 0) goto L_0x0343
                int r4 = r4.size()
                goto L_0x0344
            L_0x0343:
                r4 = 0
            L_0x0344:
                if (r4 <= 0) goto L_0x0364
                int r4 = r1.f143181e
                if (r4 == 0) goto L_0x0364
                java.util.ArrayList<sk1.g> r4 = r2.f160044i
                sk1.g r5 = new sk1.g
                r15 = 2
                r16 = 0
                r17 = 0
                r19 = 0
                r20 = 0
                r21 = 54
                r22 = 0
                r14 = r5
                r18 = r1
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
                r4.add(r5)
            L_0x0364:
                java.util.ArrayList<sk1.g> r1 = r2.f160044i
                sk1.g r4 = new sk1.g
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                te3.vy0 r5 = r2.f160045j
                if (r5 == 0) goto L_0x0377
                java.lang.String r11 = r5.f186015g
            L_0x0377:
                r20 = r11
                r21 = 30
                r22 = 0
                r14 = r4
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
                r1.add(r4)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r2.f160043h
                if (r1 == 0) goto L_0x038b
                r1.notifyDataSetChanged()
            L_0x038b:
                if (r3 == 0) goto L_0x0391
                int r13 = r3.size()
            L_0x0391:
                if (r13 != 0) goto L_0x03dd
                r2.mo78221f()
                goto L_0x03dd
            L_0x0397:
                java.lang.String r1 = r2.f160039d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                te3.vy0 r5 = r2.f160045j
                if (r5 == 0) goto L_0x03a8
                java.lang.String r5 = r5.f186015g
                goto L_0x03a9
            L_0x03a8:
                r5 = r11
            L_0x03a9:
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                te3.vy0 r1 = r2.f160045j
                if (r1 == 0) goto L_0x03ba
                java.lang.String r1 = r1.f186015g
                goto L_0x03bb
            L_0x03ba:
                r1 = r11
            L_0x03bb:
                if (r1 == 0) goto L_0x03c5
                int r1 = r1.length()
                if (r1 != 0) goto L_0x03c4
                goto L_0x03c5
            L_0x03c4:
                r12 = 0
            L_0x03c5:
                if (r12 != 0) goto L_0x03d5
                android.widget.TextView r1 = r2.f160041f
                if (r1 != 0) goto L_0x03cc
                goto L_0x03d5
            L_0x03cc:
                te3.vy0 r3 = r2.f160045j
                if (r3 == 0) goto L_0x03d2
                java.lang.String r11 = r3.f186015g
            L_0x03d2:
                r1.setText(r11)
            L_0x03d5:
                r2.mo78220e()
                java.lang.String r1 = r2.f160039d
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            L_0x03dd:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget.C56131g.call(java.lang.Object):java.lang.Object");
        }
    }

    public FinderLiveAnchorGameTogetherWidget(final Context context, ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f160036a = viewGroup;
        this.f160037b = bVar;
        this.f160038c = cVar;
        ArrayList<C63953g> arrayList = new ArrayList<>();
        this.f160044i = arrayList;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.nls);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…or_game_together_ui_root)");
        this.f160047l = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.mt5);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.….anchor_game_together_rv)");
        this.f160049n = (RecyclerView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.mrt);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…me_together_content_root)");
        this.f160048m = (LiveBottomSheetPanel) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.n2z);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…ether_empty_content_area)");
        this.f160051p = findViewById4;
        this.f160040e = (TextView) viewGroup.findViewById(C0966R.C0970id.m8d);
        this.f160041f = (TextView) viewGroup.findViewById(C0966R.C0970id.f357457m21);
        this.f160042g = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.m7o);
        this.f160046k = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.f357456m14);
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160048m;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new C60552y(this));
            View view = this.f160047l;
            if (view != null) {
                view.post(new C46274z(this));
                TextView textView = this.f160040e;
                if (textView != null) {
                    C23564m.m28138h(textView, new C60339a0(this));
                }
                View view2 = this.f160047l;
                if (view2 != null) {
                    view2.setOnClickListener(C56125a.f160052d);
                    FrameLayout frameLayout = this.f160046k;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener(new C56126b(this));
                    }
                    View view3 = this.f160051p;
                    if (view3 != null) {
                        view3.setOnClickListener(new C56127c(this));
                        TextView textView2 = this.f160040e;
                        if (textView2 != null) {
                            textView2.setOnClickListener(new C56128d(this, context));
                        }
                        WxRecyclerAdapter<C63953g> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C9500j(this) {
                            public final /* synthetic */ FinderLiveAnchorGameTogetherWidget this$0;

                            {
                                this.this$0 = r1;
                            }

                            public C60896i<?> getItemConvert(int i) {
                                int i2 = i;
                                Class cls = C54991o.class;
                                if (i2 == 1) {
                                    return new C63951e();
                                }
                                if (i2 == 0) {
                                    return new C63952f();
                                }
                                if (i2 != 2) {
                                    return new C63952f();
                                }
                                int i3 = 0;
                                Integer num = null;
                                if (!this.this$0.mo78218c()) {
                                    C50169kr1 kr12 = ((C66355w) C39818r.f106831a.mo62443b(context).mo75002a(C66355w.class)).f191042x;
                                    C58777u0 u0Var = C58777u0.f168283a;
                                    C104289g gVar = new C104289g();
                                    gVar.mo145953n("result", 5);
                                    gVar.put("appid", kr12 != null ? kr12.f137001d : null);
                                    if (kr12 != null) {
                                        i3 = kr12.f137014t;
                                    }
                                    gVar.mo145953n("game_type", 2 - i3);
                                    if (kr12 != null) {
                                        num = Integer.valueOf(kr12.f137013s);
                                    }
                                    gVar.put("team_type", num);
                                    C13598b0 b0Var = C13598b0.f38549a;
                                    u0Var.mo83834c(22, gVar);
                                } else {
                                    C51613uy0 uy02 = ((C54991o) this.this$0.f160038c.mo87684A0().mo71262a(cls)).f154363s1;
                                    C7335d c = C86312j.m106911c(C54108o.class);
                                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                                    C8777j5 j5Var = (C8777j5) c;
                                    C0073g0 g0Var = C0073g0.ANCHOR_GAME_TOGETHER;
                                    C104289g gVar2 = new C104289g();
                                    FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = this.this$0;
                                    gVar2.mo145953n("result", 5);
                                    gVar2.put("appid", uy02 != null ? uy02.f143182f : null);
                                    C62042e eVar = C62042e.f176370a;
                                    C49188dt1 dt12 = ((C54991o) finderLiveAnchorGameTogetherWidget.f160038c.mo87696x0(cls)).f154298b4;
                                    if (dt12 != null) {
                                        i3 = dt12.f132523f;
                                    }
                                    gVar2.mo145953n("game_type", eVar.mo87052W1(i3));
                                    if (uy02 != null) {
                                        num = Integer.valueOf(uy02.f143181e);
                                    }
                                    gVar2.put("team_type", num);
                                    C13598b0 b0Var2 = C13598b0.f38549a;
                                    C8777j5.C8778a.m8605f(j5Var, g0Var, gVar2.toString(), (String) null, 4, (Object) null);
                                }
                                return new C48415h();
                            }
                        }, arrayList, false);
                        wxRecyclerAdapter.f173488o = new C56129e(this, context);
                        this.f160043h = wxRecyclerAdapter;
                        RecyclerView recyclerView = this.f160049n;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(context));
                            RecyclerView recyclerView2 = this.f160049n;
                            if (recyclerView2 != null) {
                                recyclerView2.setAdapter(this.f160043h);
                            } else {
                                C87412m.m108603p("gameTogetherRv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("gameTogetherRv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("emptySpace");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        } else {
            C87412m.m108603p("container");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        if ((r1 == null || r1.length() == 0) == false) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78216a() {
        /*
            r4 = this;
            te3.vy0 r0 = r4.f160045j
            r1 = 0
            if (r0 == 0) goto L_0x0008
            te3.ih4 r2 = r0.f186013e
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            if (r2 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x0014
            te3.ih4 r2 = r0.f186013e
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f183697f
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            r3 = 0
            if (r2 != 0) goto L_0x002e
            if (r0 == 0) goto L_0x0020
            te3.ih4 r0 = r0.f186013e
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = r0.f183695d
        L_0x0020:
            if (r1 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 != 0) goto L_0x004e
        L_0x002e:
            android.widget.TextView r0 = r4.f160040e
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r0.setVisibility(r3)
        L_0x0036:
            android.widget.TextView r0 = r4.f160040e
            if (r0 != 0) goto L_0x003b
            goto L_0x0058
        L_0x003b:
            te3.vy0 r1 = r4.f160045j
            if (r1 == 0) goto L_0x0048
            te3.ih4 r1 = r1.f186013e
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.f183696e
            if (r1 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            java.lang.String r1 = ""
        L_0x004a:
            r0.setText(r1)
            goto L_0x0058
        L_0x004e:
            android.widget.TextView r0 = r4.f160040e
            if (r0 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r1 = 8
            r0.setVisibility(r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget.mo78216a():void");
    }

    /* renamed from: b */
    public final int mo78217b(int i, List<? extends C51560uk2> list) {
        int i2 = 0;
        for (C51560uk2 uk22 : list) {
            if (uk22.f142914e == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: c */
    public final boolean mo78218c() {
        return ((C54991o) this.f160038c.mo87696x0(C54991o.class)).mo75999e4();
    }

    /* renamed from: d */
    public final void mo78219d() {
        C64403gs1 gs12;
        LinkedList<C64374fs1> linkedList;
        C64403gs1 gs13;
        LinkedList<C64374fs1> linkedList2;
        ih4 ih4;
        C51613uy0 uy02;
        C48899bs1 bs12;
        LinkedList<C51560uk2> linkedList3;
        C51613uy0 uy03;
        String str = this.f160039d;
        StringBuilder sb = new StringBuilder();
        sb.append("teamInfo: isnull: ");
        C64789vy0 vy02 = this.f160045j;
        boolean z = true;
        int i = 0;
        sb.append((vy02 != null ? vy02.f186014f : null) == null);
        sb.append(", lastJoin: ");
        C64789vy0 vy03 = this.f160045j;
        sb.append((vy03 == null || (uy03 = vy03.f186014f) == null) ? null : Integer.valueOf(uy03.f143181e));
        sb.append(", size: ");
        C64789vy0 vy04 = this.f160045j;
        sb.append((vy04 == null || (uy02 = vy04.f186014f) == null || (bs12 = uy02.f143180d) == null || (linkedList3 = bs12.f131284d) == null) ? null : Integer.valueOf(linkedList3.size()));
        Log.m105924i(str, sb.toString());
        String str2 = this.f160039d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("cornerInfo: wording");
        C64789vy0 vy05 = this.f160045j;
        sb4.append((vy05 == null || (ih4 = vy05.f186013e) == null) ? null : ih4.f183696e);
        Log.m105924i(str2, sb4.toString());
        String str3 = this.f160039d;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("bottomWording: ");
        C64789vy0 vy06 = this.f160045j;
        sb5.append(vy06 != null ? vy06.f186015g : null);
        Log.m105924i(str3, sb5.toString());
        String str4 = this.f160039d;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("playTogetherList: isnull: ");
        C64789vy0 vy07 = this.f160045j;
        if ((vy07 != null ? vy07.f186012d : null) != null) {
            z = false;
        }
        sb6.append(z);
        sb6.append(", itemList size: ");
        C64789vy0 vy08 = this.f160045j;
        sb6.append((vy08 == null || (gs13 = vy08.f186012d) == null || (linkedList2 = gs13.f183356d) == null) ? null : Integer.valueOf(linkedList2.size()));
        Log.m105924i(str4, sb6.toString());
        C64789vy0 vy09 = this.f160045j;
        if (vy09 != null && (gs12 = vy09.f186012d) != null && (linkedList = gs12.f183356d) != null) {
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str5 = this.f160039d;
                    Log.m105924i(str5, "index: " + i + ", item: " + ((C64374fs1) next).f183221f);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo78220e() {
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160048m;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                if (liveBottomSheetPanel != null) {
                    liveBottomSheetPanel.mo78804d();
                } else {
                    C87412m.m108603p("container");
                    throw null;
                }
            }
            TextView textView = this.f160041f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            FrameLayout frameLayout = this.f160042g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            mo78216a();
            return;
        }
        C87412m.m108603p("container");
        throw null;
    }

    /* renamed from: f */
    public final void mo78221f() {
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160048m;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                if (liveBottomSheetPanel != null) {
                    liveBottomSheetPanel.mo78804d();
                } else {
                    C87412m.m108603p("container");
                    throw null;
                }
            }
            TextView textView = this.f160041f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            FrameLayout frameLayout = this.f160042g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            mo78216a();
            return;
        }
        C87412m.m108603p("container");
        throw null;
    }

    /* renamed from: g */
    public final void mo78222g(boolean z) {
        Class cls = C55001u.class;
        if (!z) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f160048m;
            if (liveBottomSheetPanel != null) {
                if (!liveBottomSheetPanel.f165501h) {
                    liveBottomSheetPanel.mo78804d();
                }
                TextView textView = this.f160041f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                FrameLayout frameLayout = this.f160042g;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                TextView textView2 = this.f160040e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        }
        if (!mo78218c()) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f160036a.getContext();
            C87412m.m108593f(context, "root.context");
            C89059e i = new C62616r(((C66355w) rVar.mo62443b(context).mo75002a(C66355w.class)).f191039u, 0, true).mo9225i();
            i.mo123420E(new C56130f(this, z));
            Context context2 = this.f160036a.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) context2);
        } else {
            C89059e i2 = new C47832n(((C55001u) this.f160038c.mo87696x0(cls)).f154416j, ((C55001u) this.f160038c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f160038c.mo87696x0(cls)).f154417n), ((C55001u) this.f160038c.mo87696x0(cls)).f154423t, 1).mo9225i();
            i2.mo123420E(new C56131g(this, z));
            Context context3 = this.f160036a.getContext();
            C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) context3);
        }
        if (!mo78218c()) {
            C58777u0 u0Var = C58777u0.f168283a;
            C104289g gVar = new C104289g();
            gVar.mo145953n("result", 1);
            C13598b0 b0Var = C13598b0.f38549a;
            u0Var.mo83834c(22, gVar);
            return;
        }
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C0073g0 g0Var = C0073g0.ANCHOR_GAME_TOGETHER;
        C104289g gVar2 = new C104289g();
        gVar2.mo145953n("result", 1);
        C13598b0 b0Var2 = C13598b0.f38549a;
        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, gVar2.toString(), (String) null, 4, (Object) null);
    }
}
