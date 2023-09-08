package p171il;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.panel.EmojiPanelRecyclerView;
import com.tencent.p014mm.emoji.panel.SmileyPanelView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.view.EmojiPanelSlideIndicatorView;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import p171il.C98734m;
import p813fl.C45802t0;
import p813fl.C97906h;
import p813fl.C97907h0;
import p813fl.C97924p0;
import p813fl.C97943y0;
import rx3.C13598b0;
import zp3.C103055g;

/* renamed from: il.l */
public final class C98727l extends RecyclerView.C16613e<C98728a> {

    /* renamed from: d */
    public final C97906h f289495d;

    /* renamed from: e */
    public final C45802t0 f289496e;

    /* renamed from: f */
    public final C60338x f289497f;

    /* renamed from: g */
    public final C60338x f289498g;

    /* renamed from: h */
    public final C103055g f289499h;

    /* renamed from: i */
    public final String f289500i = "MicroMsg.EmojiPanelGroupAdapter";

    /* renamed from: j */
    public final ArrayList<C97924p0<?>> f289501j = new ArrayList<>();

    /* renamed from: n */
    public final RecyclerView.C16623q f289502n;

    /* renamed from: o */
    public C98744t f289503o;

    /* renamed from: p */
    public ChatFooterPanel.C72719a f289504p;

    /* renamed from: il.l$a */
    public abstract class C98728a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final GridLayoutManager f289505A;

        /* renamed from: B */
        public final EmojiPanelRecyclerView f289506B;

        /* renamed from: C */
        public final C98734m f289507C;

        /* renamed from: D */
        public final C98734m.C98735a f289508D;

        /* renamed from: E */
        public final EmojiPanelSlideIndicatorView f289509E;

        /* renamed from: F */
        public C97924p0<?> f289510F;

        /* renamed from: G */
        public final C98730b f289511G = new C98730b(this);

        /* renamed from: H */
        public final /* synthetic */ C98727l f289512H;

        /* renamed from: z */
        public final C60338x f289513z;

        /* renamed from: il.l$a$a */
        public static final class C98729a extends C98734m.C98735a {

            /* renamed from: b */
            public final /* synthetic */ C98728a f289514b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98729a(C98728a aVar, C98734m mVar) {
                super(mVar);
                this.f289514b = aVar;
            }

            /* renamed from: c */
            public void mo127712c(C97907h0 h0Var) {
                C87412m.m108594g(h0Var, "data");
                super.mo127712c(h0Var);
                this.f289514b.mo138120y();
            }
        }

        /* renamed from: il.l$a$b */
        public static final class C98730b implements Runnable {

            /* renamed from: d */
            public int f289515d;

            /* renamed from: e */
            public final /* synthetic */ C98728a f289516e;

            /* renamed from: il.l$a$b$a */
            public static final class C98731a extends C54256s {
                public C98731a(Context context) {
                    super(context);
                }

                /* renamed from: o */
                public int mo10341o() {
                    return -1;
                }
            }

            public C98730b(C98728a aVar) {
                this.f289516e = aVar;
            }

            public void run() {
                C98731a aVar = new C98731a(this.f289516e.f289506B.getContext());
                aVar.f44872a = this.f289515d;
                this.f289516e.f289505A.startSmoothScroll(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98728a(C98727l lVar, View view, C60338x xVar, GridLayoutManager gridLayoutManager) {
            super(view);
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(xVar, "sizeResolver");
            C87412m.m108594g(gridLayoutManager, "layoutManager");
            this.f289512H = lVar;
            this.f289513z = xVar;
            this.f289505A = gridLayoutManager;
            View findViewById = view.findViewById(C0966R.C0970id.cgh);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…oji_panel_group_recycler)");
            EmojiPanelRecyclerView emojiPanelRecyclerView = (EmojiPanelRecyclerView) findViewById;
            this.f289506B = emojiPanelRecyclerView;
            C98734m mVar = new C98734m(lVar.f289495d);
            this.f289507C = mVar;
            this.f289508D = new C98729a(this, mVar);
            C98747y yVar = new C98747y(mVar, gridLayoutManager);
            EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView = (EmojiPanelSlideIndicatorView) view.findViewById(C0966R.C0970id.nt4);
            this.f289509E = emojiPanelSlideIndicatorView;
            C76577a.m92151b(view.getContext(), 8);
            emojiPanelRecyclerView.setRecycledViewPool(lVar.f289502n);
            emojiPanelRecyclerView.setHasFixedSize(true);
            emojiPanelRecyclerView.setAdapter(mVar);
            emojiPanelRecyclerView.setSizeResolver(xVar);
            emojiPanelRecyclerView.setPanelLifeCycle(lVar.f289496e);
            emojiPanelRecyclerView.mo17085h0(new C60335n(xVar));
            gridLayoutManager.f44666B = yVar;
            emojiPanelRecyclerView.setLayoutManager(gridLayoutManager);
            emojiPanelRecyclerView.setFocusable(false);
            emojiPanelRecyclerView.setItemAnimator((RecyclerView.C16616j) null);
            mVar.f289521f = lVar.f289503o;
            if (emojiPanelSlideIndicatorView != null) {
                emojiPanelSlideIndicatorView.setController(lVar.f289499h);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
            r2 = (r2 = r2.mo127612b()).mo127617l();
         */
        /* renamed from: B */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo138119B() {
            /*
                r4 = this;
                il.l r0 = r4.f289512H
                java.lang.String r0 = r0.f289500i
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onUnbind: "
                r1.append(r2)
                fl.p0<?> r2 = r4.f289510F
                r3 = 0
                if (r2 == 0) goto L_0x0025
                fl.h0 r2 = r2.mo127612b()
                if (r2 == 0) goto L_0x0025
                fl.p r2 = r2.mo127617l()
                if (r2 == 0) goto L_0x0025
                java.lang.String r2 = r2.mo137249c()
                goto L_0x0026
            L_0x0025:
                r2 = r3
            L_0x0026:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                fl.p0<?> r0 = r4.f289510F
                if (r0 == 0) goto L_0x0037
                r0.mo137254e(r3)
            L_0x0037:
                r4.f289510F = r3
                com.tencent.mm.emoji.panel.EmojiPanelRecyclerView r0 = r4.f289506B
                il.l$a$b r1 = r4.f289511G
                r0.removeCallbacks(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171il.C98727l.C98728a.mo138119B():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
            r0 = r0.f287194e;
         */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo138120y() {
            /*
                r5 = this;
                fl.p0<?> r0 = r5.f289510F
                boolean r1 = r0 instanceof p813fl.C97901e1
                if (r1 != 0) goto L_0x0007
                return
            L_0x0007:
                fl.e1 r0 = (p813fl.C97901e1) r0
                fl.a1 r1 = r0.f287194e
                java.util.LinkedList<fl.q0> r1 = r1.f287179c
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0014
                return
            L_0x0014:
                fl.a1 r0 = r0.f287194e
                int r1 = r0.f287181e
                if (r1 <= 0) goto L_0x004c
                il.l r2 = r5.f289512H
                fl.h r3 = r2.f289495d
                r4 = 0
                r3.f287218o = r4
                r3 = 0
                r0.f287181e = r3
                java.lang.String r0 = r2.f289500i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "checkScrollToPosition: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                com.tencent.mm.emoji.panel.EmojiPanelRecyclerView r0 = r5.f289506B
                il.l$a$b r2 = r5.f289511G
                r0.removeCallbacks(r2)
                il.l$a$b r0 = r5.f289511G
                r0.f289515d = r1
                com.tencent.mm.emoji.panel.EmojiPanelRecyclerView r1 = r5.f289506B
                r2 = 300(0x12c, double:1.48E-321)
                r1.postDelayed(r0, r2)
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171il.C98727l.C98728a.mo138120y():void");
        }

        /* JADX WARNING: type inference failed for: r6v0, types: [fl.p0<?>, fl.p0, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo138121z(p813fl.C97924p0<?> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "groupModel"
                gy3.C87412m.m108594g(r6, r0)
                il.l r0 = r5.f289512H
                java.lang.String r0 = r0.f289500i
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onBind: "
                r1.append(r2)
                fl.h0 r2 = r6.mo127612b()
                fl.p r2 = r2.mo127617l()
                java.lang.String r2 = r2.mo137249c()
                r1.append(r2)
                r2 = 32
                r1.append(r2)
                fl.h0 r3 = r6.mo127612b()
                java.util.List r3 = r3.mo127614a()
                int r3 = r3.size()
                r1.append(r3)
                r1.append(r2)
                il.l r2 = r5.f289512H
                fl.h r2 = r2.f289495d
                boolean r2 = r2.f287216m
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                androidx.recyclerview.widget.GridLayoutManager r0 = r5.f289505A
                il.x r1 = r5.f289513z
                int r1 = r1.f171991c
                r0.mo16940i0(r1)
                il.m r0 = r5.f289507C
                fl.h0 r1 = r6.mo127612b()
                java.util.List r1 = r1.mo127614a()
                r0.mo138125c(r1)
                il.m r0 = r5.f289507C
                r0.notifyDataSetChanged()
                fl.p0<?> r0 = r5.f289510F
                boolean r0 = gy3.C87412m.m108589b(r0, r6)
                if (r0 != 0) goto L_0x0077
                fl.p0<?> r0 = r5.f289510F
                if (r0 == 0) goto L_0x0075
                r1 = 0
                r0.mo137254e(r1)
            L_0x0075:
                r5.f289510F = r6
            L_0x0077:
                fl.p0<?> r0 = r5.f289510F
                if (r0 == 0) goto L_0x0080
                il.m$a r1 = r5.f289508D
                r0.mo137254e(r1)
            L_0x0080:
                com.tencent.mm.emoji.panel.EmojiPanelRecyclerView r0 = r5.f289506B
                r0.getClass()
                boolean r1 = r6 instanceof p813fl.C97943y0
                r2 = 0
                if (r1 == 0) goto L_0x009b
                hq3.h r1 = new hq3.h
                android.content.Context r3 = r0.getContext()
                java.lang.String r4 = "context"
                gy3.C87412m.m108593f(r3, r4)
                r1.<init>(r3)
                r0.f266662N1 = r1
                goto L_0x00b6
            L_0x009b:
                boolean r1 = r6 instanceof p813fl.C97902f
                r3 = 1
                if (r1 == 0) goto L_0x00a2
                r3 = 0
                goto L_0x00b3
            L_0x00a2:
                boolean r1 = r6 instanceof p813fl.C97896d
                if (r1 == 0) goto L_0x00a7
                goto L_0x00b3
            L_0x00a7:
                boolean r1 = r6 instanceof p813fl.C97895c1
                if (r1 == 0) goto L_0x00ac
                goto L_0x00ae
            L_0x00ac:
                boolean r3 = r6 instanceof p813fl.C97901e1
            L_0x00ae:
                if (r3 == 0) goto L_0x00b2
                r3 = 2
                goto L_0x00b3
            L_0x00b2:
                r3 = -1
            L_0x00b3:
                r0.setEmojiPopupType(r3)
            L_0x00b6:
                r5.mo138120y()
                com.tencent.mm.view.EmojiPanelSlideIndicatorView r0 = r5.f289509E
                if (r0 != 0) goto L_0x00be
                goto L_0x00d6
            L_0x00be:
                il.l r1 = r5.f289512H
                zp3.g r1 = r1.f289499h
                boolean r1 = r1.f304059n
                if (r1 == 0) goto L_0x00d1
                fl.h0 r6 = r6.mo127612b()
                boolean r6 = r6.mo127615b()
                if (r6 == 0) goto L_0x00d1
                goto L_0x00d3
            L_0x00d1:
                r2 = 8
            L_0x00d3:
                r0.setVisibility(r2)
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171il.C98727l.C98728a.mo138121z(fl.p0):void");
        }
    }

    /* renamed from: il.l$b */
    public final class C98732b extends C98728a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98732b(C98727l lVar, View view) {
            super(lVar, view, lVar.f289498g, new GridLayoutManager(view.getContext(), lVar.f289498g.f171991c));
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: z */
        public void mo138121z(C97924p0<?> p0Var) {
            C87412m.m108594g(p0Var, "groupModel");
            super.mo138121z(p0Var);
        }
    }

    /* renamed from: il.l$c */
    public final class C98733c extends C98728a {

        /* renamed from: I */
        public final SmileyPanelView f289517I;

        /* renamed from: J */
        public final /* synthetic */ C98727l f289518J;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C98733c(p171il.C98727l r5, android.view.View r6) {
            /*
                r4 = this;
                java.lang.String r0 = "itemView"
                gy3.C87412m.m108594g(r6, r0)
                r4.f289518J = r5
                il.x r0 = r5.f289497f
                com.tencent.mm.emoji.panel.layout.SmileyLayoutManager r1 = new com.tencent.mm.emoji.panel.layout.SmileyLayoutManager
                android.content.Context r2 = r6.getContext()
                java.lang.String r3 = "itemView.context"
                gy3.C87412m.m108593f(r2, r3)
                il.x r3 = r5.f289497f
                int r3 = r3.f171991c
                r1.<init>(r2, r3)
                r4.<init>(r5, r6, r0, r1)
                r0 = 2131301526(0x7f091496, float:1.8221112E38)
                android.view.View r6 = r6.findViewById(r0)
                java.lang.String r0 = "itemView.findViewById(R.…_panel_smiley_panel_view)"
                gy3.C87412m.m108593f(r6, r0)
                com.tencent.mm.emoji.panel.SmileyPanelView r6 = (com.tencent.p014mm.emoji.panel.SmileyPanelView) r6
                r4.f289517I = r6
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel$a r5 = r5.f289504p
                r6.setTextOperationListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171il.C98727l.C98733c.<init>(il.l, android.view.View):void");
        }

        /* renamed from: B */
        public void mo138119B() {
            super.mo138119B();
            SmileyPanelView smileyPanelView = this.f289517I;
            C97906h hVar = smileyPanelView.f266671D;
            if (hVar != null) {
                C32224a<C13598b0> aVar = smileyPanelView.f266668A;
                C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                hVar.f287222s.remove(aVar);
            }
        }

        /* renamed from: z */
        public void mo138121z(C97924p0<?> p0Var) {
            C87412m.m108594g(p0Var, "groupModel");
            super.mo138121z(p0Var);
            SmileyPanelView smileyPanelView = this.f289517I;
            C97906h hVar = this.f289518J.f289495d;
            smileyPanelView.getClass();
            C87412m.m108594g(hVar, "config");
            C97906h hVar2 = smileyPanelView.f266671D;
            if (hVar2 != null) {
                C32224a<C13598b0> aVar = smileyPanelView.f266668A;
                C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                hVar2.f287222s.remove(aVar);
            }
            smileyPanelView.f266671D = hVar;
            C32224a<C13598b0> aVar2 = smileyPanelView.f266668A;
            C87412m.m108594g(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            hVar.f287222s.add(aVar2);
            ((SmileyPanelView.C92661c) smileyPanelView.f266668A).invoke();
        }
    }

    public C98727l(C97906h hVar, C45802t0 t0Var, C60338x xVar, C60338x xVar2, C103055g gVar) {
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(t0Var, "lifeCycle");
        C87412m.m108594g(xVar, "smileyItemSize");
        C87412m.m108594g(xVar2, "emojiItemSize");
        C87412m.m108594g(gVar, "indicatorWrapper");
        this.f289495d = hVar;
        this.f289496e = t0Var;
        this.f289497f = xVar;
        this.f289498g = xVar2;
        this.f289499h = gVar;
        RecyclerView.C16623q qVar = new RecyclerView.C16623q();
        this.f289502n = qVar;
        qVar.mo17336e(0, 50);
        qVar.mo17336e(1, 30);
        qVar.mo17336e(2, 3);
        qVar.mo17336e(3, 1);
        qVar.mo17336e(4, 2);
        qVar.mo17336e(5, 3);
    }

    public int getItemCount() {
        return this.f289501j.size();
    }

    public int getItemViewType(int i) {
        return this.f289501j.get(i) instanceof C97943y0 ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C98728a aVar = (C98728a) zVar;
        C87412m.m108594g(aVar, "holder");
        C97924p0<?> p0Var = this.f289501j.get(i);
        C87412m.m108593f(p0Var, "groupModelList[position]");
        aVar.mo138121z(p0Var);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View inflate = from.inflate(C0966R.C0971layout.a1s, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C98733c(this, inflate);
        }
        View inflate2 = from.inflate(C0966R.C0971layout.a1r, viewGroup, false);
        C87412m.m108593f(inflate2, "itemView");
        return new C98732b(this, inflate2);
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C98728a aVar = (C98728a) zVar;
        C87412m.m108594g(aVar, "holder");
        super.onViewRecycled(aVar);
        aVar.mo138119B();
    }
}
