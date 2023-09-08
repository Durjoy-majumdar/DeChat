package com.tencent.p014mm.plugin.finder.live.widget;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import d60.C58124b;
import di1.C58270b;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import i70.C87667c;
import il1.C60387d8;
import il1.C60393e8;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import qg1.C47832n;
import qj1.C62660c;
import rx3.C13598b0;
import sk1.C63951e;
import sk1.C63952f;
import sk1.C63953g;
import sk1.C63955j;
import te3.C48933c01;
import te3.C49188dt1;
import te3.C64247az0;
import te3.C64582nl0;
import te3.C64789vy0;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget */
public final class FinderLiveVisitorGameTogetherWidget {

    /* renamed from: a */
    public final ViewGroup f160107a;

    /* renamed from: b */
    public final C58124b f160108b;

    /* renamed from: c */
    public final C62660c f160109c;

    /* renamed from: d */
    public final String f160110d = "Finder.FinderLiveVisitorGameWidget";

    /* renamed from: e */
    public FrameLayout f160111e;

    /* renamed from: f */
    public RecyclerView f160112f;

    /* renamed from: g */
    public View f160113g;

    /* renamed from: h */
    public LiveBottomSheetPanel f160114h;

    /* renamed from: i */
    public View f160115i;

    /* renamed from: j */
    public TextView f160116j;

    /* renamed from: k */
    public TextView f160117k;

    /* renamed from: l */
    public FrameLayout f160118l;

    /* renamed from: m */
    public WxRecyclerAdapter<C63953g> f160119m;

    /* renamed from: n */
    public final ArrayList<C63953g> f160120n;

    /* renamed from: o */
    public C64789vy0 f160121o;

    /* renamed from: p */
    public C64247az0 f160122p;

    /* renamed from: q */
    public C87667c<?, ?>.a f160123q;

    /* renamed from: r */
    public int f160124r;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$a */
    public static final class C56139a implements View.OnClickListener {

        /* renamed from: d */
        public static final C56139a f160125d = new C56139a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$b */
    public static final class C56140b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f160126d;

        public C56140b(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
            this.f160126d = finderLiveVisitorGameTogetherWidget;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58270b bVar = ((C54991o) this.f160126d.f160109c.mo87696x0(C54991o.class)).f154310e4;
            boolean z = !bVar.f166852d;
            bVar.f166852d = z;
            bVar.postValue(Boolean.valueOf(z));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$c */
    public static final class C56141c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f160127d;

        public C56141c(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
            this.f160127d = finderLiveVisitorGameTogetherWidget;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58270b bVar = ((C54991o) this.f160127d.f160109c.mo87696x0(C54991o.class)).f154310e4;
            boolean z = !bVar.f166852d;
            bVar.f166852d = z;
            bVar.postValue(Boolean.valueOf(z));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$d */
    public static final class C56142d implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f160128d;

        public C56142d(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
            this.f160128d = finderLiveVisitorGameTogetherWidget;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            C63953g gVar = this.f160128d.f160120n.get(i);
            C87412m.m108593f(gVar, "dataList[position]");
            if (gVar.f181279d != 2) {
                return;
            }
            if (((C54991o) this.f160128d.f160109c.mo87696x0(C54991o.class)).f154371u1 == 1) {
                C76912y0.m92767f(this.f160128d.f160107a.getContext(), this.f160128d.f160107a.getContext().getResources().getString(C0966R.string.dbo));
                C58124b.C7172a.m7372a(this.f160128d.f160108b, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_HIDE_HALF, (Bundle) null, 2, (Object) null);
                return;
            }
            C58124b.C7172a.m7372a(this.f160128d.f160108b, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_SHOW_TEAM_HALF, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget$e */
    public static final class C56143e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f160129a;

        /* renamed from: b */
        public final /* synthetic */ boolean f160130b;

        public C56143e(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget, boolean z) {
            this.f160129a = finderLiveVisitorGameTogetherWidget;
            this.f160130b = z;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.f160129a;
                C48933c01 c012 = (C48933c01) cVar.f256796d;
                finderLiveVisitorGameTogetherWidget.f160121o = c012.f131420e;
                finderLiveVisitorGameTogetherWidget.f160122p = c012.f131419d;
                ((C54991o) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(C54991o.class)).mo76024u4(this.f160129a.f160122p);
                this.f160129a.mo78275b(this.f160130b);
            } else {
                this.f160129a.mo78275b(this.f160130b);
            }
            return C13598b0.f38549a;
        }
    }

    public FinderLiveVisitorGameTogetherWidget(Context context, ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f160107a = viewGroup;
        this.f160108b = bVar;
        this.f160109c = cVar;
        ArrayList<C63953g> arrayList = new ArrayList<>();
        this.f160120n = arrayList;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.nmf);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…or_game_together_ui_root)");
        this.f160113g = findViewById;
        this.f160111e = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.nr4);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.nr5);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…visitor_game_together_rv)");
        this.f160112f = (RecyclerView) findViewById2;
        this.f160117k = (TextView) viewGroup.findViewById(C0966R.C0970id.f359507nr3);
        this.f160116j = (TextView) viewGroup.findViewById(C0966R.C0970id.nzw);
        this.f160118l = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.f359504nr0);
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.obb);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…_game_together_container)");
        this.f160114h = (LiveBottomSheetPanel) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.obc);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…ether_empty_content_area)");
        this.f160115i = findViewById4;
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160114h;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnVisibilityListener(new C60387d8(this));
            View view = this.f160113g;
            if (view != null) {
                view.post(new C60393e8(this));
                View view2 = this.f160113g;
                if (view2 != null) {
                    view2.setOnClickListener(C56139a.f160125d);
                    FrameLayout frameLayout = this.f160118l;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener(new C56140b(this));
                    }
                    View view3 = this.f160115i;
                    if (view3 != null) {
                        view3.setOnClickListener(new C56141c(this));
                        WxRecyclerAdapter<C63953g> wxRecyclerAdapter = new WxRecyclerAdapter<>(new C9500j(this) {
                            public final /* synthetic */ FinderLiveVisitorGameTogetherWidget this$0;

                            {
                                this.this$0 = r1;
                            }

                            public C60896i<?> getItemConvert(int i) {
                                C64582nl0 nl02;
                                if (i == 1) {
                                    return new C63951e();
                                }
                                if (i == 2) {
                                    C7335d c = C86312j.m106911c(C54116w.class);
                                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                                    C54116w wVar = (C54116w) c;
                                    C54067f0.C54076o0 o0Var = C54067f0.C54076o0.GAME_TEAM;
                                    C104289g gVar = new C104289g();
                                    gVar.mo145953n("type", 32);
                                    C13598b0 b0Var = C13598b0.f38549a;
                                    String gVar2 = gVar.toString();
                                    C104289g gVar3 = new C104289g();
                                    FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.this$0;
                                    gVar3.put("click_id", UUID.randomUUID().toString());
                                    C62042e eVar = C62042e.f176370a;
                                    C49188dt1 dt12 = ((C54991o) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(C54991o.class)).f154298b4;
                                    gVar3.mo145953n("game_type", eVar.mo87052W1(dt12 != null ? dt12.f132523f : 0));
                                    C64247az0 az02 = finderLiveVisitorGameTogetherWidget.f160122p;
                                    gVar3.put("appid", (az02 == null || (nl02 = az02.f182176B) == null) ? null : nl02.f184481d);
                                    C54116w.Ex0(wVar, o0Var, gVar2, 0, (String) null, (String) null, gVar3.toString(), (String) null, (String) null, 220, (Object) null);
                                    FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget2 = this.this$0;
                                    return new C63955j(finderLiveVisitorGameTogetherWidget2.f160109c, finderLiveVisitorGameTogetherWidget2.f160108b);
                                } else if (i == 0) {
                                    return new C63952f();
                                } else {
                                    FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget3 = this.this$0;
                                    return new C63955j(finderLiveVisitorGameTogetherWidget3.f160109c, finderLiveVisitorGameTogetherWidget3.f160108b);
                                }
                            }
                        }, arrayList, false);
                        wxRecyclerAdapter.f173488o = new C56142d(this);
                        this.f160119m = wxRecyclerAdapter;
                        RecyclerView recyclerView = this.f160112f;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(context));
                            RecyclerView recyclerView2 = this.f160112f;
                            if (recyclerView2 != null) {
                                recyclerView2.setAdapter(this.f160119m);
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
    public final void mo78274a() {
        /*
            r4 = this;
            te3.vy0 r0 = r4.f160121o
            r1 = 0
            if (r0 == 0) goto L_0x0008
            te3.ih4 r2 = r0.f186013e
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            if (r2 == 0) goto L_0x005c
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
            if (r0 != 0) goto L_0x005c
        L_0x002e:
            qj1.c r0 = r4.f160109c
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154190D
            if (r0 == 0) goto L_0x005c
            android.widget.TextView r0 = r4.f160116j
            if (r0 != 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r0.setVisibility(r3)
        L_0x0044:
            android.widget.TextView r0 = r4.f160116j
            if (r0 != 0) goto L_0x0049
            goto L_0x0066
        L_0x0049:
            te3.vy0 r1 = r4.f160121o
            if (r1 == 0) goto L_0x0056
            te3.ih4 r1 = r1.f186013e
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r1.f183696e
            if (r1 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            java.lang.String r1 = ""
        L_0x0058:
            r0.setText(r1)
            goto L_0x0066
        L_0x005c:
            android.widget.TextView r0 = r4.f160116j
            if (r0 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r1 = 8
            r0.setVisibility(r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget.mo78274a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0376, code lost:
        if ((r12 != null ? r12.size() : 0) <= 0) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if ((r12 != null ? r12.size() : 0) <= 0) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78275b(boolean r33) {
        /*
            r32 = this;
            r0 = r32
            ak1.f0$o0 r2 = ak1.C54067f0.C54076o0.GAME_TEAM
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            java.lang.Class<cl1.o> r13 = cl1.C54991o.class
            java.lang.String r3 = "appid"
            java.lang.String r4 = "game_type"
            java.lang.String r5 = "click_id"
            java.lang.String r6 = "type"
            java.lang.String r8 = "getService(HellLiveVisitorReoprter::class.java)"
            java.lang.String r9 = "playTogeInfo is null: "
            java.lang.String r10 = ", canShow: "
            java.lang.String r11 = ", gamTeamMode: "
            java.lang.String r12 = "gameDynamicCardFrameSetRoot"
            java.lang.String r14 = " teamInfo is null : "
            java.lang.String r15 = ", size: "
            java.lang.String r7 = "gameInfo is null: "
            r17 = 0
            r18 = r9
            if (r33 == 0) goto L_0x02a0
            qj1.c r9 = r0.f160109c
            androidx.lifecycle.i0 r9 = r9.mo87696x0(r13)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.f154371u1
            r19 = r2
            te3.az0 r2 = r0.f160122p
            if (r2 == 0) goto L_0x0040
            if (r9 == 0) goto L_0x0040
            r2 = 1
            if (r9 == r2) goto L_0x0040
            r20 = r3
            r2 = 1
            goto L_0x0043
        L_0x0040:
            r20 = r3
            r2 = 0
        L_0x0043:
            te3.vy0 r3 = r0.f160121o
            if (r3 == 0) goto L_0x0097
            te3.gs1 r3 = r3.f186012d
            if (r3 == 0) goto L_0x0097
            java.util.LinkedList<te3.fs1> r3 = r3.f183356d
            if (r3 == 0) goto L_0x0097
            r21 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r22 = r5
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0062:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0095
            java.lang.Object r5 = r3.next()
            r25 = r5
            te3.fs1 r25 = (te3.C64374fs1) r25
            sk1.g r5 = new sk1.g
            r24 = 1
            r33 = r3
            i70.c<?, ?>$a r3 = r0.f160123q
            if (r3 == 0) goto L_0x0091
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 56
            r31 = 0
            r23 = r5
            r26 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r4.add(r5)
            r3 = r33
            goto L_0x0062
        L_0x0091:
            gy3.C87412m.m108603p(r12)
            throw r17
        L_0x0095:
            r12 = r4
            goto L_0x009d
        L_0x0097:
            r21 = r4
            r22 = r5
            r12 = r17
        L_0x009d:
            java.lang.String r3 = r0.f160110d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            if (r12 != 0) goto L_0x00ab
            r5 = 1
            goto L_0x00ac
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            r4.append(r5)
            r4.append(r15)
            if (r12 == 0) goto L_0x00b9
            int r5 = r12.size()
            goto L_0x00ba
        L_0x00b9:
            r5 = 0
        L_0x00ba:
            r4.append(r5)
            r4.append(r14)
            te3.az0 r5 = r0.f160122p
            if (r5 != 0) goto L_0x00c6
            r5 = 1
            goto L_0x00c7
        L_0x00c6:
            r5 = 0
        L_0x00c7:
            r4.append(r5)
            r4.append(r11)
            r4.append(r9)
            r4.append(r10)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            te3.vy0 r3 = r0.f160121o
            if (r3 == 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00e8
            int r3 = r12.size()
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 > 0) goto L_0x00ed
        L_0x00eb:
            if (r2 == 0) goto L_0x027e
        L_0x00ed:
            int r3 = r0.f160124r
            if (r12 == 0) goto L_0x00f7
            int r4 = r12.size()
            r14 = r4
            goto L_0x00f8
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            java.lang.String r4 = "checkDataChange"
            if (r14 <= r3) goto L_0x011c
            java.util.ArrayList<sk1.g> r5 = r0.f160120n
            r5.clear()
            if (r12 == 0) goto L_0x0108
            java.util.ArrayList<sk1.g> r5 = r0.f160120n
            r5.addAll(r12)
        L_0x0108:
            if (r3 <= 0) goto L_0x0112
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r5 = r0.f160119m
            if (r5 == 0) goto L_0x0112
            r7 = 0
            r5.notifyItemRangeChanged(r7, r3, r4)
        L_0x0112:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r4 = r0.f160119m
            if (r4 == 0) goto L_0x016c
            int r5 = r14 - r3
            r4.notifyItemRangeInserted(r3, r5)
            goto L_0x016c
        L_0x011c:
            if (r14 >= r3) goto L_0x013d
            java.util.ArrayList<sk1.g> r5 = r0.f160120n
            r5.clear()
            if (r12 == 0) goto L_0x012a
            java.util.ArrayList<sk1.g> r5 = r0.f160120n
            r5.addAll(r12)
        L_0x012a:
            if (r14 <= 0) goto L_0x0134
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r5 = r0.f160119m
            if (r5 == 0) goto L_0x0134
            r7 = 0
            r5.notifyItemRangeChanged(r7, r14, r4)
        L_0x0134:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r4 = r0.f160119m
            if (r4 == 0) goto L_0x016c
            int r3 = r3 - r14
            r4.notifyItemRangeRemoved(r14, r3)
            goto L_0x016c
        L_0x013d:
            if (r12 == 0) goto L_0x0161
            java.util.Iterator r5 = r12.iterator()
            r7 = 0
        L_0x0144:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0161
            java.lang.Object r9 = r5.next()
            int r10 = r7 + 1
            if (r7 < 0) goto L_0x015d
            sk1.g r9 = (sk1.C63953g) r9
            if (r7 >= r14) goto L_0x015b
            java.util.ArrayList<sk1.g> r11 = r0.f160120n
            r11.set(r7, r9)
        L_0x015b:
            r7 = r10
            goto L_0x0144
        L_0x015d:
            sx3.C64197v.m75542k()
            throw r17
        L_0x0161:
            if (r3 <= 0) goto L_0x016c
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r5 = r0.f160119m
            if (r5 == 0) goto L_0x016c
            r9 = 0
            r5.notifyItemRangeChanged(r9, r3, r4)
            goto L_0x016d
        L_0x016c:
            r9 = 0
        L_0x016d:
            if (r2 == 0) goto L_0x022a
            qj1.c r2 = r0.f160109c
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r13)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154190D
            if (r2 != 0) goto L_0x022a
            int r2 = r0.f160124r
            if (r2 == r14) goto L_0x01ab
            java.util.ArrayList<sk1.g> r2 = r0.f160120n
            sk1.g r3 = new sk1.g
            r24 = 2
            r25 = 0
            r26 = 0
            r27 = 0
            te3.az0 r4 = r0.f160122p
            r29 = 0
            r30 = 46
            r31 = 0
            r23 = r3
            r28 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r2.add(r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r0.f160119m
            if (r2 == 0) goto L_0x01b8
            java.util.ArrayList<sk1.g> r3 = r0.f160120n
            int r3 = r3.size()
            r2.notifyItemInserted(r3)
            goto L_0x01b8
        L_0x01ab:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r2 = r0.f160119m
            if (r2 == 0) goto L_0x01b8
            java.util.ArrayList<sk1.g> r3 = r0.f160120n
            int r3 = r3.size()
            r2.notifyItemChanged(r3)
        L_0x01b8:
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r8)
            ak1.w r1 = (ak1.C54116w) r1
            c30.g r2 = new c30.g
            r2.<init>()
            r3 = 32
            r2.mo145953n(r6, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            java.lang.String r3 = r2.toString()
            r4 = 0
            r6 = 0
            r7 = 0
            c30.g r2 = new c30.g
            r2.<init>()
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            r10 = r22
            r2.put(r10, r8)
            ok1.e r8 = ok1.C62042e.f176370a
            qj1.c r10 = r0.f160109c
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r13)
            cl1.o r10 = (cl1.C54991o) r10
            te3.dt1 r10 = r10.f154298b4
            if (r10 == 0) goto L_0x01f8
            int r10 = r10.f132523f
            goto L_0x01f9
        L_0x01f8:
            r10 = 0
        L_0x01f9:
            int r8 = r8.mo87052W1(r10)
            r10 = r21
            r2.mo145953n(r10, r8)
            te3.az0 r8 = r0.f160122p
            if (r8 == 0) goto L_0x020d
            te3.nl0 r8 = r8.f182176B
            if (r8 == 0) goto L_0x020d
            java.lang.String r8 = r8.f184481d
            goto L_0x020f
        L_0x020d:
            r8 = r17
        L_0x020f:
            r10 = r20
            r2.put(r10, r8)
            java.lang.String r8 = r2.toString()
            r10 = 0
            r11 = 0
            r15 = 220(0xdc, float:3.08E-43)
            r16 = 0
            r2 = r19
            r9 = r10
            r10 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            ak1.C54116w.Ex0(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x022b
        L_0x022a:
            r15 = r12
        L_0x022b:
            qj1.c r1 = r0.f160109c
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r13)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154190D
            if (r1 == 0) goto L_0x0265
            int r1 = r0.f160124r
            if (r1 == r14) goto L_0x0265
            java.util.ArrayList<sk1.g> r1 = r0.f160120n
            sk1.g r11 = new sk1.g
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            te3.vy0 r2 = r0.f160121o
            if (r2 == 0) goto L_0x024c
            java.lang.String r2 = r2.f186015g
            r8 = r2
            goto L_0x024e
        L_0x024c:
            r8 = r17
        L_0x024e:
            r9 = 30
            r10 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.add(r11)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r0.f160119m
            if (r1 == 0) goto L_0x0265
            java.util.ArrayList<sk1.g> r2 = r0.f160120n
            int r2 = r2.size()
            r1.notifyItemInserted(r2)
        L_0x0265:
            if (r15 == 0) goto L_0x026c
            int r9 = r15.size()
            goto L_0x026d
        L_0x026c:
            r9 = 0
        L_0x026d:
            if (r9 != 0) goto L_0x0272
            r32.mo78277d()
        L_0x0272:
            if (r15 == 0) goto L_0x0279
            int r9 = r15.size()
            goto L_0x027a
        L_0x0279:
            r9 = 0
        L_0x027a:
            r0.f160124r = r9
            goto L_0x0488
        L_0x027e:
            java.lang.String r1 = r0.f160110d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r18
            r2.append(r3)
            te3.vy0 r3 = r0.f160121o
            if (r3 != 0) goto L_0x0290
            r9 = 1
            goto L_0x0291
        L_0x0290:
            r9 = 0
        L_0x0291:
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r32.mo78276c()
            goto L_0x0488
        L_0x02a0:
            r19 = r2
            r2 = r3
            r3 = r18
            java.util.ArrayList<sk1.g> r9 = r0.f160120n
            int r9 = r9.size()
            java.util.ArrayList<sk1.g> r3 = r0.f160120n
            r3.clear()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r3 = r0.f160119m
            r20 = r2
            r2 = 0
            if (r3 == 0) goto L_0x02ba
            r3.notifyItemRangeRemoved(r2, r9)
        L_0x02ba:
            qj1.c r3 = r0.f160109c
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r13)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154371u1
            te3.az0 r9 = r0.f160122p
            if (r9 == 0) goto L_0x02cf
            if (r3 == 0) goto L_0x02cf
            r9 = 1
            if (r3 == r9) goto L_0x02d0
            r2 = 1
            goto L_0x02d0
        L_0x02cf:
            r9 = 1
        L_0x02d0:
            te3.vy0 r9 = r0.f160121o
            if (r9 == 0) goto L_0x0324
            te3.gs1 r9 = r9.f186012d
            if (r9 == 0) goto L_0x0324
            java.util.LinkedList<te3.fs1> r9 = r9.f183356d
            if (r9 == 0) goto L_0x0324
            r21 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r22 = r5
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r9.iterator()
        L_0x02ef:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0322
            java.lang.Object r9 = r5.next()
            r25 = r9
            te3.fs1 r25 = (te3.C64374fs1) r25
            sk1.g r9 = new sk1.g
            r24 = 1
            r33 = r5
            i70.c<?, ?>$a r5 = r0.f160123q
            if (r5 == 0) goto L_0x031e
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 56
            r31 = 0
            r23 = r9
            r26 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r4.add(r9)
            r5 = r33
            goto L_0x02ef
        L_0x031e:
            gy3.C87412m.m108603p(r12)
            throw r17
        L_0x0322:
            r12 = r4
            goto L_0x032a
        L_0x0324:
            r21 = r4
            r22 = r5
            r12 = r17
        L_0x032a:
            java.lang.String r4 = r0.f160110d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            if (r12 != 0) goto L_0x0338
            r9 = 1
            goto L_0x0339
        L_0x0338:
            r9 = 0
        L_0x0339:
            r5.append(r9)
            r5.append(r15)
            if (r12 == 0) goto L_0x0346
            int r9 = r12.size()
            goto L_0x0347
        L_0x0346:
            r9 = 0
        L_0x0347:
            r5.append(r9)
            r5.append(r14)
            te3.az0 r7 = r0.f160122p
            if (r7 != 0) goto L_0x0353
            r9 = 1
            goto L_0x0354
        L_0x0353:
            r9 = 0
        L_0x0354:
            r5.append(r9)
            r5.append(r11)
            r5.append(r3)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            te3.vy0 r3 = r0.f160121o
            if (r3 == 0) goto L_0x0378
            if (r12 == 0) goto L_0x0375
            int r9 = r12.size()
            goto L_0x0376
        L_0x0375:
            r9 = 0
        L_0x0376:
            if (r9 > 0) goto L_0x037a
        L_0x0378:
            if (r2 == 0) goto L_0x0467
        L_0x037a:
            if (r12 == 0) goto L_0x0381
            java.util.ArrayList<sk1.g> r3 = r0.f160120n
            r3.addAll(r12)
        L_0x0381:
            if (r2 == 0) goto L_0x041c
            qj1.c r2 = r0.f160109c
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r13)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154190D
            if (r2 != 0) goto L_0x041c
            java.util.ArrayList<sk1.g> r2 = r0.f160120n
            sk1.g r3 = new sk1.g
            r24 = 2
            r25 = 0
            r26 = 0
            r27 = 0
            te3.az0 r4 = r0.f160122p
            r29 = 0
            r30 = 46
            r31 = 0
            r23 = r3
            r28 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r2.add(r3)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r8)
            ak1.w r1 = (ak1.C54116w) r1
            c30.g r2 = new c30.g
            r2.<init>()
            r3 = 32
            r2.mo145953n(r6, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            java.lang.String r3 = r2.toString()
            r4 = 0
            r6 = 0
            r7 = 0
            c30.g r2 = new c30.g
            r2.<init>()
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            r9 = r22
            r2.put(r9, r8)
            ok1.e r8 = ok1.C62042e.f176370a
            qj1.c r9 = r0.f160109c
            androidx.lifecycle.i0 r9 = r9.mo87696x0(r13)
            cl1.o r9 = (cl1.C54991o) r9
            te3.dt1 r9 = r9.f154298b4
            if (r9 == 0) goto L_0x03ed
            int r9 = r9.f132523f
            goto L_0x03ee
        L_0x03ed:
            r9 = 0
        L_0x03ee:
            int r8 = r8.mo87052W1(r9)
            r9 = r21
            r2.mo145953n(r9, r8)
            te3.az0 r8 = r0.f160122p
            if (r8 == 0) goto L_0x0402
            te3.nl0 r8 = r8.f182176B
            if (r8 == 0) goto L_0x0402
            java.lang.String r8 = r8.f184481d
            goto L_0x0404
        L_0x0402:
            r8 = r17
        L_0x0404:
            r9 = r20
            r2.put(r9, r8)
            java.lang.String r8 = r2.toString()
            r9 = 0
            r10 = 0
            r11 = 220(0xdc, float:3.08E-43)
            r14 = 0
            r15 = 0
            r2 = r19
            r16 = r12
            r12 = r14
            ak1.C54116w.Ex0(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x041f
        L_0x041c:
            r16 = r12
            r15 = 0
        L_0x041f:
            qj1.c r1 = r0.f160109c
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r13)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154190D
            if (r1 == 0) goto L_0x0448
            java.util.ArrayList<sk1.g> r1 = r0.f160120n
            sk1.g r11 = new sk1.g
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            te3.vy0 r2 = r0.f160121o
            if (r2 == 0) goto L_0x043c
            java.lang.String r2 = r2.f186015g
            r8 = r2
            goto L_0x043e
        L_0x043c:
            r8 = r17
        L_0x043e:
            r9 = 30
            r10 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.add(r11)
        L_0x0448:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<sk1.g> r1 = r0.f160119m
            if (r1 == 0) goto L_0x044f
            r1.notifyDataSetChanged()
        L_0x044f:
            if (r16 == 0) goto L_0x0456
            int r9 = r16.size()
            goto L_0x0457
        L_0x0456:
            r9 = 0
        L_0x0457:
            if (r9 != 0) goto L_0x045c
            r32.mo78277d()
        L_0x045c:
            if (r16 == 0) goto L_0x0463
            int r9 = r16.size()
            goto L_0x0464
        L_0x0463:
            r9 = 0
        L_0x0464:
            r0.f160124r = r9
            goto L_0x0488
        L_0x0467:
            r15 = 0
            java.lang.String r1 = r0.f160110d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r18
            r2.append(r3)
            te3.vy0 r3 = r0.f160121o
            if (r3 != 0) goto L_0x047a
            r9 = 1
            goto L_0x047b
        L_0x047a:
            r9 = 0
        L_0x047b:
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r32.mo78276c()
        L_0x0488:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget.mo78275b(boolean):void");
    }

    /* renamed from: c */
    public final void mo78276c() {
        TextView textView;
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160114h;
        String str = null;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                View view = this.f160113g;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showEmptyTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    LiveBottomSheetPanel liveBottomSheetPanel2 = this.f160114h;
                    if (liveBottomSheetPanel2 != null) {
                        liveBottomSheetPanel2.mo78804d();
                    } else {
                        C87412m.m108603p("container");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            }
            C64789vy0 vy02 = this.f160121o;
            String str2 = vy02 != null ? vy02.f186015g : null;
            if (!(str2 == null || str2.length() == 0) && (textView = this.f160117k) != null) {
                C64789vy0 vy03 = this.f160121o;
                if (vy03 != null) {
                    str = vy03.f186015g;
                }
                textView.setText(str);
            }
            mo78274a();
            TextView textView2 = this.f160117k;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            FrameLayout frameLayout = this.f160111e;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        C87412m.m108603p("container");
        throw null;
    }

    /* renamed from: d */
    public final void mo78277d() {
        LiveBottomSheetPanel liveBottomSheetPanel = this.f160114h;
        if (liveBottomSheetPanel != null) {
            if (!liveBottomSheetPanel.f165501h) {
                View view = this.f160113g;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showRv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    LiveBottomSheetPanel liveBottomSheetPanel2 = this.f160114h;
                    if (liveBottomSheetPanel2 != null) {
                        liveBottomSheetPanel2.mo78804d();
                    } else {
                        C87412m.m108603p("container");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            }
            mo78274a();
            TextView textView = this.f160117k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            FrameLayout frameLayout = this.f160111e;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        C87412m.m108603p("container");
        throw null;
    }

    /* renamed from: e */
    public final void mo78278e(boolean z) {
        C64582nl0 nl02;
        boolean z2 = z;
        Class cls = C55001u.class;
        int i = 0;
        String str = null;
        if (!z2) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f160114h;
            if (liveBottomSheetPanel != null) {
                if (!liveBottomSheetPanel.f165501h) {
                    View view = this.f160113g;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        LiveBottomSheetPanel liveBottomSheetPanel2 = this.f160114h;
                        if (liveBottomSheetPanel2 != null) {
                            liveBottomSheetPanel2.mo78804d();
                        } else {
                            C87412m.m108603p("container");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rootView");
                        throw null;
                    }
                }
                TextView textView = this.f160117k;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                FrameLayout frameLayout = this.f160111e;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        }
        C89059e i2 = new C47832n(((C55001u) this.f160109c.mo87696x0(cls)).f154416j, ((C55001u) this.f160109c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f160109c.mo87696x0(cls)).f154417n), ((C55001u) this.f160109c.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null).mo9225i();
        i2.mo123420E(new C56143e(this, z2));
        if (this.f160107a.getContext() instanceof MMActivity) {
            Context context = this.f160107a.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) context);
        }
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w wVar = (C54116w) c;
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.GAME_TEAM;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", 31);
        C13598b0 b0Var = C13598b0.f38549a;
        String gVar2 = gVar.toString();
        C104289g gVar3 = new C104289g();
        gVar3.put("click_id", UUID.randomUUID().toString());
        C62042e eVar = C62042e.f176370a;
        C49188dt1 dt12 = ((C54991o) this.f160109c.mo87696x0(C54991o.class)).f154298b4;
        if (dt12 != null) {
            i = dt12.f132523f;
        }
        gVar3.mo145953n("game_type", eVar.mo87052W1(i));
        C64247az0 az02 = this.f160122p;
        if (!(az02 == null || (nl02 = az02.f182176B) == null)) {
            str = nl02.f184481d;
        }
        gVar3.put("appid", str);
        C54116w.Ex0(wVar, o0Var, gVar2, 0, (String) null, (String) null, gVar3.toString(), (String) null, (String) null, 220, (Object) null);
    }
}
