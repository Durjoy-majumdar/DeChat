package com.tencent.p014mm.plugin.finder.live.mic.panel;

import al1.C54130j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.trtc.TRTCVideoRatioLayout;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.ratio.RatioLayout;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import d60.C58124b;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ji1.C60870a;
import ki1.C61100d;
import nh1.C61741k;
import nh1.C61748r;
import nj3.C76912y0;
import ok1.C11471u;
import p192l4.C10462b;
import pe3.C89349b;
import qj1.C63068w1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C36907w;
import te3.C49765hx0;
import te3.C64756up2;

/* renamed from: com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget */
public final class FinderLiveMicModeSelectWidget extends C8961e implements View.OnClickListener {

    /* renamed from: h */
    public final C63068w1 f159315h;

    /* renamed from: i */
    public final C32226l<Boolean, C13598b0> f159316i;

    /* renamed from: j */
    public final C32228q<Integer, Integer, String, C13598b0> f159317j;

    /* renamed from: n */
    public C61741k f159318n;

    /* renamed from: o */
    public final String f159319o;

    /* renamed from: p */
    public String f159320p;

    /* renamed from: q */
    public int f159321q;

    /* renamed from: r */
    public int f159322r;

    /* renamed from: s */
    public int f159323s;

    /* renamed from: t */
    public LinkedList<C59463a> f159324t;

    /* renamed from: u */
    public Integer f159325u;

    /* renamed from: v */
    public C59464c f159326v;

    /* renamed from: w */
    public final C60870a f159327w;

    /* renamed from: x */
    public boolean f159328x;

    /* renamed from: y */
    public final C13601g f159329y;

    /* renamed from: z */
    public FinderLiveMicSelectRecyclerAdapter f159330z;

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget$a */
    public static final class C55911a extends C87413o implements C32226l<FinderLiveMicSelectRecyclerAdapter.C55916c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMicModeSelectWidget f159331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55911a(FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget) {
            super(1);
            this.f159331d = finderLiveMicModeSelectWidget;
        }

        public Object invoke(Object obj) {
            String str;
            String str2;
            FinderLiveMicSelectRecyclerAdapter.C55916c cVar = (FinderLiveMicSelectRecyclerAdapter.C55916c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            if (cVar instanceof FinderLiveMicSelectRecyclerAdapter.C55917d) {
                FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget = this.f159331d;
                C61741k kVar = finderLiveMicModeSelectWidget.f159318n;
                if (kVar == null) {
                    C87412m.m108603p("uiBinding");
                    throw null;
                } else if (kVar.f175470c.f220433y) {
                    String str3 = finderLiveMicModeSelectWidget.f159320p;
                    FinderLiveMicSelectRecyclerAdapter.C55917d dVar = (FinderLiveMicSelectRecyclerAdapter.C55917d) cVar;
                    C54130j jVar = dVar.f159341a;
                    String str4 = "";
                    if (jVar == null || (str = jVar.f151997a) == null) {
                        str = str4;
                    }
                    finderLiveMicModeSelectWidget.mo77586v(!C87412m.m108589b(str3, str));
                    FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget2 = this.f159331d;
                    C54130j jVar2 = dVar.f159341a;
                    if (!(jVar2 == null || (str2 = jVar2.f151997a) == null)) {
                        str4 = str2;
                    }
                    finderLiveMicModeSelectWidget2.f159320p = str4;
                    C60870a aVar = finderLiveMicModeSelectWidget2.f159327w;
                    LinkedList<C59463a> linkedList = aVar.f173427g;
                    if (linkedList != null) {
                        aVar.mo85775b(finderLiveMicModeSelectWidget2.f159323s == 1 ? 4 : 2, linkedList, str4);
                    }
                    ArrayList<FinderLiveMicSelectRecyclerAdapter.C55914a> w = this.f159331d.mo77587w();
                    FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget3 = this.f159331d;
                    for (FinderLiveMicSelectRecyclerAdapter.C55914a aVar2 : w) {
                        C54130j jVar3 = aVar2.f159335d;
                        aVar2.f159336e = C87412m.m108589b(jVar3 != null ? jVar3.f151997a : null, finderLiveMicModeSelectWidget3.f159320p);
                    }
                    FinderLiveMicSelectRecyclerAdapter finderLiveMicSelectRecyclerAdapter = this.f159331d.f159330z;
                    if (finderLiveMicSelectRecyclerAdapter != null) {
                        finderLiveMicSelectRecyclerAdapter.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("focusSelectAdapter");
                        throw null;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget$b */
    public static final class C55912b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveMicModeSelectWidget f159332a;

        public C55912b(FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget) {
            this.f159332a = finderLiveMicModeSelectWidget;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onStatusChange(boolean r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = 1
                if (r6 != 0) goto L_0x003d
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6.mo77589y(r2)
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                r6.mo77585u()
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                int r2 = r6.f159323s
                if (r2 != r1) goto L_0x001e
                r6.mo77582r()
                r2 = 3
                goto L_0x0022
            L_0x001e:
                r6.mo77584t()
                r2 = 1
            L_0x0022:
                r6.f159322r = r2
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                qj1.w1 r2 = r6.f159315h
                fj1.b r2 = r2.mo87684A0()
                r6.mo77578A(r2)
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                int r2 = r6.f159322r
                int r3 = r6.f159321q
                if (r2 == r3) goto L_0x0038
                r0 = 1
            L_0x0038:
                r6.mo77586v(r0)
                goto L_0x00c2
            L_0x003d:
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                int r2 = r6.f159323s
                r3 = 4
                if (r2 == r1) goto L_0x007b
                qj1.w1 r2 = r6.f159315h
                java.lang.Class<cl1.d0> r4 = cl1.C54963d0.class
                androidx.lifecycle.i0 r2 = r2.mo87696x0(r4)
                cl1.d0 r2 = (cl1.C54963d0) r2
                java.util.List<al1.j> r2 = r2.f154074q
                int r2 = r2.size()
                if (r2 > 0) goto L_0x0067
                android.content.Context r6 = r6.f28306d
                android.content.res.Resources r2 = r6.getResources()
                r4 = 2131828057(0x7f111d59, float:1.9289044E38)
                java.lang.String r2 = r2.getString(r4)
                nj3.C76912y0.m92773l(r6, r2)
                goto L_0x0079
            L_0x0067:
                if (r2 < r3) goto L_0x007b
                android.content.Context r6 = r6.f28306d
                android.content.res.Resources r2 = r6.getResources()
                r4 = 2131827656(0x7f111bc8, float:1.928823E38)
                java.lang.String r2 = r2.getString(r4)
                nj3.C76912y0.m92773l(r6, r2)
            L_0x0079:
                r6 = 0
                goto L_0x007c
            L_0x007b:
                r6 = 1
            L_0x007c:
                if (r6 != 0) goto L_0x0092
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                nh1.k r6 = r6.f159318n
                if (r6 == 0) goto L_0x008a
                com.tencent.mm.ui.widget.MMSwitchBtn r6 = r6.f175470c
                r6.setCheck(r0)
                return
            L_0x008a:
                java.lang.String r6 = "uiBinding"
                gy3.C87412m.m108603p(r6)
                r6 = 0
                throw r6
            L_0x0092:
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                int r2 = r6.f159323s
                r4 = 2
                if (r2 != r1) goto L_0x00a1
                java.util.LinkedList r2 = r6.mo77581q()
                r6.mo77579B(r3, r2)
                goto L_0x00a9
            L_0x00a1:
                java.util.LinkedList r2 = r6.mo77583s()
                r6.mo77579B(r4, r2)
                r3 = 2
            L_0x00a9:
                r6.f159322r = r3
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                qj1.w1 r2 = r6.f159315h
                fj1.b r2 = r2.mo87684A0()
                r6.mo77578A(r2)
                com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget r6 = r5.f159332a
                int r2 = r6.f159322r
                int r3 = r6.f159321q
                if (r2 == r3) goto L_0x00bf
                r0 = 1
            L_0x00bf:
                r6.mo77586v(r0)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget.C55912b.onStatusChange(boolean):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget$c */
    public static final class C55913c extends C87413o implements C32224a<ArrayList<FinderLiveMicSelectRecyclerAdapter.C55914a>> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMicModeSelectWidget f159333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55913c(FinderLiveMicModeSelectWidget finderLiveMicModeSelectWidget) {
            super(0);
            this.f159333d = finderLiveMicModeSelectWidget;
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new FinderLiveMicSelectRecyclerAdapter.C55914a(new C54130j(this.f159333d.f159319o, (String) null, (String) null, (String) null, 0, (String) null, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, 0, (C49765hx0) null, false, (Boolean) null, (C64756up2) null, 0, 0, 8388544, (C8480h) null), false, false, false, 12, (C8480h) null));
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMicModeSelectWidget(Context context, C63068w1 w1Var, LivePreviewView livePreviewView, C32226l<? super Boolean, C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w1Var, "plugin");
        C87412m.m108594g(livePreviewView, "preview");
        C87412m.m108594g(lVar, "dismiss");
        C87412m.m108594g(qVar, "selectBlock");
        this.f159315h = w1Var;
        this.f159316i = lVar;
        this.f159317j = qVar;
        String str = ((C55001u) w1Var.mo87696x0(C55001u.class)).f154419p.f182319n;
        str = str == null ? "" : str;
        this.f159319o = str;
        this.f159320p = str;
        this.f159321q = 1;
        this.f159322r = 1;
        this.f159329y = C36568h.m40985a(new C55913c(this));
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            kVar.f175474g.setOnClickListener(this);
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175471d.setOnClickListener(this);
                C61741k kVar3 = this.f159318n;
                if (kVar3 != null) {
                    RatioLayout ratioLayout = kVar3.f175469b;
                    C87412m.m108593f(ratioLayout, "uiBinding.finderLiveMicRatioLayout");
                    this.f159327w = new C60870a(context, w1Var, livePreviewView, ratioLayout);
                    this.f159330z = new FinderLiveMicSelectRecyclerAdapter(mo77587w(), str, new C55911a(this));
                    C61741k kVar4 = this.f159318n;
                    if (kVar4 != null) {
                        kVar4.f175468a.setLayoutManager(new LinearLayoutManager(context) {
                            public boolean canScrollVertically() {
                                return false;
                            }
                        });
                        C61741k kVar5 = this.f159318n;
                        if (kVar5 != null) {
                            RecyclerView recyclerView = kVar5.f175468a;
                            FinderLiveMicSelectRecyclerAdapter finderLiveMicSelectRecyclerAdapter = this.f159330z;
                            if (finderLiveMicSelectRecyclerAdapter != null) {
                                recyclerView.setAdapter(finderLiveMicSelectRecyclerAdapter);
                                C61741k kVar6 = this.f159318n;
                                if (kVar6 != null) {
                                    kVar6.f175470c.setSwitchListener(new C55912b(this));
                                } else {
                                    C87412m.m108603p("uiBinding");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("focusSelectAdapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("uiBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("uiBinding");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("uiBinding");
                throw null;
            }
        } else {
            C87412m.m108603p("uiBinding");
            throw null;
        }
    }

    /* renamed from: A */
    public final void mo77578A(C45795b bVar) {
        ArrayList arrayList;
        C87412m.m108594g(bVar, "buContext");
        int i = this.f159322r;
        if (i == 4 || i == 2) {
            List<C54130j> list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154071n;
            C87412m.m108593f(list, "buContext.business(LiveL…ass.java).linkMicUserList");
            synchronized (list) {
                arrayList = new ArrayList();
                for (T next : list) {
                    if (!((C54130j) next).f152004h) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                int i2 = ((C54130j) next2).f152008l;
                if (i2 == 3 || i2 == 4) {
                    arrayList2.add(next2);
                }
            }
            mo77589y(arrayList2);
            mo77585u();
        }
    }

    /* renamed from: B */
    public final void mo77579B(int i, LinkedList<C59463a> linkedList) {
        if (this.f159324t == null) {
            this.f159324t = linkedList;
        }
        if (this.f159325u == null) {
            this.f159325u = Integer.valueOf(i);
        }
    }

    /* renamed from: b */
    public View mo9448b() {
        return mo9767f();
    }

    /* renamed from: c */
    public View mo9764c() {
        return mo9766e();
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f7179ol;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.f8115l1);
        C87412m.m108593f(string, "context.resources.getStr…ive_mic_mode_select_tips)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        View view2 = view;
        C87412m.m108594g(view2, "rootView");
        int i = C0966R.C0970id.n96;
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) C10462b.m10395a(view2, C0966R.C0970id.n96);
        if (roundCornerRelativeLayout != null) {
            i = C0966R.C0970id.okv;
            RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(view2, C0966R.C0970id.okv);
            if (recyclerView != null) {
                i = C0966R.C0970id.n9c;
                RatioLayout ratioLayout = (RatioLayout) C10462b.m10395a(view2, C0966R.C0970id.n9c);
                if (ratioLayout != null) {
                    i = C0966R.C0970id.oll;
                    MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) C10462b.m10395a(view2, C0966R.C0970id.oll);
                    if (mMSwitchBtn != null) {
                        i = C0966R.C0970id.omr;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(view2, C0966R.C0970id.omr);
                        if (constraintLayout != null) {
                            i = C0966R.C0970id.oms;
                            WeImageView weImageView = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.oms);
                            if (weImageView != null) {
                                i = C0966R.C0970id.omt;
                                TextView textView = (TextView) C10462b.m10395a(view2, C0966R.C0970id.omt);
                                if (textView != null) {
                                    i = C0966R.C0970id.omu;
                                    TextView textView2 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.omu);
                                    if (textView2 != null) {
                                        i = C0966R.C0970id.on7;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C10462b.m10395a(view2, C0966R.C0970id.on7);
                                        if (constraintLayout2 != null) {
                                            i = C0966R.C0970id.on8;
                                            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(view2, C0966R.C0970id.on8);
                                            if (weImageView2 != null) {
                                                i = C0966R.C0970id.on9;
                                                TextView textView3 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.on9);
                                                if (textView3 != null) {
                                                    i = C0966R.C0970id.on_;
                                                    TextView textView4 = (TextView) C10462b.m10395a(view2, C0966R.C0970id.on_);
                                                    if (textView4 != null) {
                                                        i = C0966R.C0970id.onr;
                                                        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view2, C0966R.C0970id.onr);
                                                        if (linearLayout != null) {
                                                            i = C0966R.C0970id.oii;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) C10462b.m10395a(view2, C0966R.C0970id.oii);
                                                            if (nestedScrollView != null) {
                                                                this.f159318n = new C61741k((ConstraintLayout) view2, roundCornerRelativeLayout, recyclerView, ratioLayout, mMSwitchBtn, constraintLayout, weImageView, textView, textView2, constraintLayout2, weImageView2, textView3, textView4, linearLayout, nestedScrollView);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: m */
    public void mo3429m() {
        this.f159324t = null;
        this.f159325u = null;
        C60870a aVar = this.f159327w;
        if (aVar != null) {
            int childCount = aVar.f173423c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = aVar.f173423c.getChildAt(i);
                if (childAt != null && (childAt instanceof C61100d)) {
                    C61100d dVar = (C61100d) childAt;
                    C54130j jVar = dVar.f173973h;
                    if (jVar != null) {
                        dVar.mo86032b("onPanelDismiss userId: " + jVar.f151997a);
                        if (dVar.f173972g.f175530i.getVisibility() == 0 && dVar.f173974i != null) {
                            if (C87412m.m108589b(jVar.f151997a, ((C55001u) dVar.f173970e.mo87696x0(C55001u.class)).f154419p.f182319n)) {
                                TextureView cameraView = dVar.f173971f.getCameraView();
                                if (cameraView != null) {
                                    C61748r rVar = dVar.f173972g;
                                    rVar.f175531j.removeView(rVar.f175530i);
                                    C61748r rVar2 = dVar.f173972g;
                                    rVar2.f175531j.addView(rVar2.f175530i);
                                    SurfaceTexture surfaceTexture = dVar.f173974i;
                                    if (surfaceTexture != null) {
                                        cameraView.setSurfaceTexture(surfaceTexture);
                                        ViewParent parent = cameraView.getParent();
                                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                        if (viewGroup != null) {
                                            viewGroup.removeView(cameraView);
                                            viewGroup.addView(cameraView);
                                        }
                                    }
                                    cameraView.setSurfaceTextureListener(dVar.f173975j);
                                }
                            } else {
                                LivePreviewView livePreviewView = dVar.f173971f;
                                String str = jVar.f151997a;
                                TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.f157153e;
                                if (str == null) {
                                    str = "";
                                }
                                TXCloudVideoView videoView = tRTCVideoRatioLayout.mo76403d(str, 0).getVideoView();
                                if (videoView != null) {
                                    TextureView videoView2 = videoView.getVideoView();
                                    C61748r rVar3 = dVar.f173972g;
                                    rVar3.f175531j.removeView(rVar3.f175530i);
                                    C61748r rVar4 = dVar.f173972g;
                                    rVar4.f175531j.addView(rVar4.f175530i);
                                    SurfaceTexture surfaceTexture2 = dVar.f173974i;
                                    if (surfaceTexture2 != null) {
                                        dVar.mo86032b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + jVar.f151997a);
                                        videoView2.setSurfaceTexture(surfaceTexture2);
                                        videoView.removeVideoView();
                                        videoView.addVideoView(videoView2);
                                    }
                                    videoView2.setSurfaceTextureListener(dVar.f173975j);
                                    ImageView imageView = dVar.f173976n;
                                    if (imageView != null) {
                                        videoView.removeView(imageView);
                                    }
                                }
                            }
                        }
                    }
                    dVar.f173974i = null;
                    dVar.f173975j = null;
                }
            }
        }
        this.f159316i.invoke(Boolean.valueOf(this.f159328x));
    }

    /* renamed from: o */
    public void mo9768o() {
        if (mo77588x()) {
            mo9763a();
            this.f159328x = true;
            C60870a aVar = this.f159327w;
            LinkedList<C59463a> linkedList = aVar.f173427g;
            if (linkedList != null) {
                C54949c0 c0Var = (C54949c0) aVar.f173422b.mo87696x0(C54949c0.class);
                c0Var.f153996f.clear();
                c0Var.f153996f.addAll(linkedList);
            }
            this.f159317j.invoke(Integer.valueOf(this.f159322r), Integer.valueOf(this.f159327w.f173426f), this.f159320p);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            int id = kVar.f175471d.getId();
            int i = 4;
            boolean z = true;
            if (valueOf == null || valueOf.intValue() != id) {
                if (this.f159323s != 0) {
                    C61741k kVar2 = this.f159318n;
                    if (kVar2 != null) {
                        kVar2.f175470c.setCheck(false);
                    } else {
                        C87412m.m108603p("uiBinding");
                        throw null;
                    }
                }
                this.f159323s = 0;
                C61741k kVar3 = this.f159318n;
                if (kVar3 == null) {
                    C87412m.m108603p("uiBinding");
                    throw null;
                } else if (kVar3.f175470c.f220433y) {
                    mo77583s();
                    i = 2;
                } else {
                    mo77584t();
                    i = 1;
                }
            } else if (!mo77588x()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                if (this.f159323s != 1) {
                    C61741k kVar4 = this.f159318n;
                    if (kVar4 != null) {
                        kVar4.f175470c.setCheck(false);
                    } else {
                        C87412m.m108603p("uiBinding");
                        throw null;
                    }
                }
                this.f159323s = 1;
                C61741k kVar5 = this.f159318n;
                if (kVar5 == null) {
                    C87412m.m108603p("uiBinding");
                    throw null;
                } else if (kVar5.f175470c.f220433y) {
                    mo77579B(4, mo77581q());
                } else {
                    mo77582r();
                    i = 3;
                }
            }
            this.f159322r = i;
            mo77578A(this.f159315h.mo87684A0());
            if (this.f159322r == this.f159321q) {
                z = false;
            }
            mo77586v(z);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicModeSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: q */
    public final LinkedList<C59463a> mo77581q() {
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            kVar.f175475h.setVisibility(8);
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175472e.setVisibility(0);
                mo77585u();
                C59464c cVar = this.f159326v;
                if (cVar == null) {
                    return null;
                }
                C60870a aVar = this.f159327w;
                LinkedList<C59463a> linkedList = cVar.f169896a;
                return aVar.mo85775b(4, linkedList, linkedList.get(0).mo84561a());
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: r */
    public final void mo77582r() {
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            kVar.f175475h.setVisibility(8);
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175472e.setVisibility(0);
                C61741k kVar3 = this.f159318n;
                if (kVar3 != null) {
                    kVar3.f175468a.setVisibility(8);
                    this.f159320p = this.f159319o;
                    C59464c cVar = this.f159326v;
                    if (cVar != null) {
                        C60870a aVar = this.f159327w;
                        LinkedList<C59463a> linkedList = cVar.f169896a;
                        int i = C60870a.f173420i;
                        aVar.mo85775b(3, linkedList, "");
                        return;
                    }
                    return;
                }
                C87412m.m108603p("uiBinding");
                throw null;
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: s */
    public final LinkedList<C59463a> mo77583s() {
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            kVar.f175475h.setVisibility(0);
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175472e.setVisibility(8);
                mo77585u();
                C59464c cVar = this.f159326v;
                if (cVar == null) {
                    return null;
                }
                C60870a aVar = this.f159327w;
                LinkedList<C59463a> linkedList = cVar.f169896a;
                return aVar.mo85775b(2, linkedList, linkedList.get(0).mo84561a());
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: t */
    public final void mo77584t() {
        C61741k kVar = this.f159318n;
        if (kVar != null) {
            kVar.f175475h.setVisibility(0);
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175472e.setVisibility(8);
                C61741k kVar3 = this.f159318n;
                if (kVar3 != null) {
                    kVar3.f175468a.setVisibility(8);
                    this.f159320p = this.f159319o;
                    C59464c cVar = this.f159326v;
                    if (cVar != null) {
                        C60870a aVar = this.f159327w;
                        LinkedList<C59463a> linkedList = cVar.f169896a;
                        int i = C60870a.f173420i;
                        aVar.mo85775b(1, linkedList, "");
                        return;
                    }
                    return;
                }
                C87412m.m108603p("uiBinding");
                throw null;
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* renamed from: u */
    public final void mo77585u() {
        if (mo77587w().size() > 1) {
            C61741k kVar = this.f159318n;
            if (kVar != null) {
                kVar.f175468a.setVisibility(0);
            } else {
                C87412m.m108603p("uiBinding");
                throw null;
            }
        } else {
            C61741k kVar2 = this.f159318n;
            if (kVar2 != null) {
                kVar2.f175468a.setVisibility(8);
            } else {
                C87412m.m108603p("uiBinding");
                throw null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77586v(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0025
            android.view.View r3 = r2.f28308f
            boolean r1 = r3 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x000c
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x000c:
            if (r0 == 0) goto L_0x0046
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r1 = 2131099654(0x7f060006, float:1.7811667E38)
            int r3 = r3.getColor(r1)
            r0.setTextColor(r3)
            r3 = 1
            r0.setEnabled(r3)
            goto L_0x0046
        L_0x0025:
            android.view.View r3 = r2.f28308f
            boolean r1 = r3 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x002e
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x002e:
            if (r0 == 0) goto L_0x0046
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r1 = 2131099665(0x7f060011, float:1.781169E38)
            int r3 = r3.getColor(r1)
            r0.setTextColor(r3)
            r3 = 0
            r0.setEnabled(r3)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.mic.panel.FinderLiveMicModeSelectWidget.mo77586v(boolean):void");
    }

    /* renamed from: w */
    public final ArrayList<FinderLiveMicSelectRecyclerAdapter.C55914a> mo77587w() {
        return (ArrayList) this.f159329y.getValue();
    }

    /* renamed from: x */
    public final boolean mo77588x() {
        if (!((C54949c0) this.f159315h.mo87696x0(C54949c0.class)).mo75865f3()) {
            return true;
        }
        Context context = this.f28306d;
        C76912y0.m92773l(context, context.getResources().getString(C0966R.string.f8079eb));
        return false;
    }

    /* renamed from: y */
    public final void mo77589y(ArrayList<C54130j> arrayList) {
        mo77587w().clear();
        ArrayList<FinderLiveMicSelectRecyclerAdapter.C55914a> w = mo77587w();
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C54130j jVar : arrayList) {
            arrayList2.add(new FinderLiveMicSelectRecyclerAdapter.C55914a(jVar, C87412m.m108589b(jVar.f151997a, this.f159320p), false, false, 12, (C8480h) null));
        }
        w.addAll(arrayList2);
        ArrayList<FinderLiveMicSelectRecyclerAdapter.C55914a> w2 = mo77587w();
        String str = this.f159319o;
        w2.add(0, new FinderLiveMicSelectRecyclerAdapter.C55914a(new C54130j(str, (String) null, (String) null, (String) null, 0, (String) null, (C89349b) null, false, 0, (FinderAuthInfo) null, (String) null, 0, 0, false, (String) null, false, 0, (C49765hx0) null, false, (Boolean) null, (C64756up2) null, 0, 0, 8388544, (C8480h) null), C87412m.m108589b(str, this.f159320p), false, false, 12, (C8480h) null));
        FinderLiveMicSelectRecyclerAdapter finderLiveMicSelectRecyclerAdapter = this.f159330z;
        if (finderLiveMicSelectRecyclerAdapter != null) {
            finderLiveMicSelectRecyclerAdapter.notifyDataSetChanged();
        } else {
            C87412m.m108603p("focusSelectAdapter");
            throw null;
        }
    }

    /* renamed from: z */
    public final void mo77590z(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        C60870a aVar = this.f159327w;
        if (aVar != null && C60870a.C60871a.f173429a[bVar.ordinal()] == 1) {
            boolean z = false;
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            }
            aVar.f173424d.f173436h = z;
            Log.m105924i("FinderLiveMicNewPreviewLayoutManager", "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z);
        }
    }
}
