package com.tencent.p014mm.plugin.finder.live.multistream;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.LinkedList;
import mj1.C61485a;
import mj1.C61487b;
import mj1.C61491e;
import nj1.C61755b;
import oj1.C62034b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64890zp2;

/* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget */
public final class FinderLiveMultiStreamWidget {

    /* renamed from: a */
    public final C61755b f159428a;

    /* renamed from: b */
    public final MultiStreamRecyclerView f159429b;

    /* renamed from: c */
    public final LinkedList<C62034b> f159430c;

    /* renamed from: d */
    public final C61485a f159431d;

    /* renamed from: e */
    public final FinderLiveMultiStreamWidget$liveLayoutManager$1 f159432e;

    /* renamed from: f */
    public int f159433f = -1;

    /* renamed from: g */
    public boolean f159434g;

    /* renamed from: h */
    public int f159435h = -1;

    /* renamed from: i */
    public int f159436i = -1;

    /* renamed from: j */
    public boolean f159437j;

    /* renamed from: k */
    public boolean f159438k;

    /* renamed from: l */
    public String f159439l = "";

    /* renamed from: m */
    public int f159440m;

    /* renamed from: n */
    public boolean f159441n = true;

    /* renamed from: o */
    public boolean f159442o;

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$a */
    public static final class C55935a extends C87413o implements C32228q<Integer, View, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamWidget f159443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55935a(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget) {
            super(3);
            this.f159443d = finderLiveMultiStreamWidget;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            ((Boolean) obj3).booleanValue();
            C87412m.m108594g((View) obj2, "child");
            FinderLiveMultiStreamWidget finderLiveMultiStreamWidget = this.f159443d;
            int c = finderLiveMultiStreamWidget.mo77673c(intValue);
            Log.m105924i("MultiStreamWidget", "selectItemView onItemSelected pos:" + c + " currentPostion: " + finderLiveMultiStreamWidget.f159440m + " isAutoSelect: " + finderLiveMultiStreamWidget.f159441n + " data: " + finderLiveMultiStreamWidget.f159431d.mo86464F4(c) + " isFromNotifySelected: " + finderLiveMultiStreamWidget.f159442o);
            C62034b F4 = finderLiveMultiStreamWidget.f159431d.mo86464F4(c);
            if (F4 != null) {
                View findViewByPosition = finderLiveMultiStreamWidget.f159432e.findViewByPosition(intValue);
                FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = findViewByPosition instanceof FinderLiveMultiStreamViewLayout ? (FinderLiveMultiStreamViewLayout) findViewByPosition : null;
                if (finderLiveMultiStreamViewLayout != null) {
                    if (finderLiveMultiStreamWidget.f159441n) {
                        finderLiveMultiStreamViewLayout.mo77665a(finderLiveMultiStreamWidget.f159428a.mo86660o(), finderLiveMultiStreamWidget.f159428a.mo86658j(), F4);
                    } else {
                        finderLiveMultiStreamViewLayout.mo77667c(F4);
                        int i = finderLiveMultiStreamWidget.f159440m;
                        if (i != c && i < finderLiveMultiStreamWidget.f159430c.size() && c < finderLiveMultiStreamWidget.f159430c.size() && !finderLiveMultiStreamWidget.f159442o) {
                            C61491e.f174819a.mo86466a(6, finderLiveMultiStreamWidget.f159430c.get(c).f176355b.f182132e, finderLiveMultiStreamWidget.f159430c.get(finderLiveMultiStreamWidget.f159440m).f176355b.f182132e);
                        }
                        finderLiveMultiStreamWidget.f159442o = false;
                    }
                    LiveVideoView playerView = finderLiveMultiStreamViewLayout.getPlayerView();
                    if (playerView != null) {
                        finderLiveMultiStreamWidget.f159428a.getEvent().mo86649G(c, F4, finderLiveMultiStreamViewLayout.getPlayer(), playerView, finderLiveMultiStreamWidget.f159441n);
                    }
                    finderLiveMultiStreamWidget.f159441n = false;
                }
            }
            finderLiveMultiStreamWidget.f159440m = c;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$b */
    public static final class C55936b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamWidget f159444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55936b(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget) {
            super(0);
            this.f159444d = finderLiveMultiStreamWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x003b, code lost:
            r0 = r0.f176355b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r0 = r5.f159444d
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 r0 = r0.f159432e
                int r0 = r0.mo16957C()
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r1 = r5.f159444d
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 r1 = r1.f159432e
                int r1 = r1.mo16959E()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "firstVisiblePos:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = " lastVisiblePos:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MultiStreamWidget"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r2 = 0
                if (r0 != r1) goto L_0x007f
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r1 = r5.f159444d
                mj1.a r1 = r1.f159431d
                oj1.b r0 = r1.mo86464F4(r0)
                if (r0 == 0) goto L_0x0042
                te3.aq2 r0 = r0.f176355b
                if (r0 == 0) goto L_0x0042
                java.lang.String r0 = r0.f182132e
                goto L_0x0043
            L_0x0042:
                r0 = 0
            L_0x0043:
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x0048
                r0 = r1
            L_0x0048:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onItemChecked curLiveId:"
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = " selectedLiveId:"
                r3.append(r4)
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r4 = r5.f159444d
                java.lang.String r4 = r4.f159439l
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Finder.FinderLiveViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                boolean r1 = gy3.C87412m.m108589b(r0, r1)
                if (r1 != 0) goto L_0x007f
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r1 = r5.f159444d
                java.lang.String r1 = r1.f159439l
                boolean r1 = gy3.C87412m.m108589b(r0, r1)
                if (r1 != 0) goto L_0x007f
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r1 = r5.f159444d
                r1.f159439l = r0
                r2 = 1
            L_0x007f:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget.C55936b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$c */
    public static final class C55937c implements FinderRecyclerView.C55692a {

        /* renamed from: a */
        public boolean f159445a = true;

        /* renamed from: b */
        public boolean f159446b;

        /* renamed from: c */
        public float f159447c;

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamWidget f159448d;

        public C55937c(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget) {
            this.f159448d = finderLiveMultiStreamWidget;
        }

        /* renamed from: e */
        public void mo77206e(RecyclerView recyclerView, int i) {
            FinderLiveMultiStreamWidget finderLiveMultiStreamWidget;
            int i2;
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0) {
                this.f159445a = true;
                FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = this.f159448d.f159432e;
                int i3 = -1;
                int C = finderLiveMultiStreamWidget$liveLayoutManager$1 != null ? finderLiveMultiStreamWidget$liveLayoutManager$1.mo16957C() : -1;
                FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$12 = this.f159448d.f159432e;
                if (finderLiveMultiStreamWidget$liveLayoutManager$12 != null) {
                    i3 = finderLiveMultiStreamWidget$liveLayoutManager$12.mo16959E();
                }
                if (this.f159448d.f159434g) {
                    Log.m105924i("MultiStreamWidget", "firstVisiblePos:" + C + " lastVisiblePos:" + i3 + " lastPlayPos: " + this.f159448d.f159433f);
                    if (C == i3 && C != (i2 = finderLiveMultiStreamWidget.f159433f)) {
                        FinderLiveMultiStreamWidget.m63834b((finderLiveMultiStreamWidget = this.f159448d), i2);
                    }
                }
            } else if (i == 1) {
                this.f159448d.f159437j = true;
            }
        }

        /* renamed from: f */
        public void mo77207f(RecyclerView recyclerView, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            Log.m105924i("MultiStreamWidget", "selectItemView onPageSelected position:" + i);
            FinderLiveMultiStreamWidget finderLiveMultiStreamWidget = this.f159448d;
            finderLiveMultiStreamWidget.f159434g = false;
            finderLiveMultiStreamWidget.getClass();
        }

        /* renamed from: g */
        public void mo77208g(RecyclerView recyclerView, int i, float f, int i2) {
            Boolean bool;
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i2 != 0) {
                boolean z = false;
                if (this.f159445a || Math.abs(this.f159447c - f) > 0.5f) {
                    this.f159446b = f > 0.5f;
                    this.f159445a = false;
                }
                this.f159447c = f;
                FinderLiveMultiStreamWidget finderLiveMultiStreamWidget = this.f159448d;
                boolean z2 = this.f159446b;
                if (z2) {
                    f = ((float) 1) - f;
                }
                int size = finderLiveMultiStreamWidget.f159440m + (finderLiveMultiStreamWidget.f159430c.size() * 1000);
                int c = finderLiveMultiStreamWidget.mo77673c(z2 ? size - 1 : size + 1);
                Float valueOf = Float.valueOf(f * 2.0f);
                Boolean bool2 = null;
                if (!(valueOf.floatValue() <= 1.0f)) {
                    valueOf = null;
                }
                float floatValue = 1.0f - (valueOf != null ? valueOf.floatValue() : 1.0f);
                finderLiveMultiStreamWidget.f159428a.getEvent().mo86652i(floatValue);
                C62034b F4 = finderLiveMultiStreamWidget.f159431d.mo86464F4(finderLiveMultiStreamWidget.mo77673c(size));
                if (F4 != null) {
                    C64890zp2 zp22 = F4.f176355b.f182131d;
                    bool = Boolean.valueOf(zp22 != null && zp22.f186801V >= zp22.f186802W);
                } else {
                    bool = null;
                }
                C62034b F42 = finderLiveMultiStreamWidget.f159431d.mo86464F4(c);
                if (F42 != null) {
                    C64890zp2 zp23 = F42.f176355b.f182131d;
                    if (zp23 != null && zp23.f186801V >= zp23.f186802W) {
                        z = true;
                    }
                    bool2 = Boolean.valueOf(z);
                }
                if (!C87412m.m108589b(bool, bool2)) {
                    finderLiveMultiStreamWidget.f159428a.getEvent().mo86651c(floatValue);
                }
            }
            FinderLiveMultiStreamWidget finderLiveMultiStreamWidget2 = this.f159448d;
            FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = finderLiveMultiStreamWidget2.f159432e;
            int C = finderLiveMultiStreamWidget$liveLayoutManager$1.mo16957C();
            int E = finderLiveMultiStreamWidget$liveLayoutManager$1.mo16959E();
            if (C != E && finderLiveMultiStreamWidget2.f159437j) {
                int i3 = finderLiveMultiStreamWidget2.f159435h;
                if (C < i3) {
                    int i4 = finderLiveMultiStreamWidget2.f159436i;
                    if (E < i4) {
                        FinderLiveMultiStreamWidget.m63834b(finderLiveMultiStreamWidget2, i4);
                    }
                    finderLiveMultiStreamWidget2.f159433f = C;
                    FinderLiveMultiStreamWidget.m63833a(finderLiveMultiStreamWidget2, C);
                } else if (E > finderLiveMultiStreamWidget2.f159436i) {
                    if (C > i3) {
                        FinderLiveMultiStreamWidget.m63834b(finderLiveMultiStreamWidget2, i3);
                    }
                    finderLiveMultiStreamWidget2.f159433f = E;
                    FinderLiveMultiStreamWidget.m63833a(finderLiveMultiStreamWidget2, E);
                }
            }
            finderLiveMultiStreamWidget2.f159435h = C;
            finderLiveMultiStreamWidget2.f159436i = E;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$d */
    public static final class C55938d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMultiStreamWidget f159449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55938d(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget) {
            super(0);
            this.f159449d = finderLiveMultiStreamWidget;
        }

        public Object invoke() {
            this.f159449d.f159428a.getEvent().mo86648B(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$e */
    public static final class C55939e extends C87413o implements C32224a<C56437x0> {

        /* renamed from: d */
        public static final C55939e f159450d = new C55939e();

        public C55939e() {
            super(0);
        }

        public Object invoke() {
            C56437x0 x0Var = new C56437x0();
            x0Var.f161311m = false;
            return x0Var;
        }
    }

    public FinderLiveMultiStreamWidget(ViewGroup viewGroup, C61755b bVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "service");
        this.f159428a = bVar;
        MultiStreamRecyclerView multiStreamRecyclerView = (MultiStreamRecyclerView) viewGroup.findViewById(C0966R.C0970id.mt_);
        this.f159429b = multiStreamRecyclerView;
        LinkedList<C62034b> linkedList = new LinkedList<>();
        this.f159430c = linkedList;
        C61485a aVar = new C61485a(linkedList, bVar);
        this.f159431d = aVar;
        FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = new FinderLiveMultiStreamWidget$liveLayoutManager$1(this, viewGroup.getContext());
        this.f159432e = finderLiveMultiStreamWidget$liveLayoutManager$1;
        C13601g a = C36568h.m40985a(C55939e.f159450d);
        multiStreamRecyclerView.setLayoutManager(finderLiveMultiStreamWidget$liveLayoutManager$1);
        finderLiveMultiStreamWidget$liveLayoutManager$1.f159781z = new C55935a(this);
        finderLiveMultiStreamWidget$liveLayoutManager$1.f159773A = new C55936b(this);
        ((C56437x0) a.getValue()).mo75025b(multiStreamRecyclerView);
        multiStreamRecyclerView.setHasFixedSize(true);
        C87412m.m108593f(multiStreamRecyclerView, "multiRecyclerView");
        FinderRecyclerView.m63293z1(multiStreamRecyclerView, finderLiveMultiStreamWidget$liveLayoutManager$1, (String) null, 2, (Object) null);
        multiStreamRecyclerView.setPageChangeListener(new C55937c(this));
        multiStreamRecyclerView.setRecyclerClick(new C55938d(this));
        multiStreamRecyclerView.setAdapter(aVar);
    }

    /* renamed from: a */
    public static final void m63833a(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget, int i) {
        int c = finderLiveMultiStreamWidget.mo77673c(i);
        View findViewByPosition = finderLiveMultiStreamWidget.f159432e.findViewByPosition(i);
        if (findViewByPosition != null) {
            FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = findViewByPosition instanceof FinderLiveMultiStreamViewLayout ? (FinderLiveMultiStreamViewLayout) findViewByPosition : null;
            if (finderLiveMultiStreamViewLayout != null) {
                Log.m105924i("MultiStreamViewLayout", "startPreload " + finderLiveMultiStreamViewLayout.f159424f + " lastPlayer: " + finderLiveMultiStreamViewLayout.f159426h);
                finderLiveMultiStreamViewLayout.mo77668d(true);
                C58924d dVar = finderLiveMultiStreamViewLayout.f159426h;
                if (dVar != null) {
                    dVar.stopPlay(true);
                }
                finderLiveMultiStreamViewLayout.mo77669e();
                C58924d dVar2 = finderLiveMultiStreamViewLayout.f159426h;
                if (dVar2 != null) {
                    dVar2.setMute(true);
                }
            }
            finderLiveMultiStreamWidget.f159434g = true;
            Log.m105924i("MultiStreamWidget", "pre startPlay pos = " + c);
        }
    }

    /* renamed from: b */
    public static final void m63834b(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget, int i) {
        int c = finderLiveMultiStreamWidget.mo77673c(i);
        C62034b F4 = finderLiveMultiStreamWidget.f159431d.mo86464F4(c);
        if (F4 != null) {
            Log.m105924i("MultiStreamWidget", "pre stopPlay pos = " + c + " position: " + i);
            HashMap<String, C58924d> hashMap = C61487b.f174813a;
            StringBuilder sb = new StringBuilder();
            sb.append("stopPlayer: ");
            sb.append(F4);
            Log.m105924i("MultiStreamPlayerManager", sb.toString());
            C58924d dVar = C61487b.f174813a.get(F4.mo86978a());
            if (dVar != null) {
                dVar.stopPlay(false);
            }
        }
    }

    /* renamed from: c */
    public final int mo77673c(int i) {
        int size = this.f159430c.size();
        if (size == 0) {
            return i;
        }
        int i2 = i % size;
        if (i2 >= size) {
            return size - 1;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }
}
